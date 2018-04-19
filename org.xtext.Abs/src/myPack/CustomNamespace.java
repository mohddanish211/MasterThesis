package myPack;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Tuples;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

import abs.frontend.ast.Feature;

public class CustomNamespace extends ImportedNamespaceAwareLocalScopeProvider{
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	
	@Override
	protected String getImportedNamespace(EObject object) {
		System.out.println("Inside @@@@@@@@@****************getImportedNamespace");
		System.out.println(object.eClass());
		EStructuralFeature feature = object.eClass().getEStructuralFeature("importedNamespace");
		if (feature != null && String.class.equals(feature.getEType().getInstanceClass())) {
		    System.out.println(feature);
			return (String) object.eGet(feature);
		}
		return null;
	}
	
	
	protected ImportNormalizer createImportedNamespaceResolver(EObject child,final String namespace, boolean ignoreCase) {
		System.out.println("Inside createImportedNamespaceREsolver");
		System.out.println(child);
		if (Strings.isEmpty(namespace))
			return null;
		QualifiedName importedNamespace = qualifiedNameConverter.toQualifiedName(namespace);
		System.out.println(importedNamespace);
		System.out.println("Wildcard................");
		System.out.println(getWildCard());
		System.out.println(child.eGet(child.eClass().getEStructuralFeature("star")));
		System.out.println(ignoreCase);
		if (importedNamespace == null || importedNamespace.isEmpty()) {
			return null;
		}
		boolean hasWildCard = ignoreCase ? 
				((String) child.eGet(child.eClass().getEStructuralFeature("name"))).equalsIgnoreCase(getWildCard()) :
					((String) child.eGet(child.eClass().getEStructuralFeature("star"))).equals(getWildCard());
		System.out.println("hasWildcard");
		System.out.println(hasWildCard);
		if (hasWildCard) {
			if (importedNamespace.getSegmentCount() <= 1)
				return null;
			return doCreateImportNormalizer(importedNamespace.skipLast(1), true, ignoreCase);
		} else {
			return doCreateImportNormalizer(importedNamespace, false, ignoreCase);
		}
	}
	@Override
	protected List<ImportNormalizer> getImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
		return cache.get(Tuples.create(context, ignoreCase, "imports"), context.eResource(), new Provider<List<ImportNormalizer>>() {
			@Override
			public List<ImportNormalizer> get() {
				return internalGetImportedNamespaceResolvers(context, ignoreCase);
			}
		});
	}
	
	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, boolean ignoreCase) {
		System.out.println("inside internalGetImportedNamespaceResolvers");
		System.out.println(context.eContents());
		List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
		
		System.out.println(context.eResource());
		EList<EObject> eContents = context.eContents();
		System.out.println("Child are:::::::::::");
		for (EObject child : eContents) {
			String value = getImportedNamespace(child);
			ImportNormalizer resolver = createImportedNamespaceResolver(child,value, ignoreCase);
			if (resolver != null)
				importedNamespaceResolvers.add(resolver);
		}
		return importedNamespaceResolvers;
	}
	
	protected ImportNormalizer doCreateImportNormalizer(QualifiedName importedNamespace, boolean wildcard, boolean ignoreCase) {
		return new ImportNormalizer(importedNamespace, wildcard, ignoreCase);
	}
	
	

}
