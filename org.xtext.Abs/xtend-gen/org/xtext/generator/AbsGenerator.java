/**
 * generated by Xtext 2.13.0
 */
package org.xtext.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import myPack.CustomReferenceFinder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.abs.AppAnd_exp;
import org.xtext.abs.AppOr_exp;
import org.xtext.abs.Application_condition;
import org.xtext.abs.Delta_clause;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Feature;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.When_condition;
import org.xtext.abs.impl.Compilation_UnitImpl;
import org.xtext.abs.impl.Delta_clauseImpl;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AbsGenerator extends AbstractGenerator {
  @Inject
  private CustomReferenceFinder customReferenceFinder;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  public void compile() {
  }
  
  /**
   * def compile(Delta_decl e) {
   * var StringBuffer featureNames = new StringBuffer;
   * for(EObject o: e.eContainer.eAllContents.toIterable.filter(Productline_decl)){
   * println("------xx Delta TO Feature xx-----");
   * for(Delta_clause delta_clause: o.eAllContents.toIterable.filter(Delta_clause)){
   * featureNames.setLength(0);
   * try{
   * if((delta_clause.deltaspec.name).equals(e.name)){
   * if((delta_clause.when_condition.application_condition)!==null){
   * resolveApplicationCondition(delta_clause.when_condition.application_condition,featureNames);
   * }
   * println(delta_clause.deltaspec.name+"----->"+featureNames);
   * return featureNames.toString
   * }
   * }catch(Exception err){
   * println(err.toString);
   * }
   * }
   * }
   * return "error"
   * }
   */
  public ArrayList<Object> computeDeltaToFeature(final Delta_decl deltaDecl) {
    ArrayList<Object> featureDeclList = new ArrayList<Object>();
    List<IReferenceDescription> _findReferencesTo = this.customReferenceFinder.findReferencesTo(deltaDecl);
    for (final IReferenceDescription r : _findReferencesTo) {
      {
        final URI sourcePlatformUri = r.getSourceEObjectUri();
        final EObject productlineDecl = this.customReferenceFinder.customResourceFinder(sourcePlatformUri, deltaDecl);
        Iterable<Delta_clauseImpl> _filter = Iterables.<Delta_clauseImpl>filter(productlineDecl.eContents(), Delta_clauseImpl.class);
        for (final EObject delta_clause : _filter) {
          {
            final Delta_clauseImpl clause = ((Delta_clauseImpl) delta_clause);
            InputOutput.<When_condition>println(clause.getWhen_condition());
            try {
              boolean _equals = clause.getDeltaspec().getName().equals(deltaDecl.getName());
              if (_equals) {
                featureDeclList.clear();
                Application_condition _application_condition = clause.getWhen_condition().getApplication_condition();
                boolean _tripleNotEquals = (_application_condition != null);
                if (_tripleNotEquals) {
                  this.resolveApplicationConditionForD2F(clause.getWhen_condition().getApplication_condition(), featureDeclList);
                }
                return featureDeclList;
              }
            } catch (final Throwable _t) {
              if (_t instanceof Exception) {
                final Exception err = (Exception)_t;
                InputOutput.<String>println(err.toString());
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
        }
      }
    }
    InputOutput.<String>println("_____________________________________________");
    return featureDeclList;
  }
  
  public ArrayList<Object> computeFeatureToDelta(final Feature_decl feature_decl) {
    final ArrayList<Object> deltaDeclList = new ArrayList<Object>();
    List<IReferenceDescription> _findReferencesTo = this.customReferenceFinder.findReferencesTo(feature_decl);
    for (final IReferenceDescription r : _findReferencesTo) {
      {
        final URI sourcePlatformUri = r.getSourceEObjectUri();
        EObject _customResourceFinder = this.customReferenceFinder.customResourceFinder(sourcePlatformUri, feature_decl);
        final Compilation_UnitImpl compilationUnit = ((Compilation_UnitImpl) _customResourceFinder);
        EList<Delta_clause> _delta_clause = compilationUnit.getProductline_decl().getDelta_clause();
        for (final Delta_clause clause : _delta_clause) {
          try {
            Application_condition _application_condition = clause.getWhen_condition().getApplication_condition();
            boolean _tripleNotEquals = (_application_condition != null);
            if (_tripleNotEquals) {
              InputOutput.<Application_condition>println(clause.getWhen_condition().getApplication_condition());
              this.resolveApplicationConditionForF2D(clause.getWhen_condition().getApplication_condition(), feature_decl, deltaDeclList, clause);
            }
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception err = (Exception)_t;
              InputOutput.<String>println(err.toString());
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
        return deltaDeclList;
      }
    }
    return null;
  }
  
  public Object resolveApplicationConditionForF2D(final Application_condition app_cond, final Feature_decl featureDecl, final ArrayList<Object> deltaDeclList, final Delta_clause deltaClause) {
    Object _xtrycatchfinallyexpression = null;
    try {
      Object _xifexpression = null;
      if ((app_cond instanceof AppOr_exp)) {
        Object _xblockexpression = null;
        {
          this.resolveApplicationConditionForF2D(((AppOr_exp)app_cond).getLeft(), featureDecl, deltaDeclList, deltaClause);
          _xblockexpression = this.resolveApplicationConditionForF2D(((AppOr_exp)app_cond).getRight(), featureDecl, deltaDeclList, deltaClause);
        }
        _xifexpression = _xblockexpression;
      } else {
        Object _xifexpression_1 = null;
        if ((app_cond instanceof AppAnd_exp)) {
          Object _xblockexpression_1 = null;
          {
            this.resolveApplicationConditionForF2D(((AppAnd_exp)app_cond).getLeft(), featureDecl, deltaDeclList, deltaClause);
            _xblockexpression_1 = this.resolveApplicationConditionForF2D(((AppAnd_exp)app_cond).getRight(), featureDecl, deltaDeclList, deltaClause);
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          boolean _xifexpression_2 = false;
          Feature _feature = app_cond.getFeature();
          boolean _tripleNotEquals = (_feature != null);
          if (_tripleNotEquals) {
            boolean _xblockexpression_2 = false;
            {
              Feature_decl _feature_decl = app_cond.getFeature().getFeature_decl();
              final EObject featureObj = ((EObject) _feature_decl);
              boolean _xifexpression_3 = false;
              boolean _equals = featureObj.eGet(featureObj.eClass().getEStructuralFeature("name")).equals(featureDecl.getName());
              if (_equals) {
                _xifexpression_3 = deltaDeclList.add(deltaClause.getDeltaspec());
              }
              _xblockexpression_2 = _xifexpression_3;
            }
            _xifexpression_2 = _xblockexpression_2;
          }
          _xifexpression_1 = Boolean.valueOf(_xifexpression_2);
        }
        _xifexpression = _xifexpression_1;
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        _xtrycatchfinallyexpression = InputOutput.<String>println(e.toString());
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public Object resolveApplicationConditionForD2F(final Application_condition app_cond, final ArrayList<Object> featureDecl) {
    Object _xtrycatchfinallyexpression = null;
    try {
      Object _xifexpression = null;
      if ((app_cond instanceof AppOr_exp)) {
        Object _xblockexpression = null;
        {
          this.resolveApplicationConditionForD2F(((AppOr_exp)app_cond).getLeft(), featureDecl);
          _xblockexpression = this.resolveApplicationConditionForD2F(((AppOr_exp)app_cond).getRight(), featureDecl);
        }
        _xifexpression = _xblockexpression;
      } else {
        Object _xifexpression_1 = null;
        if ((app_cond instanceof AppAnd_exp)) {
          Object _xblockexpression_1 = null;
          {
            this.resolveApplicationConditionForD2F(((AppAnd_exp)app_cond).getLeft(), featureDecl);
            _xblockexpression_1 = this.resolveApplicationConditionForD2F(((AppAnd_exp)app_cond).getRight(), featureDecl);
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          boolean _xifexpression_2 = false;
          Feature _feature = app_cond.getFeature();
          boolean _tripleNotEquals = (_feature != null);
          if (_tripleNotEquals) {
            boolean _xblockexpression_2 = false;
            {
              Feature_decl _feature_decl = app_cond.getFeature().getFeature_decl();
              final EObject featureObj = ((EObject) _feature_decl);
              _xblockexpression_2 = featureDecl.add(app_cond.getFeature());
            }
            _xifexpression_2 = _xblockexpression_2;
          }
          _xifexpression_1 = Boolean.valueOf(_xifexpression_2);
        }
        _xifexpression = _xifexpression_1;
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        _xtrycatchfinallyexpression = InputOutput.<String>println(e.toString());
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}
