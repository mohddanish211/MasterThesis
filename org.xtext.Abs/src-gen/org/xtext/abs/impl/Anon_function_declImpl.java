/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Anon_function_decl;
import org.xtext.abs.Param_list;
import org.xtext.abs.Pure_exp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anon function decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Anon_function_declImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Anon_function_declImpl#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Anon_function_declImpl extends Function_paramImpl implements Anon_function_decl
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected Param_list params;

  /**
   * The cached value of the '{@link #getPure_exp() <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp()
   * @generated
   * @ordered
   */
  protected Pure_exp pure_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Anon_function_declImpl()
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
    return AbsPackage.Literals.ANON_FUNCTION_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param_list getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(Param_list newParams, NotificationChain msgs)
  {
    Param_list oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.ANON_FUNCTION_DECL__PARAMS, oldParams, newParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(Param_list newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.ANON_FUNCTION_DECL__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.ANON_FUNCTION_DECL__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.ANON_FUNCTION_DECL__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getPure_exp()
  {
    return pure_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPure_exp(Pure_exp newPure_exp, NotificationChain msgs)
  {
    Pure_exp oldPure_exp = pure_exp;
    pure_exp = newPure_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.ANON_FUNCTION_DECL__PURE_EXP, oldPure_exp, newPure_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPure_exp(Pure_exp newPure_exp)
  {
    if (newPure_exp != pure_exp)
    {
      NotificationChain msgs = null;
      if (pure_exp != null)
        msgs = ((InternalEObject)pure_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.ANON_FUNCTION_DECL__PURE_EXP, null, msgs);
      if (newPure_exp != null)
        msgs = ((InternalEObject)newPure_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.ANON_FUNCTION_DECL__PURE_EXP, null, msgs);
      msgs = basicSetPure_exp(newPure_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.ANON_FUNCTION_DECL__PURE_EXP, newPure_exp, newPure_exp));
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
      case AbsPackage.ANON_FUNCTION_DECL__PARAMS:
        return basicSetParams(null, msgs);
      case AbsPackage.ANON_FUNCTION_DECL__PURE_EXP:
        return basicSetPure_exp(null, msgs);
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
      case AbsPackage.ANON_FUNCTION_DECL__PARAMS:
        return getParams();
      case AbsPackage.ANON_FUNCTION_DECL__PURE_EXP:
        return getPure_exp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AbsPackage.ANON_FUNCTION_DECL__PARAMS:
        setParams((Param_list)newValue);
        return;
      case AbsPackage.ANON_FUNCTION_DECL__PURE_EXP:
        setPure_exp((Pure_exp)newValue);
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
      case AbsPackage.ANON_FUNCTION_DECL__PARAMS:
        setParams((Param_list)null);
        return;
      case AbsPackage.ANON_FUNCTION_DECL__PURE_EXP:
        setPure_exp((Pure_exp)null);
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
      case AbsPackage.ANON_FUNCTION_DECL__PARAMS:
        return params != null;
      case AbsPackage.ANON_FUNCTION_DECL__PURE_EXP:
        return pure_exp != null;
    }
    return super.eIsSet(featureID);
  }

} //Anon_function_declImpl
