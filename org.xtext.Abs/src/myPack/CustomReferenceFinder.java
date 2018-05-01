package myPack;

import org.eclipse.xtext.findReferences.IReferenceFinder;

import com.google.inject.Inject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.findReferences.IReferenceFinder;
import org.eclipse.xtext.findReferences.TargetURICollector;
import org.eclipse.xtext.findReferences.TargetURIs;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.DefaultReferenceDescription;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Productline_decl;

import myPack.*;

import com.google.common.collect.Lists;
import com.google.inject.Provider;

public class CustomReferenceFinder {
	@Inject
	private IReferenceFinder referenceFinder;

	@Inject
	private Provider<TargetURIs> targetURIsProvider;

	@Inject
	private TargetURICollector uriCollector;

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider;
	
	public List<IReferenceDescription> findReferencesTo(EObject target, IProgressMonitor monitor) {
		final TargetURIs targetURIs = getTargetURIs(target);
		final ResourceSet resourceSet = target.eResource().getResourceSet();
		final List<IReferenceDescription> result = Lists.newArrayList();
		IReferenceFinder.IResourceAccess resourceAccess = new SimpleResourceAccess(resourceSet);
		IReferenceFinder.Acceptor acceptor = new IReferenceFinder.Acceptor() {

			@Override
			public void accept(IReferenceDescription description) {
				result.add(description);
			}

			@Override
			public void accept(EObject source, URI sourceURI, EReference eReference, int index, EObject targetOrProxy,
					URI targetURI) {
				accept(new DefaultReferenceDescription(sourceURI, targetURI, eReference, index, null));
			}
		};
		referenceFinder.findAllReferences(targetURIs, resourceAccess,
				resourceDescriptionsProvider.getResourceDescriptions(resourceSet),
				acceptor, monitor);
		return result;
	}
	
	public List<IReferenceDescription> findReferencesTo(EObject target) {
		return findReferencesTo(target, null);
	}

	private TargetURIs getTargetURIs(EObject primaryTarget) {
		TargetURIs result = targetURIsProvider.get();
		uriCollector.add(primaryTarget, result);
		return result;
	}
	
	public EObject customResourceFinder(URI uri,EObject eObject) {
		ResourceSet resourceSet = new ResourceSetImpl();
		XtextResource resource =(XtextResource)resourceSet.getResource(uri,true);
		if(eObject instanceof Delta_decl) {
			return resource.getEObject(uri.fragment()).eContainer();
			}
		else {
			return EcoreUtil.getRootContainer(resource.getEObject(uri.fragment()));
			}
	}
}
