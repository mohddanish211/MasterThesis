/**
 * generated by Xtext 2.13.0
 */
package org.xtext.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.abs.AppAnd_exp;
import org.xtext.abs.AppOr_exp;
import org.xtext.abs.Application_condition;
import org.xtext.abs.Delta_clause;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Feature;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Productline_decl;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AbsGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  public StringBuffer compile(final Productline_decl e) {
    InputOutput.<String>println(e.getName());
    StringBuffer featureNames = new StringBuffer();
    EList<Delta_clause> _delta_clause = e.getDelta_clause();
    for (final Delta_clause f : _delta_clause) {
      {
        featureNames.setLength(0);
        try {
          Application_condition _application_condition = f.getWhen_condition().getApplication_condition();
          boolean _tripleNotEquals = (_application_condition != null);
          if (_tripleNotEquals) {
            this.resolveApplicationCondition(f.getWhen_condition().getApplication_condition(), featureNames);
          }
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception err = (Exception)_t;
            InputOutput.<String>println(err.toString());
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        InputOutput.println();
      }
    }
    return featureNames;
  }
  
  public String compile(final Delta_decl e) {
    StringBuffer featureNames = new StringBuffer();
    Iterable<Productline_decl> _filter = Iterables.<Productline_decl>filter(IteratorExtensions.<EObject>toIterable(e.eContainer().eAllContents()), Productline_decl.class);
    for (final EObject o : _filter) {
      {
        InputOutput.<String>println("------xx Delta TO Feature xx-----");
        Iterable<Delta_clause> _filter_1 = Iterables.<Delta_clause>filter(IteratorExtensions.<EObject>toIterable(o.eAllContents()), Delta_clause.class);
        for (final Delta_clause delta_clause : _filter_1) {
          {
            featureNames.setLength(0);
            try {
              boolean _equals = delta_clause.getDeltaspec().getName().equals(e.getName());
              if (_equals) {
                Application_condition _application_condition = delta_clause.getWhen_condition().getApplication_condition();
                boolean _tripleNotEquals = (_application_condition != null);
                if (_tripleNotEquals) {
                  this.resolveApplicationCondition(delta_clause.getWhen_condition().getApplication_condition(), featureNames);
                }
                String _name = delta_clause.getDeltaspec().getName();
                String _plus = (_name + "----->");
                String _plus_1 = (_plus + featureNames);
                InputOutput.<String>println(_plus_1);
                return featureNames.toString();
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
    return "error";
  }
  
  public ArrayList<Feature> compile2(final Delta_decl e) {
    ArrayList<Feature> featureDeclList = new ArrayList<Feature>();
    Iterable<Productline_decl> _filter = Iterables.<Productline_decl>filter(IteratorExtensions.<EObject>toIterable(e.eContainer().eAllContents()), Productline_decl.class);
    for (final EObject o : _filter) {
      {
        InputOutput.<String>println("------xx Delta TO Feature xx-----");
        Iterable<Delta_clause> _filter_1 = Iterables.<Delta_clause>filter(IteratorExtensions.<EObject>toIterable(o.eAllContents()), Delta_clause.class);
        for (final Delta_clause delta_clause : _filter_1) {
          try {
            boolean _equals = delta_clause.getDeltaspec().getName().equals(e.getName());
            if (_equals) {
              Application_condition _application_condition = delta_clause.getWhen_condition().getApplication_condition();
              boolean _tripleNotEquals = (_application_condition != null);
              if (_tripleNotEquals) {
                this.resolveApplicationCondition2(delta_clause.getWhen_condition().getApplication_condition(), featureDeclList);
              }
              String _name = delta_clause.getDeltaspec().getName();
              String _plus = (_name + "----->");
              String _plus_1 = (_plus + featureDeclList);
              InputOutput.<String>println(_plus_1);
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
    return null;
  }
  
  public String compile(final Feature_decl e) {
    StringBuffer featureNames = new StringBuffer();
    Iterable<Productline_decl> _filter = Iterables.<Productline_decl>filter(IteratorExtensions.<EObject>toIterable(e.eContainer().eAllContents()), Productline_decl.class);
    for (final EObject o : _filter) {
      {
        InputOutput.<String>println("------xx  Feature TO Delta  xx-----");
        Iterable<Delta_clause> _filter_1 = Iterables.<Delta_clause>filter(IteratorExtensions.<EObject>toIterable(o.eAllContents()), Delta_clause.class);
        for (final Delta_clause delta_clause : _filter_1) {
          {
            featureNames.setLength(0);
            try {
              boolean _equals = delta_clause.getDeltaspec().getName().equals(e.getName());
              if (_equals) {
                Application_condition _application_condition = delta_clause.getWhen_condition().getApplication_condition();
                boolean _tripleNotEquals = (_application_condition != null);
                if (_tripleNotEquals) {
                  this.resolveApplicationCondition(delta_clause.getWhen_condition().getApplication_condition(), featureNames);
                }
                String _plus = (featureNames + "----->");
                String _name = delta_clause.getDeltaspec().getName();
                String _plus_1 = (_plus + _name);
                InputOutput.<String>print(_plus_1);
                return delta_clause.getDeltaspec().getName().toString();
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
    return "error";
  }
  
  public Object resolveApplicationCondition(final Application_condition app_cond, final StringBuffer featureName) {
    Object _xtrycatchfinallyexpression = null;
    try {
      Object _xifexpression = null;
      if ((app_cond instanceof AppOr_exp)) {
        Object _xblockexpression = null;
        {
          this.resolveApplicationCondition(((AppOr_exp)app_cond).getLeft(), featureName);
          _xblockexpression = this.resolveApplicationCondition(((AppOr_exp)app_cond).getRight(), featureName);
        }
        _xifexpression = _xblockexpression;
      } else {
        Object _xifexpression_1 = null;
        if ((app_cond instanceof AppAnd_exp)) {
          Object _xblockexpression_1 = null;
          {
            this.resolveApplicationCondition(((AppAnd_exp)app_cond).getLeft(), featureName);
            _xblockexpression_1 = this.resolveApplicationCondition(((AppAnd_exp)app_cond).getRight(), featureName);
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          Object _xifexpression_2 = null;
          Feature _feature = app_cond.getFeature();
          boolean _tripleNotEquals = (_feature != null);
          if (_tripleNotEquals) {
            StringBuffer _xifexpression_3 = null;
            int _length = featureName.length();
            boolean _equals = (_length == 0);
            if (_equals) {
              _xifexpression_3 = featureName.append(app_cond.getFeature().getName());
            } else {
              String _name = app_cond.getFeature().getName();
              String _plus = ("," + _name);
              _xifexpression_3 = featureName.append(_plus);
            }
            _xifexpression_2 = _xifexpression_3;
          } else {
            _xifexpression_2 = this.resolveApplicationCondition(app_cond.getApp_cond(), featureName);
          }
          _xifexpression_1 = _xifexpression_2;
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
  
  public Object resolveApplicationCondition2(final Application_condition app_cond, final ArrayList<Feature> featureDecl) {
    Object _xtrycatchfinallyexpression = null;
    try {
      Object _xifexpression = null;
      if ((app_cond instanceof AppOr_exp)) {
        Object _xblockexpression = null;
        {
          this.resolveApplicationCondition2(((AppOr_exp)app_cond).getLeft(), featureDecl);
          _xblockexpression = this.resolveApplicationCondition2(((AppOr_exp)app_cond).getRight(), featureDecl);
        }
        _xifexpression = _xblockexpression;
      } else {
        Object _xifexpression_1 = null;
        if ((app_cond instanceof AppAnd_exp)) {
          Object _xblockexpression_1 = null;
          {
            this.resolveApplicationCondition2(((AppAnd_exp)app_cond).getLeft(), featureDecl);
            _xblockexpression_1 = this.resolveApplicationCondition2(((AppAnd_exp)app_cond).getRight(), featureDecl);
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          Object _xifexpression_2 = null;
          Feature _feature = app_cond.getFeature();
          boolean _tripleNotEquals = (_feature != null);
          if (_tripleNotEquals) {
            Resource _xblockexpression_2 = null;
            {
              featureDecl.add(app_cond.getFeature());
              InputOutput.<String>println("Resource is");
              _xblockexpression_2 = InputOutput.<Resource>println(app_cond.getFeature().eContainer().eResource());
            }
            _xifexpression_2 = _xblockexpression_2;
          } else {
            _xifexpression_2 = this.resolveApplicationCondition2(app_cond.getApp_cond(), featureDecl);
          }
          _xifexpression_1 = _xifexpression_2;
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
