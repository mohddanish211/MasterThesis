/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
grammar InternalAbs;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.AbsGrammarAccess;

}
@parser::members {
	private AbsGrammarAccess grammarAccess;

	public void setGrammarAccess(AbsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDomainModel
entryRuleDomainModel
:
{ before(grammarAccess.getDomainModelRule()); }
	 ruleDomainModel
{ after(grammarAccess.getDomainModelRule()); } 
	 EOF 
;

// Rule DomainModel
ruleDomainModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainModelAccess().getCompilation_UnitParserRuleCall()); }
		ruleCompilation_Unit
		{ after(grammarAccess.getDomainModelAccess().getCompilation_UnitParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCompilation_Unit
entryRuleCompilation_Unit
:
{ before(grammarAccess.getCompilation_UnitRule()); }
	 ruleCompilation_Unit
{ after(grammarAccess.getCompilation_UnitRule()); } 
	 EOF 
;

// Rule Compilation_Unit
ruleCompilation_Unit 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getGroup()); }
		(rule__Compilation_Unit__Group__0)
		{ after(grammarAccess.getCompilation_UnitAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModule_decl
entryRuleModule_decl
:
{ before(grammarAccess.getModule_declRule()); }
	 ruleModule_decl
{ after(grammarAccess.getModule_declRule()); } 
	 EOF 
;

// Rule Module_decl
ruleModule_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModule_declAccess().getGroup()); }
		(rule__Module_decl__Group__0)
		{ after(grammarAccess.getModule_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModule_export
entryRuleModule_export
:
{ before(grammarAccess.getModule_exportRule()); }
	 ruleModule_export
{ after(grammarAccess.getModule_exportRule()); } 
	 EOF 
;

// Rule Module_export
ruleModule_export 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModule_exportAccess().getGroup()); }
		(rule__Module_export__Group__0)
		{ after(grammarAccess.getModule_exportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModule_import
entryRuleModule_import
:
{ before(grammarAccess.getModule_importRule()); }
	 ruleModule_import
{ after(grammarAccess.getModule_importRule()); } 
	 EOF 
;

// Rule Module_import
ruleModule_import 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModule_importAccess().getGroup()); }
		(rule__Module_import__Group__0)
		{ after(grammarAccess.getModule_importAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecl
entryRuleDecl
:
{ before(grammarAccess.getDeclRule()); }
	 ruleDecl
{ after(grammarAccess.getDeclRule()); } 
	 EOF 
;

// Rule Decl
ruleDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclAccess().getAlternatives()); }
		(rule__Decl__Alternatives)
		{ after(grammarAccess.getDeclAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePar_function_decl
entryRulePar_function_decl
:
{ before(grammarAccess.getPar_function_declRule()); }
	 rulePar_function_decl
{ after(grammarAccess.getPar_function_declRule()); } 
	 EOF 
;

// Rule Par_function_decl
rulePar_function_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPar_function_declAccess().getGroup()); }
		(rule__Par_function_decl__Group__0)
		{ after(grammarAccess.getPar_function_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction_name_list
entryRuleFunction_name_list
:
{ before(grammarAccess.getFunction_name_listRule()); }
	 ruleFunction_name_list
{ after(grammarAccess.getFunction_name_listRule()); } 
	 EOF 
;

// Rule Function_name_list
ruleFunction_name_list 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunction_name_listAccess().getGroup()); }
		(rule__Function_name_list__Group__0)
		{ after(grammarAccess.getFunction_name_listAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction_name_decl
entryRuleFunction_name_decl
:
{ before(grammarAccess.getFunction_name_declRule()); }
	 ruleFunction_name_decl
{ after(grammarAccess.getFunction_name_declRule()); } 
	 EOF 
;

// Rule Function_name_decl
ruleFunction_name_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunction_name_declAccess().getNameAssignment()); }
		(rule__Function_name_decl__NameAssignment)
		{ after(grammarAccess.getFunction_name_declAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataType_decl
entryRuleDataType_decl
:
{ before(grammarAccess.getDataType_declRule()); }
	 ruleDataType_decl
{ after(grammarAccess.getDataType_declRule()); } 
	 EOF 
;

// Rule DataType_decl
ruleDataType_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataType_declAccess().getGroup()); }
		(rule__DataType_decl__Group__0)
		{ after(grammarAccess.getDataType_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleData_constructor
entryRuleData_constructor
:
{ before(grammarAccess.getData_constructorRule()); }
	 ruleData_constructor
{ after(grammarAccess.getData_constructorRule()); } 
	 EOF 
;

// Rule Data_constructor
ruleData_constructor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getData_constructorAccess().getGroup()); }
		(rule__Data_constructor__Group__0)
		{ after(grammarAccess.getData_constructorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleData_constructor_arg
entryRuleData_constructor_arg
:
{ before(grammarAccess.getData_constructor_argRule()); }
	 ruleData_constructor_arg
{ after(grammarAccess.getData_constructor_argRule()); } 
	 EOF 
;

// Rule Data_constructor_arg
ruleData_constructor_arg 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getData_constructor_argAccess().getGroup()); }
		(rule__Data_constructor_arg__Group__0)
		{ after(grammarAccess.getData_constructor_argAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotation
entryRuleAnnotation
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationAccess().getGroup()); }
		(rule__Annotation__Group__0)
		{ after(grammarAccess.getAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType_use
entryRuleType_use
:
{ before(grammarAccess.getType_useRule()); }
	 ruleType_use
{ after(grammarAccess.getType_useRule()); } 
	 EOF 
;

// Rule Type_use
ruleType_use 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getType_useAccess().getGroup()); }
		(rule__Type_use__Group__0)
		{ after(grammarAccess.getType_useAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePure_exp
entryRulePure_exp
:
{ before(grammarAccess.getPure_expRule()); }
	 rulePure_exp
{ after(grammarAccess.getPure_expRule()); } 
	 EOF 
;

// Rule Pure_exp
rulePure_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPure_expAccess().getAlternatives()); }
		(rule__Pure_exp__Alternatives)
		{ after(grammarAccess.getPure_expAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOr_expr
entryRuleOr_expr
:
{ before(grammarAccess.getOr_exprRule()); }
	 ruleOr_expr
{ after(grammarAccess.getOr_exprRule()); } 
	 EOF 
;

// Rule Or_expr
ruleOr_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOr_exprAccess().getGroup()); }
		(rule__Or_expr__Group__0)
		{ after(grammarAccess.getOr_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnd_expr
entryRuleAnd_expr
:
{ before(grammarAccess.getAnd_exprRule()); }
	 ruleAnd_expr
{ after(grammarAccess.getAnd_exprRule()); } 
	 EOF 
;

// Rule And_expr
ruleAnd_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnd_exprAccess().getGroup()); }
		(rule__And_expr__Group__0)
		{ after(grammarAccess.getAnd_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEquality_expr
entryRuleEquality_expr
:
{ before(grammarAccess.getEquality_exprRule()); }
	 ruleEquality_expr
{ after(grammarAccess.getEquality_exprRule()); } 
	 EOF 
;

// Rule Equality_expr
ruleEquality_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEquality_exprAccess().getGroup()); }
		(rule__Equality_expr__Group__0)
		{ after(grammarAccess.getEquality_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComparison_expr
entryRuleComparison_expr
:
{ before(grammarAccess.getComparison_exprRule()); }
	 ruleComparison_expr
{ after(grammarAccess.getComparison_exprRule()); } 
	 EOF 
;

// Rule Comparison_expr
ruleComparison_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComparison_exprAccess().getGroup()); }
		(rule__Comparison_expr__Group__0)
		{ after(grammarAccess.getComparison_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusOrMinus_expr
entryRulePlusOrMinus_expr
:
{ before(grammarAccess.getPlusOrMinus_exprRule()); }
	 rulePlusOrMinus_expr
{ after(grammarAccess.getPlusOrMinus_exprRule()); } 
	 EOF 
;

// Rule PlusOrMinus_expr
rulePlusOrMinus_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusOrMinus_exprAccess().getGroup()); }
		(rule__PlusOrMinus_expr__Group__0)
		{ after(grammarAccess.getPlusOrMinus_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMulDivOrMod_expr
entryRuleMulDivOrMod_expr
:
{ before(grammarAccess.getMulDivOrMod_exprRule()); }
	 ruleMulDivOrMod_expr
{ after(grammarAccess.getMulDivOrMod_exprRule()); } 
	 EOF 
;

// Rule MulDivOrMod_expr
ruleMulDivOrMod_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMulDivOrMod_exprAccess().getGroup()); }
		(rule__MulDivOrMod_expr__Group__0)
		{ after(grammarAccess.getMulDivOrMod_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUniary_expr
entryRuleUniary_expr
:
{ before(grammarAccess.getUniary_exprRule()); }
	 ruleUniary_expr
{ after(grammarAccess.getUniary_exprRule()); } 
	 EOF 
;

// Rule Uniary_expr
ruleUniary_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUniary_exprAccess().getAlternatives()); }
		(rule__Uniary_expr__Alternatives)
		{ after(grammarAccess.getUniary_exprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary_expr
entryRulePrimary_expr
:
{ before(grammarAccess.getPrimary_exprRule()); }
	 rulePrimary_expr
{ after(grammarAccess.getPrimary_exprRule()); } 
	 EOF 
;

// Rule Primary_expr
rulePrimary_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimary_exprAccess().getAlternatives()); }
		(rule__Primary_expr__Alternatives)
		{ after(grammarAccess.getPrimary_exprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomic_expr
entryRuleAtomic_expr
:
{ before(grammarAccess.getAtomic_exprRule()); }
	 ruleAtomic_expr
{ after(grammarAccess.getAtomic_exprRule()); } 
	 EOF 
;

// Rule Atomic_expr
ruleAtomic_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomic_exprAccess().getAlternatives()); }
		(rule__Atomic_expr__Alternatives)
		{ after(grammarAccess.getAtomic_exprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVar_or_field_ref
entryRuleVar_or_field_ref
:
{ before(grammarAccess.getVar_or_field_refRule()); }
	 ruleVar_or_field_ref
{ after(grammarAccess.getVar_or_field_refRule()); } 
	 EOF 
;

// Rule Var_or_field_ref
ruleVar_or_field_ref 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVar_or_field_refAccess().getAlternatives()); }
		(rule__Var_or_field_ref__Alternatives)
		{ after(grammarAccess.getVar_or_field_refAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCase_branch
entryRuleCase_branch
:
{ before(grammarAccess.getCase_branchRule()); }
	 ruleCase_branch
{ after(grammarAccess.getCase_branchRule()); } 
	 EOF 
;

// Rule Case_branch
ruleCase_branch 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCase_branchAccess().getGroup()); }
		(rule__Case_branch__Group__0)
		{ after(grammarAccess.getCase_branchAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePattern
entryRulePattern
:
{ before(grammarAccess.getPatternRule()); }
	 rulePattern
{ after(grammarAccess.getPatternRule()); } 
	 EOF 
;

// Rule Pattern
rulePattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPatternAccess().getGroup()); }
		(rule__Pattern__Group__0)
		{ after(grammarAccess.getPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePure_exp_list
entryRulePure_exp_list
:
{ before(grammarAccess.getPure_exp_listRule()); }
	 rulePure_exp_list
{ after(grammarAccess.getPure_exp_listRule()); } 
	 EOF 
;

// Rule Pure_exp_list
rulePure_exp_list 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPure_exp_listAccess().getGroup()); }
		(rule__Pure_exp_list__Group__0)
		{ after(grammarAccess.getPure_exp_listAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction_list
entryRuleFunction_list
:
{ before(grammarAccess.getFunction_listRule()); }
	 ruleFunction_list
{ after(grammarAccess.getFunction_listRule()); } 
	 EOF 
;

// Rule Function_list
ruleFunction_list 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunction_listAccess().getGroup()); }
		(rule__Function_list__Group__0)
		{ after(grammarAccess.getFunction_listAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction_param
entryRuleFunction_param
:
{ before(grammarAccess.getFunction_paramRule()); }
	 ruleFunction_param
{ after(grammarAccess.getFunction_paramRule()); } 
	 EOF 
;

// Rule Function_param
ruleFunction_param 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunction_paramAccess().getAlternatives()); }
		(rule__Function_param__Alternatives)
		{ after(grammarAccess.getFunction_paramAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction_name_param_decl
entryRuleFunction_name_param_decl
:
{ before(grammarAccess.getFunction_name_param_declRule()); }
	 ruleFunction_name_param_decl
{ after(grammarAccess.getFunction_name_param_declRule()); } 
	 EOF 
;

// Rule Function_name_param_decl
ruleFunction_name_param_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunction_name_param_declAccess().getValueAssignment()); }
		(rule__Function_name_param_decl__ValueAssignment)
		{ after(grammarAccess.getFunction_name_param_declAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnon_function_decl
entryRuleAnon_function_decl
:
{ before(grammarAccess.getAnon_function_declRule()); }
	 ruleAnon_function_decl
{ after(grammarAccess.getAnon_function_declRule()); } 
	 EOF 
;

// Rule Anon_function_decl
ruleAnon_function_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnon_function_declAccess().getGroup()); }
		(rule__Anon_function_decl__Group__0)
		{ after(grammarAccess.getAnon_function_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParam_list
entryRuleParam_list
:
{ before(grammarAccess.getParam_listRule()); }
	 ruleParam_list
{ after(grammarAccess.getParam_listRule()); } 
	 EOF 
;

// Rule Param_list
ruleParam_list 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParam_listAccess().getGroup()); }
		(rule__Param_list__Group__0)
		{ after(grammarAccess.getParam_listAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParam_decl
entryRuleParam_decl
:
{ before(grammarAccess.getParam_declRule()); }
	 ruleParam_decl
{ after(grammarAccess.getParam_declRule()); } 
	 EOF 
;

// Rule Param_decl
ruleParam_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParam_declAccess().getGroup()); }
		(rule__Param_decl__Group__0)
		{ after(grammarAccess.getParam_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType_exp
entryRuleType_exp
:
{ before(grammarAccess.getType_expRule()); }
	 ruleType_exp
{ after(grammarAccess.getType_expRule()); } 
	 EOF 
;

// Rule Type_exp
ruleType_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getType_expAccess().getGroup()); }
		(rule__Type_exp__Group__0)
		{ after(grammarAccess.getType_expAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction_decl
entryRuleFunction_decl
:
{ before(grammarAccess.getFunction_declRule()); }
	 ruleFunction_decl
{ after(grammarAccess.getFunction_declRule()); } 
	 EOF 
;

// Rule Function_decl
ruleFunction_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunction_declAccess().getGroup()); }
		(rule__Function_decl__Group__0)
		{ after(grammarAccess.getFunction_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypesyn_decl
entryRuleTypesyn_decl
:
{ before(grammarAccess.getTypesyn_declRule()); }
	 ruleTypesyn_decl
{ after(grammarAccess.getTypesyn_declRule()); } 
	 EOF 
;

// Rule Typesyn_decl
ruleTypesyn_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypesyn_declAccess().getGroup()); }
		(rule__Typesyn_decl__Group__0)
		{ after(grammarAccess.getTypesyn_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleException_decl
entryRuleException_decl
:
{ before(grammarAccess.getException_declRule()); }
	 ruleException_decl
{ after(grammarAccess.getException_declRule()); } 
	 EOF 
;

// Rule Exception_decl
ruleException_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getException_declAccess().getGroup()); }
		(rule__Exception_decl__Group__0)
		{ after(grammarAccess.getException_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInterface_decl
entryRuleInterface_decl
:
{ before(grammarAccess.getInterface_declRule()); }
	 ruleInterface_decl
{ after(grammarAccess.getInterface_declRule()); } 
	 EOF 
;

// Rule Interface_decl
ruleInterface_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInterface_declAccess().getGroup()); }
		(rule__Interface_decl__Group__0)
		{ after(grammarAccess.getInterface_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMethodsig
entryRuleMethodsig
:
{ before(grammarAccess.getMethodsigRule()); }
	 ruleMethodsig
{ after(grammarAccess.getMethodsigRule()); } 
	 EOF 
;

// Rule Methodsig
ruleMethodsig 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMethodsigAccess().getGroup()); }
		(rule__Methodsig__Group__0)
		{ after(grammarAccess.getMethodsigAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClass_decl
entryRuleClass_decl
:
{ before(grammarAccess.getClass_declRule()); }
	 ruleClass_decl
{ after(grammarAccess.getClass_declRule()); } 
	 EOF 
;

// Rule Class_decl
ruleClass_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClass_declAccess().getGroup()); }
		(rule__Class_decl__Group__0)
		{ after(grammarAccess.getClass_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleField_decl
entryRuleField_decl
:
{ before(grammarAccess.getField_declRule()); }
	 ruleField_decl
{ after(grammarAccess.getField_declRule()); } 
	 EOF 
;

// Rule Field_decl
ruleField_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getField_declAccess().getGroup()); }
		(rule__Field_decl__Group__0)
		{ after(grammarAccess.getField_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStmt
entryRuleStmt
:
{ before(grammarAccess.getStmtRule()); }
	 ruleStmt
{ after(grammarAccess.getStmtRule()); } 
	 EOF 
;

// Rule Stmt
ruleStmt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStmtAccess().getGroup()); }
		(rule__Stmt__Group__0)
		{ after(grammarAccess.getStmtAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getAlternatives()); }
		(rule__Exp__Alternatives)
		{ after(grammarAccess.getExpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEff_expr
entryRuleEff_expr
:
{ before(grammarAccess.getEff_exprRule()); }
	 ruleEff_expr
{ after(grammarAccess.getEff_exprRule()); } 
	 EOF 
;

// Rule Eff_expr
ruleEff_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEff_exprAccess().getAlternatives()); }
		(rule__Eff_expr__Alternatives)
		{ after(grammarAccess.getEff_exprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelta_id
entryRuleDelta_id
:
{ before(grammarAccess.getDelta_idRule()); }
	 ruleDelta_id
{ after(grammarAccess.getDelta_idRule()); } 
	 EOF 
;

// Rule Delta_id
ruleDelta_id 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelta_idAccess().getNameAssignment()); }
		(rule__Delta_id__NameAssignment)
		{ after(grammarAccess.getDelta_idAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGuard
entryRuleGuard
:
{ before(grammarAccess.getGuardRule()); }
	 ruleGuard
{ after(grammarAccess.getGuardRule()); } 
	 EOF 
;

// Rule Guard
ruleGuard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGuardAccess().getAlternatives()); }
		(rule__Guard__Alternatives)
		{ after(grammarAccess.getGuardAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndGuard
entryRuleAndGuard
:
{ before(grammarAccess.getAndGuardRule()); }
	 ruleAndGuard
{ after(grammarAccess.getAndGuardRule()); } 
	 EOF 
;

// Rule AndGuard
ruleAndGuard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndGuardAccess().getGroup()); }
		(rule__AndGuard__Group__0)
		{ after(grammarAccess.getAndGuardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimaryGuard
entryRulePrimaryGuard
:
{ before(grammarAccess.getPrimaryGuardRule()); }
	 rulePrimaryGuard
{ after(grammarAccess.getPrimaryGuardRule()); } 
	 EOF 
;

// Rule PrimaryGuard
rulePrimaryGuard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryGuardAccess().getAlternatives()); }
		(rule__PrimaryGuard__Alternatives)
		{ after(grammarAccess.getPrimaryGuardAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCasestmtbranch
entryRuleCasestmtbranch
:
{ before(grammarAccess.getCasestmtbranchRule()); }
	 ruleCasestmtbranch
{ after(grammarAccess.getCasestmtbranchRule()); } 
	 EOF 
;

// Rule Casestmtbranch
ruleCasestmtbranch 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCasestmtbranchAccess().getGroup()); }
		(rule__Casestmtbranch__Group__0)
		{ after(grammarAccess.getCasestmtbranchAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTrait_usage
entryRuleTrait_usage
:
{ before(grammarAccess.getTrait_usageRule()); }
	 ruleTrait_usage
{ after(grammarAccess.getTrait_usageRule()); } 
	 EOF 
;

// Rule Trait_usage
ruleTrait_usage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrait_usageAccess().getGroup()); }
		(rule__Trait_usage__Group__0)
		{ after(grammarAccess.getTrait_usageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTrait_expr
entryRuleTrait_expr
:
{ before(grammarAccess.getTrait_exprRule()); }
	 ruleTrait_expr
{ after(grammarAccess.getTrait_exprRule()); } 
	 EOF 
;

// Rule Trait_expr
ruleTrait_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrait_exprAccess().getAlternatives()); }
		(rule__Trait_expr__Alternatives)
		{ after(grammarAccess.getTrait_exprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuletrait_Left_expr
entryRuletrait_Left_expr
:
{ before(grammarAccess.getTrait_Left_exprRule()); }
	 ruletrait_Left_expr
{ after(grammarAccess.getTrait_Left_exprRule()); } 
	 EOF 
;

// Rule trait_Left_expr
ruletrait_Left_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrait_Left_exprAccess().getGroup()); }
		(rule__Trait_Left_expr__Group__0)
		{ after(grammarAccess.getTrait_Left_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary_Trait_expr
entryRulePrimary_Trait_expr
:
{ before(grammarAccess.getPrimary_Trait_exprRule()); }
	 rulePrimary_Trait_expr
{ after(grammarAccess.getPrimary_Trait_exprRule()); } 
	 EOF 
;

// Rule Primary_Trait_expr
rulePrimary_Trait_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimary_Trait_exprAccess().getGroup()); }
		(rule__Primary_Trait_expr__Group__0)
		{ after(grammarAccess.getPrimary_Trait_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTrait_oper
entryRuleTrait_oper
:
{ before(grammarAccess.getTrait_operRule()); }
	 ruleTrait_oper
{ after(grammarAccess.getTrait_operRule()); } 
	 EOF 
;

// Rule Trait_oper
ruleTrait_oper 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrait_operAccess().getAlternatives()); }
		(rule__Trait_oper__Alternatives)
		{ after(grammarAccess.getTrait_operAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMethod
entryRuleMethod
:
{ before(grammarAccess.getMethodRule()); }
	 ruleMethod
{ after(grammarAccess.getMethodRule()); } 
	 EOF 
;

// Rule Method
ruleMethod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMethodAccess().getGroup()); }
		(rule__Method__Group__0)
		{ after(grammarAccess.getMethodAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTrait_decl
entryRuleTrait_decl
:
{ before(grammarAccess.getTrait_declRule()); }
	 ruleTrait_decl
{ after(grammarAccess.getTrait_declRule()); } 
	 EOF 
;

// Rule Trait_decl
ruleTrait_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrait_declAccess().getGroup()); }
		(rule__Trait_decl__Group__0)
		{ after(grammarAccess.getTrait_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMain_block
entryRuleMain_block
:
{ before(grammarAccess.getMain_blockRule()); }
	 ruleMain_block
{ after(grammarAccess.getMain_blockRule()); } 
	 EOF 
;

// Rule Main_block
ruleMain_block 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMain_blockAccess().getGroup()); }
		(rule__Main_block__Group__0)
		{ after(grammarAccess.getMain_blockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelta_decl
entryRuleDelta_decl
:
{ before(grammarAccess.getDelta_declRule()); }
	 ruleDelta_decl
{ after(grammarAccess.getDelta_declRule()); } 
	 EOF 
;

// Rule Delta_decl
ruleDelta_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelta_declAccess().getGroup()); }
		(rule__Delta_decl__Group__0)
		{ after(grammarAccess.getDelta_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelta_param
entryRuleDelta_param
:
{ before(grammarAccess.getDelta_paramRule()); }
	 ruleDelta_param
{ after(grammarAccess.getDelta_paramRule()); } 
	 EOF 
;

// Rule Delta_param
ruleDelta_param 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelta_paramAccess().getAlternatives()); }
		(rule__Delta_param__Alternatives)
		{ after(grammarAccess.getDelta_paramAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHas_condition
entryRuleHas_condition
:
{ before(grammarAccess.getHas_conditionRule()); }
	 ruleHas_condition
{ after(grammarAccess.getHas_conditionRule()); } 
	 EOF 
;

// Rule Has_condition
ruleHas_condition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHas_conditionAccess().getAlternatives()); }
		(rule__Has_condition__Alternatives)
		{ after(grammarAccess.getHas_conditionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelta_access
entryRuleDelta_access
:
{ before(grammarAccess.getDelta_accessRule()); }
	 ruleDelta_access
{ after(grammarAccess.getDelta_accessRule()); } 
	 EOF 
;

// Rule Delta_access
ruleDelta_access 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelta_accessAccess().getGroup()); }
		(rule__Delta_access__Group__0)
		{ after(grammarAccess.getDelta_accessAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModule_modifier
entryRuleModule_modifier
:
{ before(grammarAccess.getModule_modifierRule()); }
	 ruleModule_modifier
{ after(grammarAccess.getModule_modifierRule()); } 
	 EOF 
;

// Rule Module_modifier
ruleModule_modifier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModule_modifierAccess().getAlternatives()); }
		(rule__Module_modifier__Alternatives)
		{ after(grammarAccess.getModule_modifierAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunctional_modifier
entryRuleFunctional_modifier
:
{ before(grammarAccess.getFunctional_modifierRule()); }
	 ruleFunctional_modifier
{ after(grammarAccess.getFunctional_modifierRule()); } 
	 EOF 
;

// Rule Functional_modifier
ruleFunctional_modifier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getAlternatives()); }
		(rule__Functional_modifier__Alternatives)
		{ after(grammarAccess.getFunctional_modifierAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOO_modifier
entryRuleOO_modifier
:
{ before(grammarAccess.getOO_modifierRule()); }
	 ruleOO_modifier
{ after(grammarAccess.getOO_modifierRule()); } 
	 EOF 
;

// Rule OO_modifier
ruleOO_modifier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOO_modifierAccess().getAlternatives()); }
		(rule__OO_modifier__Alternatives)
		{ after(grammarAccess.getOO_modifierAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClass_modifier_fragment
entryRuleClass_modifier_fragment
:
{ before(grammarAccess.getClass_modifier_fragmentRule()); }
	 ruleClass_modifier_fragment
{ after(grammarAccess.getClass_modifier_fragmentRule()); } 
	 EOF 
;

// Rule Class_modifier_fragment
ruleClass_modifier_fragment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getAlternatives()); }
		(rule__Class_modifier_fragment__Alternatives)
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInterface_modifier_fragment
entryRuleInterface_modifier_fragment
:
{ before(grammarAccess.getInterface_modifier_fragmentRule()); }
	 ruleInterface_modifier_fragment
{ after(grammarAccess.getInterface_modifier_fragmentRule()); } 
	 EOF 
;

// Rule Interface_modifier_fragment
ruleInterface_modifier_fragment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInterface_modifier_fragmentAccess().getAlternatives()); }
		(rule__Interface_modifier_fragment__Alternatives)
		{ after(grammarAccess.getInterface_modifier_fragmentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNamespace_modifier
entryRuleNamespace_modifier
:
{ before(grammarAccess.getNamespace_modifierRule()); }
	 ruleNamespace_modifier
{ after(grammarAccess.getNamespace_modifierRule()); } 
	 EOF 
;

// Rule Namespace_modifier
ruleNamespace_modifier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNamespace_modifierAccess().getGroup()); }
		(rule__Namespace_modifier__Group__0)
		{ after(grammarAccess.getNamespace_modifierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUpdate_decl
entryRuleUpdate_decl
:
{ before(grammarAccess.getUpdate_declRule()); }
	 ruleUpdate_decl
{ after(grammarAccess.getUpdate_declRule()); } 
	 EOF 
;

// Rule Update_decl
ruleUpdate_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUpdate_declAccess().getGroup()); }
		(rule__Update_decl__Group__0)
		{ after(grammarAccess.getUpdate_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObject_update
entryRuleObject_update
:
{ before(grammarAccess.getObject_updateRule()); }
	 ruleObject_update
{ after(grammarAccess.getObject_updateRule()); } 
	 EOF 
;

// Rule Object_update
ruleObject_update 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObject_updateAccess().getGroup()); }
		(rule__Object_update__Group__0)
		{ after(grammarAccess.getObject_updateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUpdate_preamble_declaration
entryRuleUpdate_preamble_declaration
:
{ before(grammarAccess.getUpdate_preamble_declarationRule()); }
	 ruleUpdate_preamble_declaration
{ after(grammarAccess.getUpdate_preamble_declarationRule()); } 
	 EOF 
;

// Rule Update_preamble_declaration
ruleUpdate_preamble_declaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUpdate_preamble_declarationAccess().getGroup()); }
		(rule__Update_preamble_declaration__Group__0)
		{ after(grammarAccess.getUpdate_preamble_declarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObject_update_assign_stmt
entryRuleObject_update_assign_stmt
:
{ before(grammarAccess.getObject_update_assign_stmtRule()); }
	 ruleObject_update_assign_stmt
{ after(grammarAccess.getObject_update_assign_stmtRule()); } 
	 EOF 
;

// Rule Object_update_assign_stmt
ruleObject_update_assign_stmt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObject_update_assign_stmtAccess().getGroup()); }
		(rule__Object_update_assign_stmt__Group__0)
		{ after(grammarAccess.getObject_update_assign_stmtAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProductline_decl
entryRuleProductline_decl
:
{ before(grammarAccess.getProductline_declRule()); }
	 ruleProductline_decl
{ after(grammarAccess.getProductline_declRule()); } 
	 EOF 
;

// Rule Productline_decl
ruleProductline_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductline_declAccess().getGroup()); }
		(rule__Productline_decl__Group__0)
		{ after(grammarAccess.getProductline_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttr_assignment
entryRuleAttr_assignment
:
{ before(grammarAccess.getAttr_assignmentRule()); }
	 ruleAttr_assignment
{ after(grammarAccess.getAttr_assignmentRule()); } 
	 EOF 
;

// Rule Attr_assignment
ruleAttr_assignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttr_assignmentAccess().getGroup()); }
		(rule__Attr_assignment__Group__0)
		{ after(grammarAccess.getAttr_assignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelta_clause
entryRuleDelta_clause
:
{ before(grammarAccess.getDelta_clauseRule()); }
	 ruleDelta_clause
{ after(grammarAccess.getDelta_clauseRule()); } 
	 EOF 
;

// Rule Delta_clause
ruleDelta_clause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelta_clauseAccess().getGroup()); }
		(rule__Delta_clause__Group__0)
		{ after(grammarAccess.getDelta_clauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeltaspec_param
entryRuleDeltaspec_param
:
{ before(grammarAccess.getDeltaspec_paramRule()); }
	 ruleDeltaspec_param
{ after(grammarAccess.getDeltaspec_paramRule()); } 
	 EOF 
;

// Rule Deltaspec_param
ruleDeltaspec_param 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeltaspec_paramAccess().getAlternatives()); }
		(rule__Deltaspec_param__Alternatives)
		{ after(grammarAccess.getDeltaspec_paramAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAfter_condition
entryRuleAfter_condition
:
{ before(grammarAccess.getAfter_conditionRule()); }
	 ruleAfter_condition
{ after(grammarAccess.getAfter_conditionRule()); } 
	 EOF 
;

// Rule After_condition
ruleAfter_condition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAfter_conditionAccess().getGroup()); }
		(rule__After_condition__Group__0)
		{ after(grammarAccess.getAfter_conditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFrom_condition
entryRuleFrom_condition
:
{ before(grammarAccess.getFrom_conditionRule()); }
	 ruleFrom_condition
{ after(grammarAccess.getFrom_conditionRule()); } 
	 EOF 
;

// Rule From_condition
ruleFrom_condition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFrom_conditionAccess().getGroup()); }
		(rule__From_condition__Group__0)
		{ after(grammarAccess.getFrom_conditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWhen_condition
entryRuleWhen_condition
:
{ before(grammarAccess.getWhen_conditionRule()); }
	 ruleWhen_condition
{ after(grammarAccess.getWhen_conditionRule()); } 
	 EOF 
;

// Rule When_condition
ruleWhen_condition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWhen_conditionAccess().getGroup()); }
		(rule__When_condition__Group__0)
		{ after(grammarAccess.getWhen_conditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleApplication_condition
entryRuleApplication_condition
:
{ before(grammarAccess.getApplication_conditionRule()); }
	 ruleApplication_condition
{ after(grammarAccess.getApplication_conditionRule()); } 
	 EOF 
;

// Rule Application_condition
ruleApplication_condition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getApplication_conditionAccess().getAppOr_expParserRuleCall()); }
		ruleAppOr_exp
		{ after(grammarAccess.getApplication_conditionAccess().getAppOr_expParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppOr_exp
entryRuleAppOr_exp
:
{ before(grammarAccess.getAppOr_expRule()); }
	 ruleAppOr_exp
{ after(grammarAccess.getAppOr_expRule()); } 
	 EOF 
;

// Rule AppOr_exp
ruleAppOr_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppOr_expAccess().getGroup()); }
		(rule__AppOr_exp__Group__0)
		{ after(grammarAccess.getAppOr_expAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppAnd_exp
entryRuleAppAnd_exp
:
{ before(grammarAccess.getAppAnd_expRule()); }
	 ruleAppAnd_exp
{ after(grammarAccess.getAppAnd_expRule()); } 
	 EOF 
;

// Rule AppAnd_exp
ruleAppAnd_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppAnd_expAccess().getGroup()); }
		(rule__AppAnd_exp__Group__0)
		{ after(grammarAccess.getAppAnd_expAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppUnary_exp
entryRuleAppUnary_exp
:
{ before(grammarAccess.getAppUnary_expRule()); }
	 ruleAppUnary_exp
{ after(grammarAccess.getAppUnary_expRule()); } 
	 EOF 
;

// Rule AppUnary_exp
ruleAppUnary_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppUnary_expAccess().getAlternatives()); }
		(rule__AppUnary_exp__Alternatives)
		{ after(grammarAccess.getAppUnary_expAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppPrimary_exp
entryRuleAppPrimary_exp
:
{ before(grammarAccess.getAppPrimary_expRule()); }
	 ruleAppPrimary_exp
{ after(grammarAccess.getAppPrimary_expRule()); } 
	 EOF 
;

// Rule AppPrimary_exp
ruleAppPrimary_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppPrimary_expAccess().getAlternatives()); }
		(rule__AppPrimary_exp__Alternatives)
		{ after(grammarAccess.getAppPrimary_expAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppCond_atomic_expr
entryRuleAppCond_atomic_expr
:
{ before(grammarAccess.getAppCond_atomic_exprRule()); }
	 ruleAppCond_atomic_expr
{ after(grammarAccess.getAppCond_atomic_exprRule()); } 
	 EOF 
;

// Rule AppCond_atomic_expr
ruleAppCond_atomic_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppCond_atomic_exprAccess().getFeatureAssignment()); }
		(rule__AppCond_atomic_expr__FeatureAssignment)
		{ after(grammarAccess.getAppCond_atomic_exprAccess().getFeatureAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProduct_decl
entryRuleProduct_decl
:
{ before(grammarAccess.getProduct_declRule()); }
	 ruleProduct_decl
{ after(grammarAccess.getProduct_declRule()); } 
	 EOF 
;

// Rule Product_decl
ruleProduct_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProduct_declAccess().getGroup()); }
		(rule__Product_decl__Group__0)
		{ after(grammarAccess.getProduct_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProduct_expr
entryRuleProduct_expr
:
{ before(grammarAccess.getProduct_exprRule()); }
	 ruleProduct_expr
{ after(grammarAccess.getProduct_exprRule()); } 
	 EOF 
;

// Rule Product_expr
ruleProduct_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProduct_exprAccess().getProductOr_exprParserRuleCall()); }
		ruleProductOr_expr
		{ after(grammarAccess.getProduct_exprAccess().getProductOr_exprParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProductOr_expr
entryRuleProductOr_expr
:
{ before(grammarAccess.getProductOr_exprRule()); }
	 ruleProductOr_expr
{ after(grammarAccess.getProductOr_exprRule()); } 
	 EOF 
;

// Rule ProductOr_expr
ruleProductOr_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductOr_exprAccess().getGroup()); }
		(rule__ProductOr_expr__Group__0)
		{ after(grammarAccess.getProductOr_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProductAnd_exp
entryRuleProductAnd_exp
:
{ before(grammarAccess.getProductAnd_expRule()); }
	 ruleProductAnd_exp
{ after(grammarAccess.getProductAnd_expRule()); } 
	 EOF 
;

// Rule ProductAnd_exp
ruleProductAnd_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductAnd_expAccess().getGroup()); }
		(rule__ProductAnd_exp__Group__0)
		{ after(grammarAccess.getProductAnd_expAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProductMinus_exp
entryRuleProductMinus_exp
:
{ before(grammarAccess.getProductMinus_expRule()); }
	 ruleProductMinus_exp
{ after(grammarAccess.getProductMinus_expRule()); } 
	 EOF 
;

// Rule ProductMinus_exp
ruleProductMinus_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductMinus_expAccess().getGroup()); }
		(rule__ProductMinus_exp__Group__0)
		{ after(grammarAccess.getProductMinus_expAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProductPrimary_exp
entryRuleProductPrimary_exp
:
{ before(grammarAccess.getProductPrimary_expRule()); }
	 ruleProductPrimary_exp
{ after(grammarAccess.getProductPrimary_expRule()); } 
	 EOF 
;

// Rule ProductPrimary_exp
ruleProductPrimary_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductPrimary_expAccess().getAlternatives()); }
		(rule__ProductPrimary_exp__Alternatives)
		{ after(grammarAccess.getProductPrimary_expAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomicProduct_expr
entryRuleAtomicProduct_expr
:
{ before(grammarAccess.getAtomicProduct_exprRule()); }
	 ruleAtomicProduct_expr
{ after(grammarAccess.getAtomicProduct_exprRule()); } 
	 EOF 
;

// Rule AtomicProduct_expr
ruleAtomicProduct_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicProduct_exprAccess().getAlternatives()); }
		(rule__AtomicProduct_expr__Alternatives)
		{ after(grammarAccess.getAtomicProduct_exprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProduct_reconfiguration
entryRuleProduct_reconfiguration
:
{ before(grammarAccess.getProduct_reconfigurationRule()); }
	 ruleProduct_reconfiguration
{ after(grammarAccess.getProduct_reconfigurationRule()); } 
	 EOF 
;

// Rule Product_reconfiguration
ruleProduct_reconfiguration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProduct_reconfigurationAccess().getGroup()); }
		(rule__Product_reconfiguration__Group__0)
		{ after(grammarAccess.getProduct_reconfigurationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature_decl
entryRuleFeature_decl
:
{ before(grammarAccess.getFeature_declRule()); }
	 ruleFeature_decl
{ after(grammarAccess.getFeature_declRule()); } 
	 EOF 
;

// Rule Feature_decl
ruleFeature_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeature_declAccess().getGroup()); }
		(rule__Feature_decl__Group__0)
		{ after(grammarAccess.getFeature_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature_decl_group
entryRuleFeature_decl_group
:
{ before(grammarAccess.getFeature_decl_groupRule()); }
	 ruleFeature_decl_group
{ after(grammarAccess.getFeature_decl_groupRule()); } 
	 EOF 
;

// Rule Feature_decl_group
ruleFeature_decl_group 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getGroup()); }
		(rule__Feature_decl_group__Group__0)
		{ after(grammarAccess.getFeature_decl_groupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFnode
entryRuleFnode
:
{ before(grammarAccess.getFnodeRule()); }
	 ruleFnode
{ after(grammarAccess.getFnodeRule()); } 
	 EOF 
;

// Rule Fnode
ruleFnode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFnodeAccess().getGroup()); }
		(rule__Fnode__Group__0)
		{ after(grammarAccess.getFnodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature_decl_attribute
entryRuleFeature_decl_attribute
:
{ before(grammarAccess.getFeature_decl_attributeRule()); }
	 ruleFeature_decl_attribute
{ after(grammarAccess.getFeature_decl_attributeRule()); } 
	 EOF 
;

// Rule Feature_decl_attribute
ruleFeature_decl_attribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getAlternatives()); }
		(rule__Feature_decl_attribute__Alternatives)
		{ after(grammarAccess.getFeature_decl_attributeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoundary_val
entryRuleBoundary_val
:
{ before(grammarAccess.getBoundary_valRule()); }
	 ruleBoundary_val
{ after(grammarAccess.getBoundary_valRule()); } 
	 EOF 
;

// Rule Boundary_val
ruleBoundary_val 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBoundary_valAccess().getGroup()); }
		(rule__Boundary_val__Group__0)
		{ after(grammarAccess.getBoundary_valAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoundary_int
entryRuleBoundary_int
:
{ before(grammarAccess.getBoundary_intRule()); }
	 ruleBoundary_int
{ after(grammarAccess.getBoundary_intRule()); } 
	 EOF 
;

// Rule Boundary_int
ruleBoundary_int 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBoundary_intAccess().getAlternatives()); }
		(rule__Boundary_int__Alternatives)
		{ after(grammarAccess.getBoundary_intAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature_decl_constraint
entryRuleFeature_decl_constraint
:
{ before(grammarAccess.getFeature_decl_constraintRule()); }
	 ruleFeature_decl_constraint
{ after(grammarAccess.getFeature_decl_constraintRule()); } 
	 EOF 
;

// Rule Feature_decl_constraint
ruleFeature_decl_constraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeature_decl_constraintAccess().getAlternatives()); }
		(rule__Feature_decl_constraint__Alternatives)
		{ after(grammarAccess.getFeature_decl_constraintAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexp
entryRuleMexp
:
{ before(grammarAccess.getMexpRule()); }
	 ruleMexp
{ after(grammarAccess.getMexpRule()); } 
	 EOF 
;

// Rule Mexp
ruleMexp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpAccess().getAlternatives()); }
		(rule__Mexp__Alternatives)
		{ after(grammarAccess.getMexpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpOr_exp
entryRuleMexpOr_exp
:
{ before(grammarAccess.getMexpOr_expRule()); }
	 ruleMexpOr_exp
{ after(grammarAccess.getMexpOr_expRule()); } 
	 EOF 
;

// Rule MexpOr_exp
ruleMexpOr_exp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpOr_expAccess().getGroup()); }
		(rule__MexpOr_exp__Group__0)
		{ after(grammarAccess.getMexpOr_expAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpAnd_expr
entryRuleMexpAnd_expr
:
{ before(grammarAccess.getMexpAnd_exprRule()); }
	 ruleMexpAnd_expr
{ after(grammarAccess.getMexpAnd_exprRule()); } 
	 EOF 
;

// Rule MexpAnd_expr
ruleMexpAnd_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpAnd_exprAccess().getGroup()); }
		(rule__MexpAnd_expr__Group__0)
		{ after(grammarAccess.getMexpAnd_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpImplies_expr
entryRuleMexpImplies_expr
:
{ before(grammarAccess.getMexpImplies_exprRule()); }
	 ruleMexpImplies_expr
{ after(grammarAccess.getMexpImplies_exprRule()); } 
	 EOF 
;

// Rule MexpImplies_expr
ruleMexpImplies_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpImplies_exprAccess().getGroup()); }
		(rule__MexpImplies_expr__Group__0)
		{ after(grammarAccess.getMexpImplies_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpEquality_expr
entryRuleMexpEquality_expr
:
{ before(grammarAccess.getMexpEquality_exprRule()); }
	 ruleMexpEquality_expr
{ after(grammarAccess.getMexpEquality_exprRule()); } 
	 EOF 
;

// Rule MexpEquality_expr
ruleMexpEquality_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpEquality_exprAccess().getGroup()); }
		(rule__MexpEquality_expr__Group__0)
		{ after(grammarAccess.getMexpEquality_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpComparison_expr
entryRuleMexpComparison_expr
:
{ before(grammarAccess.getMexpComparison_exprRule()); }
	 ruleMexpComparison_expr
{ after(grammarAccess.getMexpComparison_exprRule()); } 
	 EOF 
;

// Rule MexpComparison_expr
ruleMexpComparison_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpComparison_exprAccess().getGroup()); }
		(rule__MexpComparison_expr__Group__0)
		{ after(grammarAccess.getMexpComparison_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpPlusOrMinus_expr
entryRuleMexpPlusOrMinus_expr
:
{ before(grammarAccess.getMexpPlusOrMinus_exprRule()); }
	 ruleMexpPlusOrMinus_expr
{ after(grammarAccess.getMexpPlusOrMinus_exprRule()); } 
	 EOF 
;

// Rule MexpPlusOrMinus_expr
ruleMexpPlusOrMinus_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getGroup()); }
		(rule__MexpPlusOrMinus_expr__Group__0)
		{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpMulDivOrMod_expr
entryRuleMexpMulDivOrMod_expr
:
{ before(grammarAccess.getMexpMulDivOrMod_exprRule()); }
	 ruleMexpMulDivOrMod_expr
{ after(grammarAccess.getMexpMulDivOrMod_exprRule()); } 
	 EOF 
;

// Rule MexpMulDivOrMod_expr
ruleMexpMulDivOrMod_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getGroup()); }
		(rule__MexpMulDivOrMod_expr__Group__0)
		{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpPrimary_expr
entryRuleMexpPrimary_expr
:
{ before(grammarAccess.getMexpPrimary_exprRule()); }
	 ruleMexpPrimary_expr
{ after(grammarAccess.getMexpPrimary_exprRule()); } 
	 EOF 
;

// Rule MexpPrimary_expr
ruleMexpPrimary_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpPrimary_exprAccess().getAlternatives()); }
		(rule__MexpPrimary_expr__Alternatives)
		{ after(grammarAccess.getMexpPrimary_exprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMexpAtomic_expr
entryRuleMexpAtomic_expr
:
{ before(grammarAccess.getMexpAtomic_exprRule()); }
	 ruleMexpAtomic_expr
{ after(grammarAccess.getMexpAtomic_exprRule()); } 
	 EOF 
;

// Rule MexpAtomic_expr
ruleMexpAtomic_expr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMexpAtomic_exprAccess().getGroup()); }
		(rule__MexpAtomic_expr__Group__0)
		{ after(grammarAccess.getMexpAtomic_exprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFextension
entryRuleFextension
:
{ before(grammarAccess.getFextensionRule()); }
	 ruleFextension
{ after(grammarAccess.getFextensionRule()); } 
	 EOF 
;

// Rule Fextension
ruleFextension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFextensionAccess().getGroup()); }
		(rule__Fextension__Group__0)
		{ after(grammarAccess.getFextensionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Alternatives_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getGroup_6_0()); }
		(rule__Compilation_Unit__Group_6_0__0)
		{ after(grammarAccess.getCompilation_UnitAccess().getGroup_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getGroup_6_1()); }
		(rule__Compilation_Unit__Group_6_1__0)
		{ after(grammarAccess.getCompilation_UnitAccess().getGroup_6_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_exportAccess().getStarAssignment_2_0()); }
		(rule__Module_export__StarAssignment_2_0)
		{ after(grammarAccess.getModule_exportAccess().getStarAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getModule_exportAccess().getGroup_2_1()); }
		(rule__Module_export__Group_2_1__0)
		{ after(grammarAccess.getModule_exportAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_importAccess().getGroup_1_0()); }
		(rule__Module_import__Group_1_0__0)
		{ after(grammarAccess.getModule_importAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getModule_importAccess().getGroup_1_1()); }
		(rule__Module_import__Group_1_1__0)
		{ after(grammarAccess.getModule_importAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decl__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclAccess().getDataType_declParserRuleCall_0()); }
		ruleDataType_decl
		{ after(grammarAccess.getDeclAccess().getDataType_declParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeclAccess().getFunction_declParserRuleCall_1()); }
		ruleFunction_decl
		{ after(grammarAccess.getDeclAccess().getFunction_declParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDeclAccess().getPar_function_declParserRuleCall_2()); }
		rulePar_function_decl
		{ after(grammarAccess.getDeclAccess().getPar_function_declParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDeclAccess().getTypesyn_declParserRuleCall_3()); }
		ruleTypesyn_decl
		{ after(grammarAccess.getDeclAccess().getTypesyn_declParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getDeclAccess().getException_declParserRuleCall_4()); }
		ruleException_decl
		{ after(grammarAccess.getDeclAccess().getException_declParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getDeclAccess().getInterface_declParserRuleCall_5()); }
		ruleInterface_decl
		{ after(grammarAccess.getDeclAccess().getInterface_declParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getDeclAccess().getClass_declParserRuleCall_6()); }
		ruleClass_decl
		{ after(grammarAccess.getDeclAccess().getClass_declParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getDeclAccess().getTrait_declParserRuleCall_7()); }
		ruleTrait_decl
		{ after(grammarAccess.getDeclAccess().getTrait_declParserRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getGroup_0()); }
		(rule__Pure_exp__Group_0__0)
		{ after(grammarAccess.getPure_expAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPure_expAccess().getGroup_1()); }
		(rule__Pure_exp__Group_1__0)
		{ after(grammarAccess.getPure_expAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPure_expAccess().getGroup_2()); }
		(rule__Pure_exp__Group_2__0)
		{ after(grammarAccess.getPure_expAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getPure_expAccess().getOr_exprParserRuleCall_3()); }
		ruleOr_expr
		{ after(grammarAccess.getPure_expAccess().getOr_exprParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPure_expAccess().getGroup_4()); }
		(rule__Pure_exp__Group_4__0)
		{ after(grammarAccess.getPure_expAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getPure_expAccess().getGroup_5()); }
		(rule__Pure_exp__Group_5__0)
		{ after(grammarAccess.getPure_expAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getPure_expAccess().getGroup_6()); }
		(rule__Pure_exp__Group_6__0)
		{ after(grammarAccess.getPure_expAccess().getGroup_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEquality_exprAccess().getOpEQEQTerminalRuleCall_1_1_0_0()); }
		RULE_EQEQ
		{ after(grammarAccess.getEquality_exprAccess().getOpEQEQTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getEquality_exprAccess().getOpNOTEQTerminalRuleCall_1_1_0_1()); }
		RULE_NOTEQ
		{ after(grammarAccess.getEquality_exprAccess().getOpNOTEQTerminalRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparison_exprAccess().getOpLTTerminalRuleCall_1_1_0_0()); }
		RULE_LT
		{ after(grammarAccess.getComparison_exprAccess().getOpLTTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getComparison_exprAccess().getOpGTTerminalRuleCall_1_1_0_1()); }
		RULE_GT
		{ after(grammarAccess.getComparison_exprAccess().getOpGTTerminalRuleCall_1_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getComparison_exprAccess().getOpLTEQTerminalRuleCall_1_1_0_2()); }
		RULE_LTEQ
		{ after(grammarAccess.getComparison_exprAccess().getOpLTEQTerminalRuleCall_1_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getComparison_exprAccess().getOpGTEQTerminalRuleCall_1_1_0_3()); }
		RULE_GTEQ
		{ after(grammarAccess.getComparison_exprAccess().getOpGTEQTerminalRuleCall_1_1_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinus_exprAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getPlusOrMinus_exprAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusOrMinus_exprAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); }
		RULE_MINUS
		{ after(grammarAccess.getPlusOrMinus_exprAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulDivOrMod_exprAccess().getOpMULTTerminalRuleCall_1_1_0_0()); }
		RULE_MULT
		{ after(grammarAccess.getMulDivOrMod_exprAccess().getOpMULTTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMulDivOrMod_exprAccess().getOpSolidusKeyword_1_1_0_1()); }
		'/'
		{ after(grammarAccess.getMulDivOrMod_exprAccess().getOpSolidusKeyword_1_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMulDivOrMod_exprAccess().getOpMODTerminalRuleCall_1_1_0_2()); }
		RULE_MOD
		{ after(grammarAccess.getMulDivOrMod_exprAccess().getOpMODTerminalRuleCall_1_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Uniary_expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUniary_exprAccess().getGroup_0()); }
		(rule__Uniary_expr__Group_0__0)
		{ after(grammarAccess.getUniary_exprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getUniary_exprAccess().getPrimary_exprParserRuleCall_1()); }
		rulePrimary_expr
		{ after(grammarAccess.getUniary_exprAccess().getPrimary_exprParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Uniary_expr__OpAlternatives_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUniary_exprAccess().getOpNEGATIONTerminalRuleCall_0_0_0_0()); }
		RULE_NEGATION
		{ after(grammarAccess.getUniary_exprAccess().getOpNEGATIONTerminalRuleCall_0_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getUniary_exprAccess().getOpNEGATION_CREOLTerminalRuleCall_0_0_0_1()); }
		RULE_NEGATION_CREOL
		{ after(grammarAccess.getUniary_exprAccess().getOpNEGATION_CREOLTerminalRuleCall_0_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getUniary_exprAccess().getOpMINUSTerminalRuleCall_0_0_0_2()); }
		RULE_MINUS
		{ after(grammarAccess.getUniary_exprAccess().getOpMINUSTerminalRuleCall_0_0_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimary_exprAccess().getGroup_0()); }
		(rule__Primary_expr__Group_0__0)
		{ after(grammarAccess.getPrimary_exprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimary_exprAccess().getAtomic_exprParserRuleCall_1()); }
		ruleAtomic_expr
		{ after(grammarAccess.getPrimary_exprAccess().getAtomic_exprParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomic_exprAccess().getGroup_0()); }
		(rule__Atomic_expr__Group_0__0)
		{ after(grammarAccess.getAtomic_exprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomic_exprAccess().getGroup_1()); }
		(rule__Atomic_expr__Group_1__0)
		{ after(grammarAccess.getAtomic_exprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAtomic_exprAccess().getVar_or_field_refParserRuleCall_2()); }
		ruleVar_or_field_ref
		{ after(grammarAccess.getAtomic_exprAccess().getVar_or_field_refParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAtomic_exprAccess().getGroup_3()); }
		(rule__Atomic_expr__Group_3__0)
		{ after(grammarAccess.getAtomic_exprAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getAtomic_exprAccess().getGroup_4()); }
		(rule__Atomic_expr__Group_4__0)
		{ after(grammarAccess.getAtomic_exprAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getAtomic_exprAccess().getGroup_5()); }
		(rule__Atomic_expr__Group_5__0)
		{ after(grammarAccess.getAtomic_exprAccess().getGroup_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_or_field_refAccess().getGroup_0()); }
		(rule__Var_or_field_ref__Group_0__0)
		{ after(grammarAccess.getVar_or_field_refAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getVar_or_field_refAccess().getRefAssignment_1()); }
		(rule__Var_or_field_ref__RefAssignment_1)
		{ after(grammarAccess.getVar_or_field_refAccess().getRefAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().get_Keyword_1_0()); }
		'_'
		{ after(grammarAccess.getPatternAccess().get_Keyword_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getPatternAccess().getINTTerminalRuleCall_1_1()); }
		RULE_INT
		{ after(grammarAccess.getPatternAccess().getINTTerminalRuleCall_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getPatternAccess().getSTRINGLITERALTerminalRuleCall_1_2()); }
		RULE_STRINGLITERAL
		{ after(grammarAccess.getPatternAccess().getSTRINGLITERALTerminalRuleCall_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getPatternAccess().getIDTerminalRuleCall_1_3()); }
		RULE_ID
		{ after(grammarAccess.getPatternAccess().getIDTerminalRuleCall_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getPatternAccess().getGroup_1_4()); }
		(rule__Pattern__Group_1_4__0)
		{ after(grammarAccess.getPatternAccess().getGroup_1_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_param__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_paramAccess().getFunction_name_param_declParserRuleCall_0()); }
		ruleFunction_name_param_decl
		{ after(grammarAccess.getFunction_paramAccess().getFunction_name_param_declParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunction_paramAccess().getAnon_function_declParserRuleCall_1()); }
		ruleAnon_function_decl
		{ after(grammarAccess.getFunction_paramAccess().getAnon_function_declParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Alternatives_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_declAccess().getBuiltinKeyword_6_0()); }
		'builtin'
		{ after(grammarAccess.getFunction_declAccess().getBuiltinKeyword_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunction_declAccess().getPure_expAssignment_6_1()); }
		(rule__Function_decl__Pure_expAssignment_6_1)
		{ after(grammarAccess.getFunction_declAccess().getPure_expAssignment_6_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_0()); }
		(rule__Stmt__Group_1_0__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_1()); }
		(rule__Stmt__Group_1_1__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_2()); }
		(rule__Stmt__Group_1_2__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_3()); }
		(rule__Stmt__Group_1_3__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_4()); }
		(rule__Stmt__Group_1_4__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_4()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_5()); }
		(rule__Stmt__Group_1_5__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_5()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_6()); }
		(rule__Stmt__Group_1_6__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_6()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_7()); }
		(rule__Stmt__Group_1_7__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_7()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_8()); }
		(rule__Stmt__Group_1_8__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_8()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_9()); }
		(rule__Stmt__Group_1_9__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_9()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_10()); }
		(rule__Stmt__Group_1_10__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_10()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_11()); }
		(rule__Stmt__Group_1_11__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_11()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_12()); }
		(rule__Stmt__Group_1_12__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_12()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_13()); }
		(rule__Stmt__Group_1_13__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_13()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_14()); }
		(rule__Stmt__Group_1_14__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_14()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_15()); }
		(rule__Stmt__Group_1_15__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_15()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_16()); }
		(rule__Stmt__Group_1_16__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_16()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_17()); }
		(rule__Stmt__Group_1_17__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_17()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Alternatives_1_9_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getGroup_1_9_3_0()); }
		(rule__Stmt__Group_1_9_3_0__0)
		{ after(grammarAccess.getStmtAccess().getGroup_1_9_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getStmtAccess().getCasestmtbranchAssignment_1_9_3_1()); }
		(rule__Stmt__CasestmtbranchAssignment_1_9_3_1)
		{ after(grammarAccess.getStmtAccess().getCasestmtbranchAssignment_1_9_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getEff_exprParserRuleCall_0()); }
		ruleEff_expr
		{ after(grammarAccess.getExpAccess().getEff_exprParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpAccess().getPure_expParserRuleCall_1()); }
		rulePure_exp
		{ after(grammarAccess.getExpAccess().getPure_expParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getGroup_0()); }
		(rule__Eff_expr__Group_0__0)
		{ after(grammarAccess.getEff_exprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getEff_exprAccess().getGroup_1()); }
		(rule__Eff_expr__Group_1__0)
		{ after(grammarAccess.getEff_exprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getEff_exprAccess().getGroup_2()); }
		(rule__Eff_expr__Group_2__0)
		{ after(grammarAccess.getEff_exprAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getEff_exprAccess().getGroup_3()); }
		(rule__Eff_expr__Group_3__0)
		{ after(grammarAccess.getEff_exprAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getEff_exprAccess().getGroup_4()); }
		(rule__Eff_expr__Group_4__0)
		{ after(grammarAccess.getEff_exprAccess().getGroup_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Alternatives_4_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getDelta_idParserRuleCall_4_0_0_0()); }
		ruleDelta_id
		{ after(grammarAccess.getEff_exprAccess().getDelta_idParserRuleCall_4_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getEff_exprAccess().getCoreKeyword_4_0_0_1()); }
		'core'
		{ after(grammarAccess.getEff_exprAccess().getCoreKeyword_4_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuardAccess().getGroup_0()); }
		(rule__Guard__Group_0__0)
		{ after(grammarAccess.getGuardAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getGuardAccess().getGroup_1()); }
		(rule__Guard__Group_1__0)
		{ after(grammarAccess.getGuardAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getGuardAccess().getAndGuardParserRuleCall_2()); }
		ruleAndGuard
		{ after(grammarAccess.getGuardAccess().getAndGuardParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryGuard__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryGuardAccess().getGroup_0()); }
		(rule__PrimaryGuard__Group_0__0)
		{ after(grammarAccess.getPrimaryGuardAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryGuardAccess().getGuardAssignment_1()); }
		(rule__PrimaryGuard__GuardAssignment_1)
		{ after(grammarAccess.getPrimaryGuardAccess().getGuardAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_exprAccess().getGroup_0()); }
		(rule__Trait_expr__Group_0__0)
		{ after(grammarAccess.getTrait_exprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getTrait_exprAccess().getTraitMethodAssignment_1()); }
		(rule__Trait_expr__TraitMethodAssignment_1)
		{ after(grammarAccess.getTrait_exprAccess().getTraitMethodAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getTrait_exprAccess().getTraitNameAssignment_2()); }
		(rule__Trait_expr__TraitNameAssignment_2)
		{ after(grammarAccess.getTrait_exprAccess().getTraitNameAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getTrait_exprAccess().getTrait_Left_exprParserRuleCall_3()); }
		ruletrait_Left_expr
		{ after(grammarAccess.getTrait_exprAccess().getTrait_Left_exprParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_operAccess().getGroup_0()); }
		(rule__Trait_oper__Group_0__0)
		{ after(grammarAccess.getTrait_operAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getTrait_operAccess().getGroup_1()); }
		(rule__Trait_oper__Group_1__0)
		{ after(grammarAccess.getTrait_operAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getTrait_operAccess().getGroup_2()); }
		(rule__Trait_oper__Group_2__0)
		{ after(grammarAccess.getTrait_operAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Alternatives_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_operAccess().getMethodAssignment_0_2_0()); }
		(rule__Trait_oper__MethodAssignment_0_2_0)
		{ after(grammarAccess.getTrait_operAccess().getMethodAssignment_0_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getTrait_operAccess().getGroup_0_2_1()); }
		(rule__Trait_oper__Group_0_2_1__0)
		{ after(grammarAccess.getTrait_operAccess().getGroup_0_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_param__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_paramAccess().getParam_declParserRuleCall_0()); }
		ruleParam_decl
		{ after(grammarAccess.getDelta_paramAccess().getParam_declParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDelta_paramAccess().getGroup_1()); }
		(rule__Delta_param__Group_1__0)
		{ after(grammarAccess.getDelta_paramAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHas_conditionAccess().getGroup_0()); }
		(rule__Has_condition__Group_0__0)
		{ after(grammarAccess.getHas_conditionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getHas_conditionAccess().getGroup_1()); }
		(rule__Has_condition__Group_1__0)
		{ after(grammarAccess.getHas_conditionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getHas_conditionAccess().getGroup_2()); }
		(rule__Has_condition__Group_2__0)
		{ after(grammarAccess.getHas_conditionAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_modifier__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_modifierAccess().getFunctional_modifierParserRuleCall_0()); }
		ruleFunctional_modifier
		{ after(grammarAccess.getModule_modifierAccess().getFunctional_modifierParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getModule_modifierAccess().getOO_modifierParserRuleCall_1()); }
		ruleOO_modifier
		{ after(grammarAccess.getModule_modifierAccess().getOO_modifierParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getModule_modifierAccess().getNamespace_modifierParserRuleCall_2()); }
		ruleNamespace_modifier
		{ after(grammarAccess.getModule_modifierAccess().getNamespace_modifierParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getGroup_0()); }
		(rule__Functional_modifier__Group_0__0)
		{ after(grammarAccess.getFunctional_modifierAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getGroup_1()); }
		(rule__Functional_modifier__Group_1__0)
		{ after(grammarAccess.getFunctional_modifierAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Alternatives_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getFunction_declParserRuleCall_0_1_0()); }
		ruleFunction_decl
		{ after(grammarAccess.getFunctional_modifierAccess().getFunction_declParserRuleCall_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getDataType_declParserRuleCall_0_1_1()); }
		ruleDataType_decl
		{ after(grammarAccess.getFunctional_modifierAccess().getDataType_declParserRuleCall_0_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getTypesyn_declParserRuleCall_0_1_2()); }
		ruleTypesyn_decl
		{ after(grammarAccess.getFunctional_modifierAccess().getTypesyn_declParserRuleCall_0_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getTypesyn_declParserRuleCall_1_1_0()); }
		ruleTypesyn_decl
		{ after(grammarAccess.getFunctional_modifierAccess().getTypesyn_declParserRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctional_modifierAccess().getDataType_declParserRuleCall_1_1_1()); }
		ruleDataType_decl
		{ after(grammarAccess.getFunctional_modifierAccess().getDataType_declParserRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getGroup_0()); }
		(rule__OO_modifier__Group_0__0)
		{ after(grammarAccess.getOO_modifierAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getOO_modifierAccess().getGroup_1()); }
		(rule__OO_modifier__Group_1__0)
		{ after(grammarAccess.getOO_modifierAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getOO_modifierAccess().getGroup_2()); }
		(rule__OO_modifier__Group_2__0)
		{ after(grammarAccess.getOO_modifierAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Alternatives_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getClass_declAssignment_0_2_0()); }
		(rule__OO_modifier__Class_declAssignment_0_2_0)
		{ after(grammarAccess.getOO_modifierAccess().getClass_declAssignment_0_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getOO_modifierAccess().getInterface_declAssignment_0_2_1()); }
		(rule__OO_modifier__Interface_declAssignment_0_2_1)
		{ after(grammarAccess.getOO_modifierAccess().getInterface_declAssignment_0_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getGroup_1_1_0()); }
		(rule__OO_modifier__Group_1_1_0__0)
		{ after(grammarAccess.getOO_modifierAccess().getGroup_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getOO_modifierAccess().getGroup_1_1_1()); }
		(rule__OO_modifier__Group_1_1_1__0)
		{ after(grammarAccess.getOO_modifierAccess().getGroup_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Alternatives_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getGroup_2_1_0()); }
		(rule__OO_modifier__Group_2_1_0__0)
		{ after(grammarAccess.getOO_modifierAccess().getGroup_2_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getOO_modifierAccess().getGroup_2_1_1()); }
		(rule__OO_modifier__Group_2_1_1__0)
		{ after(grammarAccess.getOO_modifierAccess().getGroup_2_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getGroup_0()); }
		(rule__Class_modifier_fragment__Group_0__0)
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getGroup_1()); }
		(rule__Class_modifier_fragment__Group_1__0)
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getGroup_2()); }
		(rule__Class_modifier_fragment__Group_2__0)
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Alternatives_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getField_declParserRuleCall_0_1_0()); }
		ruleField_decl
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getField_declParserRuleCall_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getTrait_exprParserRuleCall_0_1_1()); }
		ruleTrait_expr
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getTrait_exprParserRuleCall_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getField_declParserRuleCall_1_1_0()); }
		ruleField_decl
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getField_declParserRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigParserRuleCall_1_1_1()); }
		ruleMethodsig
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigParserRuleCall_1_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getGroup_1_1_2()); }
		(rule__Class_modifier_fragment__Group_1_1_2__0)
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getGroup_1_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_modifier_fragment__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterface_modifier_fragmentAccess().getGroup_0()); }
		(rule__Interface_modifier_fragment__Group_0__0)
		{ after(grammarAccess.getInterface_modifier_fragmentAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getInterface_modifier_fragmentAccess().getGroup_1()); }
		(rule__Interface_modifier_fragment__Group_1__0)
		{ after(grammarAccess.getInterface_modifier_fragmentAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace_modifier__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamespace_modifierAccess().getModule_importParserRuleCall_1_0()); }
		ruleModule_import
		{ after(grammarAccess.getNamespace_modifierAccess().getModule_importParserRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getNamespace_modifierAccess().getModule_exportParserRuleCall_1_1()); }
		ruleModule_export
		{ after(grammarAccess.getNamespace_modifierAccess().getModule_exportParserRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attr_assignment__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttr_assignmentAccess().getINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getAttr_assignmentAccess().getINTTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttr_assignmentAccess().getIDTerminalRuleCall_2_1()); }
		RULE_ID
		{ after(grammarAccess.getAttr_assignmentAccess().getIDTerminalRuleCall_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getAttr_assignmentAccess().getSTRINGLITERALTerminalRuleCall_2_2()); }
		RULE_STRINGLITERAL
		{ after(grammarAccess.getAttr_assignmentAccess().getSTRINGLITERALTerminalRuleCall_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deltaspec_param__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeltaspec_paramAccess().getGroup_0()); }
		(rule__Deltaspec_param__Group_0__0)
		{ after(grammarAccess.getDeltaspec_paramAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeltaspec_paramAccess().getINTTerminalRuleCall_1()); }
		RULE_INT
		{ after(grammarAccess.getDeltaspec_paramAccess().getINTTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__When_condition__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWhen_conditionAccess().getWhenKeyword_0_0()); }
		'when'
		{ after(grammarAccess.getWhen_conditionAccess().getWhenKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getWhen_conditionAccess().getToKeyword_0_1()); }
		'to'
		{ after(grammarAccess.getWhen_conditionAccess().getToKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppUnary_exp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppUnary_expAccess().getAppPrimary_expParserRuleCall_0()); }
		ruleAppPrimary_exp
		{ after(grammarAccess.getAppUnary_expAccess().getAppPrimary_expParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAppUnary_expAccess().getGroup_1()); }
		(rule__AppUnary_exp__Group_1__0)
		{ after(grammarAccess.getAppUnary_expAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppUnary_exp__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppUnary_expAccess().getNEGATIONTerminalRuleCall_1_0_0()); }
		RULE_NEGATION
		{ after(grammarAccess.getAppUnary_expAccess().getNEGATIONTerminalRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAppUnary_expAccess().getNEGATION_CREOLTerminalRuleCall_1_0_1()); }
		RULE_NEGATION_CREOL
		{ after(grammarAccess.getAppUnary_expAccess().getNEGATION_CREOLTerminalRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppPrimary_exp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppPrimary_expAccess().getGroup_0()); }
		(rule__AppPrimary_exp__Group_0__0)
		{ after(grammarAccess.getAppPrimary_expAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAppPrimary_expAccess().getAppCond_atomic_exprParserRuleCall_1()); }
		ruleAppCond_atomic_expr
		{ after(grammarAccess.getAppPrimary_expAccess().getAppCond_atomic_exprParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_declAccess().getGroup_3_0()); }
		(rule__Product_decl__Group_3_0__0)
		{ after(grammarAccess.getProduct_declAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getProduct_declAccess().getGroup_3_1()); }
		(rule__Product_decl__Group_3_1__0)
		{ after(grammarAccess.getProduct_declAccess().getGroup_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Alternatives_3_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_declAccess().getGroup_3_0_3_0()); }
		(rule__Product_decl__Group_3_0_3_0__0)
		{ after(grammarAccess.getProduct_declAccess().getGroup_3_0_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getProduct_declAccess().getSemicolonKeyword_3_0_3_1()); }
		';'
		{ after(grammarAccess.getProduct_declAccess().getSemicolonKeyword_3_0_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductPrimary_exp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductPrimary_expAccess().getGroup_0()); }
		(rule__ProductPrimary_exp__Group_0__0)
		{ after(grammarAccess.getProductPrimary_expAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getProductPrimary_expAccess().getAtomicProduct_exprParserRuleCall_1()); }
		ruleAtomicProduct_expr
		{ after(grammarAccess.getProductPrimary_expAccess().getAtomicProduct_exprParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicProduct_exprAccess().getGroup_0()); }
		(rule__AtomicProduct_expr__Group_0__0)
		{ after(grammarAccess.getAtomicProduct_exprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicProduct_exprAccess().getProductDeclAssignment_1()); }
		(rule__AtomicProduct_expr__ProductDeclAssignment_1)
		{ after(grammarAccess.getAtomicProduct_exprAccess().getProductDeclAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Alternatives_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_declAccess().getFeature_decl_attributeAssignment_1_2_0()); }
		(rule__Feature_decl__Feature_decl_attributeAssignment_1_2_0)
		{ after(grammarAccess.getFeature_declAccess().getFeature_decl_attributeAssignment_1_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_declAccess().getFeature_decl_constraintAssignment_1_2_1()); }
		(rule__Feature_decl__Feature_decl_constraintAssignment_1_2_1)
		{ after(grammarAccess.getFeature_declAccess().getFeature_decl_constraintAssignment_1_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getOneofKeyword_1_0()); }
		'oneof'
		{ after(grammarAccess.getFeature_decl_groupAccess().getOneofKeyword_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getAllofKeyword_1_1()); }
		'allof'
		{ after(grammarAccess.getFeature_decl_groupAccess().getAllofKeyword_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getGroup_1_2()); }
		(rule__Feature_decl_group__Group_1_2__0)
		{ after(grammarAccess.getFeature_decl_groupAccess().getGroup_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Alternatives_1_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_3_0()); }
		RULE_INT
		{ after(grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getMULTTerminalRuleCall_1_2_3_1()); }
		RULE_MULT
		{ after(grammarAccess.getFeature_decl_groupAccess().getMULTTerminalRuleCall_1_2_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getGroup_0()); }
		(rule__Feature_decl_attribute__Group_0__0)
		{ after(grammarAccess.getFeature_decl_attributeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getGroup_1()); }
		(rule__Feature_decl_attribute__Group_1__0)
		{ after(grammarAccess.getFeature_decl_attributeAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getGroup_2()); }
		(rule__Feature_decl_attribute__Group_2__0)
		{ after(grammarAccess.getFeature_decl_attributeAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getGroup_3()); }
		(rule__Feature_decl_attribute__Group_3__0)
		{ after(grammarAccess.getFeature_decl_attributeAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boundary_int__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBoundary_intAccess().getMULTTerminalRuleCall_0()); }
		RULE_MULT
		{ after(grammarAccess.getBoundary_intAccess().getMULTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBoundary_intAccess().getBoundary_valParserRuleCall_1()); }
		ruleBoundary_val
		{ after(grammarAccess.getBoundary_intAccess().getBoundary_valParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_constraintAccess().getGroup_0()); }
		(rule__Feature_decl_constraint__Group_0__0)
		{ after(grammarAccess.getFeature_decl_constraintAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_constraintAccess().getGroup_1()); }
		(rule__Feature_decl_constraint__Group_1__0)
		{ after(grammarAccess.getFeature_decl_constraintAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_constraintAccess().getGroup_2()); }
		(rule__Feature_decl_constraint__Group_2__0)
		{ after(grammarAccess.getFeature_decl_constraintAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getFeature_decl_constraintAccess().getGroup_3()); }
		(rule__Feature_decl_constraint__Group_3__0)
		{ after(grammarAccess.getFeature_decl_constraintAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpAccess().getGroup_0()); }
		(rule__Mexp__Group_0__0)
		{ after(grammarAccess.getMexpAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpAccess().getGroup_1()); }
		(rule__Mexp__Group_1__0)
		{ after(grammarAccess.getMexpAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getMexpAccess().getGroup_2()); }
		(rule__Mexp__Group_2__0)
		{ after(grammarAccess.getMexpAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getMexpAccess().getMexpOr_expParserRuleCall_3()); }
		ruleMexpOr_exp
		{ after(grammarAccess.getMexpAccess().getMexpOr_expParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpImplies_exprAccess().getOpIMPLIESTerminalRuleCall_1_1_0_0()); }
		RULE_IMPLIES
		{ after(grammarAccess.getMexpImplies_exprAccess().getOpIMPLIESTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpImplies_exprAccess().getOpEQUIVTerminalRuleCall_1_1_0_1()); }
		RULE_EQUIV
		{ after(grammarAccess.getMexpImplies_exprAccess().getOpEQUIVTerminalRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpEquality_exprAccess().getOpEQEQTerminalRuleCall_1_1_0_0()); }
		RULE_EQEQ
		{ after(grammarAccess.getMexpEquality_exprAccess().getOpEQEQTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpEquality_exprAccess().getOpNOTEQTerminalRuleCall_1_1_0_1()); }
		RULE_NOTEQ
		{ after(grammarAccess.getMexpEquality_exprAccess().getOpNOTEQTerminalRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpComparison_exprAccess().getOpLTTerminalRuleCall_1_1_0_0()); }
		RULE_LT
		{ after(grammarAccess.getMexpComparison_exprAccess().getOpLTTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpComparison_exprAccess().getOpGTTerminalRuleCall_1_1_0_1()); }
		RULE_GT
		{ after(grammarAccess.getMexpComparison_exprAccess().getOpGTTerminalRuleCall_1_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMexpComparison_exprAccess().getOpLTEQTerminalRuleCall_1_1_0_2()); }
		RULE_LTEQ
		{ after(grammarAccess.getMexpComparison_exprAccess().getOpLTEQTerminalRuleCall_1_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getMexpComparison_exprAccess().getOpGTEQTerminalRuleCall_1_1_0_3()); }
		RULE_GTEQ
		{ after(grammarAccess.getMexpComparison_exprAccess().getOpGTEQTerminalRuleCall_1_1_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); }
		RULE_MINUS
		{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpMULTTerminalRuleCall_1_1_0_0()); }
		RULE_MULT
		{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpMULTTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpSolidusKeyword_1_1_0_1()); }
		'/'
		{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpSolidusKeyword_1_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpMODTerminalRuleCall_1_1_0_2()); }
		RULE_MOD
		{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpMODTerminalRuleCall_1_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpPrimary_exprAccess().getGroup_0()); }
		(rule__MexpPrimary_expr__Group_0__0)
		{ after(grammarAccess.getMexpPrimary_exprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpPrimary_exprAccess().getGroup_1()); }
		(rule__MexpPrimary_expr__Group_1__0)
		{ after(grammarAccess.getMexpPrimary_exprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getMexpPrimary_exprAccess().getMexpAtomic_exprParserRuleCall_2()); }
		ruleMexpAtomic_expr
		{ after(grammarAccess.getMexpPrimary_exprAccess().getMexpAtomic_exprParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpPrimary_exprAccess().getNEGATIONTerminalRuleCall_1_1_0()); }
		RULE_NEGATION
		{ after(grammarAccess.getMexpPrimary_exprAccess().getNEGATIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getMexpPrimary_exprAccess().getMINUSTerminalRuleCall_1_1_1()); }
		RULE_MINUS
		{ after(grammarAccess.getMexpPrimary_exprAccess().getMINUSTerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFextensionAccess().getFeature_decl_attributeAssignment_4_0()); }
		(rule__Fextension__Feature_decl_attributeAssignment_4_0)
		{ after(grammarAccess.getFextensionAccess().getFeature_decl_attributeAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getFextensionAccess().getFeature_decl_constraintAssignment_4_1()); }
		(rule__Fextension__Feature_decl_constraintAssignment_4_1)
		{ after(grammarAccess.getFextensionAccess().getFeature_decl_constraintAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group__0__Impl
	rule__Compilation_Unit__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getCompilation_UnitAction_0()); }
	()
	{ after(grammarAccess.getCompilation_UnitAccess().getCompilation_UnitAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group__1__Impl
	rule__Compilation_Unit__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getModuleAssignment_1()); }
	(rule__Compilation_Unit__ModuleAssignment_1)*
	{ after(grammarAccess.getCompilation_UnitAccess().getModuleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group__2__Impl
	rule__Compilation_Unit__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getDeltaDeclAssignment_2()); }
	(rule__Compilation_Unit__DeltaDeclAssignment_2)*
	{ after(grammarAccess.getCompilation_UnitAccess().getDeltaDeclAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group__3__Impl
	rule__Compilation_Unit__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getUpdate_declAssignment_3()); }
	(rule__Compilation_Unit__Update_declAssignment_3)*
	{ after(grammarAccess.getCompilation_UnitAccess().getUpdate_declAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group__4__Impl
	rule__Compilation_Unit__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getProductline_declAssignment_4()); }
	(rule__Compilation_Unit__Productline_declAssignment_4)?
	{ after(grammarAccess.getCompilation_UnitAccess().getProductline_declAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group__5__Impl
	rule__Compilation_Unit__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getProduct_declAssignment_5()); }
	(rule__Compilation_Unit__Product_declAssignment_5)*
	{ after(grammarAccess.getCompilation_UnitAccess().getProduct_declAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getAlternatives_6()); }
	(rule__Compilation_Unit__Alternatives_6)*
	{ after(grammarAccess.getCompilation_UnitAccess().getAlternatives_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compilation_Unit__Group_6_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group_6_0__0__Impl
	rule__Compilation_Unit__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group_6_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getRootKeyword_6_0_0()); }
	'root'
	{ after(grammarAccess.getCompilation_UnitAccess().getRootKeyword_6_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group_6_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group_6_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group_6_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getFeature_declAssignment_6_0_1()); }
	(rule__Compilation_Unit__Feature_declAssignment_6_0_1)
	{ after(grammarAccess.getCompilation_UnitAccess().getFeature_declAssignment_6_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compilation_Unit__Group_6_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group_6_1__0__Impl
	rule__Compilation_Unit__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group_6_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getExtensionKeyword_6_1_0()); }
	'extension'
	{ after(grammarAccess.getCompilation_UnitAccess().getExtensionKeyword_6_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group_6_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compilation_Unit__Group_6_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Group_6_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompilation_UnitAccess().getFextensionAssignment_6_1_1()); }
	(rule__Compilation_Unit__FextensionAssignment_6_1_1)
	{ after(grammarAccess.getCompilation_UnitAccess().getFextensionAssignment_6_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_decl__Group__0__Impl
	rule__Module_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_declAccess().getModuleKeyword_0()); }
	'module'
	{ after(grammarAccess.getModule_declAccess().getModuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_decl__Group__1__Impl
	rule__Module_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_declAccess().getNameAssignment_1()); }
	(rule__Module_decl__NameAssignment_1)
	{ after(grammarAccess.getModule_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_decl__Group__2__Impl
	rule__Module_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_declAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getModule_declAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_decl__Group__3__Impl
	rule__Module_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_declAccess().getModule_exportAssignment_3()); }
	(rule__Module_decl__Module_exportAssignment_3)*
	{ after(grammarAccess.getModule_declAccess().getModule_exportAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_decl__Group__4__Impl
	rule__Module_decl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_declAccess().getModule_importAssignment_4()); }
	(rule__Module_decl__Module_importAssignment_4)*
	{ after(grammarAccess.getModule_declAccess().getModule_importAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_decl__Group__5__Impl
	rule__Module_decl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_declAccess().getDeclAssignment_5()); }
	(rule__Module_decl__DeclAssignment_5)*
	{ after(grammarAccess.getModule_declAccess().getDeclAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_decl__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_declAccess().getMain_blockAssignment_6()); }
	(rule__Module_decl__Main_blockAssignment_6)?
	{ after(grammarAccess.getModule_declAccess().getMain_blockAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_export__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group__0__Impl
	rule__Module_export__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getModule_exportAction_0()); }
	()
	{ after(grammarAccess.getModule_exportAccess().getModule_exportAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group__1__Impl
	rule__Module_export__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getExportKeyword_1()); }
	'export'
	{ after(grammarAccess.getModule_exportAccess().getExportKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group__2__Impl
	rule__Module_export__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getAlternatives_2()); }
	(rule__Module_export__Alternatives_2)
	{ after(grammarAccess.getModule_exportAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group__3__Impl
	rule__Module_export__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getGroup_3()); }
	(rule__Module_export__Group_3__0)?
	{ after(grammarAccess.getModule_exportAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getModule_exportAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_export__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group_2_1__0__Impl
	rule__Module_export__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getAnyPackageAssignment_2_1_0()); }
	(rule__Module_export__AnyPackageAssignment_2_1_0)
	{ after(grammarAccess.getModule_exportAccess().getAnyPackageAssignment_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getGroup_2_1_1()); }
	(rule__Module_export__Group_2_1_1__0)*
	{ after(grammarAccess.getModule_exportAccess().getGroup_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_export__Group_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group_2_1_1__0__Impl
	rule__Module_export__Group_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getCommaKeyword_2_1_1_0()); }
	','
	{ after(grammarAccess.getModule_exportAccess().getCommaKeyword_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getAnyPackageAssignment_2_1_1_1()); }
	(rule__Module_export__AnyPackageAssignment_2_1_1_1)
	{ after(grammarAccess.getModule_exportAccess().getAnyPackageAssignment_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_export__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group_3__0__Impl
	rule__Module_export__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getFromKeyword_3_0()); }
	'from'
	{ after(grammarAccess.getModule_exportAccess().getFromKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_export__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_exportAccess().getImportedNamespaceAssignment_3_1()); }
	(rule__Module_export__ImportedNamespaceAssignment_3_1)
	{ after(grammarAccess.getModule_exportAccess().getImportedNamespaceAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group__0__Impl
	rule__Module_import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getModule_importAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getAlternatives_1()); }
	(rule__Module_import__Alternatives_1)
	{ after(grammarAccess.getModule_importAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_import__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_0__0__Impl
	rule__Module_import__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getStarAssignment_1_0_0()); }
	(rule__Module_import__StarAssignment_1_0_0)
	{ after(grammarAccess.getModule_importAccess().getStarAssignment_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_0__1__Impl
	rule__Module_import__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getFromKeyword_1_0_1()); }
	'from'
	{ after(grammarAccess.getModule_importAccess().getFromKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_0__2__Impl
	rule__Module_import__Group_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getImportedNamespaceAssignment_1_0_2()); }
	(rule__Module_import__ImportedNamespaceAssignment_1_0_2)
	{ after(grammarAccess.getModule_importAccess().getImportedNamespaceAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getSemicolonKeyword_1_0_3()); }
	';'
	{ after(grammarAccess.getModule_importAccess().getSemicolonKeyword_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_import__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1__0__Impl
	rule__Module_import__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getNameAssignment_1_1_0()); }
	(rule__Module_import__NameAssignment_1_1_0)
	{ after(grammarAccess.getModule_importAccess().getNameAssignment_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1__1__Impl
	rule__Module_import__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getGroup_1_1_1()); }
	(rule__Module_import__Group_1_1_1__0)*
	{ after(grammarAccess.getModule_importAccess().getGroup_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1__2__Impl
	rule__Module_import__Group_1_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getGroup_1_1_2()); }
	(rule__Module_import__Group_1_1_2__0)?
	{ after(grammarAccess.getModule_importAccess().getGroup_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getSemicolonKeyword_1_1_3()); }
	';'
	{ after(grammarAccess.getModule_importAccess().getSemicolonKeyword_1_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_import__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1_1__0__Impl
	rule__Module_import__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getCommaKeyword_1_1_1_0()); }
	','
	{ after(grammarAccess.getModule_importAccess().getCommaKeyword_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getNameAssignment_1_1_1_1()); }
	(rule__Module_import__NameAssignment_1_1_1_1)
	{ after(grammarAccess.getModule_importAccess().getNameAssignment_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module_import__Group_1_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1_2__0__Impl
	rule__Module_import__Group_1_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getFromKeyword_1_1_2_0()); }
	'from'
	{ after(grammarAccess.getModule_importAccess().getFromKeyword_1_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module_import__Group_1_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__Group_1_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModule_importAccess().getImportedNamespaceAssignment_1_1_2_1()); }
	(rule__Module_import__ImportedNamespaceAssignment_1_1_2_1)
	{ after(grammarAccess.getModule_importAccess().getImportedNamespaceAssignment_1_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Par_function_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__0__Impl
	rule__Par_function_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getDefKeyword_0()); }
	'def'
	{ after(grammarAccess.getPar_function_declAccess().getDefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__1__Impl
	rule__Par_function_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getType_useAssignment_1()); }
	(rule__Par_function_decl__Type_useAssignment_1)
	{ after(grammarAccess.getPar_function_declAccess().getType_useAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__2__Impl
	rule__Par_function_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getNameAssignment_2()); }
	(rule__Par_function_decl__NameAssignment_2)
	{ after(grammarAccess.getPar_function_declAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__3__Impl
	rule__Par_function_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getGroup_3()); }
	(rule__Par_function_decl__Group_3__0)?
	{ after(grammarAccess.getPar_function_declAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__4__Impl
	rule__Par_function_decl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getPar_function_declAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__5__Impl
	rule__Par_function_decl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getFunctionsAssignment_5()); }
	(rule__Par_function_decl__FunctionsAssignment_5)
	{ after(grammarAccess.getPar_function_declAccess().getFunctionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__6__Impl
	rule__Par_function_decl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getPar_function_declAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__7__Impl
	rule__Par_function_decl__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getParamsAssignment_7()); }
	(rule__Par_function_decl__ParamsAssignment_7)
	{ after(grammarAccess.getPar_function_declAccess().getParamsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__8__Impl
	rule__Par_function_decl__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getEqualsSignKeyword_8()); }
	'='
	{ after(grammarAccess.getPar_function_declAccess().getEqualsSignKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__9__Impl
	rule__Par_function_decl__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getEAssignment_9()); }
	(rule__Par_function_decl__EAssignment_9)
	{ after(grammarAccess.getPar_function_declAccess().getEAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getPar_function_declAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Par_function_decl__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group_3__0__Impl
	rule__Par_function_decl__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getLTTerminalRuleCall_3_0()); }
	RULE_LT
	{ after(grammarAccess.getPar_function_declAccess().getLTTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group_3__1__Impl
	rule__Par_function_decl__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getPAssignment_3_1()); }
	(rule__Par_function_decl__PAssignment_3_1)
	{ after(grammarAccess.getPar_function_declAccess().getPAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group_3__2__Impl
	rule__Par_function_decl__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getGroup_3_2()); }
	(rule__Par_function_decl__Group_3_2__0)*
	{ after(grammarAccess.getPar_function_declAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getGTTerminalRuleCall_3_3()); }
	RULE_GT
	{ after(grammarAccess.getPar_function_declAccess().getGTTerminalRuleCall_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Par_function_decl__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group_3_2__0__Impl
	rule__Par_function_decl__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getCommaKeyword_3_2_0()); }
	','
	{ after(grammarAccess.getPar_function_declAccess().getCommaKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Par_function_decl__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPar_function_declAccess().getPAssignment_3_2_1()); }
	(rule__Par_function_decl__PAssignment_3_2_1)
	{ after(grammarAccess.getPar_function_declAccess().getPAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_name_list__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_name_list__Group__0__Impl
	rule__Function_name_list__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_name_listAccess().getFunction_name_listAction_0()); }
	()
	{ after(grammarAccess.getFunction_name_listAccess().getFunction_name_listAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_name_list__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_name_listAccess().getGroup_1()); }
	(rule__Function_name_list__Group_1__0)?
	{ after(grammarAccess.getFunction_name_listAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_name_list__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_name_list__Group_1__0__Impl
	rule__Function_name_list__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_name_listAccess().getFunction_name_declAssignment_1_0()); }
	(rule__Function_name_list__Function_name_declAssignment_1_0)
	{ after(grammarAccess.getFunction_name_listAccess().getFunction_name_declAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_name_list__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_name_listAccess().getGroup_1_1()); }
	(rule__Function_name_list__Group_1_1__0)*
	{ after(grammarAccess.getFunction_name_listAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_name_list__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_name_list__Group_1_1__0__Impl
	rule__Function_name_list__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_name_listAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getFunction_name_listAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_name_list__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_name_listAccess().getFunction_name_declAssignment_1_1_1()); }
	(rule__Function_name_list__Function_name_declAssignment_1_1_1)
	{ after(grammarAccess.getFunction_name_listAccess().getFunction_name_declAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group__0__Impl
	rule__DataType_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getDataKeyword_0()); }
	'data'
	{ after(grammarAccess.getDataType_declAccess().getDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group__1__Impl
	rule__DataType_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getNameAssignment_1()); }
	(rule__DataType_decl__NameAssignment_1)
	{ after(grammarAccess.getDataType_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group__2__Impl
	rule__DataType_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getGroup_2()); }
	(rule__DataType_decl__Group_2__0)?
	{ after(grammarAccess.getDataType_declAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group__3__Impl
	rule__DataType_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getGroup_3()); }
	(rule__DataType_decl__Group_3__0)?
	{ after(grammarAccess.getDataType_declAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getDataType_declAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType_decl__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_2__0__Impl
	rule__DataType_decl__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getLTTerminalRuleCall_2_0()); }
	RULE_LT
	{ after(grammarAccess.getDataType_declAccess().getLTTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_2__1__Impl
	rule__DataType_decl__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getPAssignment_2_1()); }
	(rule__DataType_decl__PAssignment_2_1)
	{ after(grammarAccess.getDataType_declAccess().getPAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_2__2__Impl
	rule__DataType_decl__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getGroup_2_2()); }
	(rule__DataType_decl__Group_2_2__0)*
	{ after(grammarAccess.getDataType_declAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getGTTerminalRuleCall_2_3()); }
	RULE_GT
	{ after(grammarAccess.getDataType_declAccess().getGTTerminalRuleCall_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType_decl__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_2_2__0__Impl
	rule__DataType_decl__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getDataType_declAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getPAssignment_2_2_1()); }
	(rule__DataType_decl__PAssignment_2_2_1)
	{ after(grammarAccess.getDataType_declAccess().getPAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType_decl__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_3__0__Impl
	rule__DataType_decl__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getEqualsSignKeyword_3_0()); }
	'='
	{ after(grammarAccess.getDataType_declAccess().getEqualsSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_3__1__Impl
	rule__DataType_decl__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getData_constructorAssignment_3_1()); }
	(rule__DataType_decl__Data_constructorAssignment_3_1)
	{ after(grammarAccess.getDataType_declAccess().getData_constructorAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getGroup_3_2()); }
	(rule__DataType_decl__Group_3_2__0)*
	{ after(grammarAccess.getDataType_declAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType_decl__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_3_2__0__Impl
	rule__DataType_decl__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getVerticalLineKeyword_3_2_0()); }
	'|'
	{ after(grammarAccess.getDataType_declAccess().getVerticalLineKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType_decl__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataType_declAccess().getData_constructorAssignment_3_2_1()); }
	(rule__DataType_decl__Data_constructorAssignment_3_2_1)
	{ after(grammarAccess.getDataType_declAccess().getData_constructorAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Data_constructor__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group__0__Impl
	rule__Data_constructor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getNameAssignment_0()); }
	(rule__Data_constructor__NameAssignment_0)
	{ after(grammarAccess.getData_constructorAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getGroup_1()); }
	(rule__Data_constructor__Group_1__0)?
	{ after(grammarAccess.getData_constructorAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Data_constructor__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group_1__0__Impl
	rule__Data_constructor__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getData_constructorAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group_1__1__Impl
	rule__Data_constructor__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getData_constructor_argAssignment_1_1()); }
	(rule__Data_constructor__Data_constructor_argAssignment_1_1)
	{ after(grammarAccess.getData_constructorAccess().getData_constructor_argAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group_1__2__Impl
	rule__Data_constructor__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getGroup_1_2()); }
	(rule__Data_constructor__Group_1_2__0)*
	{ after(grammarAccess.getData_constructorAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getData_constructorAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Data_constructor__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group_1_2__0__Impl
	rule__Data_constructor__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getCommaKeyword_1_2_0()); }
	','
	{ after(grammarAccess.getData_constructorAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructorAccess().getData_constructor_argAssignment_1_2_1()); }
	(rule__Data_constructor__Data_constructor_argAssignment_1_2_1)
	{ after(grammarAccess.getData_constructorAccess().getData_constructor_argAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Data_constructor_arg__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor_arg__Group__0__Impl
	rule__Data_constructor_arg__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor_arg__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructor_argAccess().getType_useParserRuleCall_0()); }
	ruleType_use
	{ after(grammarAccess.getData_constructor_argAccess().getType_useParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor_arg__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data_constructor_arg__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor_arg__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getData_constructor_argAccess().getIDTerminalRuleCall_1()); }
	(RULE_ID)?
	{ after(grammarAccess.getData_constructor_argAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getGroup_0()); }
	(rule__Annotation__Group_0__0)?
	{ after(grammarAccess.getAnnotationAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getPure_expAssignment_1()); }
	(rule__Annotation__Pure_expAssignment_1)
	{ after(grammarAccess.getAnnotationAccess().getPure_expAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_0__0__Impl
	rule__Annotation__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getType_useParserRuleCall_0_0()); }
	ruleType_use
	{ after(grammarAccess.getAnnotationAccess().getType_useParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getColonKeyword_0_1()); }
	':'
	{ after(grammarAccess.getAnnotationAccess().getColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type_use__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group__0__Impl
	rule__Type_use__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getNameAssignment_0()); }
	(rule__Type_use__NameAssignment_0)
	{ after(grammarAccess.getType_useAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getGroup_1()); }
	(rule__Type_use__Group_1__0)?
	{ after(grammarAccess.getType_useAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type_use__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group_1__0__Impl
	rule__Type_use__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getLTTerminalRuleCall_1_0()); }
	RULE_LT
	{ after(grammarAccess.getType_useAccess().getLTTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group_1__1__Impl
	rule__Type_use__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getType_useAssignment_1_1()); }
	(rule__Type_use__Type_useAssignment_1_1)
	{ after(grammarAccess.getType_useAccess().getType_useAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group_1__2__Impl
	rule__Type_use__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getGroup_1_2()); }
	(rule__Type_use__Group_1_2__0)*
	{ after(grammarAccess.getType_useAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getGTTerminalRuleCall_1_3()); }
	RULE_GT
	{ after(grammarAccess.getType_useAccess().getGTTerminalRuleCall_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type_use__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group_1_2__0__Impl
	rule__Type_use__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getCommaKeyword_1_2_0()); }
	','
	{ after(grammarAccess.getType_useAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_use__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_useAccess().getType_useAssignment_1_2_1()); }
	(rule__Type_use__Type_useAssignment_1_2_1)
	{ after(grammarAccess.getType_useAccess().getType_useAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_0__0__Impl
	rule__Pure_exp__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_0_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_0__1__Impl
	rule__Pure_exp__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_0__2__Impl
	rule__Pure_exp__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getPure_exp_listAssignment_0_2()); }
	(rule__Pure_exp__Pure_exp_listAssignment_0_2)
	{ after(grammarAccess.getPure_expAccess().getPure_exp_listAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_1__0__Impl
	rule__Pure_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_1_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_1__1__Impl
	rule__Pure_exp__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_1_1()); }
	'('
	{ after(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_1__2__Impl
	rule__Pure_exp__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getFunction_listAssignment_1_2()); }
	(rule__Pure_exp__Function_listAssignment_1_2)
	{ after(grammarAccess.getPure_expAccess().getFunction_listAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_1__3__Impl
	rule__Pure_exp__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_1__4__Impl
	rule__Pure_exp__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_1_4()); }
	'('
	{ after(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_1__5__Impl
	rule__Pure_exp__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getPartial_function_pure_exp_listAssignment_1_5()); }
	(rule__Pure_exp__Partial_function_pure_exp_listAssignment_1_5)
	{ after(grammarAccess.getPure_expAccess().getPartial_function_pure_exp_listAssignment_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_1__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_1_6()); }
	')'
	{ after(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_2__0__Impl
	rule__Pure_exp__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_2_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_2__1__Impl
	rule__Pure_exp__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getLeftSquareBracketKeyword_2_1()); }
	'['
	{ after(grammarAccess.getPure_expAccess().getLeftSquareBracketKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_2__2__Impl
	rule__Pure_exp__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getVariadic_exp_listAssignment_2_2()); }
	(rule__Pure_exp__Variadic_exp_listAssignment_2_2)
	{ after(grammarAccess.getPure_expAccess().getVariadic_exp_listAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getRightSquareBracketKeyword_2_3()); }
	']'
	{ after(grammarAccess.getPure_expAccess().getRightSquareBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_4__0__Impl
	rule__Pure_exp__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getIfKeyword_4_0()); }
	'if'
	{ after(grammarAccess.getPure_expAccess().getIfKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_4__1__Impl
	rule__Pure_exp__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getIfAssignment_4_1()); }
	(rule__Pure_exp__IfAssignment_4_1)
	{ after(grammarAccess.getPure_expAccess().getIfAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_4__2__Impl
	rule__Pure_exp__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getThenKeyword_4_2()); }
	'then'
	{ after(grammarAccess.getPure_expAccess().getThenKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_4__3__Impl
	rule__Pure_exp__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getThenAssignment_4_3()); }
	(rule__Pure_exp__ThenAssignment_4_3)
	{ after(grammarAccess.getPure_expAccess().getThenAssignment_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getGroup_4_4()); }
	(rule__Pure_exp__Group_4_4__0)?
	{ after(grammarAccess.getPure_expAccess().getGroup_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp__Group_4_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_4_4__0__Impl
	rule__Pure_exp__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getElseKeyword_4_4_0()); }
	('else')
	{ after(grammarAccess.getPure_expAccess().getElseKeyword_4_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_4_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_4_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getElseAssignment_4_4_1()); }
	(rule__Pure_exp__ElseAssignment_4_4_1)
	{ after(grammarAccess.getPure_expAccess().getElseAssignment_4_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_5__0__Impl
	rule__Pure_exp__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getCaseKeyword_5_0()); }
	'case'
	{ after(grammarAccess.getPure_expAccess().getCaseKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_5__1__Impl
	rule__Pure_exp__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getCaseAssignment_5_1()); }
	(rule__Pure_exp__CaseAssignment_5_1)
	{ after(grammarAccess.getPure_expAccess().getCaseAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_5__2__Impl
	rule__Pure_exp__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getLeftCurlyBracketKeyword_5_2()); }
	'{'
	{ after(grammarAccess.getPure_expAccess().getLeftCurlyBracketKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_5__3__Impl
	rule__Pure_exp__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getCasebranchAssignment_5_3()); }
	(rule__Pure_exp__CasebranchAssignment_5_3)*
	{ after(grammarAccess.getPure_expAccess().getCasebranchAssignment_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getPure_expAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__0__Impl
	rule__Pure_exp__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getLetKeyword_6_0()); }
	'let'
	{ after(grammarAccess.getPure_expAccess().getLetKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__1__Impl
	rule__Pure_exp__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_6_1()); }
	'('
	{ after(grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__2__Impl
	rule__Pure_exp__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getType_useAssignment_6_2()); }
	(rule__Pure_exp__Type_useAssignment_6_2)
	{ after(grammarAccess.getPure_expAccess().getType_useAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__3__Impl
	rule__Pure_exp__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getValueAssignment_6_3()); }
	(rule__Pure_exp__ValueAssignment_6_3)
	{ after(grammarAccess.getPure_expAccess().getValueAssignment_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__4__Impl
	rule__Pure_exp__Group_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_6_4()); }
	')'
	{ after(grammarAccess.getPure_expAccess().getRightParenthesisKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__5__Impl
	rule__Pure_exp__Group_6__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getEqualsSignKeyword_6_5()); }
	'='
	{ after(grammarAccess.getPure_expAccess().getEqualsSignKeyword_6_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__6__Impl
	rule__Pure_exp__Group_6__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getIAssignment_6_6()); }
	(rule__Pure_exp__IAssignment_6_6)
	{ after(grammarAccess.getPure_expAccess().getIAssignment_6_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__7__Impl
	rule__Pure_exp__Group_6__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getInKeyword_6_7()); }
	'in'
	{ after(grammarAccess.getPure_expAccess().getInKeyword_6_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp__Group_6__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Group_6__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_expAccess().getBAssignment_6_8()); }
	(rule__Pure_exp__BAssignment_6_8)
	{ after(grammarAccess.getPure_expAccess().getBAssignment_6_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Or_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or_expr__Group__0__Impl
	rule__Or_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0()); }
	ruleAnd_expr
	{ after(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOr_exprAccess().getGroup_1()); }
	(rule__Or_expr__Group_1__0)*
	{ after(grammarAccess.getOr_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Or_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or_expr__Group_1__0__Impl
	rule__Or_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or_expr__Group_1__1__Impl
	rule__Or_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOr_exprAccess().getOpAssignment_1_1()); }
	(rule__Or_expr__OpAssignment_1_1)
	{ after(grammarAccess.getOr_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOr_exprAccess().getRightAssignment_1_2()); }
	(rule__Or_expr__RightAssignment_1_2)
	{ after(grammarAccess.getOr_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__And_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And_expr__Group__0__Impl
	rule__And_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnd_exprAccess().getEquality_exprParserRuleCall_0()); }
	ruleEquality_expr
	{ after(grammarAccess.getAnd_exprAccess().getEquality_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnd_exprAccess().getGroup_1()); }
	(rule__And_expr__Group_1__0)*
	{ after(grammarAccess.getAnd_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__And_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And_expr__Group_1__0__Impl
	rule__And_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And_expr__Group_1__1__Impl
	rule__And_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnd_exprAccess().getOpAssignment_1_1()); }
	(rule__And_expr__OpAssignment_1_1)
	{ after(grammarAccess.getAnd_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnd_exprAccess().getRightAssignment_1_2()); }
	(rule__And_expr__RightAssignment_1_2)
	{ after(grammarAccess.getAnd_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Equality_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality_expr__Group__0__Impl
	rule__Equality_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquality_exprAccess().getComparison_exprParserRuleCall_0()); }
	ruleComparison_expr
	{ after(grammarAccess.getEquality_exprAccess().getComparison_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquality_exprAccess().getGroup_1()); }
	(rule__Equality_expr__Group_1__0)*
	{ after(grammarAccess.getEquality_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Equality_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality_expr__Group_1__0__Impl
	rule__Equality_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquality_exprAccess().getEquality_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getEquality_exprAccess().getEquality_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality_expr__Group_1__1__Impl
	rule__Equality_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquality_exprAccess().getOpAssignment_1_1()); }
	(rule__Equality_expr__OpAssignment_1_1)
	{ after(grammarAccess.getEquality_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquality_exprAccess().getRightAssignment_1_2()); }
	(rule__Equality_expr__RightAssignment_1_2)
	{ after(grammarAccess.getEquality_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparison_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison_expr__Group__0__Impl
	rule__Comparison_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparison_exprAccess().getPlusOrMinus_exprParserRuleCall_0()); }
	rulePlusOrMinus_expr
	{ after(grammarAccess.getComparison_exprAccess().getPlusOrMinus_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparison_exprAccess().getGroup_1()); }
	(rule__Comparison_expr__Group_1__0)*
	{ after(grammarAccess.getComparison_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparison_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison_expr__Group_1__0__Impl
	rule__Comparison_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparison_exprAccess().getComparison_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getComparison_exprAccess().getComparison_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison_expr__Group_1__1__Impl
	rule__Comparison_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparison_exprAccess().getOpAssignment_1_1()); }
	(rule__Comparison_expr__OpAssignment_1_1)
	{ after(grammarAccess.getComparison_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparison_exprAccess().getRightAssignment_1_2()); }
	(rule__Comparison_expr__RightAssignment_1_2)
	{ after(grammarAccess.getComparison_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus_expr__Group__0__Impl
	rule__PlusOrMinus_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinus_exprAccess().getMulDivOrMod_exprParserRuleCall_0()); }
	ruleMulDivOrMod_expr
	{ after(grammarAccess.getPlusOrMinus_exprAccess().getMulDivOrMod_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinus_exprAccess().getGroup_1()); }
	(rule__PlusOrMinus_expr__Group_1__0)*
	{ after(grammarAccess.getPlusOrMinus_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus_expr__Group_1__0__Impl
	rule__PlusOrMinus_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinus_exprAccess().getPlusOrMinus_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getPlusOrMinus_exprAccess().getPlusOrMinus_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus_expr__Group_1__1__Impl
	rule__PlusOrMinus_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinus_exprAccess().getOpAssignment_1_1()); }
	(rule__PlusOrMinus_expr__OpAssignment_1_1)
	{ after(grammarAccess.getPlusOrMinus_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinus_exprAccess().getRightAssignment_1_2()); }
	(rule__PlusOrMinus_expr__RightAssignment_1_2)
	{ after(grammarAccess.getPlusOrMinus_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulDivOrMod_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulDivOrMod_expr__Group__0__Impl
	rule__MulDivOrMod_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulDivOrMod_exprAccess().getPrimary_exprParserRuleCall_0()); }
	rulePrimary_expr
	{ after(grammarAccess.getMulDivOrMod_exprAccess().getPrimary_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulDivOrMod_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulDivOrMod_exprAccess().getGroup_1()); }
	(rule__MulDivOrMod_expr__Group_1__0)*
	{ after(grammarAccess.getMulDivOrMod_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulDivOrMod_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulDivOrMod_expr__Group_1__0__Impl
	rule__MulDivOrMod_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulDivOrMod_exprAccess().getMulDivOrMod_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMulDivOrMod_exprAccess().getMulDivOrMod_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulDivOrMod_expr__Group_1__1__Impl
	rule__MulDivOrMod_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulDivOrMod_exprAccess().getOpAssignment_1_1()); }
	(rule__MulDivOrMod_expr__OpAssignment_1_1)
	{ after(grammarAccess.getMulDivOrMod_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulDivOrMod_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulDivOrMod_exprAccess().getRightAssignment_1_2()); }
	(rule__MulDivOrMod_expr__RightAssignment_1_2)
	{ after(grammarAccess.getMulDivOrMod_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Uniary_expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Uniary_expr__Group_0__0__Impl
	rule__Uniary_expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Uniary_expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUniary_exprAccess().getOpAssignment_0_0()); }
	(rule__Uniary_expr__OpAssignment_0_0)
	{ after(grammarAccess.getUniary_exprAccess().getOpAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Uniary_expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Uniary_expr__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Uniary_expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUniary_exprAccess().getPure_expAssignment_0_1()); }
	(rule__Uniary_expr__Pure_expAssignment_0_1)
	{ after(grammarAccess.getUniary_exprAccess().getPure_expAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary_expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary_expr__Group_0__0__Impl
	rule__Primary_expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary_expr__Group_0__1__Impl
	rule__Primary_expr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimary_exprAccess().getPure_expParserRuleCall_0_1()); }
	rulePure_exp
	{ after(grammarAccess.getPrimary_exprAccess().getPure_expParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_expr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary_expr__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_expr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic_expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_0__0__Impl
	rule__Atomic_expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getPure_expAction_0_0()); }
	()
	{ after(grammarAccess.getAtomic_exprAccess().getPure_expAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getINTTerminalRuleCall_0_1()); }
	RULE_INT
	{ after(grammarAccess.getAtomic_exprAccess().getINTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_1__0__Impl
	rule__Atomic_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getPure_expAction_1_0()); }
	()
	{ after(grammarAccess.getAtomic_exprAccess().getPure_expAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getSTRINGLITERALTerminalRuleCall_1_1()); }
	RULE_STRINGLITERAL
	{ after(grammarAccess.getAtomic_exprAccess().getSTRINGLITERALTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic_expr__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_3__0__Impl
	rule__Atomic_expr__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getPure_expAction_3_0()); }
	()
	{ after(grammarAccess.getAtomic_exprAccess().getPure_expAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getThisKeyword_3_1()); }
	'this'
	{ after(grammarAccess.getAtomic_exprAccess().getThisKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic_expr__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_4__0__Impl
	rule__Atomic_expr__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getPure_expAction_4_0()); }
	()
	{ after(grammarAccess.getAtomic_exprAccess().getPure_expAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getNullKeyword_4_1()); }
	'null'
	{ after(grammarAccess.getAtomic_exprAccess().getNullKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic_expr__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_5__0__Impl
	rule__Atomic_expr__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getPure_expAction_5_0()); }
	()
	{ after(grammarAccess.getAtomic_exprAccess().getPure_expAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic_expr__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic_expr__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomic_exprAccess().getSTRINGTerminalRuleCall_5_1()); }
	RULE_STRING
	{ after(grammarAccess.getAtomic_exprAccess().getSTRINGTerminalRuleCall_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var_or_field_ref__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_or_field_ref__Group_0__0__Impl
	rule__Var_or_field_ref__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_or_field_refAccess().getGroup_0_0()); }
	(rule__Var_or_field_ref__Group_0_0__0)?
	{ after(grammarAccess.getVar_or_field_refAccess().getGroup_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_or_field_ref__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_or_field_refAccess().getNameAssignment_0_1()); }
	(rule__Var_or_field_ref__NameAssignment_0_1)
	{ after(grammarAccess.getVar_or_field_refAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var_or_field_ref__Group_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_or_field_ref__Group_0_0__0__Impl
	rule__Var_or_field_ref__Group_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__Group_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_or_field_refAccess().getThisKeyword_0_0_0()); }
	'this'
	{ after(grammarAccess.getVar_or_field_refAccess().getThisKeyword_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__Group_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_or_field_ref__Group_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__Group_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_or_field_refAccess().getFullStopKeyword_0_0_1()); }
	'.'
	{ after(grammarAccess.getVar_or_field_refAccess().getFullStopKeyword_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Case_branch__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case_branch__Group__0__Impl
	rule__Case_branch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCase_branchAccess().getPatternParserRuleCall_0()); }
	rulePattern
	{ after(grammarAccess.getCase_branchAccess().getPatternParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case_branch__Group__1__Impl
	rule__Case_branch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCase_branchAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getCase_branchAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case_branch__Group__2__Impl
	rule__Case_branch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCase_branchAccess().getPure_expAssignment_2()); }
	(rule__Case_branch__Pure_expAssignment_2)
	{ after(grammarAccess.getCase_branchAccess().getPure_expAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Case_branch__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCase_branchAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getCase_branchAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group__0__Impl
	rule__Pattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getPatternAction_0()); }
	()
	{ after(grammarAccess.getPatternAccess().getPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getAlternatives_1()); }
	(rule__Pattern__Alternatives_1)
	{ after(grammarAccess.getPatternAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_1_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4__0__Impl
	rule__Pattern__Group_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getQualifiedNameParserRuleCall_1_4_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getPatternAccess().getQualifiedNameParserRuleCall_1_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_1_4_1()); }
	(rule__Pattern__Group_1_4_1__0)
	{ after(grammarAccess.getPatternAccess().getGroup_1_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_1_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4_1__0__Impl
	rule__Pattern__Group_1_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1_4_1_0()); }
	'('
	{ after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4_1__1__Impl
	rule__Pattern__Group_1_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_1_4_1_1()); }
	(rule__Pattern__Group_1_4_1_1__0)?
	{ after(grammarAccess.getPatternAccess().getGroup_1_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_1_4_1_2()); }
	')'
	{ after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_1_4_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_1_4_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4_1_1__0__Impl
	rule__Pattern__Group_1_4_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getPatternAssignment_1_4_1_1_0()); }
	(rule__Pattern__PatternAssignment_1_4_1_1_0)
	{ after(grammarAccess.getPatternAccess().getPatternAssignment_1_4_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_1_4_1_1_1()); }
	(rule__Pattern__Group_1_4_1_1_1__0)*
	{ after(grammarAccess.getPatternAccess().getGroup_1_4_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_1_4_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4_1_1_1__0__Impl
	rule__Pattern__Group_1_4_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getCommaKeyword_1_4_1_1_1_0()); }
	','
	{ after(grammarAccess.getPatternAccess().getCommaKeyword_1_4_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_1_4_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_1_4_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getPatternAssignment_1_4_1_1_1_1()); }
	(rule__Pattern__PatternAssignment_1_4_1_1_1_1)
	{ after(grammarAccess.getPatternAccess().getPatternAssignment_1_4_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp_list__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp_list__Group__0__Impl
	rule__Pure_exp_list__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_exp_listAccess().getPure_exp_listAction_0()); }
	()
	{ after(grammarAccess.getPure_exp_listAccess().getPure_exp_listAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp_list__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_exp_listAccess().getGroup_1()); }
	(rule__Pure_exp_list__Group_1__0)?
	{ after(grammarAccess.getPure_exp_listAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp_list__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp_list__Group_1__0__Impl
	rule__Pure_exp_list__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_exp_listAccess().getPure_expAssignment_1_0()); }
	(rule__Pure_exp_list__Pure_expAssignment_1_0)
	{ after(grammarAccess.getPure_exp_listAccess().getPure_expAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp_list__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_exp_listAccess().getGroup_1_1()); }
	(rule__Pure_exp_list__Group_1_1__0)*
	{ after(grammarAccess.getPure_exp_listAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pure_exp_list__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp_list__Group_1_1__0__Impl
	rule__Pure_exp_list__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_exp_listAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getPure_exp_listAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pure_exp_list__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPure_exp_listAccess().getPure_expAssignment_1_1_1()); }
	(rule__Pure_exp_list__Pure_expAssignment_1_1_1)
	{ after(grammarAccess.getPure_exp_listAccess().getPure_expAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_list__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_list__Group__0__Impl
	rule__Function_list__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_listAccess().getFunction_listAction_0()); }
	()
	{ after(grammarAccess.getFunction_listAccess().getFunction_listAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_list__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_listAccess().getGroup_1()); }
	(rule__Function_list__Group_1__0)?
	{ after(grammarAccess.getFunction_listAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_list__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_list__Group_1__0__Impl
	rule__Function_list__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_listAccess().getFunction_paramAssignment_1_0()); }
	(rule__Function_list__Function_paramAssignment_1_0)
	{ after(grammarAccess.getFunction_listAccess().getFunction_paramAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_list__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_listAccess().getGroup_1_1()); }
	(rule__Function_list__Group_1_1__0)*
	{ after(grammarAccess.getFunction_listAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_list__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_list__Group_1_1__0__Impl
	rule__Function_list__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_listAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getFunction_listAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_list__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_listAccess().getFunction_paramAssignment_1_1_1()); }
	(rule__Function_list__Function_paramAssignment_1_1_1)
	{ after(grammarAccess.getFunction_listAccess().getFunction_paramAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Anon_function_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Anon_function_decl__Group__0__Impl
	rule__Anon_function_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Anon_function_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnon_function_declAccess().getParamsAssignment_0()); }
	(rule__Anon_function_decl__ParamsAssignment_0)
	{ after(grammarAccess.getAnon_function_declAccess().getParamsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Anon_function_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Anon_function_decl__Group__1__Impl
	rule__Anon_function_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Anon_function_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnon_function_declAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getAnon_function_declAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Anon_function_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Anon_function_decl__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Anon_function_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnon_function_declAccess().getPure_expAssignment_2()); }
	(rule__Anon_function_decl__Pure_expAssignment_2)
	{ after(grammarAccess.getAnon_function_declAccess().getPure_expAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Param_list__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group__0__Impl
	rule__Param_list__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getParam_listAction_0()); }
	()
	{ after(grammarAccess.getParam_listAccess().getParam_listAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group__1__Impl
	rule__Param_list__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getParam_listAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group__2__Impl
	rule__Param_list__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getGroup_2()); }
	(rule__Param_list__Group_2__0)?
	{ after(grammarAccess.getParam_listAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getParam_listAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Param_list__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group_2__0__Impl
	rule__Param_list__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getParam_declAssignment_2_0()); }
	(rule__Param_list__Param_declAssignment_2_0)
	{ after(grammarAccess.getParam_listAccess().getParam_declAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getGroup_2_1()); }
	(rule__Param_list__Group_2_1__0)*
	{ after(grammarAccess.getParam_listAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Param_list__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group_2_1__0__Impl
	rule__Param_list__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getParam_listAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_list__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_listAccess().getParam_declAssignment_2_1_1()); }
	(rule__Param_list__Param_declAssignment_2_1_1)
	{ after(grammarAccess.getParam_listAccess().getParam_declAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Param_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_decl__Group__0__Impl
	rule__Param_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_declAccess().getType_expAssignment_0()); }
	(rule__Param_decl__Type_expAssignment_0)
	{ after(grammarAccess.getParam_declAccess().getType_expAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param_decl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParam_declAccess().getNameAssignment_1()); }
	(rule__Param_decl__NameAssignment_1)
	{ after(grammarAccess.getParam_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type_exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group__0__Impl
	rule__Type_exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getNameAssignment_0()); }
	(rule__Type_exp__NameAssignment_0)
	{ after(grammarAccess.getType_expAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getGroup_1()); }
	(rule__Type_exp__Group_1__0)?
	{ after(grammarAccess.getType_expAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group_1__0__Impl
	rule__Type_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getLTTerminalRuleCall_1_0()); }
	RULE_LT
	{ after(grammarAccess.getType_expAccess().getLTTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group_1__1__Impl
	rule__Type_exp__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getPAssignment_1_1()); }
	(rule__Type_exp__PAssignment_1_1)
	{ after(grammarAccess.getType_expAccess().getPAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group_1__2__Impl
	rule__Type_exp__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getGroup_1_2()); }
	(rule__Type_exp__Group_1_2__0)*
	{ after(grammarAccess.getType_expAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getGTTerminalRuleCall_1_3()); }
	RULE_GT
	{ after(grammarAccess.getType_expAccess().getGTTerminalRuleCall_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type_exp__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group_1_2__0__Impl
	rule__Type_exp__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getCommaKeyword_1_2_0()); }
	','
	{ after(grammarAccess.getType_expAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type_exp__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getType_expAccess().getPAssignment_1_2_1()); }
	(rule__Type_exp__PAssignment_1_2_1)
	{ after(grammarAccess.getType_expAccess().getPAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__0__Impl
	rule__Function_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getDefKeyword_0()); }
	'def'
	{ after(grammarAccess.getFunction_declAccess().getDefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__1__Impl
	rule__Function_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getType_useAssignment_1()); }
	(rule__Function_decl__Type_useAssignment_1)
	{ after(grammarAccess.getFunction_declAccess().getType_useAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__2__Impl
	rule__Function_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getNameAssignment_2()); }
	(rule__Function_decl__NameAssignment_2)
	{ after(grammarAccess.getFunction_declAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__3__Impl
	rule__Function_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getGroup_3()); }
	(rule__Function_decl__Group_3__0)?
	{ after(grammarAccess.getFunction_declAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__4__Impl
	rule__Function_decl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getParamlistAssignment_4()); }
	(rule__Function_decl__ParamlistAssignment_4)
	{ after(grammarAccess.getFunction_declAccess().getParamlistAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__5__Impl
	rule__Function_decl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getEqualsSignKeyword_5()); }
	'='
	{ after(grammarAccess.getFunction_declAccess().getEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__6__Impl
	rule__Function_decl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getAlternatives_6()); }
	(rule__Function_decl__Alternatives_6)
	{ after(grammarAccess.getFunction_declAccess().getAlternatives_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getFunction_declAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_decl__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group_3__0__Impl
	rule__Function_decl__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getLTTerminalRuleCall_3_0()); }
	RULE_LT
	{ after(grammarAccess.getFunction_declAccess().getLTTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group_3__1__Impl
	rule__Function_decl__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getPAssignment_3_1()); }
	(rule__Function_decl__PAssignment_3_1)
	{ after(grammarAccess.getFunction_declAccess().getPAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group_3__2__Impl
	rule__Function_decl__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getGroup_3_2()); }
	(rule__Function_decl__Group_3_2__0)*
	{ after(grammarAccess.getFunction_declAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getGTTerminalRuleCall_3_3()); }
	RULE_GT
	{ after(grammarAccess.getFunction_declAccess().getGTTerminalRuleCall_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function_decl__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group_3_2__0__Impl
	rule__Function_decl__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getCommaKeyword_3_2_0()); }
	','
	{ after(grammarAccess.getFunction_declAccess().getCommaKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function_decl__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunction_declAccess().getPAssignment_3_2_1()); }
	(rule__Function_decl__PAssignment_3_2_1)
	{ after(grammarAccess.getFunction_declAccess().getPAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Typesyn_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typesyn_decl__Group__0__Impl
	rule__Typesyn_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypesyn_declAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getTypesyn_declAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typesyn_decl__Group__1__Impl
	rule__Typesyn_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypesyn_declAccess().getNameAssignment_1()); }
	(rule__Typesyn_decl__NameAssignment_1)
	{ after(grammarAccess.getTypesyn_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typesyn_decl__Group__2__Impl
	rule__Typesyn_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypesyn_declAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getTypesyn_declAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typesyn_decl__Group__3__Impl
	rule__Typesyn_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypesyn_declAccess().getType_useAssignment_3()); }
	(rule__Typesyn_decl__Type_useAssignment_3)
	{ after(grammarAccess.getTypesyn_declAccess().getType_useAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typesyn_decl__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypesyn_declAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getTypesyn_declAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exception_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group__0__Impl
	rule__Exception_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getExceptionKeyword_0()); }
	'exception'
	{ after(grammarAccess.getException_declAccess().getExceptionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group__1__Impl
	rule__Exception_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getNameAssignment_1()); }
	(rule__Exception_decl__NameAssignment_1)
	{ after(grammarAccess.getException_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group__2__Impl
	rule__Exception_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getGroup_2()); }
	(rule__Exception_decl__Group_2__0)?
	{ after(grammarAccess.getException_declAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getException_declAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exception_decl__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group_2__0__Impl
	rule__Exception_decl__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getException_declAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group_2__1__Impl
	rule__Exception_decl__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getTypeAssignment_2_1()); }
	(rule__Exception_decl__TypeAssignment_2_1)
	{ after(grammarAccess.getException_declAccess().getTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group_2__2__Impl
	rule__Exception_decl__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getGroup_2_2()); }
	(rule__Exception_decl__Group_2_2__0)*
	{ after(grammarAccess.getException_declAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getException_declAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exception_decl__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group_2_2__0__Impl
	rule__Exception_decl__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getException_declAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exception_decl__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getException_declAccess().getTypeAssignment_2_2_1()); }
	(rule__Exception_decl__TypeAssignment_2_2_1)
	{ after(grammarAccess.getException_declAccess().getTypeAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interface_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group__0__Impl
	rule__Interface_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getInterfaceKeyword_0()); }
	'interface'
	{ after(grammarAccess.getInterface_declAccess().getInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group__1__Impl
	rule__Interface_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getNameAssignment_1()); }
	(rule__Interface_decl__NameAssignment_1)
	{ after(grammarAccess.getInterface_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group__2__Impl
	rule__Interface_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getGroup_2()); }
	(rule__Interface_decl__Group_2__0)?
	{ after(grammarAccess.getInterface_declAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group__3__Impl
	rule__Interface_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getInterface_declAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group__4__Impl
	rule__Interface_decl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getMethodsigAssignment_4()); }
	(rule__Interface_decl__MethodsigAssignment_4)*
	{ after(grammarAccess.getInterface_declAccess().getMethodsigAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getInterface_declAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interface_decl__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group_2__0__Impl
	rule__Interface_decl__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getInterface_declAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group_2__1__Impl
	rule__Interface_decl__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getInterface_nameAssignment_2_1()); }
	(rule__Interface_decl__Interface_nameAssignment_2_1)
	{ after(grammarAccess.getInterface_declAccess().getInterface_nameAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getGroup_2_2()); }
	(rule__Interface_decl__Group_2_2__0)*
	{ after(grammarAccess.getInterface_declAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interface_decl__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group_2_2__0__Impl
	rule__Interface_decl__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getInterface_declAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_decl__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_declAccess().getInterface_nameAssignment_2_2_1()); }
	(rule__Interface_decl__Interface_nameAssignment_2_2_1)
	{ after(grammarAccess.getInterface_declAccess().getInterface_nameAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methodsig__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methodsig__Group__0__Impl
	rule__Methodsig__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodsigAccess().getType_useAssignment_0()); }
	(rule__Methodsig__Type_useAssignment_0)
	{ after(grammarAccess.getMethodsigAccess().getType_useAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methodsig__Group__1__Impl
	rule__Methodsig__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodsigAccess().getNameAssignment_1()); }
	(rule__Methodsig__NameAssignment_1)
	{ after(grammarAccess.getMethodsigAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methodsig__Group__2__Impl
	rule__Methodsig__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodsigAccess().getParamlistAssignment_2()); }
	(rule__Methodsig__ParamlistAssignment_2)
	{ after(grammarAccess.getMethodsigAccess().getParamlistAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methodsig__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodsigAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getMethodsigAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__0__Impl
	rule__Class_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getClassKeyword_0()); }
	'class'
	{ after(grammarAccess.getClass_declAccess().getClassKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__1__Impl
	rule__Class_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getNameAssignment_1()); }
	(rule__Class_decl__NameAssignment_1)
	{ after(grammarAccess.getClass_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__2__Impl
	rule__Class_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getParamlistAssignment_2()); }
	(rule__Class_decl__ParamlistAssignment_2)?
	{ after(grammarAccess.getClass_declAccess().getParamlistAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__3__Impl
	rule__Class_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getGroup_3()); }
	(rule__Class_decl__Group_3__0)?
	{ after(grammarAccess.getClass_declAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__4__Impl
	rule__Class_decl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__5__Impl
	rule__Class_decl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getField_declAssignment_5()); }
	(rule__Class_decl__Field_declAssignment_5)*
	{ after(grammarAccess.getClass_declAccess().getField_declAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__6__Impl
	rule__Class_decl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getGroup_6()); }
	(rule__Class_decl__Group_6__0)?
	{ after(grammarAccess.getClass_declAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__7__Impl
	rule__Class_decl__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getGroup_7()); }
	(rule__Class_decl__Group_7__0)?
	{ after(grammarAccess.getClass_declAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__8__Impl
	rule__Class_decl__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getTrait_usageAssignment_8()); }
	(rule__Class_decl__Trait_usageAssignment_8)*
	{ after(grammarAccess.getClass_declAccess().getTrait_usageAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__9__Impl
	rule__Class_decl__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getMethodAssignment_9()); }
	(rule__Class_decl__MethodAssignment_9)*
	{ after(grammarAccess.getClass_declAccess().getMethodAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_decl__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_3__0__Impl
	rule__Class_decl__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getImplementsKeyword_3_0()); }
	'implements'
	{ after(grammarAccess.getClass_declAccess().getImplementsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_3__1__Impl
	rule__Class_decl__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getInterface_nameAssignment_3_1()); }
	(rule__Class_decl__Interface_nameAssignment_3_1)
	{ after(grammarAccess.getClass_declAccess().getInterface_nameAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getGroup_3_2()); }
	(rule__Class_decl__Group_3_2__0)*
	{ after(grammarAccess.getClass_declAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_decl__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_3_2__0__Impl
	rule__Class_decl__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getCommaKeyword_3_2_0()); }
	','
	{ after(grammarAccess.getClass_declAccess().getCommaKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getInterface_nameAssignment_3_2_1()); }
	(rule__Class_decl__Interface_nameAssignment_3_2_1)
	{ after(grammarAccess.getClass_declAccess().getInterface_nameAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_decl__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_6__0__Impl
	rule__Class_decl__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_6_0()); }
	'{'
	{ after(grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_6__1__Impl
	rule__Class_decl__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getStmtAssignment_6_1()); }
	(rule__Class_decl__StmtAssignment_6_1)*
	{ after(grammarAccess.getClass_declAccess().getStmtAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_6_2()); }
	'}'
	{ after(grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_decl__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_7__0__Impl
	rule__Class_decl__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getRecoverKeyword_7_0()); }
	'recover'
	{ after(grammarAccess.getClass_declAccess().getRecoverKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_7__1__Impl
	rule__Class_decl__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_7_1()); }
	'{'
	{ after(grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_7__2__Impl
	rule__Class_decl__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getCasestmtbranchAssignment_7_2()); }
	(rule__Class_decl__CasestmtbranchAssignment_7_2)*
	{ after(grammarAccess.getClass_declAccess().getCasestmtbranchAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_decl__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_7_3()); }
	'}'
	{ after(grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Field_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field_decl__Group__0__Impl
	rule__Field_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getField_declAccess().getType_useAssignment_0()); }
	(rule__Field_decl__Type_useAssignment_0)
	{ after(grammarAccess.getField_declAccess().getType_useAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field_decl__Group__1__Impl
	rule__Field_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getField_declAccess().getNameAssignment_1()); }
	(rule__Field_decl__NameAssignment_1)
	{ after(grammarAccess.getField_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field_decl__Group__2__Impl
	rule__Field_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getField_declAccess().getGroup_2()); }
	(rule__Field_decl__Group_2__0)?
	{ after(grammarAccess.getField_declAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field_decl__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getField_declAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getField_declAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Field_decl__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field_decl__Group_2__0__Impl
	rule__Field_decl__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getField_declAccess().getEqualsSignKeyword_2_0()); }
	'='
	{ after(grammarAccess.getField_declAccess().getEqualsSignKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field_decl__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getField_declAccess().getPure_expAssignment_2_1()); }
	(rule__Field_decl__Pure_expAssignment_2_1)
	{ after(grammarAccess.getField_declAccess().getPure_expAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group__0__Impl
	rule__Stmt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getStmtAction_0()); }
	()
	{ after(grammarAccess.getStmtAccess().getStmtAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getAlternatives_1()); }
	(rule__Stmt__Alternatives_1)
	{ after(grammarAccess.getStmtAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_0__0__Impl
	rule__Stmt__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getType_expAssignment_1_0_0()); }
	(rule__Stmt__Type_expAssignment_1_0_0)
	{ after(grammarAccess.getStmtAccess().getType_expAssignment_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_0__1__Impl
	rule__Stmt__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getNameAssignment_1_0_1()); }
	(rule__Stmt__NameAssignment_1_0_1)
	{ after(grammarAccess.getStmtAccess().getNameAssignment_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_0__2__Impl
	rule__Stmt__Group_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getGroup_1_0_2()); }
	(rule__Stmt__Group_1_0_2__0)?
	{ after(grammarAccess.getStmtAccess().getGroup_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_0_3()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_0_2__0__Impl
	rule__Stmt__Group_1_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getEqualsSignKeyword_1_0_2_0()); }
	'='
	{ after(grammarAccess.getStmtAccess().getEqualsSignKeyword_1_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getExpAssignment_1_0_2_1()); }
	(rule__Stmt__ExpAssignment_1_0_2_1)
	{ after(grammarAccess.getStmtAccess().getExpAssignment_1_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_1__0__Impl
	rule__Stmt__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getVar_or_field_refAssignment_1_1_0()); }
	(rule__Stmt__Var_or_field_refAssignment_1_1_0)
	{ after(grammarAccess.getStmtAccess().getVar_or_field_refAssignment_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_1__1__Impl
	rule__Stmt__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getEqualsSignKeyword_1_1_1()); }
	'='
	{ after(grammarAccess.getStmtAccess().getEqualsSignKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_1__2__Impl
	rule__Stmt__Group_1_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getExpAssignment_1_1_2()); }
	(rule__Stmt__ExpAssignment_1_1_2)
	{ after(grammarAccess.getStmtAccess().getExpAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_1_3()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_2__0__Impl
	rule__Stmt__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSkipKeyword_1_2_0()); }
	'skip'
	{ after(grammarAccess.getStmtAccess().getSkipKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_2_1()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_3__0__Impl
	rule__Stmt__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getReturnKeyword_1_3_0()); }
	'return'
	{ after(grammarAccess.getStmtAccess().getReturnKeyword_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_3__1__Impl
	rule__Stmt__Group_1_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getExpAssignment_1_3_1()); }
	(rule__Stmt__ExpAssignment_1_3_1)
	{ after(grammarAccess.getStmtAccess().getExpAssignment_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_3_2()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_4__0__Impl
	rule__Stmt__Group_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getAssertKeyword_1_4_0()); }
	'assert'
	{ after(grammarAccess.getStmtAccess().getAssertKeyword_1_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_4__1__Impl
	rule__Stmt__Group_1_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getExpAssignment_1_4_1()); }
	(rule__Stmt__ExpAssignment_1_4_1)
	{ after(grammarAccess.getStmtAccess().getExpAssignment_1_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_4_2()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_5__0__Impl
	rule__Stmt__Group_1_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_5_0()); }
	'{'
	{ after(grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_5__1__Impl
	rule__Stmt__Group_1_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getStmtAssignment_1_5_1()); }
	(rule__Stmt__StmtAssignment_1_5_1)*
	{ after(grammarAccess.getStmtAccess().getStmtAssignment_1_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_5_2()); }
	'}'
	{ after(grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6__0__Impl
	rule__Stmt__Group_1_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getIfKeyword_1_6_0()); }
	'if'
	{ after(grammarAccess.getStmtAccess().getIfKeyword_1_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6__1__Impl
	rule__Stmt__Group_1_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_6_1()); }
	'('
	{ after(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6__2__Impl
	rule__Stmt__Group_1_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getPure_expAssignment_1_6_2()); }
	(rule__Stmt__Pure_expAssignment_1_6_2)
	{ after(grammarAccess.getStmtAccess().getPure_expAssignment_1_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6__3__Impl
	rule__Stmt__Group_1_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_6_3()); }
	')'
	{ after(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6__4__Impl
	rule__Stmt__Group_1_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getIfstmtAssignment_1_6_4()); }
	(rule__Stmt__IfstmtAssignment_1_6_4)
	{ after(grammarAccess.getStmtAccess().getIfstmtAssignment_1_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getGroup_1_6_5()); }
	(rule__Stmt__Group_1_6_5__0)?
	{ after(grammarAccess.getStmtAccess().getGroup_1_6_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_6_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6_5__0__Impl
	rule__Stmt__Group_1_6_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getElseKeyword_1_6_5_0()); }
	('else')
	{ after(grammarAccess.getStmtAccess().getElseKeyword_1_6_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_6_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_6_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getElsestmtAssignment_1_6_5_1()); }
	(rule__Stmt__ElsestmtAssignment_1_6_5_1)
	{ after(grammarAccess.getStmtAccess().getElsestmtAssignment_1_6_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_7__0__Impl
	rule__Stmt__Group_1_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getWhileKeyword_1_7_0()); }
	'while'
	{ after(grammarAccess.getStmtAccess().getWhileKeyword_1_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_7__1__Impl
	rule__Stmt__Group_1_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_7_1()); }
	'('
	{ after(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_7__2__Impl
	rule__Stmt__Group_1_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getConditionAssignment_1_7_2()); }
	(rule__Stmt__ConditionAssignment_1_7_2)
	{ after(grammarAccess.getStmtAccess().getConditionAssignment_1_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_7__3__Impl
	rule__Stmt__Group_1_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_7_3()); }
	')'
	{ after(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_7__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getWhilestmtAssignment_1_7_4()); }
	(rule__Stmt__WhilestmtAssignment_1_7_4)
	{ after(grammarAccess.getStmtAccess().getWhilestmtAssignment_1_7_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_8__0__Impl
	rule__Stmt__Group_1_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getForeachKeyword_1_8_0()); }
	'foreach'
	{ after(grammarAccess.getStmtAccess().getForeachKeyword_1_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_8__1__Impl
	rule__Stmt__Group_1_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_8_1()); }
	'('
	{ after(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_8__2__Impl
	rule__Stmt__Group_1_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getNameAssignment_1_8_2()); }
	(rule__Stmt__NameAssignment_1_8_2)
	{ after(grammarAccess.getStmtAccess().getNameAssignment_1_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_8__3__Impl
	rule__Stmt__Group_1_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getInKeyword_1_8_3()); }
	'in'
	{ after(grammarAccess.getStmtAccess().getInKeyword_1_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_8__4__Impl
	rule__Stmt__Group_1_8__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLAssignment_1_8_4()); }
	(rule__Stmt__LAssignment_1_8_4)
	{ after(grammarAccess.getStmtAccess().getLAssignment_1_8_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_8__5__Impl
	rule__Stmt__Group_1_8__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_8_5()); }
	')'
	{ after(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_8_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_8__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_8__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getForeachstmtAssignment_1_8_6()); }
	(rule__Stmt__ForeachstmtAssignment_1_8_6)
	{ after(grammarAccess.getStmtAccess().getForeachstmtAssignment_1_8_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9__0__Impl
	rule__Stmt__Group_1_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getTryKeyword_1_9_0()); }
	'try'
	{ after(grammarAccess.getStmtAccess().getTryKeyword_1_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9__1__Impl
	rule__Stmt__Group_1_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getTrystmtAssignment_1_9_1()); }
	(rule__Stmt__TrystmtAssignment_1_9_1)
	{ after(grammarAccess.getStmtAccess().getTrystmtAssignment_1_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9__2__Impl
	rule__Stmt__Group_1_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getCatchKeyword_1_9_2()); }
	'catch'
	{ after(grammarAccess.getStmtAccess().getCatchKeyword_1_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9__3__Impl
	rule__Stmt__Group_1_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getAlternatives_1_9_3()); }
	(rule__Stmt__Alternatives_1_9_3)
	{ after(grammarAccess.getStmtAccess().getAlternatives_1_9_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getGroup_1_9_4()); }
	(rule__Stmt__Group_1_9_4__0)?
	{ after(grammarAccess.getStmtAccess().getGroup_1_9_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_9_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9_3_0__0__Impl
	rule__Stmt__Group_1_9_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_9_3_0_0()); }
	'{'
	{ after(grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_9_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9_3_0__1__Impl
	rule__Stmt__Group_1_9_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getCasestmtbranchAssignment_1_9_3_0_1()); }
	(rule__Stmt__CasestmtbranchAssignment_1_9_3_0_1)*
	{ after(grammarAccess.getStmtAccess().getCasestmtbranchAssignment_1_9_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_9_3_0_2()); }
	'}'
	{ after(grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_9_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_9_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9_4__0__Impl
	rule__Stmt__Group_1_9_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getFinallyKeyword_1_9_4_0()); }
	'finally'
	{ after(grammarAccess.getStmtAccess().getFinallyKeyword_1_9_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_9_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_9_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getStmtAssignment_1_9_4_1()); }
	(rule__Stmt__StmtAssignment_1_9_4_1)
	{ after(grammarAccess.getStmtAccess().getStmtAssignment_1_9_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_10__0__Impl
	rule__Stmt__Group_1_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getAwaitKeyword_1_10_0()); }
	'await'
	{ after(grammarAccess.getStmtAccess().getAwaitKeyword_1_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_10__1__Impl
	rule__Stmt__Group_1_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRefAssignment_1_10_1()); }
	(rule__Stmt__RefAssignment_1_10_1)
	{ after(grammarAccess.getStmtAccess().getRefAssignment_1_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_10__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_10_2()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_11__0__Impl
	rule__Stmt__Group_1_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSuspendKeyword_1_11_0()); }
	'suspend'
	{ after(grammarAccess.getStmtAccess().getSuspendKeyword_1_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_11_1()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_12__0__Impl
	rule__Stmt__Group_1_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getDurationKeyword_1_12_0()); }
	'duration'
	{ after(grammarAccess.getStmtAccess().getDurationKeyword_1_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_12__1__Impl
	rule__Stmt__Group_1_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_12_1()); }
	'('
	{ after(grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_12__2__Impl
	rule__Stmt__Group_1_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getFAssignment_1_12_2()); }
	(rule__Stmt__FAssignment_1_12_2)
	{ after(grammarAccess.getStmtAccess().getFAssignment_1_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_12__3__Impl
	rule__Stmt__Group_1_12__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getCommaKeyword_1_12_3()); }
	','
	{ after(grammarAccess.getStmtAccess().getCommaKeyword_1_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_12__4__Impl
	rule__Stmt__Group_1_12__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getTAssignment_1_12_4()); }
	(rule__Stmt__TAssignment_1_12_4)
	{ after(grammarAccess.getStmtAccess().getTAssignment_1_12_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_12__5__Impl
	rule__Stmt__Group_1_12__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_12_5()); }
	')'
	{ after(grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_12_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_12__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_12__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_12_6()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_12_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_13__0__Impl
	rule__Stmt__Group_1_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getThrowKeyword_1_13_0()); }
	'throw'
	{ after(grammarAccess.getStmtAccess().getThrowKeyword_1_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_13__1__Impl
	rule__Stmt__Group_1_13__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getThrowPureExpAssignment_1_13_1()); }
	(rule__Stmt__ThrowPureExpAssignment_1_13_1)
	{ after(grammarAccess.getStmtAccess().getThrowPureExpAssignment_1_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_13__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_13__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_13__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_13_2()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_13_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_14__0__Impl
	rule__Stmt__Group_1_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getDieKeyword_1_14_0()); }
	'die'
	{ after(grammarAccess.getStmtAccess().getDieKeyword_1_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_14__1__Impl
	rule__Stmt__Group_1_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getDiePureExpAssignment_1_14_1()); }
	(rule__Stmt__DiePureExpAssignment_1_14_1)
	{ after(grammarAccess.getStmtAccess().getDiePureExpAssignment_1_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_14__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_14_2()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_15__0__Impl
	rule__Stmt__Group_1_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getMovecogtoKeyword_1_15_0()); }
	'movecogto'
	{ after(grammarAccess.getStmtAccess().getMovecogtoKeyword_1_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_15__1__Impl
	rule__Stmt__Group_1_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getMoveCogToAssignment_1_15_1()); }
	(rule__Stmt__MoveCogToAssignment_1_15_1)
	{ after(grammarAccess.getStmtAccess().getMoveCogToAssignment_1_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_15__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_15_2()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_16__0__Impl
	rule__Stmt__Group_1_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getExpAssignment_1_16_0()); }
	(rule__Stmt__ExpAssignment_1_16_0)
	{ after(grammarAccess.getStmtAccess().getExpAssignment_1_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_16__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getSemicolonKeyword_1_16_1()); }
	';'
	{ after(grammarAccess.getStmtAccess().getSemicolonKeyword_1_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stmt__Group_1_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_17__0__Impl
	rule__Stmt__Group_1_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getCaseKeyword_1_17_0()); }
	'case'
	{ after(grammarAccess.getStmtAccess().getCaseKeyword_1_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_17__1__Impl
	rule__Stmt__Group_1_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getCAssignment_1_17_1()); }
	(rule__Stmt__CAssignment_1_17_1)
	{ after(grammarAccess.getStmtAccess().getCAssignment_1_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_17__2__Impl
	rule__Stmt__Group_1_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_17_2()); }
	'{'
	{ after(grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_17__3__Impl
	rule__Stmt__Group_1_17__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getCasestmtbranchAssignment_1_17_3()); }
	(rule__Stmt__CasestmtbranchAssignment_1_17_3)*
	{ after(grammarAccess.getStmtAccess().getCasestmtbranchAssignment_1_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stmt__Group_1_17__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Group_1_17__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_17_4()); }
	'}'
	{ after(grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_17_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Eff_expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_0__0__Impl
	rule__Eff_expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_0_0()); }
	rulePure_exp
	{ after(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_0__1__Impl
	rule__Eff_expr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getFullStopKeyword_0_1()); }
	'.'
	{ after(grammarAccess.getEff_exprAccess().getFullStopKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getGetKeyword_0_2()); }
	'get'
	{ after(grammarAccess.getEff_exprAccess().getGetKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Eff_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_1__0__Impl
	rule__Eff_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getNewKeyword_1_0()); }
	'new'
	{ after(grammarAccess.getEff_exprAccess().getNewKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_1__1__Impl
	rule__Eff_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getLAssignment_1_1()); }
	(rule__Eff_expr__LAssignment_1_1)?
	{ after(grammarAccess.getEff_exprAccess().getLAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_1__2__Impl
	rule__Eff_expr__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getQualifiedNameParserRuleCall_1_2()); }
	ruleQualifiedName
	{ after(grammarAccess.getEff_exprAccess().getQualifiedNameParserRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_1__3__Impl
	rule__Eff_expr__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_1_3()); }
	'('
	{ after(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_1__4__Impl
	rule__Eff_expr__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getPure_exp_listAssignment_1_4()); }
	(rule__Eff_expr__Pure_exp_listAssignment_1_4)
	{ after(grammarAccess.getEff_exprAccess().getPure_exp_listAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_1_5()); }
	')'
	{ after(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Eff_expr__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_2__0__Impl
	rule__Eff_expr__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getAwaitKeyword_2_0()); }
	('await')?
	{ after(grammarAccess.getEff_exprAccess().getAwaitKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_2__1__Impl
	rule__Eff_expr__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_2_1()); }
	rulePure_exp
	{ after(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_2__2__Impl
	rule__Eff_expr__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getNEGATIONTerminalRuleCall_2_2()); }
	RULE_NEGATION
	{ after(grammarAccess.getEff_exprAccess().getNEGATIONTerminalRuleCall_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_2__3__Impl
	rule__Eff_expr__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getAwaitAssignment_2_3()); }
	(rule__Eff_expr__AwaitAssignment_2_3)
	{ after(grammarAccess.getEff_exprAccess().getAwaitAssignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_2__4__Impl
	rule__Eff_expr__Group_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_2_4()); }
	'('
	{ after(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_2__5__Impl
	rule__Eff_expr__Group_2__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getListAssignment_2_5()); }
	(rule__Eff_expr__ListAssignment_2_5)
	{ after(grammarAccess.getEff_exprAccess().getListAssignment_2_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_2__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_2__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_2_6()); }
	')'
	{ after(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_2_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Eff_expr__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_3__0__Impl
	rule__Eff_expr__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_3_0()); }
	rulePure_exp
	{ after(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_3__1__Impl
	rule__Eff_expr__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getFullStopKeyword_3_1()); }
	'.'
	{ after(grammarAccess.getEff_exprAccess().getFullStopKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_3__2__Impl
	rule__Eff_expr__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getValAssignment_3_2()); }
	(rule__Eff_expr__ValAssignment_3_2)
	{ after(grammarAccess.getEff_exprAccess().getValAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_3__3__Impl
	rule__Eff_expr__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_3_3()); }
	'('
	{ after(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_3__4__Impl
	rule__Eff_expr__Group_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getListAssignment_3_4()); }
	(rule__Eff_expr__ListAssignment_3_4)
	{ after(grammarAccess.getEff_exprAccess().getListAssignment_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_3_5()); }
	')'
	{ after(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Eff_expr__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_4__0__Impl
	rule__Eff_expr__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getGroup_4_0()); }
	(rule__Eff_expr__Group_4_0__0)?
	{ after(grammarAccess.getEff_exprAccess().getGroup_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_4__1__Impl
	rule__Eff_expr__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getOriginalKeyword_4_1()); }
	'original'
	{ after(grammarAccess.getEff_exprAccess().getOriginalKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_4__2__Impl
	rule__Eff_expr__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_4_2()); }
	'('
	{ after(grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_4__3__Impl
	rule__Eff_expr__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getListAssignment_4_3()); }
	(rule__Eff_expr__ListAssignment_4_3)
	{ after(grammarAccess.getEff_exprAccess().getListAssignment_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_4_4()); }
	')'
	{ after(grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Eff_expr__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_4_0__0__Impl
	rule__Eff_expr__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getAlternatives_4_0_0()); }
	(rule__Eff_expr__Alternatives_4_0_0)
	{ after(grammarAccess.getEff_exprAccess().getAlternatives_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Eff_expr__Group_4_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEff_exprAccess().getFullStopKeyword_4_0_1()); }
	'.'
	{ after(grammarAccess.getEff_exprAccess().getFullStopKeyword_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Guard__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_0__0__Impl
	rule__Guard__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getRefAssignment_0_0()); }
	(rule__Guard__RefAssignment_0_0)
	{ after(grammarAccess.getGuardAccess().getRefAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getQuestionMarkKeyword_0_1()); }
	'?'
	{ after(grammarAccess.getGuardAccess().getQuestionMarkKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Guard__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_1__0__Impl
	rule__Guard__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getDurationKeyword_1_0()); }
	'duration'
	{ after(grammarAccess.getGuardAccess().getDurationKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_1__1__Impl
	rule__Guard__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getLeftParenthesisKeyword_1_1()); }
	'('
	{ after(grammarAccess.getGuardAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_1__2__Impl
	rule__Guard__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getMinAssignment_1_2()); }
	(rule__Guard__MinAssignment_1_2)
	{ after(grammarAccess.getGuardAccess().getMinAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_1__3__Impl
	rule__Guard__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getCommaKeyword_1_3()); }
	','
	{ after(grammarAccess.getGuardAccess().getCommaKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_1__4__Impl
	rule__Guard__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getMaxAssignment_1_4()); }
	(rule__Guard__MaxAssignment_1_4)
	{ after(grammarAccess.getGuardAccess().getMaxAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guard__Group_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardAccess().getRightParenthesisKeyword_1_5()); }
	')'
	{ after(grammarAccess.getGuardAccess().getRightParenthesisKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndGuard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndGuard__Group__0__Impl
	rule__AndGuard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndGuardAccess().getPrimaryGuardParserRuleCall_0()); }
	rulePrimaryGuard
	{ after(grammarAccess.getAndGuardAccess().getPrimaryGuardParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndGuard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndGuardAccess().getGroup_1()); }
	(rule__AndGuard__Group_1__0)*
	{ after(grammarAccess.getAndGuardAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndGuard__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndGuard__Group_1__0__Impl
	rule__AndGuard__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndGuardAccess().getAndGuardLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndGuardAccess().getAndGuardLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndGuard__Group_1__1__Impl
	rule__AndGuard__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndGuardAccess().getOpAssignment_1_1()); }
	(rule__AndGuard__OpAssignment_1_1)
	{ after(grammarAccess.getAndGuardAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndGuard__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndGuardAccess().getRightAssignment_1_2()); }
	(rule__AndGuard__RightAssignment_1_2)
	{ after(grammarAccess.getAndGuardAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryGuard__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryGuard__Group_0__0__Impl
	rule__PrimaryGuard__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryGuard__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryGuardAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getPrimaryGuardAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryGuard__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryGuard__Group_0__1__Impl
	rule__PrimaryGuard__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryGuard__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryGuardAccess().getGuardParserRuleCall_0_1()); }
	ruleGuard
	{ after(grammarAccess.getPrimaryGuardAccess().getGuardParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryGuard__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryGuard__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryGuard__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryGuardAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getPrimaryGuardAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Casestmtbranch__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Casestmtbranch__Group__0__Impl
	rule__Casestmtbranch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Casestmtbranch__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCasestmtbranchAccess().getPatternAssignment_0()); }
	(rule__Casestmtbranch__PatternAssignment_0)
	{ after(grammarAccess.getCasestmtbranchAccess().getPatternAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Casestmtbranch__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Casestmtbranch__Group__1__Impl
	rule__Casestmtbranch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Casestmtbranch__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCasestmtbranchAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getCasestmtbranchAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Casestmtbranch__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Casestmtbranch__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Casestmtbranch__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCasestmtbranchAccess().getStmtAssignment_2()); }
	(rule__Casestmtbranch__StmtAssignment_2)
	{ after(grammarAccess.getCasestmtbranchAccess().getStmtAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_usage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_usage__Group__0__Impl
	rule__Trait_usage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_usageAccess().getTrait_usageAction_0()); }
	()
	{ after(grammarAccess.getTrait_usageAccess().getTrait_usageAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_usage__Group__1__Impl
	rule__Trait_usage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_usageAccess().getUsesKeyword_1()); }
	'uses'
	{ after(grammarAccess.getTrait_usageAccess().getUsesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_usage__Group__2__Impl
	rule__Trait_usage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_usageAccess().getTraitUsageAssignment_2()); }
	(rule__Trait_usage__TraitUsageAssignment_2)*
	{ after(grammarAccess.getTrait_usageAccess().getTraitUsageAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_usage__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_usageAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getTrait_usageAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_expr__Group_0__0__Impl
	rule__Trait_expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_exprAccess().getTrait_exprAction_0_0()); }
	()
	{ after(grammarAccess.getTrait_exprAccess().getTrait_exprAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_expr__Group_0__1__Impl
	rule__Trait_expr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_exprAccess().getLeftCurlyBracketKeyword_0_1()); }
	'{'
	{ after(grammarAccess.getTrait_exprAccess().getLeftCurlyBracketKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_expr__Group_0__2__Impl
	rule__Trait_expr__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_exprAccess().getMethodAssignment_0_2()); }
	(rule__Trait_expr__MethodAssignment_0_2)*
	{ after(grammarAccess.getTrait_exprAccess().getMethodAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_expr__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_exprAccess().getRightCurlyBracketKeyword_0_3()); }
	'}'
	{ after(grammarAccess.getTrait_exprAccess().getRightCurlyBracketKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_Left_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_Left_expr__Group__0__Impl
	rule__Trait_Left_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_Left_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_Left_exprAccess().getOpAssignment_0()); }
	(rule__Trait_Left_expr__OpAssignment_0)
	{ after(grammarAccess.getTrait_Left_exprAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_Left_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_Left_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_Left_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_Left_exprAccess().getTrait_exprAssignment_1()); }
	(rule__Trait_Left_expr__Trait_exprAssignment_1)
	{ after(grammarAccess.getTrait_Left_exprAccess().getTrait_exprAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary_Trait_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary_Trait_expr__Group__0__Impl
	rule__Primary_Trait_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_Trait_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimary_Trait_exprAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getPrimary_Trait_exprAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_Trait_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary_Trait_expr__Group__1__Impl
	rule__Primary_Trait_expr__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_Trait_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimary_Trait_exprAccess().getTrait_exprParserRuleCall_1()); }
	ruleTrait_expr
	{ after(grammarAccess.getPrimary_Trait_exprAccess().getTrait_exprParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_Trait_expr__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary_Trait_expr__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary_Trait_expr__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimary_Trait_exprAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getPrimary_Trait_exprAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_oper__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_0__0__Impl
	rule__Trait_oper__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getTrait_operAction_0_0()); }
	()
	{ after(grammarAccess.getTrait_operAccess().getTrait_operAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_0__1__Impl
	rule__Trait_oper__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getRemovesKeyword_0_1()); }
	'removes'
	{ after(grammarAccess.getTrait_operAccess().getRemovesKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getAlternatives_0_2()); }
	(rule__Trait_oper__Alternatives_0_2)
	{ after(grammarAccess.getTrait_operAccess().getAlternatives_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_oper__Group_0_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_0_2_1__0__Impl
	rule__Trait_oper__Group_0_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getLeftCurlyBracketKeyword_0_2_1_0()); }
	'{'
	{ after(grammarAccess.getTrait_operAccess().getLeftCurlyBracketKeyword_0_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_0_2_1__1__Impl
	rule__Trait_oper__Group_0_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getMethodsigAssignment_0_2_1_1()); }
	(rule__Trait_oper__MethodsigAssignment_0_2_1_1)*
	{ after(grammarAccess.getTrait_operAccess().getMethodsigAssignment_0_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_0_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_0_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getRightCurlyBracketKeyword_0_2_1_2()); }
	'}'
	{ after(grammarAccess.getTrait_operAccess().getRightCurlyBracketKeyword_0_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_oper__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_1__0__Impl
	rule__Trait_oper__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getAddsKeyword_1_0()); }
	'adds'
	{ after(grammarAccess.getTrait_operAccess().getAddsKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getTrait_exprAssignment_1_1()); }
	(rule__Trait_oper__Trait_exprAssignment_1_1)
	{ after(grammarAccess.getTrait_operAccess().getTrait_exprAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_oper__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_2__0__Impl
	rule__Trait_oper__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getModifiesKeyword_2_0()); }
	'modifies'
	{ after(grammarAccess.getTrait_operAccess().getModifiesKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_oper__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_operAccess().getTrait_expAssignment_2_1()); }
	(rule__Trait_oper__Trait_expAssignment_2_1)
	{ after(grammarAccess.getTrait_operAccess().getTrait_expAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__0__Impl
	rule__Method__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getType_useAssignment_0()); }
	(rule__Method__Type_useAssignment_0)
	{ after(grammarAccess.getMethodAccess().getType_useAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__1__Impl
	rule__Method__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getNameAssignment_1()); }
	(rule__Method__NameAssignment_1)
	{ after(grammarAccess.getMethodAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__2__Impl
	rule__Method__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getParamlistAssignment_2()); }
	(rule__Method__ParamlistAssignment_2)
	{ after(grammarAccess.getMethodAccess().getParamlistAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__3__Impl
	rule__Method__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__4__Impl
	rule__Method__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getStmtAssignment_4()); }
	(rule__Method__StmtAssignment_4)*
	{ after(grammarAccess.getMethodAccess().getStmtAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Trait_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_decl__Group__0__Impl
	rule__Trait_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_declAccess().getTraitKeyword_0()); }
	'trait'
	{ after(grammarAccess.getTrait_declAccess().getTraitKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_decl__Group__1__Impl
	rule__Trait_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_declAccess().getNameAssignment_1()); }
	(rule__Trait_decl__NameAssignment_1)
	{ after(grammarAccess.getTrait_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_decl__Group__2__Impl
	rule__Trait_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_declAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getTrait_declAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Trait_decl__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrait_declAccess().getTraitExprAssignment_3()); }
	(rule__Trait_decl__TraitExprAssignment_3)
	{ after(grammarAccess.getTrait_declAccess().getTraitExprAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Main_block__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Main_block__Group__0__Impl
	rule__Main_block__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMain_blockAccess().getMain_blockAction_0()); }
	()
	{ after(grammarAccess.getMain_blockAccess().getMain_blockAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Main_block__Group__1__Impl
	rule__Main_block__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMain_blockAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getMain_blockAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Main_block__Group__2__Impl
	rule__Main_block__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMain_blockAccess().getStmtAssignment_2()); }
	(rule__Main_block__StmtAssignment_2)*
	{ after(grammarAccess.getMain_blockAccess().getStmtAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Main_block__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMain_blockAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getMain_blockAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delta_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group__0__Impl
	rule__Delta_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getDeltaKeyword_0()); }
	'delta'
	{ after(grammarAccess.getDelta_declAccess().getDeltaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group__1__Impl
	rule__Delta_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getNameAssignment_1()); }
	(rule__Delta_decl__NameAssignment_1)
	{ after(grammarAccess.getDelta_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group__2__Impl
	rule__Delta_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getGroup_2()); }
	(rule__Delta_decl__Group_2__0)?
	{ after(grammarAccess.getDelta_declAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group__3__Impl
	rule__Delta_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getDelta_declAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group__4__Impl
	rule__Delta_decl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getDelta_accessAssignment_4()); }
	(rule__Delta_decl__Delta_accessAssignment_4)*
	{ after(grammarAccess.getDelta_declAccess().getDelta_accessAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getModule_modifierAssignment_5()); }
	(rule__Delta_decl__Module_modifierAssignment_5)*
	{ after(grammarAccess.getDelta_declAccess().getModule_modifierAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delta_decl__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group_2__0__Impl
	rule__Delta_decl__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getDelta_declAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group_2__1__Impl
	rule__Delta_decl__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getPAssignment_2_1()); }
	(rule__Delta_decl__PAssignment_2_1)
	{ after(grammarAccess.getDelta_declAccess().getPAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group_2__2__Impl
	rule__Delta_decl__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getGroup_2_2()); }
	(rule__Delta_decl__Group_2_2__0)*
	{ after(grammarAccess.getDelta_declAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getDelta_declAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delta_decl__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group_2_2__0__Impl
	rule__Delta_decl__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getDelta_declAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_decl__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_declAccess().getPAssignment_2_2_1()); }
	(rule__Delta_decl__PAssignment_2_2_1)
	{ after(grammarAccess.getDelta_declAccess().getPAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delta_param__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_param__Group_1__0__Impl
	rule__Delta_param__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_param__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_paramAccess().getQualifiedNameParserRuleCall_1_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getDelta_paramAccess().getQualifiedNameParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_param__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_param__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_param__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_paramAccess().getHas_conditionParserRuleCall_1_1()); }
	ruleHas_condition
	{ after(grammarAccess.getDelta_paramAccess().getHas_conditionParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Has_condition__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Has_condition__Group_0__0__Impl
	rule__Has_condition__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHas_conditionAccess().getHasFieldKeyword_0_0()); }
	'hasField'
	{ after(grammarAccess.getHas_conditionAccess().getHasFieldKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Has_condition__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHas_conditionAccess().getFieldAssignment_0_1()); }
	(rule__Has_condition__FieldAssignment_0_1)
	{ after(grammarAccess.getHas_conditionAccess().getFieldAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Has_condition__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Has_condition__Group_1__0__Impl
	rule__Has_condition__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHas_conditionAccess().getHasMethodKeyword_1_0()); }
	'hasMethod'
	{ after(grammarAccess.getHas_conditionAccess().getHasMethodKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Has_condition__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHas_conditionAccess().getMethodAssignment_1_1()); }
	(rule__Has_condition__MethodAssignment_1_1)
	{ after(grammarAccess.getHas_conditionAccess().getMethodAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Has_condition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Has_condition__Group_2__0__Impl
	rule__Has_condition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHas_conditionAccess().getHasInterfaceKeyword_2_0()); }
	'hasInterface'
	{ after(grammarAccess.getHas_conditionAccess().getHasInterfaceKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Has_condition__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHas_conditionAccess().getInterfaceAssignment_2_1()); }
	(rule__Has_condition__InterfaceAssignment_2_1)
	{ after(grammarAccess.getHas_conditionAccess().getInterfaceAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delta_access__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_access__Group__0__Impl
	rule__Delta_access__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_access__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_accessAccess().getUsesKeyword_0()); }
	'uses'
	{ after(grammarAccess.getDelta_accessAccess().getUsesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_access__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_access__Group__1__Impl
	rule__Delta_access__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_access__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_accessAccess().getModule_refAssignment_1()); }
	(rule__Delta_access__Module_refAssignment_1)
	{ after(grammarAccess.getDelta_accessAccess().getModule_refAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_access__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_access__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_access__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_accessAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getDelta_accessAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Functional_modifier__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Functional_modifier__Group_0__0__Impl
	rule__Functional_modifier__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctional_modifierAccess().getAddsKeyword_0_0()); }
	'adds'
	{ after(grammarAccess.getFunctional_modifierAccess().getAddsKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Functional_modifier__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctional_modifierAccess().getAlternatives_0_1()); }
	(rule__Functional_modifier__Alternatives_0_1)
	{ after(grammarAccess.getFunctional_modifierAccess().getAlternatives_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Functional_modifier__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Functional_modifier__Group_1__0__Impl
	rule__Functional_modifier__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctional_modifierAccess().getModifiesKeyword_1_0()); }
	'modifies'
	{ after(grammarAccess.getFunctional_modifierAccess().getModifiesKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Functional_modifier__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Functional_modifier__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctional_modifierAccess().getAlternatives_1_1()); }
	(rule__Functional_modifier__Alternatives_1_1)
	{ after(grammarAccess.getFunctional_modifierAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_0__0__Impl
	rule__OO_modifier__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getOO_modifierAction_0_0()); }
	()
	{ after(grammarAccess.getOO_modifierAccess().getOO_modifierAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_0__1__Impl
	rule__OO_modifier__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getAddsKeyword_0_1()); }
	'adds'
	{ after(grammarAccess.getOO_modifierAccess().getAddsKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getAlternatives_0_2()); }
	(rule__OO_modifier__Alternatives_0_2)
	{ after(grammarAccess.getOO_modifierAccess().getAlternatives_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_1__0__Impl
	rule__OO_modifier__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getRemovesKeyword_1_0()); }
	'removes'
	{ after(grammarAccess.getOO_modifierAccess().getRemovesKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_1__1__Impl
	rule__OO_modifier__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getAlternatives_1_1()); }
	(rule__OO_modifier__Alternatives_1_1)
	{ after(grammarAccess.getOO_modifierAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getSemicolonKeyword_1_2()); }
	';'
	{ after(grammarAccess.getOO_modifierAccess().getSemicolonKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_1_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_1_1_0__0__Impl
	rule__OO_modifier__Group_1_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getClassKeyword_1_1_0_0()); }
	'class'
	{ after(grammarAccess.getOO_modifierAccess().getClassKeyword_1_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_1_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getClassAssignment_1_1_0_1()); }
	(rule__OO_modifier__ClassAssignment_1_1_0_1)
	{ after(grammarAccess.getOO_modifierAccess().getClassAssignment_1_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_1_1_1__0__Impl
	rule__OO_modifier__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getInterfaceKeyword_1_1_1_0()); }
	'interface'
	{ after(grammarAccess.getOO_modifierAccess().getInterfaceKeyword_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getIntefaceAssignment_1_1_1_1()); }
	(rule__OO_modifier__IntefaceAssignment_1_1_1_1)
	{ after(grammarAccess.getOO_modifierAccess().getIntefaceAssignment_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2__0__Impl
	rule__OO_modifier__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getModifiesKeyword_2_0()); }
	'modifies'
	{ after(grammarAccess.getOO_modifierAccess().getModifiesKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getAlternatives_2_1()); }
	(rule__OO_modifier__Alternatives_2_1)
	{ after(grammarAccess.getOO_modifierAccess().getAlternatives_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_2_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0__0__Impl
	rule__OO_modifier__Group_2_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getClassKeyword_2_1_0_0()); }
	'class'
	{ after(grammarAccess.getOO_modifierAccess().getClassKeyword_2_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0__1__Impl
	rule__OO_modifier__Group_2_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getClassAssignment_2_1_0_1()); }
	(rule__OO_modifier__ClassAssignment_2_1_0_1)
	{ after(grammarAccess.getOO_modifierAccess().getClassAssignment_2_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0__2__Impl
	rule__OO_modifier__Group_2_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_2()); }
	(rule__OO_modifier__Group_2_1_0_2__0)?
	{ after(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0__3__Impl
	rule__OO_modifier__Group_2_1_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_3()); }
	(rule__OO_modifier__Group_2_1_0_3__0)?
	{ after(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0__4__Impl
	rule__OO_modifier__Group_2_1_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getLeftCurlyBracketKeyword_2_1_0_4()); }
	'{'
	{ after(grammarAccess.getOO_modifierAccess().getLeftCurlyBracketKeyword_2_1_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0__5__Impl
	rule__OO_modifier__Group_2_1_0__6
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getClass_modifier_fragmentAssignment_2_1_0_5()); }
	(rule__OO_modifier__Class_modifier_fragmentAssignment_2_1_0_5)*
	{ after(grammarAccess.getOO_modifierAccess().getClass_modifier_fragmentAssignment_2_1_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getRightCurlyBracketKeyword_2_1_0_6()); }
	'}'
	{ after(grammarAccess.getOO_modifierAccess().getRightCurlyBracketKeyword_2_1_0_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_2_1_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_2__0__Impl
	rule__OO_modifier__Group_2_1_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getAddsKeyword_2_1_0_2_0()); }
	'adds'
	{ after(grammarAccess.getOO_modifierAccess().getAddsKeyword_2_1_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_2__1__Impl
	rule__OO_modifier__Group_2_1_0_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getInterfaceNameAssignment_2_1_0_2_1()); }
	(rule__OO_modifier__InterfaceNameAssignment_2_1_0_2_1)
	{ after(grammarAccess.getOO_modifierAccess().getInterfaceNameAssignment_2_1_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_2_2()); }
	(rule__OO_modifier__Group_2_1_0_2_2__0)*
	{ after(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_2_1_0_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_2_2__0__Impl
	rule__OO_modifier__Group_2_1_0_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getCommaKeyword_2_1_0_2_2_0()); }
	','
	{ after(grammarAccess.getOO_modifierAccess().getCommaKeyword_2_1_0_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getInterfaceNameAssignment_2_1_0_2_2_1()); }
	(rule__OO_modifier__InterfaceNameAssignment_2_1_0_2_2_1)
	{ after(grammarAccess.getOO_modifierAccess().getInterfaceNameAssignment_2_1_0_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_2_1_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_3__0__Impl
	rule__OO_modifier__Group_2_1_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getRemovesKeyword_2_1_0_3_0()); }
	'removes'
	{ after(grammarAccess.getOO_modifierAccess().getRemovesKeyword_2_1_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_3__1__Impl
	rule__OO_modifier__Group_2_1_0_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getRemovedInterfaceAssignment_2_1_0_3_1()); }
	(rule__OO_modifier__RemovedInterfaceAssignment_2_1_0_3_1)
	{ after(grammarAccess.getOO_modifierAccess().getRemovedInterfaceAssignment_2_1_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_3_2()); }
	(rule__OO_modifier__Group_2_1_0_3_2__0)*
	{ after(grammarAccess.getOO_modifierAccess().getGroup_2_1_0_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_2_1_0_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_3_2__0__Impl
	rule__OO_modifier__Group_2_1_0_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getCommaKeyword_2_1_0_3_2_0()); }
	','
	{ after(grammarAccess.getOO_modifierAccess().getCommaKeyword_2_1_0_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_0_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_0_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getRemovedInterfaceAssignment_2_1_0_3_2_1()); }
	(rule__OO_modifier__RemovedInterfaceAssignment_2_1_0_3_2_1)
	{ after(grammarAccess.getOO_modifierAccess().getRemovedInterfaceAssignment_2_1_0_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OO_modifier__Group_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_1__0__Impl
	rule__OO_modifier__Group_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getInterfaceKeyword_2_1_1_0()); }
	'interface'
	{ after(grammarAccess.getOO_modifierAccess().getInterfaceKeyword_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_1__1__Impl
	rule__OO_modifier__Group_2_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getInterfaceAssignment_2_1_1_1()); }
	(rule__OO_modifier__InterfaceAssignment_2_1_1_1)
	{ after(grammarAccess.getOO_modifierAccess().getInterfaceAssignment_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_1__2__Impl
	rule__OO_modifier__Group_2_1_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getLeftCurlyBracketKeyword_2_1_1_2()); }
	'{'
	{ after(grammarAccess.getOO_modifierAccess().getLeftCurlyBracketKeyword_2_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_1__3__Impl
	rule__OO_modifier__Group_2_1_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getInterface_modifier_fragmentAssignment_2_1_1_3()); }
	(rule__OO_modifier__Interface_modifier_fragmentAssignment_2_1_1_3)*
	{ after(grammarAccess.getOO_modifierAccess().getInterface_modifier_fragmentAssignment_2_1_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OO_modifier__Group_2_1_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Group_2_1_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOO_modifierAccess().getRightCurlyBracketKeyword_2_1_1_4()); }
	'}'
	{ after(grammarAccess.getOO_modifierAccess().getRightCurlyBracketKeyword_2_1_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_modifier_fragment__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_0__0__Impl
	rule__Class_modifier_fragment__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getAddsKeyword_0_0()); }
	'adds'
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getAddsKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getAlternatives_0_1()); }
	(rule__Class_modifier_fragment__Alternatives_0_1)
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getAlternatives_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_modifier_fragment__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_1__0__Impl
	rule__Class_modifier_fragment__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getRemovesKeyword_1_0()); }
	'removes'
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getRemovesKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getAlternatives_1_1()); }
	(rule__Class_modifier_fragment__Alternatives_1_1)
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_modifier_fragment__Group_1_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_1_1_2__0__Impl
	rule__Class_modifier_fragment__Group_1_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getClass_modifier_fragmentAction_1_1_2_0()); }
	()
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getClass_modifier_fragmentAction_1_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_1_1_2__1__Impl
	rule__Class_modifier_fragment__Group_1_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getLeftCurlyBracketKeyword_1_1_2_1()); }
	'{'
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getLeftCurlyBracketKeyword_1_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_1_1_2__2__Impl
	rule__Class_modifier_fragment__Group_1_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigAssignment_1_1_2_2()); }
	(rule__Class_modifier_fragment__MethodsigAssignment_1_1_2_2)*
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigAssignment_1_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1_1_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_1_1_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_1_1_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getRightCurlyBracketKeyword_1_1_2_3()); }
	'}'
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getRightCurlyBracketKeyword_1_1_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class_modifier_fragment__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_2__0__Impl
	rule__Class_modifier_fragment__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getModifiesKeyword_2_0()); }
	'modifies'
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getModifiesKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class_modifier_fragment__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClass_modifier_fragmentAccess().getTrait_exprParserRuleCall_2_1()); }
	ruleTrait_expr
	{ after(grammarAccess.getClass_modifier_fragmentAccess().getTrait_exprParserRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interface_modifier_fragment__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_modifier_fragment__Group_0__0__Impl
	rule__Interface_modifier_fragment__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_modifier_fragment__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_modifier_fragmentAccess().getAddsKeyword_0_0()); }
	'adds'
	{ after(grammarAccess.getInterface_modifier_fragmentAccess().getAddsKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_modifier_fragment__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_modifier_fragment__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_modifier_fragment__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_modifier_fragmentAccess().getMethodsigParserRuleCall_0_1()); }
	ruleMethodsig
	{ after(grammarAccess.getInterface_modifier_fragmentAccess().getMethodsigParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interface_modifier_fragment__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_modifier_fragment__Group_1__0__Impl
	rule__Interface_modifier_fragment__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_modifier_fragment__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_modifier_fragmentAccess().getRemovesKeyword_1_0()); }
	'removes'
	{ after(grammarAccess.getInterface_modifier_fragmentAccess().getRemovesKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_modifier_fragment__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface_modifier_fragment__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_modifier_fragment__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterface_modifier_fragmentAccess().getMethodsigParserRuleCall_1_1()); }
	ruleMethodsig
	{ after(grammarAccess.getInterface_modifier_fragmentAccess().getMethodsigParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Namespace_modifier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Namespace_modifier__Group__0__Impl
	rule__Namespace_modifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace_modifier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamespace_modifierAccess().getAddsKeyword_0()); }
	'adds'
	{ after(grammarAccess.getNamespace_modifierAccess().getAddsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace_modifier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Namespace_modifier__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace_modifier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamespace_modifierAccess().getAlternatives_1()); }
	(rule__Namespace_modifier__Alternatives_1)
	{ after(grammarAccess.getNamespace_modifierAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Update_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Update_decl__Group__0__Impl
	rule__Update_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUpdate_declAccess().getStateupdateKeyword_0()); }
	'stateupdate'
	{ after(grammarAccess.getUpdate_declAccess().getStateupdateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Update_decl__Group__1__Impl
	rule__Update_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUpdate_declAccess().getNameAssignment_1()); }
	(rule__Update_decl__NameAssignment_1)
	{ after(grammarAccess.getUpdate_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Update_decl__Group__2__Impl
	rule__Update_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUpdate_declAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getUpdate_declAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Update_decl__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUpdate_declAccess().getObject_updateAssignment_3()); }
	(rule__Update_decl__Object_updateAssignment_3)*
	{ after(grammarAccess.getUpdate_declAccess().getObject_updateAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Object_update__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__0__Impl
	rule__Object_update__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getObjectupdateKeyword_0()); }
	'objectupdate'
	{ after(grammarAccess.getObject_updateAccess().getObjectupdateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__1__Impl
	rule__Object_update__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getQualifiedNameParserRuleCall_1()); }
	ruleQualifiedName
	{ after(grammarAccess.getObject_updateAccess().getQualifiedNameParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__2__Impl
	rule__Object_update__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getObject_updateAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__3__Impl
	rule__Object_update__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getAwaitKeyword_3()); }
	'await'
	{ after(grammarAccess.getObject_updateAccess().getAwaitKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__4__Impl
	rule__Object_update__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getGuardAssignment_4()); }
	(rule__Object_update__GuardAssignment_4)
	{ after(grammarAccess.getObject_updateAccess().getGuardAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__5__Impl
	rule__Object_update__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getObject_updateAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__6__Impl
	rule__Object_update__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getUpdate_preamble_declarationAssignment_6()); }
	(rule__Object_update__Update_preamble_declarationAssignment_6)*
	{ after(grammarAccess.getObject_updateAccess().getUpdate_preamble_declarationAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__7__Impl
	rule__Object_update__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getPreAssignment_7()); }
	(rule__Object_update__PreAssignment_7)*
	{ after(grammarAccess.getObject_updateAccess().getPreAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__8__Impl
	rule__Object_update__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getClassupdateKeyword_8()); }
	'classupdate'
	{ after(grammarAccess.getObject_updateAccess().getClassupdateKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__9__Impl
	rule__Object_update__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getObject_updateAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__10__Impl
	rule__Object_update__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getPostAssignment_10()); }
	(rule__Object_update__PostAssignment_10)*
	{ after(grammarAccess.getObject_updateAccess().getPostAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_updateAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getObject_updateAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Update_preamble_declaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Update_preamble_declaration__Group__0__Impl
	rule__Update_preamble_declaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_preamble_declaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUpdate_preamble_declarationAccess().getType_expParserRuleCall_0()); }
	ruleType_exp
	{ after(grammarAccess.getUpdate_preamble_declarationAccess().getType_expParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_preamble_declaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Update_preamble_declaration__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_preamble_declaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUpdate_preamble_declarationAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getUpdate_preamble_declarationAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Object_update_assign_stmt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update_assign_stmt__Group__0__Impl
	rule__Object_update_assign_stmt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refAssignment_0()); }
	(rule__Object_update_assign_stmt__Var_or_field_refAssignment_0)
	{ after(grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update_assign_stmt__Group__1__Impl
	rule__Object_update_assign_stmt__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_update_assign_stmtAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getObject_update_assign_stmtAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update_assign_stmt__Group__2__Impl
	rule__Object_update_assign_stmt__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_update_assign_stmtAccess().getExpAssignment_2()); }
	(rule__Object_update_assign_stmt__ExpAssignment_2)
	{ after(grammarAccess.getObject_update_assign_stmtAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object_update_assign_stmt__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObject_update_assign_stmtAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getObject_update_assign_stmtAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Productline_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__0__Impl
	rule__Productline_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getProductlineKeyword_0()); }
	'productline'
	{ after(grammarAccess.getProductline_declAccess().getProductlineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__1__Impl
	rule__Productline_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getNameAssignment_1()); }
	(rule__Productline_decl__NameAssignment_1)
	{ after(grammarAccess.getProductline_declAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__2__Impl
	rule__Productline_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getProductline_declAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__3__Impl
	rule__Productline_decl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getFeaturesKeyword_3()); }
	'features'
	{ after(grammarAccess.getProductline_declAccess().getFeaturesKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__4__Impl
	rule__Productline_decl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getFeatureAssignment_4()); }
	(rule__Productline_decl__FeatureAssignment_4)
	{ after(grammarAccess.getProductline_declAccess().getFeatureAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__5__Impl
	rule__Productline_decl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getGroup_5()); }
	(rule__Productline_decl__Group_5__0)*
	{ after(grammarAccess.getProductline_declAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__6__Impl
	rule__Productline_decl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getProductline_declAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getDelta_clauseAssignment_7()); }
	(rule__Productline_decl__Delta_clauseAssignment_7)*
	{ after(grammarAccess.getProductline_declAccess().getDelta_clauseAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Productline_decl__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group_5__0__Impl
	rule__Productline_decl__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getProductline_declAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Productline_decl__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductline_declAccess().getFeatureAssignment_5_1()); }
	(rule__Productline_decl__FeatureAssignment_5_1)
	{ after(grammarAccess.getProductline_declAccess().getFeatureAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getFeature_declAssignment_0()); }
	(rule__Feature__Feature_declAssignment_0)
	{ after(grammarAccess.getFeatureAccess().getFeature_declAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getPAssignment_1()); }
	(rule__Feature__PAssignment_1)?
	{ after(grammarAccess.getFeatureAccess().getPAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getGroup_2()); }
	(rule__Feature__Group_2__0)?
	{ after(grammarAccess.getFeatureAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2__0__Impl
	rule__Feature__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2_0()); }
	'{'
	{ after(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2__1__Impl
	rule__Feature__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getAttr_assignmentAssignment_2_1()); }
	(rule__Feature__Attr_assignmentAssignment_2_1)
	{ after(grammarAccess.getFeatureAccess().getAttr_assignmentAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2__2__Impl
	rule__Feature__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getGroup_2_2()); }
	(rule__Feature__Group_2_2__0)*
	{ after(grammarAccess.getFeatureAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_2_3()); }
	'}'
	{ after(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2_2__0__Impl
	rule__Feature__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getFeatureAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getAttr_assignmentAssignment_2_2_1()); }
	(rule__Feature__Attr_assignmentAssignment_2_2_1)
	{ after(grammarAccess.getFeatureAccess().getAttr_assignmentAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attr_assignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attr_assignment__Group__0__Impl
	rule__Attr_assignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attr_assignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttr_assignmentAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getAttr_assignmentAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attr_assignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attr_assignment__Group__1__Impl
	rule__Attr_assignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attr_assignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttr_assignmentAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getAttr_assignmentAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attr_assignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attr_assignment__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attr_assignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttr_assignmentAccess().getAlternatives_2()); }
	(rule__Attr_assignment__Alternatives_2)
	{ after(grammarAccess.getAttr_assignmentAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delta_clause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_clause__Group__0__Impl
	rule__Delta_clause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_clauseAccess().getDeltaKeyword_0()); }
	'delta'
	{ after(grammarAccess.getDelta_clauseAccess().getDeltaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_clause__Group__1__Impl
	rule__Delta_clause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_clauseAccess().getDeltaspecAssignment_1()); }
	(rule__Delta_clause__DeltaspecAssignment_1)
	{ after(grammarAccess.getDelta_clauseAccess().getDeltaspecAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_clause__Group__2__Impl
	rule__Delta_clause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_clauseAccess().getAfter_conditionAssignment_2()); }
	(rule__Delta_clause__After_conditionAssignment_2)?
	{ after(grammarAccess.getDelta_clauseAccess().getAfter_conditionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_clause__Group__3__Impl
	rule__Delta_clause__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_clauseAccess().getFrom_conditionAssignment_3()); }
	(rule__Delta_clause__From_conditionAssignment_3)?
	{ after(grammarAccess.getDelta_clauseAccess().getFrom_conditionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_clause__Group__4__Impl
	rule__Delta_clause__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_clauseAccess().getWhen_conditionAssignment_4()); }
	(rule__Delta_clause__When_conditionAssignment_4)?
	{ after(grammarAccess.getDelta_clauseAccess().getWhen_conditionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delta_clause__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelta_clauseAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getDelta_clauseAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Deltaspec_param__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deltaspec_param__Group_0__0__Impl
	rule__Deltaspec_param__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Deltaspec_param__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeltaspec_paramAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getDeltaspec_paramAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deltaspec_param__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deltaspec_param__Group_0__1__Impl
	rule__Deltaspec_param__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Deltaspec_param__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeltaspec_paramAccess().getFullStopKeyword_0_1()); }
	'.'
	{ after(grammarAccess.getDeltaspec_paramAccess().getFullStopKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deltaspec_param__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deltaspec_param__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Deltaspec_param__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeltaspec_paramAccess().getIDTerminalRuleCall_0_2()); }
	RULE_ID
	{ after(grammarAccess.getDeltaspec_paramAccess().getIDTerminalRuleCall_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__After_condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__After_condition__Group__0__Impl
	rule__After_condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAfter_conditionAccess().getAfterKeyword_0()); }
	'after'
	{ after(grammarAccess.getAfter_conditionAccess().getAfterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__After_condition__Group__1__Impl
	rule__After_condition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAfter_conditionAccess().getDelta_idAssignment_1()); }
	(rule__After_condition__Delta_idAssignment_1)
	{ after(grammarAccess.getAfter_conditionAccess().getDelta_idAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__After_condition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAfter_conditionAccess().getGroup_2()); }
	(rule__After_condition__Group_2__0)*
	{ after(grammarAccess.getAfter_conditionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__After_condition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__After_condition__Group_2__0__Impl
	rule__After_condition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAfter_conditionAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getAfter_conditionAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__After_condition__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAfter_conditionAccess().getDelta_idAssignment_2_1()); }
	(rule__After_condition__Delta_idAssignment_2_1)
	{ after(grammarAccess.getAfter_conditionAccess().getDelta_idAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__From_condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__From_condition__Group__0__Impl
	rule__From_condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__From_condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFrom_conditionAccess().getFromKeyword_0()); }
	'from'
	{ after(grammarAccess.getFrom_conditionAccess().getFromKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__From_condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__From_condition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__From_condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFrom_conditionAccess().getApplication_conditionAssignment_1()); }
	(rule__From_condition__Application_conditionAssignment_1)
	{ after(grammarAccess.getFrom_conditionAccess().getApplication_conditionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__When_condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__When_condition__Group__0__Impl
	rule__When_condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__When_condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWhen_conditionAccess().getAlternatives_0()); }
	(rule__When_condition__Alternatives_0)
	{ after(grammarAccess.getWhen_conditionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__When_condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__When_condition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__When_condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWhen_conditionAccess().getApplication_conditionAssignment_1()); }
	(rule__When_condition__Application_conditionAssignment_1)
	{ after(grammarAccess.getWhen_conditionAccess().getApplication_conditionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppOr_exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppOr_exp__Group__0__Impl
	rule__AppOr_exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppOr_expAccess().getAppAnd_expParserRuleCall_0()); }
	ruleAppAnd_exp
	{ after(grammarAccess.getAppOr_expAccess().getAppAnd_expParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppOr_exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppOr_expAccess().getGroup_1()); }
	(rule__AppOr_exp__Group_1__0)*
	{ after(grammarAccess.getAppOr_expAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppOr_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppOr_exp__Group_1__0__Impl
	rule__AppOr_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppOr_expAccess().getAppOr_expLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAppOr_expAccess().getAppOr_expLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppOr_exp__Group_1__1__Impl
	rule__AppOr_exp__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppOr_expAccess().getORORTerminalRuleCall_1_1()); }
	RULE_OROR
	{ after(grammarAccess.getAppOr_expAccess().getORORTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppOr_exp__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppOr_expAccess().getRightAssignment_1_2()); }
	(rule__AppOr_exp__RightAssignment_1_2)
	{ after(grammarAccess.getAppOr_expAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppAnd_exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppAnd_exp__Group__0__Impl
	rule__AppAnd_exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppAnd_expAccess().getAppUnary_expParserRuleCall_0()); }
	ruleAppUnary_exp
	{ after(grammarAccess.getAppAnd_expAccess().getAppUnary_expParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppAnd_exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppAnd_expAccess().getGroup_1()); }
	(rule__AppAnd_exp__Group_1__0)*
	{ after(grammarAccess.getAppAnd_expAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppAnd_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppAnd_exp__Group_1__0__Impl
	rule__AppAnd_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppAnd_expAccess().getAppAnd_expLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAppAnd_expAccess().getAppAnd_expLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppAnd_exp__Group_1__1__Impl
	rule__AppAnd_exp__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppAnd_expAccess().getANDANDTerminalRuleCall_1_1()); }
	RULE_ANDAND
	{ after(grammarAccess.getAppAnd_expAccess().getANDANDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppAnd_exp__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppAnd_expAccess().getRightAssignment_1_2()); }
	(rule__AppAnd_exp__RightAssignment_1_2)
	{ after(grammarAccess.getAppAnd_expAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppUnary_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppUnary_exp__Group_1__0__Impl
	rule__AppUnary_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppUnary_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppUnary_expAccess().getAlternatives_1_0()); }
	(rule__AppUnary_exp__Alternatives_1_0)
	{ after(grammarAccess.getAppUnary_expAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppUnary_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppUnary_exp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppUnary_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppUnary_expAccess().getOperandAssignment_1_1()); }
	(rule__AppUnary_exp__OperandAssignment_1_1)
	{ after(grammarAccess.getAppUnary_expAccess().getOperandAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppPrimary_exp__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppPrimary_exp__Group_0__0__Impl
	rule__AppPrimary_exp__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppPrimary_exp__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppPrimary_expAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getAppPrimary_expAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppPrimary_exp__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppPrimary_exp__Group_0__1__Impl
	rule__AppPrimary_exp__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AppPrimary_exp__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppPrimary_expAccess().getAppOr_expParserRuleCall_0_1()); }
	ruleAppOr_exp
	{ after(grammarAccess.getAppPrimary_expAccess().getAppOr_expParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppPrimary_exp__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppPrimary_exp__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppPrimary_exp__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppPrimary_expAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getAppPrimary_expAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group__0__Impl
	rule__Product_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getProduct_declAction_0()); }
	()
	{ after(grammarAccess.getProduct_declAccess().getProduct_declAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group__1__Impl
	rule__Product_decl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getProductKeyword_1()); }
	'product'
	{ after(grammarAccess.getProduct_declAccess().getProductKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group__2__Impl
	rule__Product_decl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getNameAssignment_2()); }
	(rule__Product_decl__NameAssignment_2)
	{ after(grammarAccess.getProduct_declAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getAlternatives_3()); }
	(rule__Product_decl__Alternatives_3)
	{ after(grammarAccess.getProduct_declAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_decl__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0__0__Impl
	rule__Product_decl__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getLeftParenthesisKeyword_3_0_0()); }
	'('
	{ after(grammarAccess.getProduct_declAccess().getLeftParenthesisKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0__1__Impl
	rule__Product_decl__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getGroup_3_0_1()); }
	(rule__Product_decl__Group_3_0_1__0)?
	{ after(grammarAccess.getProduct_declAccess().getGroup_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0__2__Impl
	rule__Product_decl__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getRightParenthesisKeyword_3_0_2()); }
	')'
	{ after(grammarAccess.getProduct_declAccess().getRightParenthesisKeyword_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getAlternatives_3_0_3()); }
	(rule__Product_decl__Alternatives_3_0_3)
	{ after(grammarAccess.getProduct_declAccess().getAlternatives_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_decl__Group_3_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0_1__0__Impl
	rule__Product_decl__Group_3_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getFeatureAssignment_3_0_1_0()); }
	(rule__Product_decl__FeatureAssignment_3_0_1_0)
	{ after(grammarAccess.getProduct_declAccess().getFeatureAssignment_3_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getGroup_3_0_1_1()); }
	(rule__Product_decl__Group_3_0_1_1__0)*
	{ after(grammarAccess.getProduct_declAccess().getGroup_3_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_decl__Group_3_0_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0_1_1__0__Impl
	rule__Product_decl__Group_3_0_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getCommaKeyword_3_0_1_1_0()); }
	','
	{ after(grammarAccess.getProduct_declAccess().getCommaKeyword_3_0_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getFeatureAssignment_3_0_1_1_1()); }
	(rule__Product_decl__FeatureAssignment_3_0_1_1_1)
	{ after(grammarAccess.getProduct_declAccess().getFeatureAssignment_3_0_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_decl__Group_3_0_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0_3_0__0__Impl
	rule__Product_decl__Group_3_0_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getLeftCurlyBracketKeyword_3_0_3_0_0()); }
	'{'
	{ after(grammarAccess.getProduct_declAccess().getLeftCurlyBracketKeyword_3_0_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0_3_0__1__Impl
	rule__Product_decl__Group_3_0_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getProduct_reconfigurationAssignment_3_0_3_0_1()); }
	(rule__Product_decl__Product_reconfigurationAssignment_3_0_3_0_1)*
	{ after(grammarAccess.getProduct_declAccess().getProduct_reconfigurationAssignment_3_0_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_0_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_0_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getRightCurlyBracketKeyword_3_0_3_0_2()); }
	'}'
	{ after(grammarAccess.getProduct_declAccess().getRightCurlyBracketKeyword_3_0_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_decl__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_1__0__Impl
	rule__Product_decl__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getEqualsSignKeyword_3_1_0()); }
	'='
	{ after(grammarAccess.getProduct_declAccess().getEqualsSignKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_1__1__Impl
	rule__Product_decl__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getProduct_exprAssignment_3_1_1()); }
	(rule__Product_decl__Product_exprAssignment_3_1_1)
	{ after(grammarAccess.getProduct_declAccess().getProduct_exprAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_decl__Group_3_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_declAccess().getSemicolonKeyword_3_1_2()); }
	';'
	{ after(grammarAccess.getProduct_declAccess().getSemicolonKeyword_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductOr_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductOr_expr__Group__0__Impl
	rule__ProductOr_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductOr_exprAccess().getProductAnd_expParserRuleCall_0()); }
	ruleProductAnd_exp
	{ after(grammarAccess.getProductOr_exprAccess().getProductAnd_expParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductOr_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductOr_exprAccess().getGroup_1()); }
	(rule__ProductOr_expr__Group_1__0)*
	{ after(grammarAccess.getProductOr_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductOr_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductOr_expr__Group_1__0__Impl
	rule__ProductOr_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductOr_exprAccess().getProductOr_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getProductOr_exprAccess().getProductOr_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductOr_expr__Group_1__1__Impl
	rule__ProductOr_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductOr_exprAccess().getORORTerminalRuleCall_1_1()); }
	RULE_OROR
	{ after(grammarAccess.getProductOr_exprAccess().getORORTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductOr_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductOr_exprAccess().getRightAssignment_1_2()); }
	(rule__ProductOr_expr__RightAssignment_1_2)
	{ after(grammarAccess.getProductOr_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductAnd_exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductAnd_exp__Group__0__Impl
	rule__ProductAnd_exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductAnd_expAccess().getProductPrimary_expParserRuleCall_0()); }
	ruleProductPrimary_exp
	{ after(grammarAccess.getProductAnd_expAccess().getProductPrimary_expParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductAnd_exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductAnd_expAccess().getGroup_1()); }
	(rule__ProductAnd_exp__Group_1__0)*
	{ after(grammarAccess.getProductAnd_expAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductAnd_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductAnd_exp__Group_1__0__Impl
	rule__ProductAnd_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductAnd_expAccess().getProductAnd_expLeftAction_1_0()); }
	()
	{ after(grammarAccess.getProductAnd_expAccess().getProductAnd_expLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductAnd_exp__Group_1__1__Impl
	rule__ProductAnd_exp__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductAnd_expAccess().getANDANDTerminalRuleCall_1_1()); }
	RULE_ANDAND
	{ after(grammarAccess.getProductAnd_expAccess().getANDANDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductAnd_exp__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductAnd_expAccess().getRightAssignment_1_2()); }
	(rule__ProductAnd_exp__RightAssignment_1_2)
	{ after(grammarAccess.getProductAnd_expAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductMinus_exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductMinus_exp__Group__0__Impl
	rule__ProductMinus_exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductMinus_expAccess().getProductPrimary_expParserRuleCall_0()); }
	ruleProductPrimary_exp
	{ after(grammarAccess.getProductMinus_expAccess().getProductPrimary_expParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductMinus_exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductMinus_expAccess().getGroup_1()); }
	(rule__ProductMinus_exp__Group_1__0)*
	{ after(grammarAccess.getProductMinus_expAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductMinus_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductMinus_exp__Group_1__0__Impl
	rule__ProductMinus_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductMinus_expAccess().getProductMinus_expLeftAction_1_0()); }
	()
	{ after(grammarAccess.getProductMinus_expAccess().getProductMinus_expLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductMinus_exp__Group_1__1__Impl
	rule__ProductMinus_exp__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductMinus_expAccess().getMINUSTerminalRuleCall_1_1()); }
	RULE_MINUS
	{ after(grammarAccess.getProductMinus_expAccess().getMINUSTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductMinus_exp__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductMinus_expAccess().getRightAssignment_1_2()); }
	(rule__ProductMinus_exp__RightAssignment_1_2)
	{ after(grammarAccess.getProductMinus_expAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductPrimary_exp__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductPrimary_exp__Group_0__0__Impl
	rule__ProductPrimary_exp__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductPrimary_exp__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductPrimary_expAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getProductPrimary_expAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductPrimary_exp__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductPrimary_exp__Group_0__1__Impl
	rule__ProductPrimary_exp__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductPrimary_exp__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductPrimary_expAccess().getProductOr_exprParserRuleCall_0_1()); }
	ruleProductOr_expr
	{ after(grammarAccess.getProductPrimary_expAccess().getProductOr_exprParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductPrimary_exp__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductPrimary_exp__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductPrimary_exp__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductPrimary_expAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getProductPrimary_expAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicProduct_expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicProduct_expr__Group_0__0__Impl
	rule__AtomicProduct_expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicProduct_exprAccess().getLeftCurlyBracketKeyword_0_0()); }
	'{'
	{ after(grammarAccess.getAtomicProduct_exprAccess().getLeftCurlyBracketKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicProduct_expr__Group_0__1__Impl
	rule__AtomicProduct_expr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicProduct_exprAccess().getFeatureAssignment_0_1()); }
	(rule__AtomicProduct_expr__FeatureAssignment_0_1)
	{ after(grammarAccess.getAtomicProduct_exprAccess().getFeatureAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicProduct_expr__Group_0__2__Impl
	rule__AtomicProduct_expr__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicProduct_exprAccess().getGroup_0_2()); }
	(rule__AtomicProduct_expr__Group_0_2__0)*
	{ after(grammarAccess.getAtomicProduct_exprAccess().getGroup_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicProduct_expr__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicProduct_exprAccess().getRightCurlyBracketKeyword_0_3()); }
	'}'
	{ after(grammarAccess.getAtomicProduct_exprAccess().getRightCurlyBracketKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicProduct_expr__Group_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicProduct_expr__Group_0_2__0__Impl
	rule__AtomicProduct_expr__Group_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicProduct_exprAccess().getCommaKeyword_0_2_0()); }
	','
	{ after(grammarAccess.getAtomicProduct_exprAccess().getCommaKeyword_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicProduct_expr__Group_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__Group_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicProduct_exprAccess().getFeatureAssignment_0_2_1()); }
	(rule__AtomicProduct_expr__FeatureAssignment_0_2_1)
	{ after(grammarAccess.getAtomicProduct_exprAccess().getFeatureAssignment_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_reconfiguration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group__0__Impl
	rule__Product_reconfiguration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getNameAssignment_0()); }
	(rule__Product_reconfiguration__NameAssignment_0)
	{ after(grammarAccess.getProduct_reconfigurationAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group__1__Impl
	rule__Product_reconfiguration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getDeltaKeyword_1()); }
	'delta'
	{ after(grammarAccess.getProduct_reconfigurationAccess().getDeltaKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group__2__Impl
	rule__Product_reconfiguration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getDelta_idAssignment_2()); }
	(rule__Product_reconfiguration__Delta_idAssignment_2)
	{ after(grammarAccess.getProduct_reconfigurationAccess().getDelta_idAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group__3__Impl
	rule__Product_reconfiguration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getGroup_3()); }
	(rule__Product_reconfiguration__Group_3__0)*
	{ after(grammarAccess.getProduct_reconfigurationAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group__4__Impl
	rule__Product_reconfiguration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getStateupdateKeyword_4()); }
	'stateupdate'
	{ after(grammarAccess.getProduct_reconfigurationAccess().getStateupdateKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group__5__Impl
	rule__Product_reconfiguration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getUpdateAssignment_5()); }
	(rule__Product_reconfiguration__UpdateAssignment_5)
	{ after(grammarAccess.getProduct_reconfigurationAccess().getUpdateAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getProduct_reconfigurationAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Product_reconfiguration__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group_3__0__Impl
	rule__Product_reconfiguration__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getProduct_reconfigurationAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Product_reconfiguration__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProduct_reconfigurationAccess().getDelta_idAssignment_3_1()); }
	(rule__Product_reconfiguration__Delta_idAssignment_3_1)
	{ after(grammarAccess.getProduct_reconfigurationAccess().getDelta_idAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl__Group__0__Impl
	rule__Feature_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_declAccess().getNameAssignment_0()); }
	(rule__Feature_decl__NameAssignment_0)
	{ after(grammarAccess.getFeature_declAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_declAccess().getGroup_1()); }
	(rule__Feature_decl__Group_1__0)?
	{ after(grammarAccess.getFeature_declAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl__Group_1__0__Impl
	rule__Feature_decl__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_declAccess().getLeftCurlyBracketKeyword_1_0()); }
	'{'
	{ after(grammarAccess.getFeature_declAccess().getLeftCurlyBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl__Group_1__1__Impl
	rule__Feature_decl__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_declAccess().getFeature_decl_groupAssignment_1_1()); }
	(rule__Feature_decl__Feature_decl_groupAssignment_1_1)?
	{ after(grammarAccess.getFeature_declAccess().getFeature_decl_groupAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl__Group_1__2__Impl
	rule__Feature_decl__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_declAccess().getAlternatives_1_2()); }
	(rule__Feature_decl__Alternatives_1_2)*
	{ after(grammarAccess.getFeature_declAccess().getAlternatives_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_declAccess().getRightCurlyBracketKeyword_1_3()); }
	'}'
	{ after(grammarAccess.getFeature_declAccess().getRightCurlyBracketKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_group__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group__0__Impl
	rule__Feature_decl_group__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getGroupKeyword_0()); }
	'group'
	{ after(grammarAccess.getFeature_decl_groupAccess().getGroupKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group__1__Impl
	rule__Feature_decl_group__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getAlternatives_1()); }
	(rule__Feature_decl_group__Alternatives_1)
	{ after(grammarAccess.getFeature_decl_groupAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group__2__Impl
	rule__Feature_decl_group__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getFeature_decl_groupAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group__3__Impl
	rule__Feature_decl_group__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getFnodeAssignment_3()); }
	(rule__Feature_decl_group__FnodeAssignment_3)
	{ after(grammarAccess.getFeature_decl_groupAccess().getFnodeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group__4__Impl
	rule__Feature_decl_group__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getGroup_4()); }
	(rule__Feature_decl_group__Group_4__0)*
	{ after(grammarAccess.getFeature_decl_groupAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getFeature_decl_groupAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_group__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group_1_2__0__Impl
	rule__Feature_decl_group__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getLeftSquareBracketKeyword_1_2_0()); }
	'['
	{ after(grammarAccess.getFeature_decl_groupAccess().getLeftSquareBracketKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group_1_2__1__Impl
	rule__Feature_decl_group__Group_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_1()); }
	RULE_INT
	{ after(grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group_1_2__2__Impl
	rule__Feature_decl_group__Group_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getFullStopFullStopKeyword_1_2_2()); }
	'..'
	{ after(grammarAccess.getFeature_decl_groupAccess().getFullStopFullStopKeyword_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group_1_2__3__Impl
	rule__Feature_decl_group__Group_1_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getAlternatives_1_2_3()); }
	(rule__Feature_decl_group__Alternatives_1_2_3)
	{ after(grammarAccess.getFeature_decl_groupAccess().getAlternatives_1_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group_1_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_1_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getRightSquareBracketKeyword_1_2_4()); }
	']'
	{ after(grammarAccess.getFeature_decl_groupAccess().getRightSquareBracketKeyword_1_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_group__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group_4__0__Impl
	rule__Feature_decl_group__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getFeature_decl_groupAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_group__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_groupAccess().getFnodeAssignment_4_1()); }
	(rule__Feature_decl_group__FnodeAssignment_4_1)
	{ after(grammarAccess.getFeature_decl_groupAccess().getFnodeAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Fnode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fnode__Group__0__Impl
	rule__Fnode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fnode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFnodeAccess().getOptKeyword_0()); }
	('opt')?
	{ after(grammarAccess.getFnodeAccess().getOptKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fnode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fnode__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fnode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFnodeAccess().getFeature_declParserRuleCall_1()); }
	ruleFeature_decl
	{ after(grammarAccess.getFnodeAccess().getFeature_declParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_attribute__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__0__Impl
	rule__Feature_decl_attribute__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__1__Impl
	rule__Feature_decl_attribute__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_0_1()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__2__Impl
	rule__Feature_decl_attribute__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getInKeyword_0_2()); }
	'in'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getInKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__3__Impl
	rule__Feature_decl_attribute__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getLeftCurlyBracketKeyword_0_3()); }
	'{'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getLeftCurlyBracketKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__4__Impl
	rule__Feature_decl_attribute__Group_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valAssignment_0_4()); }
	(rule__Feature_decl_attribute__Boundary_valAssignment_0_4)
	{ after(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valAssignment_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__5__Impl
	rule__Feature_decl_attribute__Group_0__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getGroup_0_5()); }
	(rule__Feature_decl_attribute__Group_0_5__0)*
	{ after(grammarAccess.getFeature_decl_attributeAccess().getGroup_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__6__Impl
	rule__Feature_decl_attribute__Group_0__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getRightCurlyBracketKeyword_0_6()); }
	'}'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getRightCurlyBracketKeyword_0_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_0_7()); }
	';'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_0_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_attribute__Group_0_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0_5__0__Impl
	rule__Feature_decl_attribute__Group_0_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getCommaKeyword_0_5_0()); }
	','
	{ after(grammarAccess.getFeature_decl_attributeAccess().getCommaKeyword_0_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_0_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_0_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valAssignment_0_5_1()); }
	(rule__Feature_decl_attribute__Boundary_valAssignment_0_5_1)
	{ after(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valAssignment_0_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_attribute__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__0__Impl
	rule__Feature_decl_attribute__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_1_0()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__1__Impl
	rule__Feature_decl_attribute__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__2__Impl
	rule__Feature_decl_attribute__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getInKeyword_1_2()); }
	'in'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getInKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__3__Impl
	rule__Feature_decl_attribute__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getLeftSquareBracketKeyword_1_3()); }
	'['
	{ after(grammarAccess.getFeature_decl_attributeAccess().getLeftSquareBracketKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__4__Impl
	rule__Feature_decl_attribute__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intAssignment_1_4()); }
	(rule__Feature_decl_attribute__LBoundary_intAssignment_1_4)
	{ after(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__5__Impl
	rule__Feature_decl_attribute__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getFullStopFullStopKeyword_1_5()); }
	'..'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getFullStopFullStopKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__6__Impl
	rule__Feature_decl_attribute__Group_1__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intAssignment_1_6()); }
	(rule__Feature_decl_attribute__UBoundary_intAssignment_1_6)
	{ after(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intAssignment_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__7__Impl
	rule__Feature_decl_attribute__Group_1__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getRightSquareBracketKeyword_1_7()); }
	']'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getRightSquareBracketKeyword_1_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_1__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_1__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_1_8()); }
	';'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_1_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_attribute__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__0__Impl
	rule__Feature_decl_attribute__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_2_0()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__1__Impl
	rule__Feature_decl_attribute__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getLeftSquareBracketKeyword_2_1()); }
	'['
	{ after(grammarAccess.getFeature_decl_attributeAccess().getLeftSquareBracketKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__2__Impl
	rule__Feature_decl_attribute__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intAssignment_2_2()); }
	(rule__Feature_decl_attribute__LBoundary_intAssignment_2_2)
	{ after(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__3__Impl
	rule__Feature_decl_attribute__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getFullStopFullStopKeyword_2_3()); }
	'..'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getFullStopFullStopKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__4__Impl
	rule__Feature_decl_attribute__Group_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intAssignment_2_4()); }
	(rule__Feature_decl_attribute__UBoundary_intAssignment_2_4)
	{ after(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intAssignment_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__5__Impl
	rule__Feature_decl_attribute__Group_2__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getRightSquareBracketKeyword_2_5()); }
	']'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getRightSquareBracketKeyword_2_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__6__Impl
	rule__Feature_decl_attribute__Group_2__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_2_6()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_2_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_2__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_2__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_2_7()); }
	';'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_2_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_attribute__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_3__0__Impl
	rule__Feature_decl_attribute__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getFeature_decl_attributeAction_3_0()); }
	()
	{ after(grammarAccess.getFeature_decl_attributeAccess().getFeature_decl_attributeAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_3__1__Impl
	rule__Feature_decl_attribute__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_3_1()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_3__2__Impl
	rule__Feature_decl_attribute__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_3_2()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_attribute__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_3_3()); }
	';'
	{ after(grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Boundary_val__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Boundary_val__Group__0__Impl
	rule__Boundary_val__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Boundary_val__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBoundary_valAccess().getMINUSTerminalRuleCall_0()); }
	(RULE_MINUS)?
	{ after(grammarAccess.getBoundary_valAccess().getMINUSTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boundary_val__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Boundary_val__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Boundary_val__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBoundary_valAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getBoundary_valAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_constraint__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_0__0__Impl
	rule__Feature_decl_constraint__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getGroup_0_0()); }
	(rule__Feature_decl_constraint__Group_0_0__0)?
	{ after(grammarAccess.getFeature_decl_constraintAccess().getGroup_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_0__1__Impl
	rule__Feature_decl_constraint__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getMexpAssignment_0_1()); }
	(rule__Feature_decl_constraint__MexpAssignment_0_1)
	{ after(grammarAccess.getFeature_decl_constraintAccess().getMexpAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_0_2()); }
	';'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_constraint__Group_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_0_0__0__Impl
	rule__Feature_decl_constraint__Group_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getIfinKeyword_0_0_0()); }
	'ifin'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getIfinKeyword_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_0_0_1()); }
	':'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_constraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_1__0__Impl
	rule__Feature_decl_constraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getIfoutKeyword_1_0()); }
	'ifout'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getIfoutKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_1__1__Impl
	rule__Feature_decl_constraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_1_1()); }
	':'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_1__2__Impl
	rule__Feature_decl_constraint__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getMexpAssignment_1_2()); }
	(rule__Feature_decl_constraint__MexpAssignment_1_2)
	{ after(grammarAccess.getFeature_decl_constraintAccess().getMexpAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_1_3()); }
	';'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_constraint__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_2__0__Impl
	rule__Feature_decl_constraint__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getFeature_decl_constraintAction_2_0()); }
	()
	{ after(grammarAccess.getFeature_decl_constraintAccess().getFeature_decl_constraintAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_2__1__Impl
	rule__Feature_decl_constraint__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getExcludeKeyword_2_1()); }
	'exclude'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getExcludeKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_2__2__Impl
	rule__Feature_decl_constraint__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_2_2()); }
	':'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_2__3__Impl
	rule__Feature_decl_constraint__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_2_3()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_2_4()); }
	';'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature_decl_constraint__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_3__0__Impl
	rule__Feature_decl_constraint__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getFeature_decl_constraintAction_3_0()); }
	()
	{ after(grammarAccess.getFeature_decl_constraintAccess().getFeature_decl_constraintAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_3__1__Impl
	rule__Feature_decl_constraint__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getRequireKeyword_3_1()); }
	'require'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getRequireKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_3__2__Impl
	rule__Feature_decl_constraint__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_3_2()); }
	':'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_3__3__Impl
	rule__Feature_decl_constraint__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_3_3()); }
	RULE_ID
	{ after(grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature_decl_constraint__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_3_4()); }
	';'
	{ after(grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mexp__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_0__0__Impl
	rule__Mexp__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getMexpAction_0_0()); }
	()
	{ after(grammarAccess.getMexpAccess().getMexpAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_0__1__Impl
	rule__Mexp__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_1()); }
	RULE_ID
	{ after(grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_0__2__Impl
	rule__Mexp__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getFullStopKeyword_0_2()); }
	'.'
	{ after(grammarAccess.getMexpAccess().getFullStopKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_3()); }
	RULE_ID
	{ after(grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mexp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_1__0__Impl
	rule__Mexp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getMexpAction_1_0()); }
	()
	{ after(grammarAccess.getMexpAccess().getMexpAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getMexpAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mexp__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_2__0__Impl
	rule__Mexp__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getMexpAction_2_0()); }
	()
	{ after(grammarAccess.getMexpAccess().getMexpAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mexp__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mexp__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getMexpAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpOr_exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpOr_exp__Group__0__Impl
	rule__MexpOr_exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpOr_expAccess().getMexpAnd_exprParserRuleCall_0()); }
	ruleMexpAnd_expr
	{ after(grammarAccess.getMexpOr_expAccess().getMexpAnd_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpOr_exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpOr_expAccess().getGroup_1()); }
	(rule__MexpOr_exp__Group_1__0)*
	{ after(grammarAccess.getMexpOr_expAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpOr_exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpOr_exp__Group_1__0__Impl
	rule__MexpOr_exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpOr_expAccess().getMexpOr_expLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMexpOr_expAccess().getMexpOr_expLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpOr_exp__Group_1__1__Impl
	rule__MexpOr_exp__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpOr_expAccess().getORORTerminalRuleCall_1_1()); }
	RULE_OROR
	{ after(grammarAccess.getMexpOr_expAccess().getORORTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpOr_exp__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpOr_expAccess().getRightAssignment_1_2()); }
	(rule__MexpOr_exp__RightAssignment_1_2)
	{ after(grammarAccess.getMexpOr_expAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpAnd_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpAnd_expr__Group__0__Impl
	rule__MexpAnd_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAnd_exprAccess().getMexpImplies_exprParserRuleCall_0()); }
	ruleMexpImplies_expr
	{ after(grammarAccess.getMexpAnd_exprAccess().getMexpImplies_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpAnd_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAnd_exprAccess().getGroup_1()); }
	(rule__MexpAnd_expr__Group_1__0)*
	{ after(grammarAccess.getMexpAnd_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpAnd_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpAnd_expr__Group_1__0__Impl
	rule__MexpAnd_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAnd_exprAccess().getMexpAnd_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMexpAnd_exprAccess().getMexpAnd_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpAnd_expr__Group_1__1__Impl
	rule__MexpAnd_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAnd_exprAccess().getANDANDTerminalRuleCall_1_1()); }
	RULE_ANDAND
	{ after(grammarAccess.getMexpAnd_exprAccess().getANDANDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpAnd_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAnd_exprAccess().getRightAssignment_1_2()); }
	(rule__MexpAnd_expr__RightAssignment_1_2)
	{ after(grammarAccess.getMexpAnd_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpImplies_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpImplies_expr__Group__0__Impl
	rule__MexpImplies_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpImplies_exprAccess().getMexpEquality_exprParserRuleCall_0()); }
	ruleMexpEquality_expr
	{ after(grammarAccess.getMexpImplies_exprAccess().getMexpEquality_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpImplies_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpImplies_exprAccess().getGroup_1()); }
	(rule__MexpImplies_expr__Group_1__0)*
	{ after(grammarAccess.getMexpImplies_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpImplies_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpImplies_expr__Group_1__0__Impl
	rule__MexpImplies_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpImplies_exprAccess().getMexpImplies_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMexpImplies_exprAccess().getMexpImplies_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpImplies_expr__Group_1__1__Impl
	rule__MexpImplies_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpImplies_exprAccess().getOpAssignment_1_1()); }
	(rule__MexpImplies_expr__OpAssignment_1_1)
	{ after(grammarAccess.getMexpImplies_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpImplies_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpImplies_exprAccess().getRightAssignment_1_2()); }
	(rule__MexpImplies_expr__RightAssignment_1_2)
	{ after(grammarAccess.getMexpImplies_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpEquality_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpEquality_expr__Group__0__Impl
	rule__MexpEquality_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpEquality_exprAccess().getMexpComparison_exprParserRuleCall_0()); }
	ruleMexpComparison_expr
	{ after(grammarAccess.getMexpEquality_exprAccess().getMexpComparison_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpEquality_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpEquality_exprAccess().getGroup_1()); }
	(rule__MexpEquality_expr__Group_1__0)*
	{ after(grammarAccess.getMexpEquality_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpEquality_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpEquality_expr__Group_1__0__Impl
	rule__MexpEquality_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpEquality_exprAccess().getMexpEquality_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMexpEquality_exprAccess().getMexpEquality_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpEquality_expr__Group_1__1__Impl
	rule__MexpEquality_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpEquality_exprAccess().getOpAssignment_1_1()); }
	(rule__MexpEquality_expr__OpAssignment_1_1)
	{ after(grammarAccess.getMexpEquality_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpEquality_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpEquality_exprAccess().getRightAssignment_1_2()); }
	(rule__MexpEquality_expr__RightAssignment_1_2)
	{ after(grammarAccess.getMexpEquality_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpComparison_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpComparison_expr__Group__0__Impl
	rule__MexpComparison_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpComparison_exprAccess().getMexpPlusOrMinus_exprParserRuleCall_0()); }
	ruleMexpPlusOrMinus_expr
	{ after(grammarAccess.getMexpComparison_exprAccess().getMexpPlusOrMinus_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpComparison_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpComparison_exprAccess().getGroup_1()); }
	(rule__MexpComparison_expr__Group_1__0)*
	{ after(grammarAccess.getMexpComparison_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpComparison_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpComparison_expr__Group_1__0__Impl
	rule__MexpComparison_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpComparison_exprAccess().getMexpComparison_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMexpComparison_exprAccess().getMexpComparison_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpComparison_expr__Group_1__1__Impl
	rule__MexpComparison_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpComparison_exprAccess().getOpAssignment_1_1()); }
	(rule__MexpComparison_expr__OpAssignment_1_1)
	{ after(grammarAccess.getMexpComparison_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpComparison_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpComparison_exprAccess().getRightAssignment_1_2()); }
	(rule__MexpComparison_expr__RightAssignment_1_2)
	{ after(grammarAccess.getMexpComparison_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpPlusOrMinus_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPlusOrMinus_expr__Group__0__Impl
	rule__MexpPlusOrMinus_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getMexpMulDivOrMod_exprParserRuleCall_0()); }
	ruleMexpMulDivOrMod_expr
	{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getMexpMulDivOrMod_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPlusOrMinus_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getGroup_1()); }
	(rule__MexpPlusOrMinus_expr__Group_1__0)*
	{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpPlusOrMinus_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPlusOrMinus_expr__Group_1__0__Impl
	rule__MexpPlusOrMinus_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getMexpPlusOrMinus_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getMexpPlusOrMinus_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPlusOrMinus_expr__Group_1__1__Impl
	rule__MexpPlusOrMinus_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpAssignment_1_1()); }
	(rule__MexpPlusOrMinus_expr__OpAssignment_1_1)
	{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPlusOrMinus_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getRightAssignment_1_2()); }
	(rule__MexpPlusOrMinus_expr__RightAssignment_1_2)
	{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpMulDivOrMod_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpMulDivOrMod_expr__Group__0__Impl
	rule__MexpMulDivOrMod_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getMexpPrimary_exprParserRuleCall_0()); }
	ruleMexpPrimary_expr
	{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getMexpPrimary_exprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpMulDivOrMod_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getGroup_1()); }
	(rule__MexpMulDivOrMod_expr__Group_1__0)*
	{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpMulDivOrMod_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpMulDivOrMod_expr__Group_1__0__Impl
	rule__MexpMulDivOrMod_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getMexpMulDivOrMod_exprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getMexpMulDivOrMod_exprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpMulDivOrMod_expr__Group_1__1__Impl
	rule__MexpMulDivOrMod_expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpAssignment_1_1()); }
	(rule__MexpMulDivOrMod_expr__OpAssignment_1_1)
	{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpMulDivOrMod_expr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getRightAssignment_1_2()); }
	(rule__MexpMulDivOrMod_expr__RightAssignment_1_2)
	{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpPrimary_expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPrimary_expr__Group_0__0__Impl
	rule__MexpPrimary_expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPrimary_exprAccess().getMexpPrimary_exprAction_0_0()); }
	()
	{ after(grammarAccess.getMexpPrimary_exprAccess().getMexpPrimary_exprAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPrimary_expr__Group_0__1__Impl
	rule__MexpPrimary_expr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPrimary_exprAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getMexpPrimary_exprAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPrimary_expr__Group_0__2__Impl
	rule__MexpPrimary_expr__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPrimary_exprAccess().getAAssignment_0_2()); }
	(rule__MexpPrimary_expr__AAssignment_0_2)
	{ after(grammarAccess.getMexpPrimary_exprAccess().getAAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPrimary_expr__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPrimary_exprAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getMexpPrimary_exprAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpPrimary_expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPrimary_expr__Group_1__0__Impl
	rule__MexpPrimary_expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPrimary_exprAccess().getMexpPrimary_exprAction_1_0()); }
	()
	{ after(grammarAccess.getMexpPrimary_exprAccess().getMexpPrimary_exprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpPrimary_expr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpPrimary_exprAccess().getAlternatives_1_1()); }
	(rule__MexpPrimary_expr__Alternatives_1_1)
	{ after(grammarAccess.getMexpPrimary_exprAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MexpAtomic_expr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpAtomic_expr__Group__0__Impl
	rule__MexpAtomic_expr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAtomic_expr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAtomic_exprAccess().getMexpAction_0()); }
	()
	{ after(grammarAccess.getMexpAtomic_exprAccess().getMexpAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAtomic_expr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MexpAtomic_expr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAtomic_expr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMexpAtomic_exprAccess().getValueAssignment_1()); }
	(rule__MexpAtomic_expr__ValueAssignment_1)
	{ after(grammarAccess.getMexpAtomic_exprAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Fextension__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fextension__Group__0__Impl
	rule__Fextension__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFextensionAccess().getFextensionAction_0()); }
	()
	{ after(grammarAccess.getFextensionAccess().getFextensionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fextension__Group__1__Impl
	rule__Fextension__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFextensionAccess().getNameAssignment_1()); }
	(rule__Fextension__NameAssignment_1)
	{ after(grammarAccess.getFextensionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fextension__Group__2__Impl
	rule__Fextension__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFextensionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getFextensionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fextension__Group__3__Impl
	rule__Fextension__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFextensionAccess().getFeature_decl_groupAssignment_3()); }
	(rule__Fextension__Feature_decl_groupAssignment_3)?
	{ after(grammarAccess.getFextensionAccess().getFeature_decl_groupAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fextension__Group__4__Impl
	rule__Fextension__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFextensionAccess().getAlternatives_4()); }
	(rule__Fextension__Alternatives_4)*
	{ after(grammarAccess.getFextensionAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fextension__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFextensionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getFextensionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compilation_Unit__ModuleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getModuleModule_declParserRuleCall_1_0()); }
		ruleModule_decl
		{ after(grammarAccess.getCompilation_UnitAccess().getModuleModule_declParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__DeltaDeclAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getDeltaDeclDelta_declParserRuleCall_2_0()); }
		ruleDelta_decl
		{ after(grammarAccess.getCompilation_UnitAccess().getDeltaDeclDelta_declParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Update_declAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getUpdate_declUpdate_declParserRuleCall_3_0()); }
		ruleUpdate_decl
		{ after(grammarAccess.getCompilation_UnitAccess().getUpdate_declUpdate_declParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Productline_declAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getProductline_declProductline_declParserRuleCall_4_0()); }
		ruleProductline_decl
		{ after(grammarAccess.getCompilation_UnitAccess().getProductline_declProductline_declParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Product_declAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getProduct_declProduct_declParserRuleCall_5_0()); }
		ruleProduct_decl
		{ after(grammarAccess.getCompilation_UnitAccess().getProduct_declProduct_declParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__Feature_declAssignment_6_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getFeature_declFeature_declParserRuleCall_6_0_1_0()); }
		ruleFeature_decl
		{ after(grammarAccess.getCompilation_UnitAccess().getFeature_declFeature_declParserRuleCall_6_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compilation_Unit__FextensionAssignment_6_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompilation_UnitAccess().getFextensionFextensionParserRuleCall_6_1_1_0()); }
		ruleFextension
		{ after(grammarAccess.getCompilation_UnitAccess().getFextensionFextensionParserRuleCall_6_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getModule_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Module_exportAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_declAccess().getModule_exportModule_exportParserRuleCall_3_0()); }
		ruleModule_export
		{ after(grammarAccess.getModule_declAccess().getModule_exportModule_exportParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Module_importAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_declAccess().getModule_importModule_importParserRuleCall_4_0()); }
		ruleModule_import
		{ after(grammarAccess.getModule_declAccess().getModule_importModule_importParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__DeclAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_declAccess().getDeclDeclParserRuleCall_5_0()); }
		ruleDecl
		{ after(grammarAccess.getModule_declAccess().getDeclDeclParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_decl__Main_blockAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_declAccess().getMain_blockMain_blockParserRuleCall_6_0()); }
		ruleMain_block
		{ after(grammarAccess.getModule_declAccess().getMain_blockMain_blockParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__StarAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_exportAccess().getStarMULTTerminalRuleCall_2_0_0()); }
		RULE_MULT
		{ after(grammarAccess.getModule_exportAccess().getStarMULTTerminalRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__AnyPackageAssignment_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_exportAccess().getAnyPackageQualifiedNameParserRuleCall_2_1_0_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getModule_exportAccess().getAnyPackageQualifiedNameParserRuleCall_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__AnyPackageAssignment_2_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_exportAccess().getAnyPackageQualifiedNameParserRuleCall_2_1_1_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getModule_exportAccess().getAnyPackageQualifiedNameParserRuleCall_2_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_export__ImportedNamespaceAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_exportAccess().getImportedNamespaceQualifiedNameParserRuleCall_3_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getModule_exportAccess().getImportedNamespaceQualifiedNameParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__StarAssignment_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_importAccess().getStarMULTTerminalRuleCall_1_0_0_0()); }
		RULE_MULT
		{ after(grammarAccess.getModule_importAccess().getStarMULTTerminalRuleCall_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__ImportedNamespaceAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_importAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getModule_importAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__NameAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_importAccess().getNameQualifiedNameParserRuleCall_1_1_0_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getModule_importAccess().getNameQualifiedNameParserRuleCall_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__NameAssignment_1_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_importAccess().getNameQualifiedNameParserRuleCall_1_1_1_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getModule_importAccess().getNameQualifiedNameParserRuleCall_1_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module_import__ImportedNamespaceAssignment_1_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModule_importAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_2_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getModule_importAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__Type_useAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPar_function_declAccess().getType_useType_useParserRuleCall_1_0()); }
		ruleType_use
		{ after(grammarAccess.getPar_function_declAccess().getType_useType_useParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPar_function_declAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getPar_function_declAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__PAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPar_function_declAccess().getPIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPar_function_declAccess().getPIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__PAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPar_function_declAccess().getPIDTerminalRuleCall_3_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPar_function_declAccess().getPIDTerminalRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__FunctionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPar_function_declAccess().getFunctionsFunction_name_listParserRuleCall_5_0()); }
		ruleFunction_name_list
		{ after(grammarAccess.getPar_function_declAccess().getFunctionsFunction_name_listParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__ParamsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPar_function_declAccess().getParamsParam_listParserRuleCall_7_0()); }
		ruleParam_list
		{ after(grammarAccess.getPar_function_declAccess().getParamsParam_listParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Par_function_decl__EAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPar_function_declAccess().getEPure_expParserRuleCall_9_0()); }
		rulePure_exp
		{ after(grammarAccess.getPar_function_declAccess().getEPure_expParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Function_name_declAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_name_listAccess().getFunction_name_declFunction_name_declParserRuleCall_1_0_0()); }
		ruleFunction_name_decl
		{ after(grammarAccess.getFunction_name_listAccess().getFunction_name_declFunction_name_declParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_list__Function_name_declAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_name_listAccess().getFunction_name_declFunction_name_declParserRuleCall_1_1_1_0()); }
		ruleFunction_name_decl
		{ after(grammarAccess.getFunction_name_listAccess().getFunction_name_declFunction_name_declParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_decl__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_name_declAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getFunction_name_declAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataType_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataType_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__PAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataType_declAccess().getPIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataType_declAccess().getPIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__PAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataType_declAccess().getPIDTerminalRuleCall_2_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataType_declAccess().getPIDTerminalRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Data_constructorAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataType_declAccess().getData_constructorData_constructorParserRuleCall_3_1_0()); }
		ruleData_constructor
		{ after(grammarAccess.getDataType_declAccess().getData_constructorData_constructorParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType_decl__Data_constructorAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataType_declAccess().getData_constructorData_constructorParserRuleCall_3_2_1_0()); }
		ruleData_constructor
		{ after(grammarAccess.getDataType_declAccess().getData_constructorData_constructorParserRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getData_constructorAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getData_constructorAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Data_constructor_argAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getData_constructorAccess().getData_constructor_argData_constructor_argParserRuleCall_1_1_0()); }
		ruleData_constructor_arg
		{ after(grammarAccess.getData_constructorAccess().getData_constructor_argData_constructor_argParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data_constructor__Data_constructor_argAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getData_constructorAccess().getData_constructor_argData_constructor_argParserRuleCall_1_2_1_0()); }
		ruleData_constructor_arg
		{ after(grammarAccess.getData_constructorAccess().getData_constructor_argData_constructor_argParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Pure_expAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getPure_expPure_expParserRuleCall_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getAnnotationAccess().getPure_expPure_expParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getType_useAccess().getNameQualifiedNameParserRuleCall_0_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getType_useAccess().getNameQualifiedNameParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Type_useAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getType_useAccess().getType_useType_useParserRuleCall_1_1_0()); }
		ruleType_use
		{ after(grammarAccess.getType_useAccess().getType_useType_useParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_use__Type_useAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getType_useAccess().getType_useType_useParserRuleCall_1_2_1_0()); }
		ruleType_use
		{ after(grammarAccess.getType_useAccess().getType_useType_useParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Pure_exp_listAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getPure_exp_listPure_exp_listParserRuleCall_0_2_0()); }
		rulePure_exp_list
		{ after(grammarAccess.getPure_expAccess().getPure_exp_listPure_exp_listParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Function_listAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getFunction_listFunction_listParserRuleCall_1_2_0()); }
		ruleFunction_list
		{ after(grammarAccess.getPure_expAccess().getFunction_listFunction_listParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Partial_function_pure_exp_listAssignment_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getPartial_function_pure_exp_listPure_exp_listParserRuleCall_1_5_0()); }
		rulePure_exp_list
		{ after(grammarAccess.getPure_expAccess().getPartial_function_pure_exp_listPure_exp_listParserRuleCall_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Variadic_exp_listAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getVariadic_exp_listPure_exp_listParserRuleCall_2_2_0()); }
		rulePure_exp_list
		{ after(grammarAccess.getPure_expAccess().getVariadic_exp_listPure_exp_listParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__IfAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getIfPure_expParserRuleCall_4_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_expAccess().getIfPure_expParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__ThenAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getThenPure_expParserRuleCall_4_3_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_expAccess().getThenPure_expParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__ElseAssignment_4_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getElsePure_expParserRuleCall_4_4_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_expAccess().getElsePure_expParserRuleCall_4_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__CaseAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getCasePure_expParserRuleCall_5_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_expAccess().getCasePure_expParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__CasebranchAssignment_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getCasebranchCase_branchParserRuleCall_5_3_0()); }
		ruleCase_branch
		{ after(grammarAccess.getPure_expAccess().getCasebranchCase_branchParserRuleCall_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__Type_useAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getType_useType_useParserRuleCall_6_2_0()); }
		ruleType_use
		{ after(grammarAccess.getPure_expAccess().getType_useType_useParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__ValueAssignment_6_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getValueIDTerminalRuleCall_6_3_0()); }
		RULE_ID
		{ after(grammarAccess.getPure_expAccess().getValueIDTerminalRuleCall_6_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__IAssignment_6_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getIPure_expParserRuleCall_6_6_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_expAccess().getIPure_expParserRuleCall_6_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp__BAssignment_6_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_expAccess().getBPure_expParserRuleCall_6_8_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_expAccess().getBPure_expParserRuleCall_6_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOr_exprAccess().getOpORORTerminalRuleCall_1_1_0()); }
		RULE_OROR
		{ after(grammarAccess.getOr_exprAccess().getOpORORTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); }
		ruleAnd_expr
		{ after(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnd_exprAccess().getOpANDANDTerminalRuleCall_1_1_0()); }
		RULE_ANDAND
		{ after(grammarAccess.getAnd_exprAccess().getOpANDANDTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__And_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnd_exprAccess().getRightEquality_exprParserRuleCall_1_2_0()); }
		ruleEquality_expr
		{ after(grammarAccess.getAnd_exprAccess().getRightEquality_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEquality_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__Equality_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getEquality_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEquality_exprAccess().getRightComparison_exprParserRuleCall_1_2_0()); }
		ruleComparison_expr
		{ after(grammarAccess.getEquality_exprAccess().getRightComparison_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparison_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__Comparison_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getComparison_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparison_exprAccess().getRightPlusOrMinus_exprParserRuleCall_1_2_0()); }
		rulePlusOrMinus_expr
		{ after(grammarAccess.getComparison_exprAccess().getRightPlusOrMinus_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinus_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__PlusOrMinus_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getPlusOrMinus_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinus_exprAccess().getRightMulDivOrMod_exprParserRuleCall_1_2_0()); }
		ruleMulDivOrMod_expr
		{ after(grammarAccess.getPlusOrMinus_exprAccess().getRightMulDivOrMod_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulDivOrMod_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__MulDivOrMod_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getMulDivOrMod_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulDivOrMod_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulDivOrMod_exprAccess().getRightUniary_exprParserRuleCall_1_2_0()); }
		ruleUniary_expr
		{ after(grammarAccess.getMulDivOrMod_exprAccess().getRightUniary_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Uniary_expr__OpAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUniary_exprAccess().getOpAlternatives_0_0_0()); }
		(rule__Uniary_expr__OpAlternatives_0_0_0)
		{ after(grammarAccess.getUniary_exprAccess().getOpAlternatives_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Uniary_expr__Pure_expAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUniary_exprAccess().getPure_expPure_expParserRuleCall_0_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getUniary_exprAccess().getPure_expPure_expParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_or_field_refAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVar_or_field_refAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_or_field_ref__RefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_or_field_refAccess().getRefField_declCrossReference_1_0()); }
		(
			{ before(grammarAccess.getVar_or_field_refAccess().getRefField_declIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVar_or_field_refAccess().getRefField_declIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getVar_or_field_refAccess().getRefField_declCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Case_branch__Pure_expAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCase_branchAccess().getPure_expPure_expParserRuleCall_2_0()); }
		rulePure_exp
		{ after(grammarAccess.getCase_branchAccess().getPure_expPure_expParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__PatternAssignment_1_4_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getPatternPatternParserRuleCall_1_4_1_1_0_0()); }
		rulePattern
		{ after(grammarAccess.getPatternAccess().getPatternPatternParserRuleCall_1_4_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__PatternAssignment_1_4_1_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getPatternPatternParserRuleCall_1_4_1_1_1_1_0()); }
		rulePattern
		{ after(grammarAccess.getPatternAccess().getPatternPatternParserRuleCall_1_4_1_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Pure_expAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_exp_listAccess().getPure_expPure_expParserRuleCall_1_0_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_exp_listAccess().getPure_expPure_expParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pure_exp_list__Pure_expAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPure_exp_listAccess().getPure_expPure_expParserRuleCall_1_1_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getPure_exp_listAccess().getPure_expPure_expParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Function_paramAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_listAccess().getFunction_paramFunction_paramParserRuleCall_1_0_0()); }
		ruleFunction_param
		{ after(grammarAccess.getFunction_listAccess().getFunction_paramFunction_paramParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_list__Function_paramAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_listAccess().getFunction_paramFunction_paramParserRuleCall_1_1_1_0()); }
		ruleFunction_param
		{ after(grammarAccess.getFunction_listAccess().getFunction_paramFunction_paramParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_name_param_decl__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_name_param_declAccess().getValueIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getFunction_name_param_declAccess().getValueIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Anon_function_decl__ParamsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnon_function_declAccess().getParamsParam_listParserRuleCall_0_0()); }
		ruleParam_list
		{ after(grammarAccess.getAnon_function_declAccess().getParamsParam_listParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Anon_function_decl__Pure_expAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnon_function_declAccess().getPure_expPure_expParserRuleCall_2_0()); }
		rulePure_exp
		{ after(grammarAccess.getAnon_function_declAccess().getPure_expPure_expParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Param_declAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParam_listAccess().getParam_declParam_declParserRuleCall_2_0_0()); }
		ruleParam_decl
		{ after(grammarAccess.getParam_listAccess().getParam_declParam_declParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_list__Param_declAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParam_listAccess().getParam_declParam_declParserRuleCall_2_1_1_0()); }
		ruleParam_decl
		{ after(grammarAccess.getParam_listAccess().getParam_declParam_declParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_decl__Type_expAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParam_declAccess().getType_expType_expParserRuleCall_0_0()); }
		ruleType_exp
		{ after(grammarAccess.getParam_declAccess().getType_expType_expParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParam_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParam_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getType_expAccess().getNameQualifiedNameParserRuleCall_0_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getType_expAccess().getNameQualifiedNameParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__PAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getType_expAccess().getPType_useParserRuleCall_1_1_0()); }
		ruleType_use
		{ after(grammarAccess.getType_expAccess().getPType_useParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type_exp__PAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getType_expAccess().getPType_useParserRuleCall_1_2_1_0()); }
		ruleType_use
		{ after(grammarAccess.getType_expAccess().getPType_useParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Type_useAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_declAccess().getType_useType_useParserRuleCall_1_0()); }
		ruleType_use
		{ after(grammarAccess.getFunction_declAccess().getType_useType_useParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_declAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getFunction_declAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__PAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_declAccess().getPIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFunction_declAccess().getPIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__PAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_declAccess().getPIDTerminalRuleCall_3_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFunction_declAccess().getPIDTerminalRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__ParamlistAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_declAccess().getParamlistParam_listParserRuleCall_4_0()); }
		ruleParam_list
		{ after(grammarAccess.getFunction_declAccess().getParamlistParam_listParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function_decl__Pure_expAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunction_declAccess().getPure_expPure_expParserRuleCall_6_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getFunction_declAccess().getPure_expPure_expParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypesyn_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTypesyn_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typesyn_decl__Type_useAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypesyn_declAccess().getType_useType_useParserRuleCall_3_0()); }
		ruleType_use
		{ after(grammarAccess.getTypesyn_declAccess().getType_useType_useParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getException_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getException_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__TypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getException_declAccess().getTypeData_constructor_argCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getException_declAccess().getTypeData_constructor_argIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getException_declAccess().getTypeData_constructor_argIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getException_declAccess().getTypeData_constructor_argCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exception_decl__TypeAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getException_declAccess().getTypeData_constructor_argCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getException_declAccess().getTypeData_constructor_argIDTerminalRuleCall_2_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getException_declAccess().getTypeData_constructor_argIDTerminalRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getException_declAccess().getTypeData_constructor_argCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterface_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInterface_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Interface_nameAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__Interface_nameAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_2_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface_decl__MethodsigAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterface_declAccess().getMethodsigMethodsigParserRuleCall_4_0()); }
		ruleMethodsig
		{ after(grammarAccess.getInterface_declAccess().getMethodsigMethodsigParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__Type_useAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodsigAccess().getType_useType_useParserRuleCall_0_0()); }
		ruleType_use
		{ after(grammarAccess.getMethodsigAccess().getType_useType_useParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodsigAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMethodsigAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methodsig__ParamlistAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodsigAccess().getParamlistParam_listParserRuleCall_2_0()); }
		ruleParam_list
		{ after(grammarAccess.getMethodsigAccess().getParamlistParam_listParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getClass_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__ParamlistAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getParamlistParam_listParserRuleCall_2_0()); }
		ruleParam_list
		{ after(grammarAccess.getClass_declAccess().getParamlistParam_listParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Interface_nameAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getInterface_nameInterface_declCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getClass_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getClass_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getClass_declAccess().getInterface_nameInterface_declCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Interface_nameAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getInterface_nameInterface_declCrossReference_3_2_1_0()); }
		(
			{ before(grammarAccess.getClass_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_3_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getClass_declAccess().getInterface_nameInterface_declQualifiedNameParserRuleCall_3_2_1_0_1()); }
		)
		{ after(grammarAccess.getClass_declAccess().getInterface_nameInterface_declCrossReference_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Field_declAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getField_declField_declParserRuleCall_5_0()); }
		ruleField_decl
		{ after(grammarAccess.getClass_declAccess().getField_declField_declParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__StmtAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getStmtStmtParserRuleCall_6_1_0()); }
		ruleStmt
		{ after(grammarAccess.getClass_declAccess().getStmtStmtParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__CasestmtbranchAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getCasestmtbranchCasestmtbranchParserRuleCall_7_2_0()); }
		ruleCasestmtbranch
		{ after(grammarAccess.getClass_declAccess().getCasestmtbranchCasestmtbranchParserRuleCall_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__Trait_usageAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getTrait_usageTrait_usageParserRuleCall_8_0()); }
		ruleTrait_usage
		{ after(grammarAccess.getClass_declAccess().getTrait_usageTrait_usageParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_decl__MethodAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_declAccess().getMethodMethodParserRuleCall_9_0()); }
		ruleMethod
		{ after(grammarAccess.getClass_declAccess().getMethodMethodParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Type_useAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getField_declAccess().getType_useType_useParserRuleCall_0_0()); }
		ruleType_use
		{ after(grammarAccess.getField_declAccess().getType_useType_useParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getField_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getField_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field_decl__Pure_expAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getField_declAccess().getPure_expPure_expParserRuleCall_2_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getField_declAccess().getPure_expPure_expParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Type_expAssignment_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getType_expType_expParserRuleCall_1_0_0_0()); }
		ruleType_exp
		{ after(grammarAccess.getStmtAccess().getType_expType_expParserRuleCall_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__NameAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getNameIDTerminalRuleCall_1_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStmtAccess().getNameIDTerminalRuleCall_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ExpAssignment_1_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_0_2_1_0()); }
		ruleExp
		{ after(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Var_or_field_refAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getVar_or_field_refVar_or_field_refParserRuleCall_1_1_0_0()); }
		ruleVar_or_field_ref
		{ after(grammarAccess.getStmtAccess().getVar_or_field_refVar_or_field_refParserRuleCall_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ExpAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_1_2_0()); }
		ruleExp
		{ after(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ExpAssignment_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_3_1_0()); }
		ruleExp
		{ after(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ExpAssignment_1_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_4_1_0()); }
		ruleExp
		{ after(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__StmtAssignment_1_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getStmtStmtParserRuleCall_1_5_1_0()); }
		ruleStmt
		{ after(grammarAccess.getStmtAccess().getStmtStmtParserRuleCall_1_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__Pure_expAssignment_1_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getPure_expPure_expParserRuleCall_1_6_2_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getPure_expPure_expParserRuleCall_1_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__IfstmtAssignment_1_6_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getIfstmtStmtParserRuleCall_1_6_4_0()); }
		ruleStmt
		{ after(grammarAccess.getStmtAccess().getIfstmtStmtParserRuleCall_1_6_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ElsestmtAssignment_1_6_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getElsestmtStmtParserRuleCall_1_6_5_1_0()); }
		ruleStmt
		{ after(grammarAccess.getStmtAccess().getElsestmtStmtParserRuleCall_1_6_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ConditionAssignment_1_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getConditionPure_expParserRuleCall_1_7_2_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getConditionPure_expParserRuleCall_1_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__WhilestmtAssignment_1_7_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getWhilestmtStmtParserRuleCall_1_7_4_0()); }
		ruleStmt
		{ after(grammarAccess.getStmtAccess().getWhilestmtStmtParserRuleCall_1_7_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__NameAssignment_1_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getNameIDTerminalRuleCall_1_8_2_0()); }
		RULE_ID
		{ after(grammarAccess.getStmtAccess().getNameIDTerminalRuleCall_1_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__LAssignment_1_8_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getLPure_expParserRuleCall_1_8_4_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getLPure_expParserRuleCall_1_8_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ForeachstmtAssignment_1_8_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getForeachstmtStmtParserRuleCall_1_8_6_0()); }
		ruleStmt
		{ after(grammarAccess.getStmtAccess().getForeachstmtStmtParserRuleCall_1_8_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__TrystmtAssignment_1_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getTrystmtStmtParserRuleCall_1_9_1_0()); }
		ruleStmt
		{ after(grammarAccess.getStmtAccess().getTrystmtStmtParserRuleCall_1_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__CasestmtbranchAssignment_1_9_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_0_1_0()); }
		ruleCasestmtbranch
		{ after(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__CasestmtbranchAssignment_1_9_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_1_0()); }
		ruleCasestmtbranch
		{ after(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__StmtAssignment_1_9_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getStmtStmtParserRuleCall_1_9_4_1_0()); }
		ruleStmt
		{ after(grammarAccess.getStmtAccess().getStmtStmtParserRuleCall_1_9_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__RefAssignment_1_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getRefGuardParserRuleCall_1_10_1_0()); }
		ruleGuard
		{ after(grammarAccess.getStmtAccess().getRefGuardParserRuleCall_1_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__FAssignment_1_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getFPure_expParserRuleCall_1_12_2_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getFPure_expParserRuleCall_1_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__TAssignment_1_12_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getTPure_expParserRuleCall_1_12_4_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getTPure_expParserRuleCall_1_12_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ThrowPureExpAssignment_1_13_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getThrowPureExpPure_expParserRuleCall_1_13_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getThrowPureExpPure_expParserRuleCall_1_13_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__DiePureExpAssignment_1_14_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getDiePureExpPure_expParserRuleCall_1_14_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getDiePureExpPure_expParserRuleCall_1_14_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__MoveCogToAssignment_1_15_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getMoveCogToPure_expParserRuleCall_1_15_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getMoveCogToPure_expParserRuleCall_1_15_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__ExpAssignment_1_16_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_16_0_0()); }
		ruleExp
		{ after(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_16_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__CAssignment_1_17_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getCPure_expParserRuleCall_1_17_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getStmtAccess().getCPure_expParserRuleCall_1_17_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stmt__CasestmtbranchAssignment_1_17_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_17_3_0()); }
		ruleCasestmtbranch
		{ after(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_17_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__LAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getLLocalKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getEff_exprAccess().getLLocalKeyword_1_1_0()); }
			'local'
			{ after(grammarAccess.getEff_exprAccess().getLLocalKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getEff_exprAccess().getLLocalKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__Pure_exp_listAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getPure_exp_listPure_exp_listParserRuleCall_1_4_0()); }
		rulePure_exp_list
		{ after(grammarAccess.getEff_exprAccess().getPure_exp_listPure_exp_listParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__AwaitAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getAwaitIDTerminalRuleCall_2_3_0()); }
		RULE_ID
		{ after(grammarAccess.getEff_exprAccess().getAwaitIDTerminalRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__ListAssignment_2_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_2_5_0()); }
		rulePure_exp_list
		{ after(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_2_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__ValAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getValIDTerminalRuleCall_3_2_0()); }
		RULE_ID
		{ after(grammarAccess.getEff_exprAccess().getValIDTerminalRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__ListAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_3_4_0()); }
		rulePure_exp_list
		{ after(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Eff_expr__ListAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_4_3_0()); }
		rulePure_exp_list
		{ after(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_id__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_idAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getDelta_idAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__RefAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuardAccess().getRefVar_or_field_refParserRuleCall_0_0_0()); }
		ruleVar_or_field_ref
		{ after(grammarAccess.getGuardAccess().getRefVar_or_field_refParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__MinAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuardAccess().getMinPure_expParserRuleCall_1_2_0()); }
		rulePure_exp
		{ after(grammarAccess.getGuardAccess().getMinPure_expParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guard__MaxAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuardAccess().getMaxPure_expParserRuleCall_1_4_0()); }
		rulePure_exp
		{ after(grammarAccess.getGuardAccess().getMaxPure_expParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndGuardAccess().getOpAmpersandKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getAndGuardAccess().getOpAmpersandKeyword_1_1_0()); }
			'&'
			{ after(grammarAccess.getAndGuardAccess().getOpAmpersandKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getAndGuardAccess().getOpAmpersandKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndGuard__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndGuardAccess().getRightPrimaryGuardParserRuleCall_1_2_0()); }
		rulePrimaryGuard
		{ after(grammarAccess.getAndGuardAccess().getRightPrimaryGuardParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryGuard__GuardAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryGuardAccess().getGuardPure_expParserRuleCall_1_0()); }
		rulePure_exp
		{ after(grammarAccess.getPrimaryGuardAccess().getGuardPure_expParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Casestmtbranch__PatternAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCasestmtbranchAccess().getPatternPatternParserRuleCall_0_0()); }
		rulePattern
		{ after(grammarAccess.getCasestmtbranchAccess().getPatternPatternParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Casestmtbranch__StmtAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCasestmtbranchAccess().getStmtStmtParserRuleCall_2_0()); }
		ruleStmt
		{ after(grammarAccess.getCasestmtbranchAccess().getStmtStmtParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_usage__TraitUsageAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_usageAccess().getTraitUsageTrait_declCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTrait_usageAccess().getTraitUsageTrait_declQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTrait_usageAccess().getTraitUsageTrait_declQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTrait_usageAccess().getTraitUsageTrait_declCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__MethodAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_exprAccess().getMethodMethodParserRuleCall_0_2_0()); }
		ruleMethod
		{ after(grammarAccess.getTrait_exprAccess().getMethodMethodParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__TraitMethodAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_exprAccess().getTraitMethodMethodParserRuleCall_1_0()); }
		ruleMethod
		{ after(grammarAccess.getTrait_exprAccess().getTraitMethodMethodParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_expr__TraitNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_exprAccess().getTraitNameTrait_declCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTrait_exprAccess().getTraitNameTrait_declQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTrait_exprAccess().getTraitNameTrait_declQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTrait_exprAccess().getTraitNameTrait_declCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_Left_expr__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_Left_exprAccess().getOpTrait_operParserRuleCall_0_0()); }
		ruleTrait_oper
		{ after(grammarAccess.getTrait_Left_exprAccess().getOpTrait_operParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_Left_expr__Trait_exprAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_Left_exprAccess().getTrait_exprPrimary_Trait_exprParserRuleCall_1_0()); }
		rulePrimary_Trait_expr
		{ after(grammarAccess.getTrait_Left_exprAccess().getTrait_exprPrimary_Trait_exprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__MethodAssignment_0_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_operAccess().getMethodMethodsigCrossReference_0_2_0_0()); }
		(
			{ before(grammarAccess.getTrait_operAccess().getMethodMethodsigQualifiedNameParserRuleCall_0_2_0_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTrait_operAccess().getMethodMethodsigQualifiedNameParserRuleCall_0_2_0_0_1()); }
		)
		{ after(grammarAccess.getTrait_operAccess().getMethodMethodsigCrossReference_0_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__MethodsigAssignment_0_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_operAccess().getMethodsigMethodsigCrossReference_0_2_1_1_0()); }
		(
			{ before(grammarAccess.getTrait_operAccess().getMethodsigMethodsigQualifiedNameParserRuleCall_0_2_1_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTrait_operAccess().getMethodsigMethodsigQualifiedNameParserRuleCall_0_2_1_1_0_1()); }
		)
		{ after(grammarAccess.getTrait_operAccess().getMethodsigMethodsigCrossReference_0_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Trait_exprAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_operAccess().getTrait_exprTrait_exprParserRuleCall_1_1_0()); }
		ruleTrait_expr
		{ after(grammarAccess.getTrait_operAccess().getTrait_exprTrait_exprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_oper__Trait_expAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_operAccess().getTrait_expTrait_exprParserRuleCall_2_1_0()); }
		ruleTrait_expr
		{ after(grammarAccess.getTrait_operAccess().getTrait_expTrait_exprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Type_useAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodAccess().getType_useType_useParserRuleCall_0_0()); }
		ruleType_use
		{ after(grammarAccess.getMethodAccess().getType_useType_useParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__ParamlistAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodAccess().getParamlistParam_listParserRuleCall_2_0()); }
		ruleParam_list
		{ after(grammarAccess.getMethodAccess().getParamlistParam_listParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__StmtAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodAccess().getStmtStmtParserRuleCall_4_0()); }
		ruleStmt
		{ after(grammarAccess.getMethodAccess().getStmtStmtParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTrait_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Trait_decl__TraitExprAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrait_declAccess().getTraitExprTrait_exprParserRuleCall_3_0()); }
		ruleTrait_expr
		{ after(grammarAccess.getTrait_declAccess().getTraitExprTrait_exprParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Main_block__StmtAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMain_blockAccess().getStmtStmtParserRuleCall_2_0()); }
		ruleStmt
		{ after(grammarAccess.getMain_blockAccess().getStmtStmtParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDelta_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__PAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_declAccess().getPDelta_paramParserRuleCall_2_1_0()); }
		ruleDelta_param
		{ after(grammarAccess.getDelta_declAccess().getPDelta_paramParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__PAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_declAccess().getPDelta_paramParserRuleCall_2_2_1_0()); }
		ruleDelta_param
		{ after(grammarAccess.getDelta_declAccess().getPDelta_paramParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Delta_accessAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_declAccess().getDelta_accessDelta_accessParserRuleCall_4_0()); }
		ruleDelta_access
		{ after(grammarAccess.getDelta_declAccess().getDelta_accessDelta_accessParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_decl__Module_modifierAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_declAccess().getModule_modifierModule_modifierParserRuleCall_5_0()); }
		ruleModule_modifier
		{ after(grammarAccess.getDelta_declAccess().getModule_modifierModule_modifierParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__FieldAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHas_conditionAccess().getFieldField_declCrossReference_0_1_0()); }
		(
			{ before(grammarAccess.getHas_conditionAccess().getFieldField_declIDTerminalRuleCall_0_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getHas_conditionAccess().getFieldField_declIDTerminalRuleCall_0_1_0_1()); }
		)
		{ after(grammarAccess.getHas_conditionAccess().getFieldField_declCrossReference_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__MethodAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHas_conditionAccess().getMethodMethodsigCrossReference_1_1_0()); }
		(
			{ before(grammarAccess.getHas_conditionAccess().getMethodMethodsigIDTerminalRuleCall_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getHas_conditionAccess().getMethodMethodsigIDTerminalRuleCall_1_1_0_1()); }
		)
		{ after(grammarAccess.getHas_conditionAccess().getMethodMethodsigCrossReference_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Has_condition__InterfaceAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHas_conditionAccess().getInterfaceInterface_declCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getHas_conditionAccess().getInterfaceInterface_declIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getHas_conditionAccess().getInterfaceInterface_declIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getHas_conditionAccess().getInterfaceInterface_declCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_access__Module_refAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_accessAccess().getModule_refModule_declCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDelta_accessAccess().getModule_refModule_declIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDelta_accessAccess().getModule_refModule_declIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDelta_accessAccess().getModule_refModule_declCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Class_declAssignment_0_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getClass_declClass_declParserRuleCall_0_2_0_0()); }
		ruleClass_decl
		{ after(grammarAccess.getOO_modifierAccess().getClass_declClass_declParserRuleCall_0_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Interface_declAssignment_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getInterface_declInterface_declParserRuleCall_0_2_1_0()); }
		ruleInterface_decl
		{ after(grammarAccess.getOO_modifierAccess().getInterface_declInterface_declParserRuleCall_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__ClassAssignment_1_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getClassClass_declCrossReference_1_1_0_1_0()); }
		(
			{ before(grammarAccess.getOO_modifierAccess().getClassClass_declQualifiedNameParserRuleCall_1_1_0_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getOO_modifierAccess().getClassClass_declQualifiedNameParserRuleCall_1_1_0_1_0_1()); }
		)
		{ after(grammarAccess.getOO_modifierAccess().getClassClass_declCrossReference_1_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__IntefaceAssignment_1_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getIntefaceInterface_declCrossReference_1_1_1_1_0()); }
		(
			{ before(grammarAccess.getOO_modifierAccess().getIntefaceInterface_declQualifiedNameParserRuleCall_1_1_1_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getOO_modifierAccess().getIntefaceInterface_declQualifiedNameParserRuleCall_1_1_1_1_0_1()); }
		)
		{ after(grammarAccess.getOO_modifierAccess().getIntefaceInterface_declCrossReference_1_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__ClassAssignment_2_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getClassClass_declCrossReference_2_1_0_1_0()); }
		(
			{ before(grammarAccess.getOO_modifierAccess().getClassClass_declQualifiedNameParserRuleCall_2_1_0_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getOO_modifierAccess().getClassClass_declQualifiedNameParserRuleCall_2_1_0_1_0_1()); }
		)
		{ after(grammarAccess.getOO_modifierAccess().getClassClass_declCrossReference_2_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__InterfaceNameAssignment_2_1_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getInterfaceNameInterface_declParserRuleCall_2_1_0_2_1_0()); }
		ruleInterface_decl
		{ after(grammarAccess.getOO_modifierAccess().getInterfaceNameInterface_declParserRuleCall_2_1_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__InterfaceNameAssignment_2_1_0_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getInterfaceNameInterface_declParserRuleCall_2_1_0_2_2_1_0()); }
		ruleInterface_decl
		{ after(grammarAccess.getOO_modifierAccess().getInterfaceNameInterface_declParserRuleCall_2_1_0_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__RemovedInterfaceAssignment_2_1_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declCrossReference_2_1_0_3_1_0()); }
		(
			{ before(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_1_0_1()); }
		)
		{ after(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declCrossReference_2_1_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__RemovedInterfaceAssignment_2_1_0_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declCrossReference_2_1_0_3_2_1_0()); }
		(
			{ before(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declQualifiedNameParserRuleCall_2_1_0_3_2_1_0_1()); }
		)
		{ after(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declCrossReference_2_1_0_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Class_modifier_fragmentAssignment_2_1_0_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getClass_modifier_fragmentClass_modifier_fragmentParserRuleCall_2_1_0_5_0()); }
		ruleClass_modifier_fragment
		{ after(grammarAccess.getOO_modifierAccess().getClass_modifier_fragmentClass_modifier_fragmentParserRuleCall_2_1_0_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__InterfaceAssignment_2_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getInterfaceInterface_declCrossReference_2_1_1_1_0()); }
		(
			{ before(grammarAccess.getOO_modifierAccess().getInterfaceInterface_declQualifiedNameParserRuleCall_2_1_1_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getOO_modifierAccess().getInterfaceInterface_declQualifiedNameParserRuleCall_2_1_1_1_0_1()); }
		)
		{ after(grammarAccess.getOO_modifierAccess().getInterfaceInterface_declCrossReference_2_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OO_modifier__Interface_modifier_fragmentAssignment_2_1_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOO_modifierAccess().getInterface_modifier_fragmentInterface_modifier_fragmentParserRuleCall_2_1_1_3_0()); }
		ruleInterface_modifier_fragment
		{ after(grammarAccess.getOO_modifierAccess().getInterface_modifier_fragmentInterface_modifier_fragmentParserRuleCall_2_1_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class_modifier_fragment__MethodsigAssignment_1_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigMethodsigParserRuleCall_1_1_2_2_0()); }
		ruleMethodsig
		{ after(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigMethodsigParserRuleCall_1_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUpdate_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getUpdate_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Update_decl__Object_updateAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUpdate_declAccess().getObject_updateObject_updateParserRuleCall_3_0()); }
		ruleObject_update
		{ after(grammarAccess.getUpdate_declAccess().getObject_updateObject_updateParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__GuardAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObject_updateAccess().getGuardGuardCrossReference_4_0()); }
		(
			{ before(grammarAccess.getObject_updateAccess().getGuardGuardIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getObject_updateAccess().getGuardGuardIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getObject_updateAccess().getGuardGuardCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__Update_preamble_declarationAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObject_updateAccess().getUpdate_preamble_declarationUpdate_preamble_declarationParserRuleCall_6_0()); }
		ruleUpdate_preamble_declaration
		{ after(grammarAccess.getObject_updateAccess().getUpdate_preamble_declarationUpdate_preamble_declarationParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__PreAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObject_updateAccess().getPreObject_update_assign_stmtParserRuleCall_7_0()); }
		ruleObject_update_assign_stmt
		{ after(grammarAccess.getObject_updateAccess().getPreObject_update_assign_stmtParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update__PostAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObject_updateAccess().getPostObject_update_assign_stmtParserRuleCall_10_0()); }
		ruleObject_update_assign_stmt
		{ after(grammarAccess.getObject_updateAccess().getPostObject_update_assign_stmtParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__Var_or_field_refAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refVar_or_field_refCrossReference_0_0()); }
		(
			{ before(grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refVar_or_field_refIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refVar_or_field_refIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refVar_or_field_refCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object_update_assign_stmt__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObject_update_assign_stmtAccess().getExpExpParserRuleCall_2_0()); }
		ruleExp
		{ after(grammarAccess.getObject_update_assign_stmtAccess().getExpExpParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductline_declAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProductline_declAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__FeatureAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductline_declAccess().getFeatureFeatureParserRuleCall_4_0()); }
		ruleFeature
		{ after(grammarAccess.getProductline_declAccess().getFeatureFeatureParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__FeatureAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductline_declAccess().getFeatureFeatureParserRuleCall_5_1_0()); }
		ruleFeature
		{ after(grammarAccess.getProductline_declAccess().getFeatureFeatureParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Productline_decl__Delta_clauseAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductline_declAccess().getDelta_clauseDelta_clauseParserRuleCall_7_0()); }
		ruleDelta_clause
		{ after(grammarAccess.getProductline_declAccess().getDelta_clauseDelta_clauseParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Feature_declAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getFeature_declFeature_declCrossReference_0_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getFeature_declFeature_declQualifiedNameParserRuleCall_0_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getFeatureAccess().getFeature_declFeature_declQualifiedNameParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getFeatureAccess().getFeature_declFeature_declCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__PAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getPApostropheKeyword_1_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getPApostropheKeyword_1_0()); }
			'\''
			{ after(grammarAccess.getFeatureAccess().getPApostropheKeyword_1_0()); }
		)
		{ after(grammarAccess.getFeatureAccess().getPApostropheKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Attr_assignmentAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getAttr_assignmentAttr_assignmentParserRuleCall_2_1_0()); }
		ruleAttr_assignment
		{ after(grammarAccess.getFeatureAccess().getAttr_assignmentAttr_assignmentParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Attr_assignmentAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getAttr_assignmentAttr_assignmentParserRuleCall_2_2_1_0()); }
		ruleAttr_assignment
		{ after(grammarAccess.getFeatureAccess().getAttr_assignmentAttr_assignmentParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__DeltaspecAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_clauseAccess().getDeltaspecDelta_declCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDelta_clauseAccess().getDeltaspecDelta_declIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDelta_clauseAccess().getDeltaspecDelta_declIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDelta_clauseAccess().getDeltaspecDelta_declCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__After_conditionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_clauseAccess().getAfter_conditionAfter_conditionParserRuleCall_2_0()); }
		ruleAfter_condition
		{ after(grammarAccess.getDelta_clauseAccess().getAfter_conditionAfter_conditionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__From_conditionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_clauseAccess().getFrom_conditionFrom_conditionParserRuleCall_3_0()); }
		ruleFrom_condition
		{ after(grammarAccess.getDelta_clauseAccess().getFrom_conditionFrom_conditionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delta_clause__When_conditionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelta_clauseAccess().getWhen_conditionWhen_conditionParserRuleCall_4_0()); }
		ruleWhen_condition
		{ after(grammarAccess.getDelta_clauseAccess().getWhen_conditionWhen_conditionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Delta_idAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declCrossReference_1_0()); }
		(
			{ before(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__After_condition__Delta_idAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__From_condition__Application_conditionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFrom_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0()); }
		ruleApplication_condition
		{ after(grammarAccess.getFrom_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__When_condition__Application_conditionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWhen_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0()); }
		ruleApplication_condition
		{ after(grammarAccess.getWhen_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppOr_exp__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppOr_expAccess().getRightAppAnd_expParserRuleCall_1_2_0()); }
		ruleAppAnd_exp
		{ after(grammarAccess.getAppOr_expAccess().getRightAppAnd_expParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppAnd_exp__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppAnd_expAccess().getRightAppUnary_expParserRuleCall_1_2_0()); }
		ruleAppUnary_exp
		{ after(grammarAccess.getAppAnd_expAccess().getRightAppUnary_expParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppUnary_exp__OperandAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppUnary_expAccess().getOperandAppUnary_expParserRuleCall_1_1_0()); }
		ruleAppUnary_exp
		{ after(grammarAccess.getAppUnary_expAccess().getOperandAppUnary_expParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppCond_atomic_expr__FeatureAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppCond_atomic_exprAccess().getFeatureFeatureParserRuleCall_0()); }
		ruleFeature
		{ after(grammarAccess.getAppCond_atomic_exprAccess().getFeatureFeatureParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_declAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getProduct_declAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__FeatureAssignment_3_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_declAccess().getFeatureFeatureParserRuleCall_3_0_1_0_0()); }
		ruleFeature
		{ after(grammarAccess.getProduct_declAccess().getFeatureFeatureParserRuleCall_3_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__FeatureAssignment_3_0_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_declAccess().getFeatureFeatureParserRuleCall_3_0_1_1_1_0()); }
		ruleFeature
		{ after(grammarAccess.getProduct_declAccess().getFeatureFeatureParserRuleCall_3_0_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Product_reconfigurationAssignment_3_0_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_declAccess().getProduct_reconfigurationProduct_reconfigurationParserRuleCall_3_0_3_0_1_0()); }
		ruleProduct_reconfiguration
		{ after(grammarAccess.getProduct_declAccess().getProduct_reconfigurationProduct_reconfigurationParserRuleCall_3_0_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_decl__Product_exprAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_declAccess().getProduct_exprProduct_exprParserRuleCall_3_1_1_0()); }
		ruleProduct_expr
		{ after(grammarAccess.getProduct_declAccess().getProduct_exprProduct_exprParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductOr_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductOr_exprAccess().getRightProductAnd_expParserRuleCall_1_2_0()); }
		ruleProductAnd_exp
		{ after(grammarAccess.getProductOr_exprAccess().getRightProductAnd_expParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductAnd_exp__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductAnd_expAccess().getRightProductMinus_expParserRuleCall_1_2_0()); }
		ruleProductMinus_exp
		{ after(grammarAccess.getProductAnd_expAccess().getRightProductMinus_expParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductMinus_exp__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductMinus_expAccess().getRightProductPrimary_expParserRuleCall_1_2_0()); }
		ruleProductPrimary_exp
		{ after(grammarAccess.getProductMinus_expAccess().getRightProductPrimary_expParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__FeatureAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declCrossReference_0_1_0()); }
		(
			{ before(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declQualifiedNameParserRuleCall_0_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declQualifiedNameParserRuleCall_0_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declCrossReference_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__FeatureAssignment_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declCrossReference_0_2_1_0()); }
		(
			{ before(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declQualifiedNameParserRuleCall_0_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declQualifiedNameParserRuleCall_0_2_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declCrossReference_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicProduct_expr__ProductDeclAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicProduct_exprAccess().getProductDeclProduct_declCrossReference_1_0()); }
		(
			{ before(grammarAccess.getAtomicProduct_exprAccess().getProductDeclProduct_declQualifiedNameParserRuleCall_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAtomicProduct_exprAccess().getProductDeclProduct_declQualifiedNameParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicProduct_exprAccess().getProductDeclProduct_declCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_reconfigurationAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getProduct_reconfigurationAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Delta_idAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_reconfigurationAccess().getDelta_idDelta_idParserRuleCall_2_0()); }
		ruleDelta_id
		{ after(grammarAccess.getProduct_reconfigurationAccess().getDelta_idDelta_idParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__Delta_idAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_reconfigurationAccess().getDelta_idDelta_idParserRuleCall_3_1_0()); }
		ruleDelta_id
		{ after(grammarAccess.getProduct_reconfigurationAccess().getDelta_idDelta_idParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Product_reconfiguration__UpdateAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProduct_reconfigurationAccess().getUpdateIDTerminalRuleCall_5_0()); }
		RULE_ID
		{ after(grammarAccess.getProduct_reconfigurationAccess().getUpdateIDTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_declAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFeature_declAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Feature_decl_groupAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_declAccess().getFeature_decl_groupFeature_decl_groupParserRuleCall_1_1_0()); }
		ruleFeature_decl_group
		{ after(grammarAccess.getFeature_declAccess().getFeature_decl_groupFeature_decl_groupParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Feature_decl_attributeAssignment_1_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_declAccess().getFeature_decl_attributeFeature_decl_attributeParserRuleCall_1_2_0_0()); }
		ruleFeature_decl_attribute
		{ after(grammarAccess.getFeature_declAccess().getFeature_decl_attributeFeature_decl_attributeParserRuleCall_1_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl__Feature_decl_constraintAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_declAccess().getFeature_decl_constraintFeature_decl_constraintParserRuleCall_1_2_1_0()); }
		ruleFeature_decl_constraint
		{ after(grammarAccess.getFeature_declAccess().getFeature_decl_constraintFeature_decl_constraintParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__FnodeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getFnodeFnodeParserRuleCall_3_0()); }
		ruleFnode
		{ after(grammarAccess.getFeature_decl_groupAccess().getFnodeFnodeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_group__FnodeAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_groupAccess().getFnodeFnodeParserRuleCall_4_1_0()); }
		ruleFnode
		{ after(grammarAccess.getFeature_decl_groupAccess().getFnodeFnodeParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Boundary_valAssignment_0_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valBoundary_valParserRuleCall_0_4_0()); }
		ruleBoundary_val
		{ after(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valBoundary_valParserRuleCall_0_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__Boundary_valAssignment_0_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valBoundary_valParserRuleCall_0_5_1_0()); }
		ruleBoundary_val
		{ after(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valBoundary_valParserRuleCall_0_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__LBoundary_intAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intBoundary_intParserRuleCall_1_4_0()); }
		ruleBoundary_int
		{ after(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intBoundary_intParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__UBoundary_intAssignment_1_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intBoundary_intParserRuleCall_1_6_0()); }
		ruleBoundary_int
		{ after(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intBoundary_intParserRuleCall_1_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__LBoundary_intAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intBoundary_intParserRuleCall_2_2_0()); }
		ruleBoundary_int
		{ after(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intBoundary_intParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_attribute__UBoundary_intAssignment_2_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intBoundary_intParserRuleCall_2_4_0()); }
		ruleBoundary_int
		{ after(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intBoundary_intParserRuleCall_2_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__MexpAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_constraintAccess().getMexpMexpParserRuleCall_0_1_0()); }
		ruleMexp
		{ after(grammarAccess.getFeature_decl_constraintAccess().getMexpMexpParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature_decl_constraint__MexpAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeature_decl_constraintAccess().getMexpMexpParserRuleCall_1_2_0()); }
		ruleMexp
		{ after(grammarAccess.getFeature_decl_constraintAccess().getMexpMexpParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpOr_exp__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpOr_expAccess().getRightMexpAnd_exprParserRuleCall_1_2_0()); }
		ruleMexpAnd_expr
		{ after(grammarAccess.getMexpOr_expAccess().getRightMexpAnd_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAnd_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpAnd_exprAccess().getRightMexpImplies_exprParserRuleCall_1_2_0()); }
		ruleMexpImplies_expr
		{ after(grammarAccess.getMexpAnd_exprAccess().getRightMexpImplies_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpImplies_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__MexpImplies_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getMexpImplies_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpImplies_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpImplies_exprAccess().getRightMexpEquality_exprParserRuleCall_1_2_0()); }
		ruleMexpEquality_expr
		{ after(grammarAccess.getMexpImplies_exprAccess().getRightMexpEquality_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpEquality_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__MexpEquality_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getMexpEquality_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpEquality_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpEquality_exprAccess().getRightMexpComparison_exprParserRuleCall_1_2_0()); }
		ruleMexpComparison_expr
		{ after(grammarAccess.getMexpEquality_exprAccess().getRightMexpComparison_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpComparison_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__MexpComparison_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getMexpComparison_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpComparison_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpComparison_exprAccess().getRightMexpPlusOrMinus_exprParserRuleCall_1_2_0()); }
		ruleMexpPlusOrMinus_expr
		{ after(grammarAccess.getMexpComparison_exprAccess().getRightMexpPlusOrMinus_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__MexpPlusOrMinus_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPlusOrMinus_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpPlusOrMinus_exprAccess().getRightMexpMulDivOrMod_exprParserRuleCall_1_2_0()); }
		ruleMexpMulDivOrMod_expr
		{ after(grammarAccess.getMexpPlusOrMinus_exprAccess().getRightMexpMulDivOrMod_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpAlternatives_1_1_0()); }
		(rule__MexpMulDivOrMod_expr__OpAlternatives_1_1_0)
		{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpMulDivOrMod_expr__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpMulDivOrMod_exprAccess().getRightMexpPrimary_exprParserRuleCall_1_2_0()); }
		ruleMexpPrimary_expr
		{ after(grammarAccess.getMexpMulDivOrMod_exprAccess().getRightMexpPrimary_exprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpPrimary_expr__AAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpPrimary_exprAccess().getAMexpParserRuleCall_0_2_0()); }
		ruleMexp
		{ after(grammarAccess.getMexpPrimary_exprAccess().getAMexpParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MexpAtomic_expr__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMexpAtomic_exprAccess().getValueINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMexpAtomic_exprAccess().getValueINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFextensionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFextensionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Feature_decl_groupAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFextensionAccess().getFeature_decl_groupFeature_decl_groupParserRuleCall_3_0()); }
		ruleFeature_decl_group
		{ after(grammarAccess.getFextensionAccess().getFeature_decl_groupFeature_decl_groupParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Feature_decl_attributeAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFextensionAccess().getFeature_decl_attributeFeature_decl_attributeParserRuleCall_4_0_0()); }
		ruleFeature_decl_attribute
		{ after(grammarAccess.getFextensionAccess().getFeature_decl_attributeFeature_decl_attributeParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fextension__Feature_decl_constraintAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFextensionAccess().getFeature_decl_constraintFeature_decl_constraintParserRuleCall_4_1_0()); }
		ruleFeature_decl_constraint
		{ after(grammarAccess.getFextensionAccess().getFeature_decl_constraintFeature_decl_constraintParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

fragment RULE_STR_ESC : '\\' ('\\'|'"');

RULE_STRINGLITERAL : '"' (RULE_STR_ESC|RULE_NEGATION_CREOL ('\\'|'"'|'\r'|'\n'))* '"';

RULE_NEGATION_CREOL : '~';

RULE_NEGATION : '!';

RULE_MINUS : '-';

RULE_MULT : '*';

RULE_MOD : '%';

RULE_PLUS : '+';

RULE_LTEQ : '<=';

RULE_GTEQ : '>=';

RULE_LT : '<';

RULE_GT : '>';

RULE_ANDAND : '&&';

RULE_OROR : '||';

RULE_EQEQ : '==';

RULE_NOTEQ : '!=';

RULE_IMPLIES : '->';

RULE_EQUIV : '<->';

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;
