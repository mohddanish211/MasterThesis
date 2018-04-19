package org.xtext.abs.plugin;

import static com.google.common.collect.Lists.newArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.BuildType;
import org.eclipse.xtext.builder.nature.XtextNature;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.util.internal.Stopwatches;
import org.eclipse.xtext.util.internal.Stopwatches.StoppedTask;
import org.xtext.abs.plugin.ABSnature;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ABSbuilder extends BuilderParticipant /*implements IncrementalProjectBuilder*/{

	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider;
	
	static class SampleDeltaVisitor implements IResourceDeltaVisitor {
		final private HashSet<String> changedFiles;
		final private IProgressMonitor monitor;

		public SampleDeltaVisitor(HashSet<String> changedFiles, IProgressMonitor monitor){
			this.changedFiles = changedFiles;
			this.monitor = monitor;
		}

		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			XtextNature nature = ABSnature.getAbsNature(resource);
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				//if (nature.toIncludeInScope(resource)) {
				//nature.parseABSFile(resource,false,monitor);
				changedFiles.add(resource.getFullPath().toString());
				//}
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				//if (nature.toIncludeInScope(resource)) {
				//nature.parseABSFile(resource,false,monitor);
				changedFiles.add(resource.getFullPath().toString());
				//}
				break;
			}
			return true;
		}
	}






	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		System.out.println("Custom Builder");
		System.out.println(context.getBuiltProject().getNature("org.xtext.Abs.ui.absnature"));
		if (!context.getBuiltProject().hasNature("org.xtext.Abs.ui.absnature")) {
			IProject builtProject = context.getBuiltProject();
			IProjectDescription description = builtProject.getDescription();
			String[] natures = description.getNatureIds();
			for(String nature: natures)
				System.out.println(nature);
		}
		//new abs.frontend.parser.Main().mainMethod(resolvedFile.toFileString());
		List<IResourceDescription.Delta> deltas1 = getRelevantDeltas(context);
		System.out.println("Deltas are::");
		for(Delta delta: deltas1) {
			System.out.println(delta);
			System.out.println(delta.getUri());
			System.out.println(CommonPlugin.resolve(delta.getUri()).toFileString());
			String fullPath = CommonPlugin.resolve(delta.getUri()).toFileString();
			new abs.frontend.parser.Main().mainMethod(fullPath);
		}

		

		if (!isEnabled(context)) {
			return;
		}

		final List<IResourceDescription.Delta> deltas = super.getRelevantDeltas(context);
		if (deltas.isEmpty()) {
			return;
		}
		
		StoppedTask task = Stopwatches.forTask("org.eclipse.xtext.builder.BuilderParticipant.build(IBuildContext, IProgressMonitor)");
		try {
			task.start();
			
			// monitor handling
			if (monitor.isCanceled())
				throw new OperationCanceledException();
			SubMonitor subMonitor = SubMonitor.convert(monitor, context.getBuildType() == BuildType.RECOVERY ? 5 : 3);
	
			EclipseResourceFileSystemAccess2 access = fileSystemAccessProvider.get();
			IProject builtProject = context.getBuiltProject();
			access.setProject(builtProject);
			Map<String, OutputConfiguration> outputConfigurations = getOutputConfigurations(context);
			refreshOutputFolders(context, outputConfigurations, subMonitor.newChild(1));
			if (subMonitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			access.setOutputConfigurations(outputConfigurations);
			if (context.getBuildType() == BuildType.CLEAN || context.getBuildType() == BuildType.RECOVERY) {
				SubMonitor cleanMonitor = SubMonitor.convert(subMonitor.newChild(2), outputConfigurations.size());
				for (OutputConfiguration config : outputConfigurations.values()) {
					cleanOutput(context, config, access, cleanMonitor.newChild(1));
				}
				if (context.getBuildType() == BuildType.CLEAN)
					return;
			}
			Map<OutputConfiguration, Iterable<IMarker>> generatorMarkers = getGeneratorMarkers(builtProject, outputConfigurations.values());
			if (subMonitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			doBuild(deltas, outputConfigurations, generatorMarkers, context, access, subMonitor.newChild(2));

		} finally {
			task.stop();
		}
	
		
	}


}

