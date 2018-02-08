/*
 * generated by Xtext 2.13.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.abs.Productline_decl
import org.xtext.abs.Delta_clause
import org.xtext.abs.Application_condition
import org.xtext.abs.AppOr_exp
import org.xtext.abs.AppAnd_exp
import com.google.inject.Inject;
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AbsGenerator extends AbstractGenerator {
	@Inject private Test testGeneartorObj;
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))

	for (e : resource.allContents.toIterable.filter(Productline_decl)) {
                
			e.compile();
		}

	}
	
 	def compile(Productline_decl e) {
		println(e.name);
		var StringBuffer featureNames = new StringBuffer;
		for(Delta_clause f: e.delta_clause){
			featureNames.setLength(0);
			try{
				if((f.when_condition.application_condition)!==null){
				resolveApplicationCondition(f.when_condition.application_condition,featureNames);
				}
				//f.deltaspec.name = featureNames.toString
				print(f.deltaspec.name+"----->"+featureNames);
				testGeneartorObj.label = featureNames.toString;
				
			}catch(Exception err){
				println(err.toString);
			}
			println();
		}
		return featureNames;
	}
	
	
	def resolveApplicationCondition(Application_condition app_cond,StringBuffer featureName){
	try{
			
		
			if(app_cond instanceof AppOr_exp){
				//println("I am object of or");
				resolveApplicationCondition(app_cond.left,featureName);
				resolveApplicationCondition(app_cond.right,featureName);
			}else if(app_cond instanceof AppAnd_exp){
				//println("I am object of and")
				resolveApplicationCondition(app_cond.left,featureName);
				resolveApplicationCondition(app_cond.right,featureName);
			}else{
				if(app_cond.feature!== null){
					//println("I am object of feature");
					if(featureName.length==0){
						featureName.append(app_cond.feature.name);
						}else{
						featureName.append(","+app_cond.feature.name);
						}
					
				}else{
					//println("I am object of negation");
					resolveApplicationCondition(app_cond.app_cond,featureName);
				}
				
			}
		}catch(Exception e){
			println(e.toString());
		}
	}

	
}