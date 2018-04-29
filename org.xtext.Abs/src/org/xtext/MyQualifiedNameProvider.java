package org.xtext;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.SimpleNameProvider;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Module_import;


public class MyQualifiedNameProvider extends SimpleNameProvider{
	public QualifiedName qualifiedName(Feature_decl decl) {
		return QualifiedName.create(decl.getName());
		}

	public QualifiedName qualifiedName(Module_import decl) {
		System.out.println("Inside qualifiedName");
		System.out.println(decl.getImportedNamespace().toString());
		return QualifiedName.create(decl.getImportedNamespace().toString());
		}
}
