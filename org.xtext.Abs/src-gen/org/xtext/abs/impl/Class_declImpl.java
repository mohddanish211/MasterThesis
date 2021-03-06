/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Casestmtbranch;
import org.xtext.abs.Class_decl;
import org.xtext.abs.Field_decl;
import org.xtext.abs.Interface_decl;
import org.xtext.abs.Method;
import org.xtext.abs.Param_list;
import org.xtext.abs.Stmt;
import org.xtext.abs.Trait_usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Class_declImpl#getParamlist <em>Paramlist</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Class_declImpl#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Class_declImpl#getField_decl <em>Field decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Class_declImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Class_declImpl#getCasestmtbranch <em>Casestmtbranch</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Class_declImpl#getTrait_usage <em>Trait usage</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Class_declImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Class_declImpl extends DeclImpl implements Class_decl
{
  /**
   * The cached value of the '{@link #getParamlist() <em>Paramlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamlist()
   * @generated
   * @ordered
   */
  protected Param_list paramlist;

  /**
   * The cached value of the '{@link #getInterface_name() <em>Interface name</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface_name()
   * @generated
   * @ordered
   */
  protected EList<Interface_decl> interface_name;

  /**
   * The cached value of the '{@link #getField_decl() <em>Field decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_decl()
   * @generated
   * @ordered
   */
  protected EList<Field_decl> field_decl;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected EList<Stmt> stmt;

  /**
   * The cached value of the '{@link #getCasestmtbranch() <em>Casestmtbranch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCasestmtbranch()
   * @generated
   * @ordered
   */
  protected EList<Casestmtbranch> casestmtbranch;

  /**
   * The cached value of the '{@link #getTrait_usage() <em>Trait usage</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait_usage()
   * @generated
   * @ordered
   */
  protected EList<Trait_usage> trait_usage;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<Method> method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Class_declImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AbsPackage.Literals.CLASS_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param_list getParamlist()
  {
    return paramlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamlist(Param_list newParamlist, NotificationChain msgs)
  {
    Param_list oldParamlist = paramlist;
    paramlist = newParamlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.CLASS_DECL__PARAMLIST, oldParamlist, newParamlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamlist(Param_list newParamlist)
  {
    if (newParamlist != paramlist)
    {
      NotificationChain msgs = null;
      if (paramlist != null)
        msgs = ((InternalEObject)paramlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.CLASS_DECL__PARAMLIST, null, msgs);
      if (newParamlist != null)
        msgs = ((InternalEObject)newParamlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.CLASS_DECL__PARAMLIST, null, msgs);
      msgs = basicSetParamlist(newParamlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.CLASS_DECL__PARAMLIST, newParamlist, newParamlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface_decl> getInterface_name()
  {
    if (interface_name == null)
    {
      interface_name = new EObjectResolvingEList<Interface_decl>(Interface_decl.class, this, AbsPackage.CLASS_DECL__INTERFACE_NAME);
    }
    return interface_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field_decl> getField_decl()
  {
    if (field_decl == null)
    {
      field_decl = new EObjectContainmentEList<Field_decl>(Field_decl.class, this, AbsPackage.CLASS_DECL__FIELD_DECL);
    }
    return field_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stmt> getStmt()
  {
    if (stmt == null)
    {
      stmt = new EObjectContainmentEList<Stmt>(Stmt.class, this, AbsPackage.CLASS_DECL__STMT);
    }
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Casestmtbranch> getCasestmtbranch()
  {
    if (casestmtbranch == null)
    {
      casestmtbranch = new EObjectContainmentEList<Casestmtbranch>(Casestmtbranch.class, this, AbsPackage.CLASS_DECL__CASESTMTBRANCH);
    }
    return casestmtbranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Trait_usage> getTrait_usage()
  {
    if (trait_usage == null)
    {
      trait_usage = new EObjectContainmentEList<Trait_usage>(Trait_usage.class, this, AbsPackage.CLASS_DECL__TRAIT_USAGE);
    }
    return trait_usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethod()
  {
    if (method == null)
    {
      method = new EObjectContainmentEList<Method>(Method.class, this, AbsPackage.CLASS_DECL__METHOD);
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AbsPackage.CLASS_DECL__PARAMLIST:
        return basicSetParamlist(null, msgs);
      case AbsPackage.CLASS_DECL__FIELD_DECL:
        return ((InternalEList<?>)getField_decl()).basicRemove(otherEnd, msgs);
      case AbsPackage.CLASS_DECL__STMT:
        return ((InternalEList<?>)getStmt()).basicRemove(otherEnd, msgs);
      case AbsPackage.CLASS_DECL__CASESTMTBRANCH:
        return ((InternalEList<?>)getCasestmtbranch()).basicRemove(otherEnd, msgs);
      case AbsPackage.CLASS_DECL__TRAIT_USAGE:
        return ((InternalEList<?>)getTrait_usage()).basicRemove(otherEnd, msgs);
      case AbsPackage.CLASS_DECL__METHOD:
        return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AbsPackage.CLASS_DECL__PARAMLIST:
        return getParamlist();
      case AbsPackage.CLASS_DECL__INTERFACE_NAME:
        return getInterface_name();
      case AbsPackage.CLASS_DECL__FIELD_DECL:
        return getField_decl();
      case AbsPackage.CLASS_DECL__STMT:
        return getStmt();
      case AbsPackage.CLASS_DECL__CASESTMTBRANCH:
        return getCasestmtbranch();
      case AbsPackage.CLASS_DECL__TRAIT_USAGE:
        return getTrait_usage();
      case AbsPackage.CLASS_DECL__METHOD:
        return getMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AbsPackage.CLASS_DECL__PARAMLIST:
        setParamlist((Param_list)newValue);
        return;
      case AbsPackage.CLASS_DECL__INTERFACE_NAME:
        getInterface_name().clear();
        getInterface_name().addAll((Collection<? extends Interface_decl>)newValue);
        return;
      case AbsPackage.CLASS_DECL__FIELD_DECL:
        getField_decl().clear();
        getField_decl().addAll((Collection<? extends Field_decl>)newValue);
        return;
      case AbsPackage.CLASS_DECL__STMT:
        getStmt().clear();
        getStmt().addAll((Collection<? extends Stmt>)newValue);
        return;
      case AbsPackage.CLASS_DECL__CASESTMTBRANCH:
        getCasestmtbranch().clear();
        getCasestmtbranch().addAll((Collection<? extends Casestmtbranch>)newValue);
        return;
      case AbsPackage.CLASS_DECL__TRAIT_USAGE:
        getTrait_usage().clear();
        getTrait_usage().addAll((Collection<? extends Trait_usage>)newValue);
        return;
      case AbsPackage.CLASS_DECL__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends Method>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AbsPackage.CLASS_DECL__PARAMLIST:
        setParamlist((Param_list)null);
        return;
      case AbsPackage.CLASS_DECL__INTERFACE_NAME:
        getInterface_name().clear();
        return;
      case AbsPackage.CLASS_DECL__FIELD_DECL:
        getField_decl().clear();
        return;
      case AbsPackage.CLASS_DECL__STMT:
        getStmt().clear();
        return;
      case AbsPackage.CLASS_DECL__CASESTMTBRANCH:
        getCasestmtbranch().clear();
        return;
      case AbsPackage.CLASS_DECL__TRAIT_USAGE:
        getTrait_usage().clear();
        return;
      case AbsPackage.CLASS_DECL__METHOD:
        getMethod().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AbsPackage.CLASS_DECL__PARAMLIST:
        return paramlist != null;
      case AbsPackage.CLASS_DECL__INTERFACE_NAME:
        return interface_name != null && !interface_name.isEmpty();
      case AbsPackage.CLASS_DECL__FIELD_DECL:
        return field_decl != null && !field_decl.isEmpty();
      case AbsPackage.CLASS_DECL__STMT:
        return stmt != null && !stmt.isEmpty();
      case AbsPackage.CLASS_DECL__CASESTMTBRANCH:
        return casestmtbranch != null && !casestmtbranch.isEmpty();
      case AbsPackage.CLASS_DECL__TRAIT_USAGE:
        return trait_usage != null && !trait_usage.isEmpty();
      case AbsPackage.CLASS_DECL__METHOD:
        return method != null && !method.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Class_declImpl
