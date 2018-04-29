/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
grammar DebugInternalAbs;

// Rule DomainModel
ruleDomainModel:
	ruleCompilation_Unit
;

// Rule Compilation_Unit
ruleCompilation_Unit:
	ruleModule_decl
	*
	ruleDelta_decl
	*
	ruleUpdate_decl
	*
	ruleProductline_decl
	?
	ruleProduct_decl
	*
	(
		'root'
		ruleFeature_decl
		    |
		'extension'
		ruleFextension
	)*
;

// Rule Module_decl
ruleModule_decl:
	'module'
	RULE_ID
	';'
	ruleModule_export
	*
	ruleModule_import
	*
	ruleDecl
	*
	ruleMain_block
	?
;

// Rule Module_export
ruleModule_export:
	'export'
	(
		RULE_MULT
		    |
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
	)
	(
		'from'
		ruleQualifiedName
	)?
	';'
;

// Rule Module_import
ruleModule_import:
	'import'
	(
		RULE_MULT
		'from'
		ruleQualifiedName
		';'
		    |
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
		(
			'from'
			ruleQualifiedName
		)?
		';'
	)
;

// Rule Decl
ruleDecl:
	(
		ruleDataType_decl
		    |
		ruleFunction_decl
		    |
		rulePar_function_decl
		    |
		ruleTypesyn_decl
		    |
		ruleException_decl
		    |
		ruleInterface_decl
		    |
		ruleClass_decl
		    |
		ruleTrait_decl
	)
;

// Rule Par_function_decl
rulePar_function_decl:
	'def'
	ruleType_use
	RULE_ID
	(
		RULE_LT
		RULE_ID
		(
			','
			RULE_ID
		)*
		RULE_GT
	)?
	'('
	ruleFunction_name_list
	')'
	ruleParam_list
	'='
	rulePure_exp
	';'
;

// Rule Function_name_list
ruleFunction_name_list:
	(
		ruleFunction_name_decl
		(
			','
			ruleFunction_name_decl
		)*
	)?
;

// Rule Function_name_decl
ruleFunction_name_decl:
	RULE_ID
;

// Rule DataType_decl
ruleDataType_decl:
	'data'
	RULE_ID
	(
		RULE_LT
		RULE_ID
		(
			','
			RULE_ID
		)*
		RULE_GT
	)?
	(
		'='
		ruleData_constructor
		(
			'|'
			ruleData_constructor
		)*
	)?
	';'
;

// Rule Data_constructor
ruleData_constructor:
	RULE_ID
	(
		'('
		ruleData_constructor_arg
		(
			','
			ruleData_constructor_arg
		)*
		')'
	)?
;

// Rule Data_constructor_arg
ruleData_constructor_arg:
	ruleType_use
	RULE_ID?
;

// Rule Annotation
ruleAnnotation:
	(
		ruleType_use
		':'
	)?
	rulePure_exp
;

// Rule Type_use
ruleType_use:
	ruleQualifiedName
	(
		RULE_LT
		ruleType_use
		(
			','
			ruleType_use
		)*
		RULE_GT
	)?
;

// Rule Pure_exp
rulePure_exp:
	(
		ruleQualifiedName
		'('
		rulePure_exp_list
		')'
		    |
		ruleQualifiedName
		'('
		ruleFunction_list
		')'
		'('
		rulePure_exp_list
		')'
		    |
		ruleQualifiedName
		'['
		rulePure_exp_list
		']'
		    |
		ruleOr_expr
		    |
		'if'
		rulePure_exp
		'then'
		rulePure_exp
		(
			(
				('else')=>
				'else'
			)
			rulePure_exp
		)?
		    |
		'case'
		rulePure_exp
		'{'
		ruleCase_branch
		*
		'}'
		    |
		'let'
		'('
		ruleType_use
		RULE_ID
		')'
		'='
		rulePure_exp
		'in'
		rulePure_exp
	)
;

// Rule Or_expr
ruleOr_expr:
	ruleAnd_expr
	(
		RULE_OROR
		ruleAnd_expr
	)*
;

// Rule And_expr
ruleAnd_expr:
	ruleEquality_expr
	(
		RULE_ANDAND
		ruleEquality_expr
	)*
;

// Rule Equality_expr
ruleEquality_expr:
	ruleComparison_expr
	(
		(
			RULE_EQEQ
			    |RULE_NOTEQ
		)
		ruleComparison_expr
	)*
;

// Rule Comparison_expr
ruleComparison_expr:
	rulePlusOrMinus_expr
	(
		(
			RULE_LT
			    |RULE_GT
			    |RULE_LTEQ
			    |RULE_GTEQ
		)
		rulePlusOrMinus_expr
	)*
;

// Rule PlusOrMinus_expr
rulePlusOrMinus_expr:
	ruleMulDivOrMod_expr
	(
		(
			RULE_PLUS
			    |RULE_MINUS
		)
		ruleMulDivOrMod_expr
	)*
;

// Rule MulDivOrMod_expr
ruleMulDivOrMod_expr:
	rulePrimary_expr
	(
		(
			RULE_MULT
			    |'/'
			    |
			RULE_MOD
		)
		ruleUniary_expr
	)*
;

// Rule Uniary_expr
ruleUniary_expr:
	(
		(
			RULE_NEGATION
			    |RULE_NEGATION_CREOL
			    |RULE_MINUS
		)
		rulePure_exp
		    |
		rulePrimary_expr
	)
;

// Rule Primary_expr
rulePrimary_expr:
	(
		'('
		rulePure_exp
		')'
		    |
		ruleAtomic_expr
	)
;

// Rule Atomic_expr
ruleAtomic_expr:
	(
		RULE_INT
		    |
		RULE_STRINGLITERAL
		    |
		ruleVar_or_field_ref
		    |
		'this'
		    |
		'null'
		    |
		RULE_STRING
	)
;

// Rule Var_or_field_ref
ruleVar_or_field_ref:
	(
		(
			'this'
			'.'
		)?
		RULE_ID
		    |
		RULE_ID
	)
;

// Rule Case_branch
ruleCase_branch:
	rulePattern
	'=>'
	rulePure_exp
	';'
;

// Rule Pattern
rulePattern:
	(
		'_'
		    |
		RULE_INT
		    |
		RULE_STRINGLITERAL
		    |
		RULE_ID
		    |
		ruleQualifiedName
		'('
		(
			rulePattern
			(
				','
				rulePattern
			)*
		)?
		')'
	)
;

// Rule Pure_exp_list
rulePure_exp_list:
	(
		rulePure_exp
		(
			','
			rulePure_exp
		)*
	)?
;

// Rule Function_list
ruleFunction_list:
	(
		ruleFunction_param
		(
			','
			ruleFunction_param
		)*
	)?
;

// Rule Function_param
ruleFunction_param:
	(
		ruleFunction_name_param_decl
		    |
		ruleAnon_function_decl
	)
;

// Rule Function_name_param_decl
ruleFunction_name_param_decl:
	RULE_ID
;

// Rule Anon_function_decl
ruleAnon_function_decl:
	ruleParam_list
	'=>'
	rulePure_exp
;

// Rule Param_list
ruleParam_list:
	'('
	(
		ruleParam_decl
		(
			','
			ruleParam_decl
		)*
	)?
	')'
;

// Rule Param_decl
ruleParam_decl:
	ruleType_exp
	RULE_ID
;

// Rule Type_exp
ruleType_exp:
	ruleQualifiedName
	(
		RULE_LT
		ruleType_use
		(
			','
			ruleType_use
		)*
		RULE_GT
	)?
;

// Rule Function_decl
ruleFunction_decl:
	'def'
	ruleType_use
	RULE_ID
	(
		RULE_LT
		RULE_ID
		(
			','
			RULE_ID
		)*
		RULE_GT
	)?
	ruleParam_list
	'='
	(
		'builtin'
		    |
		rulePure_exp
	)
	';'
;

// Rule Typesyn_decl
ruleTypesyn_decl:
	'type'
	RULE_ID
	'='
	ruleType_use
	';'
;

// Rule Exception_decl
ruleException_decl:
	'exception'
	RULE_ID
	(
		'('
		RULE_ID
		(
			','
			RULE_ID
		)*
		')'
	)?
	';'
;

// Rule Interface_decl
ruleInterface_decl:
	'interface'
	RULE_ID
	(
		'extends'
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
	)?
	'{'
	ruleMethodsig
	*
	'}'
;

// Rule Methodsig
ruleMethodsig:
	ruleType_use
	RULE_ID
	ruleParam_list
	';'
;

// Rule Class_decl
ruleClass_decl:
	'class'
	RULE_ID
	ruleParam_list
	?
	(
		'implements'
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
	)?
	'{'
	ruleField_decl
	*
	(
		'{'
		ruleStmt
		*
		'}'
	)?
	(
		'recover'
		'{'
		ruleCasestmtbranch
		*
		'}'
	)?
	ruleTrait_usage
	*
	ruleMethod
	*
	'}'
;

// Rule Field_decl
ruleField_decl:
	ruleType_use
	RULE_ID
	(
		'='
		rulePure_exp
	)?
	';'
;

// Rule Stmt
ruleStmt:
	(
		ruleType_exp
		RULE_ID
		(
			'='
			ruleExp
		)?
		';'
		    |
		ruleVar_or_field_ref
		'='
		ruleExp
		';'
		    |
		'skip'
		';'
		    |
		'return'
		ruleExp
		';'
		    |
		'assert'
		ruleExp
		';'
		    |
		'{'
		ruleStmt
		*
		'}'
		    |
		'if'
		'('
		rulePure_exp
		')'
		ruleStmt
		(
			(
				('else')=>
				'else'
			)
			ruleStmt
		)?
		    |
		'while'
		'('
		rulePure_exp
		')'
		ruleStmt
		    |
		'foreach'
		'('
		RULE_ID
		'in'
		rulePure_exp
		')'
		ruleStmt
		    |
		'try'
		ruleStmt
		'catch'
		(
			'{'
			ruleCasestmtbranch
			*
			'}'
			    |
			ruleCasestmtbranch
		)
		(
			'finally'
			ruleStmt
		)?
		    |
		'await'
		ruleGuard
		';'
		    |
		'suspend'
		';'
		    |
		'duration'
		'('
		rulePure_exp
		','
		rulePure_exp
		')'
		';'
		    |
		'throw'
		rulePure_exp
		';'
		    |
		'die'
		rulePure_exp
		';'
		    |
		'movecogto'
		rulePure_exp
		';'
		    |
		ruleExp
		';'
		    |
		'case'
		rulePure_exp
		'{'
		ruleCasestmtbranch
		*
		'}'
	)
;

// Rule Exp
ruleExp:
	(
		ruleEff_expr
		    |
		rulePure_exp
	)
;

// Rule Eff_expr
ruleEff_expr:
	(
		rulePure_exp
		'.'
		'get'
		    |
		'new'
		'local'
		?
		ruleQualifiedName
		'('
		rulePure_exp_list
		')'
		    |
		'await'?
		rulePure_exp
		RULE_NEGATION
		RULE_ID
		'('
		rulePure_exp_list
		')'
		    |
		rulePure_exp
		'.'
		RULE_ID
		'('
		rulePure_exp_list
		')'
		    |
		(
			(
				ruleDelta_id
				    |
				'core'
			)
			'.'
		)?
		'original'
		'('
		rulePure_exp_list
		')'
	)
;

// Rule Delta_id
ruleDelta_id:
	RULE_ID
;

// Rule Guard
ruleGuard:
	(
		ruleVar_or_field_ref
		'?'
		    |
		'duration'
		'('
		rulePure_exp
		','
		rulePure_exp
		')'
		    |
		ruleAndGuard
	)
;

// Rule AndGuard
ruleAndGuard:
	rulePrimaryGuard
	(
		'&'
		rulePrimaryGuard
	)*
;

// Rule PrimaryGuard
rulePrimaryGuard:
	(
		'('
		ruleGuard
		')'
		    |
		rulePure_exp
	)
;

// Rule Casestmtbranch
ruleCasestmtbranch:
	rulePattern
	'=>'
	ruleStmt
;

// Rule Trait_usage
ruleTrait_usage:
	'uses'
	ruleQualifiedName
	*
	';'
;

// Rule Trait_expr
ruleTrait_expr:
	(
		'{'
		ruleMethod
		*
		'}'
		    |
		ruleMethod
		    |
		ruleQualifiedName
		    |
		ruletrait_Left_expr
	)
;

// Rule trait_Left_expr
ruletrait_Left_expr:
	ruleTrait_oper
	rulePrimary_Trait_expr
;

// Rule Primary_Trait_expr
rulePrimary_Trait_expr:
	'{'
	ruleTrait_expr
	'}'
;

// Rule Trait_oper
ruleTrait_oper:
	(
		'removes'
		(
			ruleQualifiedName
			    |
			'{'
			ruleQualifiedName
			*
			'}'
		)
		    |
		'adds'
		ruleTrait_expr
		    |
		'modifies'
		ruleTrait_expr
	)
;

// Rule Method
ruleMethod:
	ruleType_use
	RULE_ID
	ruleParam_list
	'{'
	ruleStmt
	*
	'}'
;

// Rule Trait_decl
ruleTrait_decl:
	'trait'
	RULE_ID
	'='
	ruleTrait_expr
;

// Rule Main_block
ruleMain_block:
	'{'
	ruleStmt
	*
	'}'
;

// Rule Delta_decl
ruleDelta_decl:
	'delta'
	RULE_ID
	(
		'('
		ruleDelta_param
		(
			','
			ruleDelta_param
		)*
		')'
	)?
	';'
	ruleDelta_access
	*
	ruleModule_modifier
	*
;

// Rule Delta_param
ruleDelta_param:
	(
		ruleParam_decl
		    |
		ruleQualifiedName
		ruleHas_condition
	)
;

// Rule Has_condition
ruleHas_condition:
	(
		'hasField'
		RULE_ID
		    |
		'hasMethod'
		RULE_ID
		    |
		'hasInterface'
		RULE_ID
	)
;

// Rule Delta_access
ruleDelta_access:
	'uses'
	RULE_ID
	';'
;

// Rule Module_modifier
ruleModule_modifier:
	(
		ruleFunctional_modifier
		    |
		ruleOO_modifier
		    |
		ruleNamespace_modifier
	)
;

// Rule Functional_modifier
ruleFunctional_modifier:
	(
		'adds'
		(
			ruleFunction_decl
			    |
			ruleDataType_decl
			    |
			ruleTypesyn_decl
		)
		    |
		'modifies'
		(
			ruleTypesyn_decl
			    |
			ruleDataType_decl
		)
	)
;

// Rule OO_modifier
ruleOO_modifier:
	(
		'adds'
		(
			ruleClass_decl
			    |
			ruleInterface_decl
		)
		    |
		'removes'
		(
			'class'
			ruleQualifiedName
			    |
			'interface'
			ruleQualifiedName
		)
		';'
		    |
		'modifies'
		(
			'class'
			ruleQualifiedName
			(
				'adds'
				ruleInterface_decl
				(
					','
					ruleInterface_decl
				)*
			)?
			(
				'removes'
				ruleQualifiedName
				(
					','
					ruleQualifiedName
				)*
			)?
			'{'
			ruleClass_modifier_fragment
			*
			'}'
			    |
			'interface'
			ruleQualifiedName
			'{'
			ruleInterface_modifier_fragment
			*
			'}'
		)
	)
;

// Rule Class_modifier_fragment
ruleClass_modifier_fragment:
	(
		'adds'
		(
			ruleField_decl
			    |
			ruleTrait_expr
		)
		    |
		'removes'
		(
			ruleField_decl
			    |
			ruleMethodsig
			    |
			'{'
			ruleMethodsig
			*
			'}'
		)
		    |
		'modifies'
		ruleTrait_expr
	)
;

// Rule Interface_modifier_fragment
ruleInterface_modifier_fragment:
	(
		'adds'
		ruleMethodsig
		    |
		'removes'
		ruleMethodsig
	)
;

// Rule Namespace_modifier
ruleNamespace_modifier:
	'adds'
	(
		ruleModule_import
		    |
		ruleModule_export
	)
;

// Rule Update_decl
ruleUpdate_decl:
	'stateupdate'
	RULE_ID
	';'
	ruleObject_update
	*
;

// Rule Object_update
ruleObject_update:
	'objectupdate'
	ruleQualifiedName
	'{'
	'await'
	RULE_ID
	';'
	ruleUpdate_preamble_declaration
	*
	ruleObject_update_assign_stmt
	*
	'classupdate'
	';'
	ruleObject_update_assign_stmt
	*
	'}'
;

// Rule Update_preamble_declaration
ruleUpdate_preamble_declaration:
	ruleType_exp
	RULE_ID
;

// Rule Object_update_assign_stmt
ruleObject_update_assign_stmt:
	RULE_ID
	'='
	ruleExp
	';'
;

// Rule Productline_decl
ruleProductline_decl:
	'productline'
	RULE_ID
	';'
	'features'
	ruleFeature
	(
		','
		ruleFeature
	)*
	';'
	ruleDelta_clause
	*
;

// Rule Feature
ruleFeature:
	ruleQualifiedName
	'\''
	?
	(
		'{'
		ruleAttr_assignment
		(
			','
			ruleAttr_assignment
		)*
		'}'
	)?
;

// Rule Attr_assignment
ruleAttr_assignment:
	RULE_ID
	'='
	(
		RULE_INT
		    |
		RULE_ID
		    |
		RULE_STRINGLITERAL
	)
;

// Rule Delta_clause
ruleDelta_clause:
	'delta'
	RULE_ID
	ruleAfter_condition
	?
	ruleFrom_condition
	?
	ruleWhen_condition
	?
	';'
;

// Rule Deltaspec_param
ruleDeltaspec_param:
	(
		RULE_ID
		'.'
		RULE_ID
		    |
		RULE_INT
	)
;

// Rule After_condition
ruleAfter_condition:
	'after'
	RULE_ID
	(
		','
		RULE_ID
	)*
;

// Rule From_condition
ruleFrom_condition:
	'from'
	ruleApplication_condition
;

// Rule When_condition
ruleWhen_condition:
	(
		'when'
		    |
		'to'
	)
	ruleApplication_condition
;

// Rule Application_condition
ruleApplication_condition:
	ruleAppOr_exp
;

// Rule AppOr_exp
ruleAppOr_exp:
	ruleAppAnd_exp
	(
		RULE_OROR
		ruleAppAnd_exp
	)*
;

// Rule AppAnd_exp
ruleAppAnd_exp:
	ruleAppUnary_exp
	(
		RULE_ANDAND
		ruleAppUnary_exp
	)*
;

// Rule AppUnary_exp
ruleAppUnary_exp:
	(
		ruleAppPrimary_exp
		    |
		(
			RULE_NEGATION
			    |
			RULE_NEGATION_CREOL
		)
		ruleAppUnary_exp
	)
;

// Rule AppPrimary_exp
ruleAppPrimary_exp:
	(
		'('
		ruleAppOr_exp
		')'
		    |
		ruleAppCond_atomic_expr
	)
;

// Rule AppCond_atomic_expr
ruleAppCond_atomic_expr:
	ruleFeature
;

// Rule Product_decl
ruleProduct_decl:
	'product'
	RULE_ID
	(
		'('
		(
			ruleFeature
			(
				','
				ruleFeature
			)*
		)?
		')'
		(
			'{'
			ruleProduct_reconfiguration
			*
			'}'
			    |
			';'
		)
		    |
		'='
		ruleProduct_expr
		';'
	)
;

// Rule Product_expr
ruleProduct_expr:
	ruleProductOr_expr
;

// Rule ProductOr_expr
ruleProductOr_expr:
	ruleProductAnd_exp
	(
		RULE_OROR
		ruleProductAnd_exp
	)*
;

// Rule ProductAnd_exp
ruleProductAnd_exp:
	ruleProductPrimary_exp
	(
		RULE_ANDAND
		ruleProductMinus_exp
	)*
;

// Rule ProductMinus_exp
ruleProductMinus_exp:
	ruleProductPrimary_exp
	(
		RULE_MINUS
		ruleProductPrimary_exp
	)*
;

// Rule ProductPrimary_exp
ruleProductPrimary_exp:
	(
		'('
		ruleProductOr_expr
		')'
		    |
		ruleAtomicProduct_expr
	)
;

// Rule AtomicProduct_expr
ruleAtomicProduct_expr:
	(
		'{'
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
		'}'
		    |
		ruleQualifiedName
	)
;

// Rule Product_reconfiguration
ruleProduct_reconfiguration:
	RULE_ID
	'delta'
	ruleDelta_id
	(
		','
		ruleDelta_id
	)*
	'stateupdate'
	RULE_ID
	';'
;

// Rule Feature_decl
ruleFeature_decl:
	RULE_ID
	(
		'{'
		ruleFeature_decl_group
		?
		(
			ruleFeature_decl_attribute
			    |
			ruleFeature_decl_constraint
		)*
		'}'
	)?
;

// Rule Feature_decl_group
ruleFeature_decl_group:
	'group'
	(
		'oneof'
		    |
		'allof'
		    |
		'['
		RULE_INT
		'..'
		(
			RULE_INT
			    |
			RULE_MULT
		)
		']'
	)
	'{'
	ruleFnode
	(
		','
		ruleFnode
	)*
	'}'
;

// Rule Fnode
ruleFnode:
	'opt'?
	ruleFeature_decl
;

// Rule Feature_decl_attribute
ruleFeature_decl_attribute:
	(
		RULE_ID
		RULE_ID
		'in'
		'{'
		ruleBoundary_val
		(
			','
			ruleBoundary_val
		)*
		'}'
		';'
		    |
		RULE_ID
		RULE_ID
		'in'
		'['
		ruleBoundary_int
		'..'
		ruleBoundary_int
		']'
		';'
		    |
		RULE_ID
		'['
		ruleBoundary_int
		'..'
		ruleBoundary_int
		']'
		RULE_ID
		';'
		    |
		RULE_ID
		RULE_ID
		';'
	)
;

// Rule Boundary_val
ruleBoundary_val:
	RULE_MINUS?
	RULE_INT
;

// Rule Boundary_int
ruleBoundary_int:
	(
		RULE_MULT
		    |
		ruleBoundary_val
	)
;

// Rule Feature_decl_constraint
ruleFeature_decl_constraint:
	(
		(
			'ifin'
			':'
		)?
		ruleMexp
		';'
		    |
		'ifout'
		':'
		ruleMexp
		';'
		    |
		'exclude'
		':'
		RULE_ID
		';'
		    |
		'require'
		':'
		RULE_ID
		';'
	)
;

// Rule Mexp
ruleMexp:
	(
		RULE_ID
		'.'
		RULE_ID
		    |
		RULE_ID
		    |
		RULE_ID
		    |
		ruleMexpOr_exp
	)
;

// Rule MexpOr_exp
ruleMexpOr_exp:
	ruleMexpAnd_expr
	(
		RULE_OROR
		ruleMexpAnd_expr
	)*
;

// Rule MexpAnd_expr
ruleMexpAnd_expr:
	ruleMexpImplies_expr
	(
		RULE_ANDAND
		ruleMexpImplies_expr
	)*
;

// Rule MexpImplies_expr
ruleMexpImplies_expr:
	ruleMexpEquality_expr
	(
		(
			RULE_IMPLIES
			    |RULE_EQUIV
		)
		ruleMexpEquality_expr
	)*
;

// Rule MexpEquality_expr
ruleMexpEquality_expr:
	ruleMexpComparison_expr
	(
		(
			RULE_EQEQ
			    |RULE_NOTEQ
		)
		ruleMexpComparison_expr
	)*
;

// Rule MexpComparison_expr
ruleMexpComparison_expr:
	ruleMexpPlusOrMinus_expr
	(
		(
			RULE_LT
			    |RULE_GT
			    |RULE_LTEQ
			    |RULE_GTEQ
		)
		ruleMexpPlusOrMinus_expr
	)*
;

// Rule MexpPlusOrMinus_expr
ruleMexpPlusOrMinus_expr:
	ruleMexpMulDivOrMod_expr
	(
		(
			RULE_PLUS
			    |RULE_MINUS
		)
		ruleMexpMulDivOrMod_expr
	)*
;

// Rule MexpMulDivOrMod_expr
ruleMexpMulDivOrMod_expr:
	ruleMexpPrimary_expr
	(
		(
			RULE_MULT
			    |'/'
			    |
			RULE_MOD
		)
		ruleMexpPrimary_expr
	)*
;

// Rule MexpPrimary_expr
ruleMexpPrimary_expr:
	(
		'('
		ruleMexp
		')'
		    |
		(
			RULE_NEGATION
			    |
			RULE_MINUS
		)
		    |
		ruleMexpAtomic_expr
	)
;

// Rule MexpAtomic_expr
ruleMexpAtomic_expr:
	RULE_INT
;

// Rule Fextension
ruleFextension:
	RULE_ID
	'{'
	ruleFeature_decl_group
	?
	(
		ruleFeature_decl_attribute
		    |
		ruleFeature_decl_constraint
	)*
	'}'
;

// Rule QualifiedName
ruleQualifiedName:
	RULE_ID
	(
		'.'
		RULE_ID
	)*
;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {skip();};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {skip();};

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
