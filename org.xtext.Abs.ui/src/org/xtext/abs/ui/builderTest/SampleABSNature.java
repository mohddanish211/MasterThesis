package org.xtext.abs.ui.builderTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.rmi.activation.Activator;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.xtext.builder.nature.XtextNature;
import org.xtext.Abs.ui.internal.AbsActivator;
import org.xtext.abs.Constants;
import org.xtext.abs.impl.Compilation_UnitImpl;
import org.xtext.abs.outline.PackageContainer;
import org.xtext.abs.outline.PackageEntry;
import org.xtext.abs.plugin.internal.IncrementalModelBuilder;
import org.xtext.abs.plugin.internal.NoModelException;
import org.xtext.abs.plugin.internal.TypecheckInternalException;
import static choco.kernel.model.variables.integer.IntegerExpressionVariable.*;


import static org.xtext.abs.Constants.*;

import abs.frontend.analyser.SemanticCondition;
import abs.frontend.analyser.SemanticConditionList;
import abs.frontend.ast.ASTNode;
import abs.frontend.ast.CompilationUnit;
import abs.frontend.ast.Model;
import abs.frontend.parser.ABSPackageFile;
import abs.frontend.parser.Main;
import abs.frontend.parser.ParserError;
import abs.frontend.typechecker.locationtypes.LocationType;
import abs.frontend.typechecker.locationtypes.infer.LocationTypeInferrerExtension;
import abs.frontend.typechecker.locationtypes.infer.LocationTypeVariable;

import static org.xtext.abs.UtilityFunctions.isABSFile;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class SampleABSNature extends XtextNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "org.xtext.Abs.ui.sampleABSNature";
	public static final String PACKAGE_DEPENDENCIES = ".dependencies"; 
	public volatile Object modelLock = new Object(); // TODO: Should probably be final, but then the mocks fail.
	private IProject project;
	private final PackageContainer packageContainer = new PackageContainer();
	private ScopedPreferenceStore preferencestore;
	private final IncrementalModelBuilder modelbuilder = new IncrementalModelBuilder();

	@Override
	public void configure() throws CoreException {
		System.out.println("Custom configure sampleABSNature");
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(Constants.BUILDER_ID)) {
				return;
			}
		}

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = desc.newCommand();
		command.setBuilderName(Constants.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);
	}

	@Override
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(Constants.BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);
				return;
			}
		}

	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
		// initialise package dependencies
		initDependencies(); 
	}


	public void initDependencies() {
		try {
			if (project != null) {
				packageContainer.clear();
				File file = new File(project.getFile(PACKAGE_DEPENDENCIES).getLocationURI());
				Set<PackageEntry> entries = new HashSet<PackageEntry>();
				if (file.exists()) {
					Properties prop = new Properties();
					prop.loadFromXML(new FileInputStream(file));
					for (String qualified : prop.stringPropertyNames()) {
						Boolean readonly = Boolean.valueOf(prop.getProperty(qualified));
						File f = new File(qualified);
						if (isABSPackage(f)) {
							entries.add(new PackageEntry(packageContainer, f.getName(), qualified, readonly));
						}
					}
					packageContainer.setPackages(entries);
					packageContainer.setProject(project);
				}
			}
		} catch (IOException e) {
			Logger.getLogger(AbsActivator.class).error(e);
		}
	}

	public static boolean isABSPackage(File file) throws IOException {
		return file.exists() && new ABSPackageFile(file).isABSPackage();
	}

	// assumes file != null
	public static boolean isABSPackage(IFile file) {
		if (! "jar".equals(file.getFileExtension()))
			return false;

		try {
			return isABSPackage(file.getLocation().toFile());
		} catch (IOException e) {
			System.out.println("standardExceptionHandling(e)");
			//standardExceptionHandling(e);
			return false;
		}
	}


	public boolean toIncludeInScope(IResource resource) {
		if (project == null)
			return false;
		IFolder target = project.getFolder("target");
		if (! target.exists()) {
			return true;
		}
		boolean ignore = getProjectPreferenceStore().getBoolean(MAVEN_IGNORE_TARGET_FOLDER);
		return !ignore || !target.getProjectRelativePath().isPrefixOf(resource.getProjectRelativePath());
	}


	public IPersistentPreferenceStore getProjectPreferenceStore(){
		if(preferencestore == null){
			preferencestore = new ScopedPreferenceStore(new ProjectScope(getProject()), Constants.PLUGIN_ID);
			initProjectDefaults();
		}
		return (IPersistentPreferenceStore) preferencestore;
	}


	/**
	 * Set the defaults for the properties in the project property pages
	 */
	private void initProjectDefaults(){
		preferencestore.setDefault(LOCATION_TYPECHECK, true);
		preferencestore.setDefault(PRODUCT_TYPECHECK, true);
		preferencestore.setDefault(LOCATION_TYPE_OVERLAY, true);
		preferencestore.setDefault(DEFAULT_LOCATION_TYPE, DEFAULT_DEFAULT_LOCATION_TYPE);
		preferencestore.setDefault(LOCATION_TYPE_PRECISION, DEFAULT_LOCATION_TYPE_PRECISION);

		if (project.getFile(DEFAULT_MAVEN_POM_PATH).exists()) {
			preferencestore.setDefault(MAUDE_PATH, DEFAULT_MAVEN_TARGET_MAUDE_PATH);
			preferencestore.setDefault(JAVA_SOURCE_PATH, DEFAULT_MAVEN_TARGET_JAVA_PATH);
		} else {
			preferencestore.setDefault(MAUDE_PATH, DEFAULT_MAUDE_PATH);
			preferencestore.setDefault(JAVA_SOURCE_PATH, DEFAULT_JAVA_PATH);
		}

		preferencestore.setDefault(NO_WARNINGS, true);
		preferencestore.setDefault(SOURCE_ONLY, false);
		preferencestore.setDefault(ALWAYS_COMPILE, true);

		/*
		 * Maven 
		 */
		preferencestore.setDefault(MAVEN_EXEC_PATH, DEFAULT_MAVEN_EXEC_PATH);
		preferencestore.setDefault(MAVEN_IGNORE_TARGET_FOLDER, false);
	}



	public void parseABSFile(IResource resource, final boolean withincomplete, IProgressMonitor monitor) {
		if (resource.exists() && isABSFile(resource)) {
			final IFile file = (IFile) resource;
			assert file.exists();
			try {
				// Markers modify the workspace:
				new WorkspaceModifyOperation() {

					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
						/* Only delete PARSE-markers first: if we've just been launched,
						 * we don't want to erase persistent markers, since type-errors etc.
						 * only come back through an explicit build, which doesn't happen
						 * on launching Eclipse even with auto-build. [stolz] 
						 */
						file.deleteMarkers(PARSE_MARKER_TYPE, true, IResource.DEPTH_ZERO);
						try {
							if (!file.isSynchronized(IResource.DEPTH_ZERO)) {
								file.refreshLocal(IResource.DEPTH_ZERO, monitor);
							}

							Main m = new Main();
							m.setWithStdLib(true);

							List<CompilationUnit> units = new ArrayList<CompilationUnit>();
							if (isABSPackage(file)) {
								units.addAll(m.parseABSPackageFile(file.getLocation().toFile()));
							} else {
								CompilationUnit cu = m.parseUnit(file.getLocation().toFile(), null, new InputStreamReader(file.getContents()));
								cu.setName(file.getLocation().toFile().getAbsolutePath());
								units.add(cu);
							}
							modelbuilder.addCompilationUnits(units);
							for (CompilationUnit cu : units) {
								if(cu.hasParserErrors()){
									for(ParserError err : cu.getParserErrors()){
										addMarker(file, err);
									}
								}
							}
						} catch(NoModelException e){
							//ignore
						} catch (CoreException e) {
							throw e;
						}catch (Exception e) {
							throw new InvocationTargetException(e);
						}
					}

				}.run(monitor);
			} catch (InvocationTargetException e) {
				Logger.getLogger(Activator.class).error(e);
			} catch (InterruptedException e) {
			}
		} else
			assert false : resource;
	}

	/*
	 * ABS implementation of adding Marker
	 * 
	 * */
	public static void addMarker(IResource file, ParserError err) throws CoreException {
		int startline   = err.getLine()-1;
		int startcolumn = err.getColumn()-1;
		int endline;
		int endcolumn;

		endcolumn = -1;
		endline   = startline;

		String message = err.getMessage();
		int severity   = IMarker.SEVERITY_ERROR;
		IMarker marker = file.createMarker(PARSE_MARKER_TYPE);
		marker.setAttribute(IMarker.MESSAGE, message);
		marker.setAttribute(IMarker.SEVERITY, severity);
		marker.setAttribute(START_LINE, startline);
		marker.setAttribute(START_COLUMN, startcolumn);
		marker.setAttribute(END_LINE, endline);
		marker.setAttribute(END_COLUMN, endcolumn);
		marker.setAttribute(IMarker.LINE_NUMBER, startline+1);
	}

	public void cleanModel(){
		modelbuilder.cleanModel();
	}

	/**
	 * takes the properties from the project preference store for location type checking and location type precision. Typeckecks
	 * the current model in the current model builder.
	 * Note that your model must be sufficiently "complete" and not have any semantic errors .
	 * @param monitor 
	 * @throws CoreException {@link IResource#deleteMarkers(String, boolean, int)} does not handle exceptions thrown by
	 * #createMarker(SemanticError) and #createMarker(TypecheckInternalException)
	 */
	void typeCheckModel(IProgressMonitor monitor) throws CoreException{
		getProject().deleteMarkers(TYPECHECK_MARKER_TYPE, true, IResource.DEPTH_INFINITE);
		getProject().deleteMarkers(LOCATION_TYPE_INFERENCE_MARKER_TYPE, true, IResource.DEPTH_INFINITE);
		boolean dolocationtypecheck = getProjectPreferenceStore().getBoolean(LOCATION_TYPECHECK);
		String defaultlocationtype = getProjectPreferenceStore().getString(DEFAULT_LOCATION_TYPE);
		String defaultlocationtypeprecision = getProjectPreferenceStore().getString(LOCATION_TYPE_PRECISION);
		boolean checkProducts = getProjectPreferenceStore().getBoolean(PRODUCT_TYPECHECK);
		try {
			addPackagesForTypeChecking();
			final SemanticConditionList typeerrors = modelbuilder.typeCheckModel(monitor,dolocationtypecheck, defaultlocationtype, defaultlocationtypeprecision, checkProducts);
			for(SemanticCondition s: typeerrors) {
				System.out.println(s);
			}
			createMarkers(typeerrors);

			if (dolocationtypecheck) {
				createLocationTypeInferenceMarker();
			}
		} catch (NoModelException e) {
			//ignore
			return;
		} catch (TypecheckInternalException e) {
			/* Internal error caught. Log, and turn into an error marker */
			//Logger.getLogger(AbsActivator.class).error(e);
			System.out.println(e);
			createMarker(e);
			return;
		}
	}


	/**
	 * adds a marker for the TypecheckInternalException to the current project corresponding to this narture
	 * @param e the exception from type checking the model
	 * @throws CoreException {@link IResource#createMarker(String)}
	 */
	private void createMarker(TypecheckInternalException e)
			throws CoreException {
		IMarker exceptionMarker = project.createMarker(TYPECHECK_MARKER_TYPE);
		exceptionMarker.setAttribute(IMarker.MESSAGE, "Exception while typechecking: "+e.getMessage());
		exceptionMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
	}

	/**
	 * Add ABS package dependencies to {@link AbsNature#modelbuilder} for type checking 
	 * @throws TypecheckInternalException 
	 */
	private void addPackagesForTypeChecking() throws TypecheckInternalException {
		try {
			Main m = new Main();
			m.setWithStdLib(true);
			List<CompilationUnit> units = new ArrayList<CompilationUnit>();
			for (PackageEntry entry : packageContainer.getPackages()) {
				File file = new File(entry.getPath());
				if (isABSPackage(file)) {
					units.addAll(m.parseABSPackageFile(file));
				}
			}
			modelbuilder.addCompilationUnits(units);
		} catch (IOException e) {
			throw new TypecheckInternalException(e);
		} catch (NoModelException e) {
			//ignore
		}
	}

	public void createMarkers(SemanticConditionList errors) throws CoreException {
		for (SemanticCondition e : errors) {
			createMarker(e);
		}
	}

	public void createMarker(SemanticCondition error) throws CoreException {
		createMarker(error.getNode(), error.getMsg(),
				error.isError() ? IMarker.SEVERITY_ERROR : IMarker.SEVERITY_WARNING,
						TYPECHECK_MARKER_TYPE);
	}


	/**
	 * take a node of the AST, finds the corresponding compilation unit and adds a marker for the message to the file the
	 * compilation unit was parsed from
	 * @param node some AST node which is part of a compilation unit
	 * @param message the message to be shown in the marker pop up
	 * @param severity {@link IMarker#SEVERITY_ERROR} {@link IMarker#SEVERITY_WARNING} {@link IMarker#SEVERITY_INFO}
	 * @param markerType the id of the marker that should be created
	 * @throws CoreException {@link IMarker#setAttribute(String, boolean)} {@link IMarker#getAttribute(String, int)}
	 */
	private static void createMarker( ASTNode<?> node, String message, int severity, String markerType) throws CoreException {
		if (node == null)
			return; 

		IFile declfile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path((node.getCompilationUnit()).getFileName()));
		/* [stolz] I had a situation where I had the ABSFrontend in the workspace, and then closed it:
			org.eclipse.core.internal.resources.ResourceException: Resource '/ABSFrontend/src/abs/lang/abslang.abs' does not exist.
				at org.eclipse.core.internal.resources.Resource.checkExists(Resource.java:320)
				at org.eclipse.core.internal.resources.Resource.checkAccessible(Resource.java:194)
				at org.eclipse.core.internal.resources.Resource.createMarker(Resource.java:711)
				at org.abs-models.abs.plugin.builder.AbsNature.createMarker(AbsNature.java:241)
			FIXME: We shouldn't have picked that one up in the first place, I guess, but better be safe than sorry.
		 */
		if(declfile==null || !declfile.isAccessible())
			return;
		assert declfile.isAccessible();
		IMarker marker = declfile.createMarker(markerType);
		marker.setAttribute(IMarker.MESSAGE, message);
		marker.setAttribute(IMarker.SEVERITY, severity);
		marker.setAttribute(START_LINE, node.getStartLine()-1);
		marker.setAttribute(START_COLUMN, node.getStartColumn()-1);
		marker.setAttribute(END_LINE, node.getEndLine()-1);
		marker.setAttribute(END_COLUMN, node.getEndColumn());
		marker.setAttribute(IMarker.LINE_NUMBER, node.getStartLine());
	}

	public void createMarkers(Model model) throws CoreException {
		createMarkers(model.getErrors());
		createMarkers(model.getTypeErrors());
	}

	private void createLocationTypeInferenceMarker() throws CoreException {
		synchronized (modelLock) {
			LocationTypeInferrerExtension locationTypeInferrerExtension = modelbuilder.getLocationTypeInferrerExtension();
			if (locationTypeInferrerExtension != null) {
				Map<LocationTypeVariable, LocationType> inferResult = locationTypeInferrerExtension.getResults();
				if (inferResult != null) {
					if (getProjectPreferenceStore().getBoolean(LOCATION_TYPE_OVERLAY)) {
						for (Entry<LocationTypeVariable, LocationType> e : inferResult.entrySet()) {
							LocationType annoType = e.getKey().getAnnotatedType();
							if (annoType == null || annoType.equals(LocationType.INFER)) {
								int severity = IMarker.SEVERITY_ERROR;
								if (e.getValue().isNear()) {
									severity = IMarker.SEVERITY_INFO;
								} else if (e.getValue().isSomewhere()) {
									severity = IMarker.SEVERITY_WARNING;
								}

								createMarker(e.getKey().getNode(), "Inferred Location Type: " + e.getValue(), severity
										, LOCATION_TYPE_INFERENCE_MARKER_TYPE);
							}
						}
					} 
				} else {
					IMarker marker = getProject().createMarker(TYPECHECK_MARKER_TYPE);
					marker.setAttribute(IMarker.MESSAGE, "Location Type Inference Failed");
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				}
			}
		}
	}


	public Model getCompleteModel(){
		return getCompleteModel(null);
	}

	public Model getCompleteModel(IProgressMonitor mon){
		Model model = modelbuilder.getCompleteModel();
		/* Not compiled yet? */
		if (model == null && project != null) {
			try {
				project.build(IncrementalProjectBuilder.FULL_BUILD, mon);
				// Now it should be ready:
				model = modelbuilder.getCompleteModel();
			} catch (CoreException e) {
				System.out.println("Error in getCompleteModel");
				//LOGGER.getLogger(A).logException(e);
			}
		}
		return model;
	}


	public PackageContainer getPackages() {
		return packageContainer;
	}
}
