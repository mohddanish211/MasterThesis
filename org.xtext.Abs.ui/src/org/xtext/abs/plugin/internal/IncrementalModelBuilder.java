package org.xtext.abs.plugin.internal;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import abs.frontend.ast.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import static org.xtext.abs.Constants.ABSFRONTEND_PLUGIN_ID;

import static choco.kernel.model.variables.integer.IntegerExpressionVariable.*;
import abs.backend.common.InternalBackendException;
import abs.common.WrongProgramArgumentException;
import abs.frontend.ast.ASTNode;
import abs.frontend.ast.CompilationUnit;
import abs.frontend.ast.Model;
import abs.frontend.ast.ProductDecl;
import abs.frontend.delta.DeltaModellingException;
import abs.frontend.delta.DeltaModellingWithNodeException;
import abs.frontend.parser.Main;
import abs.frontend.typechecker.TypeCheckerException;
import abs.frontend.typechecker.locationtypes.LocationType;
import abs.frontend.typechecker.locationtypes.infer.LocationTypeInferrerExtension;
import abs.frontend.typechecker.locationtypes.infer.LocationTypeInferrerExtension.LocationTypingPrecision;

import org.xtext.Abs.ui.internal.AbsActivator;

import abs.frontend.analyser.ErrorMessage;
import abs.frontend.analyser.SemanticConditionList;
import abs.frontend.analyser.SemanticError;

public class IncrementalModelBuilder {
	
	//private abs.frontend.ast.Model model  = null;
	private abs.frontend.ast.Model model  = null;
    private LocationTypeInferrerExtension ltie;

	public LocationTypeInferrerExtension getLocationTypeInferrerExtension() {
        return ltie;
    }
	
	
	public synchronized CompilationUnit getCompilationUnit(String fileName) throws NoModelException{
		if(model == null)
			throw new NoModelException();
		Iterator<CompilationUnit> iter = model.getCompilationUnits().iterator();
		// normalize representation:
		fileName = normalizePath(fileName);
		while(iter.hasNext()){
			CompilationUnit cu = iter.next();
			String cuFileName = cu.getFileName();
			// normalize representation:
			cuFileName = normalizePath(cuFileName);
			if(fileName.equals(cuFileName)){
				return cu;
			}
		}
		return null;
	}
	
	private String normalizePath(String fileName) {
		fileName = fileName.replace('\\', '/');
		if (fileName.matches("^/[a-zA-Z]+:/.*$")) {
			// a path like /C:/....
			// remove the slash from the beginning
			fileName = fileName.substring(1);
		}
		return fileName;
	}

	public synchronized void addCompilationUnits(Iterable<CompilationUnit> units) throws IOException, NoModelException {
		// Initialize the model.
		System.out.println("Inside addCompilationUnits");
		if(model == null){
			model = new abs.frontend.ast.Model();
			System.out.println("Before getStdLibCompilationUnit()");
			model.addCompilationUnit(getStdLibCompilationUnit());
		}
		for (CompilationUnit u : units) {
			addCompilationUnit(u);
		}
		Assert.isNotNull(model);
	}
	

	public synchronized void addCompilationUnit(CompilationUnit cu) {
		if(model == null){
			model = new abs.frontend.ast.Model();

			model.addCompilationUnit(getStdLibCompilationUnit());
			if (cu != null) // just give us the stdlib
				model.addCompilationUnit(cu);
			return;
		}
		if (cu == null)
			return;
		String filename  = cu.getFileName();
		assert filename != null;

		CompilationUnit cuold = null;
		try {
			cuold = getCompilationUnit(filename);
		} catch (NoModelException e) {
			// we're pretty sure there's a model.
			assert false;
		}
		List<CompilationUnit> culist = model.getCompilationUnitList();
		int cindex = culist.getIndexOfChild(cuold);
		if(cindex>0){
			model.setCompilationUnit(cu, cindex);
		}
		else {
			model.addCompilationUnit(cu);
		}
//		model.flushCache();
		flushAll(model);
	}

	private CompilationUnit getStdLibCompilationUnit() {
		CompilationUnit stdLib;
		File bundle;
		try {
			stdLib = new Main().getStdLib();
			bundle = FileLocator.getBundleFile(Platform.getBundle(ABSFRONTEND_PLUGIN_ID));
		} catch (IOException e) {
			Logger.getLogger(AbsActivator.class).error(e);
			// Your plugin is probably busted.
			return null;
		} catch(InternalBackendException e) {
			//Activator.logException(e);
			// Your plugin is probably busted.
			return null;
                }

		File src = new File(bundle, stdLib.getFileName());
		if (!src.exists()) {
			src = new File(bundle, "src/"+stdLib.getFileName());
		}
		stdLib.setName(src.getAbsolutePath());
		return stdLib;
	}
	
	public static void flushAll(ASTNode<?> node){
//		for(int i=0; i<node.getNumChildNoTransform(); i++){
//			flushAll(node.getChildNoTransform(i));
//		}
		node.flushCache();
		return;
	}
	
	public synchronized void cleanModel(){
		model = null;
	}
	
	@SuppressWarnings("deprecation")
	public synchronized SemanticConditionList typeCheckModel(IProgressMonitor monitor, boolean locationTypeChecking, String defaultloctype, String locationTypePrecision, boolean checkProducts) throws NoModelException, TypecheckInternalException{
		System.out.println(">>>>>>>>>>>>>>>>>. type check Model>>>>>");
		System.out.println(model);
		if(model == null) throw new NoModelException();
		if(model.hasParserErrors())
			return new SemanticConditionList(); // don't typecheck if the model has parsererrors
//			throw new TypecheckInternalException(new Exception("Model has parser errors!"));
//		model.flushCache();
		System.out.println("Model has Parse Errors");
		flushAll(model);
		System.out.println("Model after flush All");
		model.getTypeExt().clearTypeSystemExtensions();
		/*System.out.println("Model model.getTypeExt().clearTypeSystemExtensions");
		if (locationTypeChecking) {
			System.out.println("Inside LOcation TYpe checking");
			LocationType defaultLocType = LocationType.createFromName(defaultloctype);
			LocationTypeInferrerExtension ltie = new LocationTypeInferrerExtension(model);
			this.ltie = ltie;
			ltie.setDefaultType(defaultLocType);
			ltie.setLocationTypingPrecision(LocationTypingPrecision.valueOf(locationTypePrecision));
	        model.registerTypeSystemExtension(ltie);
		}*/
		try {
			System.out.println("Inside try SemanticConditionList");
			SemanticConditionList semerrors = model.getErrors();
			/* Don't typecheck with semerrors, it might trip up. */
			if (!semerrors.containsErrors())
				semerrors = model.typeCheck();

			/* Check products for errors.
			 * Only the first error is reported (if any), on the product AST-node.
			 * TODO: May be time-consuming for large projects, hence the checkProducts-switch.
			 *       Also could use a timer to switch off if it becomes excessive.
			 * TODO: Use Eclipse's nested markers to show ALL contained errors?
			 * TODO: The outline could indicate the broken product as well.
			 */
						
			if (!semerrors.containsErrors() && checkProducts) {
				System.out.println("!semerrors.containsErrors()");
				System.out.println(semerrors.containsErrors());
				System.out.println("checkProducts");
				System.out.println(checkProducts);
				monitor = new SubProgressMonitor(monitor, 10); // arbitrary value
				monitor.beginTask("Checking products", model.getProductDecls().size());
				for (ProductDecl p : model.getProductDecls()) {
					monitor.subTask("Checking "+p.getName());
					Model m2 = model.treeCopyNoTransform();
                                        m2.flushTreeCache();
					try {
						m2.flattenForProduct(p);
						SemanticConditionList p_errs = m2.typeCheck();
						if (p_errs.containsErrors()) {
							// Only show first error, on product
							semerrors.add(new SemanticError(p, ErrorMessage.ERROR_IN_PRODUCT, p.getName(), p_errs.getFirstError().getMessage()));
						}
					} catch (WrongProgramArgumentException e) {
						semerrors.add(new SemanticError(p, ErrorMessage.ERROR_IN_PRODUCT, p.getName(), e.getMessage()));
					} catch (DeltaModellingException e) {
						/* We we have a better location for error reporting? */
						final ASTNode<?> loc;
						if (e instanceof DeltaModellingWithNodeException)
							loc = ((DeltaModellingWithNodeException) e).getNode();
						else loc = p;
						if (e.getDelta() == null)
							semerrors.add(new SemanticError(loc, ErrorMessage.ERROR_IN_PRODUCT, p.getName(), e.getMessage()));
						else
							semerrors.add(new SemanticError(loc, ErrorMessage.ERROR_IN_PRODUCT_WITH_DELTA, p.getName(), e.getDelta().getName(), e.getMessage()));
					}
				}
				monitor.done();
			}
			return semerrors;
	    } catch (TypeCheckerException e) {
	        System.out.println("Error during Type Check");
	    	return new SemanticConditionList(e);
		} catch (RuntimeException e) {
			 System.out.println("Error during Runtime");
			throw new TypecheckInternalException(e);
		}
	}
	
	
	public synchronized Model getCompleteModel(){
		return model;
	}
	
}
