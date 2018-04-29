/*
 * generated by Xtext 2.13.0
 */
package org.xtext.validation

import org.eclipse.xtext.validation.Check
import org.xtext.abs.Module_decl
import org.xtext.abs.AbsPackage
import org.xtext.abs.Interface_decl
import org.xtext.abs.Class_decl
import org.xtext.abs.Trait_decl
import org.xtext.abs.Delta_decl
import org.xtext.abs.Productline_decl
import org.xtext.abs.Feature_decl
import org.xtext.abs.Product_decl
import org.xtext.abs.Product_reconfiguration
import org.xtext.abs.Function_decl

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AbsValidator extends AbstractAbsValidator {
	
 	public static val INVALID_NAME = 'invalidName'


			@Check
   			 def void checkNameStartsWithCapital(Module_decl module) {
   			 if (!Character.isUpperCase(module.name.charAt(0))) {
           			 error("Module name should start with a capital letter", 
                	AbsPackage.Literals.MODULE_DECL__NAME);
        }
    }
    		@Check
   			 def void checkNameStartsWithCapital(Interface_decl interface_decl) {
   			 if (!Character.isUpperCase(interface_decl.name.charAt(0))) {
           			 error("Interface name should start with a capital letter", 
                	AbsPackage.Literals.INTERFACE_DECL__INTERFACE_NAME);
        }
    }
    			//Check for class_name
    		 @Check
   			 def void checkNameStartsWithCapital(Class_decl class_decl) {
   			 if (!Character.isUpperCase(class_decl.name.charAt(0))) {
           			 error("Class name should start with a capital letter", 
           			 	null
           			 );
        }
    }
    		@Check
   			 def void checkNameStartsWithCapital(Trait_decl trait_decl) {
   			 if (!Character.isUpperCase(trait_decl.name.charAt(0))) {
           			 error("Trait name should start with a capital letter", 
                	null);
        }
    }
    		@Check
   			 def void checkNameStartsWithCapital(Delta_decl delta_decl) {
   			 if (!Character.isUpperCase(delta_decl.name.charAt(0))) {
           			 error("Delta name should start with a capital letter", 
                	AbsPackage.Literals.DELTA_DECL__NAME);
        }
    }
    		@Check
   			 def void checkNameStartsWithCapital(Productline_decl productline_decl) {
   			 if (!Character.isUpperCase(productline_decl.name.charAt(0))) {
           			 error("Productline name should start with a capital letter", 
                	AbsPackage.Literals.PRODUCTLINE_DECL__NAME);
        }
    }
    		@Check
   			 def void checkNameStartsWithCapital(Feature_decl feature_decl) {
   			 if (!Character.isUpperCase(feature_decl.name.charAt(0))) {
           			 error("Feature name should start with a capital letter", 
                	AbsPackage.Literals.FEATURE_DECL__NAME);
        }
    }
    		@Check
   			 def void checkNameStartsWithCapital(Product_decl product_decl) {
   			 if (!Character.isUpperCase(product_decl.name.charAt(0))) {
           			 error("Product name should start with a capital letter", 
                	AbsPackage.Literals.PRODUCT_DECL__NAME);
        }
    }
    		@Check
   			 def void checkNameStartsWithCapital(Product_reconfiguration product_reconfiguration) {
   			 if (!Character.isUpperCase(product_reconfiguration.name.charAt(0))) {
           			 error("Product Reconfiguration name should start with a capital letter", 
                	AbsPackage.Literals.PRODUCT_RECONFIGURATION__NAME);
        }
	}
			@Check
   			 def void checkNameStartsWithCapital(Function_decl function_decl) {
   			 if (!Character.isUpperCase(function_decl.name.charAt(0))) {
           			 error("Function name should start with a capital letter", 
                	AbsPackage.Literals.FUNCTION_NAME_DECL__NAME);
        }
	}	
}
	

