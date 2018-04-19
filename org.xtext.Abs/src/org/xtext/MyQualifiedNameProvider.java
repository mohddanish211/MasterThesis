package org.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Module_import;


public class MyQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{
	public QualifiedName qualifiedName(Feature_decl decl) {
		return QualifiedName.create(decl.getName());
		}

	public QualifiedName qualifiedName(Module_import decl) {
		System.out.println("Inside qualifiedName");
		System.out.println(decl.getImportedNamespace().toString());
		return QualifiedName.create(decl.getImportedNamespace().toString());
		}
}
