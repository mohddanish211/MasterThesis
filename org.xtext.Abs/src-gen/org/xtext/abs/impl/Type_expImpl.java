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
import org.xtext.abs.Type_exp;
import org.xtext.abs.Type_use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Type_expImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Type_expImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Type_expImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Type_expImpl#getGt <em>Gt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Type_expImpl extends Update_preamble_declarationImpl implements Type_exp
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected static final String LT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected String lt = LT_EDEFAULT;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected EList<Type_use> p;

  /**
   * The default value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected static final String GT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected String gt = GT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Type_expImpl()
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
    return AbsPackage.Literals.TYPE_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TYPE_EXP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLt()
  {
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLt(String newLt)
  {
    String oldLt = lt;
    lt = newLt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TYPE_EXP__LT, oldLt, lt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type_use> getP()
  {
    if (p == null)
    {
      p = new EObjectContainmentEList<Type_use>(Type_use.class, this, AbsPackage.TYPE_EXP__P);
    }
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGt()
  {
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGt(String newGt)
  {
    String oldGt = gt;
    gt = newGt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TYPE_EXP__GT, oldGt, gt));
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
      case AbsPackage.TYPE_EXP__P:
        return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.TYPE_EXP__NAME:
        return getName();
      case AbsPackage.TYPE_EXP__LT:
        return getLt();
      case AbsPackage.TYPE_EXP__P:
        return getP();
      case AbsPackage.TYPE_EXP__GT:
        return getGt();
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
      case AbsPackage.TYPE_EXP__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.TYPE_EXP__LT:
        setLt((String)newValue);
        return;
      case AbsPackage.TYPE_EXP__P:
        getP().clear();
        getP().addAll((Collection<? extends Type_use>)newValue);
        return;
      case AbsPackage.TYPE_EXP__GT:
        setGt((String)newValue);
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
      case AbsPackage.TYPE_EXP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.TYPE_EXP__LT:
        setLt(LT_EDEFAULT);
        return;
      case AbsPackage.TYPE_EXP__P:
        getP().clear();
        return;
      case AbsPackage.TYPE_EXP__GT:
        setGt(GT_EDEFAULT);
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
      case AbsPackage.TYPE_EXP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.TYPE_EXP__LT:
        return LT_EDEFAULT == null ? lt != null : !LT_EDEFAULT.equals(lt);
      case AbsPackage.TYPE_EXP__P:
        return p != null && !p.isEmpty();
      case AbsPackage.TYPE_EXP__GT:
        return GT_EDEFAULT == null ? gt != null : !GT_EDEFAULT.equals(gt);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", lt: ");
    result.append(lt);
    result.append(", gt: ");
    result.append(gt);
    result.append(')');
    return result.toString();
  }

} //Type_expImpl
