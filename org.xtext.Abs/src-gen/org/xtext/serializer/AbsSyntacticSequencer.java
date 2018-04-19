/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.AbsGrammarAccess;

@SuppressWarnings("all")
public class AbsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AbsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AppPrimary_exp_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_AppPrimary_exp_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_AppUnary_exp_NEGATIONTerminalRuleCall_1_1_0_or_NEGATION_CREOLTerminalRuleCall_1_1_1;
	protected AbstractElementAlias match_Atomic_expr_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1;
	protected AbstractElementAlias match_Atomic_expr_Primary_expr_Pure_exp___LeftParenthesisKeyword_0_0_a___ANY_IDENTIFIERParserRuleCall_2_1_or_STRINGTerminalRuleCall_8_1___RightParenthesisKeyword_0_2___or___LeftParenthesisKeyword_0_0_a___INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1____;
	protected AbstractElementAlias match_Atomic_expr_Pure_exp_ANY_IDENTIFIERParserRuleCall_2_1_or_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_STRINGTerminalRuleCall_8_1_or_ThisKeyword_3_1;
	protected AbstractElementAlias match_Class_decl___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q;
	protected AbstractElementAlias match_Class_decl___RecoverKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_Data_constructor_arg_IDTerminalRuleCall_1_q;
	protected AbstractElementAlias match_Feature_decl___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q;
	protected AbstractElementAlias match_Feature_decl_constraint___ExcludeKeyword_2_1_ColonKeyword_2_2_IDTerminalRuleCall_2_3_SemicolonKeyword_2_4___or___RequireKeyword_3_1_ColonKeyword_3_2_IDTerminalRuleCall_3_3_SemicolonKeyword_3_4__;
	protected AbstractElementAlias match_Feature_decl_constraint___IfinKeyword_0_0_0_ColonKeyword_0_0_1__q;
	protected AbstractElementAlias match_Feature_decl_group_AllofKeyword_1_1_or_OneofKeyword_1_0_or___LeftSquareBracketKeyword_1_2_0_INTTerminalRuleCall_1_2_1_FullStopFullStopKeyword_1_2_2___INTTerminalRuleCall_1_2_3_0_or_MULTTerminalRuleCall_1_2_3_1___RightSquareBracketKeyword_1_2_4__;
	protected AbstractElementAlias match_Fnode_OptKeyword_0_q;
	protected AbstractElementAlias match_Functional_modifier_AddsKeyword_1_0_or_ModifiesKeyword_4_0;
	protected AbstractElementAlias match_Functional_modifier_AddsKeyword_2_0_or_ModifiesKeyword_3_0;
	protected AbstractElementAlias match_MexpPrimary_expr_MINUSTerminalRuleCall_1_1_1_or_NEGATIONTerminalRuleCall_1_1_0;
	protected AbstractElementAlias match_Mexp_IDTerminalRuleCall_1_1_or_IDTerminalRuleCall_2_1_or___IDTerminalRuleCall_0_1_FullStopKeyword_0_2_IDTerminalRuleCall_0_3__;
	protected AbstractElementAlias match_OO_modifier___ModifiesKeyword_1_2_0_ClassKeyword_1_2_1_ANY_IDENTIFIERParserRuleCall_1_2_2_LeftCurlyBracketKeyword_1_2_5_RightCurlyBracketKeyword_1_2_7___or___RemovesKeyword_1_4_0_InterfaceKeyword_1_4_1_ANY_IDENTIFIERParserRuleCall_1_4_2_SemicolonKeyword_1_4_3__;
	protected AbstractElementAlias match_Pattern_IDTerminalRuleCall_1_3_or_INTTerminalRuleCall_1_1_or_STRINGLITERALTerminalRuleCall_1_2_or__Keyword_1_0_or___ANY_IDENTIFIERParserRuleCall_1_4_0_LeftParenthesisKeyword_1_4_1_0_RightParenthesisKeyword_1_4_1_2__;
	protected AbstractElementAlias match_PrimaryGuard_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_PrimaryGuard_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_Primary_expr_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_expr_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Primary_expr_MINUSTerminalRuleCall_1_0_2_or_NEGATIONTerminalRuleCall_1_0_0_or_NEGATION_CREOLTerminalRuleCall_1_0_1;
	protected AbstractElementAlias match_ProductPrimary_exp_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_ProductPrimary_exp_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Product_decl_SemicolonKeyword_3_0_3_1_or___LeftCurlyBracketKeyword_3_0_3_0_0_RightCurlyBracketKeyword_3_0_3_0_2__;
	protected AbstractElementAlias match_Stmt___LeftCurlyBracketKeyword_1_5_0_RightCurlyBracketKeyword_1_5_2___or___SkipKeyword_1_2_0_SemicolonKeyword_1_2_1___or___SuspendKeyword_1_11_0_SemicolonKeyword_1_11_1__;
	protected AbstractElementAlias match_Var_or_field_ref___ThisKeyword_0_0_FullStopKeyword_0_1__q;
	protected AbstractElementAlias match_When_condition_ToKeyword_0_1_or_WhenKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AbsGrammarAccess) access;
		match_AppPrimary_exp_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getAppPrimary_expAccess().getLeftParenthesisKeyword_0_0());
		match_AppPrimary_exp_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getAppPrimary_expAccess().getLeftParenthesisKeyword_0_0());
		match_AppUnary_exp_NEGATIONTerminalRuleCall_1_1_0_or_NEGATION_CREOLTerminalRuleCall_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAppUnary_expAccess().getNEGATIONTerminalRuleCall_1_1_0()), new TokenAlias(false, false, grammarAccess.getAppUnary_expAccess().getNEGATION_CREOLTerminalRuleCall_1_1_1()));
		match_Atomic_expr_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getINTTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getNullKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getSTRINGLITERALTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getThisKeyword_3_1()));
		match_Atomic_expr_Primary_expr_Pure_exp___LeftParenthesisKeyword_0_0_a___ANY_IDENTIFIERParserRuleCall_2_1_or_STRINGTerminalRuleCall_8_1___RightParenthesisKeyword_0_2___or___LeftParenthesisKeyword_0_0_a___INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1____ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_0_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getINTTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getNullKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getSTRINGLITERALTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getThisKeyword_3_1()))), new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_0_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPure_expAccess().getANY_IDENTIFIERParserRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getPure_expAccess().getSTRINGTerminalRuleCall_8_1())), new TokenAlias(false, false, grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_0_2())));
		match_Atomic_expr_Pure_exp_ANY_IDENTIFIERParserRuleCall_2_1_or_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_STRINGTerminalRuleCall_8_1_or_ThisKeyword_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getINTTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getNullKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getSTRINGLITERALTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getAtomic_exprAccess().getThisKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getPure_expAccess().getANY_IDENTIFIERParserRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getPure_expAccess().getSTRINGTerminalRuleCall_8_1()));
		match_Class_decl___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_6_2()));
		match_Class_decl___RecoverKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getClass_declAccess().getRecoverKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_7_3()));
		match_Data_constructor_arg_IDTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getData_constructor_argAccess().getIDTerminalRuleCall_1());
		match_Feature_decl___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeature_declAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFeature_declAccess().getRightCurlyBracketKeyword_1_3()));
		match_Feature_decl_constraint___ExcludeKeyword_2_1_ColonKeyword_2_2_IDTerminalRuleCall_2_3_SemicolonKeyword_2_4___or___RequireKeyword_3_1_ColonKeyword_3_2_IDTerminalRuleCall_3_3_SemicolonKeyword_3_4__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getExcludeKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_2_3()), new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_2_4())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getRequireKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_3_3()), new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_3_4())));
		match_Feature_decl_constraint___IfinKeyword_0_0_0_ColonKeyword_0_0_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getIfinKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_0_0_1()));
		match_Feature_decl_group_AllofKeyword_1_1_or_OneofKeyword_1_0_or___LeftSquareBracketKeyword_1_2_0_INTTerminalRuleCall_1_2_1_FullStopFullStopKeyword_1_2_2___INTTerminalRuleCall_1_2_3_0_or_MULTTerminalRuleCall_1_2_3_1___RightSquareBracketKeyword_1_2_4__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getLeftSquareBracketKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_1()), new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getFullStopFullStopKeyword_1_2_2()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_3_0()), new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getMULTTerminalRuleCall_1_2_3_1())), new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getRightSquareBracketKeyword_1_2_4())), new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getAllofKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getFeature_decl_groupAccess().getOneofKeyword_1_0()));
		match_Fnode_OptKeyword_0_q = new TokenAlias(false, true, grammarAccess.getFnodeAccess().getOptKeyword_0());
		match_Functional_modifier_AddsKeyword_1_0_or_ModifiesKeyword_4_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctional_modifierAccess().getAddsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFunctional_modifierAccess().getModifiesKeyword_4_0()));
		match_Functional_modifier_AddsKeyword_2_0_or_ModifiesKeyword_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctional_modifierAccess().getAddsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getFunctional_modifierAccess().getModifiesKeyword_3_0()));
		match_MexpPrimary_expr_MINUSTerminalRuleCall_1_1_1_or_NEGATIONTerminalRuleCall_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMexpPrimary_exprAccess().getMINUSTerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getMexpPrimary_exprAccess().getNEGATIONTerminalRuleCall_1_1_0()));
		match_Mexp_IDTerminalRuleCall_1_1_or_IDTerminalRuleCall_2_1_or___IDTerminalRuleCall_0_1_FullStopKeyword_0_2_IDTerminalRuleCall_0_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getMexpAccess().getFullStopKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_3())), new TokenAlias(false, false, grammarAccess.getMexpAccess().getIDTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getMexpAccess().getIDTerminalRuleCall_2_1()));
		match_OO_modifier___ModifiesKeyword_1_2_0_ClassKeyword_1_2_1_ANY_IDENTIFIERParserRuleCall_1_2_2_LeftCurlyBracketKeyword_1_2_5_RightCurlyBracketKeyword_1_2_7___or___RemovesKeyword_1_4_0_InterfaceKeyword_1_4_1_ANY_IDENTIFIERParserRuleCall_1_4_2_SemicolonKeyword_1_4_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getModifiesKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getClassKeyword_1_2_1()), new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getANY_IDENTIFIERParserRuleCall_1_2_2()), new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getLeftCurlyBracketKeyword_1_2_5()), new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getRightCurlyBracketKeyword_1_2_7())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getRemovesKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getInterfaceKeyword_1_4_1()), new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getANY_IDENTIFIERParserRuleCall_1_4_2()), new TokenAlias(false, false, grammarAccess.getOO_modifierAccess().getSemicolonKeyword_1_4_3())));
		match_Pattern_IDTerminalRuleCall_1_3_or_INTTerminalRuleCall_1_1_or_STRINGLITERALTerminalRuleCall_1_2_or__Keyword_1_0_or___ANY_IDENTIFIERParserRuleCall_1_4_0_LeftParenthesisKeyword_1_4_1_0_RightParenthesisKeyword_1_4_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getANY_IDENTIFIERParserRuleCall_1_4_0()), new TokenAlias(false, false, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1_4_1_0()), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRightParenthesisKeyword_1_4_1_2())), new TokenAlias(false, false, grammarAccess.getPatternAccess().getIDTerminalRuleCall_1_3()), new TokenAlias(false, false, grammarAccess.getPatternAccess().getINTTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getPatternAccess().getSTRINGLITERALTerminalRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getPatternAccess().get_Keyword_1_0()));
		match_PrimaryGuard_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryGuardAccess().getLeftParenthesisKeyword_0());
		match_PrimaryGuard_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryGuardAccess().getLeftParenthesisKeyword_0());
		match_Primary_expr_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_expr_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_expr_MINUSTerminalRuleCall_1_0_2_or_NEGATIONTerminalRuleCall_1_0_0_or_NEGATION_CREOLTerminalRuleCall_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimary_exprAccess().getMINUSTerminalRuleCall_1_0_2()), new TokenAlias(false, false, grammarAccess.getPrimary_exprAccess().getNEGATIONTerminalRuleCall_1_0_0()), new TokenAlias(false, false, grammarAccess.getPrimary_exprAccess().getNEGATION_CREOLTerminalRuleCall_1_0_1()));
		match_ProductPrimary_exp_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getProductPrimary_expAccess().getLeftParenthesisKeyword_0_0());
		match_ProductPrimary_exp_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getProductPrimary_expAccess().getLeftParenthesisKeyword_0_0());
		match_Product_decl_SemicolonKeyword_3_0_3_1_or___LeftCurlyBracketKeyword_3_0_3_0_0_RightCurlyBracketKeyword_3_0_3_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getProduct_declAccess().getLeftCurlyBracketKeyword_3_0_3_0_0()), new TokenAlias(false, false, grammarAccess.getProduct_declAccess().getRightCurlyBracketKeyword_3_0_3_0_2())), new TokenAlias(false, false, grammarAccess.getProduct_declAccess().getSemicolonKeyword_3_0_3_1()));
		match_Stmt___LeftCurlyBracketKeyword_1_5_0_RightCurlyBracketKeyword_1_5_2___or___SkipKeyword_1_2_0_SemicolonKeyword_1_2_1___or___SuspendKeyword_1_11_0_SemicolonKeyword_1_11_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_5_0()), new TokenAlias(false, false, grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_5_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStmtAccess().getSkipKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getStmtAccess().getSemicolonKeyword_1_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStmtAccess().getSuspendKeyword_1_11_0()), new TokenAlias(false, false, grammarAccess.getStmtAccess().getSemicolonKeyword_1_11_1())));
		match_Var_or_field_ref___ThisKeyword_0_0_FullStopKeyword_0_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVar_or_field_refAccess().getThisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getVar_or_field_refAccess().getFullStopKeyword_0_1()));
		match_When_condition_ToKeyword_0_1_or_WhenKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWhen_conditionAccess().getToKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getWhen_conditionAccess().getWhenKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getANDANDRule())
			return getANDANDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getANY_IDENTIFIERRule())
			return getANY_IDENTIFIERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getGTRule())
			return getGTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLTRule())
			return getLTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMINUSRule())
			return getMINUSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMULTRule())
			return getMULTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNEGATIONRule())
			return getNEGATIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNEGATION_CREOLRule())
			return getNEGATION_CREOLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getORORRule())
			return getORORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGLITERALRule())
			return getSTRINGLITERALToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ANDAND:
	 * 	'&&'
	 * ;
	 */
	protected String getANDANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&&";
	}
	
	/**
	 * ANY_IDENTIFIER:
	 * 	(ID'.')* ID 
	 * ;
	 */
	protected String getANY_IDENTIFIERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal GT:
	 * 	'>'
	 * ;
	 */
	protected String getGTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 * 	
	 * ;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+
	 * 	
	 * ;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal LT:
	 * 	'<'
	 * ;
	 */
	protected String getLTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal MINUS:
	 * 	'-'
	 * ;
	 */
	protected String getMINUSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * terminal MULT:
	 * 	'*'
	 * ;
	 */
	protected String getMULTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * terminal NEGATION:
	 * 	'!'
	 * ;
	 */
	protected String getNEGATIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!";
	}
	
	/**
	 * terminal NEGATION_CREOL:
	 * 	'~'
	 * ;
	 */
	protected String getNEGATION_CREOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "~";
	}
	
	/**
	 * terminal OROR:
	 * 	'||'
	 * ;
	 */
	protected String getORORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	/**
	 * terminal STRING: 
	 * '"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * "'" ( '\\' .  | !('\\'|"'") )* "'"
	 * ;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * terminal STRINGLITERAL:
	 * 	'"'(STR_ESC|NEGATION_CREOL('\\'|'"'|'\r'|'\n'))*'"'
	 * ;
	 */
	protected String getSTRINGLITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AppPrimary_exp_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_AppPrimary_exp_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AppPrimary_exp_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_AppPrimary_exp_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AppUnary_exp_NEGATIONTerminalRuleCall_1_1_0_or_NEGATION_CREOLTerminalRuleCall_1_1_1.equals(syntax))
				emit_AppUnary_exp_NEGATIONTerminalRuleCall_1_1_0_or_NEGATION_CREOLTerminalRuleCall_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Atomic_expr_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1.equals(syntax))
				emit_Atomic_expr_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Atomic_expr_Primary_expr_Pure_exp___LeftParenthesisKeyword_0_0_a___ANY_IDENTIFIERParserRuleCall_2_1_or_STRINGTerminalRuleCall_8_1___RightParenthesisKeyword_0_2___or___LeftParenthesisKeyword_0_0_a___INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1____.equals(syntax))
				emit_Atomic_expr_Primary_expr_Pure_exp___LeftParenthesisKeyword_0_0_a___ANY_IDENTIFIERParserRuleCall_2_1_or_STRINGTerminalRuleCall_8_1___RightParenthesisKeyword_0_2___or___LeftParenthesisKeyword_0_0_a___INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Atomic_expr_Pure_exp_ANY_IDENTIFIERParserRuleCall_2_1_or_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_STRINGTerminalRuleCall_8_1_or_ThisKeyword_3_1.equals(syntax))
				emit_Atomic_expr_Pure_exp_ANY_IDENTIFIERParserRuleCall_2_1_or_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_STRINGTerminalRuleCall_8_1_or_ThisKeyword_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_decl___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q.equals(syntax))
				emit_Class_decl___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_decl___RecoverKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_Class_decl___RecoverKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Data_constructor_arg_IDTerminalRuleCall_1_q.equals(syntax))
				emit_Data_constructor_arg_IDTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Feature_decl___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q.equals(syntax))
				emit_Feature_decl___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Feature_decl_constraint___ExcludeKeyword_2_1_ColonKeyword_2_2_IDTerminalRuleCall_2_3_SemicolonKeyword_2_4___or___RequireKeyword_3_1_ColonKeyword_3_2_IDTerminalRuleCall_3_3_SemicolonKeyword_3_4__.equals(syntax))
				emit_Feature_decl_constraint___ExcludeKeyword_2_1_ColonKeyword_2_2_IDTerminalRuleCall_2_3_SemicolonKeyword_2_4___or___RequireKeyword_3_1_ColonKeyword_3_2_IDTerminalRuleCall_3_3_SemicolonKeyword_3_4__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Feature_decl_constraint___IfinKeyword_0_0_0_ColonKeyword_0_0_1__q.equals(syntax))
				emit_Feature_decl_constraint___IfinKeyword_0_0_0_ColonKeyword_0_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Feature_decl_group_AllofKeyword_1_1_or_OneofKeyword_1_0_or___LeftSquareBracketKeyword_1_2_0_INTTerminalRuleCall_1_2_1_FullStopFullStopKeyword_1_2_2___INTTerminalRuleCall_1_2_3_0_or_MULTTerminalRuleCall_1_2_3_1___RightSquareBracketKeyword_1_2_4__.equals(syntax))
				emit_Feature_decl_group_AllofKeyword_1_1_or_OneofKeyword_1_0_or___LeftSquareBracketKeyword_1_2_0_INTTerminalRuleCall_1_2_1_FullStopFullStopKeyword_1_2_2___INTTerminalRuleCall_1_2_3_0_or_MULTTerminalRuleCall_1_2_3_1___RightSquareBracketKeyword_1_2_4__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Fnode_OptKeyword_0_q.equals(syntax))
				emit_Fnode_OptKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Functional_modifier_AddsKeyword_1_0_or_ModifiesKeyword_4_0.equals(syntax))
				emit_Functional_modifier_AddsKeyword_1_0_or_ModifiesKeyword_4_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Functional_modifier_AddsKeyword_2_0_or_ModifiesKeyword_3_0.equals(syntax))
				emit_Functional_modifier_AddsKeyword_2_0_or_ModifiesKeyword_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MexpPrimary_expr_MINUSTerminalRuleCall_1_1_1_or_NEGATIONTerminalRuleCall_1_1_0.equals(syntax))
				emit_MexpPrimary_expr_MINUSTerminalRuleCall_1_1_1_or_NEGATIONTerminalRuleCall_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Mexp_IDTerminalRuleCall_1_1_or_IDTerminalRuleCall_2_1_or___IDTerminalRuleCall_0_1_FullStopKeyword_0_2_IDTerminalRuleCall_0_3__.equals(syntax))
				emit_Mexp_IDTerminalRuleCall_1_1_or_IDTerminalRuleCall_2_1_or___IDTerminalRuleCall_0_1_FullStopKeyword_0_2_IDTerminalRuleCall_0_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OO_modifier___ModifiesKeyword_1_2_0_ClassKeyword_1_2_1_ANY_IDENTIFIERParserRuleCall_1_2_2_LeftCurlyBracketKeyword_1_2_5_RightCurlyBracketKeyword_1_2_7___or___RemovesKeyword_1_4_0_InterfaceKeyword_1_4_1_ANY_IDENTIFIERParserRuleCall_1_4_2_SemicolonKeyword_1_4_3__.equals(syntax))
				emit_OO_modifier___ModifiesKeyword_1_2_0_ClassKeyword_1_2_1_ANY_IDENTIFIERParserRuleCall_1_2_2_LeftCurlyBracketKeyword_1_2_5_RightCurlyBracketKeyword_1_2_7___or___RemovesKeyword_1_4_0_InterfaceKeyword_1_4_1_ANY_IDENTIFIERParserRuleCall_1_4_2_SemicolonKeyword_1_4_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_IDTerminalRuleCall_1_3_or_INTTerminalRuleCall_1_1_or_STRINGLITERALTerminalRuleCall_1_2_or__Keyword_1_0_or___ANY_IDENTIFIERParserRuleCall_1_4_0_LeftParenthesisKeyword_1_4_1_0_RightParenthesisKeyword_1_4_1_2__.equals(syntax))
				emit_Pattern_IDTerminalRuleCall_1_3_or_INTTerminalRuleCall_1_1_or_STRINGLITERALTerminalRuleCall_1_2_or__Keyword_1_0_or___ANY_IDENTIFIERParserRuleCall_1_4_0_LeftParenthesisKeyword_1_4_1_0_RightParenthesisKeyword_1_4_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryGuard_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_PrimaryGuard_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryGuard_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_PrimaryGuard_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_expr_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_expr_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_expr_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_expr_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_expr_MINUSTerminalRuleCall_1_0_2_or_NEGATIONTerminalRuleCall_1_0_0_or_NEGATION_CREOLTerminalRuleCall_1_0_1.equals(syntax))
				emit_Primary_expr_MINUSTerminalRuleCall_1_0_2_or_NEGATIONTerminalRuleCall_1_0_0_or_NEGATION_CREOLTerminalRuleCall_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProductPrimary_exp_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_ProductPrimary_exp_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProductPrimary_exp_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_ProductPrimary_exp_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Product_decl_SemicolonKeyword_3_0_3_1_or___LeftCurlyBracketKeyword_3_0_3_0_0_RightCurlyBracketKeyword_3_0_3_0_2__.equals(syntax))
				emit_Product_decl_SemicolonKeyword_3_0_3_1_or___LeftCurlyBracketKeyword_3_0_3_0_0_RightCurlyBracketKeyword_3_0_3_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Stmt___LeftCurlyBracketKeyword_1_5_0_RightCurlyBracketKeyword_1_5_2___or___SkipKeyword_1_2_0_SemicolonKeyword_1_2_1___or___SuspendKeyword_1_11_0_SemicolonKeyword_1_11_1__.equals(syntax))
				emit_Stmt___LeftCurlyBracketKeyword_1_5_0_RightCurlyBracketKeyword_1_5_2___or___SkipKeyword_1_2_0_SemicolonKeyword_1_2_1___or___SuspendKeyword_1_11_0_SemicolonKeyword_1_11_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Var_or_field_ref___ThisKeyword_0_0_FullStopKeyword_0_1__q.equals(syntax))
				emit_Var_or_field_ref___ThisKeyword_0_0_FullStopKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_When_condition_ToKeyword_0_1_or_WhenKeyword_0_0.equals(syntax))
				emit_When_condition_ToKeyword_0_1_or_WhenKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (NEGATION | NEGATION_CREOL) operand=AppUnary_exp
	 *     (rule start) (ambiguity) feature+=[Feature_decl|ID]
	 *     (rule start) (ambiguity) {AppAnd_exp.left=}
	 *     (rule start) (ambiguity) {AppOr_exp.left=}
	 */
	protected void emit_AppPrimary_exp_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (NEGATION | NEGATION_CREOL) operand=AppUnary_exp
	 *     (rule start) (ambiguity) {AppAnd_exp.left=}
	 *     (rule start) (ambiguity) {AppOr_exp.left=}
	 */
	protected void emit_AppPrimary_exp_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     NEGATION | NEGATION_CREOL
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) operand=AppUnary_exp
	 *     (rule start) '('+ (ambiguity) operand=AppUnary_exp
	 */
	protected void emit_AppUnary_exp_NEGATIONTerminalRuleCall_1_1_0_or_NEGATION_CREOLTerminalRuleCall_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     INT | 'this' | STRINGLITERAL | 'null'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Atomic_expr_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('('* (STRINGLITERAL | 'null' | INT | 'this')) | ('('* (STRING | ANY_IDENTIFIER) ')')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Atomic_expr_Primary_expr_Pure_exp___LeftParenthesisKeyword_0_0_a___ANY_IDENTIFIERParserRuleCall_2_1_or_STRINGTerminalRuleCall_8_1___RightParenthesisKeyword_0_2___or___LeftParenthesisKeyword_0_0_a___INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_ThisKeyword_3_1____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         STRING | 
	  *         'this' | 
	  *         ANY_IDENTIFIER | 
	  *         STRINGLITERAL | 
	  *         'null' | 
	  *         INT
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 */
	protected void emit_Atomic_expr_Pure_exp_ANY_IDENTIFIERParserRuleCall_2_1_or_INTTerminalRuleCall_0_1_or_NullKeyword_4_1_or_STRINGLITERALTerminalRuleCall_1_1_or_STRINGTerminalRuleCall_8_1_or_ThisKeyword_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     field_decl+=Field_decl (ambiguity) 'recover' '{' casestmtbranch+=Casestmtbranch
	 *     field_decl+=Field_decl (ambiguity) ('recover' '{' '}')? '}' (rule end)
	 *     field_decl+=Field_decl (ambiguity) ('recover' '{' '}')? method+=Method
	 *     field_decl+=Field_decl (ambiguity) ('recover' '{' '}')? trait_usage+=Trait_usage
	 *     interface_name+=[Interface_decl|ANY_IDENTIFIER] '{' (ambiguity) 'recover' '{' casestmtbranch+=Casestmtbranch
	 *     interface_name+=[Interface_decl|ANY_IDENTIFIER] '{' (ambiguity) ('recover' '{' '}')? '}' (rule end)
	 *     interface_name+=[Interface_decl|ANY_IDENTIFIER] '{' (ambiguity) ('recover' '{' '}')? method+=Method
	 *     interface_name+=[Interface_decl|ANY_IDENTIFIER] '{' (ambiguity) ('recover' '{' '}')? trait_usage+=Trait_usage
	 *     name=ID '{' (ambiguity) 'recover' '{' casestmtbranch+=Casestmtbranch
	 *     name=ID '{' (ambiguity) ('recover' '{' '}')? '}' (rule end)
	 *     name=ID '{' (ambiguity) ('recover' '{' '}')? method+=Method
	 *     name=ID '{' (ambiguity) ('recover' '{' '}')? trait_usage+=Trait_usage
	 *     paramlist=Param_list '{' (ambiguity) 'recover' '{' casestmtbranch+=Casestmtbranch
	 *     paramlist=Param_list '{' (ambiguity) ('recover' '{' '}')? '}' (rule end)
	 *     paramlist=Param_list '{' (ambiguity) ('recover' '{' '}')? method+=Method
	 *     paramlist=Param_list '{' (ambiguity) ('recover' '{' '}')? trait_usage+=Trait_usage
	 */
	protected void emit_Class_decl___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('recover' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     field_decl+=Field_decl ('{' '}')? (ambiguity) '}' (rule end)
	 *     field_decl+=Field_decl ('{' '}')? (ambiguity) method+=Method
	 *     field_decl+=Field_decl ('{' '}')? (ambiguity) trait_usage+=Trait_usage
	 *     interface_name+=[Interface_decl|ANY_IDENTIFIER] '{' ('{' '}')? (ambiguity) '}' (rule end)
	 *     interface_name+=[Interface_decl|ANY_IDENTIFIER] '{' ('{' '}')? (ambiguity) method+=Method
	 *     interface_name+=[Interface_decl|ANY_IDENTIFIER] '{' ('{' '}')? (ambiguity) trait_usage+=Trait_usage
	 *     name=ID '{' ('{' '}')? (ambiguity) '}' (rule end)
	 *     name=ID '{' ('{' '}')? (ambiguity) method+=Method
	 *     name=ID '{' ('{' '}')? (ambiguity) trait_usage+=Trait_usage
	 *     paramlist=Param_list '{' ('{' '}')? (ambiguity) '}' (rule end)
	 *     paramlist=Param_list '{' ('{' '}')? (ambiguity) method+=Method
	 *     paramlist=Param_list '{' ('{' '}')? (ambiguity) trait_usage+=Trait_usage
	 *     stmt+=Stmt '}' (ambiguity) '}' (rule end)
	 *     stmt+=Stmt '}' (ambiguity) method+=Method
	 *     stmt+=Stmt '}' (ambiguity) trait_usage+=Trait_usage
	 */
	protected void emit_Class_decl___RecoverKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ID?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ANY_IDENTIFIER (ambiguity) (rule end)
	 *     type_use+=Type_use GT (ambiguity) (rule end)
	 */
	protected void emit_Data_constructor_arg_IDTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Feature_decl___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('exclude' ':' ID ';') | ('require' ':' ID ';')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Feature_decl_constraint___ExcludeKeyword_2_1_ColonKeyword_2_2_IDTerminalRuleCall_2_3_SemicolonKeyword_2_4___or___RequireKeyword_3_1_ColonKeyword_3_2_IDTerminalRuleCall_3_3_SemicolonKeyword_3_4__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('ifin' ':')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) mexp=Mexp
	 */
	protected void emit_Feature_decl_constraint___IfinKeyword_0_0_0_ColonKeyword_0_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' INT '..' (INT | MULT) ']') | 'oneof' | 'allof'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'group' (ambiguity) '{' fnode+=Fnode
	 */
	protected void emit_Feature_decl_group_AllofKeyword_1_1_or_OneofKeyword_1_0_or___LeftSquareBracketKeyword_1_2_0_INTTerminalRuleCall_1_2_1_FullStopFullStopKeyword_1_2_2___INTTerminalRuleCall_1_2_3_0_or_MULTTerminalRuleCall_1_2_3_1___RightSquareBracketKeyword_1_2_4__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'opt'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Fnode_OptKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'modifies' | 'adds'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'data' name=ID
	 */
	protected void emit_Functional_modifier_AddsKeyword_1_0_or_ModifiesKeyword_4_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'adds' | 'modifies'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'type' name=ID
	 */
	protected void emit_Functional_modifier_AddsKeyword_2_0_or_ModifiesKeyword_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     MINUS | NEGATION
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_MexpPrimary_expr_MINUSTerminalRuleCall_1_1_1_or_NEGATIONTerminalRuleCall_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (ID '.' ID) | ID | ID
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Mexp_IDTerminalRuleCall_1_1_or_IDTerminalRuleCall_2_1_or___IDTerminalRuleCall_0_1_FullStopKeyword_0_2_IDTerminalRuleCall_0_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('removes' 'interface' ANY_IDENTIFIER ';') | ('modifies' 'class' ANY_IDENTIFIER '{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_OO_modifier___ModifiesKeyword_1_2_0_ClassKeyword_1_2_1_ANY_IDENTIFIERParserRuleCall_1_2_2_LeftCurlyBracketKeyword_1_2_5_RightCurlyBracketKeyword_1_2_7___or___RemovesKeyword_1_4_0_InterfaceKeyword_1_4_1_ANY_IDENTIFIERParserRuleCall_1_4_2_SemicolonKeyword_1_4_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (ANY_IDENTIFIER '(' ')') | INT | '_' | STRINGLITERAL | ID
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '=>' pure_exp=Pure_exp
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Pattern_IDTerminalRuleCall_1_3_or_INTTerminalRuleCall_1_1_or_STRINGLITERALTerminalRuleCall_1_2_or__Keyword_1_0_or___ANY_IDENTIFIERParserRuleCall_1_4_0_LeftParenthesisKeyword_1_4_1_0_RightParenthesisKeyword_1_4_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'duration' '(' min=Pure_exp
	 *     (rule start) (ambiguity) e=Pure_exp
	 *     (rule start) (ambiguity) name=[Var_or_field_ref|ID]
	 *     (rule start) (ambiguity) {AndGuard.left=}
	 */
	protected void emit_PrimaryGuard_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'duration' '(' min=Pure_exp
	 *     (rule start) (ambiguity) e=Pure_exp
	 *     (rule start) (ambiguity) name=[Var_or_field_ref|ID]
	 *     (rule start) (ambiguity) {AndGuard.left=}
	 */
	protected void emit_PrimaryGuard_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'case' c=Pure_exp
	 *     (rule start) (ambiguity) 'if' c=Pure_exp
	 *     (rule start) (ambiguity) 'let' '(' type_use=Type_use
	 *     (rule start) (ambiguity) ('this' '.')? name=ID
	 *     (rule start) (ambiguity) (MINUS | NEGATION_CREOL | NEGATION) pure_exp=Primary_expr
	 *     (rule start) (ambiguity) (STRING | 'this' | ANY_IDENTIFIER | STRINGLITERAL | 'null' | INT) (rule start)
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '(' function_expr=Pure_exp_list
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '(' function_list+=Function_list
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '(' pure_exp_list=Pure_exp_list
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '[' variadic_exp_list=Pure_exp_list
	 *     (rule start) (ambiguity) var_or_field_ref=[Var_or_field_ref|ID]
	 *     (rule start) (ambiguity) {And_expr.left=}
	 *     (rule start) (ambiguity) {Comparison_expr.left=}
	 *     (rule start) (ambiguity) {Equality_expr.left=}
	 *     (rule start) (ambiguity) {MulDivOrMod_expr.left=}
	 *     (rule start) (ambiguity) {Or_expr.left=}
	 *     (rule start) (ambiguity) {PlusOrMinus_expr.left=}
	 */
	protected void emit_Primary_expr_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'case' c=Pure_exp
	 *     (rule start) (ambiguity) 'if' c=Pure_exp
	 *     (rule start) (ambiguity) 'let' '(' type_use=Type_use
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '(' function_expr=Pure_exp_list
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '(' function_list+=Function_list
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '(' pure_exp_list=Pure_exp_list
	 *     (rule start) (ambiguity) ANY_IDENTIFIER '[' variadic_exp_list=Pure_exp_list
	 *     (rule start) (ambiguity) var_or_field_ref=[Var_or_field_ref|ID]
	 *     (rule start) (ambiguity) {And_expr.left=}
	 *     (rule start) (ambiguity) {Comparison_expr.left=}
	 *     (rule start) (ambiguity) {Equality_expr.left=}
	 *     (rule start) (ambiguity) {MulDivOrMod_expr.left=}
	 *     (rule start) (ambiguity) {Or_expr.left=}
	 *     (rule start) (ambiguity) {PlusOrMinus_expr.left=}
	 */
	protected void emit_Primary_expr_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     MINUS | NEGATION_CREOL | NEGATION
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) pure_exp=Primary_expr
	 */
	protected void emit_Primary_expr_MINUSTerminalRuleCall_1_0_2_or_NEGATIONTerminalRuleCall_1_0_0_or_NEGATION_CREOLTerminalRuleCall_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' feature+=Feature
	 *     (rule start) (ambiguity) ID (rule start)
	 *     (rule start) (ambiguity) MINUS (rule start)
	 *     (rule start) (ambiguity) {ProductAnd_exp.left=}
	 *     (rule start) (ambiguity) {ProductOr_expr.left=}
	 */
	protected void emit_ProductPrimary_exp_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' feature+=Feature
	 *     (rule start) (ambiguity) ID ')' (rule start)
	 *     (rule start) (ambiguity) {ProductAnd_exp.left=}
	 *     (rule start) (ambiguity) {ProductOr_expr.left=}
	 */
	protected void emit_ProductPrimary_exp_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     feature+=Feature ')' (ambiguity) (rule end)
	 *     name=ID '(' ')' (ambiguity) (rule end)
	 */
	protected void emit_Product_decl_SemicolonKeyword_3_0_3_1_or___LeftCurlyBracketKeyword_3_0_3_0_0_RightCurlyBracketKeyword_3_0_3_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('skip' ';') | ('{' '}') | ('suspend' ';')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Stmt___LeftCurlyBracketKeyword_1_5_0_RightCurlyBracketKeyword_1_5_2___or___SkipKeyword_1_2_0_SemicolonKeyword_1_2_1___or___SuspendKeyword_1_11_0_SemicolonKeyword_1_11_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('this' '.')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) name=ID
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Var_or_field_ref___ThisKeyword_0_0_FullStopKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'when' | 'to'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) application_condition=Application_condition
	 */
	protected void emit_When_condition_ToKeyword_0_1_or_WhenKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
