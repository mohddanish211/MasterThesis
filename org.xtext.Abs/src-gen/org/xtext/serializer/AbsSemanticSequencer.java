/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.abs.AbsPackage;
import org.xtext.abs.After_condition;
import org.xtext.abs.AndGuard;
import org.xtext.abs.And_expr;
import org.xtext.abs.Annotation;
import org.xtext.abs.Annotations;
import org.xtext.abs.Anon_function_decl;
import org.xtext.abs.AppAnd_exp;
import org.xtext.abs.AppOr_exp;
import org.xtext.abs.Application_condition;
import org.xtext.abs.Casestmtbranch;
import org.xtext.abs.Class_decl;
import org.xtext.abs.Class_modifier_fragment;
import org.xtext.abs.Comparison_expr;
import org.xtext.abs.Compilation_Unit;
import org.xtext.abs.DataType_decl;
import org.xtext.abs.Data_constructor;
import org.xtext.abs.Delta_access;
import org.xtext.abs.Delta_clause;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Delta_id;
import org.xtext.abs.Deltaspec;
import org.xtext.abs.Eff_expr;
import org.xtext.abs.Equality_expr;
import org.xtext.abs.Exception_decl;
import org.xtext.abs.Feature;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Feature_decl_attribute;
import org.xtext.abs.Feature_decl_constraint;
import org.xtext.abs.Feature_decl_group;
import org.xtext.abs.Fextension;
import org.xtext.abs.Field_decl;
import org.xtext.abs.From_condition;
import org.xtext.abs.Function_decl;
import org.xtext.abs.Function_list;
import org.xtext.abs.Function_name_decl;
import org.xtext.abs.Function_name_list;
import org.xtext.abs.Function_name_param_decl;
import org.xtext.abs.Guard;
import org.xtext.abs.Has_condition;
import org.xtext.abs.Interface_decl;
import org.xtext.abs.Interface_modifier_fragment;
import org.xtext.abs.Interface_name;
import org.xtext.abs.Main_block;
import org.xtext.abs.Method;
import org.xtext.abs.Methodsig;
import org.xtext.abs.Mexp;
import org.xtext.abs.MexpAnd_expr;
import org.xtext.abs.MexpComparison_expr;
import org.xtext.abs.MexpEquality_expr;
import org.xtext.abs.MexpImplies_expr;
import org.xtext.abs.MexpMulDivOrMod_expr;
import org.xtext.abs.MexpOr_exp;
import org.xtext.abs.MexpPlusOrMinus_expr;
import org.xtext.abs.MexpPrimary_expr;
import org.xtext.abs.Module_decl;
import org.xtext.abs.Module_export;
import org.xtext.abs.Module_import;
import org.xtext.abs.MulDivOrMod_expr;
import org.xtext.abs.NotExpression;
import org.xtext.abs.OO_modifier;
import org.xtext.abs.Object_update;
import org.xtext.abs.Object_update_assign_stmt;
import org.xtext.abs.Or_expr;
import org.xtext.abs.Par_function_decl;
import org.xtext.abs.Param_decl;
import org.xtext.abs.Param_list;
import org.xtext.abs.Pattern;
import org.xtext.abs.PlusOrMinus_expr;
import org.xtext.abs.ProductAnd_exp;
import org.xtext.abs.ProductOr_expr;
import org.xtext.abs.ProductPrimary_exp;
import org.xtext.abs.Product_decl;
import org.xtext.abs.Product_expr;
import org.xtext.abs.Product_reconfiguration;
import org.xtext.abs.Productline_decl;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Pure_exp_list;
import org.xtext.abs.Stmt;
import org.xtext.abs.Trait_decl;
import org.xtext.abs.Trait_expr;
import org.xtext.abs.Trait_oper;
import org.xtext.abs.Type_exp;
import org.xtext.abs.Type_use;
import org.xtext.abs.Typesyn_decl;
import org.xtext.abs.Update_decl;
import org.xtext.abs.Var_or_field_ref;
import org.xtext.abs.When_condition;
import org.xtext.services.AbsGrammarAccess;

@SuppressWarnings("all")
public class AbsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AbsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AbsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AbsPackage.AFTER_CONDITION:
				sequence_After_condition(context, (After_condition) semanticObject); 
				return; 
			case AbsPackage.AND_GUARD:
				sequence_AndGuard(context, (AndGuard) semanticObject); 
				return; 
			case AbsPackage.AND_EXPR:
				sequence_And_expr(context, (And_expr) semanticObject); 
				return; 
			case AbsPackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case AbsPackage.ANNOTATIONS:
				sequence_Annotations(context, (Annotations) semanticObject); 
				return; 
			case AbsPackage.ANON_FUNCTION_DECL:
				sequence_Anon_function_decl(context, (Anon_function_decl) semanticObject); 
				return; 
			case AbsPackage.APP_AND_EXP:
				sequence_AppAnd_exp(context, (AppAnd_exp) semanticObject); 
				return; 
			case AbsPackage.APP_OR_EXP:
				sequence_AppOr_exp(context, (AppOr_exp) semanticObject); 
				return; 
			case AbsPackage.APPLICATION_CONDITION:
				sequence_AppCond_atomic_expr(context, (Application_condition) semanticObject); 
				return; 
			case AbsPackage.CASESTMTBRANCH:
				sequence_Casestmtbranch(context, (Casestmtbranch) semanticObject); 
				return; 
			case AbsPackage.CLASS_DECL:
				sequence_Class_decl(context, (Class_decl) semanticObject); 
				return; 
			case AbsPackage.CLASS_MODIFIER_FRAGMENT:
				sequence_Class_modifier_fragment(context, (Class_modifier_fragment) semanticObject); 
				return; 
			case AbsPackage.COMPARISON_EXPR:
				sequence_Comparison_expr(context, (Comparison_expr) semanticObject); 
				return; 
			case AbsPackage.COMPILATION_UNIT:
				sequence_Compilation_Unit(context, (Compilation_Unit) semanticObject); 
				return; 
			case AbsPackage.DATA_TYPE_DECL:
				sequence_DataType_decl(context, (DataType_decl) semanticObject); 
				return; 
			case AbsPackage.DATA_CONSTRUCTOR:
				sequence_Data_constructor(context, (Data_constructor) semanticObject); 
				return; 
			case AbsPackage.DELTA_ACCESS:
				sequence_Delta_access(context, (Delta_access) semanticObject); 
				return; 
			case AbsPackage.DELTA_CLAUSE:
				sequence_Delta_clause(context, (Delta_clause) semanticObject); 
				return; 
			case AbsPackage.DELTA_DECL:
				sequence_Delta_decl(context, (Delta_decl) semanticObject); 
				return; 
			case AbsPackage.DELTA_ID:
				sequence_Delta_id(context, (Delta_id) semanticObject); 
				return; 
			case AbsPackage.DELTASPEC:
				sequence_Deltaspec(context, (Deltaspec) semanticObject); 
				return; 
			case AbsPackage.EFF_EXPR:
				sequence_Eff_expr(context, (Eff_expr) semanticObject); 
				return; 
			case AbsPackage.EQUALITY_EXPR:
				sequence_Equality_expr(context, (Equality_expr) semanticObject); 
				return; 
			case AbsPackage.EXCEPTION_DECL:
				sequence_Exception_decl(context, (Exception_decl) semanticObject); 
				return; 
			case AbsPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case AbsPackage.FEATURE_DECL:
				sequence_Feature_decl(context, (Feature_decl) semanticObject); 
				return; 
			case AbsPackage.FEATURE_DECL_ATTRIBUTE:
				sequence_Feature_decl_attribute(context, (Feature_decl_attribute) semanticObject); 
				return; 
			case AbsPackage.FEATURE_DECL_CONSTRAINT:
				sequence_Feature_decl_constraint(context, (Feature_decl_constraint) semanticObject); 
				return; 
			case AbsPackage.FEATURE_DECL_GROUP:
				sequence_Feature_decl_group(context, (Feature_decl_group) semanticObject); 
				return; 
			case AbsPackage.FEXTENSION:
				sequence_Fextension(context, (Fextension) semanticObject); 
				return; 
			case AbsPackage.FIELD_DECL:
				sequence_Field_decl(context, (Field_decl) semanticObject); 
				return; 
			case AbsPackage.FROM_CONDITION:
				sequence_From_condition(context, (From_condition) semanticObject); 
				return; 
			case AbsPackage.FUNCTION_DECL:
				sequence_Function_decl(context, (Function_decl) semanticObject); 
				return; 
			case AbsPackage.FUNCTION_LIST:
				sequence_Function_list(context, (Function_list) semanticObject); 
				return; 
			case AbsPackage.FUNCTION_NAME_DECL:
				sequence_Function_name_decl(context, (Function_name_decl) semanticObject); 
				return; 
			case AbsPackage.FUNCTION_NAME_LIST:
				sequence_Function_name_list(context, (Function_name_list) semanticObject); 
				return; 
			case AbsPackage.FUNCTION_NAME_PARAM_DECL:
				sequence_Function_name_param_decl(context, (Function_name_param_decl) semanticObject); 
				return; 
			case AbsPackage.GUARD:
				sequence_Guard(context, (Guard) semanticObject); 
				return; 
			case AbsPackage.HAS_CONDITION:
				sequence_Has_condition(context, (Has_condition) semanticObject); 
				return; 
			case AbsPackage.INTERFACE_DECL:
				sequence_Interface_decl(context, (Interface_decl) semanticObject); 
				return; 
			case AbsPackage.INTERFACE_MODIFIER_FRAGMENT:
				sequence_Interface_modifier_fragment(context, (Interface_modifier_fragment) semanticObject); 
				return; 
			case AbsPackage.INTERFACE_NAME:
				sequence_Interface_name(context, (Interface_name) semanticObject); 
				return; 
			case AbsPackage.MAIN_BLOCK:
				sequence_Main_block(context, (Main_block) semanticObject); 
				return; 
			case AbsPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case AbsPackage.METHODSIG:
				sequence_Methodsig(context, (Methodsig) semanticObject); 
				return; 
			case AbsPackage.MEXP:
				if (rule == grammarAccess.getMexpOr_expRule()
						|| action == grammarAccess.getMexpOr_expAccess().getMexpOr_expLeftAction_1_0()
						|| rule == grammarAccess.getMexpAnd_exprRule()
						|| action == grammarAccess.getMexpAnd_exprAccess().getMexpAnd_exprLeftAction_1_0()
						|| rule == grammarAccess.getMexpImplies_exprRule()
						|| action == grammarAccess.getMexpImplies_exprAccess().getMexpImplies_exprLeftAction_1_0()
						|| rule == grammarAccess.getMexpEquality_exprRule()
						|| action == grammarAccess.getMexpEquality_exprAccess().getMexpEquality_exprLeftAction_1_0()
						|| rule == grammarAccess.getMexpComparison_exprRule()
						|| action == grammarAccess.getMexpComparison_exprAccess().getMexpComparison_exprLeftAction_1_0()
						|| rule == grammarAccess.getMexpPlusOrMinus_exprRule()
						|| action == grammarAccess.getMexpPlusOrMinus_exprAccess().getMexpPlusOrMinus_exprLeftAction_1_0()
						|| rule == grammarAccess.getMexpMulDivOrMod_exprRule()
						|| action == grammarAccess.getMexpMulDivOrMod_exprAccess().getMexpMulDivOrMod_exprLeftAction_1_0()
						|| rule == grammarAccess.getMexpPrimary_exprRule()
						|| rule == grammarAccess.getMexpAtomic_exprRule()) {
					sequence_MexpAtomic_expr(context, (Mexp) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMexpRule()) {
					sequence_Mexp_MexpAtomic_expr(context, (Mexp) semanticObject); 
					return; 
				}
				else break;
			case AbsPackage.MEXP_AND_EXPR:
				sequence_MexpAnd_expr(context, (MexpAnd_expr) semanticObject); 
				return; 
			case AbsPackage.MEXP_COMPARISON_EXPR:
				sequence_MexpComparison_expr(context, (MexpComparison_expr) semanticObject); 
				return; 
			case AbsPackage.MEXP_EQUALITY_EXPR:
				sequence_MexpEquality_expr(context, (MexpEquality_expr) semanticObject); 
				return; 
			case AbsPackage.MEXP_IMPLIES_EXPR:
				sequence_MexpImplies_expr(context, (MexpImplies_expr) semanticObject); 
				return; 
			case AbsPackage.MEXP_MUL_DIV_OR_MOD_EXPR:
				sequence_MexpMulDivOrMod_expr(context, (MexpMulDivOrMod_expr) semanticObject); 
				return; 
			case AbsPackage.MEXP_OR_EXP:
				sequence_MexpOr_exp(context, (MexpOr_exp) semanticObject); 
				return; 
			case AbsPackage.MEXP_PLUS_OR_MINUS_EXPR:
				sequence_MexpPlusOrMinus_expr(context, (MexpPlusOrMinus_expr) semanticObject); 
				return; 
			case AbsPackage.MEXP_PRIMARY_EXPR:
				sequence_MexpPrimary_expr(context, (MexpPrimary_expr) semanticObject); 
				return; 
			case AbsPackage.MODULE_DECL:
				sequence_Module_decl(context, (Module_decl) semanticObject); 
				return; 
			case AbsPackage.MODULE_EXPORT:
				sequence_Module_export(context, (Module_export) semanticObject); 
				return; 
			case AbsPackage.MODULE_IMPORT:
				sequence_Module_import(context, (Module_import) semanticObject); 
				return; 
			case AbsPackage.MUL_DIV_OR_MOD_EXPR:
				sequence_MulDivOrMod_expr(context, (MulDivOrMod_expr) semanticObject); 
				return; 
			case AbsPackage.NOT_EXPRESSION:
				sequence_AppUnary_exp(context, (NotExpression) semanticObject); 
				return; 
			case AbsPackage.OO_MODIFIER:
				sequence_OO_modifier(context, (OO_modifier) semanticObject); 
				return; 
			case AbsPackage.OBJECT_UPDATE:
				sequence_Object_update(context, (Object_update) semanticObject); 
				return; 
			case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT:
				sequence_Object_update_assign_stmt(context, (Object_update_assign_stmt) semanticObject); 
				return; 
			case AbsPackage.OR_EXPR:
				sequence_Or_expr(context, (Or_expr) semanticObject); 
				return; 
			case AbsPackage.PAR_FUNCTION_DECL:
				sequence_Par_function_decl(context, (Par_function_decl) semanticObject); 
				return; 
			case AbsPackage.PARAM_DECL:
				sequence_Param_decl(context, (Param_decl) semanticObject); 
				return; 
			case AbsPackage.PARAM_LIST:
				sequence_Param_list(context, (Param_list) semanticObject); 
				return; 
			case AbsPackage.PATTERN:
				if (rule == grammarAccess.getCase_branchRule()) {
					sequence_Case_branch_Pattern(context, (Pattern) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPatternRule()) {
					sequence_Pattern(context, (Pattern) semanticObject); 
					return; 
				}
				else break;
			case AbsPackage.PLUS_OR_MINUS_EXPR:
				sequence_PlusOrMinus_expr(context, (PlusOrMinus_expr) semanticObject); 
				return; 
			case AbsPackage.PRODUCT_AND_EXP:
				sequence_ProductAnd_exp(context, (ProductAnd_exp) semanticObject); 
				return; 
			case AbsPackage.PRODUCT_OR_EXPR:
				sequence_ProductOr_expr(context, (ProductOr_expr) semanticObject); 
				return; 
			case AbsPackage.PRODUCT_PRIMARY_EXP:
				sequence_ProductPrimary_exp(context, (ProductPrimary_exp) semanticObject); 
				return; 
			case AbsPackage.PRODUCT_DECL:
				sequence_Product_decl(context, (Product_decl) semanticObject); 
				return; 
			case AbsPackage.PRODUCT_EXPR:
				sequence_Product_expr(context, (Product_expr) semanticObject); 
				return; 
			case AbsPackage.PRODUCT_RECONFIGURATION:
				sequence_Product_reconfiguration(context, (Product_reconfiguration) semanticObject); 
				return; 
			case AbsPackage.PRODUCTLINE_DECL:
				sequence_Productline_decl(context, (Productline_decl) semanticObject); 
				return; 
			case AbsPackage.PURE_EXP:
				if (rule == grammarAccess.getPure_expRule()
						|| rule == grammarAccess.getOr_exprRule()
						|| action == grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0()
						|| rule == grammarAccess.getAnd_exprRule()
						|| action == grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0()
						|| rule == grammarAccess.getEquality_exprRule()
						|| action == grammarAccess.getEquality_exprAccess().getEquality_exprLeftAction_1_0()
						|| rule == grammarAccess.getComparison_exprRule()
						|| action == grammarAccess.getComparison_exprAccess().getComparison_exprLeftAction_1_0()
						|| rule == grammarAccess.getPlusOrMinus_exprRule()
						|| action == grammarAccess.getPlusOrMinus_exprAccess().getPlusOrMinus_exprLeftAction_1_0()
						|| rule == grammarAccess.getMulDivOrMod_exprRule()
						|| action == grammarAccess.getMulDivOrMod_exprAccess().getMulDivOrMod_exprLeftAction_1_0()
						|| rule == grammarAccess.getPrimary_exprRule()
						|| rule == grammarAccess.getExpRule()) {
					sequence_Atomic_expr_Primary_expr_Pure_exp(context, (Pure_exp) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAtomic_exprRule()) {
					sequence_Atomic_expr(context, (Pure_exp) semanticObject); 
					return; 
				}
				else break;
			case AbsPackage.PURE_EXP_LIST:
				sequence_Pure_exp_list(context, (Pure_exp_list) semanticObject); 
				return; 
			case AbsPackage.STMT:
				sequence_Stmt(context, (Stmt) semanticObject); 
				return; 
			case AbsPackage.TRAIT_DECL:
				sequence_Trait_decl(context, (Trait_decl) semanticObject); 
				return; 
			case AbsPackage.TRAIT_EXPR:
				sequence_Trait_expr(context, (Trait_expr) semanticObject); 
				return; 
			case AbsPackage.TRAIT_OPER:
				sequence_Trait_oper(context, (Trait_oper) semanticObject); 
				return; 
			case AbsPackage.TYPE_EXP:
				sequence_Type_exp(context, (Type_exp) semanticObject); 
				return; 
			case AbsPackage.TYPE_USE:
				if (rule == grammarAccess.getAnnotationRule()) {
					sequence_Annotation_Type_use(context, (Type_use) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getData_constructor_argRule()
						|| rule == grammarAccess.getType_useRule()) {
					sequence_Type_use(context, (Type_use) semanticObject); 
					return; 
				}
				else break;
			case AbsPackage.TYPESYN_DECL:
				sequence_Typesyn_decl(context, (Typesyn_decl) semanticObject); 
				return; 
			case AbsPackage.UPDATE_DECL:
				sequence_Update_decl(context, (Update_decl) semanticObject); 
				return; 
			case AbsPackage.VAR_OR_FIELD_REF:
				sequence_Var_or_field_ref(context, (Var_or_field_ref) semanticObject); 
				return; 
			case AbsPackage.WHEN_CONDITION:
				sequence_When_condition(context, (When_condition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     After_condition returns After_condition
	 *
	 * Constraint:
	 *     (delta_id+=[Delta_decl|ID] delta_id+=[Delta_decl|ID]*)
	 */
	protected void sequence_After_condition(ISerializationContext context, After_condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Guard returns AndGuard
	 *     AndGuard returns AndGuard
	 *     AndGuard.AndGuard_1_0 returns AndGuard
	 *     PrimaryGuard returns AndGuard
	 *
	 * Constraint:
	 *     (left=AndGuard_AndGuard_1_0 op='&' right=PrimaryGuard)
	 */
	protected void sequence_AndGuard(ISerializationContext context, AndGuard semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.AND_GUARD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.AND_GUARD__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.AND_GUARD__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.AND_GUARD__OP));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.AND_GUARD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.AND_GUARD__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndGuardAccess().getAndGuardLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndGuardAccess().getOpAmpersandKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAndGuardAccess().getRightPrimaryGuardParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns And_expr
	 *     Or_expr returns And_expr
	 *     Or_expr.Or_expr_1_0 returns And_expr
	 *     And_expr returns And_expr
	 *     And_expr.And_expr_1_0 returns And_expr
	 *     Equality_expr returns And_expr
	 *     Equality_expr.Equality_expr_1_0 returns And_expr
	 *     Comparison_expr returns And_expr
	 *     Comparison_expr.Comparison_expr_1_0 returns And_expr
	 *     PlusOrMinus_expr returns And_expr
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns And_expr
	 *     MulDivOrMod_expr returns And_expr
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns And_expr
	 *     Primary_expr returns And_expr
	 *     Exp returns And_expr
	 *
	 * Constraint:
	 *     (left=And_expr_And_expr_1_0 right=Equality_expr)
	 */
	protected void sequence_And_expr(ISerializationContext context, And_expr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.AND_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.AND_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.AND_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.AND_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAnd_exprAccess().getRightEquality_exprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns Annotation
	 *
	 * Constraint:
	 *     pure_exp=Pure_exp
	 */
	protected void sequence_Annotation(ISerializationContext context, Annotation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.ANNOTATION__PURE_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.ANNOTATION__PURE_EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnnotationAccess().getPure_expPure_expParserRuleCall_1_0(), semanticObject.getPure_exp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns Type_use
	 *
	 * Constraint:
	 *     (name=ANY_IDENTIFIER (type_use+=Type_use type_use+=Type_use*)? pure_exp=Pure_exp)
	 */
	protected void sequence_Annotation_Type_use(ISerializationContext context, Type_use semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Annotations returns Annotations
	 *
	 * Constraint:
	 *     (annotation+=Annotation annotation+=Annotation*)*
	 */
	protected void sequence_Annotations(ISerializationContext context, Annotations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function_param returns Anon_function_decl
	 *     Anon_function_decl returns Anon_function_decl
	 *
	 * Constraint:
	 *     (params=Param_list pure_exp=Pure_exp)
	 */
	protected void sequence_Anon_function_decl(ISerializationContext context, Anon_function_decl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.ANON_FUNCTION_DECL__PARAMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.ANON_FUNCTION_DECL__PARAMS));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.ANON_FUNCTION_DECL__PURE_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.ANON_FUNCTION_DECL__PURE_EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnon_function_declAccess().getParamsParam_listParserRuleCall_0_0(), semanticObject.getParams());
		feeder.accept(grammarAccess.getAnon_function_declAccess().getPure_expPure_expParserRuleCall_2_0(), semanticObject.getPure_exp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Application_condition returns AppAnd_exp
	 *     AppOr_exp returns AppAnd_exp
	 *     AppOr_exp.AppOr_exp_1_0 returns AppAnd_exp
	 *     AppAnd_exp returns AppAnd_exp
	 *     AppAnd_exp.AppAnd_exp_1_0 returns AppAnd_exp
	 *     AppUnary_exp returns AppAnd_exp
	 *     AppPrimary_exp returns AppAnd_exp
	 *
	 * Constraint:
	 *     (left=AppAnd_exp_AppAnd_exp_1_0 right=AppUnary_exp)
	 */
	protected void sequence_AppAnd_exp(ISerializationContext context, AppAnd_exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.APP_AND_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.APP_AND_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.APP_AND_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.APP_AND_EXP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppAnd_expAccess().getAppAnd_expLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAppAnd_expAccess().getRightAppUnary_expParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Application_condition returns Application_condition
	 *     AppOr_exp returns Application_condition
	 *     AppOr_exp.AppOr_exp_1_0 returns Application_condition
	 *     AppAnd_exp returns Application_condition
	 *     AppAnd_exp.AppAnd_exp_1_0 returns Application_condition
	 *     AppUnary_exp returns Application_condition
	 *     AppPrimary_exp returns Application_condition
	 *     AppCond_atomic_expr returns Application_condition
	 *
	 * Constraint:
	 *     feature+=[Feature_decl|ID]
	 */
	protected void sequence_AppCond_atomic_expr(ISerializationContext context, Application_condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Application_condition returns AppOr_exp
	 *     AppOr_exp returns AppOr_exp
	 *     AppOr_exp.AppOr_exp_1_0 returns AppOr_exp
	 *     AppAnd_exp returns AppOr_exp
	 *     AppAnd_exp.AppAnd_exp_1_0 returns AppOr_exp
	 *     AppUnary_exp returns AppOr_exp
	 *     AppPrimary_exp returns AppOr_exp
	 *
	 * Constraint:
	 *     (left=AppOr_exp_AppOr_exp_1_0 right=AppAnd_exp)
	 */
	protected void sequence_AppOr_exp(ISerializationContext context, AppOr_exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.APP_OR_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.APP_OR_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.APP_OR_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.APP_OR_EXP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppOr_expAccess().getAppOr_expLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAppOr_expAccess().getRightAppAnd_expParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Application_condition returns NotExpression
	 *     AppOr_exp returns NotExpression
	 *     AppOr_exp.AppOr_exp_1_0 returns NotExpression
	 *     AppAnd_exp returns NotExpression
	 *     AppAnd_exp.AppAnd_exp_1_0 returns NotExpression
	 *     AppUnary_exp returns NotExpression
	 *     AppPrimary_exp returns NotExpression
	 *
	 * Constraint:
	 *     operand=AppUnary_exp
	 */
	protected void sequence_AppUnary_exp(ISerializationContext context, NotExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.NOT_EXPRESSION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.NOT_EXPRESSION__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppUnary_expAccess().getOperandAppUnary_expParserRuleCall_1_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns Pure_exp
	 *     Or_expr returns Pure_exp
	 *     Or_expr.Or_expr_1_0 returns Pure_exp
	 *     And_expr returns Pure_exp
	 *     And_expr.And_expr_1_0 returns Pure_exp
	 *     Equality_expr returns Pure_exp
	 *     Equality_expr.Equality_expr_1_0 returns Pure_exp
	 *     Comparison_expr returns Pure_exp
	 *     Comparison_expr.Comparison_expr_1_0 returns Pure_exp
	 *     PlusOrMinus_expr returns Pure_exp
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns Pure_exp
	 *     MulDivOrMod_expr returns Pure_exp
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns Pure_exp
	 *     Primary_expr returns Pure_exp
	 *     Exp returns Pure_exp
	 *
	 * Constraint:
	 *     (
	 *         pure_exp_list=Pure_exp_list | 
	 *         (function_list+=Function_list partial_function_pure_exp_list=Pure_exp_list) | 
	 *         function_expr=Pure_exp_list | 
	 *         variadic_exp_list=Pure_exp_list | 
	 *         (c=Pure_exp l=Pure_exp else=Pure_exp?) | 
	 *         (c=Pure_exp casebranch+=Case_branch*) | 
	 *         (type_use=Type_use value=ID i=Pure_exp b=Pure_exp) | 
	 *         var_or_field_ref=[Var_or_field_ref|ID] | 
	 *         pure_exp=Primary_expr
	 *     )?
	 */
	protected void sequence_Atomic_expr_Primary_expr_Pure_exp(ISerializationContext context, Pure_exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atomic_expr returns Pure_exp
	 *
	 * Constraint:
	 *     {Pure_exp}
	 */
	protected void sequence_Atomic_expr(ISerializationContext context, Pure_exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Case_branch returns Pattern
	 *
	 * Constraint:
	 *     ((pattern+=Pattern pattern+=Pattern*)? pure_exp=Pure_exp)
	 */
	protected void sequence_Case_branch_Pattern(ISerializationContext context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Casestmtbranch returns Casestmtbranch
	 *
	 * Constraint:
	 *     (pattern=Pattern stmt=Stmt)
	 */
	protected void sequence_Casestmtbranch(ISerializationContext context, Casestmtbranch semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.CASESTMTBRANCH__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.CASESTMTBRANCH__PATTERN));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.CASESTMTBRANCH__STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.CASESTMTBRANCH__STMT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCasestmtbranchAccess().getPatternPatternParserRuleCall_0_0(), semanticObject.getPattern());
		feeder.accept(grammarAccess.getCasestmtbranchAccess().getStmtStmtParserRuleCall_2_0(), semanticObject.getStmt());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Class_decl
	 *     Class_decl returns Class_decl
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         paramlist=Param_list? 
	 *         (interface_name+=[Interface_decl|ANY_IDENTIFIER] interface_name+=[Interface_decl|ANY_IDENTIFIER]*)? 
	 *         field_decl+=Field_decl* 
	 *         stmt+=Stmt* 
	 *         casestmtbranch+=Casestmtbranch* 
	 *         trait_usage+=Trait_usage* 
	 *         method+=Method*
	 *     )
	 */
	protected void sequence_Class_decl(ISerializationContext context, Class_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Class_modifier_fragment returns Class_modifier_fragment
	 *
	 * Constraint:
	 *     f=[Field_decl|ID]
	 */
	protected void sequence_Class_modifier_fragment(ISerializationContext context, Class_modifier_fragment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.CLASS_MODIFIER_FRAGMENT__F) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.CLASS_MODIFIER_FRAGMENT__F));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClass_modifier_fragmentAccess().getFField_declIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(AbsPackage.Literals.CLASS_MODIFIER_FRAGMENT__F, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns Comparison_expr
	 *     Or_expr returns Comparison_expr
	 *     Or_expr.Or_expr_1_0 returns Comparison_expr
	 *     And_expr returns Comparison_expr
	 *     And_expr.And_expr_1_0 returns Comparison_expr
	 *     Equality_expr returns Comparison_expr
	 *     Equality_expr.Equality_expr_1_0 returns Comparison_expr
	 *     Comparison_expr returns Comparison_expr
	 *     Comparison_expr.Comparison_expr_1_0 returns Comparison_expr
	 *     PlusOrMinus_expr returns Comparison_expr
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns Comparison_expr
	 *     MulDivOrMod_expr returns Comparison_expr
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns Comparison_expr
	 *     Primary_expr returns Comparison_expr
	 *     Exp returns Comparison_expr
	 *
	 * Constraint:
	 *     (left=Comparison_expr_Comparison_expr_1_0 (op=LT | op=GT | op=LTEQ | op=GTEQ) right=PlusOrMinus_expr)
	 */
	protected void sequence_Comparison_expr(ISerializationContext context, Comparison_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainModel returns Compilation_Unit
	 *     Compilation_Unit returns Compilation_Unit
	 *
	 * Constraint:
	 *     (
	 *         module+=Module_decl* 
	 *         deltaDecl+=Delta_decl* 
	 *         update_decl+=Update_decl* 
	 *         productline_decl=Productline_decl? 
	 *         product_decl+=Product_decl* 
	 *         (feature_decl+=Feature_decl | fextension+=Fextension)*
	 *     )
	 */
	protected void sequence_Compilation_Unit(ISerializationContext context, Compilation_Unit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns DataType_decl
	 *     DataType_decl returns DataType_decl
	 *     Module_modifier returns DataType_decl
	 *     Functional_modifier returns DataType_decl
	 *
	 * Constraint:
	 *     (name=ID (lt=LT p+=ID p+=ID* gt=GT)? (data_constructor+=Data_constructor data_constructor+=Data_constructor*)?)
	 */
	protected void sequence_DataType_decl(ISerializationContext context, DataType_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Data_constructor returns Data_constructor
	 *
	 * Constraint:
	 *     (name=ID (data_constructor_arg+=Data_constructor_arg data_constructor_arg+=Data_constructor_arg*)?)
	 */
	protected void sequence_Data_constructor(ISerializationContext context, Data_constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Delta_access returns Delta_access
	 *
	 * Constraint:
	 *     name=ANY_IDENTIFIER
	 */
	protected void sequence_Delta_access(ISerializationContext context, Delta_access semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.DELTA_ACCESS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.DELTA_ACCESS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDelta_accessAccess().getNameANY_IDENTIFIERParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Delta_clause returns Delta_clause
	 *
	 * Constraint:
	 *     (deltaspec=[Delta_decl|ID] after_condition=After_condition? from_condition=From_condition? when_condition=When_condition?)
	 */
	protected void sequence_Delta_clause(ISerializationContext context, Delta_clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Delta_decl returns Delta_decl
	 *
	 * Constraint:
	 *     (name=ID (p+=Delta_param p+=Delta_param*)? delta_access+=Delta_access* module_modifier+=Module_modifier*)
	 */
	protected void sequence_Delta_decl(ISerializationContext context, Delta_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Delta_id returns Delta_id
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Delta_id(ISerializationContext context, Delta_id semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.DELTA_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.DELTA_ID__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDelta_idAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Deltaspec returns Deltaspec
	 *
	 * Constraint:
	 *     (name=ID (deltaspec_param+=Deltaspec_param deltaspec_param+=Deltaspec_param*)?)
	 */
	protected void sequence_Deltaspec(ISerializationContext context, Deltaspec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Eff_expr
	 *     Eff_expr returns Eff_expr
	 *
	 * Constraint:
	 *     (
	 *         pure_exp=Pure_exp | 
	 *         (l='local'? c=ANY_IDENTIFIER pure_exp_list=Pure_exp_list) | 
	 *         (a='await'? o=Pure_exp m=ID pure_exp_list=Pure_exp_list) | 
	 *         (o=Pure_exp m=ID pure_exp_list=Pure_exp_list) | 
	 *         ((d=Delta_id | c='core')? pure_exp_list=Pure_exp_list)
	 *     )
	 */
	protected void sequence_Eff_expr(ISerializationContext context, Eff_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns Equality_expr
	 *     Or_expr returns Equality_expr
	 *     Or_expr.Or_expr_1_0 returns Equality_expr
	 *     And_expr returns Equality_expr
	 *     And_expr.And_expr_1_0 returns Equality_expr
	 *     Equality_expr returns Equality_expr
	 *     Equality_expr.Equality_expr_1_0 returns Equality_expr
	 *     Comparison_expr returns Equality_expr
	 *     Comparison_expr.Comparison_expr_1_0 returns Equality_expr
	 *     PlusOrMinus_expr returns Equality_expr
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns Equality_expr
	 *     MulDivOrMod_expr returns Equality_expr
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns Equality_expr
	 *     Primary_expr returns Equality_expr
	 *     Exp returns Equality_expr
	 *
	 * Constraint:
	 *     (left=Equality_expr_Equality_expr_1_0 (op=EQEQ | op=NOTEQ) right=Comparison_expr)
	 */
	protected void sequence_Equality_expr(ISerializationContext context, Equality_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Exception_decl
	 *     Exception_decl returns Exception_decl
	 *
	 * Constraint:
	 *     (name=ID (type+=[Data_constructor_arg|ID] type+=[Data_constructor_arg|ID]*)?)
	 */
	protected void sequence_Exception_decl(ISerializationContext context, Exception_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (name=ID p='''? (attr_assignment+=Attr_assignment attr_assignment+=Attr_assignment*)?)
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature_decl returns Feature_decl
	 *     Fnode returns Feature_decl
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         feature_decl_group=Feature_decl_group? 
	 *         (feature_decl_attribute+=Feature_decl_attribute | feature_decl_constraint+=Feature_decl_constraint)*
	 *     )
	 */
	protected void sequence_Feature_decl(ISerializationContext context, Feature_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature_decl_attribute returns Feature_decl_attribute
	 *
	 * Constraint:
	 *     (
	 *         (boundary_val+=Boundary_val boundary_val+=Boundary_val*) | 
	 *         (lBoundary_int=Boundary_int uBoundary_int=Boundary_int) | 
	 *         (lBoundary_int=Boundary_int uBoundary_int=Boundary_int)
	 *     )?
	 */
	protected void sequence_Feature_decl_attribute(ISerializationContext context, Feature_decl_attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature_decl_constraint returns Feature_decl_constraint
	 *
	 * Constraint:
	 *     (mexp=Mexp | mexp=Mexp)?
	 */
	protected void sequence_Feature_decl_constraint(ISerializationContext context, Feature_decl_constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature_decl_group returns Feature_decl_group
	 *
	 * Constraint:
	 *     (fnode+=Fnode fnode+=Fnode*)
	 */
	protected void sequence_Feature_decl_group(ISerializationContext context, Feature_decl_group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fextension returns Fextension
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         feature_decl_group=Feature_decl_group? 
	 *         (feature_decl_attribute+=Feature_decl_attribute | feature_decl_constraint+=Feature_decl_constraint)*
	 *     )
	 */
	protected void sequence_Fextension(ISerializationContext context, Fextension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field_decl returns Field_decl
	 *     Class_modifier_fragment returns Field_decl
	 *
	 * Constraint:
	 *     (type_use=Type_use name=Var_or_field_ref pure_exp=Pure_exp?)
	 */
	protected void sequence_Field_decl(ISerializationContext context, Field_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     From_condition returns From_condition
	 *
	 * Constraint:
	 *     application_condition=Application_condition
	 */
	protected void sequence_From_condition(ISerializationContext context, From_condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.FROM_CONDITION__APPLICATION_CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.FROM_CONDITION__APPLICATION_CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFrom_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0(), semanticObject.getApplication_condition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Function_decl
	 *     Function_decl returns Function_decl
	 *     Module_modifier returns Function_decl
	 *     Functional_modifier returns Function_decl
	 *
	 * Constraint:
	 *     (type_use=Type_use name=ID (lt=LT importedNamespace+=ID importedNamespace+=ID* gt=GT)? paramlist=Param_list pure_exp=Pure_exp?)
	 */
	protected void sequence_Function_decl(ISerializationContext context, Function_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function_list returns Function_list
	 *
	 * Constraint:
	 *     (function_param+=Function_param function_param+=Function_param*)?
	 */
	protected void sequence_Function_list(ISerializationContext context, Function_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function_name_decl returns Function_name_decl
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Function_name_decl(ISerializationContext context, Function_name_decl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.FUNCTION_NAME_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.FUNCTION_NAME_DECL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunction_name_declAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Function_name_list returns Function_name_list
	 *
	 * Constraint:
	 *     (function_name_decl+=Function_name_decl function_name_decl+=Function_name_decl*)?
	 */
	protected void sequence_Function_name_list(ISerializationContext context, Function_name_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function_param returns Function_name_param_decl
	 *     Function_name_param_decl returns Function_name_param_decl
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Function_name_param_decl(ISerializationContext context, Function_name_param_decl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.FUNCTION_NAME_PARAM_DECL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.FUNCTION_NAME_PARAM_DECL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunction_name_param_declAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Guard returns Guard
	 *     AndGuard returns Guard
	 *     AndGuard.AndGuard_1_0 returns Guard
	 *     PrimaryGuard returns Guard
	 *
	 * Constraint:
	 *     (name=[Var_or_field_ref|ID] | (min=Pure_exp max=Pure_exp) | e=Pure_exp)
	 */
	protected void sequence_Guard(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Delta_param returns Has_condition
	 *     Has_condition returns Has_condition
	 *
	 * Constraint:
	 *     (f=[Field_decl|ID] | m=[Methodsig|ID] | i=[Interface_decl|ID])
	 */
	protected void sequence_Has_condition(ISerializationContext context, Has_condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Interface_decl
	 *     Interface_decl returns Interface_decl
	 *
	 * Constraint:
	 *     (name=ID (interface_name+=[Interface_decl|ANY_IDENTIFIER] interface_name+=[Interface_decl|ANY_IDENTIFIER]*)? methodsig+=Methodsig*)
	 */
	protected void sequence_Interface_decl(ISerializationContext context, Interface_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface_modifier_fragment returns Interface_modifier_fragment
	 *
	 * Constraint:
	 *     removedMethod=[Methodsig|ID]
	 */
	protected void sequence_Interface_modifier_fragment(ISerializationContext context, Interface_modifier_fragment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInterface_modifier_fragmentAccess().getRemovedMethodMethodsigIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(AbsPackage.Literals.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Interface_name returns Interface_name
	 *
	 * Constraint:
	 *     name=ANY_IDENTIFIER
	 */
	protected void sequence_Interface_name(ISerializationContext context, Interface_name semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.INTERFACE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.INTERFACE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInterface_nameAccess().getNameANY_IDENTIFIERParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Main_block returns Main_block
	 *
	 * Constraint:
	 *     stmt+=Stmt*
	 */
	protected void sequence_Main_block(ISerializationContext context, Main_block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (type_use=Type_use name=ID paramlist=Param_list stmt+=Stmt*)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Methodsig returns Methodsig
	 *     Interface_modifier_fragment returns Methodsig
	 *
	 * Constraint:
	 *     (type_use=Type_use name=ID paramlist=Param_list)
	 */
	protected void sequence_Methodsig(ISerializationContext context, Methodsig semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.METHODSIG__TYPE_USE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.METHODSIG__TYPE_USE));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.METHODSIG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.METHODSIG__NAME));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.METHODSIG__PARAMLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.METHODSIG__PARAMLIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodsigAccess().getType_useType_useParserRuleCall_0_0(), semanticObject.getType_use());
		feeder.accept(grammarAccess.getMethodsigAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodsigAccess().getParamlistParam_listParserRuleCall_2_0(), semanticObject.getParamlist());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpAnd_expr
	 *     MexpOr_exp returns MexpAnd_expr
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpAnd_expr
	 *     MexpAnd_expr returns MexpAnd_expr
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns MexpAnd_expr
	 *
	 * Constraint:
	 *     (left=MexpAnd_expr_MexpAnd_expr_1_0 right=MexpImplies_expr)
	 */
	protected void sequence_MexpAnd_expr(ISerializationContext context, MexpAnd_expr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.MEXP_AND_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.MEXP_AND_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.MEXP_AND_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.MEXP_AND_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMexpAnd_exprAccess().getMexpAnd_exprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMexpAnd_exprAccess().getRightMexpImplies_exprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MexpOr_exp returns Mexp
	 *     MexpOr_exp.MexpOr_exp_1_0 returns Mexp
	 *     MexpAnd_expr returns Mexp
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns Mexp
	 *     MexpImplies_expr returns Mexp
	 *     MexpImplies_expr.MexpImplies_expr_1_0 returns Mexp
	 *     MexpEquality_expr returns Mexp
	 *     MexpEquality_expr.MexpEquality_expr_1_0 returns Mexp
	 *     MexpComparison_expr returns Mexp
	 *     MexpComparison_expr.MexpComparison_expr_1_0 returns Mexp
	 *     MexpPlusOrMinus_expr returns Mexp
	 *     MexpPlusOrMinus_expr.MexpPlusOrMinus_expr_1_0 returns Mexp
	 *     MexpMulDivOrMod_expr returns Mexp
	 *     MexpMulDivOrMod_expr.MexpMulDivOrMod_expr_1_0 returns Mexp
	 *     MexpPrimary_expr returns Mexp
	 *     MexpAtomic_expr returns Mexp
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_MexpAtomic_expr(ISerializationContext context, Mexp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.MEXP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.MEXP__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMexpAtomic_exprAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpComparison_expr
	 *     MexpOr_exp returns MexpComparison_expr
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpComparison_expr
	 *     MexpAnd_expr returns MexpComparison_expr
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns MexpComparison_expr
	 *     MexpImplies_expr returns MexpComparison_expr
	 *     MexpImplies_expr.MexpImplies_expr_1_0 returns MexpComparison_expr
	 *     MexpEquality_expr returns MexpComparison_expr
	 *     MexpEquality_expr.MexpEquality_expr_1_0 returns MexpComparison_expr
	 *     MexpComparison_expr returns MexpComparison_expr
	 *     MexpComparison_expr.MexpComparison_expr_1_0 returns MexpComparison_expr
	 *
	 * Constraint:
	 *     (left=MexpComparison_expr_MexpComparison_expr_1_0 (op=LT | op=GT | op=LTEQ | op=GTEQ) right=MexpPlusOrMinus_expr)
	 */
	protected void sequence_MexpComparison_expr(ISerializationContext context, MexpComparison_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpEquality_expr
	 *     MexpOr_exp returns MexpEquality_expr
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpEquality_expr
	 *     MexpAnd_expr returns MexpEquality_expr
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns MexpEquality_expr
	 *     MexpImplies_expr returns MexpEquality_expr
	 *     MexpImplies_expr.MexpImplies_expr_1_0 returns MexpEquality_expr
	 *     MexpEquality_expr returns MexpEquality_expr
	 *     MexpEquality_expr.MexpEquality_expr_1_0 returns MexpEquality_expr
	 *
	 * Constraint:
	 *     (left=MexpEquality_expr_MexpEquality_expr_1_0 (op=EQEQ | op=NOTEQ) right=MexpComparison_expr)
	 */
	protected void sequence_MexpEquality_expr(ISerializationContext context, MexpEquality_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpImplies_expr
	 *     MexpOr_exp returns MexpImplies_expr
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpImplies_expr
	 *     MexpAnd_expr returns MexpImplies_expr
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns MexpImplies_expr
	 *     MexpImplies_expr returns MexpImplies_expr
	 *     MexpImplies_expr.MexpImplies_expr_1_0 returns MexpImplies_expr
	 *
	 * Constraint:
	 *     (left=MexpImplies_expr_MexpImplies_expr_1_0 (op=IMPLIES | op=EQUIV) right=MexpEquality_expr)
	 */
	protected void sequence_MexpImplies_expr(ISerializationContext context, MexpImplies_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpMulDivOrMod_expr
	 *     MexpOr_exp returns MexpMulDivOrMod_expr
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpMulDivOrMod_expr
	 *     MexpAnd_expr returns MexpMulDivOrMod_expr
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns MexpMulDivOrMod_expr
	 *     MexpImplies_expr returns MexpMulDivOrMod_expr
	 *     MexpImplies_expr.MexpImplies_expr_1_0 returns MexpMulDivOrMod_expr
	 *     MexpEquality_expr returns MexpMulDivOrMod_expr
	 *     MexpEquality_expr.MexpEquality_expr_1_0 returns MexpMulDivOrMod_expr
	 *     MexpComparison_expr returns MexpMulDivOrMod_expr
	 *     MexpComparison_expr.MexpComparison_expr_1_0 returns MexpMulDivOrMod_expr
	 *     MexpPlusOrMinus_expr returns MexpMulDivOrMod_expr
	 *     MexpPlusOrMinus_expr.MexpPlusOrMinus_expr_1_0 returns MexpMulDivOrMod_expr
	 *     MexpMulDivOrMod_expr returns MexpMulDivOrMod_expr
	 *     MexpMulDivOrMod_expr.MexpMulDivOrMod_expr_1_0 returns MexpMulDivOrMod_expr
	 *
	 * Constraint:
	 *     (left=MexpMulDivOrMod_expr_MexpMulDivOrMod_expr_1_0 (op=MULT | op='/' | op=MOD) right=MexpPrimary_expr)
	 */
	protected void sequence_MexpMulDivOrMod_expr(ISerializationContext context, MexpMulDivOrMod_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpOr_exp
	 *     MexpOr_exp returns MexpOr_exp
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpOr_exp
	 *
	 * Constraint:
	 *     (left=MexpOr_exp_MexpOr_exp_1_0 right=MexpAnd_expr)
	 */
	protected void sequence_MexpOr_exp(ISerializationContext context, MexpOr_exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.MEXP_OR_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.MEXP_OR_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.MEXP_OR_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.MEXP_OR_EXP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMexpOr_expAccess().getMexpOr_expLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMexpOr_expAccess().getRightMexpAnd_exprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpPlusOrMinus_expr
	 *     MexpOr_exp returns MexpPlusOrMinus_expr
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpPlusOrMinus_expr
	 *     MexpAnd_expr returns MexpPlusOrMinus_expr
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns MexpPlusOrMinus_expr
	 *     MexpImplies_expr returns MexpPlusOrMinus_expr
	 *     MexpImplies_expr.MexpImplies_expr_1_0 returns MexpPlusOrMinus_expr
	 *     MexpEquality_expr returns MexpPlusOrMinus_expr
	 *     MexpEquality_expr.MexpEquality_expr_1_0 returns MexpPlusOrMinus_expr
	 *     MexpComparison_expr returns MexpPlusOrMinus_expr
	 *     MexpComparison_expr.MexpComparison_expr_1_0 returns MexpPlusOrMinus_expr
	 *     MexpPlusOrMinus_expr returns MexpPlusOrMinus_expr
	 *     MexpPlusOrMinus_expr.MexpPlusOrMinus_expr_1_0 returns MexpPlusOrMinus_expr
	 *
	 * Constraint:
	 *     (left=MexpPlusOrMinus_expr_MexpPlusOrMinus_expr_1_0 (op=PLUS | op=MINUS) right=MexpMulDivOrMod_expr)
	 */
	protected void sequence_MexpPlusOrMinus_expr(ISerializationContext context, MexpPlusOrMinus_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns MexpPrimary_expr
	 *     MexpOr_exp returns MexpPrimary_expr
	 *     MexpOr_exp.MexpOr_exp_1_0 returns MexpPrimary_expr
	 *     MexpAnd_expr returns MexpPrimary_expr
	 *     MexpAnd_expr.MexpAnd_expr_1_0 returns MexpPrimary_expr
	 *     MexpImplies_expr returns MexpPrimary_expr
	 *     MexpImplies_expr.MexpImplies_expr_1_0 returns MexpPrimary_expr
	 *     MexpEquality_expr returns MexpPrimary_expr
	 *     MexpEquality_expr.MexpEquality_expr_1_0 returns MexpPrimary_expr
	 *     MexpComparison_expr returns MexpPrimary_expr
	 *     MexpComparison_expr.MexpComparison_expr_1_0 returns MexpPrimary_expr
	 *     MexpPlusOrMinus_expr returns MexpPrimary_expr
	 *     MexpPlusOrMinus_expr.MexpPlusOrMinus_expr_1_0 returns MexpPrimary_expr
	 *     MexpMulDivOrMod_expr returns MexpPrimary_expr
	 *     MexpMulDivOrMod_expr.MexpMulDivOrMod_expr_1_0 returns MexpPrimary_expr
	 *     MexpPrimary_expr returns MexpPrimary_expr
	 *
	 * Constraint:
	 *     a=Mexp?
	 */
	protected void sequence_MexpPrimary_expr(ISerializationContext context, MexpPrimary_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mexp returns Mexp
	 *
	 * Constraint:
	 *     value=INT?
	 */
	protected void sequence_Mexp_MexpAtomic_expr(ISerializationContext context, Mexp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Module_decl returns Module_decl
	 *
	 * Constraint:
	 *     (name=ANY_IDENTIFIER module_export+=Module_export* module_import+=Module_import* decl+=Decl* main_block+=Main_block?)
	 */
	protected void sequence_Module_decl(ISerializationContext context, Module_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Module_export returns Module_export
	 *     Module_modifier returns Module_export
	 *     Namespace_modifier returns Module_export
	 *
	 * Constraint:
	 *     ((star=MULT | (anyPackage+=ANY_IDENTIFIER anyPackage+=ANY_IDENTIFIER*)) importedNamespace+=ANY_IDENTIFIER?)
	 */
	protected void sequence_Module_export(ISerializationContext context, Module_export semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Module_import returns Module_import
	 *     Module_modifier returns Module_import
	 *     Namespace_modifier returns Module_import
	 *
	 * Constraint:
	 *     (
	 *         (star=MULT importedNamespace=ANY_IDENTIFIER) | 
	 *         (name+=ANY_IDENTIFIER name+=ANY_IDENTIFIER* importedNamespace=ANY_IDENTIFIER) | 
	 *         (name+=ANY_IDENTIFIER name+=ANY_IDENTIFIER*)
	 *     )
	 */
	protected void sequence_Module_import(ISerializationContext context, Module_import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns MulDivOrMod_expr
	 *     Or_expr returns MulDivOrMod_expr
	 *     Or_expr.Or_expr_1_0 returns MulDivOrMod_expr
	 *     And_expr returns MulDivOrMod_expr
	 *     And_expr.And_expr_1_0 returns MulDivOrMod_expr
	 *     Equality_expr returns MulDivOrMod_expr
	 *     Equality_expr.Equality_expr_1_0 returns MulDivOrMod_expr
	 *     Comparison_expr returns MulDivOrMod_expr
	 *     Comparison_expr.Comparison_expr_1_0 returns MulDivOrMod_expr
	 *     PlusOrMinus_expr returns MulDivOrMod_expr
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns MulDivOrMod_expr
	 *     MulDivOrMod_expr returns MulDivOrMod_expr
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns MulDivOrMod_expr
	 *     Primary_expr returns MulDivOrMod_expr
	 *     Exp returns MulDivOrMod_expr
	 *
	 * Constraint:
	 *     (left=MulDivOrMod_expr_MulDivOrMod_expr_1_0 (op=MULT | op='/' | op=MOD) right=Primary_expr)
	 */
	protected void sequence_MulDivOrMod_expr(ISerializationContext context, MulDivOrMod_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Module_modifier returns OO_modifier
	 *     OO_modifier returns OO_modifier
	 *
	 * Constraint:
	 *     (
	 *         class_decl=Class_decl | 
	 *         class=[Class_decl|ANY_IDENTIFIER] | 
	 *         ((i+=Interface_name i+=Interface_name*)? (i+=Interface_name i+=Interface_name*)? class_modifier_fragment+=Class_modifier_fragment*) | 
	 *         interface_decl=Interface_decl | 
	 *         (interface=[Interface_decl|ANY_IDENTIFIER] interface_modifier_fragment+=Interface_modifier_fragment*)
	 *     )?
	 */
	protected void sequence_OO_modifier(ISerializationContext context, OO_modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Object_update returns Object_update
	 *
	 * Constraint:
	 *     (guard=[Guard|ID] update_preamble_declaration+=Update_preamble_declaration* pre+=Object_update_assign_stmt* post+=Object_update_assign_stmt*)
	 */
	protected void sequence_Object_update(ISerializationContext context, Object_update semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Object_update_assign_stmt returns Object_update_assign_stmt
	 *
	 * Constraint:
	 *     (var_or_field_ref=[Var_or_field_ref|ID] exp=Exp)
	 */
	protected void sequence_Object_update_assign_stmt(ISerializationContext context, Object_update_assign_stmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.OBJECT_UPDATE_ASSIGN_STMT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.OBJECT_UPDATE_ASSIGN_STMT__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refVar_or_field_refIDTerminalRuleCall_0_0_1(), semanticObject.eGet(AbsPackage.Literals.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF, false));
		feeder.accept(grammarAccess.getObject_update_assign_stmtAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns Or_expr
	 *     Or_expr returns Or_expr
	 *     Or_expr.Or_expr_1_0 returns Or_expr
	 *     And_expr returns Or_expr
	 *     And_expr.And_expr_1_0 returns Or_expr
	 *     Equality_expr returns Or_expr
	 *     Equality_expr.Equality_expr_1_0 returns Or_expr
	 *     Comparison_expr returns Or_expr
	 *     Comparison_expr.Comparison_expr_1_0 returns Or_expr
	 *     PlusOrMinus_expr returns Or_expr
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns Or_expr
	 *     MulDivOrMod_expr returns Or_expr
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns Or_expr
	 *     Primary_expr returns Or_expr
	 *     Exp returns Or_expr
	 *
	 * Constraint:
	 *     (left=Or_expr_Or_expr_1_0 right=And_expr)
	 */
	protected void sequence_Or_expr(ISerializationContext context, Or_expr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.OR_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.OR_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.OR_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.OR_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Par_function_decl
	 *     Par_function_decl returns Par_function_decl
	 *
	 * Constraint:
	 *     (
	 *         type_use=Type_use 
	 *         name=ID 
	 *         (lt=LT p+=ID p+=ID* gt=GT)? 
	 *         functions=Function_name_list 
	 *         params=Param_list 
	 *         e=Pure_exp
	 *     )
	 */
	protected void sequence_Par_function_decl(ISerializationContext context, Par_function_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Param_decl returns Param_decl
	 *     Delta_param returns Param_decl
	 *
	 * Constraint:
	 *     (type_exp=Type_exp name=ID)
	 */
	protected void sequence_Param_decl(ISerializationContext context, Param_decl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.PARAM_DECL__TYPE_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.PARAM_DECL__TYPE_EXP));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.PARAM_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.PARAM_DECL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParam_declAccess().getType_expType_expParserRuleCall_0_0(), semanticObject.getType_exp());
		feeder.accept(grammarAccess.getParam_declAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Param_list returns Param_list
	 *
	 * Constraint:
	 *     (param_decl+=Param_decl param_decl+=Param_decl*)?
	 */
	protected void sequence_Param_list(ISerializationContext context, Param_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Pattern
	 *
	 * Constraint:
	 *     (pattern+=Pattern pattern+=Pattern*)?
	 */
	protected void sequence_Pattern(ISerializationContext context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns PlusOrMinus_expr
	 *     Or_expr returns PlusOrMinus_expr
	 *     Or_expr.Or_expr_1_0 returns PlusOrMinus_expr
	 *     And_expr returns PlusOrMinus_expr
	 *     And_expr.And_expr_1_0 returns PlusOrMinus_expr
	 *     Equality_expr returns PlusOrMinus_expr
	 *     Equality_expr.Equality_expr_1_0 returns PlusOrMinus_expr
	 *     Comparison_expr returns PlusOrMinus_expr
	 *     Comparison_expr.Comparison_expr_1_0 returns PlusOrMinus_expr
	 *     PlusOrMinus_expr returns PlusOrMinus_expr
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns PlusOrMinus_expr
	 *     MulDivOrMod_expr returns PlusOrMinus_expr
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns PlusOrMinus_expr
	 *     Primary_expr returns PlusOrMinus_expr
	 *     Exp returns PlusOrMinus_expr
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_expr_PlusOrMinus_expr_1_0 (op=PLUS | op=MINUS) right=MulDivOrMod_expr)
	 */
	protected void sequence_PlusOrMinus_expr(ISerializationContext context, PlusOrMinus_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Product_expr returns ProductAnd_exp
	 *     ProductOr_expr returns ProductAnd_exp
	 *     ProductOr_expr.ProductOr_expr_1_0 returns ProductAnd_exp
	 *     ProductAnd_exp returns ProductAnd_exp
	 *     ProductAnd_exp.ProductAnd_exp_1_0 returns ProductAnd_exp
	 *     ProductPrimary_exp returns ProductAnd_exp
	 *
	 * Constraint:
	 *     (left=ProductAnd_exp_ProductAnd_exp_1_0 right=ProductPrimary_exp)
	 */
	protected void sequence_ProductAnd_exp(ISerializationContext context, ProductAnd_exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.PRODUCT_AND_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.PRODUCT_AND_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.PRODUCT_AND_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.PRODUCT_AND_EXP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductAnd_expAccess().getProductAnd_expLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getProductAnd_expAccess().getRightProductPrimary_expParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Product_expr returns ProductOr_expr
	 *     ProductOr_expr returns ProductOr_expr
	 *     ProductOr_expr.ProductOr_expr_1_0 returns ProductOr_expr
	 *     ProductAnd_exp returns ProductOr_expr
	 *     ProductAnd_exp.ProductAnd_exp_1_0 returns ProductOr_expr
	 *     ProductPrimary_exp returns ProductOr_expr
	 *
	 * Constraint:
	 *     (left=ProductOr_expr_ProductOr_expr_1_0 right=ProductAnd_exp)
	 */
	protected void sequence_ProductOr_expr(ISerializationContext context, ProductOr_expr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.PRODUCT_OR_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.PRODUCT_OR_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.PRODUCT_OR_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.PRODUCT_OR_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductOr_exprAccess().getProductOr_exprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getProductOr_exprAccess().getRightProductAnd_expParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Product_expr returns ProductPrimary_exp
	 *     ProductOr_expr returns ProductPrimary_exp
	 *     ProductOr_expr.ProductOr_expr_1_0 returns ProductPrimary_exp
	 *     ProductAnd_exp returns ProductPrimary_exp
	 *     ProductAnd_exp.ProductAnd_exp_1_0 returns ProductPrimary_exp
	 *     ProductPrimary_exp returns ProductPrimary_exp
	 *
	 * Constraint:
	 *     {ProductPrimary_exp}
	 */
	protected void sequence_ProductPrimary_exp(ISerializationContext context, ProductPrimary_exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Product_decl returns Product_decl
	 *
	 * Constraint:
	 *     (name=ID (((feature+=Feature feature+=Feature*)? product_reconfiguration+=Product_reconfiguration*) | product_expr=Product_expr)?)
	 */
	protected void sequence_Product_decl(ISerializationContext context, Product_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Product_expr returns Product_expr
	 *     ProductOr_expr returns Product_expr
	 *     ProductOr_expr.ProductOr_expr_1_0 returns Product_expr
	 *     ProductAnd_exp returns Product_expr
	 *     ProductAnd_exp.ProductAnd_exp_1_0 returns Product_expr
	 *     ProductPrimary_exp returns Product_expr
	 *
	 * Constraint:
	 *     (feature+=Feature feature+=Feature*)?
	 */
	protected void sequence_Product_expr(ISerializationContext context, Product_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Product_reconfiguration returns Product_reconfiguration
	 *
	 * Constraint:
	 *     (name=ID delta_id+=Delta_id delta_id+=Delta_id* update=ID)
	 */
	protected void sequence_Product_reconfiguration(ISerializationContext context, Product_reconfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Productline_decl returns Productline_decl
	 *
	 * Constraint:
	 *     (name=ID feature+=[Feature_decl|ID] feature+=[Feature_decl|ID]* delta_clause+=Delta_clause*)
	 */
	protected void sequence_Productline_decl(ISerializationContext context, Productline_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp_list returns Pure_exp_list
	 *
	 * Constraint:
	 *     (pure_exp+=Pure_exp pure_exp+=Pure_exp*)?
	 */
	protected void sequence_Pure_exp_list(ISerializationContext context, Pure_exp_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stmt returns Stmt
	 *
	 * Constraint:
	 *     (
	 *         (type_exp=Type_exp name=ID exp=Exp?) | 
	 *         (var_or_field_ref=[Var_or_field_ref|ID] exp=Exp) | 
	 *         exp=Exp | 
	 *         exp=Exp | 
	 *         stmt+=Stmt+ | 
	 *         (pure_exp=Pure_exp ifstmt=Stmt r=Stmt?) | 
	 *         (condition=Pure_exp whilestmt=Stmt) | 
	 *         (i=ID l=Pure_exp foreachstmt=Stmt) | 
	 *         (trystmt=Stmt (casestmtbranch+=Casestmtbranch+ | casestmtbranch+=Casestmtbranch)? stmt+=Stmt?) | 
	 *         guard=[Guard|ID] | 
	 *         (f=Pure_exp t=Pure_exp) | 
	 *         throwPureExp=Pure_exp | 
	 *         diePureExp=Pure_exp | 
	 *         pure_exp=Pure_exp | 
	 *         exp=Exp | 
	 *         (c=Pure_exp casestmtbranch+=Casestmtbranch*)
	 *     )?
	 */
	protected void sequence_Stmt(ISerializationContext context, Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Trait_decl
	 *     Trait_decl returns Trait_decl
	 *
	 * Constraint:
	 *     (name=ID trait_expr=Trait_expr)
	 */
	protected void sequence_Trait_decl(ISerializationContext context, Trait_decl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.DECL__NAME));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.TRAIT_DECL__TRAIT_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.TRAIT_DECL__TRAIT_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTrait_declAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTrait_declAccess().getTrait_exprTrait_exprParserRuleCall_3_0(), semanticObject.getTrait_expr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trait_usage returns Trait_expr
	 *     Trait_expr returns Trait_expr
	 *
	 * Constraint:
	 *     (method+=[Method|ID]+ | traitMethod=[Method|ID] | name=ID | (trait_expr=[Trait_expr|ID] trait_oper=Trait_oper))?
	 */
	protected void sequence_Trait_expr(ISerializationContext context, Trait_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Trait_oper returns Trait_oper
	 *     Class_modifier_fragment returns Trait_oper
	 *
	 * Constraint:
	 *     (method=Methodsig | methodsig+=Methodsig+ | trait_expr=Trait_expr | trait_exp=[Trait_expr|ID])?
	 */
	protected void sequence_Trait_oper(ISerializationContext context, Trait_oper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type_exp returns Type_exp
	 *     Update_preamble_declaration returns Type_exp
	 *
	 * Constraint:
	 *     (name=ANY_IDENTIFIER (lt=LT p+=Type_use p+=Type_use* gt=GT)?)
	 */
	protected void sequence_Type_exp(ISerializationContext context, Type_exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Data_constructor_arg returns Type_use
	 *     Type_use returns Type_use
	 *
	 * Constraint:
	 *     (name=ANY_IDENTIFIER (type_use+=Type_use type_use+=Type_use*)?)
	 */
	protected void sequence_Type_use(ISerializationContext context, Type_use semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Typesyn_decl
	 *     Typesyn_decl returns Typesyn_decl
	 *     Module_modifier returns Typesyn_decl
	 *     Functional_modifier returns Typesyn_decl
	 *
	 * Constraint:
	 *     (name=ID type_use=Type_use)
	 */
	protected void sequence_Typesyn_decl(ISerializationContext context, Typesyn_decl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.DECL__NAME));
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.TYPESYN_DECL__TYPE_USE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.TYPESYN_DECL__TYPE_USE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypesyn_declAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypesyn_declAccess().getType_useType_useParserRuleCall_3_0(), semanticObject.getType_use());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Update_decl returns Update_decl
	 *
	 * Constraint:
	 *     (name=ID object_update+=Object_update*)
	 */
	protected void sequence_Update_decl(ISerializationContext context, Update_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pure_exp returns Var_or_field_ref
	 *     Or_expr returns Var_or_field_ref
	 *     Or_expr.Or_expr_1_0 returns Var_or_field_ref
	 *     And_expr returns Var_or_field_ref
	 *     And_expr.And_expr_1_0 returns Var_or_field_ref
	 *     Equality_expr returns Var_or_field_ref
	 *     Equality_expr.Equality_expr_1_0 returns Var_or_field_ref
	 *     Comparison_expr returns Var_or_field_ref
	 *     Comparison_expr.Comparison_expr_1_0 returns Var_or_field_ref
	 *     PlusOrMinus_expr returns Var_or_field_ref
	 *     PlusOrMinus_expr.PlusOrMinus_expr_1_0 returns Var_or_field_ref
	 *     MulDivOrMod_expr returns Var_or_field_ref
	 *     MulDivOrMod_expr.MulDivOrMod_expr_1_0 returns Var_or_field_ref
	 *     Primary_expr returns Var_or_field_ref
	 *     Atomic_expr returns Var_or_field_ref
	 *     Var_or_field_ref returns Var_or_field_ref
	 *     Exp returns Var_or_field_ref
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Var_or_field_ref(ISerializationContext context, Var_or_field_ref semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.VAR_OR_FIELD_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.VAR_OR_FIELD_REF__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVar_or_field_refAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     When_condition returns When_condition
	 *
	 * Constraint:
	 *     application_condition=Application_condition
	 */
	protected void sequence_When_condition(ISerializationContext context, When_condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbsPackage.Literals.WHEN_CONDITION__APPLICATION_CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbsPackage.Literals.WHEN_CONDITION__APPLICATION_CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhen_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0(), semanticObject.getApplication_condition());
		feeder.finish();
	}
	
	
}
