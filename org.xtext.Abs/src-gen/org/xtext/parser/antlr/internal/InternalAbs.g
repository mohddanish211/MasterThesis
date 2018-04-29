/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
grammar InternalAbs;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.AbsGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private AbsGrammarAccess grammarAccess;

    public InternalAbsParser(TokenStream input, AbsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DomainModel";
   	}

   	@Override
   	protected AbsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainModelRule()); }
	iv_ruleDomainModel=ruleDomainModel
	{ $current=$iv_ruleDomainModel.current; }
	EOF;

// Rule DomainModel
ruleDomainModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getDomainModelAccess().getCompilation_UnitParserRuleCall());
	}
	this_Compilation_Unit_0=ruleCompilation_Unit
	{
		$current = $this_Compilation_Unit_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleCompilation_Unit
entryRuleCompilation_Unit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompilation_UnitRule()); }
	iv_ruleCompilation_Unit=ruleCompilation_Unit
	{ $current=$iv_ruleCompilation_Unit.current; }
	EOF;

// Rule Compilation_Unit
ruleCompilation_Unit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getCompilation_UnitAccess().getCompilation_UnitAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompilation_UnitAccess().getModuleModule_declParserRuleCall_1_0());
				}
				lv_module_1_0=ruleModule_decl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompilation_UnitRule());
					}
					add(
						$current,
						"module",
						lv_module_1_0,
						"org.xtext.Abs.Module_decl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCompilation_UnitAccess().getDeltaDeclDelta_declParserRuleCall_2_0());
				}
				lv_deltaDecl_2_0=ruleDelta_decl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompilation_UnitRule());
					}
					add(
						$current,
						"deltaDecl",
						lv_deltaDecl_2_0,
						"org.xtext.Abs.Delta_decl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCompilation_UnitAccess().getUpdate_declUpdate_declParserRuleCall_3_0());
				}
				lv_update_decl_3_0=ruleUpdate_decl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompilation_UnitRule());
					}
					add(
						$current,
						"update_decl",
						lv_update_decl_3_0,
						"org.xtext.Abs.Update_decl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCompilation_UnitAccess().getProductline_declProductline_declParserRuleCall_4_0());
				}
				lv_productline_decl_4_0=ruleProductline_decl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompilation_UnitRule());
					}
					set(
						$current,
						"productline_decl",
						lv_productline_decl_4_0,
						"org.xtext.Abs.Productline_decl");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getCompilation_UnitAccess().getProduct_declProduct_declParserRuleCall_5_0());
				}
				lv_product_decl_5_0=ruleProduct_decl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompilation_UnitRule());
					}
					add(
						$current,
						"product_decl",
						lv_product_decl_5_0,
						"org.xtext.Abs.Product_decl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				otherlv_6='root'
				{
					newLeafNode(otherlv_6, grammarAccess.getCompilation_UnitAccess().getRootKeyword_6_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCompilation_UnitAccess().getFeature_declFeature_declParserRuleCall_6_0_1_0());
						}
						lv_feature_decl_7_0=ruleFeature_decl
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCompilation_UnitRule());
							}
							add(
								$current,
								"feature_decl",
								lv_feature_decl_7_0,
								"org.xtext.Abs.Feature_decl");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_8='extension'
				{
					newLeafNode(otherlv_8, grammarAccess.getCompilation_UnitAccess().getExtensionKeyword_6_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCompilation_UnitAccess().getFextensionFextensionParserRuleCall_6_1_1_0());
						}
						lv_fextension_9_0=ruleFextension
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCompilation_UnitRule());
							}
							add(
								$current,
								"fextension",
								lv_fextension_9_0,
								"org.xtext.Abs.Fextension");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleModule_decl
entryRuleModule_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModule_declRule()); }
	iv_ruleModule_decl=ruleModule_decl
	{ $current=$iv_ruleModule_decl.current; }
	EOF;

// Rule Module_decl
ruleModule_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='module'
		{
			newLeafNode(otherlv_0, grammarAccess.getModule_declAccess().getModuleKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModule_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModule_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getModule_declAccess().getSemicolonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModule_declAccess().getModule_exportModule_exportParserRuleCall_3_0());
				}
				lv_module_export_3_0=ruleModule_export
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModule_declRule());
					}
					add(
						$current,
						"module_export",
						lv_module_export_3_0,
						"org.xtext.Abs.Module_export");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModule_declAccess().getModule_importModule_importParserRuleCall_4_0());
				}
				lv_module_import_4_0=ruleModule_import
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModule_declRule());
					}
					add(
						$current,
						"module_import",
						lv_module_import_4_0,
						"org.xtext.Abs.Module_import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModule_declAccess().getDeclDeclParserRuleCall_5_0());
				}
				lv_decl_5_0=ruleDecl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModule_declRule());
					}
					add(
						$current,
						"decl",
						lv_decl_5_0,
						"org.xtext.Abs.Decl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModule_declAccess().getMain_blockMain_blockParserRuleCall_6_0());
				}
				lv_main_block_6_0=ruleMain_block
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModule_declRule());
					}
					add(
						$current,
						"main_block",
						lv_main_block_6_0,
						"org.xtext.Abs.Main_block");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleModule_export
entryRuleModule_export returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModule_exportRule()); }
	iv_ruleModule_export=ruleModule_export
	{ $current=$iv_ruleModule_export.current; }
	EOF;

// Rule Module_export
ruleModule_export returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getModule_exportAccess().getModule_exportAction_0(),
					$current);
			}
		)
		otherlv_1='export'
		{
			newLeafNode(otherlv_1, grammarAccess.getModule_exportAccess().getExportKeyword_1());
		}
		(
			(
				(
					lv_star_2_0=RULE_MULT
					{
						newLeafNode(lv_star_2_0, grammarAccess.getModule_exportAccess().getStarMULTTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModule_exportRule());
						}
						setWithLastConsumed(
							$current,
							"star",
							lv_star_2_0,
							"org.xtext.Abs.MULT");
					}
				)
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModule_exportAccess().getAnyPackageQualifiedNameParserRuleCall_2_1_0_0());
						}
						lv_anyPackage_3_0=ruleQualifiedName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModule_exportRule());
							}
							add(
								$current,
								"anyPackage",
								lv_anyPackage_3_0,
								"org.xtext.Abs.QualifiedName");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_4=','
					{
						newLeafNode(otherlv_4, grammarAccess.getModule_exportAccess().getCommaKeyword_2_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getModule_exportAccess().getAnyPackageQualifiedNameParserRuleCall_2_1_1_1_0());
							}
							lv_anyPackage_5_0=ruleQualifiedName
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getModule_exportRule());
								}
								add(
									$current,
									"anyPackage",
									lv_anyPackage_5_0,
									"org.xtext.Abs.QualifiedName");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
		)
		(
			otherlv_6='from'
			{
				newLeafNode(otherlv_6, grammarAccess.getModule_exportAccess().getFromKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModule_exportAccess().getImportedNamespaceQualifiedNameParserRuleCall_3_1_0());
					}
					lv_importedNamespace_7_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModule_exportRule());
						}
						add(
							$current,
							"importedNamespace",
							lv_importedNamespace_7_0,
							"org.xtext.Abs.QualifiedName");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getModule_exportAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleModule_import
entryRuleModule_import returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModule_importRule()); }
	iv_ruleModule_import=ruleModule_import
	{ $current=$iv_ruleModule_import.current; }
	EOF;

// Rule Module_import
ruleModule_import returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getModule_importAccess().getImportKeyword_0());
		}
		(
			(
				(
					(
						lv_star_1_0=RULE_MULT
						{
							newLeafNode(lv_star_1_0, grammarAccess.getModule_importAccess().getStarMULTTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModule_importRule());
							}
							setWithLastConsumed(
								$current,
								"star",
								lv_star_1_0,
								"org.xtext.Abs.MULT");
						}
					)
				)
				otherlv_2='from'
				{
					newLeafNode(otherlv_2, grammarAccess.getModule_importAccess().getFromKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModule_importAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_2_0());
						}
						lv_importedNamespace_3_0=ruleQualifiedName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModule_importRule());
							}
							set(
								$current,
								"importedNamespace",
								lv_importedNamespace_3_0,
								"org.xtext.Abs.QualifiedName");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=';'
				{
					newLeafNode(otherlv_4, grammarAccess.getModule_importAccess().getSemicolonKeyword_1_0_3());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModule_importAccess().getNameQualifiedNameParserRuleCall_1_1_0_0());
						}
						lv_name_5_0=ruleQualifiedName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModule_importRule());
							}
							add(
								$current,
								"name",
								lv_name_5_0,
								"org.xtext.Abs.QualifiedName");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_6=','
					{
						newLeafNode(otherlv_6, grammarAccess.getModule_importAccess().getCommaKeyword_1_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getModule_importAccess().getNameQualifiedNameParserRuleCall_1_1_1_1_0());
							}
							lv_name_7_0=ruleQualifiedName
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getModule_importRule());
								}
								add(
									$current,
									"name",
									lv_name_7_0,
									"org.xtext.Abs.QualifiedName");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				(
					otherlv_8='from'
					{
						newLeafNode(otherlv_8, grammarAccess.getModule_importAccess().getFromKeyword_1_1_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getModule_importAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_2_1_0());
							}
							lv_importedNamespace_9_0=ruleQualifiedName
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getModule_importRule());
								}
								set(
									$current,
									"importedNamespace",
									lv_importedNamespace_9_0,
									"org.xtext.Abs.QualifiedName");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
				otherlv_10=';'
				{
					newLeafNode(otherlv_10, grammarAccess.getModule_importAccess().getSemicolonKeyword_1_1_3());
				}
			)
		)
	)
;

// Entry rule entryRuleDecl
entryRuleDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclRule()); }
	iv_ruleDecl=ruleDecl
	{ $current=$iv_ruleDecl.current; }
	EOF;

// Rule Decl
ruleDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getDataType_declParserRuleCall_0());
		}
		this_DataType_decl_0=ruleDataType_decl
		{
			$current = $this_DataType_decl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getFunction_declParserRuleCall_1());
		}
		this_Function_decl_1=ruleFunction_decl
		{
			$current = $this_Function_decl_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getPar_function_declParserRuleCall_2());
		}
		this_Par_function_decl_2=rulePar_function_decl
		{
			$current = $this_Par_function_decl_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getTypesyn_declParserRuleCall_3());
		}
		this_Typesyn_decl_3=ruleTypesyn_decl
		{
			$current = $this_Typesyn_decl_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getException_declParserRuleCall_4());
		}
		this_Exception_decl_4=ruleException_decl
		{
			$current = $this_Exception_decl_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getInterface_declParserRuleCall_5());
		}
		this_Interface_decl_5=ruleInterface_decl
		{
			$current = $this_Interface_decl_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getClass_declParserRuleCall_6());
		}
		this_Class_decl_6=ruleClass_decl
		{
			$current = $this_Class_decl_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDeclAccess().getTrait_declParserRuleCall_7());
		}
		this_Trait_decl_7=ruleTrait_decl
		{
			$current = $this_Trait_decl_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePar_function_decl
entryRulePar_function_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPar_function_declRule()); }
	iv_rulePar_function_decl=rulePar_function_decl
	{ $current=$iv_rulePar_function_decl.current; }
	EOF;

// Rule Par_function_decl
rulePar_function_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getPar_function_declAccess().getDefKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPar_function_declAccess().getType_useType_useParserRuleCall_1_0());
				}
				lv_type_use_1_0=ruleType_use
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPar_function_declRule());
					}
					set(
						$current,
						"type_use",
						lv_type_use_1_0,
						"org.xtext.Abs.Type_use");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPar_function_declAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPar_function_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			this_LT_3=RULE_LT
			{
				newLeafNode(this_LT_3, grammarAccess.getPar_function_declAccess().getLTTerminalRuleCall_3_0());
			}
			(
				(
					lv_p_4_0=RULE_ID
					{
						newLeafNode(lv_p_4_0, grammarAccess.getPar_function_declAccess().getPIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPar_function_declRule());
						}
						addWithLastConsumed(
							$current,
							"p",
							lv_p_4_0,
							"org.xtext.Abs.ID");
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getPar_function_declAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						lv_p_6_0=RULE_ID
						{
							newLeafNode(lv_p_6_0, grammarAccess.getPar_function_declAccess().getPIDTerminalRuleCall_3_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPar_function_declRule());
							}
							addWithLastConsumed(
								$current,
								"p",
								lv_p_6_0,
								"org.xtext.Abs.ID");
						}
					)
				)
			)*
			this_GT_7=RULE_GT
			{
				newLeafNode(this_GT_7, grammarAccess.getPar_function_declAccess().getGTTerminalRuleCall_3_3());
			}
		)?
		otherlv_8='('
		{
			newLeafNode(otherlv_8, grammarAccess.getPar_function_declAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPar_function_declAccess().getFunctionsFunction_name_listParserRuleCall_5_0());
				}
				lv_functions_9_0=ruleFunction_name_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPar_function_declRule());
					}
					set(
						$current,
						"functions",
						lv_functions_9_0,
						"org.xtext.Abs.Function_name_list");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getPar_function_declAccess().getRightParenthesisKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPar_function_declAccess().getParamsParam_listParserRuleCall_7_0());
				}
				lv_params_11_0=ruleParam_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPar_function_declRule());
					}
					set(
						$current,
						"params",
						lv_params_11_0,
						"org.xtext.Abs.Param_list");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='='
		{
			newLeafNode(otherlv_12, grammarAccess.getPar_function_declAccess().getEqualsSignKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPar_function_declAccess().getEPure_expParserRuleCall_9_0());
				}
				lv_e_13_0=rulePure_exp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPar_function_declRule());
					}
					set(
						$current,
						"e",
						lv_e_13_0,
						"org.xtext.Abs.Pure_exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getPar_function_declAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleFunction_name_list
entryRuleFunction_name_list returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunction_name_listRule()); }
	iv_ruleFunction_name_list=ruleFunction_name_list
	{ $current=$iv_ruleFunction_name_list.current; }
	EOF;

// Rule Function_name_list
ruleFunction_name_list returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunction_name_listAccess().getFunction_name_listAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunction_name_listAccess().getFunction_name_declFunction_name_declParserRuleCall_1_0_0());
					}
					lv_function_name_decl_1_0=ruleFunction_name_decl
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunction_name_listRule());
						}
						add(
							$current,
							"function_name_decl",
							lv_function_name_decl_1_0,
							"org.xtext.Abs.Function_name_decl");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getFunction_name_listAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunction_name_listAccess().getFunction_name_declFunction_name_declParserRuleCall_1_1_1_0());
						}
						lv_function_name_decl_3_0=ruleFunction_name_decl
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunction_name_listRule());
							}
							add(
								$current,
								"function_name_decl",
								lv_function_name_decl_3_0,
								"org.xtext.Abs.Function_name_decl");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleFunction_name_decl
entryRuleFunction_name_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunction_name_declRule()); }
	iv_ruleFunction_name_decl=ruleFunction_name_decl
	{ $current=$iv_ruleFunction_name_decl.current; }
	EOF;

// Rule Function_name_decl
ruleFunction_name_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getFunction_name_declAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFunction_name_declRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.xtext.Abs.ID");
			}
		)
	)
;

// Entry rule entryRuleDataType_decl
entryRuleDataType_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataType_declRule()); }
	iv_ruleDataType_decl=ruleDataType_decl
	{ $current=$iv_ruleDataType_decl.current; }
	EOF;

// Rule DataType_decl
ruleDataType_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataType_declAccess().getDataKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataType_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataType_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			this_LT_2=RULE_LT
			{
				newLeafNode(this_LT_2, grammarAccess.getDataType_declAccess().getLTTerminalRuleCall_2_0());
			}
			(
				(
					lv_p_3_0=RULE_ID
					{
						newLeafNode(lv_p_3_0, grammarAccess.getDataType_declAccess().getPIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataType_declRule());
						}
						addWithLastConsumed(
							$current,
							"p",
							lv_p_3_0,
							"org.xtext.Abs.ID");
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getDataType_declAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						lv_p_5_0=RULE_ID
						{
							newLeafNode(lv_p_5_0, grammarAccess.getDataType_declAccess().getPIDTerminalRuleCall_2_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDataType_declRule());
							}
							addWithLastConsumed(
								$current,
								"p",
								lv_p_5_0,
								"org.xtext.Abs.ID");
						}
					)
				)
			)*
			this_GT_6=RULE_GT
			{
				newLeafNode(this_GT_6, grammarAccess.getDataType_declAccess().getGTTerminalRuleCall_2_3());
			}
		)?
		(
			otherlv_7='='
			{
				newLeafNode(otherlv_7, grammarAccess.getDataType_declAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataType_declAccess().getData_constructorData_constructorParserRuleCall_3_1_0());
					}
					lv_data_constructor_8_0=ruleData_constructor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataType_declRule());
						}
						add(
							$current,
							"data_constructor",
							lv_data_constructor_8_0,
							"org.xtext.Abs.Data_constructor");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9='|'
				{
					newLeafNode(otherlv_9, grammarAccess.getDataType_declAccess().getVerticalLineKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDataType_declAccess().getData_constructorData_constructorParserRuleCall_3_2_1_0());
						}
						lv_data_constructor_10_0=ruleData_constructor
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDataType_declRule());
							}
							add(
								$current,
								"data_constructor",
								lv_data_constructor_10_0,
								"org.xtext.Abs.Data_constructor");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getDataType_declAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleData_constructor
entryRuleData_constructor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getData_constructorRule()); }
	iv_ruleData_constructor=ruleData_constructor
	{ $current=$iv_ruleData_constructor.current; }
	EOF;

// Rule Data_constructor
ruleData_constructor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getData_constructorAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getData_constructorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getData_constructorAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getData_constructorAccess().getData_constructor_argData_constructor_argParserRuleCall_1_1_0());
					}
					lv_data_constructor_arg_2_0=ruleData_constructor_arg
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getData_constructorRule());
						}
						add(
							$current,
							"data_constructor_arg",
							lv_data_constructor_arg_2_0,
							"org.xtext.Abs.Data_constructor_arg");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getData_constructorAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getData_constructorAccess().getData_constructor_argData_constructor_argParserRuleCall_1_2_1_0());
						}
						lv_data_constructor_arg_4_0=ruleData_constructor_arg
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getData_constructorRule());
							}
							add(
								$current,
								"data_constructor_arg",
								lv_data_constructor_arg_4_0,
								"org.xtext.Abs.Data_constructor_arg");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getData_constructorAccess().getRightParenthesisKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleData_constructor_arg
entryRuleData_constructor_arg returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getData_constructor_argRule()); }
	iv_ruleData_constructor_arg=ruleData_constructor_arg
	{ $current=$iv_ruleData_constructor_arg.current; }
	EOF;

// Rule Data_constructor_arg
ruleData_constructor_arg returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getData_constructor_argAccess().getType_useParserRuleCall_0());
		}
		this_Type_use_0=ruleType_use
		{
			$current = $this_Type_use_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			this_ID_1=RULE_ID
			{
				newLeafNode(this_ID_1, grammarAccess.getData_constructor_argAccess().getIDTerminalRuleCall_1());
			}
		)?
	)
;

// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	iv_ruleAnnotation=ruleAnnotation
	{ $current=$iv_ruleAnnotation.current; }
	EOF;

// Rule Annotation
ruleAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getAnnotationAccess().getType_useParserRuleCall_0_0());
			}
			this_Type_use_0=ruleType_use
			{
				$current = $this_Type_use_0.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getColonKeyword_0_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getPure_expPure_expParserRuleCall_1_0());
				}
				lv_pure_exp_2_0=rulePure_exp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationRule());
					}
					set(
						$current,
						"pure_exp",
						lv_pure_exp_2_0,
						"org.xtext.Abs.Pure_exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleType_use
entryRuleType_use returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getType_useRule()); }
	iv_ruleType_use=ruleType_use
	{ $current=$iv_ruleType_use.current; }
	EOF;

// Rule Type_use
ruleType_use returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getType_useAccess().getNameQualifiedNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getType_useRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.Abs.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_LT_1=RULE_LT
			{
				newLeafNode(this_LT_1, grammarAccess.getType_useAccess().getLTTerminalRuleCall_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getType_useAccess().getType_useType_useParserRuleCall_1_1_0());
					}
					lv_type_use_2_0=ruleType_use
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getType_useRule());
						}
						add(
							$current,
							"type_use",
							lv_type_use_2_0,
							"org.xtext.Abs.Type_use");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getType_useAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getType_useAccess().getType_useType_useParserRuleCall_1_2_1_0());
						}
						lv_type_use_4_0=ruleType_use
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getType_useRule());
							}
							add(
								$current,
								"type_use",
								lv_type_use_4_0,
								"org.xtext.Abs.Type_use");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			this_GT_5=RULE_GT
			{
				newLeafNode(this_GT_5, grammarAccess.getType_useAccess().getGTTerminalRuleCall_1_3());
			}
		)?
	)
;

// Entry rule entryRulePure_exp
entryRulePure_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPure_expRule()); }
	iv_rulePure_exp=rulePure_exp
	{ $current=$iv_rulePure_exp.current; }
	EOF;

// Rule Pure_exp
rulePure_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_0_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getPure_exp_listPure_exp_listParserRuleCall_0_2_0());
					}
					lv_pure_exp_list_2_0=rulePure_exp_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"pure_exp_list",
							lv_pure_exp_list_2_0,
							"org.xtext.Abs.Pure_exp_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getPure_expAccess().getRightParenthesisKeyword_0_3());
			}
		)
		    |
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_1_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getFunction_listFunction_listParserRuleCall_1_2_0());
					}
					lv_function_list_6_0=ruleFunction_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						add(
							$current,
							"function_list",
							lv_function_list_6_0,
							"org.xtext.Abs.Function_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=')'
			{
				newLeafNode(otherlv_7, grammarAccess.getPure_expAccess().getRightParenthesisKeyword_1_3());
			}
			otherlv_8='('
			{
				newLeafNode(otherlv_8, grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_1_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getPartial_function_pure_exp_listPure_exp_listParserRuleCall_1_5_0());
					}
					lv_partial_function_pure_exp_list_9_0=rulePure_exp_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"partial_function_pure_exp_list",
							lv_partial_function_pure_exp_list_9_0,
							"org.xtext.Abs.Pure_exp_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_10=')'
			{
				newLeafNode(otherlv_10, grammarAccess.getPure_expAccess().getRightParenthesisKeyword_1_6());
			}
		)
		    |
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getPure_expAccess().getQualifiedNameParserRuleCall_2_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
			otherlv_12='['
			{
				newLeafNode(otherlv_12, grammarAccess.getPure_expAccess().getLeftSquareBracketKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getVariadic_exp_listPure_exp_listParserRuleCall_2_2_0());
					}
					lv_variadic_exp_list_13_0=rulePure_exp_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"variadic_exp_list",
							lv_variadic_exp_list_13_0,
							"org.xtext.Abs.Pure_exp_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_14=']'
			{
				newLeafNode(otherlv_14, grammarAccess.getPure_expAccess().getRightSquareBracketKeyword_2_3());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPure_expAccess().getOr_exprParserRuleCall_3());
		}
		this_Or_expr_15=ruleOr_expr
		{
			$current = $this_Or_expr_15.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_16='if'
			{
				newLeafNode(otherlv_16, grammarAccess.getPure_expAccess().getIfKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getIfPure_expParserRuleCall_4_1_0());
					}
					lv_if_17_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"if",
							lv_if_17_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_18='then'
			{
				newLeafNode(otherlv_18, grammarAccess.getPure_expAccess().getThenKeyword_4_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getThenPure_expParserRuleCall_4_3_0());
					}
					lv_then_19_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"then",
							lv_then_19_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					('else')=>
					otherlv_20='else'
					{
						newLeafNode(otherlv_20, grammarAccess.getPure_expAccess().getElseKeyword_4_4_0());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getPure_expAccess().getElsePure_expParserRuleCall_4_4_1_0());
						}
						lv_else_21_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPure_expRule());
							}
							set(
								$current,
								"else",
								lv_else_21_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
		    |
		(
			otherlv_22='case'
			{
				newLeafNode(otherlv_22, grammarAccess.getPure_expAccess().getCaseKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getCasePure_expParserRuleCall_5_1_0());
					}
					lv_case_23_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"case",
							lv_case_23_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_24='{'
			{
				newLeafNode(otherlv_24, grammarAccess.getPure_expAccess().getLeftCurlyBracketKeyword_5_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getCasebranchCase_branchParserRuleCall_5_3_0());
					}
					lv_casebranch_25_0=ruleCase_branch
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						add(
							$current,
							"casebranch",
							lv_casebranch_25_0,
							"org.xtext.Abs.Case_branch");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_26='}'
			{
				newLeafNode(otherlv_26, grammarAccess.getPure_expAccess().getRightCurlyBracketKeyword_5_4());
			}
		)
		    |
		(
			otherlv_27='let'
			{
				newLeafNode(otherlv_27, grammarAccess.getPure_expAccess().getLetKeyword_6_0());
			}
			otherlv_28='('
			{
				newLeafNode(otherlv_28, grammarAccess.getPure_expAccess().getLeftParenthesisKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getType_useType_useParserRuleCall_6_2_0());
					}
					lv_type_use_29_0=ruleType_use
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"type_use",
							lv_type_use_29_0,
							"org.xtext.Abs.Type_use");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_value_30_0=RULE_ID
					{
						newLeafNode(lv_value_30_0, grammarAccess.getPure_expAccess().getValueIDTerminalRuleCall_6_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPure_expRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_30_0,
							"org.xtext.Abs.ID");
					}
				)
			)
			otherlv_31=')'
			{
				newLeafNode(otherlv_31, grammarAccess.getPure_expAccess().getRightParenthesisKeyword_6_4());
			}
			otherlv_32='='
			{
				newLeafNode(otherlv_32, grammarAccess.getPure_expAccess().getEqualsSignKeyword_6_5());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getIPure_expParserRuleCall_6_6_0());
					}
					lv_i_33_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"i",
							lv_i_33_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_34='in'
			{
				newLeafNode(otherlv_34, grammarAccess.getPure_expAccess().getInKeyword_6_7());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_expAccess().getBPure_expParserRuleCall_6_8_0());
					}
					lv_b_35_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_expRule());
						}
						set(
							$current,
							"b",
							lv_b_35_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleOr_expr
entryRuleOr_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOr_exprRule()); }
	iv_ruleOr_expr=ruleOr_expr
	{ $current=$iv_ruleOr_expr.current; }
	EOF;

// Rule Or_expr
ruleOr_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0());
		}
		this_And_expr_0=ruleAnd_expr
		{
			$current = $this_And_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0=RULE_OROR
					{
						newLeafNode(lv_op_2_0, grammarAccess.getOr_exprAccess().getOpORORTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOr_exprRule());
						}
						setWithLastConsumed(
							$current,
							"op",
							lv_op_2_0,
							"org.xtext.Abs.OROR");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAnd_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOr_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.And_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAnd_expr
entryRuleAnd_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnd_exprRule()); }
	iv_ruleAnd_expr=ruleAnd_expr
	{ $current=$iv_ruleAnd_expr.current; }
	EOF;

// Rule And_expr
ruleAnd_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAnd_exprAccess().getEquality_exprParserRuleCall_0());
		}
		this_Equality_expr_0=ruleEquality_expr
		{
			$current = $this_Equality_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0=RULE_ANDAND
					{
						newLeafNode(lv_op_2_0, grammarAccess.getAnd_exprAccess().getOpANDANDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAnd_exprRule());
						}
						setWithLastConsumed(
							$current,
							"op",
							lv_op_2_0,
							"org.xtext.Abs.ANDAND");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAnd_exprAccess().getRightEquality_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleEquality_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAnd_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.Equality_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEquality_expr
entryRuleEquality_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEquality_exprRule()); }
	iv_ruleEquality_expr=ruleEquality_expr
	{ $current=$iv_ruleEquality_expr.current; }
	EOF;

// Rule Equality_expr
ruleEquality_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEquality_exprAccess().getComparison_exprParserRuleCall_0());
		}
		this_Comparison_expr_0=ruleComparison_expr
		{
			$current = $this_Comparison_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getEquality_exprAccess().getEquality_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_EQEQ
						{
							newLeafNode(lv_op_2_1, grammarAccess.getEquality_exprAccess().getOpEQEQTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEquality_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.EQEQ");
						}
						    |
						lv_op_2_2=RULE_NOTEQ
						{
							newLeafNode(lv_op_2_2, grammarAccess.getEquality_exprAccess().getOpNOTEQTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEquality_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_2,
								"org.xtext.Abs.NOTEQ");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEquality_exprAccess().getRightComparison_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleComparison_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEquality_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.Comparison_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComparison_expr
entryRuleComparison_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparison_exprRule()); }
	iv_ruleComparison_expr=ruleComparison_expr
	{ $current=$iv_ruleComparison_expr.current; }
	EOF;

// Rule Comparison_expr
ruleComparison_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getComparison_exprAccess().getPlusOrMinus_exprParserRuleCall_0());
		}
		this_PlusOrMinus_expr_0=rulePlusOrMinus_expr
		{
			$current = $this_PlusOrMinus_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getComparison_exprAccess().getComparison_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_LT
						{
							newLeafNode(lv_op_2_1, grammarAccess.getComparison_exprAccess().getOpLTTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.LT");
						}
						    |
						lv_op_2_2=RULE_GT
						{
							newLeafNode(lv_op_2_2, grammarAccess.getComparison_exprAccess().getOpGTTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_2,
								"org.xtext.Abs.GT");
						}
						    |
						lv_op_2_3=RULE_LTEQ
						{
							newLeafNode(lv_op_2_3, grammarAccess.getComparison_exprAccess().getOpLTEQTerminalRuleCall_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_3,
								"org.xtext.Abs.LTEQ");
						}
						    |
						lv_op_2_4=RULE_GTEQ
						{
							newLeafNode(lv_op_2_4, grammarAccess.getComparison_exprAccess().getOpGTEQTerminalRuleCall_1_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_4,
								"org.xtext.Abs.GTEQ");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparison_exprAccess().getRightPlusOrMinus_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePlusOrMinus_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparison_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.PlusOrMinus_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePlusOrMinus_expr
entryRulePlusOrMinus_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusOrMinus_exprRule()); }
	iv_rulePlusOrMinus_expr=rulePlusOrMinus_expr
	{ $current=$iv_rulePlusOrMinus_expr.current; }
	EOF;

// Rule PlusOrMinus_expr
rulePlusOrMinus_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPlusOrMinus_exprAccess().getMulDivOrMod_exprParserRuleCall_0());
		}
		this_MulDivOrMod_expr_0=ruleMulDivOrMod_expr
		{
			$current = $this_MulDivOrMod_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPlusOrMinus_exprAccess().getPlusOrMinus_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_PLUS
						{
							newLeafNode(lv_op_2_1, grammarAccess.getPlusOrMinus_exprAccess().getOpPLUSTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPlusOrMinus_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.PLUS");
						}
						    |
						lv_op_2_2=RULE_MINUS
						{
							newLeafNode(lv_op_2_2, grammarAccess.getPlusOrMinus_exprAccess().getOpMINUSTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPlusOrMinus_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_2,
								"org.xtext.Abs.MINUS");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusOrMinus_exprAccess().getRightMulDivOrMod_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMulDivOrMod_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusOrMinus_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MulDivOrMod_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMulDivOrMod_expr
entryRuleMulDivOrMod_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMulDivOrMod_exprRule()); }
	iv_ruleMulDivOrMod_expr=ruleMulDivOrMod_expr
	{ $current=$iv_ruleMulDivOrMod_expr.current; }
	EOF;

// Rule MulDivOrMod_expr
ruleMulDivOrMod_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMulDivOrMod_exprAccess().getPrimary_exprParserRuleCall_0());
		}
		this_Primary_expr_0=rulePrimary_expr
		{
			$current = $this_Primary_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMulDivOrMod_exprAccess().getMulDivOrMod_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_MULT
						{
							newLeafNode(lv_op_2_1, grammarAccess.getMulDivOrMod_exprAccess().getOpMULTTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMulDivOrMod_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.MULT");
						}
						    |
						lv_op_2_2='/'
						{
							newLeafNode(lv_op_2_2, grammarAccess.getMulDivOrMod_exprAccess().getOpSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMulDivOrMod_exprRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
						}
						    |
						lv_op_2_3=RULE_MOD
						{
							newLeafNode(lv_op_2_3, grammarAccess.getMulDivOrMod_exprAccess().getOpMODTerminalRuleCall_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMulDivOrMod_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_3,
								"org.xtext.Abs.MOD");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMulDivOrMod_exprAccess().getRightUniary_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleUniary_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMulDivOrMod_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.Uniary_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleUniary_expr
entryRuleUniary_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUniary_exprRule()); }
	iv_ruleUniary_expr=ruleUniary_expr
	{ $current=$iv_ruleUniary_expr.current; }
	EOF;

// Rule Uniary_expr
ruleUniary_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					(
						lv_op_0_1=RULE_NEGATION
						{
							newLeafNode(lv_op_0_1, grammarAccess.getUniary_exprAccess().getOpNEGATIONTerminalRuleCall_0_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUniary_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_0_1,
								"org.xtext.Abs.NEGATION");
						}
						    |
						lv_op_0_2=RULE_NEGATION_CREOL
						{
							newLeafNode(lv_op_0_2, grammarAccess.getUniary_exprAccess().getOpNEGATION_CREOLTerminalRuleCall_0_0_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUniary_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_0_2,
								"org.xtext.Abs.NEGATION_CREOL");
						}
						    |
						lv_op_0_3=RULE_MINUS
						{
							newLeafNode(lv_op_0_3, grammarAccess.getUniary_exprAccess().getOpMINUSTerminalRuleCall_0_0_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUniary_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_0_3,
								"org.xtext.Abs.MINUS");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getUniary_exprAccess().getPure_expPure_expParserRuleCall_0_1_0());
					}
					lv_pure_exp_1_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUniary_exprRule());
						}
						set(
							$current,
							"pure_exp",
							lv_pure_exp_1_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getUniary_exprAccess().getPrimary_exprParserRuleCall_1());
		}
		this_Primary_expr_2=rulePrimary_expr
		{
			$current = $this_Primary_expr_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimary_expr
entryRulePrimary_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimary_exprRule()); }
	iv_rulePrimary_expr=rulePrimary_expr
	{ $current=$iv_rulePrimary_expr.current; }
	EOF;

// Rule Primary_expr
rulePrimary_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getPrimary_exprAccess().getPure_expParserRuleCall_0_1());
			}
			this_Pure_exp_1=rulePure_exp
			{
				$current = $this_Pure_exp_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimary_exprAccess().getAtomic_exprParserRuleCall_1());
		}
		this_Atomic_expr_3=ruleAtomic_expr
		{
			$current = $this_Atomic_expr_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtomic_expr
entryRuleAtomic_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomic_exprRule()); }
	iv_ruleAtomic_expr=ruleAtomic_expr
	{ $current=$iv_ruleAtomic_expr.current; }
	EOF;

// Rule Atomic_expr
ruleAtomic_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomic_exprAccess().getPure_expAction_0_0(),
						$current);
				}
			)
			this_INT_1=RULE_INT
			{
				newLeafNode(this_INT_1, grammarAccess.getAtomic_exprAccess().getINTTerminalRuleCall_0_1());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomic_exprAccess().getPure_expAction_1_0(),
						$current);
				}
			)
			this_STRINGLITERAL_3=RULE_STRINGLITERAL
			{
				newLeafNode(this_STRINGLITERAL_3, grammarAccess.getAtomic_exprAccess().getSTRINGLITERALTerminalRuleCall_1_1());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAtomic_exprAccess().getVar_or_field_refParserRuleCall_2());
		}
		this_Var_or_field_ref_4=ruleVar_or_field_ref
		{
			$current = $this_Var_or_field_ref_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomic_exprAccess().getPure_expAction_3_0(),
						$current);
				}
			)
			otherlv_6='this'
			{
				newLeafNode(otherlv_6, grammarAccess.getAtomic_exprAccess().getThisKeyword_3_1());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomic_exprAccess().getPure_expAction_4_0(),
						$current);
				}
			)
			otherlv_8='null'
			{
				newLeafNode(otherlv_8, grammarAccess.getAtomic_exprAccess().getNullKeyword_4_1());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomic_exprAccess().getPure_expAction_5_0(),
						$current);
				}
			)
			this_STRING_10=RULE_STRING
			{
				newLeafNode(this_STRING_10, grammarAccess.getAtomic_exprAccess().getSTRINGTerminalRuleCall_5_1());
			}
		)
	)
;

// Entry rule entryRuleVar_or_field_ref
entryRuleVar_or_field_ref returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVar_or_field_refRule()); }
	iv_ruleVar_or_field_ref=ruleVar_or_field_ref
	{ $current=$iv_ruleVar_or_field_ref.current; }
	EOF;

// Rule Var_or_field_ref
ruleVar_or_field_ref returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				otherlv_0='this'
				{
					newLeafNode(otherlv_0, grammarAccess.getVar_or_field_refAccess().getThisKeyword_0_0_0());
				}
				otherlv_1='.'
				{
					newLeafNode(otherlv_1, grammarAccess.getVar_or_field_refAccess().getFullStopKeyword_0_0_1());
				}
			)?
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getVar_or_field_refAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVar_or_field_refRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.xtext.Abs.ID");
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVar_or_field_refRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getVar_or_field_refAccess().getRefField_declCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleCase_branch
entryRuleCase_branch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCase_branchRule()); }
	iv_ruleCase_branch=ruleCase_branch
	{ $current=$iv_ruleCase_branch.current; }
	EOF;

// Rule Case_branch
ruleCase_branch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getCase_branchAccess().getPatternParserRuleCall_0());
		}
		this_Pattern_0=rulePattern
		{
			$current = $this_Pattern_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getCase_branchAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCase_branchAccess().getPure_expPure_expParserRuleCall_2_0());
				}
				lv_pure_exp_2_0=rulePure_exp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCase_branchRule());
					}
					set(
						$current,
						"pure_exp",
						lv_pure_exp_2_0,
						"org.xtext.Abs.Pure_exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getCase_branchAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	iv_rulePattern=rulePattern
	{ $current=$iv_rulePattern.current; }
	EOF;

// Rule Pattern
rulePattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getPatternAccess().getPatternAction_0(),
					$current);
			}
		)
		(
			otherlv_1='_'
			{
				newLeafNode(otherlv_1, grammarAccess.getPatternAccess().get_Keyword_1_0());
			}
			    |
			this_INT_2=RULE_INT
			{
				newLeafNode(this_INT_2, grammarAccess.getPatternAccess().getINTTerminalRuleCall_1_1());
			}
			    |
			this_STRINGLITERAL_3=RULE_STRINGLITERAL
			{
				newLeafNode(this_STRINGLITERAL_3, grammarAccess.getPatternAccess().getSTRINGLITERALTerminalRuleCall_1_2());
			}
			    |
			this_ID_4=RULE_ID
			{
				newLeafNode(this_ID_4, grammarAccess.getPatternAccess().getIDTerminalRuleCall_1_3());
			}
			    |
			(
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getPatternAccess().getQualifiedNameParserRuleCall_1_4_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
				(
					otherlv_6='('
					{
						newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1_4_1_0());
					}
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getPatternAccess().getPatternPatternParserRuleCall_1_4_1_1_0_0());
								}
								lv_pattern_7_0=rulePattern
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getPatternRule());
									}
									add(
										$current,
										"pattern",
										lv_pattern_7_0,
										"org.xtext.Abs.Pattern");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_8=','
							{
								newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getCommaKeyword_1_4_1_1_1_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getPatternAccess().getPatternPatternParserRuleCall_1_4_1_1_1_1_0());
									}
									lv_pattern_9_0=rulePattern
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getPatternRule());
										}
										add(
											$current,
											"pattern",
											lv_pattern_9_0,
											"org.xtext.Abs.Pattern");
										afterParserOrEnumRuleCall();
									}
								)
							)
						)*
					)?
					otherlv_10=')'
					{
						newLeafNode(otherlv_10, grammarAccess.getPatternAccess().getRightParenthesisKeyword_1_4_1_2());
					}
				)
			)
		)
	)
;

// Entry rule entryRulePure_exp_list
entryRulePure_exp_list returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPure_exp_listRule()); }
	iv_rulePure_exp_list=rulePure_exp_list
	{ $current=$iv_rulePure_exp_list.current; }
	EOF;

// Rule Pure_exp_list
rulePure_exp_list returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getPure_exp_listAccess().getPure_exp_listAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPure_exp_listAccess().getPure_expPure_expParserRuleCall_1_0_0());
					}
					lv_pure_exp_1_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPure_exp_listRule());
						}
						add(
							$current,
							"pure_exp",
							lv_pure_exp_1_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getPure_exp_listAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPure_exp_listAccess().getPure_expPure_expParserRuleCall_1_1_1_0());
						}
						lv_pure_exp_3_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPure_exp_listRule());
							}
							add(
								$current,
								"pure_exp",
								lv_pure_exp_3_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleFunction_list
entryRuleFunction_list returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunction_listRule()); }
	iv_ruleFunction_list=ruleFunction_list
	{ $current=$iv_ruleFunction_list.current; }
	EOF;

// Rule Function_list
ruleFunction_list returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunction_listAccess().getFunction_listAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunction_listAccess().getFunction_paramFunction_paramParserRuleCall_1_0_0());
					}
					lv_function_param_1_0=ruleFunction_param
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunction_listRule());
						}
						add(
							$current,
							"function_param",
							lv_function_param_1_0,
							"org.xtext.Abs.Function_param");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getFunction_listAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunction_listAccess().getFunction_paramFunction_paramParserRuleCall_1_1_1_0());
						}
						lv_function_param_3_0=ruleFunction_param
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunction_listRule());
							}
							add(
								$current,
								"function_param",
								lv_function_param_3_0,
								"org.xtext.Abs.Function_param");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleFunction_param
entryRuleFunction_param returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunction_paramRule()); }
	iv_ruleFunction_param=ruleFunction_param
	{ $current=$iv_ruleFunction_param.current; }
	EOF;

// Rule Function_param
ruleFunction_param returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFunction_paramAccess().getFunction_name_param_declParserRuleCall_0());
		}
		this_Function_name_param_decl_0=ruleFunction_name_param_decl
		{
			$current = $this_Function_name_param_decl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFunction_paramAccess().getAnon_function_declParserRuleCall_1());
		}
		this_Anon_function_decl_1=ruleAnon_function_decl
		{
			$current = $this_Anon_function_decl_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFunction_name_param_decl
entryRuleFunction_name_param_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunction_name_param_declRule()); }
	iv_ruleFunction_name_param_decl=ruleFunction_name_param_decl
	{ $current=$iv_ruleFunction_name_param_decl.current; }
	EOF;

// Rule Function_name_param_decl
ruleFunction_name_param_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_ID
			{
				newLeafNode(lv_value_0_0, grammarAccess.getFunction_name_param_declAccess().getValueIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFunction_name_param_declRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.xtext.Abs.ID");
			}
		)
	)
;

// Entry rule entryRuleAnon_function_decl
entryRuleAnon_function_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnon_function_declRule()); }
	iv_ruleAnon_function_decl=ruleAnon_function_decl
	{ $current=$iv_ruleAnon_function_decl.current; }
	EOF;

// Rule Anon_function_decl
ruleAnon_function_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAnon_function_declAccess().getParamsParam_listParserRuleCall_0_0());
				}
				lv_params_0_0=ruleParam_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnon_function_declRule());
					}
					set(
						$current,
						"params",
						lv_params_0_0,
						"org.xtext.Abs.Param_list");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getAnon_function_declAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnon_function_declAccess().getPure_expPure_expParserRuleCall_2_0());
				}
				lv_pure_exp_2_0=rulePure_exp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnon_function_declRule());
					}
					set(
						$current,
						"pure_exp",
						lv_pure_exp_2_0,
						"org.xtext.Abs.Pure_exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParam_list
entryRuleParam_list returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParam_listRule()); }
	iv_ruleParam_list=ruleParam_list
	{ $current=$iv_ruleParam_list.current; }
	EOF;

// Rule Param_list
ruleParam_list returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getParam_listAccess().getParam_listAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getParam_listAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getParam_listAccess().getParam_declParam_declParserRuleCall_2_0_0());
					}
					lv_param_decl_2_0=ruleParam_decl
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParam_listRule());
						}
						add(
							$current,
							"param_decl",
							lv_param_decl_2_0,
							"org.xtext.Abs.Param_decl");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getParam_listAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParam_listAccess().getParam_declParam_declParserRuleCall_2_1_1_0());
						}
						lv_param_decl_4_0=ruleParam_decl
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParam_listRule());
							}
							add(
								$current,
								"param_decl",
								lv_param_decl_4_0,
								"org.xtext.Abs.Param_decl");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getParam_listAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleParam_decl
entryRuleParam_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParam_declRule()); }
	iv_ruleParam_decl=ruleParam_decl
	{ $current=$iv_ruleParam_decl.current; }
	EOF;

// Rule Param_decl
ruleParam_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getParam_declAccess().getType_expType_expParserRuleCall_0_0());
				}
				lv_type_exp_0_0=ruleType_exp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParam_declRule());
					}
					set(
						$current,
						"type_exp",
						lv_type_exp_0_0,
						"org.xtext.Abs.Type_exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getParam_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParam_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleType_exp
entryRuleType_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getType_expRule()); }
	iv_ruleType_exp=ruleType_exp
	{ $current=$iv_ruleType_exp.current; }
	EOF;

// Rule Type_exp
ruleType_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getType_expAccess().getNameQualifiedNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getType_expRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.Abs.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_LT_1=RULE_LT
			{
				newLeafNode(this_LT_1, grammarAccess.getType_expAccess().getLTTerminalRuleCall_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getType_expAccess().getPType_useParserRuleCall_1_1_0());
					}
					lv_p_2_0=ruleType_use
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getType_expRule());
						}
						add(
							$current,
							"p",
							lv_p_2_0,
							"org.xtext.Abs.Type_use");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getType_expAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getType_expAccess().getPType_useParserRuleCall_1_2_1_0());
						}
						lv_p_4_0=ruleType_use
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getType_expRule());
							}
							add(
								$current,
								"p",
								lv_p_4_0,
								"org.xtext.Abs.Type_use");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			this_GT_5=RULE_GT
			{
				newLeafNode(this_GT_5, grammarAccess.getType_expAccess().getGTTerminalRuleCall_1_3());
			}
		)?
	)
;

// Entry rule entryRuleFunction_decl
entryRuleFunction_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunction_declRule()); }
	iv_ruleFunction_decl=ruleFunction_decl
	{ $current=$iv_ruleFunction_decl.current; }
	EOF;

// Rule Function_decl
ruleFunction_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunction_declAccess().getDefKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunction_declAccess().getType_useType_useParserRuleCall_1_0());
				}
				lv_type_use_1_0=ruleType_use
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunction_declRule());
					}
					set(
						$current,
						"type_use",
						lv_type_use_1_0,
						"org.xtext.Abs.Type_use");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFunction_declAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunction_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			this_LT_3=RULE_LT
			{
				newLeafNode(this_LT_3, grammarAccess.getFunction_declAccess().getLTTerminalRuleCall_3_0());
			}
			(
				(
					lv_p_4_0=RULE_ID
					{
						newLeafNode(lv_p_4_0, grammarAccess.getFunction_declAccess().getPIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunction_declRule());
						}
						addWithLastConsumed(
							$current,
							"p",
							lv_p_4_0,
							"org.xtext.Abs.ID");
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getFunction_declAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						lv_p_6_0=RULE_ID
						{
							newLeafNode(lv_p_6_0, grammarAccess.getFunction_declAccess().getPIDTerminalRuleCall_3_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFunction_declRule());
							}
							addWithLastConsumed(
								$current,
								"p",
								lv_p_6_0,
								"org.xtext.Abs.ID");
						}
					)
				)
			)*
			this_GT_7=RULE_GT
			{
				newLeafNode(this_GT_7, grammarAccess.getFunction_declAccess().getGTTerminalRuleCall_3_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFunction_declAccess().getParamlistParam_listParserRuleCall_4_0());
				}
				lv_paramlist_8_0=ruleParam_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunction_declRule());
					}
					set(
						$current,
						"paramlist",
						lv_paramlist_8_0,
						"org.xtext.Abs.Param_list");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='='
		{
			newLeafNode(otherlv_9, grammarAccess.getFunction_declAccess().getEqualsSignKeyword_5());
		}
		(
			otherlv_10='builtin'
			{
				newLeafNode(otherlv_10, grammarAccess.getFunction_declAccess().getBuiltinKeyword_6_0());
			}
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFunction_declAccess().getPure_expPure_expParserRuleCall_6_1_0());
					}
					lv_pure_exp_11_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunction_declRule());
						}
						set(
							$current,
							"pure_exp",
							lv_pure_exp_11_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getFunction_declAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleTypesyn_decl
entryRuleTypesyn_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypesyn_declRule()); }
	iv_ruleTypesyn_decl=ruleTypesyn_decl
	{ $current=$iv_ruleTypesyn_decl.current; }
	EOF;

// Rule Typesyn_decl
ruleTypesyn_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getTypesyn_declAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTypesyn_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypesyn_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getTypesyn_declAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypesyn_declAccess().getType_useType_useParserRuleCall_3_0());
				}
				lv_type_use_3_0=ruleType_use
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypesyn_declRule());
					}
					set(
						$current,
						"type_use",
						lv_type_use_3_0,
						"org.xtext.Abs.Type_use");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getTypesyn_declAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleException_decl
entryRuleException_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getException_declRule()); }
	iv_ruleException_decl=ruleException_decl
	{ $current=$iv_ruleException_decl.current; }
	EOF;

// Rule Exception_decl
ruleException_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='exception'
		{
			newLeafNode(otherlv_0, grammarAccess.getException_declAccess().getExceptionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getException_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getException_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getException_declAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getException_declRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getException_declAccess().getTypeData_constructor_argCrossReference_2_1_0());
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getException_declAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getException_declRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getException_declAccess().getTypeData_constructor_argCrossReference_2_2_1_0());
						}
					)
				)
			)*
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getException_declAccess().getRightParenthesisKeyword_2_3());
			}
		)?
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getException_declAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleInterface_decl
entryRuleInterface_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInterface_declRule()); }
	iv_ruleInterface_decl=ruleInterface_decl
	{ $current=$iv_ruleInterface_decl.current; }
	EOF;

// Rule Interface_decl
ruleInterface_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='interface'
		{
			newLeafNode(otherlv_0, grammarAccess.getInterface_declAccess().getInterfaceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInterface_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInterface_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getInterface_declAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInterface_declRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declCrossReference_2_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getInterface_declAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInterface_declRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getInterface_declAccess().getInterface_nameInterface_declCrossReference_2_2_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getInterface_declAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInterface_declAccess().getMethodsigMethodsigParserRuleCall_4_0());
				}
				lv_methodsig_7_0=ruleMethodsig
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterface_declRule());
					}
					add(
						$current,
						"methodsig",
						lv_methodsig_7_0,
						"org.xtext.Abs.Methodsig");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getInterface_declAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleMethodsig
entryRuleMethodsig returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodsigRule()); }
	iv_ruleMethodsig=ruleMethodsig
	{ $current=$iv_ruleMethodsig.current; }
	EOF;

// Rule Methodsig
ruleMethodsig returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodsigAccess().getType_useType_useParserRuleCall_0_0());
				}
				lv_type_use_0_0=ruleType_use
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodsigRule());
					}
					set(
						$current,
						"type_use",
						lv_type_use_0_0,
						"org.xtext.Abs.Type_use");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodsigAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodsigRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodsigAccess().getParamlistParam_listParserRuleCall_2_0());
				}
				lv_paramlist_2_0=ruleParam_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodsigRule());
					}
					set(
						$current,
						"paramlist",
						lv_paramlist_2_0,
						"org.xtext.Abs.Param_list");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getMethodsigAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleClass_decl
entryRuleClass_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClass_declRule()); }
	iv_ruleClass_decl=ruleClass_decl
	{ $current=$iv_ruleClass_decl.current; }
	EOF;

// Rule Class_decl
ruleClass_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getClass_declAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getClass_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClass_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getClass_declAccess().getParamlistParam_listParserRuleCall_2_0());
				}
				lv_paramlist_2_0=ruleParam_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClass_declRule());
					}
					set(
						$current,
						"paramlist",
						lv_paramlist_2_0,
						"org.xtext.Abs.Param_list");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3='implements'
			{
				newLeafNode(otherlv_3, grammarAccess.getClass_declAccess().getImplementsKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClass_declRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getClass_declAccess().getInterface_nameInterface_declCrossReference_3_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getClass_declAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClass_declRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getClass_declAccess().getInterface_nameInterface_declCrossReference_3_2_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClass_declAccess().getField_declField_declParserRuleCall_5_0());
				}
				lv_field_decl_8_0=ruleField_decl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClass_declRule());
					}
					add(
						$current,
						"field_decl",
						lv_field_decl_8_0,
						"org.xtext.Abs.Field_decl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClass_declAccess().getStmtStmtParserRuleCall_6_1_0());
					}
					lv_stmt_10_0=ruleStmt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClass_declRule());
						}
						add(
							$current,
							"stmt",
							lv_stmt_10_0,
							"org.xtext.Abs.Stmt");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_6_2());
			}
		)?
		(
			otherlv_12='recover'
			{
				newLeafNode(otherlv_12, grammarAccess.getClass_declAccess().getRecoverKeyword_7_0());
			}
			otherlv_13='{'
			{
				newLeafNode(otherlv_13, grammarAccess.getClass_declAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClass_declAccess().getCasestmtbranchCasestmtbranchParserRuleCall_7_2_0());
					}
					lv_casestmtbranch_14_0=ruleCasestmtbranch
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClass_declRule());
						}
						add(
							$current,
							"casestmtbranch",
							lv_casestmtbranch_14_0,
							"org.xtext.Abs.Casestmtbranch");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_15='}'
			{
				newLeafNode(otherlv_15, grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_7_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getClass_declAccess().getTrait_usageTrait_usageParserRuleCall_8_0());
				}
				lv_trait_usage_16_0=ruleTrait_usage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClass_declRule());
					}
					add(
						$current,
						"trait_usage",
						lv_trait_usage_16_0,
						"org.xtext.Abs.Trait_usage");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getClass_declAccess().getMethodMethodParserRuleCall_9_0());
				}
				lv_method_17_0=ruleMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClass_declRule());
					}
					add(
						$current,
						"method",
						lv_method_17_0,
						"org.xtext.Abs.Method");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getClass_declAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleField_decl
entryRuleField_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getField_declRule()); }
	iv_ruleField_decl=ruleField_decl
	{ $current=$iv_ruleField_decl.current; }
	EOF;

// Rule Field_decl
ruleField_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getField_declAccess().getType_useType_useParserRuleCall_0_0());
				}
				lv_type_use_0_0=ruleType_use
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getField_declRule());
					}
					set(
						$current,
						"type_use",
						lv_type_use_0_0,
						"org.xtext.Abs.Type_use");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getField_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getField_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getField_declAccess().getEqualsSignKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getField_declAccess().getPure_expPure_expParserRuleCall_2_1_0());
					}
					lv_pure_exp_3_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getField_declRule());
						}
						set(
							$current,
							"pure_exp",
							lv_pure_exp_3_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getField_declAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleStmt
entryRuleStmt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStmtRule()); }
	iv_ruleStmt=ruleStmt
	{ $current=$iv_ruleStmt.current; }
	EOF;

// Rule Stmt
ruleStmt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getStmtAccess().getStmtAction_0(),
					$current);
			}
		)
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getType_expType_expParserRuleCall_1_0_0_0());
						}
						lv_type_exp_1_0=ruleType_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"type_exp",
								lv_type_exp_1_0,
								"org.xtext.Abs.Type_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						lv_name_2_0=RULE_ID
						{
							newLeafNode(lv_name_2_0, grammarAccess.getStmtAccess().getNameIDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStmtRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_2_0,
								"org.xtext.Abs.ID");
						}
					)
				)
				(
					otherlv_3='='
					{
						newLeafNode(otherlv_3, grammarAccess.getStmtAccess().getEqualsSignKeyword_1_0_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_0_2_1_0());
							}
							lv_exp_4_0=ruleExp
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStmtRule());
								}
								set(
									$current,
									"exp",
									lv_exp_4_0,
									"org.xtext.Abs.Exp");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
				otherlv_5=';'
				{
					newLeafNode(otherlv_5, grammarAccess.getStmtAccess().getSemicolonKeyword_1_0_3());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getVar_or_field_refVar_or_field_refParserRuleCall_1_1_0_0());
						}
						lv_var_or_field_ref_6_0=ruleVar_or_field_ref
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"var_or_field_ref",
								lv_var_or_field_ref_6_0,
								"org.xtext.Abs.Var_or_field_ref");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_7='='
				{
					newLeafNode(otherlv_7, grammarAccess.getStmtAccess().getEqualsSignKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_1_2_0());
						}
						lv_exp_8_0=ruleExp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"exp",
								lv_exp_8_0,
								"org.xtext.Abs.Exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_9=';'
				{
					newLeafNode(otherlv_9, grammarAccess.getStmtAccess().getSemicolonKeyword_1_1_3());
				}
			)
			    |
			(
				otherlv_10='skip'
				{
					newLeafNode(otherlv_10, grammarAccess.getStmtAccess().getSkipKeyword_1_2_0());
				}
				otherlv_11=';'
				{
					newLeafNode(otherlv_11, grammarAccess.getStmtAccess().getSemicolonKeyword_1_2_1());
				}
			)
			    |
			(
				otherlv_12='return'
				{
					newLeafNode(otherlv_12, grammarAccess.getStmtAccess().getReturnKeyword_1_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_3_1_0());
						}
						lv_exp_13_0=ruleExp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"exp",
								lv_exp_13_0,
								"org.xtext.Abs.Exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_14=';'
				{
					newLeafNode(otherlv_14, grammarAccess.getStmtAccess().getSemicolonKeyword_1_3_2());
				}
			)
			    |
			(
				otherlv_15='assert'
				{
					newLeafNode(otherlv_15, grammarAccess.getStmtAccess().getAssertKeyword_1_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_4_1_0());
						}
						lv_exp_16_0=ruleExp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"exp",
								lv_exp_16_0,
								"org.xtext.Abs.Exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_17=';'
				{
					newLeafNode(otherlv_17, grammarAccess.getStmtAccess().getSemicolonKeyword_1_4_2());
				}
			)
			    |
			(
				otherlv_18='{'
				{
					newLeafNode(otherlv_18, grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getStmtStmtParserRuleCall_1_5_1_0());
						}
						lv_stmt_19_0=ruleStmt
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							add(
								$current,
								"stmt",
								lv_stmt_19_0,
								"org.xtext.Abs.Stmt");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_20='}'
				{
					newLeafNode(otherlv_20, grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_5_2());
				}
			)
			    |
			(
				otherlv_21='if'
				{
					newLeafNode(otherlv_21, grammarAccess.getStmtAccess().getIfKeyword_1_6_0());
				}
				otherlv_22='('
				{
					newLeafNode(otherlv_22, grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_6_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getPure_expPure_expParserRuleCall_1_6_2_0());
						}
						lv_pure_exp_23_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"pure_exp",
								lv_pure_exp_23_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_24=')'
				{
					newLeafNode(otherlv_24, grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_6_3());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getIfstmtStmtParserRuleCall_1_6_4_0());
						}
						lv_ifstmt_25_0=ruleStmt
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"ifstmt",
								lv_ifstmt_25_0,
								"org.xtext.Abs.Stmt");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						('else')=>
						otherlv_26='else'
						{
							newLeafNode(otherlv_26, grammarAccess.getStmtAccess().getElseKeyword_1_6_5_0());
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getStmtAccess().getElsestmtStmtParserRuleCall_1_6_5_1_0());
							}
							lv_elsestmt_27_0=ruleStmt
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStmtRule());
								}
								set(
									$current,
									"elsestmt",
									lv_elsestmt_27_0,
									"org.xtext.Abs.Stmt");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
			)
			    |
			(
				otherlv_28='while'
				{
					newLeafNode(otherlv_28, grammarAccess.getStmtAccess().getWhileKeyword_1_7_0());
				}
				otherlv_29='('
				{
					newLeafNode(otherlv_29, grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_7_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getConditionPure_expParserRuleCall_1_7_2_0());
						}
						lv_condition_30_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"condition",
								lv_condition_30_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_31=')'
				{
					newLeafNode(otherlv_31, grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_7_3());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getWhilestmtStmtParserRuleCall_1_7_4_0());
						}
						lv_whilestmt_32_0=ruleStmt
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"whilestmt",
								lv_whilestmt_32_0,
								"org.xtext.Abs.Stmt");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_33='foreach'
				{
					newLeafNode(otherlv_33, grammarAccess.getStmtAccess().getForeachKeyword_1_8_0());
				}
				otherlv_34='('
				{
					newLeafNode(otherlv_34, grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_8_1());
				}
				(
					(
						lv_name_35_0=RULE_ID
						{
							newLeafNode(lv_name_35_0, grammarAccess.getStmtAccess().getNameIDTerminalRuleCall_1_8_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStmtRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_35_0,
								"org.xtext.Abs.ID");
						}
					)
				)
				otherlv_36='in'
				{
					newLeafNode(otherlv_36, grammarAccess.getStmtAccess().getInKeyword_1_8_3());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getLPure_expParserRuleCall_1_8_4_0());
						}
						lv_l_37_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"l",
								lv_l_37_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_38=')'
				{
					newLeafNode(otherlv_38, grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_8_5());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getForeachstmtStmtParserRuleCall_1_8_6_0());
						}
						lv_foreachstmt_39_0=ruleStmt
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"foreachstmt",
								lv_foreachstmt_39_0,
								"org.xtext.Abs.Stmt");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_40='try'
				{
					newLeafNode(otherlv_40, grammarAccess.getStmtAccess().getTryKeyword_1_9_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getTrystmtStmtParserRuleCall_1_9_1_0());
						}
						lv_trystmt_41_0=ruleStmt
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"trystmt",
								lv_trystmt_41_0,
								"org.xtext.Abs.Stmt");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_42='catch'
				{
					newLeafNode(otherlv_42, grammarAccess.getStmtAccess().getCatchKeyword_1_9_2());
				}
				(
					(
						otherlv_43='{'
						{
							newLeafNode(otherlv_43, grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_9_3_0_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_0_1_0());
								}
								lv_casestmtbranch_44_0=ruleCasestmtbranch
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getStmtRule());
									}
									add(
										$current,
										"casestmtbranch",
										lv_casestmtbranch_44_0,
										"org.xtext.Abs.Casestmtbranch");
									afterParserOrEnumRuleCall();
								}
							)
						)*
						otherlv_45='}'
						{
							newLeafNode(otherlv_45, grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_9_3_0_2());
						}
					)
					    |
					(
						(
							{
								newCompositeNode(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_9_3_1_0());
							}
							lv_casestmtbranch_46_0=ruleCasestmtbranch
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStmtRule());
								}
								add(
									$current,
									"casestmtbranch",
									lv_casestmtbranch_46_0,
									"org.xtext.Abs.Casestmtbranch");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				(
					otherlv_47='finally'
					{
						newLeafNode(otherlv_47, grammarAccess.getStmtAccess().getFinallyKeyword_1_9_4_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getStmtAccess().getStmtStmtParserRuleCall_1_9_4_1_0());
							}
							lv_stmt_48_0=ruleStmt
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStmtRule());
								}
								add(
									$current,
									"stmt",
									lv_stmt_48_0,
									"org.xtext.Abs.Stmt");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
			)
			    |
			(
				otherlv_49='await'
				{
					newLeafNode(otherlv_49, grammarAccess.getStmtAccess().getAwaitKeyword_1_10_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getRefGuardParserRuleCall_1_10_1_0());
						}
						lv_ref_50_0=ruleGuard
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"ref",
								lv_ref_50_0,
								"org.xtext.Abs.Guard");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_51=';'
				{
					newLeafNode(otherlv_51, grammarAccess.getStmtAccess().getSemicolonKeyword_1_10_2());
				}
			)
			    |
			(
				otherlv_52='suspend'
				{
					newLeafNode(otherlv_52, grammarAccess.getStmtAccess().getSuspendKeyword_1_11_0());
				}
				otherlv_53=';'
				{
					newLeafNode(otherlv_53, grammarAccess.getStmtAccess().getSemicolonKeyword_1_11_1());
				}
			)
			    |
			(
				otherlv_54='duration'
				{
					newLeafNode(otherlv_54, grammarAccess.getStmtAccess().getDurationKeyword_1_12_0());
				}
				otherlv_55='('
				{
					newLeafNode(otherlv_55, grammarAccess.getStmtAccess().getLeftParenthesisKeyword_1_12_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getFPure_expParserRuleCall_1_12_2_0());
						}
						lv_f_56_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"f",
								lv_f_56_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_57=','
				{
					newLeafNode(otherlv_57, grammarAccess.getStmtAccess().getCommaKeyword_1_12_3());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getTPure_expParserRuleCall_1_12_4_0());
						}
						lv_t_58_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"t",
								lv_t_58_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_59=')'
				{
					newLeafNode(otherlv_59, grammarAccess.getStmtAccess().getRightParenthesisKeyword_1_12_5());
				}
				otherlv_60=';'
				{
					newLeafNode(otherlv_60, grammarAccess.getStmtAccess().getSemicolonKeyword_1_12_6());
				}
			)
			    |
			(
				otherlv_61='throw'
				{
					newLeafNode(otherlv_61, grammarAccess.getStmtAccess().getThrowKeyword_1_13_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getThrowPureExpPure_expParserRuleCall_1_13_1_0());
						}
						lv_throwPureExp_62_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"throwPureExp",
								lv_throwPureExp_62_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_63=';'
				{
					newLeafNode(otherlv_63, grammarAccess.getStmtAccess().getSemicolonKeyword_1_13_2());
				}
			)
			    |
			(
				otherlv_64='die'
				{
					newLeafNode(otherlv_64, grammarAccess.getStmtAccess().getDieKeyword_1_14_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getDiePureExpPure_expParserRuleCall_1_14_1_0());
						}
						lv_diePureExp_65_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"diePureExp",
								lv_diePureExp_65_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_66=';'
				{
					newLeafNode(otherlv_66, grammarAccess.getStmtAccess().getSemicolonKeyword_1_14_2());
				}
			)
			    |
			(
				otherlv_67='movecogto'
				{
					newLeafNode(otherlv_67, grammarAccess.getStmtAccess().getMovecogtoKeyword_1_15_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getMoveCogToPure_expParserRuleCall_1_15_1_0());
						}
						lv_moveCogTo_68_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"moveCogTo",
								lv_moveCogTo_68_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_69=';'
				{
					newLeafNode(otherlv_69, grammarAccess.getStmtAccess().getSemicolonKeyword_1_15_2());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getExpExpParserRuleCall_1_16_0_0());
						}
						lv_exp_70_0=ruleExp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"exp",
								lv_exp_70_0,
								"org.xtext.Abs.Exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_71=';'
				{
					newLeafNode(otherlv_71, grammarAccess.getStmtAccess().getSemicolonKeyword_1_16_1());
				}
			)
			    |
			(
				otherlv_72='case'
				{
					newLeafNode(otherlv_72, grammarAccess.getStmtAccess().getCaseKeyword_1_17_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getCPure_expParserRuleCall_1_17_1_0());
						}
						lv_c_73_0=rulePure_exp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							set(
								$current,
								"c",
								lv_c_73_0,
								"org.xtext.Abs.Pure_exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_74='{'
				{
					newLeafNode(otherlv_74, grammarAccess.getStmtAccess().getLeftCurlyBracketKeyword_1_17_2());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStmtAccess().getCasestmtbranchCasestmtbranchParserRuleCall_1_17_3_0());
						}
						lv_casestmtbranch_75_0=ruleCasestmtbranch
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStmtRule());
							}
							add(
								$current,
								"casestmtbranch",
								lv_casestmtbranch_75_0,
								"org.xtext.Abs.Casestmtbranch");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_76='}'
				{
					newLeafNode(otherlv_76, grammarAccess.getStmtAccess().getRightCurlyBracketKeyword_1_17_4());
				}
			)
		)
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getExpAccess().getEff_exprParserRuleCall_0());
		}
		this_Eff_expr_0=ruleEff_expr
		{
			$current = $this_Eff_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getExpAccess().getPure_expParserRuleCall_1());
		}
		this_Pure_exp_1=rulePure_exp
		{
			$current = $this_Pure_exp_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEff_expr
entryRuleEff_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEff_exprRule()); }
	iv_ruleEff_expr=ruleEff_expr
	{ $current=$iv_ruleEff_expr.current; }
	EOF;

// Rule Eff_expr
ruleEff_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_0_0());
			}
			this_Pure_exp_0=rulePure_exp
			{
				$current = $this_Pure_exp_0.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_1='.'
			{
				newLeafNode(otherlv_1, grammarAccess.getEff_exprAccess().getFullStopKeyword_0_1());
			}
			otherlv_2='get'
			{
				newLeafNode(otherlv_2, grammarAccess.getEff_exprAccess().getGetKeyword_0_2());
			}
		)
		    |
		(
			otherlv_3='new'
			{
				newLeafNode(otherlv_3, grammarAccess.getEff_exprAccess().getNewKeyword_1_0());
			}
			(
				(
					lv_l_4_0='local'
					{
						newLeafNode(lv_l_4_0, grammarAccess.getEff_exprAccess().getLLocalKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEff_exprRule());
						}
						setWithLastConsumed($current, "l", lv_l_4_0, "local");
					}
				)
			)?
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getEff_exprAccess().getQualifiedNameParserRuleCall_1_2());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
			otherlv_6='('
			{
				newLeafNode(otherlv_6, grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEff_exprAccess().getPure_exp_listPure_exp_listParserRuleCall_1_4_0());
					}
					lv_pure_exp_list_7_0=rulePure_exp_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEff_exprRule());
						}
						set(
							$current,
							"pure_exp_list",
							lv_pure_exp_list_7_0,
							"org.xtext.Abs.Pure_exp_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_1_5());
			}
		)
		    |
		(
			(
				otherlv_9='await'
				{
					newLeafNode(otherlv_9, grammarAccess.getEff_exprAccess().getAwaitKeyword_2_0());
				}
			)?
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_2_1());
			}
			this_Pure_exp_10=rulePure_exp
			{
				$current = $this_Pure_exp_10.current;
				afterParserOrEnumRuleCall();
			}
			this_NEGATION_11=RULE_NEGATION
			{
				newLeafNode(this_NEGATION_11, grammarAccess.getEff_exprAccess().getNEGATIONTerminalRuleCall_2_2());
			}
			(
				(
					lv_await_12_0=RULE_ID
					{
						newLeafNode(lv_await_12_0, grammarAccess.getEff_exprAccess().getAwaitIDTerminalRuleCall_2_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEff_exprRule());
						}
						setWithLastConsumed(
							$current,
							"await",
							lv_await_12_0,
							"org.xtext.Abs.ID");
					}
				)
			)
			otherlv_13='('
			{
				newLeafNode(otherlv_13, grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_2_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_2_5_0());
					}
					lv_list_14_0=rulePure_exp_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEff_exprRule());
						}
						add(
							$current,
							"list",
							lv_list_14_0,
							"org.xtext.Abs.Pure_exp_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_15=')'
			{
				newLeafNode(otherlv_15, grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_2_6());
			}
		)
		    |
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getEff_exprAccess().getPure_expParserRuleCall_3_0());
			}
			this_Pure_exp_16=rulePure_exp
			{
				$current = $this_Pure_exp_16.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_17='.'
			{
				newLeafNode(otherlv_17, grammarAccess.getEff_exprAccess().getFullStopKeyword_3_1());
			}
			(
				(
					lv_val_18_0=RULE_ID
					{
						newLeafNode(lv_val_18_0, grammarAccess.getEff_exprAccess().getValIDTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEff_exprRule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_18_0,
							"org.xtext.Abs.ID");
					}
				)
			)
			otherlv_19='('
			{
				newLeafNode(otherlv_19, grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_3_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_3_4_0());
					}
					lv_list_20_0=rulePure_exp_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEff_exprRule());
						}
						add(
							$current,
							"list",
							lv_list_20_0,
							"org.xtext.Abs.Pure_exp_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=')'
			{
				newLeafNode(otherlv_21, grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_3_5());
			}
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						newCompositeNode(grammarAccess.getEff_exprAccess().getDelta_idParserRuleCall_4_0_0_0());
					}
					this_Delta_id_22=ruleDelta_id
					{
						$current = $this_Delta_id_22.current;
						afterParserOrEnumRuleCall();
					}
					    |
					otherlv_23='core'
					{
						newLeafNode(otherlv_23, grammarAccess.getEff_exprAccess().getCoreKeyword_4_0_0_1());
					}
				)
				otherlv_24='.'
				{
					newLeafNode(otherlv_24, grammarAccess.getEff_exprAccess().getFullStopKeyword_4_0_1());
				}
			)?
			otherlv_25='original'
			{
				newLeafNode(otherlv_25, grammarAccess.getEff_exprAccess().getOriginalKeyword_4_1());
			}
			otherlv_26='('
			{
				newLeafNode(otherlv_26, grammarAccess.getEff_exprAccess().getLeftParenthesisKeyword_4_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEff_exprAccess().getListPure_exp_listParserRuleCall_4_3_0());
					}
					lv_list_27_0=rulePure_exp_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEff_exprRule());
						}
						add(
							$current,
							"list",
							lv_list_27_0,
							"org.xtext.Abs.Pure_exp_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_28=')'
			{
				newLeafNode(otherlv_28, grammarAccess.getEff_exprAccess().getRightParenthesisKeyword_4_4());
			}
		)
	)
;

// Entry rule entryRuleDelta_id
entryRuleDelta_id returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelta_idRule()); }
	iv_ruleDelta_id=ruleDelta_id
	{ $current=$iv_ruleDelta_id.current; }
	EOF;

// Rule Delta_id
ruleDelta_id returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getDelta_idAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDelta_idRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.xtext.Abs.ID");
			}
		)
	)
;

// Entry rule entryRuleGuard
entryRuleGuard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuardRule()); }
	iv_ruleGuard=ruleGuard
	{ $current=$iv_ruleGuard.current; }
	EOF;

// Rule Guard
ruleGuard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGuardAccess().getRefVar_or_field_refParserRuleCall_0_0_0());
					}
					lv_ref_0_0=ruleVar_or_field_ref
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGuardRule());
						}
						set(
							$current,
							"ref",
							lv_ref_0_0,
							"org.xtext.Abs.Var_or_field_ref");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1='?'
			{
				newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getQuestionMarkKeyword_0_1());
			}
		)
		    |
		(
			otherlv_2='duration'
			{
				newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getDurationKeyword_1_0());
			}
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGuardAccess().getMinPure_expParserRuleCall_1_2_0());
					}
					lv_min_4_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGuardRule());
						}
						set(
							$current,
							"min",
							lv_min_4_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getGuardAccess().getCommaKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGuardAccess().getMaxPure_expParserRuleCall_1_4_0());
					}
					lv_max_6_0=rulePure_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGuardRule());
						}
						set(
							$current,
							"max",
							lv_max_6_0,
							"org.xtext.Abs.Pure_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=')'
			{
				newLeafNode(otherlv_7, grammarAccess.getGuardAccess().getRightParenthesisKeyword_1_5());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGuardAccess().getAndGuardParserRuleCall_2());
		}
		this_AndGuard_8=ruleAndGuard
		{
			$current = $this_AndGuard_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAndGuard
entryRuleAndGuard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndGuardRule()); }
	iv_ruleAndGuard=ruleAndGuard
	{ $current=$iv_ruleAndGuard.current; }
	EOF;

// Rule AndGuard
ruleAndGuard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndGuardAccess().getPrimaryGuardParserRuleCall_0());
		}
		this_PrimaryGuard_0=rulePrimaryGuard
		{
			$current = $this_PrimaryGuard_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndGuardAccess().getAndGuardLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0='&'
					{
						newLeafNode(lv_op_2_0, grammarAccess.getAndGuardAccess().getOpAmpersandKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAndGuardRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_0, "&");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndGuardAccess().getRightPrimaryGuardParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimaryGuard
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndGuardRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.PrimaryGuard");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimaryGuard
entryRulePrimaryGuard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryGuardRule()); }
	iv_rulePrimaryGuard=rulePrimaryGuard
	{ $current=$iv_rulePrimaryGuard.current; }
	EOF;

// Rule PrimaryGuard
rulePrimaryGuard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryGuardAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getPrimaryGuardAccess().getGuardParserRuleCall_0_1());
			}
			this_Guard_1=ruleGuard
			{
				$current = $this_Guard_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryGuardAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimaryGuardAccess().getGuardPure_expParserRuleCall_1_0());
				}
				lv_guard_3_0=rulePure_exp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimaryGuardRule());
					}
					set(
						$current,
						"guard",
						lv_guard_3_0,
						"org.xtext.Abs.Pure_exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCasestmtbranch
entryRuleCasestmtbranch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCasestmtbranchRule()); }
	iv_ruleCasestmtbranch=ruleCasestmtbranch
	{ $current=$iv_ruleCasestmtbranch.current; }
	EOF;

// Rule Casestmtbranch
ruleCasestmtbranch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCasestmtbranchAccess().getPatternPatternParserRuleCall_0_0());
				}
				lv_pattern_0_0=rulePattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCasestmtbranchRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_0_0,
						"org.xtext.Abs.Pattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getCasestmtbranchAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCasestmtbranchAccess().getStmtStmtParserRuleCall_2_0());
				}
				lv_stmt_2_0=ruleStmt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCasestmtbranchRule());
					}
					set(
						$current,
						"stmt",
						lv_stmt_2_0,
						"org.xtext.Abs.Stmt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTrait_usage
entryRuleTrait_usage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrait_usageRule()); }
	iv_ruleTrait_usage=ruleTrait_usage
	{ $current=$iv_ruleTrait_usage.current; }
	EOF;

// Rule Trait_usage
ruleTrait_usage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getTrait_usageAccess().getTrait_usageAction_0(),
					$current);
			}
		)
		otherlv_1='uses'
		{
			newLeafNode(otherlv_1, grammarAccess.getTrait_usageAccess().getUsesKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTrait_usageRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTrait_usageAccess().getTraitUsageTrait_declCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTrait_usageAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleTrait_expr
entryRuleTrait_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrait_exprRule()); }
	iv_ruleTrait_expr=ruleTrait_expr
	{ $current=$iv_ruleTrait_expr.current; }
	EOF;

// Rule Trait_expr
ruleTrait_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getTrait_exprAccess().getTrait_exprAction_0_0(),
						$current);
				}
			)
			otherlv_1='{'
			{
				newLeafNode(otherlv_1, grammarAccess.getTrait_exprAccess().getLeftCurlyBracketKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTrait_exprAccess().getMethodMethodParserRuleCall_0_2_0());
					}
					lv_method_2_0=ruleMethod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrait_exprRule());
						}
						add(
							$current,
							"method",
							lv_method_2_0,
							"org.xtext.Abs.Method");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_3='}'
			{
				newLeafNode(otherlv_3, grammarAccess.getTrait_exprAccess().getRightCurlyBracketKeyword_0_3());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getTrait_exprAccess().getTraitMethodMethodParserRuleCall_1_0());
				}
				lv_traitMethod_4_0=ruleMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrait_exprRule());
					}
					set(
						$current,
						"traitMethod",
						lv_traitMethod_4_0,
						"org.xtext.Abs.Method");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTrait_exprRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTrait_exprAccess().getTraitNameTrait_declCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTrait_exprAccess().getTrait_Left_exprParserRuleCall_3());
		}
		this_trait_Left_expr_6=ruletrait_Left_expr
		{
			$current = $this_trait_Left_expr_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuletrait_Left_expr
entryRuletrait_Left_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrait_Left_exprRule()); }
	iv_ruletrait_Left_expr=ruletrait_Left_expr
	{ $current=$iv_ruletrait_Left_expr.current; }
	EOF;

// Rule trait_Left_expr
ruletrait_Left_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTrait_Left_exprAccess().getOpTrait_operParserRuleCall_0_0());
				}
				lv_op_0_0=ruleTrait_oper
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrait_Left_exprRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"org.xtext.Abs.Trait_oper");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTrait_Left_exprAccess().getTrait_exprPrimary_Trait_exprParserRuleCall_1_0());
				}
				lv_trait_expr_1_0=rulePrimary_Trait_expr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrait_Left_exprRule());
					}
					set(
						$current,
						"trait_expr",
						lv_trait_expr_1_0,
						"org.xtext.Abs.Primary_Trait_expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePrimary_Trait_expr
entryRulePrimary_Trait_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimary_Trait_exprRule()); }
	iv_rulePrimary_Trait_expr=rulePrimary_Trait_expr
	{ $current=$iv_rulePrimary_Trait_expr.current; }
	EOF;

// Rule Primary_Trait_expr
rulePrimary_Trait_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrimary_Trait_exprAccess().getLeftCurlyBracketKeyword_0());
		}
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimary_Trait_exprAccess().getTrait_exprParserRuleCall_1());
		}
		this_Trait_expr_1=ruleTrait_expr
		{
			$current = $this_Trait_expr_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getPrimary_Trait_exprAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleTrait_oper
entryRuleTrait_oper returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrait_operRule()); }
	iv_ruleTrait_oper=ruleTrait_oper
	{ $current=$iv_ruleTrait_oper.current; }
	EOF;

// Rule Trait_oper
ruleTrait_oper returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getTrait_operAccess().getTrait_operAction_0_0(),
						$current);
				}
			)
			otherlv_1='removes'
			{
				newLeafNode(otherlv_1, grammarAccess.getTrait_operAccess().getRemovesKeyword_0_1());
			}
			(
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTrait_operRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getTrait_operAccess().getMethodMethodsigCrossReference_0_2_0_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					otherlv_3='{'
					{
						newLeafNode(otherlv_3, grammarAccess.getTrait_operAccess().getLeftCurlyBracketKeyword_0_2_1_0());
					}
					(
						(
							{
								/* */
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getTrait_operRule());
								}
							}
							{
								newCompositeNode(grammarAccess.getTrait_operAccess().getMethodsigMethodsigCrossReference_0_2_1_1_0());
							}
							ruleQualifiedName
							{
								afterParserOrEnumRuleCall();
							}
						)
					)*
					otherlv_5='}'
					{
						newLeafNode(otherlv_5, grammarAccess.getTrait_operAccess().getRightCurlyBracketKeyword_0_2_1_2());
					}
				)
			)
		)
		    |
		(
			otherlv_6='adds'
			{
				newLeafNode(otherlv_6, grammarAccess.getTrait_operAccess().getAddsKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTrait_operAccess().getTrait_exprTrait_exprParserRuleCall_1_1_0());
					}
					lv_trait_expr_7_0=ruleTrait_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrait_operRule());
						}
						set(
							$current,
							"trait_expr",
							lv_trait_expr_7_0,
							"org.xtext.Abs.Trait_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_8='modifies'
			{
				newLeafNode(otherlv_8, grammarAccess.getTrait_operAccess().getModifiesKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTrait_operAccess().getTrait_expTrait_exprParserRuleCall_2_1_0());
					}
					lv_trait_exp_9_0=ruleTrait_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrait_operRule());
						}
						set(
							$current,
							"trait_exp",
							lv_trait_exp_9_0,
							"org.xtext.Abs.Trait_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	iv_ruleMethod=ruleMethod
	{ $current=$iv_ruleMethod.current; }
	EOF;

// Rule Method
ruleMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getType_useType_useParserRuleCall_0_0());
				}
				lv_type_use_0_0=ruleType_use
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"type_use",
						lv_type_use_0_0,
						"org.xtext.Abs.Type_use");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getParamlistParam_listParserRuleCall_2_0());
				}
				lv_paramlist_2_0=ruleParam_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"paramlist",
						lv_paramlist_2_0,
						"org.xtext.Abs.Param_list");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getStmtStmtParserRuleCall_4_0());
				}
				lv_stmt_4_0=ruleStmt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					add(
						$current,
						"stmt",
						lv_stmt_4_0,
						"org.xtext.Abs.Stmt");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleTrait_decl
entryRuleTrait_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrait_declRule()); }
	iv_ruleTrait_decl=ruleTrait_decl
	{ $current=$iv_ruleTrait_decl.current; }
	EOF;

// Rule Trait_decl
ruleTrait_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='trait'
		{
			newLeafNode(otherlv_0, grammarAccess.getTrait_declAccess().getTraitKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTrait_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTrait_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getTrait_declAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrait_declAccess().getTraitExprTrait_exprParserRuleCall_3_0());
				}
				lv_traitExpr_3_0=ruleTrait_expr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrait_declRule());
					}
					set(
						$current,
						"traitExpr",
						lv_traitExpr_3_0,
						"org.xtext.Abs.Trait_expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMain_block
entryRuleMain_block returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMain_blockRule()); }
	iv_ruleMain_block=ruleMain_block
	{ $current=$iv_ruleMain_block.current; }
	EOF;

// Rule Main_block
ruleMain_block returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getMain_blockAccess().getMain_blockAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getMain_blockAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMain_blockAccess().getStmtStmtParserRuleCall_2_0());
				}
				lv_stmt_2_0=ruleStmt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMain_blockRule());
					}
					add(
						$current,
						"stmt",
						lv_stmt_2_0,
						"org.xtext.Abs.Stmt");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getMain_blockAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleDelta_decl
entryRuleDelta_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelta_declRule()); }
	iv_ruleDelta_decl=ruleDelta_decl
	{ $current=$iv_ruleDelta_decl.current; }
	EOF;

// Rule Delta_decl
ruleDelta_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='delta'
		{
			newLeafNode(otherlv_0, grammarAccess.getDelta_declAccess().getDeltaKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDelta_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDelta_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getDelta_declAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDelta_declAccess().getPDelta_paramParserRuleCall_2_1_0());
					}
					lv_p_3_0=ruleDelta_param
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDelta_declRule());
						}
						add(
							$current,
							"p",
							lv_p_3_0,
							"org.xtext.Abs.Delta_param");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getDelta_declAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDelta_declAccess().getPDelta_paramParserRuleCall_2_2_1_0());
						}
						lv_p_5_0=ruleDelta_param
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDelta_declRule());
							}
							add(
								$current,
								"p",
								lv_p_5_0,
								"org.xtext.Abs.Delta_param");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getDelta_declAccess().getRightParenthesisKeyword_2_3());
			}
		)?
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getDelta_declAccess().getSemicolonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDelta_declAccess().getDelta_accessDelta_accessParserRuleCall_4_0());
				}
				lv_delta_access_8_0=ruleDelta_access
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDelta_declRule());
					}
					add(
						$current,
						"delta_access",
						lv_delta_access_8_0,
						"org.xtext.Abs.Delta_access");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDelta_declAccess().getModule_modifierModule_modifierParserRuleCall_5_0());
				}
				lv_module_modifier_9_0=ruleModule_modifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDelta_declRule());
					}
					add(
						$current,
						"module_modifier",
						lv_module_modifier_9_0,
						"org.xtext.Abs.Module_modifier");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleDelta_param
entryRuleDelta_param returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelta_paramRule()); }
	iv_ruleDelta_param=ruleDelta_param
	{ $current=$iv_ruleDelta_param.current; }
	EOF;

// Rule Delta_param
ruleDelta_param returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDelta_paramAccess().getParam_declParserRuleCall_0());
		}
		this_Param_decl_0=ruleParam_decl
		{
			$current = $this_Param_decl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getDelta_paramAccess().getQualifiedNameParserRuleCall_1_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getDelta_paramAccess().getHas_conditionParserRuleCall_1_1());
			}
			this_Has_condition_2=ruleHas_condition
			{
				$current = $this_Has_condition_2.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleHas_condition
entryRuleHas_condition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHas_conditionRule()); }
	iv_ruleHas_condition=ruleHas_condition
	{ $current=$iv_ruleHas_condition.current; }
	EOF;

// Rule Has_condition
ruleHas_condition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='hasField'
			{
				newLeafNode(otherlv_0, grammarAccess.getHas_conditionAccess().getHasFieldKeyword_0_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHas_conditionRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getHas_conditionAccess().getFieldField_declCrossReference_0_1_0());
					}
				)
			)
		)
		    |
		(
			otherlv_2='hasMethod'
			{
				newLeafNode(otherlv_2, grammarAccess.getHas_conditionAccess().getHasMethodKeyword_1_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHas_conditionRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getHas_conditionAccess().getMethodMethodsigCrossReference_1_1_0());
					}
				)
			)
		)
		    |
		(
			otherlv_4='hasInterface'
			{
				newLeafNode(otherlv_4, grammarAccess.getHas_conditionAccess().getHasInterfaceKeyword_2_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHas_conditionRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getHas_conditionAccess().getInterfaceInterface_declCrossReference_2_1_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDelta_access
entryRuleDelta_access returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelta_accessRule()); }
	iv_ruleDelta_access=ruleDelta_access
	{ $current=$iv_ruleDelta_access.current; }
	EOF;

// Rule Delta_access
ruleDelta_access returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='uses'
		{
			newLeafNode(otherlv_0, grammarAccess.getDelta_accessAccess().getUsesKeyword_0());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDelta_accessRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDelta_accessAccess().getModule_refModule_declCrossReference_1_0());
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getDelta_accessAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleModule_modifier
entryRuleModule_modifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModule_modifierRule()); }
	iv_ruleModule_modifier=ruleModule_modifier
	{ $current=$iv_ruleModule_modifier.current; }
	EOF;

// Rule Module_modifier
ruleModule_modifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getModule_modifierAccess().getFunctional_modifierParserRuleCall_0());
		}
		this_Functional_modifier_0=ruleFunctional_modifier
		{
			$current = $this_Functional_modifier_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getModule_modifierAccess().getOO_modifierParserRuleCall_1());
		}
		this_OO_modifier_1=ruleOO_modifier
		{
			$current = $this_OO_modifier_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getModule_modifierAccess().getNamespace_modifierParserRuleCall_2());
		}
		this_Namespace_modifier_2=ruleNamespace_modifier
		{
			$current = $this_Namespace_modifier_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFunctional_modifier
entryRuleFunctional_modifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctional_modifierRule()); }
	iv_ruleFunctional_modifier=ruleFunctional_modifier
	{ $current=$iv_ruleFunctional_modifier.current; }
	EOF;

// Rule Functional_modifier
ruleFunctional_modifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='adds'
			{
				newLeafNode(otherlv_0, grammarAccess.getFunctional_modifierAccess().getAddsKeyword_0_0());
			}
			(
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getFunctional_modifierAccess().getFunction_declParserRuleCall_0_1_0());
				}
				this_Function_decl_1=ruleFunction_decl
				{
					$current = $this_Function_decl_1.current;
					afterParserOrEnumRuleCall();
				}
				    |
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getFunctional_modifierAccess().getDataType_declParserRuleCall_0_1_1());
				}
				this_DataType_decl_2=ruleDataType_decl
				{
					$current = $this_DataType_decl_2.current;
					afterParserOrEnumRuleCall();
				}
				    |
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getFunctional_modifierAccess().getTypesyn_declParserRuleCall_0_1_2());
				}
				this_Typesyn_decl_3=ruleTypesyn_decl
				{
					$current = $this_Typesyn_decl_3.current;
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_4='modifies'
			{
				newLeafNode(otherlv_4, grammarAccess.getFunctional_modifierAccess().getModifiesKeyword_1_0());
			}
			(
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getFunctional_modifierAccess().getTypesyn_declParserRuleCall_1_1_0());
				}
				this_Typesyn_decl_5=ruleTypesyn_decl
				{
					$current = $this_Typesyn_decl_5.current;
					afterParserOrEnumRuleCall();
				}
				    |
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getFunctional_modifierAccess().getDataType_declParserRuleCall_1_1_1());
				}
				this_DataType_decl_6=ruleDataType_decl
				{
					$current = $this_DataType_decl_6.current;
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOO_modifier
entryRuleOO_modifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOO_modifierRule()); }
	iv_ruleOO_modifier=ruleOO_modifier
	{ $current=$iv_ruleOO_modifier.current; }
	EOF;

// Rule OO_modifier
ruleOO_modifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getOO_modifierAccess().getOO_modifierAction_0_0(),
						$current);
				}
			)
			otherlv_1='adds'
			{
				newLeafNode(otherlv_1, grammarAccess.getOO_modifierAccess().getAddsKeyword_0_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getOO_modifierAccess().getClass_declClass_declParserRuleCall_0_2_0_0());
						}
						lv_class_decl_2_0=ruleClass_decl
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOO_modifierRule());
							}
							set(
								$current,
								"class_decl",
								lv_class_decl_2_0,
								"org.xtext.Abs.Class_decl");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getOO_modifierAccess().getInterface_declInterface_declParserRuleCall_0_2_1_0());
						}
						lv_interface_decl_3_0=ruleInterface_decl
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOO_modifierRule());
							}
							set(
								$current,
								"interface_decl",
								lv_interface_decl_3_0,
								"org.xtext.Abs.Interface_decl");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_4='removes'
			{
				newLeafNode(otherlv_4, grammarAccess.getOO_modifierAccess().getRemovesKeyword_1_0());
			}
			(
				(
					otherlv_5='class'
					{
						newLeafNode(otherlv_5, grammarAccess.getOO_modifierAccess().getClassKeyword_1_1_0_0());
					}
					(
						(
							{
								/* */
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getOO_modifierRule());
								}
							}
							{
								newCompositeNode(grammarAccess.getOO_modifierAccess().getClassClass_declCrossReference_1_1_0_1_0());
							}
							ruleQualifiedName
							{
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				    |
				(
					otherlv_7='interface'
					{
						newLeafNode(otherlv_7, grammarAccess.getOO_modifierAccess().getInterfaceKeyword_1_1_1_0());
					}
					(
						(
							{
								/* */
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getOO_modifierRule());
								}
							}
							{
								newCompositeNode(grammarAccess.getOO_modifierAccess().getIntefaceInterface_declCrossReference_1_1_1_1_0());
							}
							ruleQualifiedName
							{
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getOO_modifierAccess().getSemicolonKeyword_1_2());
			}
		)
		    |
		(
			otherlv_10='modifies'
			{
				newLeafNode(otherlv_10, grammarAccess.getOO_modifierAccess().getModifiesKeyword_2_0());
			}
			(
				(
					otherlv_11='class'
					{
						newLeafNode(otherlv_11, grammarAccess.getOO_modifierAccess().getClassKeyword_2_1_0_0());
					}
					(
						(
							{
								/* */
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getOO_modifierRule());
								}
							}
							{
								newCompositeNode(grammarAccess.getOO_modifierAccess().getClassClass_declCrossReference_2_1_0_1_0());
							}
							ruleQualifiedName
							{
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_13='adds'
						{
							newLeafNode(otherlv_13, grammarAccess.getOO_modifierAccess().getAddsKeyword_2_1_0_2_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getOO_modifierAccess().getInterfaceNameInterface_declParserRuleCall_2_1_0_2_1_0());
								}
								lv_interfaceName_14_0=ruleInterface_decl
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getOO_modifierRule());
									}
									add(
										$current,
										"interfaceName",
										lv_interfaceName_14_0,
										"org.xtext.Abs.Interface_decl");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_15=','
							{
								newLeafNode(otherlv_15, grammarAccess.getOO_modifierAccess().getCommaKeyword_2_1_0_2_2_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getOO_modifierAccess().getInterfaceNameInterface_declParserRuleCall_2_1_0_2_2_1_0());
									}
									lv_interfaceName_16_0=ruleInterface_decl
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getOO_modifierRule());
										}
										add(
											$current,
											"interfaceName",
											lv_interfaceName_16_0,
											"org.xtext.Abs.Interface_decl");
										afterParserOrEnumRuleCall();
									}
								)
							)
						)*
					)?
					(
						otherlv_17='removes'
						{
							newLeafNode(otherlv_17, grammarAccess.getOO_modifierAccess().getRemovesKeyword_2_1_0_3_0());
						}
						(
							(
								{
									/* */
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getOO_modifierRule());
									}
								}
								{
									newCompositeNode(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declCrossReference_2_1_0_3_1_0());
								}
								ruleQualifiedName
								{
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_19=','
							{
								newLeafNode(otherlv_19, grammarAccess.getOO_modifierAccess().getCommaKeyword_2_1_0_3_2_0());
							}
							(
								(
									{
										/* */
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getOO_modifierRule());
										}
									}
									{
										newCompositeNode(grammarAccess.getOO_modifierAccess().getRemovedInterfaceInterface_declCrossReference_2_1_0_3_2_1_0());
									}
									ruleQualifiedName
									{
										afterParserOrEnumRuleCall();
									}
								)
							)
						)*
					)?
					otherlv_21='{'
					{
						newLeafNode(otherlv_21, grammarAccess.getOO_modifierAccess().getLeftCurlyBracketKeyword_2_1_0_4());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getOO_modifierAccess().getClass_modifier_fragmentClass_modifier_fragmentParserRuleCall_2_1_0_5_0());
							}
							lv_class_modifier_fragment_22_0=ruleClass_modifier_fragment
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getOO_modifierRule());
								}
								add(
									$current,
									"class_modifier_fragment",
									lv_class_modifier_fragment_22_0,
									"org.xtext.Abs.Class_modifier_fragment");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					otherlv_23='}'
					{
						newLeafNode(otherlv_23, grammarAccess.getOO_modifierAccess().getRightCurlyBracketKeyword_2_1_0_6());
					}
				)
				    |
				(
					otherlv_24='interface'
					{
						newLeafNode(otherlv_24, grammarAccess.getOO_modifierAccess().getInterfaceKeyword_2_1_1_0());
					}
					(
						(
							{
								/* */
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getOO_modifierRule());
								}
							}
							{
								newCompositeNode(grammarAccess.getOO_modifierAccess().getInterfaceInterface_declCrossReference_2_1_1_1_0());
							}
							ruleQualifiedName
							{
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_26='{'
					{
						newLeafNode(otherlv_26, grammarAccess.getOO_modifierAccess().getLeftCurlyBracketKeyword_2_1_1_2());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getOO_modifierAccess().getInterface_modifier_fragmentInterface_modifier_fragmentParserRuleCall_2_1_1_3_0());
							}
							lv_interface_modifier_fragment_27_0=ruleInterface_modifier_fragment
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getOO_modifierRule());
								}
								add(
									$current,
									"interface_modifier_fragment",
									lv_interface_modifier_fragment_27_0,
									"org.xtext.Abs.Interface_modifier_fragment");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					otherlv_28='}'
					{
						newLeafNode(otherlv_28, grammarAccess.getOO_modifierAccess().getRightCurlyBracketKeyword_2_1_1_4());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleClass_modifier_fragment
entryRuleClass_modifier_fragment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClass_modifier_fragmentRule()); }
	iv_ruleClass_modifier_fragment=ruleClass_modifier_fragment
	{ $current=$iv_ruleClass_modifier_fragment.current; }
	EOF;

// Rule Class_modifier_fragment
ruleClass_modifier_fragment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='adds'
			{
				newLeafNode(otherlv_0, grammarAccess.getClass_modifier_fragmentAccess().getAddsKeyword_0_0());
			}
			(
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getClass_modifier_fragmentAccess().getField_declParserRuleCall_0_1_0());
				}
				this_Field_decl_1=ruleField_decl
				{
					$current = $this_Field_decl_1.current;
					afterParserOrEnumRuleCall();
				}
				    |
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getClass_modifier_fragmentAccess().getTrait_exprParserRuleCall_0_1_1());
				}
				this_Trait_expr_2=ruleTrait_expr
				{
					$current = $this_Trait_expr_2.current;
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_3='removes'
			{
				newLeafNode(otherlv_3, grammarAccess.getClass_modifier_fragmentAccess().getRemovesKeyword_1_0());
			}
			(
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getClass_modifier_fragmentAccess().getField_declParserRuleCall_1_1_0());
				}
				this_Field_decl_4=ruleField_decl
				{
					$current = $this_Field_decl_4.current;
					afterParserOrEnumRuleCall();
				}
				    |
				{
					/* */
				}
				{
					newCompositeNode(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigParserRuleCall_1_1_1());
				}
				this_Methodsig_5=ruleMethodsig
				{
					$current = $this_Methodsig_5.current;
					afterParserOrEnumRuleCall();
				}
				    |
				(
					(
						{
							/* */
						}
						{
							$current = forceCreateModelElement(
								grammarAccess.getClass_modifier_fragmentAccess().getClass_modifier_fragmentAction_1_1_2_0(),
								$current);
						}
					)
					otherlv_7='{'
					{
						newLeafNode(otherlv_7, grammarAccess.getClass_modifier_fragmentAccess().getLeftCurlyBracketKeyword_1_1_2_1());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getClass_modifier_fragmentAccess().getMethodsigMethodsigParserRuleCall_1_1_2_2_0());
							}
							lv_methodsig_8_0=ruleMethodsig
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getClass_modifier_fragmentRule());
								}
								add(
									$current,
									"methodsig",
									lv_methodsig_8_0,
									"org.xtext.Abs.Methodsig");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					otherlv_9='}'
					{
						newLeafNode(otherlv_9, grammarAccess.getClass_modifier_fragmentAccess().getRightCurlyBracketKeyword_1_1_2_3());
					}
				)
			)
		)
		    |
		(
			otherlv_10='modifies'
			{
				newLeafNode(otherlv_10, grammarAccess.getClass_modifier_fragmentAccess().getModifiesKeyword_2_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getClass_modifier_fragmentAccess().getTrait_exprParserRuleCall_2_1());
			}
			this_Trait_expr_11=ruleTrait_expr
			{
				$current = $this_Trait_expr_11.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleInterface_modifier_fragment
entryRuleInterface_modifier_fragment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInterface_modifier_fragmentRule()); }
	iv_ruleInterface_modifier_fragment=ruleInterface_modifier_fragment
	{ $current=$iv_ruleInterface_modifier_fragment.current; }
	EOF;

// Rule Interface_modifier_fragment
ruleInterface_modifier_fragment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='adds'
			{
				newLeafNode(otherlv_0, grammarAccess.getInterface_modifier_fragmentAccess().getAddsKeyword_0_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getInterface_modifier_fragmentAccess().getMethodsigParserRuleCall_0_1());
			}
			this_Methodsig_1=ruleMethodsig
			{
				$current = $this_Methodsig_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			otherlv_2='removes'
			{
				newLeafNode(otherlv_2, grammarAccess.getInterface_modifier_fragmentAccess().getRemovesKeyword_1_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getInterface_modifier_fragmentAccess().getMethodsigParserRuleCall_1_1());
			}
			this_Methodsig_3=ruleMethodsig
			{
				$current = $this_Methodsig_3.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNamespace_modifier
entryRuleNamespace_modifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamespace_modifierRule()); }
	iv_ruleNamespace_modifier=ruleNamespace_modifier
	{ $current=$iv_ruleNamespace_modifier.current; }
	EOF;

// Rule Namespace_modifier
ruleNamespace_modifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='adds'
		{
			newLeafNode(otherlv_0, grammarAccess.getNamespace_modifierAccess().getAddsKeyword_0());
		}
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getNamespace_modifierAccess().getModule_importParserRuleCall_1_0());
			}
			this_Module_import_1=ruleModule_import
			{
				$current = $this_Module_import_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getNamespace_modifierAccess().getModule_exportParserRuleCall_1_1());
			}
			this_Module_export_2=ruleModule_export
			{
				$current = $this_Module_export_2.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleUpdate_decl
entryRuleUpdate_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdate_declRule()); }
	iv_ruleUpdate_decl=ruleUpdate_decl
	{ $current=$iv_ruleUpdate_decl.current; }
	EOF;

// Rule Update_decl
ruleUpdate_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='stateupdate'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpdate_declAccess().getStateupdateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getUpdate_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUpdate_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getUpdate_declAccess().getSemicolonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdate_declAccess().getObject_updateObject_updateParserRuleCall_3_0());
				}
				lv_object_update_3_0=ruleObject_update
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdate_declRule());
					}
					add(
						$current,
						"object_update",
						lv_object_update_3_0,
						"org.xtext.Abs.Object_update");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleObject_update
entryRuleObject_update returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObject_updateRule()); }
	iv_ruleObject_update=ruleObject_update
	{ $current=$iv_ruleObject_update.current; }
	EOF;

// Rule Object_update
ruleObject_update returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='objectupdate'
		{
			newLeafNode(otherlv_0, grammarAccess.getObject_updateAccess().getObjectupdateKeyword_0());
		}
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getObject_updateAccess().getQualifiedNameParserRuleCall_1());
		}
		ruleQualifiedName
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getObject_updateAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='await'
		{
			newLeafNode(otherlv_3, grammarAccess.getObject_updateAccess().getAwaitKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObject_updateRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getObject_updateAccess().getGuardGuardCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getObject_updateAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getObject_updateAccess().getUpdate_preamble_declarationUpdate_preamble_declarationParserRuleCall_6_0());
				}
				lv_update_preamble_declaration_6_0=ruleUpdate_preamble_declaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObject_updateRule());
					}
					add(
						$current,
						"update_preamble_declaration",
						lv_update_preamble_declaration_6_0,
						"org.xtext.Abs.Update_preamble_declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getObject_updateAccess().getPreObject_update_assign_stmtParserRuleCall_7_0());
				}
				lv_pre_7_0=ruleObject_update_assign_stmt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObject_updateRule());
					}
					add(
						$current,
						"pre",
						lv_pre_7_0,
						"org.xtext.Abs.Object_update_assign_stmt");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='classupdate'
		{
			newLeafNode(otherlv_8, grammarAccess.getObject_updateAccess().getClassupdateKeyword_8());
		}
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getObject_updateAccess().getSemicolonKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getObject_updateAccess().getPostObject_update_assign_stmtParserRuleCall_10_0());
				}
				lv_post_10_0=ruleObject_update_assign_stmt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObject_updateRule());
					}
					add(
						$current,
						"post",
						lv_post_10_0,
						"org.xtext.Abs.Object_update_assign_stmt");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getObject_updateAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleUpdate_preamble_declaration
entryRuleUpdate_preamble_declaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdate_preamble_declarationRule()); }
	iv_ruleUpdate_preamble_declaration=ruleUpdate_preamble_declaration
	{ $current=$iv_ruleUpdate_preamble_declaration.current; }
	EOF;

// Rule Update_preamble_declaration
ruleUpdate_preamble_declaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getUpdate_preamble_declarationAccess().getType_expParserRuleCall_0());
		}
		this_Type_exp_0=ruleType_exp
		{
			$current = $this_Type_exp_0.current;
			afterParserOrEnumRuleCall();
		}
		this_ID_1=RULE_ID
		{
			newLeafNode(this_ID_1, grammarAccess.getUpdate_preamble_declarationAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleObject_update_assign_stmt
entryRuleObject_update_assign_stmt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObject_update_assign_stmtRule()); }
	iv_ruleObject_update_assign_stmt=ruleObject_update_assign_stmt
	{ $current=$iv_ruleObject_update_assign_stmt.current; }
	EOF;

// Rule Object_update_assign_stmt
ruleObject_update_assign_stmt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObject_update_assign_stmtRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getObject_update_assign_stmtAccess().getVar_or_field_refVar_or_field_refCrossReference_0_0());
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getObject_update_assign_stmtAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getObject_update_assign_stmtAccess().getExpExpParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObject_update_assign_stmtRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"org.xtext.Abs.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getObject_update_assign_stmtAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleProductline_decl
entryRuleProductline_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductline_declRule()); }
	iv_ruleProductline_decl=ruleProductline_decl
	{ $current=$iv_ruleProductline_decl.current; }
	EOF;

// Rule Productline_decl
ruleProductline_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='productline'
		{
			newLeafNode(otherlv_0, grammarAccess.getProductline_declAccess().getProductlineKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProductline_declAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProductline_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getProductline_declAccess().getSemicolonKeyword_2());
		}
		otherlv_3='features'
		{
			newLeafNode(otherlv_3, grammarAccess.getProductline_declAccess().getFeaturesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductline_declAccess().getFeatureFeatureParserRuleCall_4_0());
				}
				lv_feature_4_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductline_declRule());
					}
					add(
						$current,
						"feature",
						lv_feature_4_0,
						"org.xtext.Abs.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getProductline_declAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProductline_declAccess().getFeatureFeatureParserRuleCall_5_1_0());
					}
					lv_feature_6_0=ruleFeature
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProductline_declRule());
						}
						add(
							$current,
							"feature",
							lv_feature_6_0,
							"org.xtext.Abs.Feature");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getProductline_declAccess().getSemicolonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductline_declAccess().getDelta_clauseDelta_clauseParserRuleCall_7_0());
				}
				lv_delta_clause_8_0=ruleDelta_clause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductline_declRule());
					}
					add(
						$current,
						"delta_clause",
						lv_delta_clause_8_0,
						"org.xtext.Abs.Delta_clause");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getFeature_declFeature_declCrossReference_0_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_p_1_0='\''
				{
					newLeafNode(lv_p_1_0, grammarAccess.getFeatureAccess().getPApostropheKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "p", lv_p_1_0, "\'");
				}
			)
		)?
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeatureAccess().getAttr_assignmentAttr_assignmentParserRuleCall_2_1_0());
					}
					lv_attr_assignment_3_0=ruleAttr_assignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeatureRule());
						}
						add(
							$current,
							"attr_assignment",
							lv_attr_assignment_3_0,
							"org.xtext.Abs.Attr_assignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFeatureAccess().getAttr_assignmentAttr_assignmentParserRuleCall_2_2_1_0());
						}
						lv_attr_assignment_5_0=ruleAttr_assignment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFeatureRule());
							}
							add(
								$current,
								"attr_assignment",
								lv_attr_assignment_5_0,
								"org.xtext.Abs.Attr_assignment");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6='}'
			{
				newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
	)
;

// Entry rule entryRuleAttr_assignment
entryRuleAttr_assignment returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAttr_assignmentRule()); }
	iv_ruleAttr_assignment=ruleAttr_assignment
	{ $current=$iv_ruleAttr_assignment.current.getText(); }
	EOF;

// Rule Attr_assignment
ruleAttr_assignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getAttr_assignmentAccess().getIDTerminalRuleCall_0());
		}
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAttr_assignmentAccess().getEqualsSignKeyword_1());
		}
		(
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getAttr_assignmentAccess().getINTTerminalRuleCall_2_0());
			}
			    |
			this_ID_3=RULE_ID
			{
				$current.merge(this_ID_3);
			}
			{
				newLeafNode(this_ID_3, grammarAccess.getAttr_assignmentAccess().getIDTerminalRuleCall_2_1());
			}
			    |
			this_STRINGLITERAL_4=RULE_STRINGLITERAL
			{
				$current.merge(this_STRINGLITERAL_4);
			}
			{
				newLeafNode(this_STRINGLITERAL_4, grammarAccess.getAttr_assignmentAccess().getSTRINGLITERALTerminalRuleCall_2_2());
			}
		)
	)
;

// Entry rule entryRuleDelta_clause
entryRuleDelta_clause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelta_clauseRule()); }
	iv_ruleDelta_clause=ruleDelta_clause
	{ $current=$iv_ruleDelta_clause.current; }
	EOF;

// Rule Delta_clause
ruleDelta_clause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='delta'
		{
			newLeafNode(otherlv_0, grammarAccess.getDelta_clauseAccess().getDeltaKeyword_0());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDelta_clauseRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDelta_clauseAccess().getDeltaspecDelta_declCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDelta_clauseAccess().getAfter_conditionAfter_conditionParserRuleCall_2_0());
				}
				lv_after_condition_2_0=ruleAfter_condition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDelta_clauseRule());
					}
					set(
						$current,
						"after_condition",
						lv_after_condition_2_0,
						"org.xtext.Abs.After_condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDelta_clauseAccess().getFrom_conditionFrom_conditionParserRuleCall_3_0());
				}
				lv_from_condition_3_0=ruleFrom_condition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDelta_clauseRule());
					}
					set(
						$current,
						"from_condition",
						lv_from_condition_3_0,
						"org.xtext.Abs.From_condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDelta_clauseAccess().getWhen_conditionWhen_conditionParserRuleCall_4_0());
				}
				lv_when_condition_4_0=ruleWhen_condition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDelta_clauseRule());
					}
					set(
						$current,
						"when_condition",
						lv_when_condition_4_0,
						"org.xtext.Abs.When_condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getDelta_clauseAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleDeltaspec_param
entryRuleDeltaspec_param returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDeltaspec_paramRule()); }
	iv_ruleDeltaspec_param=ruleDeltaspec_param
	{ $current=$iv_ruleDeltaspec_param.current.getText(); }
	EOF;

// Rule Deltaspec_param
ruleDeltaspec_param returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getDeltaspec_paramAccess().getIDTerminalRuleCall_0_0());
			}
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDeltaspec_paramAccess().getFullStopKeyword_0_1());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getDeltaspec_paramAccess().getIDTerminalRuleCall_0_2());
			}
		)
		    |
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getDeltaspec_paramAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleAfter_condition
entryRuleAfter_condition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAfter_conditionRule()); }
	iv_ruleAfter_condition=ruleAfter_condition
	{ $current=$iv_ruleAfter_condition.current; }
	EOF;

// Rule After_condition
ruleAfter_condition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='after'
		{
			newLeafNode(otherlv_0, grammarAccess.getAfter_conditionAccess().getAfterKeyword_0());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAfter_conditionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getAfter_conditionAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAfter_conditionRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getAfter_conditionAccess().getDelta_idDelta_declCrossReference_2_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleFrom_condition
entryRuleFrom_condition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFrom_conditionRule()); }
	iv_ruleFrom_condition=ruleFrom_condition
	{ $current=$iv_ruleFrom_condition.current; }
	EOF;

// Rule From_condition
ruleFrom_condition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='from'
		{
			newLeafNode(otherlv_0, grammarAccess.getFrom_conditionAccess().getFromKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFrom_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0());
				}
				lv_application_condition_1_0=ruleApplication_condition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFrom_conditionRule());
					}
					set(
						$current,
						"application_condition",
						lv_application_condition_1_0,
						"org.xtext.Abs.Application_condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWhen_condition
entryRuleWhen_condition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhen_conditionRule()); }
	iv_ruleWhen_condition=ruleWhen_condition
	{ $current=$iv_ruleWhen_condition.current; }
	EOF;

// Rule When_condition
ruleWhen_condition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='when'
			{
				newLeafNode(otherlv_0, grammarAccess.getWhen_conditionAccess().getWhenKeyword_0_0());
			}
			    |
			otherlv_1='to'
			{
				newLeafNode(otherlv_1, grammarAccess.getWhen_conditionAccess().getToKeyword_0_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getWhen_conditionAccess().getApplication_conditionApplication_conditionParserRuleCall_1_0());
				}
				lv_application_condition_2_0=ruleApplication_condition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhen_conditionRule());
					}
					set(
						$current,
						"application_condition",
						lv_application_condition_2_0,
						"org.xtext.Abs.Application_condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleApplication_condition
entryRuleApplication_condition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplication_conditionRule()); }
	iv_ruleApplication_condition=ruleApplication_condition
	{ $current=$iv_ruleApplication_condition.current; }
	EOF;

// Rule Application_condition
ruleApplication_condition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getApplication_conditionAccess().getAppOr_expParserRuleCall());
	}
	this_AppOr_exp_0=ruleAppOr_exp
	{
		$current = $this_AppOr_exp_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAppOr_exp
entryRuleAppOr_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppOr_expRule()); }
	iv_ruleAppOr_exp=ruleAppOr_exp
	{ $current=$iv_ruleAppOr_exp.current; }
	EOF;

// Rule AppOr_exp
ruleAppOr_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAppOr_expAccess().getAppAnd_expParserRuleCall_0());
		}
		this_AppAnd_exp_0=ruleAppAnd_exp
		{
			$current = $this_AppAnd_exp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAppOr_expAccess().getAppOr_expLeftAction_1_0(),
						$current);
				}
			)
			this_OROR_2=RULE_OROR
			{
				newLeafNode(this_OROR_2, grammarAccess.getAppOr_expAccess().getORORTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAppOr_expAccess().getRightAppAnd_expParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAppAnd_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAppOr_expRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.AppAnd_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAppAnd_exp
entryRuleAppAnd_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppAnd_expRule()); }
	iv_ruleAppAnd_exp=ruleAppAnd_exp
	{ $current=$iv_ruleAppAnd_exp.current; }
	EOF;

// Rule AppAnd_exp
ruleAppAnd_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAppAnd_expAccess().getAppUnary_expParserRuleCall_0());
		}
		this_AppUnary_exp_0=ruleAppUnary_exp
		{
			$current = $this_AppUnary_exp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAppAnd_expAccess().getAppAnd_expLeftAction_1_0(),
						$current);
				}
			)
			this_ANDAND_2=RULE_ANDAND
			{
				newLeafNode(this_ANDAND_2, grammarAccess.getAppAnd_expAccess().getANDANDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAppAnd_expAccess().getRightAppUnary_expParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAppUnary_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAppAnd_expRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.AppUnary_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAppUnary_exp
entryRuleAppUnary_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppUnary_expRule()); }
	iv_ruleAppUnary_exp=ruleAppUnary_exp
	{ $current=$iv_ruleAppUnary_exp.current; }
	EOF;

// Rule AppUnary_exp
ruleAppUnary_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAppUnary_expAccess().getAppPrimary_expParserRuleCall_0());
		}
		this_AppPrimary_exp_0=ruleAppPrimary_exp
		{
			$current = $this_AppPrimary_exp_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAppUnary_expAccess().getNotExpressionAction_1_0(),
						$current);
				}
			)
			(
				this_NEGATION_2=RULE_NEGATION
				{
					newLeafNode(this_NEGATION_2, grammarAccess.getAppUnary_expAccess().getNEGATIONTerminalRuleCall_1_1_0());
				}
				    |
				this_NEGATION_CREOL_3=RULE_NEGATION_CREOL
				{
					newLeafNode(this_NEGATION_CREOL_3, grammarAccess.getAppUnary_expAccess().getNEGATION_CREOLTerminalRuleCall_1_1_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAppUnary_expAccess().getOperandAppUnary_expParserRuleCall_1_2_0());
					}
					lv_operand_4_0=ruleAppUnary_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAppUnary_expRule());
						}
						set(
							$current,
							"operand",
							lv_operand_4_0,
							"org.xtext.Abs.AppUnary_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleAppPrimary_exp
entryRuleAppPrimary_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppPrimary_expRule()); }
	iv_ruleAppPrimary_exp=ruleAppPrimary_exp
	{ $current=$iv_ruleAppPrimary_exp.current; }
	EOF;

// Rule AppPrimary_exp
ruleAppPrimary_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getAppPrimary_expAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getAppPrimary_expAccess().getAppOr_expParserRuleCall_0_1());
			}
			this_AppOr_exp_1=ruleAppOr_exp
			{
				$current = $this_AppOr_exp_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getAppPrimary_expAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAppPrimary_expAccess().getAppCond_atomic_exprParserRuleCall_1());
		}
		this_AppCond_atomic_expr_3=ruleAppCond_atomic_expr
		{
			$current = $this_AppCond_atomic_expr_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAppCond_atomic_expr
entryRuleAppCond_atomic_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppCond_atomic_exprRule()); }
	iv_ruleAppCond_atomic_expr=ruleAppCond_atomic_expr
	{ $current=$iv_ruleAppCond_atomic_expr.current; }
	EOF;

// Rule AppCond_atomic_expr
ruleAppCond_atomic_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAppCond_atomic_exprAccess().getFeatureFeatureParserRuleCall_0());
			}
			lv_feature_0_0=ruleFeature
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAppCond_atomic_exprRule());
				}
				set(
					$current,
					"feature",
					lv_feature_0_0,
					"org.xtext.Abs.Feature");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleProduct_decl
entryRuleProduct_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProduct_declRule()); }
	iv_ruleProduct_decl=ruleProduct_decl
	{ $current=$iv_ruleProduct_decl.current; }
	EOF;

// Rule Product_decl
ruleProduct_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getProduct_declAccess().getProduct_declAction_0(),
					$current);
			}
		)
		otherlv_1='product'
		{
			newLeafNode(otherlv_1, grammarAccess.getProduct_declAccess().getProductKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getProduct_declAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProduct_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			(
				otherlv_3='('
				{
					newLeafNode(otherlv_3, grammarAccess.getProduct_declAccess().getLeftParenthesisKeyword_3_0_0());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getProduct_declAccess().getFeatureFeatureParserRuleCall_3_0_1_0_0());
							}
							lv_feature_4_0=ruleFeature
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getProduct_declRule());
								}
								add(
									$current,
									"feature",
									lv_feature_4_0,
									"org.xtext.Abs.Feature");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_5=','
						{
							newLeafNode(otherlv_5, grammarAccess.getProduct_declAccess().getCommaKeyword_3_0_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getProduct_declAccess().getFeatureFeatureParserRuleCall_3_0_1_1_1_0());
								}
								lv_feature_6_0=ruleFeature
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getProduct_declRule());
									}
									add(
										$current,
										"feature",
										lv_feature_6_0,
										"org.xtext.Abs.Feature");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_7=')'
				{
					newLeafNode(otherlv_7, grammarAccess.getProduct_declAccess().getRightParenthesisKeyword_3_0_2());
				}
				(
					(
						otherlv_8='{'
						{
							newLeafNode(otherlv_8, grammarAccess.getProduct_declAccess().getLeftCurlyBracketKeyword_3_0_3_0_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getProduct_declAccess().getProduct_reconfigurationProduct_reconfigurationParserRuleCall_3_0_3_0_1_0());
								}
								lv_product_reconfiguration_9_0=ruleProduct_reconfiguration
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getProduct_declRule());
									}
									add(
										$current,
										"product_reconfiguration",
										lv_product_reconfiguration_9_0,
										"org.xtext.Abs.Product_reconfiguration");
									afterParserOrEnumRuleCall();
								}
							)
						)*
						otherlv_10='}'
						{
							newLeafNode(otherlv_10, grammarAccess.getProduct_declAccess().getRightCurlyBracketKeyword_3_0_3_0_2());
						}
					)
					    |
					otherlv_11=';'
					{
						newLeafNode(otherlv_11, grammarAccess.getProduct_declAccess().getSemicolonKeyword_3_0_3_1());
					}
				)
			)
			    |
			(
				otherlv_12='='
				{
					newLeafNode(otherlv_12, grammarAccess.getProduct_declAccess().getEqualsSignKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProduct_declAccess().getProduct_exprProduct_exprParserRuleCall_3_1_1_0());
						}
						lv_product_expr_13_0=ruleProduct_expr
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProduct_declRule());
							}
							set(
								$current,
								"product_expr",
								lv_product_expr_13_0,
								"org.xtext.Abs.Product_expr");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_14=';'
				{
					newLeafNode(otherlv_14, grammarAccess.getProduct_declAccess().getSemicolonKeyword_3_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleProduct_expr
entryRuleProduct_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProduct_exprRule()); }
	iv_ruleProduct_expr=ruleProduct_expr
	{ $current=$iv_ruleProduct_expr.current; }
	EOF;

// Rule Product_expr
ruleProduct_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getProduct_exprAccess().getProductOr_exprParserRuleCall());
	}
	this_ProductOr_expr_0=ruleProductOr_expr
	{
		$current = $this_ProductOr_expr_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleProductOr_expr
entryRuleProductOr_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductOr_exprRule()); }
	iv_ruleProductOr_expr=ruleProductOr_expr
	{ $current=$iv_ruleProductOr_expr.current; }
	EOF;

// Rule ProductOr_expr
ruleProductOr_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getProductOr_exprAccess().getProductAnd_expParserRuleCall_0());
		}
		this_ProductAnd_exp_0=ruleProductAnd_exp
		{
			$current = $this_ProductAnd_exp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getProductOr_exprAccess().getProductOr_exprLeftAction_1_0(),
						$current);
				}
			)
			this_OROR_2=RULE_OROR
			{
				newLeafNode(this_OROR_2, grammarAccess.getProductOr_exprAccess().getORORTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProductOr_exprAccess().getRightProductAnd_expParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleProductAnd_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProductOr_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.ProductAnd_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleProductAnd_exp
entryRuleProductAnd_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductAnd_expRule()); }
	iv_ruleProductAnd_exp=ruleProductAnd_exp
	{ $current=$iv_ruleProductAnd_exp.current; }
	EOF;

// Rule ProductAnd_exp
ruleProductAnd_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getProductAnd_expAccess().getProductPrimary_expParserRuleCall_0());
		}
		this_ProductPrimary_exp_0=ruleProductPrimary_exp
		{
			$current = $this_ProductPrimary_exp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getProductAnd_expAccess().getProductAnd_expLeftAction_1_0(),
						$current);
				}
			)
			this_ANDAND_2=RULE_ANDAND
			{
				newLeafNode(this_ANDAND_2, grammarAccess.getProductAnd_expAccess().getANDANDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProductAnd_expAccess().getRightProductMinus_expParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleProductMinus_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProductAnd_expRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.ProductMinus_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleProductMinus_exp
entryRuleProductMinus_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductMinus_expRule()); }
	iv_ruleProductMinus_exp=ruleProductMinus_exp
	{ $current=$iv_ruleProductMinus_exp.current; }
	EOF;

// Rule ProductMinus_exp
ruleProductMinus_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getProductMinus_expAccess().getProductPrimary_expParserRuleCall_0());
		}
		this_ProductPrimary_exp_0=ruleProductPrimary_exp
		{
			$current = $this_ProductPrimary_exp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getProductMinus_expAccess().getProductMinus_expLeftAction_1_0(),
						$current);
				}
			)
			this_MINUS_2=RULE_MINUS
			{
				newLeafNode(this_MINUS_2, grammarAccess.getProductMinus_expAccess().getMINUSTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProductMinus_expAccess().getRightProductPrimary_expParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleProductPrimary_exp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProductMinus_expRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.ProductPrimary_exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleProductPrimary_exp
entryRuleProductPrimary_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductPrimary_expRule()); }
	iv_ruleProductPrimary_exp=ruleProductPrimary_exp
	{ $current=$iv_ruleProductPrimary_exp.current; }
	EOF;

// Rule ProductPrimary_exp
ruleProductPrimary_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getProductPrimary_expAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getProductPrimary_expAccess().getProductOr_exprParserRuleCall_0_1());
			}
			this_ProductOr_expr_1=ruleProductOr_expr
			{
				$current = $this_ProductOr_expr_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getProductPrimary_expAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getProductPrimary_expAccess().getAtomicProduct_exprParserRuleCall_1());
		}
		this_AtomicProduct_expr_3=ruleAtomicProduct_expr
		{
			$current = $this_AtomicProduct_expr_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtomicProduct_expr
entryRuleAtomicProduct_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicProduct_exprRule()); }
	iv_ruleAtomicProduct_expr=ruleAtomicProduct_expr
	{ $current=$iv_ruleAtomicProduct_expr.current; }
	EOF;

// Rule AtomicProduct_expr
ruleAtomicProduct_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='{'
			{
				newLeafNode(otherlv_0, grammarAccess.getAtomicProduct_exprAccess().getLeftCurlyBracketKeyword_0_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicProduct_exprRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declCrossReference_0_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getAtomicProduct_exprAccess().getCommaKeyword_0_2_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtomicProduct_exprRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getAtomicProduct_exprAccess().getFeatureFeature_declCrossReference_0_2_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getAtomicProduct_exprAccess().getRightCurlyBracketKeyword_0_3());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtomicProduct_exprRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAtomicProduct_exprAccess().getProductDeclProduct_declCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProduct_reconfiguration
entryRuleProduct_reconfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProduct_reconfigurationRule()); }
	iv_ruleProduct_reconfiguration=ruleProduct_reconfiguration
	{ $current=$iv_ruleProduct_reconfiguration.current; }
	EOF;

// Rule Product_reconfiguration
ruleProduct_reconfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getProduct_reconfigurationAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProduct_reconfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_1='delta'
		{
			newLeafNode(otherlv_1, grammarAccess.getProduct_reconfigurationAccess().getDeltaKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProduct_reconfigurationAccess().getDelta_idDelta_idParserRuleCall_2_0());
				}
				lv_delta_id_2_0=ruleDelta_id
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProduct_reconfigurationRule());
					}
					add(
						$current,
						"delta_id",
						lv_delta_id_2_0,
						"org.xtext.Abs.Delta_id");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getProduct_reconfigurationAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProduct_reconfigurationAccess().getDelta_idDelta_idParserRuleCall_3_1_0());
					}
					lv_delta_id_4_0=ruleDelta_id
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProduct_reconfigurationRule());
						}
						add(
							$current,
							"delta_id",
							lv_delta_id_4_0,
							"org.xtext.Abs.Delta_id");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='stateupdate'
		{
			newLeafNode(otherlv_5, grammarAccess.getProduct_reconfigurationAccess().getStateupdateKeyword_4());
		}
		(
			(
				lv_update_6_0=RULE_ID
				{
					newLeafNode(lv_update_6_0, grammarAccess.getProduct_reconfigurationAccess().getUpdateIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProduct_reconfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"update",
						lv_update_6_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getProduct_reconfigurationAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleFeature_decl
entryRuleFeature_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeature_declRule()); }
	iv_ruleFeature_decl=ruleFeature_decl
	{ $current=$iv_ruleFeature_decl.current; }
	EOF;

// Rule Feature_decl
ruleFeature_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFeature_declAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeature_declRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		(
			otherlv_1='{'
			{
				newLeafNode(otherlv_1, grammarAccess.getFeature_declAccess().getLeftCurlyBracketKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_declAccess().getFeature_decl_groupFeature_decl_groupParserRuleCall_1_1_0());
					}
					lv_feature_decl_group_2_0=ruleFeature_decl_group
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_declRule());
						}
						set(
							$current,
							"feature_decl_group",
							lv_feature_decl_group_2_0,
							"org.xtext.Abs.Feature_decl_group");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFeature_declAccess().getFeature_decl_attributeFeature_decl_attributeParserRuleCall_1_2_0_0());
						}
						lv_feature_decl_attribute_3_0=ruleFeature_decl_attribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFeature_declRule());
							}
							add(
								$current,
								"feature_decl_attribute",
								lv_feature_decl_attribute_3_0,
								"org.xtext.Abs.Feature_decl_attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getFeature_declAccess().getFeature_decl_constraintFeature_decl_constraintParserRuleCall_1_2_1_0());
						}
						lv_feature_decl_constraint_4_0=ruleFeature_decl_constraint
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFeature_declRule());
							}
							add(
								$current,
								"feature_decl_constraint",
								lv_feature_decl_constraint_4_0,
								"org.xtext.Abs.Feature_decl_constraint");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_5='}'
			{
				newLeafNode(otherlv_5, grammarAccess.getFeature_declAccess().getRightCurlyBracketKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleFeature_decl_group
entryRuleFeature_decl_group returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeature_decl_groupRule()); }
	iv_ruleFeature_decl_group=ruleFeature_decl_group
	{ $current=$iv_ruleFeature_decl_group.current; }
	EOF;

// Rule Feature_decl_group
ruleFeature_decl_group returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='group'
		{
			newLeafNode(otherlv_0, grammarAccess.getFeature_decl_groupAccess().getGroupKeyword_0());
		}
		(
			otherlv_1='oneof'
			{
				newLeafNode(otherlv_1, grammarAccess.getFeature_decl_groupAccess().getOneofKeyword_1_0());
			}
			    |
			otherlv_2='allof'
			{
				newLeafNode(otherlv_2, grammarAccess.getFeature_decl_groupAccess().getAllofKeyword_1_1());
			}
			    |
			(
				otherlv_3='['
				{
					newLeafNode(otherlv_3, grammarAccess.getFeature_decl_groupAccess().getLeftSquareBracketKeyword_1_2_0());
				}
				this_INT_4=RULE_INT
				{
					newLeafNode(this_INT_4, grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_1());
				}
				otherlv_5='..'
				{
					newLeafNode(otherlv_5, grammarAccess.getFeature_decl_groupAccess().getFullStopFullStopKeyword_1_2_2());
				}
				(
					this_INT_6=RULE_INT
					{
						newLeafNode(this_INT_6, grammarAccess.getFeature_decl_groupAccess().getINTTerminalRuleCall_1_2_3_0());
					}
					    |
					this_MULT_7=RULE_MULT
					{
						newLeafNode(this_MULT_7, grammarAccess.getFeature_decl_groupAccess().getMULTTerminalRuleCall_1_2_3_1());
					}
				)
				otherlv_8=']'
				{
					newLeafNode(otherlv_8, grammarAccess.getFeature_decl_groupAccess().getRightSquareBracketKeyword_1_2_4());
				}
			)
		)
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getFeature_decl_groupAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeature_decl_groupAccess().getFnodeFnodeParserRuleCall_3_0());
				}
				lv_fnode_10_0=ruleFnode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeature_decl_groupRule());
					}
					add(
						$current,
						"fnode",
						lv_fnode_10_0,
						"org.xtext.Abs.Fnode");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getFeature_decl_groupAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_groupAccess().getFnodeFnodeParserRuleCall_4_1_0());
					}
					lv_fnode_12_0=ruleFnode
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_groupRule());
						}
						add(
							$current,
							"fnode",
							lv_fnode_12_0,
							"org.xtext.Abs.Fnode");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getFeature_decl_groupAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFnode
entryRuleFnode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFnodeRule()); }
	iv_ruleFnode=ruleFnode
	{ $current=$iv_ruleFnode.current; }
	EOF;

// Rule Fnode
ruleFnode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='opt'
			{
				newLeafNode(otherlv_0, grammarAccess.getFnodeAccess().getOptKeyword_0());
			}
		)?
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFnodeAccess().getFeature_declParserRuleCall_1());
		}
		this_Feature_decl_1=ruleFeature_decl
		{
			$current = $this_Feature_decl_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFeature_decl_attribute
entryRuleFeature_decl_attribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeature_decl_attributeRule()); }
	iv_ruleFeature_decl_attribute=ruleFeature_decl_attribute
	{ $current=$iv_ruleFeature_decl_attribute.current; }
	EOF;

// Rule Feature_decl_attribute
ruleFeature_decl_attribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				newLeafNode(this_ID_0, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_0_0());
			}
			this_ID_1=RULE_ID
			{
				newLeafNode(this_ID_1, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_0_1());
			}
			otherlv_2='in'
			{
				newLeafNode(otherlv_2, grammarAccess.getFeature_decl_attributeAccess().getInKeyword_0_2());
			}
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getFeature_decl_attributeAccess().getLeftCurlyBracketKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valBoundary_valParserRuleCall_0_4_0());
					}
					lv_boundary_val_4_0=ruleBoundary_val
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_attributeRule());
						}
						add(
							$current,
							"boundary_val",
							lv_boundary_val_4_0,
							"org.xtext.Abs.Boundary_val");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getFeature_decl_attributeAccess().getCommaKeyword_0_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFeature_decl_attributeAccess().getBoundary_valBoundary_valParserRuleCall_0_5_1_0());
						}
						lv_boundary_val_6_0=ruleBoundary_val
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFeature_decl_attributeRule());
							}
							add(
								$current,
								"boundary_val",
								lv_boundary_val_6_0,
								"org.xtext.Abs.Boundary_val");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getFeature_decl_attributeAccess().getRightCurlyBracketKeyword_0_6());
			}
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_0_7());
			}
		)
		    |
		(
			this_ID_9=RULE_ID
			{
				newLeafNode(this_ID_9, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_1_0());
			}
			this_ID_10=RULE_ID
			{
				newLeafNode(this_ID_10, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_1_1());
			}
			otherlv_11='in'
			{
				newLeafNode(otherlv_11, grammarAccess.getFeature_decl_attributeAccess().getInKeyword_1_2());
			}
			otherlv_12='['
			{
				newLeafNode(otherlv_12, grammarAccess.getFeature_decl_attributeAccess().getLeftSquareBracketKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intBoundary_intParserRuleCall_1_4_0());
					}
					lv_lBoundary_int_13_0=ruleBoundary_int
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_attributeRule());
						}
						set(
							$current,
							"lBoundary_int",
							lv_lBoundary_int_13_0,
							"org.xtext.Abs.Boundary_int");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_14='..'
			{
				newLeafNode(otherlv_14, grammarAccess.getFeature_decl_attributeAccess().getFullStopFullStopKeyword_1_5());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intBoundary_intParserRuleCall_1_6_0());
					}
					lv_uBoundary_int_15_0=ruleBoundary_int
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_attributeRule());
						}
						set(
							$current,
							"uBoundary_int",
							lv_uBoundary_int_15_0,
							"org.xtext.Abs.Boundary_int");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_16=']'
			{
				newLeafNode(otherlv_16, grammarAccess.getFeature_decl_attributeAccess().getRightSquareBracketKeyword_1_7());
			}
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_1_8());
			}
		)
		    |
		(
			this_ID_18=RULE_ID
			{
				newLeafNode(this_ID_18, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_2_0());
			}
			otherlv_19='['
			{
				newLeafNode(otherlv_19, grammarAccess.getFeature_decl_attributeAccess().getLeftSquareBracketKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_attributeAccess().getLBoundary_intBoundary_intParserRuleCall_2_2_0());
					}
					lv_lBoundary_int_20_0=ruleBoundary_int
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_attributeRule());
						}
						set(
							$current,
							"lBoundary_int",
							lv_lBoundary_int_20_0,
							"org.xtext.Abs.Boundary_int");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21='..'
			{
				newLeafNode(otherlv_21, grammarAccess.getFeature_decl_attributeAccess().getFullStopFullStopKeyword_2_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_attributeAccess().getUBoundary_intBoundary_intParserRuleCall_2_4_0());
					}
					lv_uBoundary_int_22_0=ruleBoundary_int
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_attributeRule());
						}
						set(
							$current,
							"uBoundary_int",
							lv_uBoundary_int_22_0,
							"org.xtext.Abs.Boundary_int");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_23=']'
			{
				newLeafNode(otherlv_23, grammarAccess.getFeature_decl_attributeAccess().getRightSquareBracketKeyword_2_5());
			}
			this_ID_24=RULE_ID
			{
				newLeafNode(this_ID_24, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_2_6());
			}
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_2_7());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getFeature_decl_attributeAccess().getFeature_decl_attributeAction_3_0(),
						$current);
				}
			)
			this_ID_27=RULE_ID
			{
				newLeafNode(this_ID_27, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_3_1());
			}
			this_ID_28=RULE_ID
			{
				newLeafNode(this_ID_28, grammarAccess.getFeature_decl_attributeAccess().getIDTerminalRuleCall_3_2());
			}
			otherlv_29=';'
			{
				newLeafNode(otherlv_29, grammarAccess.getFeature_decl_attributeAccess().getSemicolonKeyword_3_3());
			}
		)
	)
;

// Entry rule entryRuleBoundary_val
entryRuleBoundary_val returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBoundary_valRule()); }
	iv_ruleBoundary_val=ruleBoundary_val
	{ $current=$iv_ruleBoundary_val.current.getText(); }
	EOF;

// Rule Boundary_val
ruleBoundary_val returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_MINUS_0=RULE_MINUS
			{
				$current.merge(this_MINUS_0);
			}
			{
				newLeafNode(this_MINUS_0, grammarAccess.getBoundary_valAccess().getMINUSTerminalRuleCall_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getBoundary_valAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleBoundary_int
entryRuleBoundary_int returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBoundary_intRule()); }
	iv_ruleBoundary_int=ruleBoundary_int
	{ $current=$iv_ruleBoundary_int.current.getText(); }
	EOF;

// Rule Boundary_int
ruleBoundary_int returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_MULT_0=RULE_MULT
		{
			$current.merge(this_MULT_0);
		}
		{
			newLeafNode(this_MULT_0, grammarAccess.getBoundary_intAccess().getMULTTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getBoundary_intAccess().getBoundary_valParserRuleCall_1());
		}
		this_Boundary_val_1=ruleBoundary_val
		{
			$current.merge(this_Boundary_val_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFeature_decl_constraint
entryRuleFeature_decl_constraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeature_decl_constraintRule()); }
	iv_ruleFeature_decl_constraint=ruleFeature_decl_constraint
	{ $current=$iv_ruleFeature_decl_constraint.current; }
	EOF;

// Rule Feature_decl_constraint
ruleFeature_decl_constraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				otherlv_0='ifin'
				{
					newLeafNode(otherlv_0, grammarAccess.getFeature_decl_constraintAccess().getIfinKeyword_0_0_0());
				}
				otherlv_1=':'
				{
					newLeafNode(otherlv_1, grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_0_0_1());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_constraintAccess().getMexpMexpParserRuleCall_0_1_0());
					}
					lv_mexp_2_0=ruleMexp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_constraintRule());
						}
						set(
							$current,
							"mexp",
							lv_mexp_2_0,
							"org.xtext.Abs.Mexp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_0_2());
			}
		)
		    |
		(
			otherlv_4='ifout'
			{
				newLeafNode(otherlv_4, grammarAccess.getFeature_decl_constraintAccess().getIfoutKeyword_1_0());
			}
			otherlv_5=':'
			{
				newLeafNode(otherlv_5, grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFeature_decl_constraintAccess().getMexpMexpParserRuleCall_1_2_0());
					}
					lv_mexp_6_0=ruleMexp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeature_decl_constraintRule());
						}
						set(
							$current,
							"mexp",
							lv_mexp_6_0,
							"org.xtext.Abs.Mexp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=';'
			{
				newLeafNode(otherlv_7, grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_1_3());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getFeature_decl_constraintAccess().getFeature_decl_constraintAction_2_0(),
						$current);
				}
			)
			otherlv_9='exclude'
			{
				newLeafNode(otherlv_9, grammarAccess.getFeature_decl_constraintAccess().getExcludeKeyword_2_1());
			}
			otherlv_10=':'
			{
				newLeafNode(otherlv_10, grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_2_2());
			}
			this_ID_11=RULE_ID
			{
				newLeafNode(this_ID_11, grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_2_3());
			}
			otherlv_12=';'
			{
				newLeafNode(otherlv_12, grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_2_4());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getFeature_decl_constraintAccess().getFeature_decl_constraintAction_3_0(),
						$current);
				}
			)
			otherlv_14='require'
			{
				newLeafNode(otherlv_14, grammarAccess.getFeature_decl_constraintAccess().getRequireKeyword_3_1());
			}
			otherlv_15=':'
			{
				newLeafNode(otherlv_15, grammarAccess.getFeature_decl_constraintAccess().getColonKeyword_3_2());
			}
			this_ID_16=RULE_ID
			{
				newLeafNode(this_ID_16, grammarAccess.getFeature_decl_constraintAccess().getIDTerminalRuleCall_3_3());
			}
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getFeature_decl_constraintAccess().getSemicolonKeyword_3_4());
			}
		)
	)
;

// Entry rule entryRuleMexp
entryRuleMexp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpRule()); }
	iv_ruleMexp=ruleMexp
	{ $current=$iv_ruleMexp.current; }
	EOF;

// Rule Mexp
ruleMexp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getMexpAccess().getMexpAction_0_0(),
						$current);
				}
			)
			this_ID_1=RULE_ID
			{
				newLeafNode(this_ID_1, grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_1());
			}
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getMexpAccess().getFullStopKeyword_0_2());
			}
			this_ID_3=RULE_ID
			{
				newLeafNode(this_ID_3, grammarAccess.getMexpAccess().getIDTerminalRuleCall_0_3());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getMexpAccess().getMexpAction_1_0(),
						$current);
				}
			)
			this_ID_5=RULE_ID
			{
				newLeafNode(this_ID_5, grammarAccess.getMexpAccess().getIDTerminalRuleCall_1_1());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getMexpAccess().getMexpAction_2_0(),
						$current);
				}
			)
			this_ID_7=RULE_ID
			{
				newLeafNode(this_ID_7, grammarAccess.getMexpAccess().getIDTerminalRuleCall_2_1());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpAccess().getMexpOr_expParserRuleCall_3());
		}
		this_MexpOr_exp_8=ruleMexpOr_exp
		{
			$current = $this_MexpOr_exp_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMexpOr_exp
entryRuleMexpOr_exp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpOr_expRule()); }
	iv_ruleMexpOr_exp=ruleMexpOr_exp
	{ $current=$iv_ruleMexpOr_exp.current; }
	EOF;

// Rule MexpOr_exp
ruleMexpOr_exp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpOr_expAccess().getMexpAnd_exprParserRuleCall_0());
		}
		this_MexpAnd_expr_0=ruleMexpAnd_expr
		{
			$current = $this_MexpAnd_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMexpOr_expAccess().getMexpOr_expLeftAction_1_0(),
						$current);
				}
			)
			this_OROR_2=RULE_OROR
			{
				newLeafNode(this_OROR_2, grammarAccess.getMexpOr_expAccess().getORORTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpOr_expAccess().getRightMexpAnd_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMexpAnd_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpOr_expRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MexpAnd_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMexpAnd_expr
entryRuleMexpAnd_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpAnd_exprRule()); }
	iv_ruleMexpAnd_expr=ruleMexpAnd_expr
	{ $current=$iv_ruleMexpAnd_expr.current; }
	EOF;

// Rule MexpAnd_expr
ruleMexpAnd_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpAnd_exprAccess().getMexpImplies_exprParserRuleCall_0());
		}
		this_MexpImplies_expr_0=ruleMexpImplies_expr
		{
			$current = $this_MexpImplies_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMexpAnd_exprAccess().getMexpAnd_exprLeftAction_1_0(),
						$current);
				}
			)
			this_ANDAND_2=RULE_ANDAND
			{
				newLeafNode(this_ANDAND_2, grammarAccess.getMexpAnd_exprAccess().getANDANDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpAnd_exprAccess().getRightMexpImplies_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMexpImplies_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpAnd_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MexpImplies_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMexpImplies_expr
entryRuleMexpImplies_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpImplies_exprRule()); }
	iv_ruleMexpImplies_expr=ruleMexpImplies_expr
	{ $current=$iv_ruleMexpImplies_expr.current; }
	EOF;

// Rule MexpImplies_expr
ruleMexpImplies_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpImplies_exprAccess().getMexpEquality_exprParserRuleCall_0());
		}
		this_MexpEquality_expr_0=ruleMexpEquality_expr
		{
			$current = $this_MexpEquality_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMexpImplies_exprAccess().getMexpImplies_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_IMPLIES
						{
							newLeafNode(lv_op_2_1, grammarAccess.getMexpImplies_exprAccess().getOpIMPLIESTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpImplies_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.IMPLIES");
						}
						    |
						lv_op_2_2=RULE_EQUIV
						{
							newLeafNode(lv_op_2_2, grammarAccess.getMexpImplies_exprAccess().getOpEQUIVTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpImplies_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_2,
								"org.xtext.Abs.EQUIV");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpImplies_exprAccess().getRightMexpEquality_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMexpEquality_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpImplies_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MexpEquality_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMexpEquality_expr
entryRuleMexpEquality_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpEquality_exprRule()); }
	iv_ruleMexpEquality_expr=ruleMexpEquality_expr
	{ $current=$iv_ruleMexpEquality_expr.current; }
	EOF;

// Rule MexpEquality_expr
ruleMexpEquality_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpEquality_exprAccess().getMexpComparison_exprParserRuleCall_0());
		}
		this_MexpComparison_expr_0=ruleMexpComparison_expr
		{
			$current = $this_MexpComparison_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMexpEquality_exprAccess().getMexpEquality_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_EQEQ
						{
							newLeafNode(lv_op_2_1, grammarAccess.getMexpEquality_exprAccess().getOpEQEQTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpEquality_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.EQEQ");
						}
						    |
						lv_op_2_2=RULE_NOTEQ
						{
							newLeafNode(lv_op_2_2, grammarAccess.getMexpEquality_exprAccess().getOpNOTEQTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpEquality_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_2,
								"org.xtext.Abs.NOTEQ");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpEquality_exprAccess().getRightMexpComparison_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMexpComparison_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpEquality_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MexpComparison_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMexpComparison_expr
entryRuleMexpComparison_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpComparison_exprRule()); }
	iv_ruleMexpComparison_expr=ruleMexpComparison_expr
	{ $current=$iv_ruleMexpComparison_expr.current; }
	EOF;

// Rule MexpComparison_expr
ruleMexpComparison_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpComparison_exprAccess().getMexpPlusOrMinus_exprParserRuleCall_0());
		}
		this_MexpPlusOrMinus_expr_0=ruleMexpPlusOrMinus_expr
		{
			$current = $this_MexpPlusOrMinus_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMexpComparison_exprAccess().getMexpComparison_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_LT
						{
							newLeafNode(lv_op_2_1, grammarAccess.getMexpComparison_exprAccess().getOpLTTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.LT");
						}
						    |
						lv_op_2_2=RULE_GT
						{
							newLeafNode(lv_op_2_2, grammarAccess.getMexpComparison_exprAccess().getOpGTTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_2,
								"org.xtext.Abs.GT");
						}
						    |
						lv_op_2_3=RULE_LTEQ
						{
							newLeafNode(lv_op_2_3, grammarAccess.getMexpComparison_exprAccess().getOpLTEQTerminalRuleCall_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_3,
								"org.xtext.Abs.LTEQ");
						}
						    |
						lv_op_2_4=RULE_GTEQ
						{
							newLeafNode(lv_op_2_4, grammarAccess.getMexpComparison_exprAccess().getOpGTEQTerminalRuleCall_1_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpComparison_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_4,
								"org.xtext.Abs.GTEQ");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpComparison_exprAccess().getRightMexpPlusOrMinus_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMexpPlusOrMinus_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpComparison_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MexpPlusOrMinus_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMexpPlusOrMinus_expr
entryRuleMexpPlusOrMinus_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpPlusOrMinus_exprRule()); }
	iv_ruleMexpPlusOrMinus_expr=ruleMexpPlusOrMinus_expr
	{ $current=$iv_ruleMexpPlusOrMinus_expr.current; }
	EOF;

// Rule MexpPlusOrMinus_expr
ruleMexpPlusOrMinus_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpPlusOrMinus_exprAccess().getMexpMulDivOrMod_exprParserRuleCall_0());
		}
		this_MexpMulDivOrMod_expr_0=ruleMexpMulDivOrMod_expr
		{
			$current = $this_MexpMulDivOrMod_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMexpPlusOrMinus_exprAccess().getMexpPlusOrMinus_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_PLUS
						{
							newLeafNode(lv_op_2_1, grammarAccess.getMexpPlusOrMinus_exprAccess().getOpPLUSTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpPlusOrMinus_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.PLUS");
						}
						    |
						lv_op_2_2=RULE_MINUS
						{
							newLeafNode(lv_op_2_2, grammarAccess.getMexpPlusOrMinus_exprAccess().getOpMINUSTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpPlusOrMinus_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_2,
								"org.xtext.Abs.MINUS");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpPlusOrMinus_exprAccess().getRightMexpMulDivOrMod_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMexpMulDivOrMod_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpPlusOrMinus_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MexpMulDivOrMod_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMexpMulDivOrMod_expr
entryRuleMexpMulDivOrMod_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpMulDivOrMod_exprRule()); }
	iv_ruleMexpMulDivOrMod_expr=ruleMexpMulDivOrMod_expr
	{ $current=$iv_ruleMexpMulDivOrMod_expr.current; }
	EOF;

// Rule MexpMulDivOrMod_expr
ruleMexpMulDivOrMod_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpMulDivOrMod_exprAccess().getMexpPrimary_exprParserRuleCall_0());
		}
		this_MexpPrimary_expr_0=ruleMexpPrimary_expr
		{
			$current = $this_MexpPrimary_expr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMexpMulDivOrMod_exprAccess().getMexpMulDivOrMod_exprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1=RULE_MULT
						{
							newLeafNode(lv_op_2_1, grammarAccess.getMexpMulDivOrMod_exprAccess().getOpMULTTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpMulDivOrMod_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_1,
								"org.xtext.Abs.MULT");
						}
						    |
						lv_op_2_2='/'
						{
							newLeafNode(lv_op_2_2, grammarAccess.getMexpMulDivOrMod_exprAccess().getOpSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpMulDivOrMod_exprRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
						}
						    |
						lv_op_2_3=RULE_MOD
						{
							newLeafNode(lv_op_2_3, grammarAccess.getMexpMulDivOrMod_exprAccess().getOpMODTerminalRuleCall_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMexpMulDivOrMod_exprRule());
							}
							setWithLastConsumed(
								$current,
								"op",
								lv_op_2_3,
								"org.xtext.Abs.MOD");
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpMulDivOrMod_exprAccess().getRightMexpPrimary_exprParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMexpPrimary_expr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpMulDivOrMod_exprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.Abs.MexpPrimary_expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMexpPrimary_expr
entryRuleMexpPrimary_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpPrimary_exprRule()); }
	iv_ruleMexpPrimary_expr=ruleMexpPrimary_expr
	{ $current=$iv_ruleMexpPrimary_expr.current; }
	EOF;

// Rule MexpPrimary_expr
ruleMexpPrimary_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getMexpPrimary_exprAccess().getMexpPrimary_exprAction_0_0(),
						$current);
				}
			)
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getMexpPrimary_exprAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMexpPrimary_exprAccess().getAMexpParserRuleCall_0_2_0());
					}
					lv_a_2_0=ruleMexp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMexpPrimary_exprRule());
						}
						set(
							$current,
							"a",
							lv_a_2_0,
							"org.xtext.Abs.Mexp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getMexpPrimary_exprAccess().getRightParenthesisKeyword_0_3());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getMexpPrimary_exprAccess().getMexpPrimary_exprAction_1_0(),
						$current);
				}
			)
			(
				this_NEGATION_5=RULE_NEGATION
				{
					newLeafNode(this_NEGATION_5, grammarAccess.getMexpPrimary_exprAccess().getNEGATIONTerminalRuleCall_1_1_0());
				}
				    |
				this_MINUS_6=RULE_MINUS
				{
					newLeafNode(this_MINUS_6, grammarAccess.getMexpPrimary_exprAccess().getMINUSTerminalRuleCall_1_1_1());
				}
			)
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMexpPrimary_exprAccess().getMexpAtomic_exprParserRuleCall_2());
		}
		this_MexpAtomic_expr_7=ruleMexpAtomic_expr
		{
			$current = $this_MexpAtomic_expr_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMexpAtomic_expr
entryRuleMexpAtomic_expr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMexpAtomic_exprRule()); }
	iv_ruleMexpAtomic_expr=ruleMexpAtomic_expr
	{ $current=$iv_ruleMexpAtomic_expr.current; }
	EOF;

// Rule MexpAtomic_expr
ruleMexpAtomic_expr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getMexpAtomic_exprAccess().getMexpAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getMexpAtomic_exprAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMexpAtomic_exprRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.xtext.Abs.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleFextension
entryRuleFextension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFextensionRule()); }
	iv_ruleFextension=ruleFextension
	{ $current=$iv_ruleFextension.current; }
	EOF;

// Rule Fextension
ruleFextension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getFextensionAccess().getFextensionAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFextensionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFextensionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Abs.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFextensionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFextensionAccess().getFeature_decl_groupFeature_decl_groupParserRuleCall_3_0());
				}
				lv_feature_decl_group_3_0=ruleFeature_decl_group
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFextensionRule());
					}
					set(
						$current,
						"feature_decl_group",
						lv_feature_decl_group_3_0,
						"org.xtext.Abs.Feature_decl_group");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFextensionAccess().getFeature_decl_attributeFeature_decl_attributeParserRuleCall_4_0_0());
					}
					lv_feature_decl_attribute_4_0=ruleFeature_decl_attribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFextensionRule());
						}
						add(
							$current,
							"feature_decl_attribute",
							lv_feature_decl_attribute_4_0,
							"org.xtext.Abs.Feature_decl_attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFextensionAccess().getFeature_decl_constraintFeature_decl_constraintParserRuleCall_4_1_0());
					}
					lv_feature_decl_constraint_5_0=ruleFeature_decl_constraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFextensionRule());
						}
						add(
							$current,
							"feature_decl_constraint",
							lv_feature_decl_constraint_5_0,
							"org.xtext.Abs.Feature_decl_constraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getFextensionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

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
