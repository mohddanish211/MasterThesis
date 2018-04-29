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
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Eff_expr;
import org.xtext.abs.Pure_exp_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eff expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getPure_exp_list <em>Pure exp list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Eff_exprImpl extends ExpImpl implements Eff_expr
{
  /**
   * The default value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected static final String L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected String l = L_EDEFAULT;

  /**
   * The cached value of the '{@link #getPure_exp_list() <em>Pure exp list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp_list()
   * @generated
   * @ordered
   */
  protected Pure_exp_list pure_exp_list;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected EList<Pure_exp_list> list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Eff_exprImpl()
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
    return AbsPackage.Literals.EFF_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(String newL)
  {
    String oldL = l;
    l = newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp_list getPure_exp_list()
  {
    return pure_exp_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPure_exp_list(Pure_exp_list newPure_exp_list, NotificationChain msgs)
  {
    Pure_exp_list oldPure_exp_list = pure_exp_list;
    pure_exp_list = newPure_exp_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__PURE_EXP_LIST, oldPure_exp_list, newPure_exp_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPure_exp_list(Pure_exp_list newPure_exp_list)
  {
    if (newPure_exp_list != pure_exp_list)
    {
      NotificationChain msgs = null;
      if (pure_exp_list != null)
        msgs = ((InternalEObject)pure_exp_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EFF_EXPR__PURE_EXP_LIST, null, msgs);
      if (newPure_exp_list != null)
        msgs = ((InternalEObject)newPure_exp_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EFF_EXPR__PURE_EXP_LIST, null, msgs);
      msgs = basicSetPure_exp_list(newPure_exp_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__PURE_EXP_LIST, newPure_exp_list, newPure_exp_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pure_exp_list> getList()
  {
    if (list == null)
    {
      list = new EObjectContainmentEList<Pure_exp_list>(Pure_exp_list.class, this, AbsPackage.EFF_EXPR__LIST);
    }
    return list;
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
      case AbsPackage.EFF_EXPR__PURE_EXP_LIST:
        return basicSetPure_exp_list(null, msgs);
      case AbsPackage.EFF_EXPR__LIST:
        return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.EFF_EXPR__L:
        return getL();
      case AbsPackage.EFF_EXPR__PURE_EXP_LIST:
        return getPure_exp_list();
      case AbsPackage.EFF_EXPR__LIST:
        return getList();
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
      case AbsPackage.EFF_EXPR__L:
        setL((String)newValue);
        return;
      case AbsPackage.EFF_EXPR__PURE_EXP_LIST:
        setPure_exp_list((Pure_exp_list)newValue);
        return;
      case AbsPackage.EFF_EXPR__LIST:
        getList().clear();
        getList().addAll((Collection<? extends Pure_exp_list>)newValue);
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
      case AbsPackage.EFF_EXPR__L:
        setL(L_EDEFAULT);
        return;
      case AbsPackage.EFF_EXPR__PURE_EXP_LIST:
        setPure_exp_list((Pure_exp_list)null);
        return;
      case AbsPackage.EFF_EXPR__LIST:
        getList().clear();
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
      case AbsPackage.EFF_EXPR__L:
        return L_EDEFAULT == null ? l != null : !L_EDEFAULT.equals(l);
      case AbsPackage.EFF_EXPR__PURE_EXP_LIST:
        return pure_exp_list != null;
      case AbsPackage.EFF_EXPR__LIST:
        return list != null && !list.isEmpty();
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
    result.append(" (l: ");
    result.append(l);
    result.append(')');
    return result.toString();
  }

} //Eff_exprImpl
