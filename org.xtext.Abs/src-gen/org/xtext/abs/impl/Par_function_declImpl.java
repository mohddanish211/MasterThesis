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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Function_name_list;
import org.xtext.abs.Par_function_decl;
import org.xtext.abs.Param_list;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Type_use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Par function decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Par_function_declImpl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Par_function_declImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Par_function_declImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Par_function_declImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Par_function_declImpl#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Par_function_declImpl extends DeclImpl implements Par_function_decl
{
  /**
   * The cached value of the '{@link #getType_use() <em>Type use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_use()
   * @generated
   * @ordered
   */
  protected Type_use type_use;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected EList<String> p;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected Function_name_list functions;

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
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Pure_exp e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Par_function_declImpl()
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
    return AbsPackage.Literals.PAR_FUNCTION_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_use getType_use()
  {
    return type_use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_use(Type_use newType_use, NotificationChain msgs)
  {
    Type_use oldType_use = type_use;
    type_use = newType_use;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__TYPE_USE, oldType_use, newType_use);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_use(Type_use newType_use)
  {
    if (newType_use != type_use)
    {
      NotificationChain msgs = null;
      if (type_use != null)
        msgs = ((InternalEObject)type_use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__TYPE_USE, null, msgs);
      if (newType_use != null)
        msgs = ((InternalEObject)newType_use).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__TYPE_USE, null, msgs);
      msgs = basicSetType_use(newType_use, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__TYPE_USE, newType_use, newType_use));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getP()
  {
    if (p == null)
    {
      p = new EDataTypeEList<String>(String.class, this, AbsPackage.PAR_FUNCTION_DECL__P);
    }
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_name_list getFunctions()
  {
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctions(Function_name_list newFunctions, NotificationChain msgs)
  {
    Function_name_list oldFunctions = functions;
    functions = newFunctions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS, oldFunctions, newFunctions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctions(Function_name_list newFunctions)
  {
    if (newFunctions != functions)
    {
      NotificationChain msgs = null;
      if (functions != null)
        msgs = ((InternalEObject)functions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS, null, msgs);
      if (newFunctions != null)
        msgs = ((InternalEObject)newFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS, null, msgs);
      msgs = basicSetFunctions(newFunctions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS, newFunctions, newFunctions));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__PARAMS, oldParams, newParams);
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
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Pure_exp newE, NotificationChain msgs)
  {
    Pure_exp oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(Pure_exp newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PAR_FUNCTION_DECL__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PAR_FUNCTION_DECL__E, newE, newE));
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
      case AbsPackage.PAR_FUNCTION_DECL__TYPE_USE:
        return basicSetType_use(null, msgs);
      case AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS:
        return basicSetFunctions(null, msgs);
      case AbsPackage.PAR_FUNCTION_DECL__PARAMS:
        return basicSetParams(null, msgs);
      case AbsPackage.PAR_FUNCTION_DECL__E:
        return basicSetE(null, msgs);
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
      case AbsPackage.PAR_FUNCTION_DECL__TYPE_USE:
        return getType_use();
      case AbsPackage.PAR_FUNCTION_DECL__P:
        return getP();
      case AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS:
        return getFunctions();
      case AbsPackage.PAR_FUNCTION_DECL__PARAMS:
        return getParams();
      case AbsPackage.PAR_FUNCTION_DECL__E:
        return getE();
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
      case AbsPackage.PAR_FUNCTION_DECL__TYPE_USE:
        setType_use((Type_use)newValue);
        return;
      case AbsPackage.PAR_FUNCTION_DECL__P:
        getP().clear();
        getP().addAll((Collection<? extends String>)newValue);
        return;
      case AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS:
        setFunctions((Function_name_list)newValue);
        return;
      case AbsPackage.PAR_FUNCTION_DECL__PARAMS:
        setParams((Param_list)newValue);
        return;
      case AbsPackage.PAR_FUNCTION_DECL__E:
        setE((Pure_exp)newValue);
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
      case AbsPackage.PAR_FUNCTION_DECL__TYPE_USE:
        setType_use((Type_use)null);
        return;
      case AbsPackage.PAR_FUNCTION_DECL__P:
        getP().clear();
        return;
      case AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS:
        setFunctions((Function_name_list)null);
        return;
      case AbsPackage.PAR_FUNCTION_DECL__PARAMS:
        setParams((Param_list)null);
        return;
      case AbsPackage.PAR_FUNCTION_DECL__E:
        setE((Pure_exp)null);
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
      case AbsPackage.PAR_FUNCTION_DECL__TYPE_USE:
        return type_use != null;
      case AbsPackage.PAR_FUNCTION_DECL__P:
        return p != null && !p.isEmpty();
      case AbsPackage.PAR_FUNCTION_DECL__FUNCTIONS:
        return functions != null;
      case AbsPackage.PAR_FUNCTION_DECL__PARAMS:
        return params != null;
      case AbsPackage.PAR_FUNCTION_DECL__E:
        return e != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (p: ");
    result.append(p);
    result.append(')');
    return result.toString();
  }

} //Par_function_declImpl
