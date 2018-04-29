/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AbsGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DomainModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.DomainModel");
		private final RuleCall cCompilation_UnitParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		////Goal Main Model OR Starting Rule
		//DomainModel:
		//	Compilation_Unit;
		@Override public ParserRule getRule() { return rule; }
		
		//Compilation_Unit
		public RuleCall getCompilation_UnitParserRuleCall() { return cCompilation_UnitParserRuleCall; }
	}
	public class Compilation_UnitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Compilation_Unit");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCompilation_UnitAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cModuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cModuleModule_declParserRuleCall_1_0 = (RuleCall)cModuleAssignment_1.eContents().get(0);
		private final Assignment cDeltaDeclAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeltaDeclDelta_declParserRuleCall_2_0 = (RuleCall)cDeltaDeclAssignment_2.eContents().get(0);
		private final Assignment cUpdate_declAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUpdate_declUpdate_declParserRuleCall_3_0 = (RuleCall)cUpdate_declAssignment_3.eContents().get(0);
		private final Assignment cProductline_declAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cProductline_declProductline_declParserRuleCall_4_0 = (RuleCall)cProductline_declAssignment_4.eContents().get(0);
		private final Assignment cProduct_declAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cProduct_declProduct_declParserRuleCall_5_0 = (RuleCall)cProduct_declAssignment_5.eContents().get(0);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cAlternatives_6.eContents().get(0);
		private final Keyword cRootKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Assignment cFeature_declAssignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final RuleCall cFeature_declFeature_declParserRuleCall_6_0_1_0 = (RuleCall)cFeature_declAssignment_6_0_1.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cAlternatives_6.eContents().get(1);
		private final Keyword cExtensionKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cFextensionAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final RuleCall cFextensionFextensionParserRuleCall_6_1_1_0 = (RuleCall)cFextensionAssignment_6_1_1.eContents().get(0);
		
		////compilationUnit+=Compilation_Unit;
		////Compilation Unit
		//Compilation_Unit:
		//	{Compilation_Unit} module+=Module_decl* deltaDecl+=Delta_decl*
		//	update_decl+=Update_decl* productline_decl=Productline_decl?
		//	product_decl+=Product_decl* ('root' feature_decl+=Feature_decl | 'extension' fextension+=Fextension)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Compilation_Unit} module+=Module_decl* deltaDecl+=Delta_decl* update_decl+=Update_decl*
		//productline_decl=Productline_decl? product_decl+=Product_decl* ('root' feature_decl+=Feature_decl | 'extension'
		//fextension+=Fextension)*
		public Group getGroup() { return cGroup; }
		
		//{Compilation_Unit}
		public Action getCompilation_UnitAction_0() { return cCompilation_UnitAction_0; }
		
		//module+=Module_decl*
		public Assignment getModuleAssignment_1() { return cModuleAssignment_1; }
		
		//Module_decl
		public RuleCall getModuleModule_declParserRuleCall_1_0() { return cModuleModule_declParserRuleCall_1_0; }
		
		//deltaDecl+=Delta_decl*
		public Assignment getDeltaDeclAssignment_2() { return cDeltaDeclAssignment_2; }
		
		//Delta_decl
		public RuleCall getDeltaDeclDelta_declParserRuleCall_2_0() { return cDeltaDeclDelta_declParserRuleCall_2_0; }
		
		//update_decl+=Update_decl*
		public Assignment getUpdate_declAssignment_3() { return cUpdate_declAssignment_3; }
		
		//Update_decl
		public RuleCall getUpdate_declUpdate_declParserRuleCall_3_0() { return cUpdate_declUpdate_declParserRuleCall_3_0; }
		
		//productline_decl=Productline_decl?
		public Assignment getProductline_declAssignment_4() { return cProductline_declAssignment_4; }
		
		//Productline_decl
		public RuleCall getProductline_declProductline_declParserRuleCall_4_0() { return cProductline_declProductline_declParserRuleCall_4_0; }
		
		//product_decl+=Product_decl*
		public Assignment getProduct_declAssignment_5() { return cProduct_declAssignment_5; }
		
		//Product_decl
		public RuleCall getProduct_declProduct_declParserRuleCall_5_0() { return cProduct_declProduct_declParserRuleCall_5_0; }
		
		//('root' feature_decl+=Feature_decl | 'extension' fextension+=Fextension)*
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//'root' feature_decl+=Feature_decl
		public Group getGroup_6_0() { return cGroup_6_0; }
		
		//'root'
		public Keyword getRootKeyword_6_0_0() { return cRootKeyword_6_0_0; }
		
		//feature_decl+=Feature_decl
		public Assignment getFeature_declAssignment_6_0_1() { return cFeature_declAssignment_6_0_1; }
		
		//Feature_decl
		public RuleCall getFeature_declFeature_declParserRuleCall_6_0_1_0() { return cFeature_declFeature_declParserRuleCall_6_0_1_0; }
		
		//'extension' fextension+=Fextension
		public Group getGroup_6_1() { return cGroup_6_1; }
		
		//'extension'
		public Keyword getExtensionKeyword_6_1_0() { return cExtensionKeyword_6_1_0; }
		
		//fextension+=Fextension
		public Assignment getFextensionAssignment_6_1_1() { return cFextensionAssignment_6_1_1; }
		
		//Fextension
		public RuleCall getFextensionFextensionParserRuleCall_6_1_1_0() { return cFextensionFextensionParserRuleCall_6_1_1_0; }
	}
	public class Module_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Module_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cModule_exportAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModule_exportModule_exportParserRuleCall_3_0 = (RuleCall)cModule_exportAssignment_3.eContents().get(0);
		private final Assignment cModule_importAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cModule_importModule_importParserRuleCall_4_0 = (RuleCall)cModule_importAssignment_4.eContents().get(0);
		private final Assignment cDeclAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDeclDeclParserRuleCall_5_0 = (RuleCall)cDeclAssignment_5.eContents().get(0);
		private final Assignment cMain_blockAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cMain_blockMain_blockParserRuleCall_6_0 = (RuleCall)cMain_blockAssignment_6.eContents().get(0);
		
		////Module_Decl
		////Module_Decl
		//Module_decl:
		//	'module' name=ID ';'
		//	module_export+=Module_export* module_import+=Module_import* decl+=Decl*
		//	main_block+=Main_block?;
		@Override public ParserRule getRule() { return rule; }
		
		//'module' name=ID ';' module_export+=Module_export* module_import+=Module_import* decl+=Decl* main_block+=Main_block?
		public Group getGroup() { return cGroup; }
		
		//'module'
		public Keyword getModuleKeyword_0() { return cModuleKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
		
		//module_export+=Module_export*
		public Assignment getModule_exportAssignment_3() { return cModule_exportAssignment_3; }
		
		//Module_export
		public RuleCall getModule_exportModule_exportParserRuleCall_3_0() { return cModule_exportModule_exportParserRuleCall_3_0; }
		
		//module_import+=Module_import*
		public Assignment getModule_importAssignment_4() { return cModule_importAssignment_4; }
		
		//Module_import
		public RuleCall getModule_importModule_importParserRuleCall_4_0() { return cModule_importModule_importParserRuleCall_4_0; }
		
		//decl+=Decl*
		public Assignment getDeclAssignment_5() { return cDeclAssignment_5; }
		
		//Decl
		public RuleCall getDeclDeclParserRuleCall_5_0() { return cDeclDeclParserRuleCall_5_0; }
		
		//main_block+=Main_block?
		public Assignment getMain_blockAssignment_6() { return cMain_blockAssignment_6; }
		
		//Main_block
		public RuleCall getMain_blockMain_blockParserRuleCall_6_0() { return cMain_blockMain_blockParserRuleCall_6_0; }
	}
	public class Module_exportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Module_export");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModule_exportAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExportKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cStarAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cStarMULTTerminalRuleCall_2_0_0 = (RuleCall)cStarAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Assignment cAnyPackageAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cAnyPackageQualifiedNameParserRuleCall_2_1_0_0 = (RuleCall)cAnyPackageAssignment_2_1_0.eContents().get(0);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cAnyPackageAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final RuleCall cAnyPackageQualifiedNameParserRuleCall_2_1_1_1_0 = (RuleCall)cAnyPackageAssignment_2_1_1_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFromKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_3_1_0 = (RuleCall)cImportedNamespaceAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		////Module_export
		//Module_export:
		//	{Module_export} 'export' (star=MULT | anyPackage+=QualifiedName (',' anyPackage+=QualifiedName)*) ('from'
		//	importedNamespace+=QualifiedName)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{Module_export} 'export' (star=MULT | anyPackage+=QualifiedName (',' anyPackage+=QualifiedName)*) ('from'
		//importedNamespace+=QualifiedName)? ';'
		public Group getGroup() { return cGroup; }
		
		//{Module_export}
		public Action getModule_exportAction_0() { return cModule_exportAction_0; }
		
		//'export'
		public Keyword getExportKeyword_1() { return cExportKeyword_1; }
		
		//star=MULT | anyPackage+=QualifiedName (',' anyPackage+=QualifiedName)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//star=MULT
		public Assignment getStarAssignment_2_0() { return cStarAssignment_2_0; }
		
		//MULT
		public RuleCall getStarMULTTerminalRuleCall_2_0_0() { return cStarMULTTerminalRuleCall_2_0_0; }
		
		//anyPackage+=QualifiedName (',' anyPackage+=QualifiedName)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//anyPackage+=QualifiedName
		public Assignment getAnyPackageAssignment_2_1_0() { return cAnyPackageAssignment_2_1_0; }
		
		//QualifiedName
		public RuleCall getAnyPackageQualifiedNameParserRuleCall_2_1_0_0() { return cAnyPackageQualifiedNameParserRuleCall_2_1_0_0; }
		
		//(',' anyPackage+=QualifiedName)*
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_1_0() { return cCommaKeyword_2_1_1_0; }
		
		//anyPackage+=QualifiedName
		public Assignment getAnyPackageAssignment_2_1_1_1() { return cAnyPackageAssignment_2_1_1_1; }
		
		//QualifiedName
		public RuleCall getAnyPackageQualifiedNameParserRuleCall_2_1_1_1_0() { return cAnyPackageQualifiedNameParserRuleCall_2_1_1_1_0; }
		
		//('from' importedNamespace+=QualifiedName)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'from'
		public Keyword getFromKeyword_3_0() { return cFromKeyword_3_0; }
		
		//importedNamespace+=QualifiedName
		public Assignment getImportedNamespaceAssignment_3_1() { return cImportedNamespaceAssignment_3_1; }
		
		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_3_1_0() { return cImportedNamespaceQualifiedNameParserRuleCall_3_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class Module_importElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Module_import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cStarAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cStarMULTTerminalRuleCall_1_0_0_0 = (RuleCall)cStarAssignment_1_0_0.eContents().get(0);
		private final Keyword cFromKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cImportedNamespaceAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_1_0_2_0 = (RuleCall)cImportedNamespaceAssignment_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_0_3 = (Keyword)cGroup_1_0.eContents().get(3);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cNameAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_1_0_0 = (RuleCall)cNameAssignment_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_1_1_1_0 = (RuleCall)cNameAssignment_1_1_1_1.eContents().get(0);
		private final Group cGroup_1_1_2 = (Group)cGroup_1_1.eContents().get(2);
		private final Keyword cFromKeyword_1_1_2_0 = (Keyword)cGroup_1_1_2.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1_1_2_1 = (Assignment)cGroup_1_1_2.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_1_1_2_1_0 = (RuleCall)cImportedNamespaceAssignment_1_1_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1_3 = (Keyword)cGroup_1_1.eContents().get(3);
		
		////Module_import
		//Module_import:
		//	'import' (star=MULT 'from' importedNamespace=QualifiedName ';'
		//	| name+=QualifiedName (',' name+=QualifiedName)* ('from' importedNamespace=QualifiedName)? ';');
		@Override public ParserRule getRule() { return rule; }
		
		//'import' (star=MULT 'from' importedNamespace=QualifiedName ';' | name+=QualifiedName (',' name+=QualifiedName)* ('from'
		//importedNamespace=QualifiedName)? ';')
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//star=MULT 'from' importedNamespace=QualifiedName ';' | name+=QualifiedName (',' name+=QualifiedName)* ('from'
		//importedNamespace=QualifiedName)? ';'
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//star=MULT 'from' importedNamespace=QualifiedName ';'
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//star=MULT
		public Assignment getStarAssignment_1_0_0() { return cStarAssignment_1_0_0; }
		
		//MULT
		public RuleCall getStarMULTTerminalRuleCall_1_0_0_0() { return cStarMULTTerminalRuleCall_1_0_0_0; }
		
		//'from'
		public Keyword getFromKeyword_1_0_1() { return cFromKeyword_1_0_1; }
		
		//importedNamespace=QualifiedName
		public Assignment getImportedNamespaceAssignment_1_0_2() { return cImportedNamespaceAssignment_1_0_2; }
		
		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_1_0_2_0() { return cImportedNamespaceQualifiedNameParserRuleCall_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_0_3() { return cSemicolonKeyword_1_0_3; }
		
		//name+=QualifiedName (',' name+=QualifiedName)* ('from' importedNamespace=QualifiedName)? ';'
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//name+=QualifiedName
		public Assignment getNameAssignment_1_1_0() { return cNameAssignment_1_1_0; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_1_0_0() { return cNameQualifiedNameParserRuleCall_1_1_0_0; }
		
		//(',' name+=QualifiedName)*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_1_0() { return cCommaKeyword_1_1_1_0; }
		
		//name+=QualifiedName
		public Assignment getNameAssignment_1_1_1_1() { return cNameAssignment_1_1_1_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_1_1_1_0() { return cNameQualifiedNameParserRuleCall_1_1_1_1_0; }
		
		//('from' importedNamespace=QualifiedName)?
		public Group getGroup_1_1_2() { return cGroup_1_1_2; }
		
		//'from'
		public Keyword getFromKeyword_1_1_2_0() { return cFromKeyword_1_1_2_0; }
		
		//importedNamespace=QualifiedName
		public Assignment getImportedNamespaceAssignment_1_1_2_1() { return cImportedNamespaceAssignment_1_1_2_1; }
		
		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_1_1_2_1_0() { return cImportedNamespaceQualifiedNameParserRuleCall_1_1_2_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_1_3() { return cSemicolonKeyword_1_1_3; }
	}
	public class DeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Decl");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataType_declParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFunction_declParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPar_function_declParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTypesyn_declParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cException_declParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cInterface_declParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cClass_declParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cTrait_declParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		////Declaration
		//Decl:
		//	DataType_decl
		//	| Function_decl
		//	| Par_function_decl
		//	| Typesyn_decl
		//	| Exception_decl
		//	| Interface_decl
		//	| Class_decl
		//	| Trait_decl;
		@Override public ParserRule getRule() { return rule; }
		
		//DataType_decl | Function_decl | Par_function_decl | Typesyn_decl | Exception_decl | Interface_decl | Class_decl |
		//Trait_decl
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataType_decl
		public RuleCall getDataType_declParserRuleCall_0() { return cDataType_declParserRuleCall_0; }
		
		//Function_decl
		public RuleCall getFunction_declParserRuleCall_1() { return cFunction_declParserRuleCall_1; }
		
		//Par_function_decl
		public RuleCall getPar_function_declParserRuleCall_2() { return cPar_function_declParserRuleCall_2; }
		
		//Typesyn_decl
		public RuleCall getTypesyn_declParserRuleCall_3() { return cTypesyn_declParserRuleCall_3; }
		
		//Exception_decl
		public RuleCall getException_declParserRuleCall_4() { return cException_declParserRuleCall_4; }
		
		//Interface_decl
		public RuleCall getInterface_declParserRuleCall_5() { return cInterface_declParserRuleCall_5; }
		
		//Class_decl
		public RuleCall getClass_declParserRuleCall_6() { return cClass_declParserRuleCall_6; }
		
		//Trait_decl
		public RuleCall getTrait_declParserRuleCall_7() { return cTrait_declParserRuleCall_7; }
	}
	public class Par_function_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Par_function_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cType_useAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cType_useType_useParserRuleCall_1_0 = (RuleCall)cType_useAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cLTTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Assignment cPAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPIDTerminalRuleCall_3_1_0 = (RuleCall)cPAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cPAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cPIDTerminalRuleCall_3_2_1_0 = (RuleCall)cPAssignment_3_2_1.eContents().get(0);
		private final RuleCall cGTTerminalRuleCall_3_3 = (RuleCall)cGroup_3.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFunctionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFunctionsFunction_name_listParserRuleCall_5_0 = (RuleCall)cFunctionsAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cParamsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cParamsParam_listParserRuleCall_7_0 = (RuleCall)cParamsAssignment_7.eContents().get(0);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cEAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cEPure_expParserRuleCall_9_0 = (RuleCall)cEAssignment_9.eContents().get(0);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		////Par Function Declaration
		//Par_function_decl: //annotation+=Annotation 
		//	'def' type_use=Type_use name=ID (LT p+=ID (',' p+=ID)* GT)? '(' functions=Function_name_list ')' params=Param_list '='
		//	e=Pure_exp ';';
		@Override public ParserRule getRule() { return rule; }
		
		////annotation+=Annotation 
		//'def' type_use=Type_use name=ID (LT p+=ID (',' p+=ID)* GT)? '(' functions=Function_name_list ')' params=Param_list '='
		//e=Pure_exp ';'
		public Group getGroup() { return cGroup; }
		
		////annotation+=Annotation 
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//type_use=Type_use
		public Assignment getType_useAssignment_1() { return cType_useAssignment_1; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_1_0() { return cType_useType_useParserRuleCall_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//(LT p+=ID (',' p+=ID)* GT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_3_0() { return cLTTerminalRuleCall_3_0; }
		
		//p+=ID
		public Assignment getPAssignment_3_1() { return cPAssignment_3_1; }
		
		//ID
		public RuleCall getPIDTerminalRuleCall_3_1_0() { return cPIDTerminalRuleCall_3_1_0; }
		
		//(',' p+=ID)*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//p+=ID
		public Assignment getPAssignment_3_2_1() { return cPAssignment_3_2_1; }
		
		//ID
		public RuleCall getPIDTerminalRuleCall_3_2_1_0() { return cPIDTerminalRuleCall_3_2_1_0; }
		
		//GT
		public RuleCall getGTTerminalRuleCall_3_3() { return cGTTerminalRuleCall_3_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//functions=Function_name_list
		public Assignment getFunctionsAssignment_5() { return cFunctionsAssignment_5; }
		
		//Function_name_list
		public RuleCall getFunctionsFunction_name_listParserRuleCall_5_0() { return cFunctionsFunction_name_listParserRuleCall_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//params=Param_list
		public Assignment getParamsAssignment_7() { return cParamsAssignment_7; }
		
		//Param_list
		public RuleCall getParamsParam_listParserRuleCall_7_0() { return cParamsParam_listParserRuleCall_7_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }
		
		//e=Pure_exp
		public Assignment getEAssignment_9() { return cEAssignment_9; }
		
		//Pure_exp
		public RuleCall getEPure_expParserRuleCall_9_0() { return cEPure_expParserRuleCall_9_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	public class Function_name_listElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Function_name_list");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFunction_name_listAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cFunction_name_declAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cFunction_name_declFunction_name_declParserRuleCall_1_0_0 = (RuleCall)cFunction_name_declAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cFunction_name_declAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cFunction_name_declFunction_name_declParserRuleCall_1_1_1_0 = (RuleCall)cFunction_name_declAssignment_1_1_1.eContents().get(0);
		
		////Function Name List
		//Function_name_list:
		//	{Function_name_list} (function_name_decl+=Function_name_decl (',' function_name_decl+=Function_name_decl)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Function_name_list} (function_name_decl+=Function_name_decl (',' function_name_decl+=Function_name_decl)*)?
		public Group getGroup() { return cGroup; }
		
		//{Function_name_list}
		public Action getFunction_name_listAction_0() { return cFunction_name_listAction_0; }
		
		//(function_name_decl+=Function_name_decl (',' function_name_decl+=Function_name_decl)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//function_name_decl+=Function_name_decl
		public Assignment getFunction_name_declAssignment_1_0() { return cFunction_name_declAssignment_1_0; }
		
		//Function_name_decl
		public RuleCall getFunction_name_declFunction_name_declParserRuleCall_1_0_0() { return cFunction_name_declFunction_name_declParserRuleCall_1_0_0; }
		
		//(',' function_name_decl+=Function_name_decl)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//function_name_decl+=Function_name_decl
		public Assignment getFunction_name_declAssignment_1_1_1() { return cFunction_name_declAssignment_1_1_1; }
		
		//Function_name_decl
		public RuleCall getFunction_name_declFunction_name_declParserRuleCall_1_1_1_0() { return cFunction_name_declFunction_name_declParserRuleCall_1_1_1_0; }
	}
	public class Function_name_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Function_name_decl");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		////Function Name Declaration
		//Function_name_decl:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class DataType_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.DataType_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cLTTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cPAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPIDTerminalRuleCall_2_1_0 = (RuleCall)cPAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cPAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cPIDTerminalRuleCall_2_2_1_0 = (RuleCall)cPAssignment_2_2_1.eContents().get(0);
		private final RuleCall cGTTerminalRuleCall_2_3 = (RuleCall)cGroup_2.eContents().get(3);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cData_constructorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cData_constructorData_constructorParserRuleCall_3_1_0 = (RuleCall)cData_constructorAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cVerticalLineKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cData_constructorAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cData_constructorData_constructorParserRuleCall_3_2_1_0 = (RuleCall)cData_constructorAssignment_3_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		////DataType_decl
		//DataType_decl: //annotations=Annotations 
		//	'data' name=ID (LT p+=ID (',' p+=ID)* GT)? ('=' data_constructor+=Data_constructor ('|'
		//	data_constructor+=Data_constructor)*)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//'data' name=ID (LT p+=ID (',' p+=ID)* GT)? ('=' data_constructor+=Data_constructor ('|'
		//data_constructor+=Data_constructor)*)? ';'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//'data'
		public Keyword getDataKeyword_0() { return cDataKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(LT p+=ID (',' p+=ID)* GT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_2_0() { return cLTTerminalRuleCall_2_0; }
		
		//p+=ID
		public Assignment getPAssignment_2_1() { return cPAssignment_2_1; }
		
		//ID
		public RuleCall getPIDTerminalRuleCall_2_1_0() { return cPIDTerminalRuleCall_2_1_0; }
		
		//(',' p+=ID)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//p+=ID
		public Assignment getPAssignment_2_2_1() { return cPAssignment_2_2_1; }
		
		//ID
		public RuleCall getPIDTerminalRuleCall_2_2_1_0() { return cPIDTerminalRuleCall_2_2_1_0; }
		
		//GT
		public RuleCall getGTTerminalRuleCall_2_3() { return cGTTerminalRuleCall_2_3; }
		
		//('=' data_constructor+=Data_constructor ('|' data_constructor+=Data_constructor)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0() { return cEqualsSignKeyword_3_0; }
		
		//data_constructor+=Data_constructor
		public Assignment getData_constructorAssignment_3_1() { return cData_constructorAssignment_3_1; }
		
		//Data_constructor
		public RuleCall getData_constructorData_constructorParserRuleCall_3_1_0() { return cData_constructorData_constructorParserRuleCall_3_1_0; }
		
		//('|' data_constructor+=Data_constructor)*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'|'
		public Keyword getVerticalLineKeyword_3_2_0() { return cVerticalLineKeyword_3_2_0; }
		
		//data_constructor+=Data_constructor
		public Assignment getData_constructorAssignment_3_2_1() { return cData_constructorAssignment_3_2_1; }
		
		//Data_constructor
		public RuleCall getData_constructorData_constructorParserRuleCall_3_2_1_0() { return cData_constructorData_constructorParserRuleCall_3_2_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class Data_constructorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Data_constructor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cData_constructor_argAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cData_constructor_argData_constructor_argParserRuleCall_1_1_0 = (RuleCall)cData_constructor_argAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cData_constructor_argAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cData_constructor_argData_constructor_argParserRuleCall_1_2_1_0 = (RuleCall)cData_constructor_argAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		////Data Constructor 
		//Data_constructor:
		//	name=ID ('('
		//	data_constructor_arg+=Data_constructor_arg (',' data_constructor_arg+=Data_constructor_arg)*
		//	')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('(' data_constructor_arg+=Data_constructor_arg (',' data_constructor_arg+=Data_constructor_arg)* ')')?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('(' data_constructor_arg+=Data_constructor_arg (',' data_constructor_arg+=Data_constructor_arg)* ')')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//data_constructor_arg+=Data_constructor_arg
		public Assignment getData_constructor_argAssignment_1_1() { return cData_constructor_argAssignment_1_1; }
		
		//Data_constructor_arg
		public RuleCall getData_constructor_argData_constructor_argParserRuleCall_1_1_0() { return cData_constructor_argData_constructor_argParserRuleCall_1_1_0; }
		
		//(',' data_constructor_arg+=Data_constructor_arg)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//data_constructor_arg+=Data_constructor_arg
		public Assignment getData_constructor_argAssignment_1_2_1() { return cData_constructor_argAssignment_1_2_1; }
		
		//Data_constructor_arg
		public RuleCall getData_constructor_argData_constructor_argParserRuleCall_1_2_1_0() { return cData_constructor_argData_constructor_argParserRuleCall_1_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
	}
	public class Data_constructor_argElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Data_constructor_arg");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cType_useParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		////Data Constructor Argument
		//Data_constructor_arg:
		//	Type_use ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//Type_use ID?
		public Group getGroup() { return cGroup; }
		
		//Type_use
		public RuleCall getType_useParserRuleCall_0() { return cType_useParserRuleCall_0; }
		
		//ID?
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class AnnotationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Annotations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAnnotationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAnnotationAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAnnotationAnnotationParserRuleCall_1_1_0 = (RuleCall)cAnnotationAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cAnnotationAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cAnnotationAnnotationParserRuleCall_1_2_1_0 = (RuleCall)cAnnotationAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		////Annotations
		//Annotations:
		//	{Annotations} ('[' annotation+=Annotation (',' annotation+=Annotation)* ']')*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Annotations} ('[' annotation+=Annotation (',' annotation+=Annotation)* ']')*
		public Group getGroup() { return cGroup; }
		
		//{Annotations}
		public Action getAnnotationsAction_0() { return cAnnotationsAction_0; }
		
		//('[' annotation+=Annotation (',' annotation+=Annotation)* ']')*
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//annotation+=Annotation
		public Assignment getAnnotationAssignment_1_1() { return cAnnotationAssignment_1_1; }
		
		//Annotation
		public RuleCall getAnnotationAnnotationParserRuleCall_1_1_0() { return cAnnotationAnnotationParserRuleCall_1_1_0; }
		
		//(',' annotation+=Annotation)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//annotation+=Annotation
		public Assignment getAnnotationAssignment_1_2_1() { return cAnnotationAssignment_1_2_1; }
		
		//Annotation
		public RuleCall getAnnotationAnnotationParserRuleCall_1_2_1_0() { return cAnnotationAnnotationParserRuleCall_1_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_3() { return cRightSquareBracketKeyword_1_3; }
	}
	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cType_useParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cPure_expAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPure_expPure_expParserRuleCall_1_0 = (RuleCall)cPure_expAssignment_1.eContents().get(0);
		
		////Annotation
		//Annotation:
		//	(Type_use ':')? pure_exp=Pure_exp;
		@Override public ParserRule getRule() { return rule; }
		
		//(Type_use ':')? pure_exp=Pure_exp
		public Group getGroup() { return cGroup; }
		
		//(Type_use ':')?
		public Group getGroup_0() { return cGroup_0; }
		
		//Type_use
		public RuleCall getType_useParserRuleCall_0_0() { return cType_useParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//pure_exp=Pure_exp
		public Assignment getPure_expAssignment_1() { return cPure_expAssignment_1; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_1_0() { return cPure_expPure_expParserRuleCall_1_0; }
	}
	public class Type_useElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Type_use");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cType_useAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cType_useType_useParserRuleCall_1_1_0 = (RuleCall)cType_useAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cType_useAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cType_useType_useParserRuleCall_1_2_1_0 = (RuleCall)cType_useAssignment_1_2_1.eContents().get(0);
		private final RuleCall cGTTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		
		////Type_use (Check may have error, removed annotations from starting)
		//Type_use:
		//	name=QualifiedName (LT type_use+=Type_use (',' type_use+=Type_use)* GT)?;
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//name=QualifiedName (LT type_use+=Type_use (',' type_use+=Type_use)* GT)?
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//name=QualifiedName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0() { return cNameQualifiedNameParserRuleCall_0_0; }
		
		//(LT type_use+=Type_use (',' type_use+=Type_use)* GT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_1_0() { return cLTTerminalRuleCall_1_0; }
		
		//type_use+=Type_use
		public Assignment getType_useAssignment_1_1() { return cType_useAssignment_1_1; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_1_1_0() { return cType_useType_useParserRuleCall_1_1_0; }
		
		//(',' type_use+=Type_use)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//type_use+=Type_use
		public Assignment getType_useAssignment_1_2_1() { return cType_useAssignment_1_2_1; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_1_2_1_0() { return cType_useType_useParserRuleCall_1_2_1_0; }
		
		//GT
		public RuleCall getGTTerminalRuleCall_1_3() { return cGTTerminalRuleCall_1_3; }
	}
	public class Pure_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Pure_exp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cPure_exp_listAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cPure_exp_listPure_exp_listParserRuleCall_0_2_0 = (RuleCall)cPure_exp_listAssignment_0_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cFunction_listAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cFunction_listFunction_listParserRuleCall_1_2_0 = (RuleCall)cFunction_listAssignment_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		private final Assignment cPartial_function_pure_exp_listAssignment_1_5 = (Assignment)cGroup_1.eContents().get(5);
		private final RuleCall cPartial_function_pure_exp_listPure_exp_listParserRuleCall_1_5_0 = (RuleCall)cPartial_function_pure_exp_listAssignment_1_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_6 = (Keyword)cGroup_1.eContents().get(6);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cQualifiedNameParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cVariadic_exp_listAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cVariadic_exp_listPure_exp_listParserRuleCall_2_2_0 = (RuleCall)cVariadic_exp_listAssignment_2_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final RuleCall cOr_exprParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cIfKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cIfAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cIfPure_expParserRuleCall_4_1_0 = (RuleCall)cIfAssignment_4_1.eContents().get(0);
		private final Keyword cThenKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cThenAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final RuleCall cThenPure_expParserRuleCall_4_3_0 = (RuleCall)cThenAssignment_4_3.eContents().get(0);
		private final Group cGroup_4_4 = (Group)cGroup_4.eContents().get(4);
		private final Keyword cElseKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Assignment cElseAssignment_4_4_1 = (Assignment)cGroup_4_4.eContents().get(1);
		private final RuleCall cElsePure_expParserRuleCall_4_4_1_0 = (RuleCall)cElseAssignment_4_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cCaseKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCaseAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cCasePure_expParserRuleCall_5_1_0 = (RuleCall)cCaseAssignment_5_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Assignment cCasebranchAssignment_5_3 = (Assignment)cGroup_5.eContents().get(3);
		private final RuleCall cCasebranchCase_branchParserRuleCall_5_3_0 = (RuleCall)cCasebranchAssignment_5_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cLetKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cType_useAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cType_useType_useParserRuleCall_6_2_0 = (RuleCall)cType_useAssignment_6_2.eContents().get(0);
		private final Assignment cValueAssignment_6_3 = (Assignment)cGroup_6.eContents().get(3);
		private final RuleCall cValueIDTerminalRuleCall_6_3_0 = (RuleCall)cValueAssignment_6_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cEqualsSignKeyword_6_5 = (Keyword)cGroup_6.eContents().get(5);
		private final Assignment cIAssignment_6_6 = (Assignment)cGroup_6.eContents().get(6);
		private final RuleCall cIPure_expParserRuleCall_6_6_0 = (RuleCall)cIAssignment_6_6.eContents().get(0);
		private final Keyword cInKeyword_6_7 = (Keyword)cGroup_6.eContents().get(7);
		private final Assignment cBAssignment_6_8 = (Assignment)cGroup_6.eContents().get(8);
		private final RuleCall cBPure_expParserRuleCall_6_8_0 = (RuleCall)cBAssignment_6_8.eContents().get(0);
		
		////Pure_exp
		//Pure_exp:
		//	QualifiedName '(' pure_exp_list=Pure_exp_list ')'
		//	| QualifiedName '(' function_list+=Function_list ')' '(' partial_function_pure_exp_list=Pure_exp_list ')'
		//	| QualifiedName '[' variadic_exp_list=Pure_exp_list ']'
		//	| Or_expr
		//	| 'if' if=Pure_exp 'then' then=Pure_exp (=> 'else' else=Pure_exp)?
		//	| 'case' case=Pure_exp '{' casebranch+=Case_branch* '}'
		//	| 'let' '(' type_use=Type_use value=ID ')' '=' i=Pure_exp 'in' b=Pure_exp
		//	//|{Pure_exp}STRING
		//	//|var_or_field_ref=[Var_or_field_ref|ID]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '(' pure_exp_list=Pure_exp_list ')' | QualifiedName '(' function_list+=Function_list ')' '('
		//partial_function_pure_exp_list=Pure_exp_list ')' | QualifiedName '[' variadic_exp_list=Pure_exp_list ']' | Or_expr |
		//'if' if=Pure_exp 'then' then=Pure_exp (=> 'else' else=Pure_exp)? | 'case' case=Pure_exp '{' casebranch+=Case_branch*
		//'}' | 'let' '(' type_use=Type_use value=ID ')' '=' i=Pure_exp 'in' b=Pure_exp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//QualifiedName '(' pure_exp_list=Pure_exp_list ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0_0() { return cQualifiedNameParserRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }
		
		//pure_exp_list=Pure_exp_list
		public Assignment getPure_exp_listAssignment_0_2() { return cPure_exp_listAssignment_0_2; }
		
		//Pure_exp_list
		public RuleCall getPure_exp_listPure_exp_listParserRuleCall_0_2_0() { return cPure_exp_listPure_exp_listParserRuleCall_0_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }
		
		//QualifiedName '(' function_list+=Function_list ')' '(' partial_function_pure_exp_list=Pure_exp_list ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_1_0() { return cQualifiedNameParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//function_list+=Function_list
		public Assignment getFunction_listAssignment_1_2() { return cFunction_listAssignment_1_2; }
		
		//Function_list
		public RuleCall getFunction_listFunction_listParserRuleCall_1_2_0() { return cFunction_listFunction_listParserRuleCall_1_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_4() { return cLeftParenthesisKeyword_1_4; }
		
		//partial_function_pure_exp_list=Pure_exp_list
		public Assignment getPartial_function_pure_exp_listAssignment_1_5() { return cPartial_function_pure_exp_listAssignment_1_5; }
		
		//Pure_exp_list
		public RuleCall getPartial_function_pure_exp_listPure_exp_listParserRuleCall_1_5_0() { return cPartial_function_pure_exp_listPure_exp_listParserRuleCall_1_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_6() { return cRightParenthesisKeyword_1_6; }
		
		//QualifiedName '[' variadic_exp_list=Pure_exp_list ']'
		public Group getGroup_2() { return cGroup_2; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_2_0() { return cQualifiedNameParserRuleCall_2_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2_1() { return cLeftSquareBracketKeyword_2_1; }
		
		//variadic_exp_list=Pure_exp_list
		public Assignment getVariadic_exp_listAssignment_2_2() { return cVariadic_exp_listAssignment_2_2; }
		
		//Pure_exp_list
		public RuleCall getVariadic_exp_listPure_exp_listParserRuleCall_2_2_0() { return cVariadic_exp_listPure_exp_listParserRuleCall_2_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_3() { return cRightSquareBracketKeyword_2_3; }
		
		//Or_expr
		public RuleCall getOr_exprParserRuleCall_3() { return cOr_exprParserRuleCall_3; }
		
		//'if' if=Pure_exp 'then' then=Pure_exp (=> 'else' else=Pure_exp)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'if'
		public Keyword getIfKeyword_4_0() { return cIfKeyword_4_0; }
		
		//if=Pure_exp
		public Assignment getIfAssignment_4_1() { return cIfAssignment_4_1; }
		
		//Pure_exp
		public RuleCall getIfPure_expParserRuleCall_4_1_0() { return cIfPure_expParserRuleCall_4_1_0; }
		
		//'then'
		public Keyword getThenKeyword_4_2() { return cThenKeyword_4_2; }
		
		//then=Pure_exp
		public Assignment getThenAssignment_4_3() { return cThenAssignment_4_3; }
		
		//Pure_exp
		public RuleCall getThenPure_expParserRuleCall_4_3_0() { return cThenPure_expParserRuleCall_4_3_0; }
		
		//(=> 'else' else=Pure_exp)?
		public Group getGroup_4_4() { return cGroup_4_4; }
		
		//=> 'else'
		public Keyword getElseKeyword_4_4_0() { return cElseKeyword_4_4_0; }
		
		//else=Pure_exp
		public Assignment getElseAssignment_4_4_1() { return cElseAssignment_4_4_1; }
		
		//Pure_exp
		public RuleCall getElsePure_expParserRuleCall_4_4_1_0() { return cElsePure_expParserRuleCall_4_4_1_0; }
		
		//'case' case=Pure_exp '{' casebranch+=Case_branch* '}'
		public Group getGroup_5() { return cGroup_5; }
		
		//'case'
		public Keyword getCaseKeyword_5_0() { return cCaseKeyword_5_0; }
		
		//case=Pure_exp
		public Assignment getCaseAssignment_5_1() { return cCaseAssignment_5_1; }
		
		//Pure_exp
		public RuleCall getCasePure_expParserRuleCall_5_1_0() { return cCasePure_expParserRuleCall_5_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_2() { return cLeftCurlyBracketKeyword_5_2; }
		
		//casebranch+=Case_branch*
		public Assignment getCasebranchAssignment_5_3() { return cCasebranchAssignment_5_3; }
		
		//Case_branch
		public RuleCall getCasebranchCase_branchParserRuleCall_5_3_0() { return cCasebranchCase_branchParserRuleCall_5_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//'let' '(' type_use=Type_use value=ID ')' '=' i=Pure_exp 'in' b=Pure_exp
		public Group getGroup_6() { return cGroup_6; }
		
		//'let'
		public Keyword getLetKeyword_6_0() { return cLetKeyword_6_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6_1() { return cLeftParenthesisKeyword_6_1; }
		
		//type_use=Type_use
		public Assignment getType_useAssignment_6_2() { return cType_useAssignment_6_2; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_6_2_0() { return cType_useType_useParserRuleCall_6_2_0; }
		
		//value=ID
		public Assignment getValueAssignment_6_3() { return cValueAssignment_6_3; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_6_3_0() { return cValueIDTerminalRuleCall_6_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6_4() { return cRightParenthesisKeyword_6_4; }
		
		//'='
		public Keyword getEqualsSignKeyword_6_5() { return cEqualsSignKeyword_6_5; }
		
		//i=Pure_exp
		public Assignment getIAssignment_6_6() { return cIAssignment_6_6; }
		
		//Pure_exp
		public RuleCall getIPure_expParserRuleCall_6_6_0() { return cIPure_expParserRuleCall_6_6_0; }
		
		//'in'
		public Keyword getInKeyword_6_7() { return cInKeyword_6_7; }
		
		//b=Pure_exp
		public Assignment getBAssignment_6_8() { return cBAssignment_6_8; }
		
		//Pure_exp
		public RuleCall getBPure_expParserRuleCall_6_8_0() { return cBPure_expParserRuleCall_6_8_0; }
	}
	public class Or_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Or_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAnd_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOr_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpORORTerminalRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAnd_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////Or_expr
		//Or_expr Pure_exp:
		//	And_expr ({Or_expr.left=current} op=OROR right=And_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//And_expr ({Or_expr.left=current} op=OROR right=And_expr)*
		public Group getGroup() { return cGroup; }
		
		//And_expr
		public RuleCall getAnd_exprParserRuleCall_0() { return cAnd_exprParserRuleCall_0; }
		
		//({Or_expr.left=current} op=OROR right=And_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Or_expr.left=current}
		public Action getOr_exprLeftAction_1_0() { return cOr_exprLeftAction_1_0; }
		
		//op=OROR
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//OROR
		public RuleCall getOpORORTerminalRuleCall_1_1_0() { return cOpORORTerminalRuleCall_1_1_0; }
		
		//right=And_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//And_expr
		public RuleCall getRightAnd_exprParserRuleCall_1_2_0() { return cRightAnd_exprParserRuleCall_1_2_0; }
	}
	public class And_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.And_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEquality_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAnd_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpANDANDTerminalRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightEquality_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////And_expr
		//And_expr Pure_exp:
		//	Equality_expr ({And_expr.left=current} op=ANDAND right=Equality_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Equality_expr ({And_expr.left=current} op=ANDAND right=Equality_expr)*
		public Group getGroup() { return cGroup; }
		
		//Equality_expr
		public RuleCall getEquality_exprParserRuleCall_0() { return cEquality_exprParserRuleCall_0; }
		
		//({And_expr.left=current} op=ANDAND right=Equality_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{And_expr.left=current}
		public Action getAnd_exprLeftAction_1_0() { return cAnd_exprLeftAction_1_0; }
		
		//op=ANDAND
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//ANDAND
		public RuleCall getOpANDANDTerminalRuleCall_1_1_0() { return cOpANDANDTerminalRuleCall_1_1_0; }
		
		//right=Equality_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Equality_expr
		public RuleCall getRightEquality_exprParserRuleCall_1_2_0() { return cRightEquality_exprParserRuleCall_1_2_0; }
	}
	public class Equality_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Equality_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cComparison_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cEquality_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpEQEQTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpNOTEQTerminalRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightComparison_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////Equality_expr
		//Equality_expr Pure_exp:
		//	Comparison_expr ({Equality_expr.left=current} op=(EQEQ | NOTEQ) right=Comparison_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Comparison_expr ({Equality_expr.left=current} op=(EQEQ | NOTEQ) right=Comparison_expr)*
		public Group getGroup() { return cGroup; }
		
		//Comparison_expr
		public RuleCall getComparison_exprParserRuleCall_0() { return cComparison_exprParserRuleCall_0; }
		
		//({Equality_expr.left=current} op=(EQEQ | NOTEQ) right=Comparison_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Equality_expr.left=current}
		public Action getEquality_exprLeftAction_1_0() { return cEquality_exprLeftAction_1_0; }
		
		//op=(EQEQ | NOTEQ)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(EQEQ | NOTEQ)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//EQEQ
		public RuleCall getOpEQEQTerminalRuleCall_1_1_0_0() { return cOpEQEQTerminalRuleCall_1_1_0_0; }
		
		//NOTEQ
		public RuleCall getOpNOTEQTerminalRuleCall_1_1_0_1() { return cOpNOTEQTerminalRuleCall_1_1_0_1; }
		
		//right=Comparison_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Comparison_expr
		public RuleCall getRightComparison_exprParserRuleCall_1_2_0() { return cRightComparison_exprParserRuleCall_1_2_0; }
	}
	public class Comparison_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Comparison_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPlusOrMinus_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cComparison_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpLTTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpGTTerminalRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cOpLTEQTerminalRuleCall_1_1_0_2 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(2);
		private final RuleCall cOpGTEQTerminalRuleCall_1_1_0_3 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(3);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPlusOrMinus_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////Comparison_expr
		//Comparison_expr Pure_exp:
		//	PlusOrMinus_expr ({Comparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=PlusOrMinus_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusOrMinus_expr ({Comparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=PlusOrMinus_expr)*
		public Group getGroup() { return cGroup; }
		
		//PlusOrMinus_expr
		public RuleCall getPlusOrMinus_exprParserRuleCall_0() { return cPlusOrMinus_exprParserRuleCall_0; }
		
		//({Comparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=PlusOrMinus_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Comparison_expr.left=current}
		public Action getComparison_exprLeftAction_1_0() { return cComparison_exprLeftAction_1_0; }
		
		//op=(LT | GT | LTEQ | GTEQ)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(LT | GT | LTEQ | GTEQ)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//LT
		public RuleCall getOpLTTerminalRuleCall_1_1_0_0() { return cOpLTTerminalRuleCall_1_1_0_0; }
		
		//GT
		public RuleCall getOpGTTerminalRuleCall_1_1_0_1() { return cOpGTTerminalRuleCall_1_1_0_1; }
		
		//LTEQ
		public RuleCall getOpLTEQTerminalRuleCall_1_1_0_2() { return cOpLTEQTerminalRuleCall_1_1_0_2; }
		
		//GTEQ
		public RuleCall getOpGTEQTerminalRuleCall_1_1_0_3() { return cOpGTEQTerminalRuleCall_1_1_0_3; }
		
		//right=PlusOrMinus_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//PlusOrMinus_expr
		public RuleCall getRightPlusOrMinus_exprParserRuleCall_1_2_0() { return cRightPlusOrMinus_exprParserRuleCall_1_2_0; }
	}
	public class PlusOrMinus_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.PlusOrMinus_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMulDivOrMod_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cPlusOrMinus_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpPLUSTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpMINUSTerminalRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMulDivOrMod_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////PlusOrMinus
		//PlusOrMinus_expr Pure_exp:
		//	MulDivOrMod_expr ({PlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MulDivOrMod_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MulDivOrMod_expr ({PlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MulDivOrMod_expr)*
		public Group getGroup() { return cGroup; }
		
		//MulDivOrMod_expr
		public RuleCall getMulDivOrMod_exprParserRuleCall_0() { return cMulDivOrMod_exprParserRuleCall_0; }
		
		//({PlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MulDivOrMod_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{PlusOrMinus_expr.left=current}
		public Action getPlusOrMinus_exprLeftAction_1_0() { return cPlusOrMinus_exprLeftAction_1_0; }
		
		//op=(PLUS | MINUS)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(PLUS | MINUS)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//PLUS
		public RuleCall getOpPLUSTerminalRuleCall_1_1_0_0() { return cOpPLUSTerminalRuleCall_1_1_0_0; }
		
		//MINUS
		public RuleCall getOpMINUSTerminalRuleCall_1_1_0_1() { return cOpMINUSTerminalRuleCall_1_1_0_1; }
		
		//right=MulDivOrMod_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MulDivOrMod_expr
		public RuleCall getRightMulDivOrMod_exprParserRuleCall_1_2_0() { return cRightMulDivOrMod_exprParserRuleCall_1_2_0; }
	}
	public class MulDivOrMod_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MulDivOrMod_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimary_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMulDivOrMod_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpMULTTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpSolidusKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cOpMODTerminalRuleCall_1_1_0_2 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(2);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightUniary_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////MulDivOrMod_expr
		//MulDivOrMod_expr Pure_exp:
		//	Primary_expr ({MulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=Uniary_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary_expr ({MulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=Uniary_expr)*
		public Group getGroup() { return cGroup; }
		
		//Primary_expr
		public RuleCall getPrimary_exprParserRuleCall_0() { return cPrimary_exprParserRuleCall_0; }
		
		//({MulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=Uniary_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MulDivOrMod_expr.left=current}
		public Action getMulDivOrMod_exprLeftAction_1_0() { return cMulDivOrMod_exprLeftAction_1_0; }
		
		//op=(MULT | '/' | MOD)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(MULT | '/' | MOD)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//MULT
		public RuleCall getOpMULTTerminalRuleCall_1_1_0_0() { return cOpMULTTerminalRuleCall_1_1_0_0; }
		
		//'/'
		public Keyword getOpSolidusKeyword_1_1_0_1() { return cOpSolidusKeyword_1_1_0_1; }
		
		//MOD
		public RuleCall getOpMODTerminalRuleCall_1_1_0_2() { return cOpMODTerminalRuleCall_1_1_0_2; }
		
		//right=Uniary_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Uniary_expr
		public RuleCall getRightUniary_exprParserRuleCall_1_2_0() { return cRightUniary_exprParserRuleCall_1_2_0; }
	}
	public class Uniary_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Uniary_expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cOpAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Alternatives cOpAlternatives_0_0_0 = (Alternatives)cOpAssignment_0_0.eContents().get(0);
		private final RuleCall cOpNEGATIONTerminalRuleCall_0_0_0_0 = (RuleCall)cOpAlternatives_0_0_0.eContents().get(0);
		private final RuleCall cOpNEGATION_CREOLTerminalRuleCall_0_0_0_1 = (RuleCall)cOpAlternatives_0_0_0.eContents().get(1);
		private final RuleCall cOpMINUSTerminalRuleCall_0_0_0_2 = (RuleCall)cOpAlternatives_0_0_0.eContents().get(2);
		private final Assignment cPure_expAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cPure_expPure_expParserRuleCall_0_1_0 = (RuleCall)cPure_expAssignment_0_1.eContents().get(0);
		private final RuleCall cPrimary_exprParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Uniary_expr Pure_exp:
		//	op=(NEGATION | NEGATION_CREOL | MINUS) pure_exp=Pure_exp | Primary_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(NEGATION | NEGATION_CREOL | MINUS) pure_exp=Pure_exp | Primary_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//op=(NEGATION | NEGATION_CREOL | MINUS) pure_exp=Pure_exp
		public Group getGroup_0() { return cGroup_0; }
		
		//op=(NEGATION | NEGATION_CREOL | MINUS)
		public Assignment getOpAssignment_0_0() { return cOpAssignment_0_0; }
		
		//(NEGATION | NEGATION_CREOL | MINUS)
		public Alternatives getOpAlternatives_0_0_0() { return cOpAlternatives_0_0_0; }
		
		//NEGATION
		public RuleCall getOpNEGATIONTerminalRuleCall_0_0_0_0() { return cOpNEGATIONTerminalRuleCall_0_0_0_0; }
		
		//NEGATION_CREOL
		public RuleCall getOpNEGATION_CREOLTerminalRuleCall_0_0_0_1() { return cOpNEGATION_CREOLTerminalRuleCall_0_0_0_1; }
		
		//MINUS
		public RuleCall getOpMINUSTerminalRuleCall_0_0_0_2() { return cOpMINUSTerminalRuleCall_0_0_0_2; }
		
		//pure_exp=Pure_exp
		public Assignment getPure_expAssignment_0_1() { return cPure_expAssignment_0_1; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_0_1_0() { return cPure_expPure_expParserRuleCall_0_1_0; }
		
		//Primary_expr
		public RuleCall getPrimary_exprParserRuleCall_1() { return cPrimary_exprParserRuleCall_1; }
	}
	public class Primary_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Primary_expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cPure_expParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cAtomic_exprParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		////Primary_expr
		//Primary_expr Pure_exp:
		//	'(' Pure_exp ')'
		//	| Atomic_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Pure_exp ')' | Atomic_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' Pure_exp ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Pure_exp
		public RuleCall getPure_expParserRuleCall_0_1() { return cPure_expParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//Atomic_expr
		public RuleCall getAtomic_exprParserRuleCall_1() { return cAtomic_exprParserRuleCall_1; }
	}
	public class Atomic_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Atomic_expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cPure_expAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cPure_expAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cSTRINGLITERALTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final RuleCall cVar_or_field_refParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cPure_expAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cThisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cPure_expAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Keyword cNullKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cPure_expAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		
		////Atomic_expr
		//Atomic_expr Pure_exp:
		//	{Pure_exp} INT
		//	| {Pure_exp} STRINGLITERAL
		//	| Var_or_field_ref
		//	| {Pure_exp} 'this'
		//	| {Pure_exp} 'null'
		//	| {Pure_exp} STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//{Pure_exp} INT | {Pure_exp} STRINGLITERAL | Var_or_field_ref | {Pure_exp} 'this' | {Pure_exp} 'null' | {Pure_exp} STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Pure_exp} INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{Pure_exp}
		public Action getPure_expAction_0_0() { return cPure_expAction_0_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//{Pure_exp} STRINGLITERAL
		public Group getGroup_1() { return cGroup_1; }
		
		//{Pure_exp}
		public Action getPure_expAction_1_0() { return cPure_expAction_1_0; }
		
		//STRINGLITERAL
		public RuleCall getSTRINGLITERALTerminalRuleCall_1_1() { return cSTRINGLITERALTerminalRuleCall_1_1; }
		
		//Var_or_field_ref
		public RuleCall getVar_or_field_refParserRuleCall_2() { return cVar_or_field_refParserRuleCall_2; }
		
		//{Pure_exp} 'this'
		public Group getGroup_3() { return cGroup_3; }
		
		//{Pure_exp}
		public Action getPure_expAction_3_0() { return cPure_expAction_3_0; }
		
		//'this'
		public Keyword getThisKeyword_3_1() { return cThisKeyword_3_1; }
		
		//{Pure_exp} 'null'
		public Group getGroup_4() { return cGroup_4; }
		
		//{Pure_exp}
		public Action getPure_expAction_4_0() { return cPure_expAction_4_0; }
		
		//'null'
		public Keyword getNullKeyword_4_1() { return cNullKeyword_4_1; }
		
		//{Pure_exp} STRING
		public Group getGroup_5() { return cGroup_5; }
		
		//{Pure_exp}
		public Action getPure_expAction_5_0() { return cPure_expAction_5_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_5_1() { return cSTRINGTerminalRuleCall_5_1; }
	}
	public class Var_or_field_refElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Var_or_field_ref");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cGroup_0.eContents().get(0);
		private final Keyword cThisKeyword_0_0_0 = (Keyword)cGroup_0_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_0_1 = (Keyword)cGroup_0_0.eContents().get(1);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final CrossReference cRefField_declCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefField_declIDTerminalRuleCall_1_0_1 = (RuleCall)cRefField_declCrossReference_1_0.eContents().get(1);
		
		//Var_or_field_ref:
		//	('this' '.')? name=ID
		//	| ref=[Field_decl];
		@Override public ParserRule getRule() { return rule; }
		
		//('this' '.')? name=ID | ref=[Field_decl]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//('this' '.')? name=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//('this' '.')?
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//'this'
		public Keyword getThisKeyword_0_0_0() { return cThisKeyword_0_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_0_1() { return cFullStopKeyword_0_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//ref=[Field_decl]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[Field_decl]
		public CrossReference getRefField_declCrossReference_1_0() { return cRefField_declCrossReference_1_0; }
		
		//ID
		public RuleCall getRefField_declIDTerminalRuleCall_1_0_1() { return cRefField_declIDTerminalRuleCall_1_0_1; }
	}
	public class Case_branchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Case_branch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPatternParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPure_expAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPure_expPure_expParserRuleCall_2_0 = (RuleCall)cPure_expAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////Case_branch
		//Case_branch:
		//	Pattern '=>' pure_exp=Pure_exp ';';
		@Override public ParserRule getRule() { return rule; }
		
		//Pattern '=>' pure_exp=Pure_exp ';'
		public Group getGroup() { return cGroup; }
		
		//Pattern
		public RuleCall getPatternParserRuleCall_0() { return cPatternParserRuleCall_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//pure_exp=Pure_exp
		public Assignment getPure_expAssignment_2() { return cPure_expAssignment_2; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_2_0() { return cPure_expPure_expParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class PatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Pattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword c_Keyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cSTRINGLITERALTerminalRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_1_3 = (RuleCall)cAlternatives_1.eContents().get(3);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final RuleCall cQualifiedNameParserRuleCall_1_4_0 = (RuleCall)cGroup_1_4.eContents().get(0);
		private final Group cGroup_1_4_1 = (Group)cGroup_1_4.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_4_1_0 = (Keyword)cGroup_1_4_1.eContents().get(0);
		private final Group cGroup_1_4_1_1 = (Group)cGroup_1_4_1.eContents().get(1);
		private final Assignment cPatternAssignment_1_4_1_1_0 = (Assignment)cGroup_1_4_1_1.eContents().get(0);
		private final RuleCall cPatternPatternParserRuleCall_1_4_1_1_0_0 = (RuleCall)cPatternAssignment_1_4_1_1_0.eContents().get(0);
		private final Group cGroup_1_4_1_1_1 = (Group)cGroup_1_4_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_4_1_1_1_0 = (Keyword)cGroup_1_4_1_1_1.eContents().get(0);
		private final Assignment cPatternAssignment_1_4_1_1_1_1 = (Assignment)cGroup_1_4_1_1_1.eContents().get(1);
		private final RuleCall cPatternPatternParserRuleCall_1_4_1_1_1_1_0 = (RuleCall)cPatternAssignment_1_4_1_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_4_1_2 = (Keyword)cGroup_1_4_1.eContents().get(2);
		
		////Pattern
		//Pattern:
		//	{Pattern} ('_'
		//	| INT
		//	| STRINGLITERAL
		//	| ID
		//	| QualifiedName ('(' (pattern+=Pattern (',' pattern+=Pattern)*)? ')'));
		@Override public ParserRule getRule() { return rule; }
		
		//{Pattern} ('_' | INT | STRINGLITERAL | ID | QualifiedName ('(' (pattern+=Pattern (',' pattern+=Pattern)*)? ')'))
		public Group getGroup() { return cGroup; }
		
		//{Pattern}
		public Action getPatternAction_0() { return cPatternAction_0; }
		
		//'_' | INT | STRINGLITERAL | ID | QualifiedName ('(' (pattern+=Pattern (',' pattern+=Pattern)*)? ')')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'_'
		public Keyword get_Keyword_1_0() { return c_Keyword_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
		
		//STRINGLITERAL
		public RuleCall getSTRINGLITERALTerminalRuleCall_1_2() { return cSTRINGLITERALTerminalRuleCall_1_2; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_3() { return cIDTerminalRuleCall_1_3; }
		
		//QualifiedName ('(' (pattern+=Pattern (',' pattern+=Pattern)*)? ')')
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_1_4_0() { return cQualifiedNameParserRuleCall_1_4_0; }
		
		//'(' (pattern+=Pattern (',' pattern+=Pattern)*)? ')'
		public Group getGroup_1_4_1() { return cGroup_1_4_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_4_1_0() { return cLeftParenthesisKeyword_1_4_1_0; }
		
		//(pattern+=Pattern (',' pattern+=Pattern)*)?
		public Group getGroup_1_4_1_1() { return cGroup_1_4_1_1; }
		
		//pattern+=Pattern
		public Assignment getPatternAssignment_1_4_1_1_0() { return cPatternAssignment_1_4_1_1_0; }
		
		//Pattern
		public RuleCall getPatternPatternParserRuleCall_1_4_1_1_0_0() { return cPatternPatternParserRuleCall_1_4_1_1_0_0; }
		
		//(',' pattern+=Pattern)*
		public Group getGroup_1_4_1_1_1() { return cGroup_1_4_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_4_1_1_1_0() { return cCommaKeyword_1_4_1_1_1_0; }
		
		//pattern+=Pattern
		public Assignment getPatternAssignment_1_4_1_1_1_1() { return cPatternAssignment_1_4_1_1_1_1; }
		
		//Pattern
		public RuleCall getPatternPatternParserRuleCall_1_4_1_1_1_1_0() { return cPatternPatternParserRuleCall_1_4_1_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_4_1_2() { return cRightParenthesisKeyword_1_4_1_2; }
	}
	public class Pure_exp_listElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Pure_exp_list");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPure_exp_listAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cPure_expAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cPure_expPure_expParserRuleCall_1_0_0 = (RuleCall)cPure_expAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cPure_expAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cPure_expPure_expParserRuleCall_1_1_1_0 = (RuleCall)cPure_expAssignment_1_1_1.eContents().get(0);
		
		////Pure_exp_list
		//Pure_exp_list:
		//	{Pure_exp_list} (pure_exp+=Pure_exp (',' pure_exp+=Pure_exp)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Pure_exp_list} (pure_exp+=Pure_exp (',' pure_exp+=Pure_exp)*)?
		public Group getGroup() { return cGroup; }
		
		//{Pure_exp_list}
		public Action getPure_exp_listAction_0() { return cPure_exp_listAction_0; }
		
		//(pure_exp+=Pure_exp (',' pure_exp+=Pure_exp)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//pure_exp+=Pure_exp
		public Assignment getPure_expAssignment_1_0() { return cPure_expAssignment_1_0; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_1_0_0() { return cPure_expPure_expParserRuleCall_1_0_0; }
		
		//(',' pure_exp+=Pure_exp)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//pure_exp+=Pure_exp
		public Assignment getPure_expAssignment_1_1_1() { return cPure_expAssignment_1_1_1; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_1_1_1_0() { return cPure_expPure_expParserRuleCall_1_1_1_0; }
	}
	public class Function_listElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Function_list");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFunction_listAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cFunction_paramAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cFunction_paramFunction_paramParserRuleCall_1_0_0 = (RuleCall)cFunction_paramAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cFunction_paramAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cFunction_paramFunction_paramParserRuleCall_1_1_1_0 = (RuleCall)cFunction_paramAssignment_1_1_1.eContents().get(0);
		
		////Function_list
		//Function_list:
		//	{Function_list} (function_param+=Function_param (',' function_param+=Function_param)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Function_list} (function_param+=Function_param (',' function_param+=Function_param)*)?
		public Group getGroup() { return cGroup; }
		
		//{Function_list}
		public Action getFunction_listAction_0() { return cFunction_listAction_0; }
		
		//(function_param+=Function_param (',' function_param+=Function_param)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//function_param+=Function_param
		public Assignment getFunction_paramAssignment_1_0() { return cFunction_paramAssignment_1_0; }
		
		//Function_param
		public RuleCall getFunction_paramFunction_paramParserRuleCall_1_0_0() { return cFunction_paramFunction_paramParserRuleCall_1_0_0; }
		
		//(',' function_param+=Function_param)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//function_param+=Function_param
		public Assignment getFunction_paramAssignment_1_1_1() { return cFunction_paramAssignment_1_1_1; }
		
		//Function_param
		public RuleCall getFunction_paramFunction_paramParserRuleCall_1_1_1_0() { return cFunction_paramFunction_paramParserRuleCall_1_1_1_0; }
	}
	public class Function_paramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Function_param");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFunction_name_param_declParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAnon_function_declParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		////Function_parameters
		//Function_param:
		//	Function_name_param_decl
		//	| Anon_function_decl;
		@Override public ParserRule getRule() { return rule; }
		
		//Function_name_param_decl | Anon_function_decl
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Function_name_param_decl
		public RuleCall getFunction_name_param_declParserRuleCall_0() { return cFunction_name_param_declParserRuleCall_0; }
		
		//Anon_function_decl
		public RuleCall getAnon_function_declParserRuleCall_1() { return cAnon_function_declParserRuleCall_1; }
	}
	public class Function_name_param_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Function_name_param_decl");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////Function_name_param_decl
		//Function_name_param_decl:
		//	value=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//value=ID
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0() { return cValueIDTerminalRuleCall_0; }
	}
	public class Anon_function_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Anon_function_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cParamsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cParamsParam_listParserRuleCall_0_0 = (RuleCall)cParamsAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPure_expAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPure_expPure_expParserRuleCall_2_0 = (RuleCall)cPure_expAssignment_2.eContents().get(0);
		
		////Anonymous_function_decl
		//Anon_function_decl:
		//	params=Param_list "=>" pure_exp=Pure_exp;
		@Override public ParserRule getRule() { return rule; }
		
		//params=Param_list "=>" pure_exp=Pure_exp
		public Group getGroup() { return cGroup; }
		
		//params=Param_list
		public Assignment getParamsAssignment_0() { return cParamsAssignment_0; }
		
		//Param_list
		public RuleCall getParamsParam_listParserRuleCall_0_0() { return cParamsParam_listParserRuleCall_0_0; }
		
		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//pure_exp=Pure_exp
		public Assignment getPure_expAssignment_2() { return cPure_expAssignment_2; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_2_0() { return cPure_expPure_expParserRuleCall_2_0; }
	}
	public class Param_listElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Param_list");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParam_listAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParam_declAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParam_declParam_declParserRuleCall_2_0_0 = (RuleCall)cParam_declAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParam_declAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParam_declParam_declParserRuleCall_2_1_1_0 = (RuleCall)cParam_declAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////Parameter_list (Check for error need reference or not)
		//Param_list:
		//	{Param_list} '(' (param_decl+=Param_decl (',' param_decl+=Param_decl)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{Param_list} '(' (param_decl+=Param_decl (',' param_decl+=Param_decl)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//{Param_list}
		public Action getParam_listAction_0() { return cParam_listAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(param_decl+=Param_decl (',' param_decl+=Param_decl)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//param_decl+=Param_decl
		public Assignment getParam_declAssignment_2_0() { return cParam_declAssignment_2_0; }
		
		//Param_decl
		public RuleCall getParam_declParam_declParserRuleCall_2_0_0() { return cParam_declParam_declParserRuleCall_2_0_0; }
		
		//(',' param_decl+=Param_decl)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//param_decl+=Param_decl
		public Assignment getParam_declAssignment_2_1_1() { return cParam_declAssignment_2_1_1; }
		
		//Param_decl
		public RuleCall getParam_declParam_declParserRuleCall_2_1_1_0() { return cParam_declParam_declParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class Param_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Param_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cType_expAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cType_expType_expParserRuleCall_0_0 = (RuleCall)cType_expAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		////Param_declaration
		//Param_decl:
		//	type_exp=Type_exp name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotation 
		//type_exp=Type_exp name=ID
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotation 
		//type_exp=Type_exp
		public Assignment getType_expAssignment_0() { return cType_expAssignment_0; }
		
		//Type_exp
		public RuleCall getType_expType_expParserRuleCall_0_0() { return cType_expType_expParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class Type_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Type_exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cPAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPType_useParserRuleCall_1_1_0 = (RuleCall)cPAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cPAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cPType_useParserRuleCall_1_2_1_0 = (RuleCall)cPAssignment_1_2_1.eContents().get(0);
		private final RuleCall cGTTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		
		////Type Expression
		//Type_exp:
		//	name=QualifiedName (LT p+=Type_use (',' p+=Type_use)* GT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=QualifiedName (LT p+=Type_use (',' p+=Type_use)* GT)?
		public Group getGroup() { return cGroup; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0() { return cNameQualifiedNameParserRuleCall_0_0; }
		
		//(LT p+=Type_use (',' p+=Type_use)* GT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_1_0() { return cLTTerminalRuleCall_1_0; }
		
		//p+=Type_use
		public Assignment getPAssignment_1_1() { return cPAssignment_1_1; }
		
		//Type_use
		public RuleCall getPType_useParserRuleCall_1_1_0() { return cPType_useParserRuleCall_1_1_0; }
		
		//(',' p+=Type_use)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//p+=Type_use
		public Assignment getPAssignment_1_2_1() { return cPAssignment_1_2_1; }
		
		//Type_use
		public RuleCall getPType_useParserRuleCall_1_2_1_0() { return cPType_useParserRuleCall_1_2_1_0; }
		
		//GT
		public RuleCall getGTTerminalRuleCall_1_3() { return cGTTerminalRuleCall_1_3; }
	}
	public class Function_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Function_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cType_useAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cType_useType_useParserRuleCall_1_0 = (RuleCall)cType_useAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cLTTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Assignment cPAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPIDTerminalRuleCall_3_1_0 = (RuleCall)cPAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cPAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cPIDTerminalRuleCall_3_2_1_0 = (RuleCall)cPAssignment_3_2_1.eContents().get(0);
		private final RuleCall cGTTerminalRuleCall_3_3 = (RuleCall)cGroup_3.eContents().get(3);
		private final Assignment cParamlistAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParamlistParam_listParserRuleCall_4_0 = (RuleCall)cParamlistAssignment_4.eContents().get(0);
		private final Keyword cEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Keyword cBuiltinKeyword_6_0 = (Keyword)cAlternatives_6.eContents().get(0);
		private final Assignment cPure_expAssignment_6_1 = (Assignment)cAlternatives_6.eContents().get(1);
		private final RuleCall cPure_expPure_expParserRuleCall_6_1_0 = (RuleCall)cPure_expAssignment_6_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		////Function Declaration
		//Function_decl: //annotations=Annotations 
		//	'def' type_use=Type_use name=ID (LT p+=ID (',' p+=ID)* GT)? paramlist=Param_list '=' ('builtin' | pure_exp=Pure_exp)
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//'def' type_use=Type_use name=ID (LT p+=ID (',' p+=ID)* GT)? paramlist=Param_list '=' ('builtin' | pure_exp=Pure_exp) ';'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//type_use=Type_use
		public Assignment getType_useAssignment_1() { return cType_useAssignment_1; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_1_0() { return cType_useType_useParserRuleCall_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//(LT p+=ID (',' p+=ID)* GT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_3_0() { return cLTTerminalRuleCall_3_0; }
		
		//p+=ID
		public Assignment getPAssignment_3_1() { return cPAssignment_3_1; }
		
		//ID
		public RuleCall getPIDTerminalRuleCall_3_1_0() { return cPIDTerminalRuleCall_3_1_0; }
		
		//(',' p+=ID)*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//p+=ID
		public Assignment getPAssignment_3_2_1() { return cPAssignment_3_2_1; }
		
		//ID
		public RuleCall getPIDTerminalRuleCall_3_2_1_0() { return cPIDTerminalRuleCall_3_2_1_0; }
		
		//GT
		public RuleCall getGTTerminalRuleCall_3_3() { return cGTTerminalRuleCall_3_3; }
		
		//paramlist=Param_list
		public Assignment getParamlistAssignment_4() { return cParamlistAssignment_4; }
		
		//Param_list
		public RuleCall getParamlistParam_listParserRuleCall_4_0() { return cParamlistParam_listParserRuleCall_4_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_5() { return cEqualsSignKeyword_5; }
		
		//'builtin' | pure_exp=Pure_exp
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//'builtin'
		public Keyword getBuiltinKeyword_6_0() { return cBuiltinKeyword_6_0; }
		
		//pure_exp=Pure_exp
		public Assignment getPure_expAssignment_6_1() { return cPure_expAssignment_6_1; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_6_1_0() { return cPure_expPure_expParserRuleCall_6_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class Typesyn_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Typesyn_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cType_useAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cType_useType_useParserRuleCall_3_0 = (RuleCall)cType_useAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		////TypeSyn Declaration
		//Typesyn_decl:
		//	'type' name=ID '=' type_use=Type_use ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID '=' type_use=Type_use ';'
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//type_use=Type_use
		public Assignment getType_useAssignment_3() { return cType_useAssignment_3; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_3_0() { return cType_useType_useParserRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class Exception_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Exception_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExceptionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cTypeData_constructor_argCrossReference_2_1_0 = (CrossReference)cTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cTypeData_constructor_argIDTerminalRuleCall_2_1_0_1 = (RuleCall)cTypeData_constructor_argCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cTypeAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cTypeData_constructor_argCrossReference_2_2_1_0 = (CrossReference)cTypeAssignment_2_2_1.eContents().get(0);
		private final RuleCall cTypeData_constructor_argIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cTypeData_constructor_argCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////Exception Declaration
		//Exception_decl: //annotations=Annotations 
		//	'exception' name=ID ('(' type+=[Data_constructor_arg] (',' type+=[Data_constructor_arg])* ')')? ';';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//'exception' name=ID ('(' type+=[Data_constructor_arg] (',' type+=[Data_constructor_arg])* ')')? ';'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//'exception'
		public Keyword getExceptionKeyword_0() { return cExceptionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('(' type+=[Data_constructor_arg] (',' type+=[Data_constructor_arg])* ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//type+=[Data_constructor_arg]
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//[Data_constructor_arg]
		public CrossReference getTypeData_constructor_argCrossReference_2_1_0() { return cTypeData_constructor_argCrossReference_2_1_0; }
		
		//ID
		public RuleCall getTypeData_constructor_argIDTerminalRuleCall_2_1_0_1() { return cTypeData_constructor_argIDTerminalRuleCall_2_1_0_1; }
		
		//(',' type+=[Data_constructor_arg])*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//type+=[Data_constructor_arg]
		public Assignment getTypeAssignment_2_2_1() { return cTypeAssignment_2_2_1; }
		
		//[Data_constructor_arg]
		public CrossReference getTypeData_constructor_argCrossReference_2_2_1_0() { return cTypeData_constructor_argCrossReference_2_2_1_0; }
		
		//ID
		public RuleCall getTypeData_constructor_argIDTerminalRuleCall_2_2_1_0_1() { return cTypeData_constructor_argIDTerminalRuleCall_2_2_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class Interface_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Interface_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInterface_nameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInterface_nameInterface_declCrossReference_2_1_0 = (CrossReference)cInterface_nameAssignment_2_1.eContents().get(0);
		private final RuleCall cInterface_nameInterface_declQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cInterface_nameInterface_declCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInterface_nameAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInterface_nameInterface_declCrossReference_2_2_1_0 = (CrossReference)cInterface_nameAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInterface_nameInterface_declQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInterface_nameInterface_declCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMethodsigAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMethodsigMethodsigParserRuleCall_4_0 = (RuleCall)cMethodsigAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////Interface Declaration
		//Interface_decl: //annotations=Annotations 
		//	'interface' name=ID ('extends' interface_name+=[Interface_decl|QualifiedName] (','
		//	interface_name+=[Interface_decl|QualifiedName])*)? '{' methodsig+=Methodsig* '}';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//'interface' name=ID ('extends' interface_name+=[Interface_decl|QualifiedName] (','
		//interface_name+=[Interface_decl|QualifiedName])*)? '{' methodsig+=Methodsig* '}'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//'interface'
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' interface_name+=[Interface_decl|QualifiedName] (',' interface_name+=[Interface_decl|QualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//interface_name+=[Interface_decl|QualifiedName]
		public Assignment getInterface_nameAssignment_2_1() { return cInterface_nameAssignment_2_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getInterface_nameInterface_declCrossReference_2_1_0() { return cInterface_nameInterface_declCrossReference_2_1_0; }
		
		//QualifiedName
		public RuleCall getInterface_nameInterface_declQualifiedNameParserRuleCall_2_1_0_1() { return cInterface_nameInterface_declQualifiedNameParserRuleCall_2_1_0_1; }
		
		//(',' interface_name+=[Interface_decl|QualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//interface_name+=[Interface_decl|QualifiedName]
		public Assignment getInterface_nameAssignment_2_2_1() { return cInterface_nameAssignment_2_2_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getInterface_nameInterface_declCrossReference_2_2_1_0() { return cInterface_nameInterface_declCrossReference_2_2_1_0; }
		
		//QualifiedName
		public RuleCall getInterface_nameInterface_declQualifiedNameParserRuleCall_2_2_1_0_1() { return cInterface_nameInterface_declQualifiedNameParserRuleCall_2_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//methodsig+=Methodsig*
		public Assignment getMethodsigAssignment_4() { return cMethodsigAssignment_4; }
		
		//Methodsig
		public RuleCall getMethodsigMethodsigParserRuleCall_4_0() { return cMethodsigMethodsigParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class Interface_nameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Interface_name");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		////Interface Name
		//Interface_name:
		//	name=QualifiedName;
		@Override public ParserRule getRule() { return rule; }
		
		//name=QualifiedName
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0() { return cNameQualifiedNameParserRuleCall_0; }
	}
	public class MethodsigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Methodsig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cType_useAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cType_useType_useParserRuleCall_0_0 = (RuleCall)cType_useAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cParamlistAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParamlistParam_listParserRuleCall_2_0 = (RuleCall)cParamlistAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////Method Signature 
		//Methodsig:
		//	type_use=Type_use name=ID paramlist=Param_list ';';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//type_use=Type_use name=ID paramlist=Param_list ';'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//type_use=Type_use
		public Assignment getType_useAssignment_0() { return cType_useAssignment_0; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_0_0() { return cType_useType_useParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//paramlist=Param_list
		public Assignment getParamlistAssignment_2() { return cParamlistAssignment_2; }
		
		//Param_list
		public RuleCall getParamlistParam_listParserRuleCall_2_0() { return cParamlistParam_listParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class Class_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Class_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cParamlistAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParamlistParam_listParserRuleCall_2_0 = (RuleCall)cParamlistAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImplementsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInterface_nameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInterface_nameInterface_declCrossReference_3_1_0 = (CrossReference)cInterface_nameAssignment_3_1.eContents().get(0);
		private final RuleCall cInterface_nameInterface_declQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cInterface_nameInterface_declCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cInterface_nameAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cInterface_nameInterface_declCrossReference_3_2_1_0 = (CrossReference)cInterface_nameAssignment_3_2_1.eContents().get(0);
		private final RuleCall cInterface_nameInterface_declQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cInterface_nameInterface_declCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cField_declAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cField_declField_declParserRuleCall_5_0 = (RuleCall)cField_declAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cStmtAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cStmtStmtParserRuleCall_6_1_0 = (RuleCall)cStmtAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cRecoverKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cCasestmtbranchAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cCasestmtbranchCasestmtbranchParserRuleCall_7_2_0 = (RuleCall)cCasestmtbranchAssignment_7_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_3 = (Keyword)cGroup_7.eContents().get(3);
		private final Assignment cTrait_usageAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTrait_usageTrait_usageParserRuleCall_8_0 = (RuleCall)cTrait_usageAssignment_8.eContents().get(0);
		private final Assignment cMethodAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cMethodMethodParserRuleCall_9_0 = (RuleCall)cMethodAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		////Class Declaration
		//Class_decl: //annotations=Annotations 
		//	'class' name=ID paramlist=Param_list? ('implements' interface_name+=[Interface_decl|QualifiedName] (','
		//	interface_name+=[Interface_decl|QualifiedName])*)? '{' field_decl+=Field_decl* ('{' stmt+=Stmt* '}')? ('recover' '{'
		//	casestmtbranch+=Casestmtbranch* '}')? trait_usage+=Trait_usage* method+=Method* '}';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//'class' name=ID paramlist=Param_list? ('implements' interface_name+=[Interface_decl|QualifiedName] (','
		//interface_name+=[Interface_decl|QualifiedName])*)? '{' field_decl+=Field_decl* ('{' stmt+=Stmt* '}')? ('recover' '{'
		//casestmtbranch+=Casestmtbranch* '}')? trait_usage+=Trait_usage* method+=Method* '}'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//'class'
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//paramlist=Param_list?
		public Assignment getParamlistAssignment_2() { return cParamlistAssignment_2; }
		
		//Param_list
		public RuleCall getParamlistParam_listParserRuleCall_2_0() { return cParamlistParam_listParserRuleCall_2_0; }
		
		//('implements' interface_name+=[Interface_decl|QualifiedName] (',' interface_name+=[Interface_decl|QualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'implements'
		public Keyword getImplementsKeyword_3_0() { return cImplementsKeyword_3_0; }
		
		//interface_name+=[Interface_decl|QualifiedName]
		public Assignment getInterface_nameAssignment_3_1() { return cInterface_nameAssignment_3_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getInterface_nameInterface_declCrossReference_3_1_0() { return cInterface_nameInterface_declCrossReference_3_1_0; }
		
		//QualifiedName
		public RuleCall getInterface_nameInterface_declQualifiedNameParserRuleCall_3_1_0_1() { return cInterface_nameInterface_declQualifiedNameParserRuleCall_3_1_0_1; }
		
		//(',' interface_name+=[Interface_decl|QualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//interface_name+=[Interface_decl|QualifiedName]
		public Assignment getInterface_nameAssignment_3_2_1() { return cInterface_nameAssignment_3_2_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getInterface_nameInterface_declCrossReference_3_2_1_0() { return cInterface_nameInterface_declCrossReference_3_2_1_0; }
		
		//QualifiedName
		public RuleCall getInterface_nameInterface_declQualifiedNameParserRuleCall_3_2_1_0_1() { return cInterface_nameInterface_declQualifiedNameParserRuleCall_3_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//field_decl+=Field_decl*
		public Assignment getField_declAssignment_5() { return cField_declAssignment_5; }
		
		//Field_decl
		public RuleCall getField_declField_declParserRuleCall_5_0() { return cField_declField_declParserRuleCall_5_0; }
		
		//('{' stmt+=Stmt* '}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_0() { return cLeftCurlyBracketKeyword_6_0; }
		
		//stmt+=Stmt*
		public Assignment getStmtAssignment_6_1() { return cStmtAssignment_6_1; }
		
		//Stmt
		public RuleCall getStmtStmtParserRuleCall_6_1_0() { return cStmtStmtParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_2() { return cRightCurlyBracketKeyword_6_2; }
		
		//('recover' '{' casestmtbranch+=Casestmtbranch* '}')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'recover'
		public Keyword getRecoverKeyword_7_0() { return cRecoverKeyword_7_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_7_1() { return cLeftCurlyBracketKeyword_7_1; }
		
		//casestmtbranch+=Casestmtbranch*
		public Assignment getCasestmtbranchAssignment_7_2() { return cCasestmtbranchAssignment_7_2; }
		
		//Casestmtbranch
		public RuleCall getCasestmtbranchCasestmtbranchParserRuleCall_7_2_0() { return cCasestmtbranchCasestmtbranchParserRuleCall_7_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7_3() { return cRightCurlyBracketKeyword_7_3; }
		
		//trait_usage+=Trait_usage*
		public Assignment getTrait_usageAssignment_8() { return cTrait_usageAssignment_8; }
		
		//Trait_usage
		public RuleCall getTrait_usageTrait_usageParserRuleCall_8_0() { return cTrait_usageTrait_usageParserRuleCall_8_0; }
		
		//method+=Method*
		public Assignment getMethodAssignment_9() { return cMethodAssignment_9; }
		
		//Method
		public RuleCall getMethodMethodParserRuleCall_9_0() { return cMethodMethodParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class Field_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Field_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cType_useAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cType_useType_useParserRuleCall_0_0 = (RuleCall)cType_useAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPure_expAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPure_expPure_expParserRuleCall_2_1_0 = (RuleCall)cPure_expAssignment_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//// Field Declaration Error due to left recursion solve
		//Field_decl:
		//	type_use=Type_use
		//	name=ID ('=' pure_exp=Pure_exp)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//type_use=Type_use name=ID ('=' pure_exp=Pure_exp)? ';'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//type_use=Type_use
		public Assignment getType_useAssignment_0() { return cType_useAssignment_0; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_0_0() { return cType_useType_useParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('=' pure_exp=Pure_exp)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_2_0() { return cEqualsSignKeyword_2_0; }
		
		//pure_exp=Pure_exp
		public Assignment getPure_expAssignment_2_1() { return cPure_expAssignment_2_1; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_2_1_0() { return cPure_expPure_expParserRuleCall_2_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class StmtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Stmt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStmtAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cType_expAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cType_expType_expParserRuleCall_1_0_0_0 = (RuleCall)cType_expAssignment_1_0_0.eContents().get(0);
		private final Assignment cNameAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0_1_0 = (RuleCall)cNameAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_0_2 = (Group)cGroup_1_0.eContents().get(2);
		private final Keyword cEqualsSignKeyword_1_0_2_0 = (Keyword)cGroup_1_0_2.eContents().get(0);
		private final Assignment cExpAssignment_1_0_2_1 = (Assignment)cGroup_1_0_2.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_0_2_1_0 = (RuleCall)cExpAssignment_1_0_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_0_3 = (Keyword)cGroup_1_0.eContents().get(3);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cVar_or_field_refAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cVar_or_field_refVar_or_field_refParserRuleCall_1_1_0_0 = (RuleCall)cVar_or_field_refAssignment_1_1_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cExpAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_1_1_2_0 = (RuleCall)cExpAssignment_1_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1_3 = (Keyword)cGroup_1_1.eContents().get(3);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cSkipKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_2_1 = (Keyword)cGroup_1_2.eContents().get(1);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cReturnKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cExpAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_3_1_0 = (RuleCall)cExpAssignment_1_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_3_2 = (Keyword)cGroup_1_3.eContents().get(2);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final Keyword cAssertKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cExpAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_4_1_0 = (RuleCall)cExpAssignment_1_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_4_2 = (Keyword)cGroup_1_4.eContents().get(2);
		private final Group cGroup_1_5 = (Group)cAlternatives_1.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_1_5_0 = (Keyword)cGroup_1_5.eContents().get(0);
		private final Assignment cStmtAssignment_1_5_1 = (Assignment)cGroup_1_5.eContents().get(1);
		private final RuleCall cStmtStmtParserRuleCall_1_5_1_0 = (RuleCall)cStmtAssignment_1_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_5_2 = (Keyword)cGroup_1_5.eContents().get(2);
		private final Group cGroup_1_6 = (Group)cAlternatives_1.eContents().get(6);
		private final Keyword cIfKeyword_1_6_0 = (Keyword)cGroup_1_6.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_6_1 = (Keyword)cGroup_1_6.eContents().get(1);
		private final Assignment cPure_expAssignment_1_6_2 = (Assignment)cGroup_1_6.eContents().get(2);
		private final RuleCall cPure_expPure_expParserRuleCall_1_6_2_0 = (RuleCall)cPure_expAssignment_1_6_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_6_3 = (Keyword)cGroup_1_6.eContents().get(3);
		private final Assignment cIfstmtAssignment_1_6_4 = (Assignment)cGroup_1_6.eContents().get(4);
		private final RuleCall cIfstmtStmtParserRuleCall_1_6_4_0 = (RuleCall)cIfstmtAssignment_1_6_4.eContents().get(0);
		private final Group cGroup_1_6_5 = (Group)cGroup_1_6.eContents().get(5);
		private final Keyword cElseKeyword_1_6_5_0 = (Keyword)cGroup_1_6_5.eContents().get(0);
		private final Assignment cElsestmtAssignment_1_6_5_1 = (Assignment)cGroup_1_6_5.eContents().get(1);
		private final RuleCall cElsestmtStmtParserRuleCall_1_6_5_1_0 = (RuleCall)cElsestmtAssignment_1_6_5_1.eContents().get(0);
		private final Group cGroup_1_7 = (Group)cAlternatives_1.eContents().get(7);
		private final Keyword cWhileKeyword_1_7_0 = (Keyword)cGroup_1_7.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_7_1 = (Keyword)cGroup_1_7.eContents().get(1);
		private final Assignment cConditionAssignment_1_7_2 = (Assignment)cGroup_1_7.eContents().get(2);
		private final RuleCall cConditionPure_expParserRuleCall_1_7_2_0 = (RuleCall)cConditionAssignment_1_7_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_7_3 = (Keyword)cGroup_1_7.eContents().get(3);
		private final Assignment cWhilestmtAssignment_1_7_4 = (Assignment)cGroup_1_7.eContents().get(4);
		private final RuleCall cWhilestmtStmtParserRuleCall_1_7_4_0 = (RuleCall)cWhilestmtAssignment_1_7_4.eContents().get(0);
		private final Group cGroup_1_8 = (Group)cAlternatives_1.eContents().get(8);
		private final Keyword cForeachKeyword_1_8_0 = (Keyword)cGroup_1_8.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_8_1 = (Keyword)cGroup_1_8.eContents().get(1);
		private final Assignment cNameAssignment_1_8_2 = (Assignment)cGroup_1_8.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_1_8_2_0 = (RuleCall)cNameAssignment_1_8_2.eContents().get(0);
		private final Keyword cInKeyword_1_8_3 = (Keyword)cGroup_1_8.eContents().get(3);
		private final Assignment cLAssignment_1_8_4 = (Assignment)cGroup_1_8.eContents().get(4);
		private final RuleCall cLPure_expParserRuleCall_1_8_4_0 = (RuleCall)cLAssignment_1_8_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_8_5 = (Keyword)cGroup_1_8.eContents().get(5);
		private final Assignment cForeachstmtAssignment_1_8_6 = (Assignment)cGroup_1_8.eContents().get(6);
		private final RuleCall cForeachstmtStmtParserRuleCall_1_8_6_0 = (RuleCall)cForeachstmtAssignment_1_8_6.eContents().get(0);
		private final Group cGroup_1_9 = (Group)cAlternatives_1.eContents().get(9);
		private final Keyword cTryKeyword_1_9_0 = (Keyword)cGroup_1_9.eContents().get(0);
		private final Assignment cTrystmtAssignment_1_9_1 = (Assignment)cGroup_1_9.eContents().get(1);
		private final RuleCall cTrystmtStmtParserRuleCall_1_9_1_0 = (RuleCall)cTrystmtAssignment_1_9_1.eContents().get(0);
		private final Keyword cCatchKeyword_1_9_2 = (Keyword)cGroup_1_9.eContents().get(2);
		private final Alternatives cAlternatives_1_9_3 = (Alternatives)cGroup_1_9.eContents().get(3);
		private final Group cGroup_1_9_3_0 = (Group)cAlternatives_1_9_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1_9_3_0_0 = (Keyword)cGroup_1_9_3_0.eContents().get(0);
		private final Assignment cCasestmtbranchAssignment_1_9_3_0_1 = (Assignment)cGroup_1_9_3_0.eContents().get(1);
		private final RuleCall cCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_0_1_0 = (RuleCall)cCasestmtbranchAssignment_1_9_3_0_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_9_3_0_2 = (Keyword)cGroup_1_9_3_0.eContents().get(2);
		private final Assignment cCasestmtbranchAssignment_1_9_3_1 = (Assignment)cAlternatives_1_9_3.eContents().get(1);
		private final RuleCall cCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_1_0 = (RuleCall)cCasestmtbranchAssignment_1_9_3_1.eContents().get(0);
		private final Group cGroup_1_9_4 = (Group)cGroup_1_9.eContents().get(4);
		private final Keyword cFinallyKeyword_1_9_4_0 = (Keyword)cGroup_1_9_4.eContents().get(0);
		private final Assignment cStmtAssignment_1_9_4_1 = (Assignment)cGroup_1_9_4.eContents().get(1);
		private final RuleCall cStmtStmtParserRuleCall_1_9_4_1_0 = (RuleCall)cStmtAssignment_1_9_4_1.eContents().get(0);
		private final Group cGroup_1_10 = (Group)cAlternatives_1.eContents().get(10);
		private final Keyword cAwaitKeyword_1_10_0 = (Keyword)cGroup_1_10.eContents().get(0);
		private final Assignment cRefAssignment_1_10_1 = (Assignment)cGroup_1_10.eContents().get(1);
		private final RuleCall cRefGuardParserRuleCall_1_10_1_0 = (RuleCall)cRefAssignment_1_10_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_10_2 = (Keyword)cGroup_1_10.eContents().get(2);
		private final Group cGroup_1_11 = (Group)cAlternatives_1.eContents().get(11);
		private final Keyword cSuspendKeyword_1_11_0 = (Keyword)cGroup_1_11.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_11_1 = (Keyword)cGroup_1_11.eContents().get(1);
		private final Group cGroup_1_12 = (Group)cAlternatives_1.eContents().get(12);
		private final Keyword cDurationKeyword_1_12_0 = (Keyword)cGroup_1_12.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_12_1 = (Keyword)cGroup_1_12.eContents().get(1);
		private final Assignment cFAssignment_1_12_2 = (Assignment)cGroup_1_12.eContents().get(2);
		private final RuleCall cFPure_expParserRuleCall_1_12_2_0 = (RuleCall)cFAssignment_1_12_2.eContents().get(0);
		private final Keyword cCommaKeyword_1_12_3 = (Keyword)cGroup_1_12.eContents().get(3);
		private final Assignment cTAssignment_1_12_4 = (Assignment)cGroup_1_12.eContents().get(4);
		private final RuleCall cTPure_expParserRuleCall_1_12_4_0 = (RuleCall)cTAssignment_1_12_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_12_5 = (Keyword)cGroup_1_12.eContents().get(5);
		private final Keyword cSemicolonKeyword_1_12_6 = (Keyword)cGroup_1_12.eContents().get(6);
		private final Group cGroup_1_13 = (Group)cAlternatives_1.eContents().get(13);
		private final Keyword cThrowKeyword_1_13_0 = (Keyword)cGroup_1_13.eContents().get(0);
		private final Assignment cThrowPureExpAssignment_1_13_1 = (Assignment)cGroup_1_13.eContents().get(1);
		private final RuleCall cThrowPureExpPure_expParserRuleCall_1_13_1_0 = (RuleCall)cThrowPureExpAssignment_1_13_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_13_2 = (Keyword)cGroup_1_13.eContents().get(2);
		private final Group cGroup_1_14 = (Group)cAlternatives_1.eContents().get(14);
		private final Keyword cDieKeyword_1_14_0 = (Keyword)cGroup_1_14.eContents().get(0);
		private final Assignment cDiePureExpAssignment_1_14_1 = (Assignment)cGroup_1_14.eContents().get(1);
		private final RuleCall cDiePureExpPure_expParserRuleCall_1_14_1_0 = (RuleCall)cDiePureExpAssignment_1_14_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_14_2 = (Keyword)cGroup_1_14.eContents().get(2);
		private final Group cGroup_1_15 = (Group)cAlternatives_1.eContents().get(15);
		private final Keyword cMovecogtoKeyword_1_15_0 = (Keyword)cGroup_1_15.eContents().get(0);
		private final Assignment cMoveCogToAssignment_1_15_1 = (Assignment)cGroup_1_15.eContents().get(1);
		private final RuleCall cMoveCogToPure_expParserRuleCall_1_15_1_0 = (RuleCall)cMoveCogToAssignment_1_15_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_15_2 = (Keyword)cGroup_1_15.eContents().get(2);
		private final Group cGroup_1_16 = (Group)cAlternatives_1.eContents().get(16);
		private final Assignment cExpAssignment_1_16_0 = (Assignment)cGroup_1_16.eContents().get(0);
		private final RuleCall cExpExpParserRuleCall_1_16_0_0 = (RuleCall)cExpAssignment_1_16_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_16_1 = (Keyword)cGroup_1_16.eContents().get(1);
		private final Group cGroup_1_17 = (Group)cAlternatives_1.eContents().get(17);
		private final Keyword cCaseKeyword_1_17_0 = (Keyword)cGroup_1_17.eContents().get(0);
		private final Assignment cCAssignment_1_17_1 = (Assignment)cGroup_1_17.eContents().get(1);
		private final RuleCall cCPure_expParserRuleCall_1_17_1_0 = (RuleCall)cCAssignment_1_17_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1_17_2 = (Keyword)cGroup_1_17.eContents().get(2);
		private final Assignment cCasestmtbranchAssignment_1_17_3 = (Assignment)cGroup_1_17.eContents().get(3);
		private final RuleCall cCasestmtbranchCasestmtbranchParserRuleCall_1_17_3_0 = (RuleCall)cCasestmtbranchAssignment_1_17_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_17_4 = (Keyword)cGroup_1_17.eContents().get(4);
		
		////Statements Declaration
		//Stmt:
		//	{Stmt} (type_exp=Type_exp name=ID ('=' exp=Exp)? ';'
		//	| var_or_field_ref=Var_or_field_ref '=' exp=Exp ';'
		//	| 'skip' ';'
		//	| 'return' exp=Exp ';'
		//	| 'assert' exp=Exp ';'
		//	| '{' stmt+=Stmt* '}'
		//	| 'if' '(' pure_exp=Pure_exp ')' ifstmt=Stmt (=> 'else' elsestmt=Stmt)?
		//	| 'while' '(' condition=Pure_exp ')' whilestmt=Stmt
		//	| 'foreach' '(' name=ID 'in' l=Pure_exp ')' foreachstmt=Stmt
		//	| 'try' trystmt=Stmt 'catch' ('{' casestmtbranch+=Casestmtbranch* '}' | casestmtbranch+=Casestmtbranch) ('finally'
		//	stmt+=Stmt)?
		//	| 'await' ref=Guard ';'
		//	| 'suspend' ';'
		//	| 'duration' '(' f=Pure_exp ',' t=Pure_exp ')' ';'
		//	| 'throw' throwPureExp=Pure_exp ';'
		//	| 'die' diePureExp=Pure_exp ';'
		//	| 'movecogto' moveCogTo=Pure_exp ';'
		//	| exp=Exp ';'
		//	| 'case' c=Pure_exp '{' casestmtbranch+=Casestmtbranch* '}');
		@Override public ParserRule getRule() { return rule; }
		
		//{Stmt} (type_exp=Type_exp name=ID ('=' exp=Exp)? ';' | var_or_field_ref=Var_or_field_ref '=' exp=Exp ';' | 'skip' ';' |
		//'return' exp=Exp ';' | 'assert' exp=Exp ';' | '{' stmt+=Stmt* '}' | 'if' '(' pure_exp=Pure_exp ')' ifstmt=Stmt (=>
		//'else' elsestmt=Stmt)? | 'while' '(' condition=Pure_exp ')' whilestmt=Stmt | 'foreach' '(' name=ID 'in' l=Pure_exp ')'
		//foreachstmt=Stmt | 'try' trystmt=Stmt 'catch' ('{' casestmtbranch+=Casestmtbranch* '}' |
		//casestmtbranch+=Casestmtbranch) ('finally' stmt+=Stmt)? | 'await' ref=Guard ';' | 'suspend' ';' | 'duration' '('
		//f=Pure_exp ',' t=Pure_exp ')' ';' | 'throw' throwPureExp=Pure_exp ';' | 'die' diePureExp=Pure_exp ';' | 'movecogto'
		//moveCogTo=Pure_exp ';' | exp=Exp ';' | 'case' c=Pure_exp '{' casestmtbranch+=Casestmtbranch* '}')
		public Group getGroup() { return cGroup; }
		
		//{Stmt}
		public Action getStmtAction_0() { return cStmtAction_0; }
		
		////stmt_annotations=Annotations 
		//type_exp=Type_exp name=ID ('=' exp=Exp)? ';' | var_or_field_ref=Var_or_field_ref '=' exp=Exp ';' | 'skip' ';' | 'return'
		//exp=Exp ';' | 'assert' exp=Exp ';' | '{' stmt+=Stmt* '}' | 'if' '(' pure_exp=Pure_exp ')' ifstmt=Stmt (=> 'else'
		//elsestmt=Stmt)? | 'while' '(' condition=Pure_exp ')' whilestmt=Stmt | 'foreach' '(' name=ID 'in' l=Pure_exp ')'
		//foreachstmt=Stmt | 'try' trystmt=Stmt 'catch' ('{' casestmtbranch+=Casestmtbranch* '}' |
		//casestmtbranch+=Casestmtbranch) ('finally' stmt+=Stmt)? | 'await' ref=Guard ';' | 'suspend' ';' | 'duration' '('
		//f=Pure_exp ',' t=Pure_exp ')' ';' | 'throw' throwPureExp=Pure_exp ';' | 'die' diePureExp=Pure_exp ';' | 'movecogto'
		//moveCogTo=Pure_exp ';' | exp=Exp ';' | 'case' c=Pure_exp '{' casestmtbranch+=Casestmtbranch* '}'
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//type_exp=Type_exp name=ID ('=' exp=Exp)? ';'
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//type_exp=Type_exp
		public Assignment getType_expAssignment_1_0_0() { return cType_expAssignment_1_0_0; }
		
		//Type_exp
		public RuleCall getType_expType_expParserRuleCall_1_0_0_0() { return cType_expType_expParserRuleCall_1_0_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_0_1() { return cNameAssignment_1_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_1_0() { return cNameIDTerminalRuleCall_1_0_1_0; }
		
		//('=' exp=Exp)?
		public Group getGroup_1_0_2() { return cGroup_1_0_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0_2_0() { return cEqualsSignKeyword_1_0_2_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1_0_2_1() { return cExpAssignment_1_0_2_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_0_2_1_0() { return cExpExpParserRuleCall_1_0_2_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_0_3() { return cSemicolonKeyword_1_0_3; }
		
		//var_or_field_ref=Var_or_field_ref '=' exp=Exp ';'
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//var_or_field_ref=Var_or_field_ref
		public Assignment getVar_or_field_refAssignment_1_1_0() { return cVar_or_field_refAssignment_1_1_0; }
		
		//Var_or_field_ref
		public RuleCall getVar_or_field_refVar_or_field_refParserRuleCall_1_1_0_0() { return cVar_or_field_refVar_or_field_refParserRuleCall_1_1_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_1_1() { return cEqualsSignKeyword_1_1_1; }
		
		//exp=Exp
		public Assignment getExpAssignment_1_1_2() { return cExpAssignment_1_1_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_1_2_0() { return cExpExpParserRuleCall_1_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_1_3() { return cSemicolonKeyword_1_1_3; }
		
		//'skip' ';'
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'skip'
		public Keyword getSkipKeyword_1_2_0() { return cSkipKeyword_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_2_1() { return cSemicolonKeyword_1_2_1; }
		
		//'return' exp=Exp ';'
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//'return'
		public Keyword getReturnKeyword_1_3_0() { return cReturnKeyword_1_3_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1_3_1() { return cExpAssignment_1_3_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_3_1_0() { return cExpExpParserRuleCall_1_3_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_3_2() { return cSemicolonKeyword_1_3_2; }
		
		//'assert' exp=Exp ';'
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'assert'
		public Keyword getAssertKeyword_1_4_0() { return cAssertKeyword_1_4_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1_4_1() { return cExpAssignment_1_4_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_4_1_0() { return cExpExpParserRuleCall_1_4_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_4_2() { return cSemicolonKeyword_1_4_2; }
		
		//'{' stmt+=Stmt* '}'
		public Group getGroup_1_5() { return cGroup_1_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_5_0() { return cLeftCurlyBracketKeyword_1_5_0; }
		
		//stmt+=Stmt*
		public Assignment getStmtAssignment_1_5_1() { return cStmtAssignment_1_5_1; }
		
		//Stmt
		public RuleCall getStmtStmtParserRuleCall_1_5_1_0() { return cStmtStmtParserRuleCall_1_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_5_2() { return cRightCurlyBracketKeyword_1_5_2; }
		
		//'if' '(' pure_exp=Pure_exp ')' ifstmt=Stmt (=> 'else' elsestmt=Stmt)?
		public Group getGroup_1_6() { return cGroup_1_6; }
		
		//'if'
		public Keyword getIfKeyword_1_6_0() { return cIfKeyword_1_6_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_6_1() { return cLeftParenthesisKeyword_1_6_1; }
		
		//pure_exp=Pure_exp
		public Assignment getPure_expAssignment_1_6_2() { return cPure_expAssignment_1_6_2; }
		
		//Pure_exp
		public RuleCall getPure_expPure_expParserRuleCall_1_6_2_0() { return cPure_expPure_expParserRuleCall_1_6_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_6_3() { return cRightParenthesisKeyword_1_6_3; }
		
		//ifstmt=Stmt
		public Assignment getIfstmtAssignment_1_6_4() { return cIfstmtAssignment_1_6_4; }
		
		//Stmt
		public RuleCall getIfstmtStmtParserRuleCall_1_6_4_0() { return cIfstmtStmtParserRuleCall_1_6_4_0; }
		
		//(=> 'else' elsestmt=Stmt)?
		public Group getGroup_1_6_5() { return cGroup_1_6_5; }
		
		//=> 'else'
		public Keyword getElseKeyword_1_6_5_0() { return cElseKeyword_1_6_5_0; }
		
		//elsestmt=Stmt
		public Assignment getElsestmtAssignment_1_6_5_1() { return cElsestmtAssignment_1_6_5_1; }
		
		//Stmt
		public RuleCall getElsestmtStmtParserRuleCall_1_6_5_1_0() { return cElsestmtStmtParserRuleCall_1_6_5_1_0; }
		
		//'while' '(' condition=Pure_exp ')' whilestmt=Stmt
		public Group getGroup_1_7() { return cGroup_1_7; }
		
		//'while'
		public Keyword getWhileKeyword_1_7_0() { return cWhileKeyword_1_7_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_7_1() { return cLeftParenthesisKeyword_1_7_1; }
		
		//condition=Pure_exp
		public Assignment getConditionAssignment_1_7_2() { return cConditionAssignment_1_7_2; }
		
		//Pure_exp
		public RuleCall getConditionPure_expParserRuleCall_1_7_2_0() { return cConditionPure_expParserRuleCall_1_7_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_7_3() { return cRightParenthesisKeyword_1_7_3; }
		
		//whilestmt=Stmt
		public Assignment getWhilestmtAssignment_1_7_4() { return cWhilestmtAssignment_1_7_4; }
		
		//Stmt
		public RuleCall getWhilestmtStmtParserRuleCall_1_7_4_0() { return cWhilestmtStmtParserRuleCall_1_7_4_0; }
		
		//'foreach' '(' name=ID 'in' l=Pure_exp ')' foreachstmt=Stmt
		public Group getGroup_1_8() { return cGroup_1_8; }
		
		//'foreach'
		public Keyword getForeachKeyword_1_8_0() { return cForeachKeyword_1_8_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_8_1() { return cLeftParenthesisKeyword_1_8_1; }
		
		//name=ID
		public Assignment getNameAssignment_1_8_2() { return cNameAssignment_1_8_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_8_2_0() { return cNameIDTerminalRuleCall_1_8_2_0; }
		
		//'in'
		public Keyword getInKeyword_1_8_3() { return cInKeyword_1_8_3; }
		
		//l=Pure_exp
		public Assignment getLAssignment_1_8_4() { return cLAssignment_1_8_4; }
		
		//Pure_exp
		public RuleCall getLPure_expParserRuleCall_1_8_4_0() { return cLPure_expParserRuleCall_1_8_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_8_5() { return cRightParenthesisKeyword_1_8_5; }
		
		//foreachstmt=Stmt
		public Assignment getForeachstmtAssignment_1_8_6() { return cForeachstmtAssignment_1_8_6; }
		
		//Stmt
		public RuleCall getForeachstmtStmtParserRuleCall_1_8_6_0() { return cForeachstmtStmtParserRuleCall_1_8_6_0; }
		
		//'try' trystmt=Stmt 'catch' ('{' casestmtbranch+=Casestmtbranch* '}' | casestmtbranch+=Casestmtbranch) ('finally'
		//stmt+=Stmt)?
		public Group getGroup_1_9() { return cGroup_1_9; }
		
		//'try'
		public Keyword getTryKeyword_1_9_0() { return cTryKeyword_1_9_0; }
		
		//trystmt=Stmt
		public Assignment getTrystmtAssignment_1_9_1() { return cTrystmtAssignment_1_9_1; }
		
		//Stmt
		public RuleCall getTrystmtStmtParserRuleCall_1_9_1_0() { return cTrystmtStmtParserRuleCall_1_9_1_0; }
		
		//'catch'
		public Keyword getCatchKeyword_1_9_2() { return cCatchKeyword_1_9_2; }
		
		//'{' casestmtbranch+=Casestmtbranch* '}' | casestmtbranch+=Casestmtbranch
		public Alternatives getAlternatives_1_9_3() { return cAlternatives_1_9_3; }
		
		//'{' casestmtbranch+=Casestmtbranch* '}'
		public Group getGroup_1_9_3_0() { return cGroup_1_9_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_9_3_0_0() { return cLeftCurlyBracketKeyword_1_9_3_0_0; }
		
		//casestmtbranch+=Casestmtbranch*
		public Assignment getCasestmtbranchAssignment_1_9_3_0_1() { return cCasestmtbranchAssignment_1_9_3_0_1; }
		
		//Casestmtbranch
		public RuleCall getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_0_1_0() { return cCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_0_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_9_3_0_2() { return cRightCurlyBracketKeyword_1_9_3_0_2; }
		
		//casestmtbranch+=Casestmtbranch
		public Assignment getCasestmtbranchAssignment_1_9_3_1() { return cCasestmtbranchAssignment_1_9_3_1; }
		
		//Casestmtbranch
		public RuleCall getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_1_0() { return cCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_1_0; }
		
		//('finally' stmt+=Stmt)?
		public Group getGroup_1_9_4() { return cGroup_1_9_4; }
		
		//'finally'
		public Keyword getFinallyKeyword_1_9_4_0() { return cFinallyKeyword_1_9_4_0; }
		
		//stmt+=Stmt
		public Assignment getStmtAssignment_1_9_4_1() { return cStmtAssignment_1_9_4_1; }
		
		//Stmt
		public RuleCall getStmtStmtParserRuleCall_1_9_4_1_0() { return cStmtStmtParserRuleCall_1_9_4_1_0; }
		
		//'await' ref=Guard ';'
		public Group getGroup_1_10() { return cGroup_1_10; }
		
		//'await'
		public Keyword getAwaitKeyword_1_10_0() { return cAwaitKeyword_1_10_0; }
		
		//ref=Guard
		public Assignment getRefAssignment_1_10_1() { return cRefAssignment_1_10_1; }
		
		//Guard
		public RuleCall getRefGuardParserRuleCall_1_10_1_0() { return cRefGuardParserRuleCall_1_10_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_10_2() { return cSemicolonKeyword_1_10_2; }
		
		//'suspend' ';'
		public Group getGroup_1_11() { return cGroup_1_11; }
		
		//'suspend'
		public Keyword getSuspendKeyword_1_11_0() { return cSuspendKeyword_1_11_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_11_1() { return cSemicolonKeyword_1_11_1; }
		
		//'duration' '(' f=Pure_exp ',' t=Pure_exp ')' ';'
		public Group getGroup_1_12() { return cGroup_1_12; }
		
		//'duration'
		public Keyword getDurationKeyword_1_12_0() { return cDurationKeyword_1_12_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_12_1() { return cLeftParenthesisKeyword_1_12_1; }
		
		//f=Pure_exp
		public Assignment getFAssignment_1_12_2() { return cFAssignment_1_12_2; }
		
		//Pure_exp
		public RuleCall getFPure_expParserRuleCall_1_12_2_0() { return cFPure_expParserRuleCall_1_12_2_0; }
		
		//','
		public Keyword getCommaKeyword_1_12_3() { return cCommaKeyword_1_12_3; }
		
		//t=Pure_exp
		public Assignment getTAssignment_1_12_4() { return cTAssignment_1_12_4; }
		
		//Pure_exp
		public RuleCall getTPure_expParserRuleCall_1_12_4_0() { return cTPure_expParserRuleCall_1_12_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_12_5() { return cRightParenthesisKeyword_1_12_5; }
		
		//';'
		public Keyword getSemicolonKeyword_1_12_6() { return cSemicolonKeyword_1_12_6; }
		
		//'throw' throwPureExp=Pure_exp ';'
		public Group getGroup_1_13() { return cGroup_1_13; }
		
		//'throw'
		public Keyword getThrowKeyword_1_13_0() { return cThrowKeyword_1_13_0; }
		
		//throwPureExp=Pure_exp
		public Assignment getThrowPureExpAssignment_1_13_1() { return cThrowPureExpAssignment_1_13_1; }
		
		//Pure_exp
		public RuleCall getThrowPureExpPure_expParserRuleCall_1_13_1_0() { return cThrowPureExpPure_expParserRuleCall_1_13_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_13_2() { return cSemicolonKeyword_1_13_2; }
		
		//'die' diePureExp=Pure_exp ';'
		public Group getGroup_1_14() { return cGroup_1_14; }
		
		//'die'
		public Keyword getDieKeyword_1_14_0() { return cDieKeyword_1_14_0; }
		
		//diePureExp=Pure_exp
		public Assignment getDiePureExpAssignment_1_14_1() { return cDiePureExpAssignment_1_14_1; }
		
		//Pure_exp
		public RuleCall getDiePureExpPure_expParserRuleCall_1_14_1_0() { return cDiePureExpPure_expParserRuleCall_1_14_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_14_2() { return cSemicolonKeyword_1_14_2; }
		
		//'movecogto' moveCogTo=Pure_exp ';'
		public Group getGroup_1_15() { return cGroup_1_15; }
		
		//'movecogto'
		public Keyword getMovecogtoKeyword_1_15_0() { return cMovecogtoKeyword_1_15_0; }
		
		//moveCogTo=Pure_exp
		public Assignment getMoveCogToAssignment_1_15_1() { return cMoveCogToAssignment_1_15_1; }
		
		//Pure_exp
		public RuleCall getMoveCogToPure_expParserRuleCall_1_15_1_0() { return cMoveCogToPure_expParserRuleCall_1_15_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_15_2() { return cSemicolonKeyword_1_15_2; }
		
		//exp=Exp ';'
		public Group getGroup_1_16() { return cGroup_1_16; }
		
		//exp=Exp
		public Assignment getExpAssignment_1_16_0() { return cExpAssignment_1_16_0; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_16_0_0() { return cExpExpParserRuleCall_1_16_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_16_1() { return cSemicolonKeyword_1_16_1; }
		
		//'case' c=Pure_exp '{' casestmtbranch+=Casestmtbranch* '}'
		public Group getGroup_1_17() { return cGroup_1_17; }
		
		//'case'
		public Keyword getCaseKeyword_1_17_0() { return cCaseKeyword_1_17_0; }
		
		//c=Pure_exp
		public Assignment getCAssignment_1_17_1() { return cCAssignment_1_17_1; }
		
		//Pure_exp
		public RuleCall getCPure_expParserRuleCall_1_17_1_0() { return cCPure_expParserRuleCall_1_17_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_17_2() { return cLeftCurlyBracketKeyword_1_17_2; }
		
		//casestmtbranch+=Casestmtbranch*
		public Assignment getCasestmtbranchAssignment_1_17_3() { return cCasestmtbranchAssignment_1_17_3; }
		
		//Casestmtbranch
		public RuleCall getCasestmtbranchCasestmtbranchParserRuleCall_1_17_3_0() { return cCasestmtbranchCasestmtbranchParserRuleCall_1_17_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_17_4() { return cRightCurlyBracketKeyword_1_17_4; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Exp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEff_exprParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPure_expParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// Expressions Error check causing error
		//Exp:
		//	Eff_expr | Pure_exp;
		@Override public ParserRule getRule() { return rule; }
		
		//Eff_expr | Pure_exp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Eff_expr
		public RuleCall getEff_exprParserRuleCall_0() { return cEff_exprParserRuleCall_0; }
		
		//Pure_exp
		public RuleCall getPure_expParserRuleCall_1() { return cPure_expParserRuleCall_1; }
	}
	public class Eff_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Eff_expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cPure_expParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cGetKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNewKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cLAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cLLocalKeyword_1_1_0 = (Keyword)cLAssignment_1_1.eContents().get(0);
		private final RuleCall cQualifiedNameParserRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cPure_exp_listAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cPure_exp_listPure_exp_listParserRuleCall_1_4_0 = (RuleCall)cPure_exp_listAssignment_1_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cAwaitKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cPure_expParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cNEGATIONTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		private final Assignment cAwaitAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cAwaitIDTerminalRuleCall_2_3_0 = (RuleCall)cAwaitAssignment_2_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Assignment cListAssignment_2_5 = (Assignment)cGroup_2.eContents().get(5);
		private final RuleCall cListPure_exp_listParserRuleCall_2_5_0 = (RuleCall)cListAssignment_2_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_6 = (Keyword)cGroup_2.eContents().get(6);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final RuleCall cPure_expParserRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Keyword cFullStopKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cValAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cValIDTerminalRuleCall_3_2_0 = (RuleCall)cValAssignment_3_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cListAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cListPure_exp_listParserRuleCall_3_4_0 = (RuleCall)cListAssignment_3_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_5 = (Keyword)cGroup_3.eContents().get(5);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cGroup_4.eContents().get(0);
		private final Alternatives cAlternatives_4_0_0 = (Alternatives)cGroup_4_0.eContents().get(0);
		private final RuleCall cDelta_idParserRuleCall_4_0_0_0 = (RuleCall)cAlternatives_4_0_0.eContents().get(0);
		private final Keyword cCoreKeyword_4_0_0_1 = (Keyword)cAlternatives_4_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Keyword cOriginalKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cListAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final RuleCall cListPure_exp_listParserRuleCall_4_3_0 = (RuleCall)cListAssignment_4_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		
		////Eff Expression
		//Eff_expr:
		//	Pure_exp '.' 'get'
		//	| 'new' l='local'? QualifiedName '(' pure_exp_list=Pure_exp_list ')'
		//	| 'await'? Pure_exp NEGATION await=ID '(' list+=Pure_exp_list ')'
		//	| Pure_exp '.' val=ID '(' list+=Pure_exp_list ')'
		//	| ((Delta_id | 'core') '.')? 'original' '(' list+=Pure_exp_list ')';
		@Override public ParserRule getRule() { return rule; }
		
		//Pure_exp '.' 'get' | 'new' l='local'? QualifiedName '(' pure_exp_list=Pure_exp_list ')' | 'await'? Pure_exp NEGATION
		//await=ID '(' list+=Pure_exp_list ')' | Pure_exp '.' val=ID '(' list+=Pure_exp_list ')' | ((Delta_id | 'core') '.')?
		//'original' '(' list+=Pure_exp_list ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Pure_exp '.' 'get'
		public Group getGroup_0() { return cGroup_0; }
		
		//Pure_exp
		public RuleCall getPure_expParserRuleCall_0_0() { return cPure_expParserRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }
		
		//'get'
		public Keyword getGetKeyword_0_2() { return cGetKeyword_0_2; }
		
		//'new' l='local'? QualifiedName '(' pure_exp_list=Pure_exp_list ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'new'
		public Keyword getNewKeyword_1_0() { return cNewKeyword_1_0; }
		
		//l='local'?
		public Assignment getLAssignment_1_1() { return cLAssignment_1_1; }
		
		//'local'
		public Keyword getLLocalKeyword_1_1_0() { return cLLocalKeyword_1_1_0; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_1_2() { return cQualifiedNameParserRuleCall_1_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_3() { return cLeftParenthesisKeyword_1_3; }
		
		//pure_exp_list=Pure_exp_list
		public Assignment getPure_exp_listAssignment_1_4() { return cPure_exp_listAssignment_1_4; }
		
		//Pure_exp_list
		public RuleCall getPure_exp_listPure_exp_listParserRuleCall_1_4_0() { return cPure_exp_listPure_exp_listParserRuleCall_1_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_5() { return cRightParenthesisKeyword_1_5; }
		
		//'await'? Pure_exp NEGATION await=ID '(' list+=Pure_exp_list ')'
		public Group getGroup_2() { return cGroup_2; }
		
		//'await'?
		public Keyword getAwaitKeyword_2_0() { return cAwaitKeyword_2_0; }
		
		//Pure_exp
		public RuleCall getPure_expParserRuleCall_2_1() { return cPure_expParserRuleCall_2_1; }
		
		//NEGATION
		public RuleCall getNEGATIONTerminalRuleCall_2_2() { return cNEGATIONTerminalRuleCall_2_2; }
		
		//await=ID
		public Assignment getAwaitAssignment_2_3() { return cAwaitAssignment_2_3; }
		
		//ID
		public RuleCall getAwaitIDTerminalRuleCall_2_3_0() { return cAwaitIDTerminalRuleCall_2_3_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_4() { return cLeftParenthesisKeyword_2_4; }
		
		//list+=Pure_exp_list
		public Assignment getListAssignment_2_5() { return cListAssignment_2_5; }
		
		//Pure_exp_list
		public RuleCall getListPure_exp_listParserRuleCall_2_5_0() { return cListPure_exp_listParserRuleCall_2_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_6() { return cRightParenthesisKeyword_2_6; }
		
		//Pure_exp '.' val=ID '(' list+=Pure_exp_list ')'
		public Group getGroup_3() { return cGroup_3; }
		
		//Pure_exp
		public RuleCall getPure_expParserRuleCall_3_0() { return cPure_expParserRuleCall_3_0; }
		
		//'.'
		public Keyword getFullStopKeyword_3_1() { return cFullStopKeyword_3_1; }
		
		//val=ID
		public Assignment getValAssignment_3_2() { return cValAssignment_3_2; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_3_2_0() { return cValIDTerminalRuleCall_3_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_3() { return cLeftParenthesisKeyword_3_3; }
		
		//list+=Pure_exp_list
		public Assignment getListAssignment_3_4() { return cListAssignment_3_4; }
		
		//Pure_exp_list
		public RuleCall getListPure_exp_listParserRuleCall_3_4_0() { return cListPure_exp_listParserRuleCall_3_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_5() { return cRightParenthesisKeyword_3_5; }
		
		//((Delta_id | 'core') '.')? 'original' '(' list+=Pure_exp_list ')'
		public Group getGroup_4() { return cGroup_4; }
		
		//((Delta_id | 'core') '.')?
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//Delta_id | 'core'
		public Alternatives getAlternatives_4_0_0() { return cAlternatives_4_0_0; }
		
		//Delta_id
		public RuleCall getDelta_idParserRuleCall_4_0_0_0() { return cDelta_idParserRuleCall_4_0_0_0; }
		
		//'core'
		public Keyword getCoreKeyword_4_0_0_1() { return cCoreKeyword_4_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_4_0_1() { return cFullStopKeyword_4_0_1; }
		
		//'original'
		public Keyword getOriginalKeyword_4_1() { return cOriginalKeyword_4_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_2() { return cLeftParenthesisKeyword_4_2; }
		
		//list+=Pure_exp_list
		public Assignment getListAssignment_4_3() { return cListAssignment_4_3; }
		
		//Pure_exp_list
		public RuleCall getListPure_exp_listParserRuleCall_4_3_0() { return cListPure_exp_listParserRuleCall_4_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_4() { return cRightParenthesisKeyword_4_4; }
	}
	public class Delta_idElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Delta_id");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		////Delta ID
		//Delta_id:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class GuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Guard");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cRefAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cRefVar_or_field_refParserRuleCall_0_0_0 = (RuleCall)cRefAssignment_0_0.eContents().get(0);
		private final Keyword cQuestionMarkKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDurationKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cMinAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cMinPure_expParserRuleCall_1_2_0 = (RuleCall)cMinAssignment_1_2.eContents().get(0);
		private final Keyword cCommaKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cMaxAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cMaxPure_expParserRuleCall_1_4_0 = (RuleCall)cMaxAssignment_1_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		private final RuleCall cAndGuardParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////Guard Declaration
		//Guard:
		//	ref=Var_or_field_ref '?'
		//	| 'duration' '(' min=Pure_exp ',' max=Pure_exp ')'
		//	| AndGuard
		//	//| e=Pure_exp// Check this not working,left recursion error remove reference
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref=Var_or_field_ref '?' | 'duration' '(' min=Pure_exp ',' max=Pure_exp ')' | AndGuard
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ref=Var_or_field_ref '?'
		public Group getGroup_0() { return cGroup_0; }
		
		//ref=Var_or_field_ref
		public Assignment getRefAssignment_0_0() { return cRefAssignment_0_0; }
		
		//Var_or_field_ref
		public RuleCall getRefVar_or_field_refParserRuleCall_0_0_0() { return cRefVar_or_field_refParserRuleCall_0_0_0; }
		
		//'?'
		public Keyword getQuestionMarkKeyword_0_1() { return cQuestionMarkKeyword_0_1; }
		
		//'duration' '(' min=Pure_exp ',' max=Pure_exp ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'duration'
		public Keyword getDurationKeyword_1_0() { return cDurationKeyword_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//min=Pure_exp
		public Assignment getMinAssignment_1_2() { return cMinAssignment_1_2; }
		
		//Pure_exp
		public RuleCall getMinPure_expParserRuleCall_1_2_0() { return cMinPure_expParserRuleCall_1_2_0; }
		
		//','
		public Keyword getCommaKeyword_1_3() { return cCommaKeyword_1_3; }
		
		//max=Pure_exp
		public Assignment getMaxAssignment_1_4() { return cMaxAssignment_1_4; }
		
		//Pure_exp
		public RuleCall getMaxPure_expParserRuleCall_1_4_0() { return cMaxPure_expParserRuleCall_1_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_5() { return cRightParenthesisKeyword_1_5; }
		
		//AndGuard
		public RuleCall getAndGuardParserRuleCall_2() { return cAndGuardParserRuleCall_2; }
	}
	public class AndGuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.AndGuard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryGuardParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndGuardLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cOpAmpersandKeyword_1_1_0 = (Keyword)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimaryGuardParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndGuard Guard:
		//	PrimaryGuard ({AndGuard.left=current} op='&' right=PrimaryGuard)*;
		@Override public ParserRule getRule() { return rule; }
		
		//PrimaryGuard ({AndGuard.left=current} op='&' right=PrimaryGuard)*
		public Group getGroup() { return cGroup; }
		
		//PrimaryGuard
		public RuleCall getPrimaryGuardParserRuleCall_0() { return cPrimaryGuardParserRuleCall_0; }
		
		//({AndGuard.left=current} op='&' right=PrimaryGuard)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndGuard.left=current}
		public Action getAndGuardLeftAction_1_0() { return cAndGuardLeftAction_1_0; }
		
		//op='&'
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//'&'
		public Keyword getOpAmpersandKeyword_1_1_0() { return cOpAmpersandKeyword_1_1_0; }
		
		//right=PrimaryGuard
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//PrimaryGuard
		public RuleCall getRightPrimaryGuardParserRuleCall_1_2_0() { return cRightPrimaryGuardParserRuleCall_1_2_0; }
	}
	public class PrimaryGuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.PrimaryGuard");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cGuardParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cGuardAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cGuardPure_expParserRuleCall_1_0 = (RuleCall)cGuardAssignment_1.eContents().get(0);
		
		//PrimaryGuard Guard:
		//	'(' Guard ')' | guard=Pure_exp;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Guard ')' | guard=Pure_exp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' Guard ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Guard
		public RuleCall getGuardParserRuleCall_0_1() { return cGuardParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//guard=Pure_exp
		public Assignment getGuardAssignment_1() { return cGuardAssignment_1; }
		
		//Pure_exp
		public RuleCall getGuardPure_expParserRuleCall_1_0() { return cGuardPure_expParserRuleCall_1_0; }
	}
	public class CasestmtbranchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Casestmtbranch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPatternAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPatternPatternParserRuleCall_0_0 = (RuleCall)cPatternAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStmtAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStmtStmtParserRuleCall_2_0 = (RuleCall)cStmtAssignment_2.eContents().get(0);
		
		////Case statement Branch
		//Casestmtbranch:
		//	pattern=Pattern '=>' stmt=Stmt;
		@Override public ParserRule getRule() { return rule; }
		
		//pattern=Pattern '=>' stmt=Stmt
		public Group getGroup() { return cGroup; }
		
		//pattern=Pattern
		public Assignment getPatternAssignment_0() { return cPatternAssignment_0; }
		
		//Pattern
		public RuleCall getPatternPatternParserRuleCall_0_0() { return cPatternPatternParserRuleCall_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//stmt=Stmt
		public Assignment getStmtAssignment_2() { return cStmtAssignment_2; }
		
		//Stmt
		public RuleCall getStmtStmtParserRuleCall_2_0() { return cStmtStmtParserRuleCall_2_0; }
	}
	public class Trait_usageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Trait_usage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTrait_usageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUsesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTraitUsageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTraitUsageTrait_declCrossReference_2_0 = (CrossReference)cTraitUsageAssignment_2.eContents().get(0);
		private final RuleCall cTraitUsageTrait_declQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cTraitUsageTrait_declCrossReference_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////Trait Usage
		//Trait_usage:
		//	{Trait_usage}
		//	'uses' traitUsage+=[Trait_decl|QualifiedName]* ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{Trait_usage} 'uses' traitUsage+=[Trait_decl|QualifiedName]* ';'
		public Group getGroup() { return cGroup; }
		
		//{Trait_usage}
		public Action getTrait_usageAction_0() { return cTrait_usageAction_0; }
		
		//'uses'
		public Keyword getUsesKeyword_1() { return cUsesKeyword_1; }
		
		//traitUsage+=[Trait_decl|QualifiedName]*
		public Assignment getTraitUsageAssignment_2() { return cTraitUsageAssignment_2; }
		
		//[Trait_decl|QualifiedName]
		public CrossReference getTraitUsageTrait_declCrossReference_2_0() { return cTraitUsageTrait_declCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getTraitUsageTrait_declQualifiedNameParserRuleCall_2_0_1() { return cTraitUsageTrait_declQualifiedNameParserRuleCall_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class Trait_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Trait_expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cTrait_exprAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cMethodAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cMethodMethodParserRuleCall_0_2_0 = (RuleCall)cMethodAssignment_0_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cTraitMethodAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTraitMethodMethodParserRuleCall_1_0 = (RuleCall)cTraitMethodAssignment_1.eContents().get(0);
		private final Assignment cTraitNameAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final CrossReference cTraitNameTrait_declCrossReference_2_0 = (CrossReference)cTraitNameAssignment_2.eContents().get(0);
		private final RuleCall cTraitNameTrait_declQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cTraitNameTrait_declCrossReference_2_0.eContents().get(1);
		private final RuleCall cTrait_Left_exprParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		////Trait Expression CHECK LAST OPTION
		//Trait_expr:
		//	{Trait_expr} '{' method+=Method* '}'
		//	| traitMethod=Method
		//	| traitName=[Trait_decl|QualifiedName] | trait_Left_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//{Trait_expr} '{' method+=Method* '}' | traitMethod=Method | traitName=[Trait_decl|QualifiedName] | trait_Left_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Trait_expr} '{' method+=Method* '}'
		public Group getGroup_0() { return cGroup_0; }
		
		//{Trait_expr}
		public Action getTrait_exprAction_0_0() { return cTrait_exprAction_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0_1() { return cLeftCurlyBracketKeyword_0_1; }
		
		//method+=Method*
		public Assignment getMethodAssignment_0_2() { return cMethodAssignment_0_2; }
		
		//Method
		public RuleCall getMethodMethodParserRuleCall_0_2_0() { return cMethodMethodParserRuleCall_0_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_0_3() { return cRightCurlyBracketKeyword_0_3; }
		
		//traitMethod=Method
		public Assignment getTraitMethodAssignment_1() { return cTraitMethodAssignment_1; }
		
		//Method
		public RuleCall getTraitMethodMethodParserRuleCall_1_0() { return cTraitMethodMethodParserRuleCall_1_0; }
		
		//traitName=[Trait_decl|QualifiedName]
		public Assignment getTraitNameAssignment_2() { return cTraitNameAssignment_2; }
		
		//[Trait_decl|QualifiedName]
		public CrossReference getTraitNameTrait_declCrossReference_2_0() { return cTraitNameTrait_declCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getTraitNameTrait_declQualifiedNameParserRuleCall_2_0_1() { return cTraitNameTrait_declQualifiedNameParserRuleCall_2_0_1; }
		
		//trait_Left_expr
		public RuleCall getTrait_Left_exprParserRuleCall_3() { return cTrait_Left_exprParserRuleCall_3; }
	}
	public class Trait_Left_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.trait_Left_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpTrait_operParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Assignment cTrait_exprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTrait_exprPrimary_Trait_exprParserRuleCall_1_0 = (RuleCall)cTrait_exprAssignment_1.eContents().get(0);
		
		//trait_Left_expr Trait_expr:
		//	op=Trait_oper trait_expr=Primary_Trait_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//op=Trait_oper trait_expr=Primary_Trait_expr
		public Group getGroup() { return cGroup; }
		
		//op=Trait_oper
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//Trait_oper
		public RuleCall getOpTrait_operParserRuleCall_0_0() { return cOpTrait_operParserRuleCall_0_0; }
		
		//trait_expr=Primary_Trait_expr
		public Assignment getTrait_exprAssignment_1() { return cTrait_exprAssignment_1; }
		
		//Primary_Trait_expr
		public RuleCall getTrait_exprPrimary_Trait_exprParserRuleCall_1_0() { return cTrait_exprPrimary_Trait_exprParserRuleCall_1_0; }
	}
	public class Primary_Trait_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Primary_Trait_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTrait_exprParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Primary_Trait_expr Trait_expr:
		//	'{' Trait_expr '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' Trait_expr '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//Trait_expr
		public RuleCall getTrait_exprParserRuleCall_1() { return cTrait_exprParserRuleCall_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class Trait_operElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Trait_oper");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cTrait_operAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cRemovesKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Alternatives cAlternatives_0_2 = (Alternatives)cGroup_0.eContents().get(2);
		private final Assignment cMethodAssignment_0_2_0 = (Assignment)cAlternatives_0_2.eContents().get(0);
		private final CrossReference cMethodMethodsigCrossReference_0_2_0_0 = (CrossReference)cMethodAssignment_0_2_0.eContents().get(0);
		private final RuleCall cMethodMethodsigQualifiedNameParserRuleCall_0_2_0_0_1 = (RuleCall)cMethodMethodsigCrossReference_0_2_0_0.eContents().get(1);
		private final Group cGroup_0_2_1 = (Group)cAlternatives_0_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0_2_1_0 = (Keyword)cGroup_0_2_1.eContents().get(0);
		private final Assignment cMethodsigAssignment_0_2_1_1 = (Assignment)cGroup_0_2_1.eContents().get(1);
		private final CrossReference cMethodsigMethodsigCrossReference_0_2_1_1_0 = (CrossReference)cMethodsigAssignment_0_2_1_1.eContents().get(0);
		private final RuleCall cMethodsigMethodsigQualifiedNameParserRuleCall_0_2_1_1_0_1 = (RuleCall)cMethodsigMethodsigCrossReference_0_2_1_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_0_2_1_2 = (Keyword)cGroup_0_2_1.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cAddsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTrait_exprAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTrait_exprTrait_exprParserRuleCall_1_1_0 = (RuleCall)cTrait_exprAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cModifiesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTrait_expAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTrait_expTrait_exprParserRuleCall_2_1_0 = (RuleCall)cTrait_expAssignment_2_1.eContents().get(0);
		
		////Trait Operation
		//Trait_oper:
		//	{Trait_oper} 'removes' (method=[Methodsig|QualifiedName] | '{' methodsig+=[Methodsig|QualifiedName]* '}') | 'adds'
		//	trait_expr=Trait_expr
		//	| 'modifies' trait_exp=Trait_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//{Trait_oper} 'removes' (method=[Methodsig|QualifiedName] | '{' methodsig+=[Methodsig|QualifiedName]* '}') | 'adds'
		//trait_expr=Trait_expr | 'modifies' trait_exp=Trait_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Trait_oper} 'removes' (method=[Methodsig|QualifiedName] | '{' methodsig+=[Methodsig|QualifiedName]* '}')
		public Group getGroup_0() { return cGroup_0; }
		
		//{Trait_oper}
		public Action getTrait_operAction_0_0() { return cTrait_operAction_0_0; }
		
		//'removes'
		public Keyword getRemovesKeyword_0_1() { return cRemovesKeyword_0_1; }
		
		//method=[Methodsig|QualifiedName] | '{' methodsig+=[Methodsig|QualifiedName]* '}'
		public Alternatives getAlternatives_0_2() { return cAlternatives_0_2; }
		
		//method=[Methodsig|QualifiedName]
		public Assignment getMethodAssignment_0_2_0() { return cMethodAssignment_0_2_0; }
		
		//[Methodsig|QualifiedName]
		public CrossReference getMethodMethodsigCrossReference_0_2_0_0() { return cMethodMethodsigCrossReference_0_2_0_0; }
		
		//QualifiedName
		public RuleCall getMethodMethodsigQualifiedNameParserRuleCall_0_2_0_0_1() { return cMethodMethodsigQualifiedNameParserRuleCall_0_2_0_0_1; }
		
		//'{' methodsig+=[Methodsig|QualifiedName]* '}'
		public Group getGroup_0_2_1() { return cGroup_0_2_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0_2_1_0() { return cLeftCurlyBracketKeyword_0_2_1_0; }
		
		//methodsig+=[Methodsig|QualifiedName]*
		public Assignment getMethodsigAssignment_0_2_1_1() { return cMethodsigAssignment_0_2_1_1; }
		
		//[Methodsig|QualifiedName]
		public CrossReference getMethodsigMethodsigCrossReference_0_2_1_1_0() { return cMethodsigMethodsigCrossReference_0_2_1_1_0; }
		
		//QualifiedName
		public RuleCall getMethodsigMethodsigQualifiedNameParserRuleCall_0_2_1_1_0_1() { return cMethodsigMethodsigQualifiedNameParserRuleCall_0_2_1_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_0_2_1_2() { return cRightCurlyBracketKeyword_0_2_1_2; }
		
		//'adds' trait_expr=Trait_expr
		public Group getGroup_1() { return cGroup_1; }
		
		//'adds'
		public Keyword getAddsKeyword_1_0() { return cAddsKeyword_1_0; }
		
		//trait_expr=Trait_expr
		public Assignment getTrait_exprAssignment_1_1() { return cTrait_exprAssignment_1_1; }
		
		//Trait_expr
		public RuleCall getTrait_exprTrait_exprParserRuleCall_1_1_0() { return cTrait_exprTrait_exprParserRuleCall_1_1_0; }
		
		//'modifies' trait_exp=Trait_expr
		public Group getGroup_2() { return cGroup_2; }
		
		//'modifies'
		public Keyword getModifiesKeyword_2_0() { return cModifiesKeyword_2_0; }
		
		//trait_exp=Trait_expr
		public Assignment getTrait_expAssignment_2_1() { return cTrait_expAssignment_2_1; }
		
		//Trait_expr
		public RuleCall getTrait_expTrait_exprParserRuleCall_2_1_0() { return cTrait_expTrait_exprParserRuleCall_2_1_0; }
	}
	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cType_useAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cType_useType_useParserRuleCall_0_0 = (RuleCall)cType_useAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cParamlistAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParamlistParam_listParserRuleCall_2_0 = (RuleCall)cParamlistAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStmtAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStmtStmtParserRuleCall_4_0 = (RuleCall)cStmtAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////Method Declaration
		//Method:
		//	type_use=Type_use
		//	name=ID paramlist=Param_list '{' stmt+=Stmt* '}';
		@Override public ParserRule getRule() { return rule; }
		
		////annotations=Annotations 
		//type_use=Type_use name=ID paramlist=Param_list '{' stmt+=Stmt* '}'
		public Group getGroup() { return cGroup; }
		
		////annotations=Annotations 
		//type_use=Type_use
		public Assignment getType_useAssignment_0() { return cType_useAssignment_0; }
		
		//Type_use
		public RuleCall getType_useType_useParserRuleCall_0_0() { return cType_useType_useParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//paramlist=Param_list
		public Assignment getParamlistAssignment_2() { return cParamlistAssignment_2; }
		
		//Param_list
		public RuleCall getParamlistParam_listParserRuleCall_2_0() { return cParamlistParam_listParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//stmt+=Stmt*
		public Assignment getStmtAssignment_4() { return cStmtAssignment_4; }
		
		//Stmt
		public RuleCall getStmtStmtParserRuleCall_4_0() { return cStmtStmtParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class Trait_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Trait_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTraitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTraitExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTraitExprTrait_exprParserRuleCall_3_0 = (RuleCall)cTraitExprAssignment_3.eContents().get(0);
		
		////Trait Declaration
		//Trait_decl:
		//	'trait' name=ID '=' traitExpr=Trait_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//'trait' name=ID '=' traitExpr=Trait_expr
		public Group getGroup() { return cGroup; }
		
		//'trait'
		public Keyword getTraitKeyword_0() { return cTraitKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//traitExpr=Trait_expr
		public Assignment getTraitExprAssignment_3() { return cTraitExprAssignment_3; }
		
		//Trait_expr
		public RuleCall getTraitExprTrait_exprParserRuleCall_3_0() { return cTraitExprTrait_exprParserRuleCall_3_0; }
	}
	public class Main_blockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Main_block");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMain_blockAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStmtAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStmtStmtParserRuleCall_2_0 = (RuleCall)cStmtAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////Main Block Remove annotation uncommented solve the error later
		//Main_block:
		//	{Main_block} //annotations=Annotations
		//	'{' stmt+=Stmt* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Main_block} //annotations=Annotations
		//'{' stmt+=Stmt* '}'
		public Group getGroup() { return cGroup; }
		
		//{Main_block}
		public Action getMain_blockAction_0() { return cMain_blockAction_0; }
		
		////annotations=Annotations
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//stmt+=Stmt*
		public Assignment getStmtAssignment_2() { return cStmtAssignment_2; }
		
		//Stmt
		public RuleCall getStmtStmtParserRuleCall_2_0() { return cStmtStmtParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class Delta_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Delta_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeltaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPDelta_paramParserRuleCall_2_1_0 = (RuleCall)cPAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cPAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cPDelta_paramParserRuleCall_2_2_1_0 = (RuleCall)cPAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDelta_accessAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDelta_accessDelta_accessParserRuleCall_4_0 = (RuleCall)cDelta_accessAssignment_4.eContents().get(0);
		private final Assignment cModule_modifierAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cModule_modifierModule_modifierParserRuleCall_5_0 = (RuleCall)cModule_modifierAssignment_5.eContents().get(0);
		
		///*
		// * Delta Declaration Module Start 
		// * 
		// * 
		// */ Delta_decl:
		//	'delta' name=ID ('(' p+=Delta_param (',' p+=Delta_param)* ')')? ';'
		//	delta_access+=Delta_access* module_modifier+=Module_modifier*;
		@Override public ParserRule getRule() { return rule; }
		
		//'delta' name=ID ('(' p+=Delta_param (',' p+=Delta_param)* ')')? ';' delta_access+=Delta_access*
		//module_modifier+=Module_modifier*
		public Group getGroup() { return cGroup; }
		
		//'delta'
		public Keyword getDeltaKeyword_0() { return cDeltaKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('(' p+=Delta_param (',' p+=Delta_param)* ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//p+=Delta_param
		public Assignment getPAssignment_2_1() { return cPAssignment_2_1; }
		
		//Delta_param
		public RuleCall getPDelta_paramParserRuleCall_2_1_0() { return cPDelta_paramParserRuleCall_2_1_0; }
		
		//(',' p+=Delta_param)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//p+=Delta_param
		public Assignment getPAssignment_2_2_1() { return cPAssignment_2_2_1; }
		
		//Delta_param
		public RuleCall getPDelta_paramParserRuleCall_2_2_1_0() { return cPDelta_paramParserRuleCall_2_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
		
		//delta_access+=Delta_access*
		public Assignment getDelta_accessAssignment_4() { return cDelta_accessAssignment_4; }
		
		//Delta_access
		public RuleCall getDelta_accessDelta_accessParserRuleCall_4_0() { return cDelta_accessDelta_accessParserRuleCall_4_0; }
		
		//module_modifier+=Module_modifier*
		public Assignment getModule_modifierAssignment_5() { return cModule_modifierAssignment_5; }
		
		//Module_modifier
		public RuleCall getModule_modifierModule_modifierParserRuleCall_5_0() { return cModule_modifierModule_modifierParserRuleCall_5_0; }
	}
	public class Delta_paramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Delta_param");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParam_declParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cHas_conditionParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Delta_param:
		//	Param_decl | QualifiedName Has_condition;
		@Override public ParserRule getRule() { return rule; }
		
		//Param_decl | QualifiedName Has_condition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Param_decl
		public RuleCall getParam_declParserRuleCall_0() { return cParam_declParserRuleCall_0; }
		
		//QualifiedName Has_condition
		public Group getGroup_1() { return cGroup_1; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_1_0() { return cQualifiedNameParserRuleCall_1_0; }
		
		//Has_condition
		public RuleCall getHas_conditionParserRuleCall_1_1() { return cHas_conditionParserRuleCall_1_1; }
	}
	public class Has_conditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Has_condition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHasFieldKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFieldAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cFieldField_declCrossReference_0_1_0 = (CrossReference)cFieldAssignment_0_1.eContents().get(0);
		private final RuleCall cFieldField_declIDTerminalRuleCall_0_1_0_1 = (RuleCall)cFieldField_declCrossReference_0_1_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cHasMethodKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMethodAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cMethodMethodsigCrossReference_1_1_0 = (CrossReference)cMethodAssignment_1_1.eContents().get(0);
		private final RuleCall cMethodMethodsigIDTerminalRuleCall_1_1_0_1 = (RuleCall)cMethodMethodsigCrossReference_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cHasInterfaceKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInterfaceAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInterfaceInterface_declCrossReference_2_1_0 = (CrossReference)cInterfaceAssignment_2_1.eContents().get(0);
		private final RuleCall cInterfaceInterface_declIDTerminalRuleCall_2_1_0_1 = (RuleCall)cInterfaceInterface_declCrossReference_2_1_0.eContents().get(1);
		
		//Has_condition:
		//	'hasField' field=[Field_decl] | 'hasMethod' method=[Methodsig] | 'hasInterface' interface=[Interface_decl];
		@Override public ParserRule getRule() { return rule; }
		
		//'hasField' field=[Field_decl] | 'hasMethod' method=[Methodsig] | 'hasInterface' interface=[Interface_decl]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'hasField' field=[Field_decl]
		public Group getGroup_0() { return cGroup_0; }
		
		//'hasField'
		public Keyword getHasFieldKeyword_0_0() { return cHasFieldKeyword_0_0; }
		
		//field=[Field_decl]
		public Assignment getFieldAssignment_0_1() { return cFieldAssignment_0_1; }
		
		//[Field_decl]
		public CrossReference getFieldField_declCrossReference_0_1_0() { return cFieldField_declCrossReference_0_1_0; }
		
		//ID
		public RuleCall getFieldField_declIDTerminalRuleCall_0_1_0_1() { return cFieldField_declIDTerminalRuleCall_0_1_0_1; }
		
		//'hasMethod' method=[Methodsig]
		public Group getGroup_1() { return cGroup_1; }
		
		//'hasMethod'
		public Keyword getHasMethodKeyword_1_0() { return cHasMethodKeyword_1_0; }
		
		//method=[Methodsig]
		public Assignment getMethodAssignment_1_1() { return cMethodAssignment_1_1; }
		
		//[Methodsig]
		public CrossReference getMethodMethodsigCrossReference_1_1_0() { return cMethodMethodsigCrossReference_1_1_0; }
		
		//ID
		public RuleCall getMethodMethodsigIDTerminalRuleCall_1_1_0_1() { return cMethodMethodsigIDTerminalRuleCall_1_1_0_1; }
		
		//'hasInterface' interface=[Interface_decl]
		public Group getGroup_2() { return cGroup_2; }
		
		//'hasInterface'
		public Keyword getHasInterfaceKeyword_2_0() { return cHasInterfaceKeyword_2_0; }
		
		//interface=[Interface_decl]
		public Assignment getInterfaceAssignment_2_1() { return cInterfaceAssignment_2_1; }
		
		//[Interface_decl]
		public CrossReference getInterfaceInterface_declCrossReference_2_1_0() { return cInterfaceInterface_declCrossReference_2_1_0; }
		
		//ID
		public RuleCall getInterfaceInterface_declIDTerminalRuleCall_2_1_0_1() { return cInterfaceInterface_declIDTerminalRuleCall_2_1_0_1; }
	}
	public class Delta_accessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Delta_access");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUsesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cModule_refAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cModule_refModule_declCrossReference_1_0 = (CrossReference)cModule_refAssignment_1.eContents().get(0);
		private final RuleCall cModule_refModule_declIDTerminalRuleCall_1_0_1 = (RuleCall)cModule_refModule_declCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Delta_access:
		//	'uses' module_ref=[Module_decl] ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'uses' module_ref=[Module_decl] ';'
		public Group getGroup() { return cGroup; }
		
		//'uses'
		public Keyword getUsesKeyword_0() { return cUsesKeyword_0; }
		
		//module_ref=[Module_decl]
		public Assignment getModule_refAssignment_1() { return cModule_refAssignment_1; }
		
		//[Module_decl]
		public CrossReference getModule_refModule_declCrossReference_1_0() { return cModule_refModule_declCrossReference_1_0; }
		
		//ID
		public RuleCall getModule_refModule_declIDTerminalRuleCall_1_0_1() { return cModule_refModule_declIDTerminalRuleCall_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class Module_modifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Module_modifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFunctional_modifierParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOO_modifierParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNamespace_modifierParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Module_modifier:
		//	Functional_modifier
		//	| OO_modifier
		//	| Namespace_modifier;
		@Override public ParserRule getRule() { return rule; }
		
		//Functional_modifier | OO_modifier | Namespace_modifier
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Functional_modifier
		public RuleCall getFunctional_modifierParserRuleCall_0() { return cFunctional_modifierParserRuleCall_0; }
		
		//OO_modifier
		public RuleCall getOO_modifierParserRuleCall_1() { return cOO_modifierParserRuleCall_1; }
		
		//Namespace_modifier
		public RuleCall getNamespace_modifierParserRuleCall_2() { return cNamespace_modifierParserRuleCall_2; }
	}
	public class Functional_modifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Functional_modifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cAddsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final RuleCall cFunction_declParserRuleCall_0_1_0 = (RuleCall)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cDataType_declParserRuleCall_0_1_1 = (RuleCall)cAlternatives_0_1.eContents().get(1);
		private final RuleCall cTypesyn_declParserRuleCall_0_1_2 = (RuleCall)cAlternatives_0_1.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cModifiesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cTypesyn_declParserRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cDataType_declParserRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		
		//Functional_modifier:
		//	'adds' (Function_decl | DataType_decl | Typesyn_decl) | 'modifies' (Typesyn_decl | DataType_decl);
		@Override public ParserRule getRule() { return rule; }
		
		//'adds' (Function_decl | DataType_decl | Typesyn_decl) | 'modifies' (Typesyn_decl | DataType_decl)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'adds' (Function_decl | DataType_decl | Typesyn_decl)
		public Group getGroup_0() { return cGroup_0; }
		
		//'adds'
		public Keyword getAddsKeyword_0_0() { return cAddsKeyword_0_0; }
		
		//Function_decl | DataType_decl | Typesyn_decl
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }
		
		//Function_decl
		public RuleCall getFunction_declParserRuleCall_0_1_0() { return cFunction_declParserRuleCall_0_1_0; }
		
		//DataType_decl
		public RuleCall getDataType_declParserRuleCall_0_1_1() { return cDataType_declParserRuleCall_0_1_1; }
		
		//Typesyn_decl
		public RuleCall getTypesyn_declParserRuleCall_0_1_2() { return cTypesyn_declParserRuleCall_0_1_2; }
		
		//'modifies' (Typesyn_decl | DataType_decl)
		public Group getGroup_1() { return cGroup_1; }
		
		//'modifies'
		public Keyword getModifiesKeyword_1_0() { return cModifiesKeyword_1_0; }
		
		//Typesyn_decl | DataType_decl
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//Typesyn_decl
		public RuleCall getTypesyn_declParserRuleCall_1_1_0() { return cTypesyn_declParserRuleCall_1_1_0; }
		
		//DataType_decl
		public RuleCall getDataType_declParserRuleCall_1_1_1() { return cDataType_declParserRuleCall_1_1_1; }
	}
	public class OO_modifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.OO_modifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cOO_modifierAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cAddsKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Alternatives cAlternatives_0_2 = (Alternatives)cGroup_0.eContents().get(2);
		private final Assignment cClass_declAssignment_0_2_0 = (Assignment)cAlternatives_0_2.eContents().get(0);
		private final RuleCall cClass_declClass_declParserRuleCall_0_2_0_0 = (RuleCall)cClass_declAssignment_0_2_0.eContents().get(0);
		private final Assignment cInterface_declAssignment_0_2_1 = (Assignment)cAlternatives_0_2.eContents().get(1);
		private final RuleCall cInterface_declInterface_declParserRuleCall_0_2_1_0 = (RuleCall)cInterface_declAssignment_0_2_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cRemovesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Group cGroup_1_1_0 = (Group)cAlternatives_1_1.eContents().get(0);
		private final Keyword cClassKeyword_1_1_0_0 = (Keyword)cGroup_1_1_0.eContents().get(0);
		private final Assignment cClassAssignment_1_1_0_1 = (Assignment)cGroup_1_1_0.eContents().get(1);
		private final CrossReference cClassClass_declCrossReference_1_1_0_1_0 = (CrossReference)cClassAssignment_1_1_0_1.eContents().get(0);
		private final RuleCall cClassClass_declQualifiedNameParserRuleCall_1_1_0_1_0_1 = (RuleCall)cClassClass_declCrossReference_1_1_0_1_0.eContents().get(1);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final Keyword cInterfaceKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cIntefaceAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final CrossReference cIntefaceInterface_declCrossReference_1_1_1_1_0 = (CrossReference)cIntefaceAssignment_1_1_1_1.eContents().get(0);
		private final RuleCall cIntefaceInterface_declQualifiedNameParserRuleCall_1_1_1_1_0_1 = (RuleCall)cIntefaceInterface_declCrossReference_1_1_1_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cModifiesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Alternatives cAlternatives_2_1 = (Alternatives)cGroup_2.eContents().get(1);
		private final Group cGroup_2_1_0 = (Group)cAlternatives_2_1.eContents().get(0);
		private final Keyword cClassKeyword_2_1_0_0 = (Keyword)cGroup_2_1_0.eContents().get(0);
		private final Assignment cClassAssignment_2_1_0_1 = (Assignment)cGroup_2_1_0.eContents().get(1);
		private final CrossReference cClassClass_declCrossReference_2_1_0_1_0 = (CrossReference)cClassAssignment_2_1_0_1.eContents().get(0);
		private final RuleCall cClassClass_declQualifiedNameParserRuleCall_2_1_0_1_0_1 = (RuleCall)cClassClass_declCrossReference_2_1_0_1_0.eContents().get(1);
		private final Group cGroup_2_1_0_2 = (Group)cGroup_2_1_0.eContents().get(2);
		private final Keyword cAddsKeyword_2_1_0_2_0 = (Keyword)cGroup_2_1_0_2.eContents().get(0);
		private final Assignment cInterfaceNameAssignment_2_1_0_2_1 = (Assignment)cGroup_2_1_0_2.eContents().get(1);
		private final RuleCall cInterfaceNameInterface_declParserRuleCall_2_1_0_2_1_0 = (RuleCall)cInterfaceNameAssignment_2_1_0_2_1.eContents().get(0);
		private final Group cGroup_2_1_0_2_2 = (Group)cGroup_2_1_0_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_1_0_2_2_0 = (Keyword)cGroup_2_1_0_2_2.eContents().get(0);
		private final Assignment cInterfaceNameAssignment_2_1_0_2_2_1 = (Assignment)cGroup_2_1_0_2_2.eContents().get(1);
		private final RuleCall cInterfaceNameInterface_declParserRuleCall_2_1_0_2_2_1_0 = (RuleCall)cInterfaceNameAssignment_2_1_0_2_2_1.eContents().get(0);
		private final Group cGroup_2_1_0_3 = (Group)cGroup_2_1_0.eContents().get(3);
		private final Keyword cRemovesKeyword_2_1_0_3_0 = (Keyword)cGroup_2_1_0_3.eContents().get(0);
		private final Assignment cRemovedInterfaceAssignment_2_1_0_3_1 = (Assignment)cGroup_2_1_0_3.eContents().get(1);
		private final CrossReference cRemovedInterfaceInterface_declCrossReference_2_1_0_3_1_0 = (CrossReference)cRemovedInterfaceAssignment_2_1_0_3_1.eContents().get(0);
		private final RuleCall cRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_1_0_1 = (RuleCall)cRemovedInterfaceInterface_declCrossReference_2_1_0_3_1_0.eContents().get(1);
		private final Group cGroup_2_1_0_3_2 = (Group)cGroup_2_1_0_3.eContents().get(2);
		private final Keyword cCommaKeyword_2_1_0_3_2_0 = (Keyword)cGroup_2_1_0_3_2.eContents().get(0);
		private final Assignment cRemovedInterfaceAssignment_2_1_0_3_2_1 = (Assignment)cGroup_2_1_0_3_2.eContents().get(1);
		private final CrossReference cRemovedInterfaceInterface_declCrossReference_2_1_0_3_2_1_0 = (CrossReference)cRemovedInterfaceAssignment_2_1_0_3_2_1.eContents().get(0);
		private final RuleCall cRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_2_1_0_1 = (RuleCall)cRemovedInterfaceInterface_declCrossReference_2_1_0_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2_1_0_4 = (Keyword)cGroup_2_1_0.eContents().get(4);
		private final Assignment cClass_modifier_fragmentAssignment_2_1_0_5 = (Assignment)cGroup_2_1_0.eContents().get(5);
		private final RuleCall cClass_modifier_fragmentClass_modifier_fragmentParserRuleCall_2_1_0_5_0 = (RuleCall)cClass_modifier_fragmentAssignment_2_1_0_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_1_0_6 = (Keyword)cGroup_2_1_0.eContents().get(6);
		private final Group cGroup_2_1_1 = (Group)cAlternatives_2_1.eContents().get(1);
		private final Keyword cInterfaceKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cInterfaceAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final CrossReference cInterfaceInterface_declCrossReference_2_1_1_1_0 = (CrossReference)cInterfaceAssignment_2_1_1_1.eContents().get(0);
		private final RuleCall cInterfaceInterface_declQualifiedNameParserRuleCall_2_1_1_1_0_1 = (RuleCall)cInterfaceInterface_declCrossReference_2_1_1_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2_1_1_2 = (Keyword)cGroup_2_1_1.eContents().get(2);
		private final Assignment cInterface_modifier_fragmentAssignment_2_1_1_3 = (Assignment)cGroup_2_1_1.eContents().get(3);
		private final RuleCall cInterface_modifier_fragmentInterface_modifier_fragmentParserRuleCall_2_1_1_3_0 = (RuleCall)cInterface_modifier_fragmentAssignment_2_1_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_1_1_4 = (Keyword)cGroup_2_1_1.eContents().get(4);
		
		//OO_modifier:
		//	{OO_modifier} 'adds' (class_decl=Class_decl | interface_decl=Interface_decl) | 'removes' ('class'
		//	class=[Class_decl|QualifiedName] | 'interface' inteface=[Interface_decl|QualifiedName]) ';'
		//	| 'modifies' ('class' class=[Class_decl|QualifiedName] ('adds' interfaceName+=Interface_decl (','
		//	interfaceName+=Interface_decl)*)? ('removes' removedInterface+=[Interface_decl|QualifiedName] (','
		//	removedInterface+=[Interface_decl|QualifiedName])*)?
		//	'{' class_modifier_fragment+=Class_modifier_fragment* '}' | 'interface' interface=[Interface_decl|QualifiedName]
		//	'{' interface_modifier_fragment+=Interface_modifier_fragment* '}');
		@Override public ParserRule getRule() { return rule; }
		
		//{OO_modifier} 'adds' (class_decl=Class_decl | interface_decl=Interface_decl) | 'removes' ('class'
		//class=[Class_decl|QualifiedName] | 'interface' inteface=[Interface_decl|QualifiedName]) ';' | 'modifies' ('class'
		//class=[Class_decl|QualifiedName] ('adds' interfaceName+=Interface_decl (',' interfaceName+=Interface_decl)*)?
		//('removes' removedInterface+=[Interface_decl|QualifiedName] (',' removedInterface+=[Interface_decl|QualifiedName])*)?
		//'{' class_modifier_fragment+=Class_modifier_fragment* '}' | 'interface' interface=[Interface_decl|QualifiedName] '{'
		//interface_modifier_fragment+=Interface_modifier_fragment* '}')
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{OO_modifier} 'adds' (class_decl=Class_decl | interface_decl=Interface_decl)
		public Group getGroup_0() { return cGroup_0; }
		
		//{OO_modifier}
		public Action getOO_modifierAction_0_0() { return cOO_modifierAction_0_0; }
		
		//'adds'
		public Keyword getAddsKeyword_0_1() { return cAddsKeyword_0_1; }
		
		//class_decl=Class_decl | interface_decl=Interface_decl
		public Alternatives getAlternatives_0_2() { return cAlternatives_0_2; }
		
		//class_decl=Class_decl
		public Assignment getClass_declAssignment_0_2_0() { return cClass_declAssignment_0_2_0; }
		
		//Class_decl
		public RuleCall getClass_declClass_declParserRuleCall_0_2_0_0() { return cClass_declClass_declParserRuleCall_0_2_0_0; }
		
		//interface_decl=Interface_decl
		public Assignment getInterface_declAssignment_0_2_1() { return cInterface_declAssignment_0_2_1; }
		
		//Interface_decl
		public RuleCall getInterface_declInterface_declParserRuleCall_0_2_1_0() { return cInterface_declInterface_declParserRuleCall_0_2_1_0; }
		
		//'removes' ('class' class=[Class_decl|QualifiedName] | 'interface' inteface=[Interface_decl|QualifiedName]) ';'
		public Group getGroup_1() { return cGroup_1; }
		
		//'removes'
		public Keyword getRemovesKeyword_1_0() { return cRemovesKeyword_1_0; }
		
		//'class' class=[Class_decl|QualifiedName] | 'interface' inteface=[Interface_decl|QualifiedName]
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//'class' class=[Class_decl|QualifiedName]
		public Group getGroup_1_1_0() { return cGroup_1_1_0; }
		
		//'class'
		public Keyword getClassKeyword_1_1_0_0() { return cClassKeyword_1_1_0_0; }
		
		//class=[Class_decl|QualifiedName]
		public Assignment getClassAssignment_1_1_0_1() { return cClassAssignment_1_1_0_1; }
		
		//[Class_decl|QualifiedName]
		public CrossReference getClassClass_declCrossReference_1_1_0_1_0() { return cClassClass_declCrossReference_1_1_0_1_0; }
		
		//QualifiedName
		public RuleCall getClassClass_declQualifiedNameParserRuleCall_1_1_0_1_0_1() { return cClassClass_declQualifiedNameParserRuleCall_1_1_0_1_0_1; }
		
		//'interface' inteface=[Interface_decl|QualifiedName]
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//'interface'
		public Keyword getInterfaceKeyword_1_1_1_0() { return cInterfaceKeyword_1_1_1_0; }
		
		//inteface=[Interface_decl|QualifiedName]
		public Assignment getIntefaceAssignment_1_1_1_1() { return cIntefaceAssignment_1_1_1_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getIntefaceInterface_declCrossReference_1_1_1_1_0() { return cIntefaceInterface_declCrossReference_1_1_1_1_0; }
		
		//QualifiedName
		public RuleCall getIntefaceInterface_declQualifiedNameParserRuleCall_1_1_1_1_0_1() { return cIntefaceInterface_declQualifiedNameParserRuleCall_1_1_1_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_1_2() { return cSemicolonKeyword_1_2; }
		
		//'modifies' ('class' class=[Class_decl|QualifiedName] ('adds' interfaceName+=Interface_decl (','
		//interfaceName+=Interface_decl)*)? ('removes' removedInterface+=[Interface_decl|QualifiedName] (','
		//removedInterface+=[Interface_decl|QualifiedName])*)? '{' class_modifier_fragment+=Class_modifier_fragment* '}' |
		//'interface' interface=[Interface_decl|QualifiedName] '{' interface_modifier_fragment+=Interface_modifier_fragment* '}')
		public Group getGroup_2() { return cGroup_2; }
		
		//'modifies'
		public Keyword getModifiesKeyword_2_0() { return cModifiesKeyword_2_0; }
		
		//'class' class=[Class_decl|QualifiedName] ('adds' interfaceName+=Interface_decl (',' interfaceName+=Interface_decl)*)?
		//('removes' removedInterface+=[Interface_decl|QualifiedName] (',' removedInterface+=[Interface_decl|QualifiedName])*)?
		//'{' class_modifier_fragment+=Class_modifier_fragment* '}' | 'interface' interface=[Interface_decl|QualifiedName] '{'
		//interface_modifier_fragment+=Interface_modifier_fragment* '}'
		public Alternatives getAlternatives_2_1() { return cAlternatives_2_1; }
		
		//'class' class=[Class_decl|QualifiedName] ('adds' interfaceName+=Interface_decl (',' interfaceName+=Interface_decl)*)?
		//('removes' removedInterface+=[Interface_decl|QualifiedName] (',' removedInterface+=[Interface_decl|QualifiedName])*)?
		//'{' class_modifier_fragment+=Class_modifier_fragment* '}'
		public Group getGroup_2_1_0() { return cGroup_2_1_0; }
		
		//'class'
		public Keyword getClassKeyword_2_1_0_0() { return cClassKeyword_2_1_0_0; }
		
		//class=[Class_decl|QualifiedName]
		public Assignment getClassAssignment_2_1_0_1() { return cClassAssignment_2_1_0_1; }
		
		//[Class_decl|QualifiedName]
		public CrossReference getClassClass_declCrossReference_2_1_0_1_0() { return cClassClass_declCrossReference_2_1_0_1_0; }
		
		//QualifiedName
		public RuleCall getClassClass_declQualifiedNameParserRuleCall_2_1_0_1_0_1() { return cClassClass_declQualifiedNameParserRuleCall_2_1_0_1_0_1; }
		
		//('adds' interfaceName+=Interface_decl (',' interfaceName+=Interface_decl)*)?
		public Group getGroup_2_1_0_2() { return cGroup_2_1_0_2; }
		
		//'adds'
		public Keyword getAddsKeyword_2_1_0_2_0() { return cAddsKeyword_2_1_0_2_0; }
		
		//interfaceName+=Interface_decl
		public Assignment getInterfaceNameAssignment_2_1_0_2_1() { return cInterfaceNameAssignment_2_1_0_2_1; }
		
		//Interface_decl
		public RuleCall getInterfaceNameInterface_declParserRuleCall_2_1_0_2_1_0() { return cInterfaceNameInterface_declParserRuleCall_2_1_0_2_1_0; }
		
		//(',' interfaceName+=Interface_decl)*
		public Group getGroup_2_1_0_2_2() { return cGroup_2_1_0_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_1_0_2_2_0() { return cCommaKeyword_2_1_0_2_2_0; }
		
		//interfaceName+=Interface_decl
		public Assignment getInterfaceNameAssignment_2_1_0_2_2_1() { return cInterfaceNameAssignment_2_1_0_2_2_1; }
		
		//Interface_decl
		public RuleCall getInterfaceNameInterface_declParserRuleCall_2_1_0_2_2_1_0() { return cInterfaceNameInterface_declParserRuleCall_2_1_0_2_2_1_0; }
		
		//('removes' removedInterface+=[Interface_decl|QualifiedName] (',' removedInterface+=[Interface_decl|QualifiedName])*)?
		public Group getGroup_2_1_0_3() { return cGroup_2_1_0_3; }
		
		//'removes'
		public Keyword getRemovesKeyword_2_1_0_3_0() { return cRemovesKeyword_2_1_0_3_0; }
		
		//removedInterface+=[Interface_decl|QualifiedName]
		public Assignment getRemovedInterfaceAssignment_2_1_0_3_1() { return cRemovedInterfaceAssignment_2_1_0_3_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getRemovedInterfaceInterface_declCrossReference_2_1_0_3_1_0() { return cRemovedInterfaceInterface_declCrossReference_2_1_0_3_1_0; }
		
		//QualifiedName
		public RuleCall getRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_1_0_1() { return cRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_1_0_1; }
		
		//(',' removedInterface+=[Interface_decl|QualifiedName])*
		public Group getGroup_2_1_0_3_2() { return cGroup_2_1_0_3_2; }
		
		//','
		public Keyword getCommaKeyword_2_1_0_3_2_0() { return cCommaKeyword_2_1_0_3_2_0; }
		
		//removedInterface+=[Interface_decl|QualifiedName]
		public Assignment getRemovedInterfaceAssignment_2_1_0_3_2_1() { return cRemovedInterfaceAssignment_2_1_0_3_2_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getRemovedInterfaceInterface_declCrossReference_2_1_0_3_2_1_0() { return cRemovedInterfaceInterface_declCrossReference_2_1_0_3_2_1_0; }
		
		//QualifiedName
		public RuleCall getRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_2_1_0_1() { return cRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_1_0_4() { return cLeftCurlyBracketKeyword_2_1_0_4; }
		
		//class_modifier_fragment+=Class_modifier_fragment*
		public Assignment getClass_modifier_fragmentAssignment_2_1_0_5() { return cClass_modifier_fragmentAssignment_2_1_0_5; }
		
		//Class_modifier_fragment
		public RuleCall getClass_modifier_fragmentClass_modifier_fragmentParserRuleCall_2_1_0_5_0() { return cClass_modifier_fragmentClass_modifier_fragmentParserRuleCall_2_1_0_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_1_0_6() { return cRightCurlyBracketKeyword_2_1_0_6; }
		
		//'interface' interface=[Interface_decl|QualifiedName] '{' interface_modifier_fragment+=Interface_modifier_fragment* '}'
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }
		
		//'interface'
		public Keyword getInterfaceKeyword_2_1_1_0() { return cInterfaceKeyword_2_1_1_0; }
		
		//interface=[Interface_decl|QualifiedName]
		public Assignment getInterfaceAssignment_2_1_1_1() { return cInterfaceAssignment_2_1_1_1; }
		
		//[Interface_decl|QualifiedName]
		public CrossReference getInterfaceInterface_declCrossReference_2_1_1_1_0() { return cInterfaceInterface_declCrossReference_2_1_1_1_0; }
		
		//QualifiedName
		public RuleCall getInterfaceInterface_declQualifiedNameParserRuleCall_2_1_1_1_0_1() { return cInterfaceInterface_declQualifiedNameParserRuleCall_2_1_1_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_1_1_2() { return cLeftCurlyBracketKeyword_2_1_1_2; }
		
		//interface_modifier_fragment+=Interface_modifier_fragment*
		public Assignment getInterface_modifier_fragmentAssignment_2_1_1_3() { return cInterface_modifier_fragmentAssignment_2_1_1_3; }
		
		//Interface_modifier_fragment
		public RuleCall getInterface_modifier_fragmentInterface_modifier_fragmentParserRuleCall_2_1_1_3_0() { return cInterface_modifier_fragmentInterface_modifier_fragmentParserRuleCall_2_1_1_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_1_1_4() { return cRightCurlyBracketKeyword_2_1_1_4; }
	}
	public class Class_modifier_fragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Class_modifier_fragment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cAddsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final RuleCall cField_declParserRuleCall_0_1_0 = (RuleCall)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cTrait_exprParserRuleCall_0_1_1 = (RuleCall)cAlternatives_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cRemovesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cField_declParserRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cMethodsigParserRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Group cGroup_1_1_2 = (Group)cAlternatives_1_1.eContents().get(2);
		private final Action cClass_modifier_fragmentAction_1_1_2_0 = (Action)cGroup_1_1_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1_1_2_1 = (Keyword)cGroup_1_1_2.eContents().get(1);
		private final Assignment cMethodsigAssignment_1_1_2_2 = (Assignment)cGroup_1_1_2.eContents().get(2);
		private final RuleCall cMethodsigMethodsigParserRuleCall_1_1_2_2_0 = (RuleCall)cMethodsigAssignment_1_1_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_1_2_3 = (Keyword)cGroup_1_1_2.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cModifiesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cTrait_exprParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//Class_modifier_fragment:
		//	'adds' (Field_decl | Trait_expr) | 'removes' (Field_decl | Methodsig | {Class_modifier_fragment} '{'
		//	methodsig+=Methodsig* '}') | 'modifies' Trait_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//'adds' (Field_decl | Trait_expr) | 'removes' (Field_decl | Methodsig | {Class_modifier_fragment} '{'
		//methodsig+=Methodsig* '}') | 'modifies' Trait_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'adds' (Field_decl | Trait_expr)
		public Group getGroup_0() { return cGroup_0; }
		
		//'adds'
		public Keyword getAddsKeyword_0_0() { return cAddsKeyword_0_0; }
		
		//Field_decl | Trait_expr
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }
		
		//Field_decl
		public RuleCall getField_declParserRuleCall_0_1_0() { return cField_declParserRuleCall_0_1_0; }
		
		//Trait_expr
		public RuleCall getTrait_exprParserRuleCall_0_1_1() { return cTrait_exprParserRuleCall_0_1_1; }
		
		//'removes' (Field_decl | Methodsig | {Class_modifier_fragment} '{' methodsig+=Methodsig* '}')
		public Group getGroup_1() { return cGroup_1; }
		
		//'removes'
		public Keyword getRemovesKeyword_1_0() { return cRemovesKeyword_1_0; }
		
		//Field_decl | Methodsig | {Class_modifier_fragment} '{' methodsig+=Methodsig* '}'
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//Field_decl
		public RuleCall getField_declParserRuleCall_1_1_0() { return cField_declParserRuleCall_1_1_0; }
		
		//Methodsig
		public RuleCall getMethodsigParserRuleCall_1_1_1() { return cMethodsigParserRuleCall_1_1_1; }
		
		//{Class_modifier_fragment} '{' methodsig+=Methodsig* '}'
		public Group getGroup_1_1_2() { return cGroup_1_1_2; }
		
		//{Class_modifier_fragment}
		public Action getClass_modifier_fragmentAction_1_1_2_0() { return cClass_modifier_fragmentAction_1_1_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_1_2_1() { return cLeftCurlyBracketKeyword_1_1_2_1; }
		
		//methodsig+=Methodsig*
		public Assignment getMethodsigAssignment_1_1_2_2() { return cMethodsigAssignment_1_1_2_2; }
		
		//Methodsig
		public RuleCall getMethodsigMethodsigParserRuleCall_1_1_2_2_0() { return cMethodsigMethodsigParserRuleCall_1_1_2_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_1_2_3() { return cRightCurlyBracketKeyword_1_1_2_3; }
		
		//'modifies' Trait_expr
		public Group getGroup_2() { return cGroup_2; }
		
		//'modifies'
		public Keyword getModifiesKeyword_2_0() { return cModifiesKeyword_2_0; }
		
		//Trait_expr
		public RuleCall getTrait_exprParserRuleCall_2_1() { return cTrait_exprParserRuleCall_2_1; }
	}
	public class Interface_modifier_fragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Interface_modifier_fragment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cAddsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cMethodsigParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cRemovesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cMethodsigParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Interface_modifier_fragment:
		//	'adds' Methodsig
		//	| 'removes' Methodsig;
		@Override public ParserRule getRule() { return rule; }
		
		//'adds' Methodsig | 'removes' Methodsig
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'adds' Methodsig
		public Group getGroup_0() { return cGroup_0; }
		
		//'adds'
		public Keyword getAddsKeyword_0_0() { return cAddsKeyword_0_0; }
		
		//Methodsig
		public RuleCall getMethodsigParserRuleCall_0_1() { return cMethodsigParserRuleCall_0_1; }
		
		//'removes' Methodsig
		public Group getGroup_1() { return cGroup_1; }
		
		//'removes'
		public Keyword getRemovesKeyword_1_0() { return cRemovesKeyword_1_0; }
		
		//Methodsig
		public RuleCall getMethodsigParserRuleCall_1_1() { return cMethodsigParserRuleCall_1_1; }
	}
	public class Namespace_modifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Namespace_modifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cModule_importParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cModule_exportParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//Namespace_modifier:
		//	'adds' (Module_import | Module_export);
		@Override public ParserRule getRule() { return rule; }
		
		//'adds' (Module_import | Module_export)
		public Group getGroup() { return cGroup; }
		
		//'adds'
		public Keyword getAddsKeyword_0() { return cAddsKeyword_0; }
		
		//Module_import | Module_export
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//Module_import
		public RuleCall getModule_importParserRuleCall_1_0() { return cModule_importParserRuleCall_1_0; }
		
		//Module_export
		public RuleCall getModule_exportParserRuleCall_1_1() { return cModule_exportParserRuleCall_1_1; }
	}
	public class Update_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Update_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateupdateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cObject_updateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cObject_updateObject_updateParserRuleCall_3_0 = (RuleCall)cObject_updateAssignment_3.eContents().get(0);
		
		///*
		// * 
		// * Update_Declaration
		// * 
		// * 
		// */ Update_decl:
		//	'stateupdate' name=ID ';' object_update+=Object_update*;
		@Override public ParserRule getRule() { return rule; }
		
		//'stateupdate' name=ID ';' object_update+=Object_update*
		public Group getGroup() { return cGroup; }
		
		//'stateupdate'
		public Keyword getStateupdateKeyword_0() { return cStateupdateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
		
		//object_update+=Object_update*
		public Assignment getObject_updateAssignment_3() { return cObject_updateAssignment_3; }
		
		//Object_update
		public RuleCall getObject_updateObject_updateParserRuleCall_3_0() { return cObject_updateObject_updateParserRuleCall_3_0; }
	}
	public class Object_updateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Object_update");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjectupdateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cQualifiedNameParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cAwaitKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGuardAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGuardGuardCrossReference_4_0 = (CrossReference)cGuardAssignment_4.eContents().get(0);
		private final RuleCall cGuardGuardIDTerminalRuleCall_4_0_1 = (RuleCall)cGuardGuardCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cUpdate_preamble_declarationAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUpdate_preamble_declarationUpdate_preamble_declarationParserRuleCall_6_0 = (RuleCall)cUpdate_preamble_declarationAssignment_6.eContents().get(0);
		private final Assignment cPreAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPreObject_update_assign_stmtParserRuleCall_7_0 = (RuleCall)cPreAssignment_7.eContents().get(0);
		private final Keyword cClassupdateKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cPostAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cPostObject_update_assign_stmtParserRuleCall_10_0 = (RuleCall)cPostAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Object_update:
		//	'objectupdate' QualifiedName '{' 'await' guard=[Guard] ';'
		//	update_preamble_declaration+=Update_preamble_declaration*
		//	pre+=Object_update_assign_stmt*
		//	'classupdate' ';' post+=Object_update_assign_stmt* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'objectupdate' QualifiedName '{' 'await' guard=[Guard] ';' update_preamble_declaration+=Update_preamble_declaration*
		//pre+=Object_update_assign_stmt* 'classupdate' ';' post+=Object_update_assign_stmt* '}'
		public Group getGroup() { return cGroup; }
		
		//'objectupdate'
		public Keyword getObjectupdateKeyword_0() { return cObjectupdateKeyword_0; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_1() { return cQualifiedNameParserRuleCall_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'await'
		public Keyword getAwaitKeyword_3() { return cAwaitKeyword_3; }
		
		//guard=[Guard]
		public Assignment getGuardAssignment_4() { return cGuardAssignment_4; }
		
		//[Guard]
		public CrossReference getGuardGuardCrossReference_4_0() { return cGuardGuardCrossReference_4_0; }
		
		//ID
		public RuleCall getGuardGuardIDTerminalRuleCall_4_0_1() { return cGuardGuardIDTerminalRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//update_preamble_declaration+=Update_preamble_declaration*
		public Assignment getUpdate_preamble_declarationAssignment_6() { return cUpdate_preamble_declarationAssignment_6; }
		
		//Update_preamble_declaration
		public RuleCall getUpdate_preamble_declarationUpdate_preamble_declarationParserRuleCall_6_0() { return cUpdate_preamble_declarationUpdate_preamble_declarationParserRuleCall_6_0; }
		
		//pre+=Object_update_assign_stmt*
		public Assignment getPreAssignment_7() { return cPreAssignment_7; }
		
		//Object_update_assign_stmt
		public RuleCall getPreObject_update_assign_stmtParserRuleCall_7_0() { return cPreObject_update_assign_stmtParserRuleCall_7_0; }
		
		//'classupdate'
		public Keyword getClassupdateKeyword_8() { return cClassupdateKeyword_8; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//post+=Object_update_assign_stmt*
		public Assignment getPostAssignment_10() { return cPostAssignment_10; }
		
		//Object_update_assign_stmt
		public RuleCall getPostObject_update_assign_stmtParserRuleCall_10_0() { return cPostObject_update_assign_stmtParserRuleCall_10_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	public class Update_preamble_declarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Update_preamble_declaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cType_expParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Update_preamble_declaration:
		//	Type_exp ID;
		@Override public ParserRule getRule() { return rule; }
		
		//Type_exp ID
		public Group getGroup() { return cGroup; }
		
		//Type_exp
		public RuleCall getType_expParserRuleCall_0() { return cType_expParserRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class Object_update_assign_stmtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Object_update_assign_stmt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVar_or_field_refAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cVar_or_field_refVar_or_field_refCrossReference_0_0 = (CrossReference)cVar_or_field_refAssignment_0.eContents().get(0);
		private final RuleCall cVar_or_field_refVar_or_field_refIDTerminalRuleCall_0_0_1 = (RuleCall)cVar_or_field_refVar_or_field_refCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Object_update_assign_stmt:
		//	var_or_field_ref=[Var_or_field_ref] '=' exp=Exp ';';
		@Override public ParserRule getRule() { return rule; }
		
		//var_or_field_ref=[Var_or_field_ref] '=' exp=Exp ';'
		public Group getGroup() { return cGroup; }
		
		//var_or_field_ref=[Var_or_field_ref]
		public Assignment getVar_or_field_refAssignment_0() { return cVar_or_field_refAssignment_0; }
		
		//[Var_or_field_ref]
		public CrossReference getVar_or_field_refVar_or_field_refCrossReference_0_0() { return cVar_or_field_refVar_or_field_refCrossReference_0_0; }
		
		//ID
		public RuleCall getVar_or_field_refVar_or_field_refIDTerminalRuleCall_0_0_1() { return cVar_or_field_refVar_or_field_refIDTerminalRuleCall_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//exp=Exp
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_2_0() { return cExpExpParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class Productline_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Productline_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProductlineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFeaturesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeatureAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeatureFeatureParserRuleCall_4_0 = (RuleCall)cFeatureAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cFeatureAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cFeatureFeatureParserRuleCall_5_1_0 = (RuleCall)cFeatureAssignment_5_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cDelta_clauseAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cDelta_clauseDelta_clauseParserRuleCall_7_0 = (RuleCall)cDelta_clauseAssignment_7.eContents().get(0);
		
		///*
		// * 
		// * Product line Declaration
		// * 
		// */ Productline_decl:
		//	'productline' name=ID ';'
		//	'features' feature+=Feature (',' feature+=Feature)* ';'
		//	delta_clause+=Delta_clause*;
		@Override public ParserRule getRule() { return rule; }
		
		//'productline' name=ID ';' 'features' feature+=Feature (',' feature+=Feature)* ';' delta_clause+=Delta_clause*
		public Group getGroup() { return cGroup; }
		
		//'productline'
		public Keyword getProductlineKeyword_0() { return cProductlineKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
		
		//'features'
		public Keyword getFeaturesKeyword_3() { return cFeaturesKeyword_3; }
		
		//feature+=Feature
		public Assignment getFeatureAssignment_4() { return cFeatureAssignment_4; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_4_0() { return cFeatureFeatureParserRuleCall_4_0; }
		
		//(',' feature+=Feature)*
		public Group getGroup_5() { return cGroup_5; }
		
		//','
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//feature+=Feature
		public Assignment getFeatureAssignment_5_1() { return cFeatureAssignment_5_1; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_5_1_0() { return cFeatureFeatureParserRuleCall_5_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//delta_clause+=Delta_clause*
		public Assignment getDelta_clauseAssignment_7() { return cDelta_clauseAssignment_7; }
		
		//Delta_clause
		public RuleCall getDelta_clauseDelta_clauseParserRuleCall_7_0() { return cDelta_clauseDelta_clauseParserRuleCall_7_0; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeature_declAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFeature_declFeature_declCrossReference_0_0 = (CrossReference)cFeature_declAssignment_0.eContents().get(0);
		private final RuleCall cFeature_declFeature_declQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cFeature_declFeature_declCrossReference_0_0.eContents().get(1);
		private final Assignment cPAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPApostropheKeyword_1_0 = (Keyword)cPAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttr_assignmentAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttr_assignmentAttr_assignmentParserRuleCall_2_1_0 = (RuleCall)cAttr_assignmentAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cAttr_assignmentAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cAttr_assignmentAttr_assignmentParserRuleCall_2_2_1_0 = (RuleCall)cAttr_assignmentAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//Feature:
		//	feature_decl=[Feature_decl|QualifiedName] p='\''? ('{'
		//	attr_assignment+=Attr_assignment (',' attr_assignment+=Attr_assignment)* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//feature_decl=[Feature_decl|QualifiedName] p='\''? ('{' attr_assignment+=Attr_assignment (','
		//attr_assignment+=Attr_assignment)* '}')?
		public Group getGroup() { return cGroup; }
		
		//feature_decl=[Feature_decl|QualifiedName]
		public Assignment getFeature_declAssignment_0() { return cFeature_declAssignment_0; }
		
		//[Feature_decl|QualifiedName]
		public CrossReference getFeature_declFeature_declCrossReference_0_0() { return cFeature_declFeature_declCrossReference_0_0; }
		
		//QualifiedName
		public RuleCall getFeature_declFeature_declQualifiedNameParserRuleCall_0_0_1() { return cFeature_declFeature_declQualifiedNameParserRuleCall_0_0_1; }
		
		//p='\''?
		public Assignment getPAssignment_1() { return cPAssignment_1; }
		
		//'\''
		public Keyword getPApostropheKeyword_1_0() { return cPApostropheKeyword_1_0; }
		
		//('{' attr_assignment+=Attr_assignment (',' attr_assignment+=Attr_assignment)* '}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }
		
		//attr_assignment+=Attr_assignment
		public Assignment getAttr_assignmentAssignment_2_1() { return cAttr_assignmentAssignment_2_1; }
		
		//Attr_assignment
		public RuleCall getAttr_assignmentAttr_assignmentParserRuleCall_2_1_0() { return cAttr_assignmentAttr_assignmentParserRuleCall_2_1_0; }
		
		//(',' attr_assignment+=Attr_assignment)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//attr_assignment+=Attr_assignment
		public Assignment getAttr_assignmentAssignment_2_2_1() { return cAttr_assignmentAssignment_2_2_1; }
		
		//Attr_assignment
		public RuleCall getAttr_assignmentAttr_assignmentParserRuleCall_2_2_1_0() { return cAttr_assignmentAttr_assignmentParserRuleCall_2_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
	}
	public class Attr_assignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Attr_assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		private final RuleCall cSTRINGLITERALTerminalRuleCall_2_2 = (RuleCall)cAlternatives_2.eContents().get(2);
		
		//Attr_assignment:
		//	ID '=' (INT | ID | STRINGLITERAL);
		@Override public ParserRule getRule() { return rule; }
		
		//ID '=' (INT | ID | STRINGLITERAL)
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//INT | ID | STRINGLITERAL
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_0() { return cINTTerminalRuleCall_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
		
		//STRINGLITERAL
		public RuleCall getSTRINGLITERALTerminalRuleCall_2_2() { return cSTRINGLITERALTerminalRuleCall_2_2; }
	}
	public class Delta_clauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Delta_clause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeltaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDeltaspecAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDeltaspecDelta_declCrossReference_1_0 = (CrossReference)cDeltaspecAssignment_1.eContents().get(0);
		private final RuleCall cDeltaspecDelta_declIDTerminalRuleCall_1_0_1 = (RuleCall)cDeltaspecDelta_declCrossReference_1_0.eContents().get(1);
		private final Assignment cAfter_conditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAfter_conditionAfter_conditionParserRuleCall_2_0 = (RuleCall)cAfter_conditionAssignment_2.eContents().get(0);
		private final Assignment cFrom_conditionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFrom_conditionFrom_conditionParserRuleCall_3_0 = (RuleCall)cFrom_conditionAssignment_3.eContents().get(0);
		private final Assignment cWhen_conditionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cWhen_conditionWhen_conditionParserRuleCall_4_0 = (RuleCall)cWhen_conditionAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////Check delta spec instead of delta_decl
		//Delta_clause:
		//	'delta' deltaspec=[Delta_decl] after_condition=After_condition?
		//	from_condition=From_condition? when_condition=When_condition? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'delta' deltaspec=[Delta_decl] after_condition=After_condition? from_condition=From_condition?
		//when_condition=When_condition? ';'
		public Group getGroup() { return cGroup; }
		
		//'delta'
		public Keyword getDeltaKeyword_0() { return cDeltaKeyword_0; }
		
		//deltaspec=[Delta_decl]
		public Assignment getDeltaspecAssignment_1() { return cDeltaspecAssignment_1; }
		
		//[Delta_decl]
		public CrossReference getDeltaspecDelta_declCrossReference_1_0() { return cDeltaspecDelta_declCrossReference_1_0; }
		
		//ID
		public RuleCall getDeltaspecDelta_declIDTerminalRuleCall_1_0_1() { return cDeltaspecDelta_declIDTerminalRuleCall_1_0_1; }
		
		//after_condition=After_condition?
		public Assignment getAfter_conditionAssignment_2() { return cAfter_conditionAssignment_2; }
		
		//After_condition
		public RuleCall getAfter_conditionAfter_conditionParserRuleCall_2_0() { return cAfter_conditionAfter_conditionParserRuleCall_2_0; }
		
		//from_condition=From_condition?
		public Assignment getFrom_conditionAssignment_3() { return cFrom_conditionAssignment_3; }
		
		//From_condition
		public RuleCall getFrom_conditionFrom_conditionParserRuleCall_3_0() { return cFrom_conditionFrom_conditionParserRuleCall_3_0; }
		
		//when_condition=When_condition?
		public Assignment getWhen_conditionAssignment_4() { return cWhen_conditionAssignment_4; }
		
		//When_condition
		public RuleCall getWhen_conditionWhen_conditionParserRuleCall_4_0() { return cWhen_conditionWhen_conditionParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class DeltaspecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Deltaspec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDeltaspecAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDeltaspec_paramAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDeltaspec_paramDeltaspec_paramParserRuleCall_2_1_0 = (RuleCall)cDeltaspec_paramAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cDeltaspec_paramAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cDeltaspec_paramDeltaspec_paramParserRuleCall_2_2_1_0 = (RuleCall)cDeltaspec_paramAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//Deltaspec:
		//	{Deltaspec} name=ID ('(' deltaspec_param+=Deltaspec_param (',' deltaspec_param+=Deltaspec_param)* ')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Deltaspec} name=ID ('(' deltaspec_param+=Deltaspec_param (',' deltaspec_param+=Deltaspec_param)* ')')?
		public Group getGroup() { return cGroup; }
		
		//{Deltaspec}
		public Action getDeltaspecAction_0() { return cDeltaspecAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('(' deltaspec_param+=Deltaspec_param (',' deltaspec_param+=Deltaspec_param)* ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//deltaspec_param+=Deltaspec_param
		public Assignment getDeltaspec_paramAssignment_2_1() { return cDeltaspec_paramAssignment_2_1; }
		
		//Deltaspec_param
		public RuleCall getDeltaspec_paramDeltaspec_paramParserRuleCall_2_1_0() { return cDeltaspec_paramDeltaspec_paramParserRuleCall_2_1_0; }
		
		//(',' deltaspec_param+=Deltaspec_param)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//deltaspec_param+=Deltaspec_param
		public Assignment getDeltaspec_paramAssignment_2_2_1() { return cDeltaspec_paramAssignment_2_2_1; }
		
		//Deltaspec_param
		public RuleCall getDeltaspec_paramDeltaspec_paramParserRuleCall_2_2_1_0() { return cDeltaspec_paramDeltaspec_paramParserRuleCall_2_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
	}
	public class Deltaspec_paramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Deltaspec_param");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Deltaspec_param:
		//	ID '.' ID | INT;
		@Override public ParserRule getRule() { return rule; }
		
		//ID '.' ID | INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID '.' ID
		public Group getGroup_0() { return cGroup_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_2() { return cIDTerminalRuleCall_0_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class After_conditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.After_condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAfterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDelta_idAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDelta_idDelta_declCrossReference_1_0 = (CrossReference)cDelta_idAssignment_1.eContents().get(0);
		private final RuleCall cDelta_idDelta_declIDTerminalRuleCall_1_0_1 = (RuleCall)cDelta_idDelta_declCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDelta_idAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cDelta_idDelta_declCrossReference_2_1_0 = (CrossReference)cDelta_idAssignment_2_1.eContents().get(0);
		private final RuleCall cDelta_idDelta_declIDTerminalRuleCall_2_1_0_1 = (RuleCall)cDelta_idDelta_declCrossReference_2_1_0.eContents().get(1);
		
		//After_condition:
		//	'after' delta_id+=[Delta_decl] (',' delta_id+=[Delta_decl])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'after' delta_id+=[Delta_decl] (',' delta_id+=[Delta_decl])*
		public Group getGroup() { return cGroup; }
		
		//'after'
		public Keyword getAfterKeyword_0() { return cAfterKeyword_0; }
		
		//delta_id+=[Delta_decl]
		public Assignment getDelta_idAssignment_1() { return cDelta_idAssignment_1; }
		
		//[Delta_decl]
		public CrossReference getDelta_idDelta_declCrossReference_1_0() { return cDelta_idDelta_declCrossReference_1_0; }
		
		//ID
		public RuleCall getDelta_idDelta_declIDTerminalRuleCall_1_0_1() { return cDelta_idDelta_declIDTerminalRuleCall_1_0_1; }
		
		//(',' delta_id+=[Delta_decl])*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//delta_id+=[Delta_decl]
		public Assignment getDelta_idAssignment_2_1() { return cDelta_idAssignment_2_1; }
		
		//[Delta_decl]
		public CrossReference getDelta_idDelta_declCrossReference_2_1_0() { return cDelta_idDelta_declCrossReference_2_1_0; }
		
		//ID
		public RuleCall getDelta_idDelta_declIDTerminalRuleCall_2_1_0_1() { return cDelta_idDelta_declIDTerminalRuleCall_2_1_0_1; }
	}
	public class From_conditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.From_condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFromKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cApplication_conditionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cApplication_conditionApplication_conditionParserRuleCall_1_0 = (RuleCall)cApplication_conditionAssignment_1.eContents().get(0);
		
		//From_condition:
		//	'from' application_condition=Application_condition;
		@Override public ParserRule getRule() { return rule; }
		
		//'from' application_condition=Application_condition
		public Group getGroup() { return cGroup; }
		
		//'from'
		public Keyword getFromKeyword_0() { return cFromKeyword_0; }
		
		//application_condition=Application_condition
		public Assignment getApplication_conditionAssignment_1() { return cApplication_conditionAssignment_1; }
		
		//Application_condition
		public RuleCall getApplication_conditionApplication_conditionParserRuleCall_1_0() { return cApplication_conditionApplication_conditionParserRuleCall_1_0; }
	}
	public class When_conditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.When_condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cWhenKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cToKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Assignment cApplication_conditionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cApplication_conditionApplication_conditionParserRuleCall_1_0 = (RuleCall)cApplication_conditionAssignment_1.eContents().get(0);
		
		//When_condition:
		//	('when' | 'to') application_condition=Application_condition;
		@Override public ParserRule getRule() { return rule; }
		
		//('when' | 'to') application_condition=Application_condition
		public Group getGroup() { return cGroup; }
		
		//'when' | 'to'
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'when'
		public Keyword getWhenKeyword_0_0() { return cWhenKeyword_0_0; }
		
		//'to'
		public Keyword getToKeyword_0_1() { return cToKeyword_0_1; }
		
		//application_condition=Application_condition
		public Assignment getApplication_conditionAssignment_1() { return cApplication_conditionAssignment_1; }
		
		//Application_condition
		public RuleCall getApplication_conditionApplication_conditionParserRuleCall_1_0() { return cApplication_conditionApplication_conditionParserRuleCall_1_0; }
	}
	public class Application_conditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Application_condition");
		private final RuleCall cAppOr_expParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Application_condition:
		//	AppOr_exp;
		@Override public ParserRule getRule() { return rule; }
		
		//AppOr_exp
		public RuleCall getAppOr_expParserRuleCall() { return cAppOr_expParserRuleCall; }
	}
	public class AppOr_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.AppOr_exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAppAnd_expParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAppOr_expLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cORORTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAppAnd_expParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AppOr_exp Application_condition:
		//	AppAnd_exp ({AppOr_exp.left=current} OROR right=AppAnd_exp)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AppAnd_exp ({AppOr_exp.left=current} OROR right=AppAnd_exp)*
		public Group getGroup() { return cGroup; }
		
		//AppAnd_exp
		public RuleCall getAppAnd_expParserRuleCall_0() { return cAppAnd_expParserRuleCall_0; }
		
		//({AppOr_exp.left=current} OROR right=AppAnd_exp)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AppOr_exp.left=current}
		public Action getAppOr_expLeftAction_1_0() { return cAppOr_expLeftAction_1_0; }
		
		//OROR
		public RuleCall getORORTerminalRuleCall_1_1() { return cORORTerminalRuleCall_1_1; }
		
		//right=AppAnd_exp
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AppAnd_exp
		public RuleCall getRightAppAnd_expParserRuleCall_1_2_0() { return cRightAppAnd_expParserRuleCall_1_2_0; }
	}
	public class AppAnd_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.AppAnd_exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAppUnary_expParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAppAnd_expLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cANDANDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAppUnary_expParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AppAnd_exp Application_condition:
		//	AppUnary_exp ({AppAnd_exp.left=current} ANDAND right=AppUnary_exp)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AppUnary_exp ({AppAnd_exp.left=current} ANDAND right=AppUnary_exp)*
		public Group getGroup() { return cGroup; }
		
		//AppUnary_exp
		public RuleCall getAppUnary_expParserRuleCall_0() { return cAppUnary_expParserRuleCall_0; }
		
		//({AppAnd_exp.left=current} ANDAND right=AppUnary_exp)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AppAnd_exp.left=current}
		public Action getAppAnd_expLeftAction_1_0() { return cAppAnd_expLeftAction_1_0; }
		
		//ANDAND
		public RuleCall getANDANDTerminalRuleCall_1_1() { return cANDANDTerminalRuleCall_1_1; }
		
		//right=AppUnary_exp
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AppUnary_exp
		public RuleCall getRightAppUnary_expParserRuleCall_1_2_0() { return cRightAppUnary_expParserRuleCall_1_2_0; }
	}
	public class AppUnary_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.AppUnary_exp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAppPrimary_expParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cNotExpressionAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cNEGATIONTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cNEGATION_CREOLTerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cOperandAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cOperandAppUnary_expParserRuleCall_1_2_0 = (RuleCall)cOperandAssignment_1_2.eContents().get(0);
		
		//AppUnary_exp Application_condition:
		//	AppPrimary_exp | {NotExpression} (NEGATION | NEGATION_CREOL) operand=AppUnary_exp;
		@Override public ParserRule getRule() { return rule; }
		
		//AppPrimary_exp | {NotExpression} (NEGATION | NEGATION_CREOL) operand=AppUnary_exp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AppPrimary_exp
		public RuleCall getAppPrimary_expParserRuleCall_0() { return cAppPrimary_expParserRuleCall_0; }
		
		//{NotExpression} (NEGATION | NEGATION_CREOL) operand=AppUnary_exp
		public Group getGroup_1() { return cGroup_1; }
		
		//{NotExpression}
		public Action getNotExpressionAction_1_0() { return cNotExpressionAction_1_0; }
		
		//NEGATION | NEGATION_CREOL
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//NEGATION
		public RuleCall getNEGATIONTerminalRuleCall_1_1_0() { return cNEGATIONTerminalRuleCall_1_1_0; }
		
		//NEGATION_CREOL
		public RuleCall getNEGATION_CREOLTerminalRuleCall_1_1_1() { return cNEGATION_CREOLTerminalRuleCall_1_1_1; }
		
		//operand=AppUnary_exp
		public Assignment getOperandAssignment_1_2() { return cOperandAssignment_1_2; }
		
		//AppUnary_exp
		public RuleCall getOperandAppUnary_expParserRuleCall_1_2_0() { return cOperandAppUnary_expParserRuleCall_1_2_0; }
	}
	public class AppPrimary_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.AppPrimary_exp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cAppOr_expParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cAppCond_atomic_exprParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AppPrimary_exp Application_condition:
		//	'(' AppOr_exp ')' | AppCond_atomic_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' AppOr_exp ')' | AppCond_atomic_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' AppOr_exp ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//AppOr_exp
		public RuleCall getAppOr_expParserRuleCall_0_1() { return cAppOr_expParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//AppCond_atomic_expr
		public RuleCall getAppCond_atomic_exprParserRuleCall_1() { return cAppCond_atomic_exprParserRuleCall_1; }
	}
	public class AppCond_atomic_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.AppCond_atomic_expr");
		private final Assignment cFeatureAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFeatureFeatureParserRuleCall_0 = (RuleCall)cFeatureAssignment.eContents().get(0);
		
		//AppCond_atomic_expr Application_condition:
		//	feature=Feature;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=Feature
		public Assignment getFeatureAssignment() { return cFeatureAssignment; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_0() { return cFeatureFeatureParserRuleCall_0; }
	}
	public class Product_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Product_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProduct_declAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProductKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Group cGroup_3_0_1 = (Group)cGroup_3_0.eContents().get(1);
		private final Assignment cFeatureAssignment_3_0_1_0 = (Assignment)cGroup_3_0_1.eContents().get(0);
		private final RuleCall cFeatureFeatureParserRuleCall_3_0_1_0_0 = (RuleCall)cFeatureAssignment_3_0_1_0.eContents().get(0);
		private final Group cGroup_3_0_1_1 = (Group)cGroup_3_0_1.eContents().get(1);
		private final Keyword cCommaKeyword_3_0_1_1_0 = (Keyword)cGroup_3_0_1_1.eContents().get(0);
		private final Assignment cFeatureAssignment_3_0_1_1_1 = (Assignment)cGroup_3_0_1_1.eContents().get(1);
		private final RuleCall cFeatureFeatureParserRuleCall_3_0_1_1_1_0 = (RuleCall)cFeatureAssignment_3_0_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Alternatives cAlternatives_3_0_3 = (Alternatives)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_0_3_0 = (Group)cAlternatives_3_0_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_0_3_0_0 = (Keyword)cGroup_3_0_3_0.eContents().get(0);
		private final Assignment cProduct_reconfigurationAssignment_3_0_3_0_1 = (Assignment)cGroup_3_0_3_0.eContents().get(1);
		private final RuleCall cProduct_reconfigurationProduct_reconfigurationParserRuleCall_3_0_3_0_1_0 = (RuleCall)cProduct_reconfigurationAssignment_3_0_3_0_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_0_3_0_2 = (Keyword)cGroup_3_0_3_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_3_0_3_1 = (Keyword)cAlternatives_3_0_3.eContents().get(1);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cProduct_exprAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cProduct_exprProduct_exprParserRuleCall_3_1_1_0 = (RuleCall)cProduct_exprAssignment_3_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		
		///*
		// * Product Declaration
		// * 
		// */ Product_decl:
		//	{Product_decl} 'product' name=ID ('(' (feature+=Feature (',' feature+=Feature)*)? ')' ('{'
		//	product_reconfiguration+=Product_reconfiguration* '}' | ';') | '=' product_expr=Product_expr
		//	';');
		@Override public ParserRule getRule() { return rule; }
		
		//{Product_decl} 'product' name=ID ('(' (feature+=Feature (',' feature+=Feature)*)? ')' ('{'
		//product_reconfiguration+=Product_reconfiguration* '}' | ';') | '=' product_expr=Product_expr ';')
		public Group getGroup() { return cGroup; }
		
		//{Product_decl}
		public Action getProduct_declAction_0() { return cProduct_declAction_0; }
		
		//'product'
		public Keyword getProductKeyword_1() { return cProductKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'(' (feature+=Feature (',' feature+=Feature)*)? ')' ('{' product_reconfiguration+=Product_reconfiguration* '}' | ';') |
		//'=' product_expr=Product_expr ';'
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'(' (feature+=Feature (',' feature+=Feature)*)? ')' ('{' product_reconfiguration+=Product_reconfiguration* '}' | ';')
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_0_0() { return cLeftParenthesisKeyword_3_0_0; }
		
		//(feature+=Feature (',' feature+=Feature)*)?
		public Group getGroup_3_0_1() { return cGroup_3_0_1; }
		
		//feature+=Feature
		public Assignment getFeatureAssignment_3_0_1_0() { return cFeatureAssignment_3_0_1_0; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_3_0_1_0_0() { return cFeatureFeatureParserRuleCall_3_0_1_0_0; }
		
		//(',' feature+=Feature)*
		public Group getGroup_3_0_1_1() { return cGroup_3_0_1_1; }
		
		//','
		public Keyword getCommaKeyword_3_0_1_1_0() { return cCommaKeyword_3_0_1_1_0; }
		
		//feature+=Feature
		public Assignment getFeatureAssignment_3_0_1_1_1() { return cFeatureAssignment_3_0_1_1_1; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_3_0_1_1_1_0() { return cFeatureFeatureParserRuleCall_3_0_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_0_2() { return cRightParenthesisKeyword_3_0_2; }
		
		//'{' product_reconfiguration+=Product_reconfiguration* '}' | ';'
		public Alternatives getAlternatives_3_0_3() { return cAlternatives_3_0_3; }
		
		//'{' product_reconfiguration+=Product_reconfiguration* '}'
		public Group getGroup_3_0_3_0() { return cGroup_3_0_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0_3_0_0() { return cLeftCurlyBracketKeyword_3_0_3_0_0; }
		
		//product_reconfiguration+=Product_reconfiguration*
		public Assignment getProduct_reconfigurationAssignment_3_0_3_0_1() { return cProduct_reconfigurationAssignment_3_0_3_0_1; }
		
		//Product_reconfiguration
		public RuleCall getProduct_reconfigurationProduct_reconfigurationParserRuleCall_3_0_3_0_1_0() { return cProduct_reconfigurationProduct_reconfigurationParserRuleCall_3_0_3_0_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_0_3_0_2() { return cRightCurlyBracketKeyword_3_0_3_0_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3_1() { return cSemicolonKeyword_3_0_3_1; }
		
		//'=' product_expr=Product_expr ';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_1_0() { return cEqualsSignKeyword_3_1_0; }
		
		//product_expr=Product_expr
		public Assignment getProduct_exprAssignment_3_1_1() { return cProduct_exprAssignment_3_1_1; }
		
		//Product_expr
		public RuleCall getProduct_exprProduct_exprParserRuleCall_3_1_1_0() { return cProduct_exprProduct_exprParserRuleCall_3_1_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_2() { return cSemicolonKeyword_3_1_2; }
	}
	public class Product_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Product_expr");
		private final RuleCall cProductOr_exprParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Product_expr:
		//	ProductOr_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//ProductOr_expr
		public RuleCall getProductOr_exprParserRuleCall() { return cProductOr_exprParserRuleCall; }
	}
	public class ProductOr_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.ProductOr_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cProductAnd_expParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cProductOr_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cORORTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightProductAnd_expParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ProductOr_expr Product_expr:
		//	ProductAnd_exp ({ProductOr_expr.left=current} OROR right=ProductAnd_exp)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ProductAnd_exp ({ProductOr_expr.left=current} OROR right=ProductAnd_exp)*
		public Group getGroup() { return cGroup; }
		
		//ProductAnd_exp
		public RuleCall getProductAnd_expParserRuleCall_0() { return cProductAnd_expParserRuleCall_0; }
		
		//({ProductOr_expr.left=current} OROR right=ProductAnd_exp)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ProductOr_expr.left=current}
		public Action getProductOr_exprLeftAction_1_0() { return cProductOr_exprLeftAction_1_0; }
		
		//OROR
		public RuleCall getORORTerminalRuleCall_1_1() { return cORORTerminalRuleCall_1_1; }
		
		//right=ProductAnd_exp
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ProductAnd_exp
		public RuleCall getRightProductAnd_expParserRuleCall_1_2_0() { return cRightProductAnd_expParserRuleCall_1_2_0; }
	}
	public class ProductAnd_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.ProductAnd_exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cProductPrimary_expParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cProductAnd_expLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cANDANDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightProductMinus_expParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ProductAnd_exp Product_expr:
		//	ProductPrimary_exp ({ProductAnd_exp.left=current} ANDAND right=ProductMinus_exp)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ProductPrimary_exp ({ProductAnd_exp.left=current} ANDAND right=ProductMinus_exp)*
		public Group getGroup() { return cGroup; }
		
		//ProductPrimary_exp
		public RuleCall getProductPrimary_expParserRuleCall_0() { return cProductPrimary_expParserRuleCall_0; }
		
		//({ProductAnd_exp.left=current} ANDAND right=ProductMinus_exp)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ProductAnd_exp.left=current}
		public Action getProductAnd_expLeftAction_1_0() { return cProductAnd_expLeftAction_1_0; }
		
		//ANDAND
		public RuleCall getANDANDTerminalRuleCall_1_1() { return cANDANDTerminalRuleCall_1_1; }
		
		//right=ProductMinus_exp
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ProductMinus_exp
		public RuleCall getRightProductMinus_expParserRuleCall_1_2_0() { return cRightProductMinus_expParserRuleCall_1_2_0; }
	}
	public class ProductMinus_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.ProductMinus_exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cProductPrimary_expParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cProductMinus_expLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cMINUSTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightProductPrimary_expParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ProductMinus_exp Product_expr:
		//	ProductPrimary_exp ({ProductMinus_exp.left=current} MINUS right=ProductPrimary_exp)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ProductPrimary_exp ({ProductMinus_exp.left=current} MINUS right=ProductPrimary_exp)*
		public Group getGroup() { return cGroup; }
		
		//ProductPrimary_exp
		public RuleCall getProductPrimary_expParserRuleCall_0() { return cProductPrimary_expParserRuleCall_0; }
		
		//({ProductMinus_exp.left=current} MINUS right=ProductPrimary_exp)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ProductMinus_exp.left=current}
		public Action getProductMinus_expLeftAction_1_0() { return cProductMinus_expLeftAction_1_0; }
		
		//MINUS
		public RuleCall getMINUSTerminalRuleCall_1_1() { return cMINUSTerminalRuleCall_1_1; }
		
		//right=ProductPrimary_exp
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ProductPrimary_exp
		public RuleCall getRightProductPrimary_expParserRuleCall_1_2_0() { return cRightProductPrimary_expParserRuleCall_1_2_0; }
	}
	public class ProductPrimary_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.ProductPrimary_exp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cProductOr_exprParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cAtomicProduct_exprParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ProductPrimary_exp Product_expr:
		//	'(' ProductOr_expr ')'
		//	| AtomicProduct_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' ProductOr_expr ')' | AtomicProduct_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' ProductOr_expr ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//ProductOr_expr
		public RuleCall getProductOr_exprParserRuleCall_0_1() { return cProductOr_exprParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//AtomicProduct_expr
		public RuleCall getAtomicProduct_exprParserRuleCall_1() { return cAtomicProduct_exprParserRuleCall_1; }
	}
	public class AtomicProduct_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.AtomicProduct_expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFeatureAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cFeatureFeature_declCrossReference_0_1_0 = (CrossReference)cFeatureAssignment_0_1.eContents().get(0);
		private final RuleCall cFeatureFeature_declQualifiedNameParserRuleCall_0_1_0_1 = (RuleCall)cFeatureFeature_declCrossReference_0_1_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cCommaKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cFeatureAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final CrossReference cFeatureFeature_declCrossReference_0_2_1_0 = (CrossReference)cFeatureAssignment_0_2_1.eContents().get(0);
		private final RuleCall cFeatureFeature_declQualifiedNameParserRuleCall_0_2_1_0_1 = (RuleCall)cFeatureFeature_declCrossReference_0_2_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cProductDeclAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final CrossReference cProductDeclProduct_declCrossReference_1_0 = (CrossReference)cProductDeclAssignment_1.eContents().get(0);
		private final RuleCall cProductDeclProduct_declQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cProductDeclProduct_declCrossReference_1_0.eContents().get(1);
		
		//AtomicProduct_expr Product_expr:
		//	'{' feature+=[Feature_decl|QualifiedName] (',' feature+=[Feature_decl|QualifiedName])* '}'
		//	| productDecl=[Product_decl|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//'{' feature+=[Feature_decl|QualifiedName] (',' feature+=[Feature_decl|QualifiedName])* '}' |
		//productDecl=[Product_decl|QualifiedName]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'{' feature+=[Feature_decl|QualifiedName] (',' feature+=[Feature_decl|QualifiedName])* '}'
		public Group getGroup_0() { return cGroup_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0_0() { return cLeftCurlyBracketKeyword_0_0; }
		
		//feature+=[Feature_decl|QualifiedName]
		public Assignment getFeatureAssignment_0_1() { return cFeatureAssignment_0_1; }
		
		//[Feature_decl|QualifiedName]
		public CrossReference getFeatureFeature_declCrossReference_0_1_0() { return cFeatureFeature_declCrossReference_0_1_0; }
		
		//QualifiedName
		public RuleCall getFeatureFeature_declQualifiedNameParserRuleCall_0_1_0_1() { return cFeatureFeature_declQualifiedNameParserRuleCall_0_1_0_1; }
		
		//(',' feature+=[Feature_decl|QualifiedName])*
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//','
		public Keyword getCommaKeyword_0_2_0() { return cCommaKeyword_0_2_0; }
		
		//feature+=[Feature_decl|QualifiedName]
		public Assignment getFeatureAssignment_0_2_1() { return cFeatureAssignment_0_2_1; }
		
		//[Feature_decl|QualifiedName]
		public CrossReference getFeatureFeature_declCrossReference_0_2_1_0() { return cFeatureFeature_declCrossReference_0_2_1_0; }
		
		//QualifiedName
		public RuleCall getFeatureFeature_declQualifiedNameParserRuleCall_0_2_1_0_1() { return cFeatureFeature_declQualifiedNameParserRuleCall_0_2_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_0_3() { return cRightCurlyBracketKeyword_0_3; }
		
		//productDecl=[Product_decl|QualifiedName]
		public Assignment getProductDeclAssignment_1() { return cProductDeclAssignment_1; }
		
		//[Product_decl|QualifiedName]
		public CrossReference getProductDeclProduct_declCrossReference_1_0() { return cProductDeclProduct_declCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getProductDeclProduct_declQualifiedNameParserRuleCall_1_0_1() { return cProductDeclProduct_declQualifiedNameParserRuleCall_1_0_1; }
	}
	public class Product_reconfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Product_reconfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cDeltaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDelta_idAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDelta_idDelta_idParserRuleCall_2_0 = (RuleCall)cDelta_idAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDelta_idAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDelta_idDelta_idParserRuleCall_3_1_0 = (RuleCall)cDelta_idAssignment_3_1.eContents().get(0);
		private final Keyword cStateupdateKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUpdateAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUpdateIDTerminalRuleCall_5_0 = (RuleCall)cUpdateAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		////Product reconfiguration
		//Product_reconfiguration:
		//	name=ID 'delta' delta_id+=Delta_id (',' delta_id+=Delta_id)*
		//	'stateupdate' update=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID 'delta' delta_id+=Delta_id (',' delta_id+=Delta_id)* 'stateupdate' update=ID ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'delta'
		public Keyword getDeltaKeyword_1() { return cDeltaKeyword_1; }
		
		//delta_id+=Delta_id
		public Assignment getDelta_idAssignment_2() { return cDelta_idAssignment_2; }
		
		//Delta_id
		public RuleCall getDelta_idDelta_idParserRuleCall_2_0() { return cDelta_idDelta_idParserRuleCall_2_0; }
		
		//(',' delta_id+=Delta_id)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//delta_id+=Delta_id
		public Assignment getDelta_idAssignment_3_1() { return cDelta_idAssignment_3_1; }
		
		//Delta_id
		public RuleCall getDelta_idDelta_idParserRuleCall_3_1_0() { return cDelta_idDelta_idParserRuleCall_3_1_0; }
		
		//'stateupdate'
		public Keyword getStateupdateKeyword_4() { return cStateupdateKeyword_4; }
		
		//update=ID
		public Assignment getUpdateAssignment_5() { return cUpdateAssignment_5; }
		
		//ID
		public RuleCall getUpdateIDTerminalRuleCall_5_0() { return cUpdateIDTerminalRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class Feature_declElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Feature_decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cFeature_decl_groupAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFeature_decl_groupFeature_decl_groupParserRuleCall_1_1_0 = (RuleCall)cFeature_decl_groupAssignment_1_1.eContents().get(0);
		private final Alternatives cAlternatives_1_2 = (Alternatives)cGroup_1.eContents().get(2);
		private final Assignment cFeature_decl_attributeAssignment_1_2_0 = (Assignment)cAlternatives_1_2.eContents().get(0);
		private final RuleCall cFeature_decl_attributeFeature_decl_attributeParserRuleCall_1_2_0_0 = (RuleCall)cFeature_decl_attributeAssignment_1_2_0.eContents().get(0);
		private final Assignment cFeature_decl_constraintAssignment_1_2_1 = (Assignment)cAlternatives_1_2.eContents().get(1);
		private final RuleCall cFeature_decl_constraintFeature_decl_constraintParserRuleCall_1_2_1_0 = (RuleCall)cFeature_decl_constraintAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		///*
		// * Feature Declaration
		// * 
		// */ Feature_decl:
		//	name=ID ('{' feature_decl_group=Feature_decl_group? (feature_decl_attribute+=Feature_decl_attribute
		//	| feature_decl_constraint+=Feature_decl_constraint)*
		//	'}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('{' feature_decl_group=Feature_decl_group? (feature_decl_attribute+=Feature_decl_attribute |
		//feature_decl_constraint+=Feature_decl_constraint)* '}')?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('{' feature_decl_group=Feature_decl_group? (feature_decl_attribute+=Feature_decl_attribute |
		//feature_decl_constraint+=Feature_decl_constraint)* '}')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_0() { return cLeftCurlyBracketKeyword_1_0; }
		
		//feature_decl_group=Feature_decl_group?
		public Assignment getFeature_decl_groupAssignment_1_1() { return cFeature_decl_groupAssignment_1_1; }
		
		//Feature_decl_group
		public RuleCall getFeature_decl_groupFeature_decl_groupParserRuleCall_1_1_0() { return cFeature_decl_groupFeature_decl_groupParserRuleCall_1_1_0; }
		
		//(feature_decl_attribute+=Feature_decl_attribute | feature_decl_constraint+=Feature_decl_constraint)*
		public Alternatives getAlternatives_1_2() { return cAlternatives_1_2; }
		
		//feature_decl_attribute+=Feature_decl_attribute
		public Assignment getFeature_decl_attributeAssignment_1_2_0() { return cFeature_decl_attributeAssignment_1_2_0; }
		
		//Feature_decl_attribute
		public RuleCall getFeature_decl_attributeFeature_decl_attributeParserRuleCall_1_2_0_0() { return cFeature_decl_attributeFeature_decl_attributeParserRuleCall_1_2_0_0; }
		
		//feature_decl_constraint+=Feature_decl_constraint
		public Assignment getFeature_decl_constraintAssignment_1_2_1() { return cFeature_decl_constraintAssignment_1_2_1; }
		
		//Feature_decl_constraint
		public RuleCall getFeature_decl_constraintFeature_decl_constraintParserRuleCall_1_2_1_0() { return cFeature_decl_constraintFeature_decl_constraintParserRuleCall_1_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_3() { return cRightCurlyBracketKeyword_1_3; }
	}
	public class Feature_decl_groupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Feature_decl_group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGroupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cOneofKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cAllofKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_2_1 = (RuleCall)cGroup_1_2.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Alternatives cAlternatives_1_2_3 = (Alternatives)cGroup_1_2.eContents().get(3);
		private final RuleCall cINTTerminalRuleCall_1_2_3_0 = (RuleCall)cAlternatives_1_2_3.eContents().get(0);
		private final RuleCall cMULTTerminalRuleCall_1_2_3_1 = (RuleCall)cAlternatives_1_2_3.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_1_2_4 = (Keyword)cGroup_1_2.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFnodeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFnodeFnodeParserRuleCall_3_0 = (RuleCall)cFnodeAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFnodeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFnodeFnodeParserRuleCall_4_1_0 = (RuleCall)cFnodeAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////Feature declaration group
		//Feature_decl_group:
		//	'group' ('oneof' | 'allof' | '[' INT '..' (INT | MULT) ']')
		//	'{' fnode+=Fnode (',' fnode+=Fnode)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'group' ('oneof' | 'allof' | '[' INT '..' (INT | MULT) ']') '{' fnode+=Fnode (',' fnode+=Fnode)* '}'
		public Group getGroup() { return cGroup; }
		
		//'group'
		public Keyword getGroupKeyword_0() { return cGroupKeyword_0; }
		
		//'oneof' | 'allof' | '[' INT '..' (INT | MULT) ']'
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'oneof'
		public Keyword getOneofKeyword_1_0() { return cOneofKeyword_1_0; }
		
		//'allof'
		public Keyword getAllofKeyword_1_1() { return cAllofKeyword_1_1; }
		
		//'[' INT '..' (INT | MULT) ']'
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_2_0() { return cLeftSquareBracketKeyword_1_2_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_2_1() { return cINTTerminalRuleCall_1_2_1; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_1_2_2() { return cFullStopFullStopKeyword_1_2_2; }
		
		//INT | MULT
		public Alternatives getAlternatives_1_2_3() { return cAlternatives_1_2_3; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_2_3_0() { return cINTTerminalRuleCall_1_2_3_0; }
		
		//MULT
		public RuleCall getMULTTerminalRuleCall_1_2_3_1() { return cMULTTerminalRuleCall_1_2_3_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2_4() { return cRightSquareBracketKeyword_1_2_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//fnode+=Fnode
		public Assignment getFnodeAssignment_3() { return cFnodeAssignment_3; }
		
		//Fnode
		public RuleCall getFnodeFnodeParserRuleCall_3_0() { return cFnodeFnodeParserRuleCall_3_0; }
		
		//(',' fnode+=Fnode)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//fnode+=Fnode
		public Assignment getFnodeAssignment_4_1() { return cFnodeAssignment_4_1; }
		
		//Fnode
		public RuleCall getFnodeFnodeParserRuleCall_4_1_0() { return cFnodeFnodeParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class FnodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Fnode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOptKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cFeature_declParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		////Feature Node
		//Fnode:
		//	'opt'? Feature_decl;
		@Override public ParserRule getRule() { return rule; }
		
		//'opt'? Feature_decl
		public Group getGroup() { return cGroup; }
		
		//'opt'?
		public Keyword getOptKeyword_0() { return cOptKeyword_0; }
		
		//Feature_decl
		public RuleCall getFeature_declParserRuleCall_1() { return cFeature_declParserRuleCall_1; }
	}
	public class Feature_decl_attributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Feature_decl_attribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cInKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cBoundary_valAssignment_0_4 = (Assignment)cGroup_0.eContents().get(4);
		private final RuleCall cBoundary_valBoundary_valParserRuleCall_0_4_0 = (RuleCall)cBoundary_valAssignment_0_4.eContents().get(0);
		private final Group cGroup_0_5 = (Group)cGroup_0.eContents().get(5);
		private final Keyword cCommaKeyword_0_5_0 = (Keyword)cGroup_0_5.eContents().get(0);
		private final Assignment cBoundary_valAssignment_0_5_1 = (Assignment)cGroup_0_5.eContents().get(1);
		private final RuleCall cBoundary_valBoundary_valParserRuleCall_0_5_1_0 = (RuleCall)cBoundary_valAssignment_0_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_0_6 = (Keyword)cGroup_0.eContents().get(6);
		private final Keyword cSemicolonKeyword_0_7 = (Keyword)cGroup_0.eContents().get(7);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cInKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cLBoundary_intAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cLBoundary_intBoundary_intParserRuleCall_1_4_0 = (RuleCall)cLBoundary_intAssignment_1_4.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		private final Assignment cUBoundary_intAssignment_1_6 = (Assignment)cGroup_1.eContents().get(6);
		private final RuleCall cUBoundary_intBoundary_intParserRuleCall_1_6_0 = (RuleCall)cUBoundary_intAssignment_1_6.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_7 = (Keyword)cGroup_1.eContents().get(7);
		private final Keyword cSemicolonKeyword_1_8 = (Keyword)cGroup_1.eContents().get(8);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cLBoundary_intAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cLBoundary_intBoundary_intParserRuleCall_2_2_0 = (RuleCall)cLBoundary_intAssignment_2_2.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cUBoundary_intAssignment_2_4 = (Assignment)cGroup_2.eContents().get(4);
		private final RuleCall cUBoundary_intBoundary_intParserRuleCall_2_4_0 = (RuleCall)cUBoundary_intAssignment_2_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_5 = (Keyword)cGroup_2.eContents().get(5);
		private final RuleCall cIDTerminalRuleCall_2_6 = (RuleCall)cGroup_2.eContents().get(6);
		private final Keyword cSemicolonKeyword_2_7 = (Keyword)cGroup_2.eContents().get(7);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cFeature_decl_attributeAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_3_2 = (RuleCall)cGroup_3.eContents().get(2);
		private final Keyword cSemicolonKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		
		////Feature declaration attribute
		//Feature_decl_attribute:
		//	ID ID 'in'
		//	'{' boundary_val+=Boundary_val (',' boundary_val+=Boundary_val)* '}' ';'
		//	| ID ID 'in' '[' lBoundary_int=Boundary_int '..' uBoundary_int=Boundary_int ']' ';'
		//	| ID '[' lBoundary_int=Boundary_int '..' uBoundary_int=Boundary_int ']' ID ';'
		//	| {Feature_decl_attribute} ID ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//ID ID 'in' '{' boundary_val+=Boundary_val (',' boundary_val+=Boundary_val)* '}' ';' | ID ID 'in' '['
		//lBoundary_int=Boundary_int '..' uBoundary_int=Boundary_int ']' ';' | ID '[' lBoundary_int=Boundary_int '..'
		//uBoundary_int=Boundary_int ']' ID ';' | {Feature_decl_attribute} ID ID ';'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID ID 'in' '{' boundary_val+=Boundary_val (',' boundary_val+=Boundary_val)* '}' ';'
		public Group getGroup_0() { return cGroup_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1() { return cIDTerminalRuleCall_0_1; }
		
		//'in'
		public Keyword getInKeyword_0_2() { return cInKeyword_0_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0_3() { return cLeftCurlyBracketKeyword_0_3; }
		
		//boundary_val+=Boundary_val
		public Assignment getBoundary_valAssignment_0_4() { return cBoundary_valAssignment_0_4; }
		
		//Boundary_val
		public RuleCall getBoundary_valBoundary_valParserRuleCall_0_4_0() { return cBoundary_valBoundary_valParserRuleCall_0_4_0; }
		
		//(',' boundary_val+=Boundary_val)*
		public Group getGroup_0_5() { return cGroup_0_5; }
		
		//','
		public Keyword getCommaKeyword_0_5_0() { return cCommaKeyword_0_5_0; }
		
		//boundary_val+=Boundary_val
		public Assignment getBoundary_valAssignment_0_5_1() { return cBoundary_valAssignment_0_5_1; }
		
		//Boundary_val
		public RuleCall getBoundary_valBoundary_valParserRuleCall_0_5_1_0() { return cBoundary_valBoundary_valParserRuleCall_0_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_0_6() { return cRightCurlyBracketKeyword_0_6; }
		
		//';'
		public Keyword getSemicolonKeyword_0_7() { return cSemicolonKeyword_0_7; }
		
		//ID ID 'in' '[' lBoundary_int=Boundary_int '..' uBoundary_int=Boundary_int ']' ';'
		public Group getGroup_1() { return cGroup_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_0() { return cIDTerminalRuleCall_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
		
		//'in'
		public Keyword getInKeyword_1_2() { return cInKeyword_1_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_3() { return cLeftSquareBracketKeyword_1_3; }
		
		//lBoundary_int=Boundary_int
		public Assignment getLBoundary_intAssignment_1_4() { return cLBoundary_intAssignment_1_4; }
		
		//Boundary_int
		public RuleCall getLBoundary_intBoundary_intParserRuleCall_1_4_0() { return cLBoundary_intBoundary_intParserRuleCall_1_4_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_1_5() { return cFullStopFullStopKeyword_1_5; }
		
		//uBoundary_int=Boundary_int
		public Assignment getUBoundary_intAssignment_1_6() { return cUBoundary_intAssignment_1_6; }
		
		//Boundary_int
		public RuleCall getUBoundary_intBoundary_intParserRuleCall_1_6_0() { return cUBoundary_intBoundary_intParserRuleCall_1_6_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_7() { return cRightSquareBracketKeyword_1_7; }
		
		//';'
		public Keyword getSemicolonKeyword_1_8() { return cSemicolonKeyword_1_8; }
		
		//ID '[' lBoundary_int=Boundary_int '..' uBoundary_int=Boundary_int ']' ID ';'
		public Group getGroup_2() { return cGroup_2; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_0() { return cIDTerminalRuleCall_2_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2_1() { return cLeftSquareBracketKeyword_2_1; }
		
		//lBoundary_int=Boundary_int
		public Assignment getLBoundary_intAssignment_2_2() { return cLBoundary_intAssignment_2_2; }
		
		//Boundary_int
		public RuleCall getLBoundary_intBoundary_intParserRuleCall_2_2_0() { return cLBoundary_intBoundary_intParserRuleCall_2_2_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_2_3() { return cFullStopFullStopKeyword_2_3; }
		
		//uBoundary_int=Boundary_int
		public Assignment getUBoundary_intAssignment_2_4() { return cUBoundary_intAssignment_2_4; }
		
		//Boundary_int
		public RuleCall getUBoundary_intBoundary_intParserRuleCall_2_4_0() { return cUBoundary_intBoundary_intParserRuleCall_2_4_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_5() { return cRightSquareBracketKeyword_2_5; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_6() { return cIDTerminalRuleCall_2_6; }
		
		//';'
		public Keyword getSemicolonKeyword_2_7() { return cSemicolonKeyword_2_7; }
		
		//{Feature_decl_attribute} ID ID ';'
		public Group getGroup_3() { return cGroup_3; }
		
		//{Feature_decl_attribute}
		public Action getFeature_decl_attributeAction_3_0() { return cFeature_decl_attributeAction_3_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_3_1() { return cIDTerminalRuleCall_3_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_3_2() { return cIDTerminalRuleCall_3_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3_3() { return cSemicolonKeyword_3_3; }
	}
	public class Boundary_valElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Boundary_val");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMINUSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Boundary_val:
		//	MINUS? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//MINUS? INT
		public Group getGroup() { return cGroup; }
		
		//MINUS?
		public RuleCall getMINUSTerminalRuleCall_0() { return cMINUSTerminalRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class Boundary_intElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Boundary_int");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMULTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBoundary_valParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Boundary_int:
		//	MULT | Boundary_val;
		@Override public ParserRule getRule() { return rule; }
		
		//MULT | Boundary_val
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MULT
		public RuleCall getMULTTerminalRuleCall_0() { return cMULTTerminalRuleCall_0; }
		
		//Boundary_val
		public RuleCall getBoundary_valParserRuleCall_1() { return cBoundary_valParserRuleCall_1; }
	}
	public class Feature_decl_constraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Feature_decl_constraint");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cGroup_0.eContents().get(0);
		private final Keyword cIfinKeyword_0_0_0 = (Keyword)cGroup_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_0_1 = (Keyword)cGroup_0_0.eContents().get(1);
		private final Assignment cMexpAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cMexpMexpParserRuleCall_0_1_0 = (RuleCall)cMexpAssignment_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cIfoutKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cMexpAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cMexpMexpParserRuleCall_1_2_0 = (RuleCall)cMexpAssignment_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cFeature_decl_constraintAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cExcludeKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Keyword cColonKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_2_3 = (RuleCall)cGroup_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cFeature_decl_constraintAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cRequireKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Keyword cColonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_3_3 = (RuleCall)cGroup_3.eContents().get(3);
		private final Keyword cSemicolonKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		
		////Feature declaration constraint
		//Feature_decl_constraint:
		//	('ifin' ':')? mexp=Mexp ';'
		//	| 'ifout' ':' mexp=Mexp ';'
		//	| {Feature_decl_constraint} 'exclude' ':' ID ';'
		//	| {Feature_decl_constraint} 'require' ':' ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//('ifin' ':')? mexp=Mexp ';' | 'ifout' ':' mexp=Mexp ';' | {Feature_decl_constraint} 'exclude' ':' ID ';' |
		//{Feature_decl_constraint} 'require' ':' ID ';'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//('ifin' ':')? mexp=Mexp ';'
		public Group getGroup_0() { return cGroup_0; }
		
		//('ifin' ':')?
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//'ifin'
		public Keyword getIfinKeyword_0_0_0() { return cIfinKeyword_0_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_0_1() { return cColonKeyword_0_0_1; }
		
		//mexp=Mexp
		public Assignment getMexpAssignment_0_1() { return cMexpAssignment_0_1; }
		
		//Mexp
		public RuleCall getMexpMexpParserRuleCall_0_1_0() { return cMexpMexpParserRuleCall_0_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_0_2() { return cSemicolonKeyword_0_2; }
		
		//'ifout' ':' mexp=Mexp ';'
		public Group getGroup_1() { return cGroup_1; }
		
		//'ifout'
		public Keyword getIfoutKeyword_1_0() { return cIfoutKeyword_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//mexp=Mexp
		public Assignment getMexpAssignment_1_2() { return cMexpAssignment_1_2; }
		
		//Mexp
		public RuleCall getMexpMexpParserRuleCall_1_2_0() { return cMexpMexpParserRuleCall_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_3() { return cSemicolonKeyword_1_3; }
		
		//{Feature_decl_constraint} 'exclude' ':' ID ';'
		public Group getGroup_2() { return cGroup_2; }
		
		//{Feature_decl_constraint}
		public Action getFeature_decl_constraintAction_2_0() { return cFeature_decl_constraintAction_2_0; }
		
		//'exclude'
		public Keyword getExcludeKeyword_2_1() { return cExcludeKeyword_2_1; }
		
		//':'
		public Keyword getColonKeyword_2_2() { return cColonKeyword_2_2; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_3() { return cIDTerminalRuleCall_2_3; }
		
		//';'
		public Keyword getSemicolonKeyword_2_4() { return cSemicolonKeyword_2_4; }
		
		//{Feature_decl_constraint} 'require' ':' ID ';'
		public Group getGroup_3() { return cGroup_3; }
		
		//{Feature_decl_constraint}
		public Action getFeature_decl_constraintAction_3_0() { return cFeature_decl_constraintAction_3_0; }
		
		//'require'
		public Keyword getRequireKeyword_3_1() { return cRequireKeyword_3_1; }
		
		//':'
		public Keyword getColonKeyword_3_2() { return cColonKeyword_3_2; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_3_3() { return cIDTerminalRuleCall_3_3; }
		
		//';'
		public Keyword getSemicolonKeyword_3_4() { return cSemicolonKeyword_3_4; }
	}
	public class MexpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Mexp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cMexpAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cFullStopKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_0_3 = (RuleCall)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cMexpAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cMexpAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cMexpOr_expParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		////Mexp
		//Mexp:
		//	{Mexp} ID '.' ID
		//	| {Mexp} ID
		//	| {Mexp} ID
		//	| MexpOr_exp;
		@Override public ParserRule getRule() { return rule; }
		
		//{Mexp} ID '.' ID | {Mexp} ID | {Mexp} ID | MexpOr_exp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Mexp} ID '.' ID
		public Group getGroup_0() { return cGroup_0; }
		
		//{Mexp}
		public Action getMexpAction_0_0() { return cMexpAction_0_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1() { return cIDTerminalRuleCall_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_0_2() { return cFullStopKeyword_0_2; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_3() { return cIDTerminalRuleCall_0_3; }
		
		//{Mexp} ID
		public Group getGroup_1() { return cGroup_1; }
		
		//{Mexp}
		public Action getMexpAction_1_0() { return cMexpAction_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
		
		//{Mexp} ID
		public Group getGroup_2() { return cGroup_2; }
		
		//{Mexp}
		public Action getMexpAction_2_0() { return cMexpAction_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
		
		//MexpOr_exp
		public RuleCall getMexpOr_expParserRuleCall_3() { return cMexpOr_expParserRuleCall_3; }
	}
	public class MexpOr_expElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpOr_exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMexpAnd_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMexpOr_expLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cORORTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMexpAnd_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////OR_expr
		//MexpOr_exp Mexp:
		//	MexpAnd_expr ({MexpOr_exp.left=current} OROR right=MexpAnd_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MexpAnd_expr ({MexpOr_exp.left=current} OROR right=MexpAnd_expr)*
		public Group getGroup() { return cGroup; }
		
		//MexpAnd_expr
		public RuleCall getMexpAnd_exprParserRuleCall_0() { return cMexpAnd_exprParserRuleCall_0; }
		
		//({MexpOr_exp.left=current} OROR right=MexpAnd_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpOr_exp.left=current}
		public Action getMexpOr_expLeftAction_1_0() { return cMexpOr_expLeftAction_1_0; }
		
		//OROR
		public RuleCall getORORTerminalRuleCall_1_1() { return cORORTerminalRuleCall_1_1; }
		
		//right=MexpAnd_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MexpAnd_expr
		public RuleCall getRightMexpAnd_exprParserRuleCall_1_2_0() { return cRightMexpAnd_exprParserRuleCall_1_2_0; }
	}
	public class MexpAnd_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpAnd_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMexpImplies_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMexpAnd_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cANDANDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMexpImplies_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////And_expr
		//MexpAnd_expr Mexp:
		//	MexpImplies_expr ({MexpAnd_expr.left=current} ANDAND right=MexpImplies_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MexpImplies_expr ({MexpAnd_expr.left=current} ANDAND right=MexpImplies_expr)*
		public Group getGroup() { return cGroup; }
		
		//MexpImplies_expr
		public RuleCall getMexpImplies_exprParserRuleCall_0() { return cMexpImplies_exprParserRuleCall_0; }
		
		//({MexpAnd_expr.left=current} ANDAND right=MexpImplies_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpAnd_expr.left=current}
		public Action getMexpAnd_exprLeftAction_1_0() { return cMexpAnd_exprLeftAction_1_0; }
		
		//ANDAND
		public RuleCall getANDANDTerminalRuleCall_1_1() { return cANDANDTerminalRuleCall_1_1; }
		
		//right=MexpImplies_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MexpImplies_expr
		public RuleCall getRightMexpImplies_exprParserRuleCall_1_2_0() { return cRightMexpImplies_exprParserRuleCall_1_2_0; }
	}
	public class MexpImplies_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpImplies_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMexpEquality_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMexpImplies_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpIMPLIESTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpEQUIVTerminalRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMexpEquality_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//MexpImplies_expr Mexp:
		//	MexpEquality_expr ({MexpImplies_expr.left=current} op=(IMPLIES | EQUIV) right=MexpEquality_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MexpEquality_expr ({MexpImplies_expr.left=current} op=(IMPLIES | EQUIV) right=MexpEquality_expr)*
		public Group getGroup() { return cGroup; }
		
		//MexpEquality_expr
		public RuleCall getMexpEquality_exprParserRuleCall_0() { return cMexpEquality_exprParserRuleCall_0; }
		
		//({MexpImplies_expr.left=current} op=(IMPLIES | EQUIV) right=MexpEquality_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpImplies_expr.left=current}
		public Action getMexpImplies_exprLeftAction_1_0() { return cMexpImplies_exprLeftAction_1_0; }
		
		//op=(IMPLIES | EQUIV)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(IMPLIES | EQUIV)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//IMPLIES
		public RuleCall getOpIMPLIESTerminalRuleCall_1_1_0_0() { return cOpIMPLIESTerminalRuleCall_1_1_0_0; }
		
		//EQUIV
		public RuleCall getOpEQUIVTerminalRuleCall_1_1_0_1() { return cOpEQUIVTerminalRuleCall_1_1_0_1; }
		
		//right=MexpEquality_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MexpEquality_expr
		public RuleCall getRightMexpEquality_exprParserRuleCall_1_2_0() { return cRightMexpEquality_exprParserRuleCall_1_2_0; }
	}
	public class MexpEquality_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpEquality_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMexpComparison_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMexpEquality_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpEQEQTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpNOTEQTerminalRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMexpComparison_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////Equality_expr
		//MexpEquality_expr Mexp:
		//	MexpComparison_expr ({MexpEquality_expr.left=current} op=(EQEQ | NOTEQ) right=MexpComparison_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MexpComparison_expr ({MexpEquality_expr.left=current} op=(EQEQ | NOTEQ) right=MexpComparison_expr)*
		public Group getGroup() { return cGroup; }
		
		//MexpComparison_expr
		public RuleCall getMexpComparison_exprParserRuleCall_0() { return cMexpComparison_exprParserRuleCall_0; }
		
		//({MexpEquality_expr.left=current} op=(EQEQ | NOTEQ) right=MexpComparison_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpEquality_expr.left=current}
		public Action getMexpEquality_exprLeftAction_1_0() { return cMexpEquality_exprLeftAction_1_0; }
		
		//op=(EQEQ | NOTEQ)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(EQEQ | NOTEQ)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//EQEQ
		public RuleCall getOpEQEQTerminalRuleCall_1_1_0_0() { return cOpEQEQTerminalRuleCall_1_1_0_0; }
		
		//NOTEQ
		public RuleCall getOpNOTEQTerminalRuleCall_1_1_0_1() { return cOpNOTEQTerminalRuleCall_1_1_0_1; }
		
		//right=MexpComparison_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MexpComparison_expr
		public RuleCall getRightMexpComparison_exprParserRuleCall_1_2_0() { return cRightMexpComparison_exprParserRuleCall_1_2_0; }
	}
	public class MexpComparison_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpComparison_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMexpPlusOrMinus_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMexpComparison_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpLTTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpGTTerminalRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cOpLTEQTerminalRuleCall_1_1_0_2 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(2);
		private final RuleCall cOpGTEQTerminalRuleCall_1_1_0_3 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(3);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMexpPlusOrMinus_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////Comparison_expr
		//MexpComparison_expr Mexp:
		//	MexpPlusOrMinus_expr ({MexpComparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=MexpPlusOrMinus_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MexpPlusOrMinus_expr ({MexpComparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=MexpPlusOrMinus_expr)*
		public Group getGroup() { return cGroup; }
		
		//MexpPlusOrMinus_expr
		public RuleCall getMexpPlusOrMinus_exprParserRuleCall_0() { return cMexpPlusOrMinus_exprParserRuleCall_0; }
		
		//({MexpComparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=MexpPlusOrMinus_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpComparison_expr.left=current}
		public Action getMexpComparison_exprLeftAction_1_0() { return cMexpComparison_exprLeftAction_1_0; }
		
		//op=(LT | GT | LTEQ | GTEQ)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(LT | GT | LTEQ | GTEQ)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//LT
		public RuleCall getOpLTTerminalRuleCall_1_1_0_0() { return cOpLTTerminalRuleCall_1_1_0_0; }
		
		//GT
		public RuleCall getOpGTTerminalRuleCall_1_1_0_1() { return cOpGTTerminalRuleCall_1_1_0_1; }
		
		//LTEQ
		public RuleCall getOpLTEQTerminalRuleCall_1_1_0_2() { return cOpLTEQTerminalRuleCall_1_1_0_2; }
		
		//GTEQ
		public RuleCall getOpGTEQTerminalRuleCall_1_1_0_3() { return cOpGTEQTerminalRuleCall_1_1_0_3; }
		
		//right=MexpPlusOrMinus_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MexpPlusOrMinus_expr
		public RuleCall getRightMexpPlusOrMinus_exprParserRuleCall_1_2_0() { return cRightMexpPlusOrMinus_exprParserRuleCall_1_2_0; }
	}
	public class MexpPlusOrMinus_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpPlusOrMinus_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMexpMulDivOrMod_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMexpPlusOrMinus_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpPLUSTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cOpMINUSTerminalRuleCall_1_1_0_1 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMexpMulDivOrMod_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////PlusOrMinus
		//MexpPlusOrMinus_expr Mexp:
		//	MexpMulDivOrMod_expr ({MexpPlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MexpMulDivOrMod_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MexpMulDivOrMod_expr ({MexpPlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MexpMulDivOrMod_expr)*
		public Group getGroup() { return cGroup; }
		
		//MexpMulDivOrMod_expr
		public RuleCall getMexpMulDivOrMod_exprParserRuleCall_0() { return cMexpMulDivOrMod_exprParserRuleCall_0; }
		
		//({MexpPlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MexpMulDivOrMod_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpPlusOrMinus_expr.left=current}
		public Action getMexpPlusOrMinus_exprLeftAction_1_0() { return cMexpPlusOrMinus_exprLeftAction_1_0; }
		
		//op=(PLUS | MINUS)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(PLUS | MINUS)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//PLUS
		public RuleCall getOpPLUSTerminalRuleCall_1_1_0_0() { return cOpPLUSTerminalRuleCall_1_1_0_0; }
		
		//MINUS
		public RuleCall getOpMINUSTerminalRuleCall_1_1_0_1() { return cOpMINUSTerminalRuleCall_1_1_0_1; }
		
		//right=MexpMulDivOrMod_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MexpMulDivOrMod_expr
		public RuleCall getRightMexpMulDivOrMod_exprParserRuleCall_1_2_0() { return cRightMexpMulDivOrMod_exprParserRuleCall_1_2_0; }
	}
	public class MexpMulDivOrMod_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpMulDivOrMod_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMexpPrimary_exprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMexpMulDivOrMod_exprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final RuleCall cOpMULTTerminalRuleCall_1_1_0_0 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpSolidusKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cOpMODTerminalRuleCall_1_1_0_2 = (RuleCall)cOpAlternatives_1_1_0.eContents().get(2);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMexpPrimary_exprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		////MulDivOrMod_expr
		//MexpMulDivOrMod_expr Mexp:
		//	MexpPrimary_expr ({MexpMulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=MexpPrimary_expr)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MexpPrimary_expr ({MexpMulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=MexpPrimary_expr)*
		public Group getGroup() { return cGroup; }
		
		//MexpPrimary_expr
		public RuleCall getMexpPrimary_exprParserRuleCall_0() { return cMexpPrimary_exprParserRuleCall_0; }
		
		//({MexpMulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=MexpPrimary_expr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpMulDivOrMod_expr.left=current}
		public Action getMexpMulDivOrMod_exprLeftAction_1_0() { return cMexpMulDivOrMod_exprLeftAction_1_0; }
		
		//op=(MULT | '/' | MOD)
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//(MULT | '/' | MOD)
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//MULT
		public RuleCall getOpMULTTerminalRuleCall_1_1_0_0() { return cOpMULTTerminalRuleCall_1_1_0_0; }
		
		//'/'
		public Keyword getOpSolidusKeyword_1_1_0_1() { return cOpSolidusKeyword_1_1_0_1; }
		
		//MOD
		public RuleCall getOpMODTerminalRuleCall_1_1_0_2() { return cOpMODTerminalRuleCall_1_1_0_2; }
		
		//right=MexpPrimary_expr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MexpPrimary_expr
		public RuleCall getRightMexpPrimary_exprParserRuleCall_1_2_0() { return cRightMexpPrimary_exprParserRuleCall_1_2_0; }
	}
	public class MexpPrimary_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpPrimary_expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cMexpPrimary_exprAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cAAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cAMexpParserRuleCall_0_2_0 = (RuleCall)cAAssignment_0_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cMexpPrimary_exprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cNEGATIONTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cMINUSTerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cMexpAtomic_exprParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////Primary_expr
		//MexpPrimary_expr Mexp:
		//	{MexpPrimary_expr}
		//	'(' a=Mexp ')' | {MexpPrimary_expr} (NEGATION | MINUS) | MexpAtomic_expr;
		@Override public ParserRule getRule() { return rule; }
		
		//{MexpPrimary_expr} '(' a=Mexp ')' | {MexpPrimary_expr} (NEGATION | MINUS) | MexpAtomic_expr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{MexpPrimary_expr} '(' a=Mexp ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//{MexpPrimary_expr}
		public Action getMexpPrimary_exprAction_0_0() { return cMexpPrimary_exprAction_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }
		
		//a=Mexp
		public Assignment getAAssignment_0_2() { return cAAssignment_0_2; }
		
		//Mexp
		public RuleCall getAMexpParserRuleCall_0_2_0() { return cAMexpParserRuleCall_0_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }
		
		//{MexpPrimary_expr} (NEGATION | MINUS)
		public Group getGroup_1() { return cGroup_1; }
		
		//{MexpPrimary_expr}
		public Action getMexpPrimary_exprAction_1_0() { return cMexpPrimary_exprAction_1_0; }
		
		//NEGATION | MINUS
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//NEGATION
		public RuleCall getNEGATIONTerminalRuleCall_1_1_0() { return cNEGATIONTerminalRuleCall_1_1_0; }
		
		//MINUS
		public RuleCall getMINUSTerminalRuleCall_1_1_1() { return cMINUSTerminalRuleCall_1_1_1; }
		
		//MexpAtomic_expr
		public RuleCall getMexpAtomic_exprParserRuleCall_2() { return cMexpAtomic_exprParserRuleCall_2; }
	}
	public class MexpAtomic_exprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MexpAtomic_expr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMexpAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		////Atomic_expr
		//MexpAtomic_expr Mexp:
		//	{Mexp} value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//{Mexp} value=INT
		public Group getGroup() { return cGroup; }
		
		//{Mexp}
		public Action getMexpAction_0() { return cMexpAction_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class FextensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.Fextension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFextensionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeature_decl_groupAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeature_decl_groupFeature_decl_groupParserRuleCall_3_0 = (RuleCall)cFeature_decl_groupAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cFeature_decl_attributeAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cFeature_decl_attributeFeature_decl_attributeParserRuleCall_4_0_0 = (RuleCall)cFeature_decl_attributeAssignment_4_0.eContents().get(0);
		private final Assignment cFeature_decl_constraintAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cFeature_decl_constraintFeature_decl_constraintParserRuleCall_4_1_0 = (RuleCall)cFeature_decl_constraintAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		///*
		// * 
		// * Feature Extension
		// * 
		// */ Fextension:
		//	{Fextension} name=ID '{' feature_decl_group=Feature_decl_group? (feature_decl_attribute+=Feature_decl_attribute |
		//	feature_decl_constraint+=Feature_decl_constraint)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Fextension} name=ID '{' feature_decl_group=Feature_decl_group? (feature_decl_attribute+=Feature_decl_attribute |
		//feature_decl_constraint+=Feature_decl_constraint)* '}'
		public Group getGroup() { return cGroup; }
		
		//{Fextension}
		public Action getFextensionAction_0() { return cFextensionAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//feature_decl_group=Feature_decl_group?
		public Assignment getFeature_decl_groupAssignment_3() { return cFeature_decl_groupAssignment_3; }
		
		//Feature_decl_group
		public RuleCall getFeature_decl_groupFeature_decl_groupParserRuleCall_3_0() { return cFeature_decl_groupFeature_decl_groupParserRuleCall_3_0; }
		
		//(feature_decl_attribute+=Feature_decl_attribute | feature_decl_constraint+=Feature_decl_constraint)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//feature_decl_attribute+=Feature_decl_attribute
		public Assignment getFeature_decl_attributeAssignment_4_0() { return cFeature_decl_attributeAssignment_4_0; }
		
		//Feature_decl_attribute
		public RuleCall getFeature_decl_attributeFeature_decl_attributeParserRuleCall_4_0_0() { return cFeature_decl_attributeFeature_decl_attributeParserRuleCall_4_0_0; }
		
		//feature_decl_constraint+=Feature_decl_constraint
		public Assignment getFeature_decl_constraintAssignment_4_1() { return cFeature_decl_constraintAssignment_4_1; }
		
		//Feature_decl_constraint
		public RuleCall getFeature_decl_constraintFeature_decl_constraintParserRuleCall_4_1_0() { return cFeature_decl_constraintFeature_decl_constraintParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.'?
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}
	
	
	private final DomainModelElements pDomainModel;
	private final Compilation_UnitElements pCompilation_Unit;
	private final Module_declElements pModule_decl;
	private final Module_exportElements pModule_export;
	private final Module_importElements pModule_import;
	private final DeclElements pDecl;
	private final Par_function_declElements pPar_function_decl;
	private final Function_name_listElements pFunction_name_list;
	private final Function_name_declElements pFunction_name_decl;
	private final DataType_declElements pDataType_decl;
	private final Data_constructorElements pData_constructor;
	private final Data_constructor_argElements pData_constructor_arg;
	private final AnnotationsElements pAnnotations;
	private final AnnotationElements pAnnotation;
	private final Type_useElements pType_use;
	private final Pure_expElements pPure_exp;
	private final Or_exprElements pOr_expr;
	private final And_exprElements pAnd_expr;
	private final Equality_exprElements pEquality_expr;
	private final Comparison_exprElements pComparison_expr;
	private final PlusOrMinus_exprElements pPlusOrMinus_expr;
	private final MulDivOrMod_exprElements pMulDivOrMod_expr;
	private final Uniary_exprElements pUniary_expr;
	private final Primary_exprElements pPrimary_expr;
	private final Atomic_exprElements pAtomic_expr;
	private final Var_or_field_refElements pVar_or_field_ref;
	private final Case_branchElements pCase_branch;
	private final PatternElements pPattern;
	private final Pure_exp_listElements pPure_exp_list;
	private final Function_listElements pFunction_list;
	private final Function_paramElements pFunction_param;
	private final Function_name_param_declElements pFunction_name_param_decl;
	private final Anon_function_declElements pAnon_function_decl;
	private final Param_listElements pParam_list;
	private final Param_declElements pParam_decl;
	private final Type_expElements pType_exp;
	private final Function_declElements pFunction_decl;
	private final Typesyn_declElements pTypesyn_decl;
	private final Exception_declElements pException_decl;
	private final Interface_declElements pInterface_decl;
	private final Interface_nameElements pInterface_name;
	private final MethodsigElements pMethodsig;
	private final Class_declElements pClass_decl;
	private final Field_declElements pField_decl;
	private final StmtElements pStmt;
	private final ExpElements pExp;
	private final Eff_exprElements pEff_expr;
	private final Delta_idElements pDelta_id;
	private final GuardElements pGuard;
	private final AndGuardElements pAndGuard;
	private final PrimaryGuardElements pPrimaryGuard;
	private final CasestmtbranchElements pCasestmtbranch;
	private final Trait_usageElements pTrait_usage;
	private final Trait_exprElements pTrait_expr;
	private final Trait_Left_exprElements pTrait_Left_expr;
	private final Primary_Trait_exprElements pPrimary_Trait_expr;
	private final Trait_operElements pTrait_oper;
	private final MethodElements pMethod;
	private final Trait_declElements pTrait_decl;
	private final Main_blockElements pMain_block;
	private final Delta_declElements pDelta_decl;
	private final Delta_paramElements pDelta_param;
	private final Has_conditionElements pHas_condition;
	private final Delta_accessElements pDelta_access;
	private final Module_modifierElements pModule_modifier;
	private final Functional_modifierElements pFunctional_modifier;
	private final OO_modifierElements pOO_modifier;
	private final Class_modifier_fragmentElements pClass_modifier_fragment;
	private final Interface_modifier_fragmentElements pInterface_modifier_fragment;
	private final Namespace_modifierElements pNamespace_modifier;
	private final Update_declElements pUpdate_decl;
	private final Object_updateElements pObject_update;
	private final Update_preamble_declarationElements pUpdate_preamble_declaration;
	private final Object_update_assign_stmtElements pObject_update_assign_stmt;
	private final Productline_declElements pProductline_decl;
	private final FeatureElements pFeature;
	private final Attr_assignmentElements pAttr_assignment;
	private final Delta_clauseElements pDelta_clause;
	private final DeltaspecElements pDeltaspec;
	private final Deltaspec_paramElements pDeltaspec_param;
	private final After_conditionElements pAfter_condition;
	private final From_conditionElements pFrom_condition;
	private final When_conditionElements pWhen_condition;
	private final Application_conditionElements pApplication_condition;
	private final AppOr_expElements pAppOr_exp;
	private final AppAnd_expElements pAppAnd_exp;
	private final AppUnary_expElements pAppUnary_exp;
	private final AppPrimary_expElements pAppPrimary_exp;
	private final AppCond_atomic_exprElements pAppCond_atomic_expr;
	private final Product_declElements pProduct_decl;
	private final Product_exprElements pProduct_expr;
	private final ProductOr_exprElements pProductOr_expr;
	private final ProductAnd_expElements pProductAnd_exp;
	private final ProductMinus_expElements pProductMinus_exp;
	private final ProductPrimary_expElements pProductPrimary_exp;
	private final AtomicProduct_exprElements pAtomicProduct_expr;
	private final Product_reconfigurationElements pProduct_reconfiguration;
	private final Feature_declElements pFeature_decl;
	private final Feature_decl_groupElements pFeature_decl_group;
	private final FnodeElements pFnode;
	private final Feature_decl_attributeElements pFeature_decl_attribute;
	private final Boundary_valElements pBoundary_val;
	private final Boundary_intElements pBoundary_int;
	private final Feature_decl_constraintElements pFeature_decl_constraint;
	private final MexpElements pMexp;
	private final MexpOr_expElements pMexpOr_exp;
	private final MexpAnd_exprElements pMexpAnd_expr;
	private final MexpImplies_exprElements pMexpImplies_expr;
	private final MexpEquality_exprElements pMexpEquality_expr;
	private final MexpComparison_exprElements pMexpComparison_expr;
	private final MexpPlusOrMinus_exprElements pMexpPlusOrMinus_expr;
	private final MexpMulDivOrMod_exprElements pMexpMulDivOrMod_expr;
	private final MexpPrimary_exprElements pMexpPrimary_expr;
	private final MexpAtomic_exprElements pMexpAtomic_expr;
	private final FextensionElements pFextension;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tSTR_ESC;
	private final TerminalRule tSTRINGLITERAL;
	private final TerminalRule tNEGATION_CREOL;
	private final TerminalRule tNEGATION;
	private final TerminalRule tMINUS;
	private final TerminalRule tMULT;
	private final TerminalRule tMOD;
	private final TerminalRule tPLUS;
	private final TerminalRule tLTEQ;
	private final TerminalRule tGTEQ;
	private final TerminalRule tLT;
	private final TerminalRule tGT;
	private final TerminalRule tANDAND;
	private final TerminalRule tOROR;
	private final TerminalRule tEQEQ;
	private final TerminalRule tNOTEQ;
	private final TerminalRule tIMPLIES;
	private final TerminalRule tEQUIV;
	private final TerminalRule tSTRING;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final QualifiedNameElements pQualifiedName;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	
	private final Grammar grammar;

	@Inject
	public AbsGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pDomainModel = new DomainModelElements();
		this.pCompilation_Unit = new Compilation_UnitElements();
		this.pModule_decl = new Module_declElements();
		this.pModule_export = new Module_exportElements();
		this.pModule_import = new Module_importElements();
		this.pDecl = new DeclElements();
		this.pPar_function_decl = new Par_function_declElements();
		this.pFunction_name_list = new Function_name_listElements();
		this.pFunction_name_decl = new Function_name_declElements();
		this.pDataType_decl = new DataType_declElements();
		this.pData_constructor = new Data_constructorElements();
		this.pData_constructor_arg = new Data_constructor_argElements();
		this.pAnnotations = new AnnotationsElements();
		this.pAnnotation = new AnnotationElements();
		this.pType_use = new Type_useElements();
		this.pPure_exp = new Pure_expElements();
		this.pOr_expr = new Or_exprElements();
		this.pAnd_expr = new And_exprElements();
		this.pEquality_expr = new Equality_exprElements();
		this.pComparison_expr = new Comparison_exprElements();
		this.pPlusOrMinus_expr = new PlusOrMinus_exprElements();
		this.pMulDivOrMod_expr = new MulDivOrMod_exprElements();
		this.pUniary_expr = new Uniary_exprElements();
		this.pPrimary_expr = new Primary_exprElements();
		this.pAtomic_expr = new Atomic_exprElements();
		this.pVar_or_field_ref = new Var_or_field_refElements();
		this.pCase_branch = new Case_branchElements();
		this.pPattern = new PatternElements();
		this.pPure_exp_list = new Pure_exp_listElements();
		this.pFunction_list = new Function_listElements();
		this.pFunction_param = new Function_paramElements();
		this.pFunction_name_param_decl = new Function_name_param_declElements();
		this.pAnon_function_decl = new Anon_function_declElements();
		this.pParam_list = new Param_listElements();
		this.pParam_decl = new Param_declElements();
		this.pType_exp = new Type_expElements();
		this.pFunction_decl = new Function_declElements();
		this.pTypesyn_decl = new Typesyn_declElements();
		this.pException_decl = new Exception_declElements();
		this.pInterface_decl = new Interface_declElements();
		this.pInterface_name = new Interface_nameElements();
		this.pMethodsig = new MethodsigElements();
		this.pClass_decl = new Class_declElements();
		this.pField_decl = new Field_declElements();
		this.pStmt = new StmtElements();
		this.pExp = new ExpElements();
		this.pEff_expr = new Eff_exprElements();
		this.pDelta_id = new Delta_idElements();
		this.pGuard = new GuardElements();
		this.pAndGuard = new AndGuardElements();
		this.pPrimaryGuard = new PrimaryGuardElements();
		this.pCasestmtbranch = new CasestmtbranchElements();
		this.pTrait_usage = new Trait_usageElements();
		this.pTrait_expr = new Trait_exprElements();
		this.pTrait_Left_expr = new Trait_Left_exprElements();
		this.pPrimary_Trait_expr = new Primary_Trait_exprElements();
		this.pTrait_oper = new Trait_operElements();
		this.pMethod = new MethodElements();
		this.pTrait_decl = new Trait_declElements();
		this.pMain_block = new Main_blockElements();
		this.pDelta_decl = new Delta_declElements();
		this.pDelta_param = new Delta_paramElements();
		this.pHas_condition = new Has_conditionElements();
		this.pDelta_access = new Delta_accessElements();
		this.pModule_modifier = new Module_modifierElements();
		this.pFunctional_modifier = new Functional_modifierElements();
		this.pOO_modifier = new OO_modifierElements();
		this.pClass_modifier_fragment = new Class_modifier_fragmentElements();
		this.pInterface_modifier_fragment = new Interface_modifier_fragmentElements();
		this.pNamespace_modifier = new Namespace_modifierElements();
		this.pUpdate_decl = new Update_declElements();
		this.pObject_update = new Object_updateElements();
		this.pUpdate_preamble_declaration = new Update_preamble_declarationElements();
		this.pObject_update_assign_stmt = new Object_update_assign_stmtElements();
		this.pProductline_decl = new Productline_declElements();
		this.pFeature = new FeatureElements();
		this.pAttr_assignment = new Attr_assignmentElements();
		this.pDelta_clause = new Delta_clauseElements();
		this.pDeltaspec = new DeltaspecElements();
		this.pDeltaspec_param = new Deltaspec_paramElements();
		this.pAfter_condition = new After_conditionElements();
		this.pFrom_condition = new From_conditionElements();
		this.pWhen_condition = new When_conditionElements();
		this.pApplication_condition = new Application_conditionElements();
		this.pAppOr_exp = new AppOr_expElements();
		this.pAppAnd_exp = new AppAnd_expElements();
		this.pAppUnary_exp = new AppUnary_expElements();
		this.pAppPrimary_exp = new AppPrimary_expElements();
		this.pAppCond_atomic_expr = new AppCond_atomic_exprElements();
		this.pProduct_decl = new Product_declElements();
		this.pProduct_expr = new Product_exprElements();
		this.pProductOr_expr = new ProductOr_exprElements();
		this.pProductAnd_exp = new ProductAnd_expElements();
		this.pProductMinus_exp = new ProductMinus_expElements();
		this.pProductPrimary_exp = new ProductPrimary_expElements();
		this.pAtomicProduct_expr = new AtomicProduct_exprElements();
		this.pProduct_reconfiguration = new Product_reconfigurationElements();
		this.pFeature_decl = new Feature_declElements();
		this.pFeature_decl_group = new Feature_decl_groupElements();
		this.pFnode = new FnodeElements();
		this.pFeature_decl_attribute = new Feature_decl_attributeElements();
		this.pBoundary_val = new Boundary_valElements();
		this.pBoundary_int = new Boundary_intElements();
		this.pFeature_decl_constraint = new Feature_decl_constraintElements();
		this.pMexp = new MexpElements();
		this.pMexpOr_exp = new MexpOr_expElements();
		this.pMexpAnd_expr = new MexpAnd_exprElements();
		this.pMexpImplies_expr = new MexpImplies_exprElements();
		this.pMexpEquality_expr = new MexpEquality_exprElements();
		this.pMexpComparison_expr = new MexpComparison_exprElements();
		this.pMexpPlusOrMinus_expr = new MexpPlusOrMinus_exprElements();
		this.pMexpMulDivOrMod_expr = new MexpMulDivOrMod_exprElements();
		this.pMexpPrimary_expr = new MexpPrimary_exprElements();
		this.pMexpAtomic_expr = new MexpAtomic_exprElements();
		this.pFextension = new FextensionElements();
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.WS");
		this.tSTR_ESC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.STR_ESC");
		this.tSTRINGLITERAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.STRINGLITERAL");
		this.tNEGATION_CREOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.NEGATION_CREOL");
		this.tNEGATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.NEGATION");
		this.tMINUS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MINUS");
		this.tMULT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MULT");
		this.tMOD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.MOD");
		this.tPLUS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.PLUS");
		this.tLTEQ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.LTEQ");
		this.tGTEQ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.GTEQ");
		this.tLT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.LT");
		this.tGT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.GT");
		this.tANDAND = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.ANDAND");
		this.tOROR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.OROR");
		this.tEQEQ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.EQEQ");
		this.tNOTEQ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.NOTEQ");
		this.tIMPLIES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.IMPLIES");
		this.tEQUIV = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.EQUIV");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.STRING");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Abs.INT");
		this.pQualifiedName = new QualifiedNameElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.Abs".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	////Goal Main Model OR Starting Rule
	//DomainModel:
	//	Compilation_Unit;
	public DomainModelElements getDomainModelAccess() {
		return pDomainModel;
	}
	
	public ParserRule getDomainModelRule() {
		return getDomainModelAccess().getRule();
	}
	
	////compilationUnit+=Compilation_Unit;
	////Compilation Unit
	//Compilation_Unit:
	//	{Compilation_Unit} module+=Module_decl* deltaDecl+=Delta_decl*
	//	update_decl+=Update_decl* productline_decl=Productline_decl?
	//	product_decl+=Product_decl* ('root' feature_decl+=Feature_decl | 'extension' fextension+=Fextension)*;
	public Compilation_UnitElements getCompilation_UnitAccess() {
		return pCompilation_Unit;
	}
	
	public ParserRule getCompilation_UnitRule() {
		return getCompilation_UnitAccess().getRule();
	}
	
	////Module_Decl
	////Module_Decl
	//Module_decl:
	//	'module' name=ID ';'
	//	module_export+=Module_export* module_import+=Module_import* decl+=Decl*
	//	main_block+=Main_block?;
	public Module_declElements getModule_declAccess() {
		return pModule_decl;
	}
	
	public ParserRule getModule_declRule() {
		return getModule_declAccess().getRule();
	}
	
	////Module_export
	//Module_export:
	//	{Module_export} 'export' (star=MULT | anyPackage+=QualifiedName (',' anyPackage+=QualifiedName)*) ('from'
	//	importedNamespace+=QualifiedName)? ';';
	public Module_exportElements getModule_exportAccess() {
		return pModule_export;
	}
	
	public ParserRule getModule_exportRule() {
		return getModule_exportAccess().getRule();
	}
	
	////Module_import
	//Module_import:
	//	'import' (star=MULT 'from' importedNamespace=QualifiedName ';'
	//	| name+=QualifiedName (',' name+=QualifiedName)* ('from' importedNamespace=QualifiedName)? ';');
	public Module_importElements getModule_importAccess() {
		return pModule_import;
	}
	
	public ParserRule getModule_importRule() {
		return getModule_importAccess().getRule();
	}
	
	////Declaration
	//Decl:
	//	DataType_decl
	//	| Function_decl
	//	| Par_function_decl
	//	| Typesyn_decl
	//	| Exception_decl
	//	| Interface_decl
	//	| Class_decl
	//	| Trait_decl;
	public DeclElements getDeclAccess() {
		return pDecl;
	}
	
	public ParserRule getDeclRule() {
		return getDeclAccess().getRule();
	}
	
	////Par Function Declaration
	//Par_function_decl: //annotation+=Annotation 
	//	'def' type_use=Type_use name=ID (LT p+=ID (',' p+=ID)* GT)? '(' functions=Function_name_list ')' params=Param_list '='
	//	e=Pure_exp ';';
	public Par_function_declElements getPar_function_declAccess() {
		return pPar_function_decl;
	}
	
	public ParserRule getPar_function_declRule() {
		return getPar_function_declAccess().getRule();
	}
	
	////Function Name List
	//Function_name_list:
	//	{Function_name_list} (function_name_decl+=Function_name_decl (',' function_name_decl+=Function_name_decl)*)?;
	public Function_name_listElements getFunction_name_listAccess() {
		return pFunction_name_list;
	}
	
	public ParserRule getFunction_name_listRule() {
		return getFunction_name_listAccess().getRule();
	}
	
	////Function Name Declaration
	//Function_name_decl:
	//	name=ID;
	public Function_name_declElements getFunction_name_declAccess() {
		return pFunction_name_decl;
	}
	
	public ParserRule getFunction_name_declRule() {
		return getFunction_name_declAccess().getRule();
	}
	
	////DataType_decl
	//DataType_decl: //annotations=Annotations 
	//	'data' name=ID (LT p+=ID (',' p+=ID)* GT)? ('=' data_constructor+=Data_constructor ('|'
	//	data_constructor+=Data_constructor)*)? ';';
	public DataType_declElements getDataType_declAccess() {
		return pDataType_decl;
	}
	
	public ParserRule getDataType_declRule() {
		return getDataType_declAccess().getRule();
	}
	
	////Data Constructor 
	//Data_constructor:
	//	name=ID ('('
	//	data_constructor_arg+=Data_constructor_arg (',' data_constructor_arg+=Data_constructor_arg)*
	//	')')?;
	public Data_constructorElements getData_constructorAccess() {
		return pData_constructor;
	}
	
	public ParserRule getData_constructorRule() {
		return getData_constructorAccess().getRule();
	}
	
	////Data Constructor Argument
	//Data_constructor_arg:
	//	Type_use ID?;
	public Data_constructor_argElements getData_constructor_argAccess() {
		return pData_constructor_arg;
	}
	
	public ParserRule getData_constructor_argRule() {
		return getData_constructor_argAccess().getRule();
	}
	
	////Annotations
	//Annotations:
	//	{Annotations} ('[' annotation+=Annotation (',' annotation+=Annotation)* ']')*;
	public AnnotationsElements getAnnotationsAccess() {
		return pAnnotations;
	}
	
	public ParserRule getAnnotationsRule() {
		return getAnnotationsAccess().getRule();
	}
	
	////Annotation
	//Annotation:
	//	(Type_use ':')? pure_exp=Pure_exp;
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}
	
	////Type_use (Check may have error, removed annotations from starting)
	//Type_use:
	//	name=QualifiedName (LT type_use+=Type_use (',' type_use+=Type_use)* GT)?;
	public Type_useElements getType_useAccess() {
		return pType_use;
	}
	
	public ParserRule getType_useRule() {
		return getType_useAccess().getRule();
	}
	
	////Pure_exp
	//Pure_exp:
	//	QualifiedName '(' pure_exp_list=Pure_exp_list ')'
	//	| QualifiedName '(' function_list+=Function_list ')' '(' partial_function_pure_exp_list=Pure_exp_list ')'
	//	| QualifiedName '[' variadic_exp_list=Pure_exp_list ']'
	//	| Or_expr
	//	| 'if' if=Pure_exp 'then' then=Pure_exp (=> 'else' else=Pure_exp)?
	//	| 'case' case=Pure_exp '{' casebranch+=Case_branch* '}'
	//	| 'let' '(' type_use=Type_use value=ID ')' '=' i=Pure_exp 'in' b=Pure_exp
	//	//|{Pure_exp}STRING
	//	//|var_or_field_ref=[Var_or_field_ref|ID]
	//;
	public Pure_expElements getPure_expAccess() {
		return pPure_exp;
	}
	
	public ParserRule getPure_expRule() {
		return getPure_expAccess().getRule();
	}
	
	////Or_expr
	//Or_expr Pure_exp:
	//	And_expr ({Or_expr.left=current} op=OROR right=And_expr)*;
	public Or_exprElements getOr_exprAccess() {
		return pOr_expr;
	}
	
	public ParserRule getOr_exprRule() {
		return getOr_exprAccess().getRule();
	}
	
	////And_expr
	//And_expr Pure_exp:
	//	Equality_expr ({And_expr.left=current} op=ANDAND right=Equality_expr)*;
	public And_exprElements getAnd_exprAccess() {
		return pAnd_expr;
	}
	
	public ParserRule getAnd_exprRule() {
		return getAnd_exprAccess().getRule();
	}
	
	////Equality_expr
	//Equality_expr Pure_exp:
	//	Comparison_expr ({Equality_expr.left=current} op=(EQEQ | NOTEQ) right=Comparison_expr)*;
	public Equality_exprElements getEquality_exprAccess() {
		return pEquality_expr;
	}
	
	public ParserRule getEquality_exprRule() {
		return getEquality_exprAccess().getRule();
	}
	
	////Comparison_expr
	//Comparison_expr Pure_exp:
	//	PlusOrMinus_expr ({Comparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=PlusOrMinus_expr)*;
	public Comparison_exprElements getComparison_exprAccess() {
		return pComparison_expr;
	}
	
	public ParserRule getComparison_exprRule() {
		return getComparison_exprAccess().getRule();
	}
	
	////PlusOrMinus
	//PlusOrMinus_expr Pure_exp:
	//	MulDivOrMod_expr ({PlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MulDivOrMod_expr)*;
	public PlusOrMinus_exprElements getPlusOrMinus_exprAccess() {
		return pPlusOrMinus_expr;
	}
	
	public ParserRule getPlusOrMinus_exprRule() {
		return getPlusOrMinus_exprAccess().getRule();
	}
	
	////MulDivOrMod_expr
	//MulDivOrMod_expr Pure_exp:
	//	Primary_expr ({MulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=Uniary_expr)*;
	public MulDivOrMod_exprElements getMulDivOrMod_exprAccess() {
		return pMulDivOrMod_expr;
	}
	
	public ParserRule getMulDivOrMod_exprRule() {
		return getMulDivOrMod_exprAccess().getRule();
	}
	
	//Uniary_expr Pure_exp:
	//	op=(NEGATION | NEGATION_CREOL | MINUS) pure_exp=Pure_exp | Primary_expr;
	public Uniary_exprElements getUniary_exprAccess() {
		return pUniary_expr;
	}
	
	public ParserRule getUniary_exprRule() {
		return getUniary_exprAccess().getRule();
	}
	
	////Primary_expr
	//Primary_expr Pure_exp:
	//	'(' Pure_exp ')'
	//	| Atomic_expr;
	public Primary_exprElements getPrimary_exprAccess() {
		return pPrimary_expr;
	}
	
	public ParserRule getPrimary_exprRule() {
		return getPrimary_exprAccess().getRule();
	}
	
	////Atomic_expr
	//Atomic_expr Pure_exp:
	//	{Pure_exp} INT
	//	| {Pure_exp} STRINGLITERAL
	//	| Var_or_field_ref
	//	| {Pure_exp} 'this'
	//	| {Pure_exp} 'null'
	//	| {Pure_exp} STRING;
	public Atomic_exprElements getAtomic_exprAccess() {
		return pAtomic_expr;
	}
	
	public ParserRule getAtomic_exprRule() {
		return getAtomic_exprAccess().getRule();
	}
	
	//Var_or_field_ref:
	//	('this' '.')? name=ID
	//	| ref=[Field_decl];
	public Var_or_field_refElements getVar_or_field_refAccess() {
		return pVar_or_field_ref;
	}
	
	public ParserRule getVar_or_field_refRule() {
		return getVar_or_field_refAccess().getRule();
	}
	
	////Case_branch
	//Case_branch:
	//	Pattern '=>' pure_exp=Pure_exp ';';
	public Case_branchElements getCase_branchAccess() {
		return pCase_branch;
	}
	
	public ParserRule getCase_branchRule() {
		return getCase_branchAccess().getRule();
	}
	
	////Pattern
	//Pattern:
	//	{Pattern} ('_'
	//	| INT
	//	| STRINGLITERAL
	//	| ID
	//	| QualifiedName ('(' (pattern+=Pattern (',' pattern+=Pattern)*)? ')'));
	public PatternElements getPatternAccess() {
		return pPattern;
	}
	
	public ParserRule getPatternRule() {
		return getPatternAccess().getRule();
	}
	
	////Pure_exp_list
	//Pure_exp_list:
	//	{Pure_exp_list} (pure_exp+=Pure_exp (',' pure_exp+=Pure_exp)*)?;
	public Pure_exp_listElements getPure_exp_listAccess() {
		return pPure_exp_list;
	}
	
	public ParserRule getPure_exp_listRule() {
		return getPure_exp_listAccess().getRule();
	}
	
	////Function_list
	//Function_list:
	//	{Function_list} (function_param+=Function_param (',' function_param+=Function_param)*)?;
	public Function_listElements getFunction_listAccess() {
		return pFunction_list;
	}
	
	public ParserRule getFunction_listRule() {
		return getFunction_listAccess().getRule();
	}
	
	////Function_parameters
	//Function_param:
	//	Function_name_param_decl
	//	| Anon_function_decl;
	public Function_paramElements getFunction_paramAccess() {
		return pFunction_param;
	}
	
	public ParserRule getFunction_paramRule() {
		return getFunction_paramAccess().getRule();
	}
	
	////Function_name_param_decl
	//Function_name_param_decl:
	//	value=ID;
	public Function_name_param_declElements getFunction_name_param_declAccess() {
		return pFunction_name_param_decl;
	}
	
	public ParserRule getFunction_name_param_declRule() {
		return getFunction_name_param_declAccess().getRule();
	}
	
	////Anonymous_function_decl
	//Anon_function_decl:
	//	params=Param_list "=>" pure_exp=Pure_exp;
	public Anon_function_declElements getAnon_function_declAccess() {
		return pAnon_function_decl;
	}
	
	public ParserRule getAnon_function_declRule() {
		return getAnon_function_declAccess().getRule();
	}
	
	////Parameter_list (Check for error need reference or not)
	//Param_list:
	//	{Param_list} '(' (param_decl+=Param_decl (',' param_decl+=Param_decl)*)? ')';
	public Param_listElements getParam_listAccess() {
		return pParam_list;
	}
	
	public ParserRule getParam_listRule() {
		return getParam_listAccess().getRule();
	}
	
	////Param_declaration
	//Param_decl:
	//	type_exp=Type_exp name=ID;
	public Param_declElements getParam_declAccess() {
		return pParam_decl;
	}
	
	public ParserRule getParam_declRule() {
		return getParam_declAccess().getRule();
	}
	
	////Type Expression
	//Type_exp:
	//	name=QualifiedName (LT p+=Type_use (',' p+=Type_use)* GT)?;
	public Type_expElements getType_expAccess() {
		return pType_exp;
	}
	
	public ParserRule getType_expRule() {
		return getType_expAccess().getRule();
	}
	
	////Function Declaration
	//Function_decl: //annotations=Annotations 
	//	'def' type_use=Type_use name=ID (LT p+=ID (',' p+=ID)* GT)? paramlist=Param_list '=' ('builtin' | pure_exp=Pure_exp)
	//	';';
	public Function_declElements getFunction_declAccess() {
		return pFunction_decl;
	}
	
	public ParserRule getFunction_declRule() {
		return getFunction_declAccess().getRule();
	}
	
	////TypeSyn Declaration
	//Typesyn_decl:
	//	'type' name=ID '=' type_use=Type_use ';';
	public Typesyn_declElements getTypesyn_declAccess() {
		return pTypesyn_decl;
	}
	
	public ParserRule getTypesyn_declRule() {
		return getTypesyn_declAccess().getRule();
	}
	
	////Exception Declaration
	//Exception_decl: //annotations=Annotations 
	//	'exception' name=ID ('(' type+=[Data_constructor_arg] (',' type+=[Data_constructor_arg])* ')')? ';';
	public Exception_declElements getException_declAccess() {
		return pException_decl;
	}
	
	public ParserRule getException_declRule() {
		return getException_declAccess().getRule();
	}
	
	////Interface Declaration
	//Interface_decl: //annotations=Annotations 
	//	'interface' name=ID ('extends' interface_name+=[Interface_decl|QualifiedName] (','
	//	interface_name+=[Interface_decl|QualifiedName])*)? '{' methodsig+=Methodsig* '}';
	public Interface_declElements getInterface_declAccess() {
		return pInterface_decl;
	}
	
	public ParserRule getInterface_declRule() {
		return getInterface_declAccess().getRule();
	}
	
	////Interface Name
	//Interface_name:
	//	name=QualifiedName;
	public Interface_nameElements getInterface_nameAccess() {
		return pInterface_name;
	}
	
	public ParserRule getInterface_nameRule() {
		return getInterface_nameAccess().getRule();
	}
	
	////Method Signature 
	//Methodsig:
	//	type_use=Type_use name=ID paramlist=Param_list ';';
	public MethodsigElements getMethodsigAccess() {
		return pMethodsig;
	}
	
	public ParserRule getMethodsigRule() {
		return getMethodsigAccess().getRule();
	}
	
	////Class Declaration
	//Class_decl: //annotations=Annotations 
	//	'class' name=ID paramlist=Param_list? ('implements' interface_name+=[Interface_decl|QualifiedName] (','
	//	interface_name+=[Interface_decl|QualifiedName])*)? '{' field_decl+=Field_decl* ('{' stmt+=Stmt* '}')? ('recover' '{'
	//	casestmtbranch+=Casestmtbranch* '}')? trait_usage+=Trait_usage* method+=Method* '}';
	public Class_declElements getClass_declAccess() {
		return pClass_decl;
	}
	
	public ParserRule getClass_declRule() {
		return getClass_declAccess().getRule();
	}
	
	//// Field Declaration Error due to left recursion solve
	//Field_decl:
	//	type_use=Type_use
	//	name=ID ('=' pure_exp=Pure_exp)? ';';
	public Field_declElements getField_declAccess() {
		return pField_decl;
	}
	
	public ParserRule getField_declRule() {
		return getField_declAccess().getRule();
	}
	
	////Statements Declaration
	//Stmt:
	//	{Stmt} (type_exp=Type_exp name=ID ('=' exp=Exp)? ';'
	//	| var_or_field_ref=Var_or_field_ref '=' exp=Exp ';'
	//	| 'skip' ';'
	//	| 'return' exp=Exp ';'
	//	| 'assert' exp=Exp ';'
	//	| '{' stmt+=Stmt* '}'
	//	| 'if' '(' pure_exp=Pure_exp ')' ifstmt=Stmt (=> 'else' elsestmt=Stmt)?
	//	| 'while' '(' condition=Pure_exp ')' whilestmt=Stmt
	//	| 'foreach' '(' name=ID 'in' l=Pure_exp ')' foreachstmt=Stmt
	//	| 'try' trystmt=Stmt 'catch' ('{' casestmtbranch+=Casestmtbranch* '}' | casestmtbranch+=Casestmtbranch) ('finally'
	//	stmt+=Stmt)?
	//	| 'await' ref=Guard ';'
	//	| 'suspend' ';'
	//	| 'duration' '(' f=Pure_exp ',' t=Pure_exp ')' ';'
	//	| 'throw' throwPureExp=Pure_exp ';'
	//	| 'die' diePureExp=Pure_exp ';'
	//	| 'movecogto' moveCogTo=Pure_exp ';'
	//	| exp=Exp ';'
	//	| 'case' c=Pure_exp '{' casestmtbranch+=Casestmtbranch* '}');
	public StmtElements getStmtAccess() {
		return pStmt;
	}
	
	public ParserRule getStmtRule() {
		return getStmtAccess().getRule();
	}
	
	//// Expressions Error check causing error
	//Exp:
	//	Eff_expr | Pure_exp;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	////Eff Expression
	//Eff_expr:
	//	Pure_exp '.' 'get'
	//	| 'new' l='local'? QualifiedName '(' pure_exp_list=Pure_exp_list ')'
	//	| 'await'? Pure_exp NEGATION await=ID '(' list+=Pure_exp_list ')'
	//	| Pure_exp '.' val=ID '(' list+=Pure_exp_list ')'
	//	| ((Delta_id | 'core') '.')? 'original' '(' list+=Pure_exp_list ')';
	public Eff_exprElements getEff_exprAccess() {
		return pEff_expr;
	}
	
	public ParserRule getEff_exprRule() {
		return getEff_exprAccess().getRule();
	}
	
	////Delta ID
	//Delta_id:
	//	name=ID;
	public Delta_idElements getDelta_idAccess() {
		return pDelta_id;
	}
	
	public ParserRule getDelta_idRule() {
		return getDelta_idAccess().getRule();
	}
	
	////Guard Declaration
	//Guard:
	//	ref=Var_or_field_ref '?'
	//	| 'duration' '(' min=Pure_exp ',' max=Pure_exp ')'
	//	| AndGuard
	//	//| e=Pure_exp// Check this not working,left recursion error remove reference
	//;
	public GuardElements getGuardAccess() {
		return pGuard;
	}
	
	public ParserRule getGuardRule() {
		return getGuardAccess().getRule();
	}
	
	//AndGuard Guard:
	//	PrimaryGuard ({AndGuard.left=current} op='&' right=PrimaryGuard)*;
	public AndGuardElements getAndGuardAccess() {
		return pAndGuard;
	}
	
	public ParserRule getAndGuardRule() {
		return getAndGuardAccess().getRule();
	}
	
	//PrimaryGuard Guard:
	//	'(' Guard ')' | guard=Pure_exp;
	public PrimaryGuardElements getPrimaryGuardAccess() {
		return pPrimaryGuard;
	}
	
	public ParserRule getPrimaryGuardRule() {
		return getPrimaryGuardAccess().getRule();
	}
	
	////Case statement Branch
	//Casestmtbranch:
	//	pattern=Pattern '=>' stmt=Stmt;
	public CasestmtbranchElements getCasestmtbranchAccess() {
		return pCasestmtbranch;
	}
	
	public ParserRule getCasestmtbranchRule() {
		return getCasestmtbranchAccess().getRule();
	}
	
	////Trait Usage
	//Trait_usage:
	//	{Trait_usage}
	//	'uses' traitUsage+=[Trait_decl|QualifiedName]* ';';
	public Trait_usageElements getTrait_usageAccess() {
		return pTrait_usage;
	}
	
	public ParserRule getTrait_usageRule() {
		return getTrait_usageAccess().getRule();
	}
	
	////Trait Expression CHECK LAST OPTION
	//Trait_expr:
	//	{Trait_expr} '{' method+=Method* '}'
	//	| traitMethod=Method
	//	| traitName=[Trait_decl|QualifiedName] | trait_Left_expr;
	public Trait_exprElements getTrait_exprAccess() {
		return pTrait_expr;
	}
	
	public ParserRule getTrait_exprRule() {
		return getTrait_exprAccess().getRule();
	}
	
	//trait_Left_expr Trait_expr:
	//	op=Trait_oper trait_expr=Primary_Trait_expr;
	public Trait_Left_exprElements getTrait_Left_exprAccess() {
		return pTrait_Left_expr;
	}
	
	public ParserRule getTrait_Left_exprRule() {
		return getTrait_Left_exprAccess().getRule();
	}
	
	//Primary_Trait_expr Trait_expr:
	//	'{' Trait_expr '}';
	public Primary_Trait_exprElements getPrimary_Trait_exprAccess() {
		return pPrimary_Trait_expr;
	}
	
	public ParserRule getPrimary_Trait_exprRule() {
		return getPrimary_Trait_exprAccess().getRule();
	}
	
	////Trait Operation
	//Trait_oper:
	//	{Trait_oper} 'removes' (method=[Methodsig|QualifiedName] | '{' methodsig+=[Methodsig|QualifiedName]* '}') | 'adds'
	//	trait_expr=Trait_expr
	//	| 'modifies' trait_exp=Trait_expr;
	public Trait_operElements getTrait_operAccess() {
		return pTrait_oper;
	}
	
	public ParserRule getTrait_operRule() {
		return getTrait_operAccess().getRule();
	}
	
	////Method Declaration
	//Method:
	//	type_use=Type_use
	//	name=ID paramlist=Param_list '{' stmt+=Stmt* '}';
	public MethodElements getMethodAccess() {
		return pMethod;
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}
	
	////Trait Declaration
	//Trait_decl:
	//	'trait' name=ID '=' traitExpr=Trait_expr;
	public Trait_declElements getTrait_declAccess() {
		return pTrait_decl;
	}
	
	public ParserRule getTrait_declRule() {
		return getTrait_declAccess().getRule();
	}
	
	////Main Block Remove annotation uncommented solve the error later
	//Main_block:
	//	{Main_block} //annotations=Annotations
	//	'{' stmt+=Stmt* '}';
	public Main_blockElements getMain_blockAccess() {
		return pMain_block;
	}
	
	public ParserRule getMain_blockRule() {
		return getMain_blockAccess().getRule();
	}
	
	///*
	// * Delta Declaration Module Start 
	// * 
	// * 
	// */ Delta_decl:
	//	'delta' name=ID ('(' p+=Delta_param (',' p+=Delta_param)* ')')? ';'
	//	delta_access+=Delta_access* module_modifier+=Module_modifier*;
	public Delta_declElements getDelta_declAccess() {
		return pDelta_decl;
	}
	
	public ParserRule getDelta_declRule() {
		return getDelta_declAccess().getRule();
	}
	
	//Delta_param:
	//	Param_decl | QualifiedName Has_condition;
	public Delta_paramElements getDelta_paramAccess() {
		return pDelta_param;
	}
	
	public ParserRule getDelta_paramRule() {
		return getDelta_paramAccess().getRule();
	}
	
	//Has_condition:
	//	'hasField' field=[Field_decl] | 'hasMethod' method=[Methodsig] | 'hasInterface' interface=[Interface_decl];
	public Has_conditionElements getHas_conditionAccess() {
		return pHas_condition;
	}
	
	public ParserRule getHas_conditionRule() {
		return getHas_conditionAccess().getRule();
	}
	
	//Delta_access:
	//	'uses' module_ref=[Module_decl] ';';
	public Delta_accessElements getDelta_accessAccess() {
		return pDelta_access;
	}
	
	public ParserRule getDelta_accessRule() {
		return getDelta_accessAccess().getRule();
	}
	
	//Module_modifier:
	//	Functional_modifier
	//	| OO_modifier
	//	| Namespace_modifier;
	public Module_modifierElements getModule_modifierAccess() {
		return pModule_modifier;
	}
	
	public ParserRule getModule_modifierRule() {
		return getModule_modifierAccess().getRule();
	}
	
	//Functional_modifier:
	//	'adds' (Function_decl | DataType_decl | Typesyn_decl) | 'modifies' (Typesyn_decl | DataType_decl);
	public Functional_modifierElements getFunctional_modifierAccess() {
		return pFunctional_modifier;
	}
	
	public ParserRule getFunctional_modifierRule() {
		return getFunctional_modifierAccess().getRule();
	}
	
	//OO_modifier:
	//	{OO_modifier} 'adds' (class_decl=Class_decl | interface_decl=Interface_decl) | 'removes' ('class'
	//	class=[Class_decl|QualifiedName] | 'interface' inteface=[Interface_decl|QualifiedName]) ';'
	//	| 'modifies' ('class' class=[Class_decl|QualifiedName] ('adds' interfaceName+=Interface_decl (','
	//	interfaceName+=Interface_decl)*)? ('removes' removedInterface+=[Interface_decl|QualifiedName] (','
	//	removedInterface+=[Interface_decl|QualifiedName])*)?
	//	'{' class_modifier_fragment+=Class_modifier_fragment* '}' | 'interface' interface=[Interface_decl|QualifiedName]
	//	'{' interface_modifier_fragment+=Interface_modifier_fragment* '}');
	public OO_modifierElements getOO_modifierAccess() {
		return pOO_modifier;
	}
	
	public ParserRule getOO_modifierRule() {
		return getOO_modifierAccess().getRule();
	}
	
	//Class_modifier_fragment:
	//	'adds' (Field_decl | Trait_expr) | 'removes' (Field_decl | Methodsig | {Class_modifier_fragment} '{'
	//	methodsig+=Methodsig* '}') | 'modifies' Trait_expr;
	public Class_modifier_fragmentElements getClass_modifier_fragmentAccess() {
		return pClass_modifier_fragment;
	}
	
	public ParserRule getClass_modifier_fragmentRule() {
		return getClass_modifier_fragmentAccess().getRule();
	}
	
	//Interface_modifier_fragment:
	//	'adds' Methodsig
	//	| 'removes' Methodsig;
	public Interface_modifier_fragmentElements getInterface_modifier_fragmentAccess() {
		return pInterface_modifier_fragment;
	}
	
	public ParserRule getInterface_modifier_fragmentRule() {
		return getInterface_modifier_fragmentAccess().getRule();
	}
	
	//Namespace_modifier:
	//	'adds' (Module_import | Module_export);
	public Namespace_modifierElements getNamespace_modifierAccess() {
		return pNamespace_modifier;
	}
	
	public ParserRule getNamespace_modifierRule() {
		return getNamespace_modifierAccess().getRule();
	}
	
	///*
	// * 
	// * Update_Declaration
	// * 
	// * 
	// */ Update_decl:
	//	'stateupdate' name=ID ';' object_update+=Object_update*;
	public Update_declElements getUpdate_declAccess() {
		return pUpdate_decl;
	}
	
	public ParserRule getUpdate_declRule() {
		return getUpdate_declAccess().getRule();
	}
	
	//Object_update:
	//	'objectupdate' QualifiedName '{' 'await' guard=[Guard] ';'
	//	update_preamble_declaration+=Update_preamble_declaration*
	//	pre+=Object_update_assign_stmt*
	//	'classupdate' ';' post+=Object_update_assign_stmt* '}';
	public Object_updateElements getObject_updateAccess() {
		return pObject_update;
	}
	
	public ParserRule getObject_updateRule() {
		return getObject_updateAccess().getRule();
	}
	
	//Update_preamble_declaration:
	//	Type_exp ID;
	public Update_preamble_declarationElements getUpdate_preamble_declarationAccess() {
		return pUpdate_preamble_declaration;
	}
	
	public ParserRule getUpdate_preamble_declarationRule() {
		return getUpdate_preamble_declarationAccess().getRule();
	}
	
	//Object_update_assign_stmt:
	//	var_or_field_ref=[Var_or_field_ref] '=' exp=Exp ';';
	public Object_update_assign_stmtElements getObject_update_assign_stmtAccess() {
		return pObject_update_assign_stmt;
	}
	
	public ParserRule getObject_update_assign_stmtRule() {
		return getObject_update_assign_stmtAccess().getRule();
	}
	
	///*
	// * 
	// * Product line Declaration
	// * 
	// */ Productline_decl:
	//	'productline' name=ID ';'
	//	'features' feature+=Feature (',' feature+=Feature)* ';'
	//	delta_clause+=Delta_clause*;
	public Productline_declElements getProductline_declAccess() {
		return pProductline_decl;
	}
	
	public ParserRule getProductline_declRule() {
		return getProductline_declAccess().getRule();
	}
	
	//Feature:
	//	feature_decl=[Feature_decl|QualifiedName] p='\''? ('{'
	//	attr_assignment+=Attr_assignment (',' attr_assignment+=Attr_assignment)* '}')?;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Attr_assignment:
	//	ID '=' (INT | ID | STRINGLITERAL);
	public Attr_assignmentElements getAttr_assignmentAccess() {
		return pAttr_assignment;
	}
	
	public ParserRule getAttr_assignmentRule() {
		return getAttr_assignmentAccess().getRule();
	}
	
	////Check delta spec instead of delta_decl
	//Delta_clause:
	//	'delta' deltaspec=[Delta_decl] after_condition=After_condition?
	//	from_condition=From_condition? when_condition=When_condition? ';';
	public Delta_clauseElements getDelta_clauseAccess() {
		return pDelta_clause;
	}
	
	public ParserRule getDelta_clauseRule() {
		return getDelta_clauseAccess().getRule();
	}
	
	//Deltaspec:
	//	{Deltaspec} name=ID ('(' deltaspec_param+=Deltaspec_param (',' deltaspec_param+=Deltaspec_param)* ')')?;
	public DeltaspecElements getDeltaspecAccess() {
		return pDeltaspec;
	}
	
	public ParserRule getDeltaspecRule() {
		return getDeltaspecAccess().getRule();
	}
	
	//Deltaspec_param:
	//	ID '.' ID | INT;
	public Deltaspec_paramElements getDeltaspec_paramAccess() {
		return pDeltaspec_param;
	}
	
	public ParserRule getDeltaspec_paramRule() {
		return getDeltaspec_paramAccess().getRule();
	}
	
	//After_condition:
	//	'after' delta_id+=[Delta_decl] (',' delta_id+=[Delta_decl])*;
	public After_conditionElements getAfter_conditionAccess() {
		return pAfter_condition;
	}
	
	public ParserRule getAfter_conditionRule() {
		return getAfter_conditionAccess().getRule();
	}
	
	//From_condition:
	//	'from' application_condition=Application_condition;
	public From_conditionElements getFrom_conditionAccess() {
		return pFrom_condition;
	}
	
	public ParserRule getFrom_conditionRule() {
		return getFrom_conditionAccess().getRule();
	}
	
	//When_condition:
	//	('when' | 'to') application_condition=Application_condition;
	public When_conditionElements getWhen_conditionAccess() {
		return pWhen_condition;
	}
	
	public ParserRule getWhen_conditionRule() {
		return getWhen_conditionAccess().getRule();
	}
	
	//Application_condition:
	//	AppOr_exp;
	public Application_conditionElements getApplication_conditionAccess() {
		return pApplication_condition;
	}
	
	public ParserRule getApplication_conditionRule() {
		return getApplication_conditionAccess().getRule();
	}
	
	//AppOr_exp Application_condition:
	//	AppAnd_exp ({AppOr_exp.left=current} OROR right=AppAnd_exp)*;
	public AppOr_expElements getAppOr_expAccess() {
		return pAppOr_exp;
	}
	
	public ParserRule getAppOr_expRule() {
		return getAppOr_expAccess().getRule();
	}
	
	//AppAnd_exp Application_condition:
	//	AppUnary_exp ({AppAnd_exp.left=current} ANDAND right=AppUnary_exp)*;
	public AppAnd_expElements getAppAnd_expAccess() {
		return pAppAnd_exp;
	}
	
	public ParserRule getAppAnd_expRule() {
		return getAppAnd_expAccess().getRule();
	}
	
	//AppUnary_exp Application_condition:
	//	AppPrimary_exp | {NotExpression} (NEGATION | NEGATION_CREOL) operand=AppUnary_exp;
	public AppUnary_expElements getAppUnary_expAccess() {
		return pAppUnary_exp;
	}
	
	public ParserRule getAppUnary_expRule() {
		return getAppUnary_expAccess().getRule();
	}
	
	//AppPrimary_exp Application_condition:
	//	'(' AppOr_exp ')' | AppCond_atomic_expr;
	public AppPrimary_expElements getAppPrimary_expAccess() {
		return pAppPrimary_exp;
	}
	
	public ParserRule getAppPrimary_expRule() {
		return getAppPrimary_expAccess().getRule();
	}
	
	//AppCond_atomic_expr Application_condition:
	//	feature=Feature;
	public AppCond_atomic_exprElements getAppCond_atomic_exprAccess() {
		return pAppCond_atomic_expr;
	}
	
	public ParserRule getAppCond_atomic_exprRule() {
		return getAppCond_atomic_exprAccess().getRule();
	}
	
	///*
	// * Product Declaration
	// * 
	// */ Product_decl:
	//	{Product_decl} 'product' name=ID ('(' (feature+=Feature (',' feature+=Feature)*)? ')' ('{'
	//	product_reconfiguration+=Product_reconfiguration* '}' | ';') | '=' product_expr=Product_expr
	//	';');
	public Product_declElements getProduct_declAccess() {
		return pProduct_decl;
	}
	
	public ParserRule getProduct_declRule() {
		return getProduct_declAccess().getRule();
	}
	
	//Product_expr:
	//	ProductOr_expr;
	public Product_exprElements getProduct_exprAccess() {
		return pProduct_expr;
	}
	
	public ParserRule getProduct_exprRule() {
		return getProduct_exprAccess().getRule();
	}
	
	//ProductOr_expr Product_expr:
	//	ProductAnd_exp ({ProductOr_expr.left=current} OROR right=ProductAnd_exp)*;
	public ProductOr_exprElements getProductOr_exprAccess() {
		return pProductOr_expr;
	}
	
	public ParserRule getProductOr_exprRule() {
		return getProductOr_exprAccess().getRule();
	}
	
	//ProductAnd_exp Product_expr:
	//	ProductPrimary_exp ({ProductAnd_exp.left=current} ANDAND right=ProductMinus_exp)*;
	public ProductAnd_expElements getProductAnd_expAccess() {
		return pProductAnd_exp;
	}
	
	public ParserRule getProductAnd_expRule() {
		return getProductAnd_expAccess().getRule();
	}
	
	//ProductMinus_exp Product_expr:
	//	ProductPrimary_exp ({ProductMinus_exp.left=current} MINUS right=ProductPrimary_exp)*;
	public ProductMinus_expElements getProductMinus_expAccess() {
		return pProductMinus_exp;
	}
	
	public ParserRule getProductMinus_expRule() {
		return getProductMinus_expAccess().getRule();
	}
	
	//ProductPrimary_exp Product_expr:
	//	'(' ProductOr_expr ')'
	//	| AtomicProduct_expr;
	public ProductPrimary_expElements getProductPrimary_expAccess() {
		return pProductPrimary_exp;
	}
	
	public ParserRule getProductPrimary_expRule() {
		return getProductPrimary_expAccess().getRule();
	}
	
	//AtomicProduct_expr Product_expr:
	//	'{' feature+=[Feature_decl|QualifiedName] (',' feature+=[Feature_decl|QualifiedName])* '}'
	//	| productDecl=[Product_decl|QualifiedName];
	public AtomicProduct_exprElements getAtomicProduct_exprAccess() {
		return pAtomicProduct_expr;
	}
	
	public ParserRule getAtomicProduct_exprRule() {
		return getAtomicProduct_exprAccess().getRule();
	}
	
	////Product reconfiguration
	//Product_reconfiguration:
	//	name=ID 'delta' delta_id+=Delta_id (',' delta_id+=Delta_id)*
	//	'stateupdate' update=ID ';';
	public Product_reconfigurationElements getProduct_reconfigurationAccess() {
		return pProduct_reconfiguration;
	}
	
	public ParserRule getProduct_reconfigurationRule() {
		return getProduct_reconfigurationAccess().getRule();
	}
	
	///*
	// * Feature Declaration
	// * 
	// */ Feature_decl:
	//	name=ID ('{' feature_decl_group=Feature_decl_group? (feature_decl_attribute+=Feature_decl_attribute
	//	| feature_decl_constraint+=Feature_decl_constraint)*
	//	'}')?;
	public Feature_declElements getFeature_declAccess() {
		return pFeature_decl;
	}
	
	public ParserRule getFeature_declRule() {
		return getFeature_declAccess().getRule();
	}
	
	////Feature declaration group
	//Feature_decl_group:
	//	'group' ('oneof' | 'allof' | '[' INT '..' (INT | MULT) ']')
	//	'{' fnode+=Fnode (',' fnode+=Fnode)* '}';
	public Feature_decl_groupElements getFeature_decl_groupAccess() {
		return pFeature_decl_group;
	}
	
	public ParserRule getFeature_decl_groupRule() {
		return getFeature_decl_groupAccess().getRule();
	}
	
	////Feature Node
	//Fnode:
	//	'opt'? Feature_decl;
	public FnodeElements getFnodeAccess() {
		return pFnode;
	}
	
	public ParserRule getFnodeRule() {
		return getFnodeAccess().getRule();
	}
	
	////Feature declaration attribute
	//Feature_decl_attribute:
	//	ID ID 'in'
	//	'{' boundary_val+=Boundary_val (',' boundary_val+=Boundary_val)* '}' ';'
	//	| ID ID 'in' '[' lBoundary_int=Boundary_int '..' uBoundary_int=Boundary_int ']' ';'
	//	| ID '[' lBoundary_int=Boundary_int '..' uBoundary_int=Boundary_int ']' ID ';'
	//	| {Feature_decl_attribute} ID ID ';';
	public Feature_decl_attributeElements getFeature_decl_attributeAccess() {
		return pFeature_decl_attribute;
	}
	
	public ParserRule getFeature_decl_attributeRule() {
		return getFeature_decl_attributeAccess().getRule();
	}
	
	//Boundary_val:
	//	MINUS? INT;
	public Boundary_valElements getBoundary_valAccess() {
		return pBoundary_val;
	}
	
	public ParserRule getBoundary_valRule() {
		return getBoundary_valAccess().getRule();
	}
	
	//Boundary_int:
	//	MULT | Boundary_val;
	public Boundary_intElements getBoundary_intAccess() {
		return pBoundary_int;
	}
	
	public ParserRule getBoundary_intRule() {
		return getBoundary_intAccess().getRule();
	}
	
	////Feature declaration constraint
	//Feature_decl_constraint:
	//	('ifin' ':')? mexp=Mexp ';'
	//	| 'ifout' ':' mexp=Mexp ';'
	//	| {Feature_decl_constraint} 'exclude' ':' ID ';'
	//	| {Feature_decl_constraint} 'require' ':' ID ';';
	public Feature_decl_constraintElements getFeature_decl_constraintAccess() {
		return pFeature_decl_constraint;
	}
	
	public ParserRule getFeature_decl_constraintRule() {
		return getFeature_decl_constraintAccess().getRule();
	}
	
	////Mexp
	//Mexp:
	//	{Mexp} ID '.' ID
	//	| {Mexp} ID
	//	| {Mexp} ID
	//	| MexpOr_exp;
	public MexpElements getMexpAccess() {
		return pMexp;
	}
	
	public ParserRule getMexpRule() {
		return getMexpAccess().getRule();
	}
	
	////OR_expr
	//MexpOr_exp Mexp:
	//	MexpAnd_expr ({MexpOr_exp.left=current} OROR right=MexpAnd_expr)*;
	public MexpOr_expElements getMexpOr_expAccess() {
		return pMexpOr_exp;
	}
	
	public ParserRule getMexpOr_expRule() {
		return getMexpOr_expAccess().getRule();
	}
	
	////And_expr
	//MexpAnd_expr Mexp:
	//	MexpImplies_expr ({MexpAnd_expr.left=current} ANDAND right=MexpImplies_expr)*;
	public MexpAnd_exprElements getMexpAnd_exprAccess() {
		return pMexpAnd_expr;
	}
	
	public ParserRule getMexpAnd_exprRule() {
		return getMexpAnd_exprAccess().getRule();
	}
	
	//MexpImplies_expr Mexp:
	//	MexpEquality_expr ({MexpImplies_expr.left=current} op=(IMPLIES | EQUIV) right=MexpEquality_expr)*;
	public MexpImplies_exprElements getMexpImplies_exprAccess() {
		return pMexpImplies_expr;
	}
	
	public ParserRule getMexpImplies_exprRule() {
		return getMexpImplies_exprAccess().getRule();
	}
	
	////Equality_expr
	//MexpEquality_expr Mexp:
	//	MexpComparison_expr ({MexpEquality_expr.left=current} op=(EQEQ | NOTEQ) right=MexpComparison_expr)*;
	public MexpEquality_exprElements getMexpEquality_exprAccess() {
		return pMexpEquality_expr;
	}
	
	public ParserRule getMexpEquality_exprRule() {
		return getMexpEquality_exprAccess().getRule();
	}
	
	////Comparison_expr
	//MexpComparison_expr Mexp:
	//	MexpPlusOrMinus_expr ({MexpComparison_expr.left=current} op=(LT | GT | LTEQ | GTEQ) right=MexpPlusOrMinus_expr)*;
	public MexpComparison_exprElements getMexpComparison_exprAccess() {
		return pMexpComparison_expr;
	}
	
	public ParserRule getMexpComparison_exprRule() {
		return getMexpComparison_exprAccess().getRule();
	}
	
	////PlusOrMinus
	//MexpPlusOrMinus_expr Mexp:
	//	MexpMulDivOrMod_expr ({MexpPlusOrMinus_expr.left=current} op=(PLUS | MINUS) right=MexpMulDivOrMod_expr)*;
	public MexpPlusOrMinus_exprElements getMexpPlusOrMinus_exprAccess() {
		return pMexpPlusOrMinus_expr;
	}
	
	public ParserRule getMexpPlusOrMinus_exprRule() {
		return getMexpPlusOrMinus_exprAccess().getRule();
	}
	
	////MulDivOrMod_expr
	//MexpMulDivOrMod_expr Mexp:
	//	MexpPrimary_expr ({MexpMulDivOrMod_expr.left=current} op=(MULT | '/' | MOD) right=MexpPrimary_expr)*;
	public MexpMulDivOrMod_exprElements getMexpMulDivOrMod_exprAccess() {
		return pMexpMulDivOrMod_expr;
	}
	
	public ParserRule getMexpMulDivOrMod_exprRule() {
		return getMexpMulDivOrMod_exprAccess().getRule();
	}
	
	////Primary_expr
	//MexpPrimary_expr Mexp:
	//	{MexpPrimary_expr}
	//	'(' a=Mexp ')' | {MexpPrimary_expr} (NEGATION | MINUS) | MexpAtomic_expr;
	public MexpPrimary_exprElements getMexpPrimary_exprAccess() {
		return pMexpPrimary_expr;
	}
	
	public ParserRule getMexpPrimary_exprRule() {
		return getMexpPrimary_exprAccess().getRule();
	}
	
	////Atomic_expr
	//MexpAtomic_expr Mexp:
	//	{Mexp} value=INT;
	public MexpAtomic_exprElements getMexpAtomic_exprAccess() {
		return pMexpAtomic_expr;
	}
	
	public ParserRule getMexpAtomic_exprRule() {
		return getMexpAtomic_exprAccess().getRule();
	}
	
	///*
	// * 
	// * Feature Extension
	// * 
	// */ Fextension:
	//	{Fextension} name=ID '{' feature_decl_group=Feature_decl_group? (feature_decl_attribute+=Feature_decl_attribute |
	//	feature_decl_constraint+=Feature_decl_constraint)*
	//	'}';
	public FextensionElements getFextensionAccess() {
		return pFextension;
	}
	
	public ParserRule getFextensionRule() {
		return getFextensionAccess().getRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal STR_ESC:
	//	'\\' ('\\' | '"');
	public TerminalRule getSTR_ESCRule() {
		return tSTR_ESC;
	}
	
	//terminal STRINGLITERAL:
	//	'"' (STR_ESC | NEGATION_CREOL ('\\' | '"' | '\r' | '\n'))* '"';
	public TerminalRule getSTRINGLITERALRule() {
		return tSTRINGLITERAL;
	}
	
	//terminal NEGATION_CREOL:
	//	'~';
	public TerminalRule getNEGATION_CREOLRule() {
		return tNEGATION_CREOL;
	}
	
	//terminal NEGATION:
	//	'!';
	public TerminalRule getNEGATIONRule() {
		return tNEGATION;
	}
	
	//terminal MINUS:
	//	'-';
	public TerminalRule getMINUSRule() {
		return tMINUS;
	}
	
	//terminal MULT:
	//	'*';
	public TerminalRule getMULTRule() {
		return tMULT;
	}
	
	//terminal MOD:
	//	'%';
	public TerminalRule getMODRule() {
		return tMOD;
	}
	
	//terminal PLUS:
	//	'+';
	public TerminalRule getPLUSRule() {
		return tPLUS;
	}
	
	//terminal LTEQ:
	//	'<=';
	public TerminalRule getLTEQRule() {
		return tLTEQ;
	}
	
	//terminal GTEQ:
	//	'>=';
	public TerminalRule getGTEQRule() {
		return tGTEQ;
	}
	
	//terminal LT:
	//	'<';
	public TerminalRule getLTRule() {
		return tLT;
	}
	
	//terminal GT:
	//	'>';
	public TerminalRule getGTRule() {
		return tGT;
	}
	
	//terminal ANDAND:
	//	'&&';
	public TerminalRule getANDANDRule() {
		return tANDAND;
	}
	
	//terminal OROR:
	//	'||';
	public TerminalRule getORORRule() {
		return tOROR;
	}
	
	//terminal EQEQ:
	//	'==';
	public TerminalRule getEQEQRule() {
		return tEQEQ;
	}
	
	//terminal NOTEQ:
	//	'!=';
	public TerminalRule getNOTEQRule() {
		return tNOTEQ;
	}
	
	//terminal IMPLIES:
	//	'->';
	public TerminalRule getIMPLIESRule() {
		return tIMPLIES;
	}
	
	//terminal EQUIV:
	//	'<->';
	public TerminalRule getEQUIVRule() {
		return tEQUIV;
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
}
