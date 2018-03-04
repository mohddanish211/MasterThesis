package org.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.abs.Feature_decl;

public class MyQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{
	public QualifiedName qualifiedName(Feature_decl decl) {
		return QualifiedName.create(decl.getName());
		}

}
