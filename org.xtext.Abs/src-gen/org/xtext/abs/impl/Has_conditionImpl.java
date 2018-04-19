/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Field_decl;
import org.xtext.abs.Has_condition;
import org.xtext.abs.Interface_decl;
import org.xtext.abs.Methodsig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Has_conditionImpl#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Has_conditionImpl#getM <em>M</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Has_conditionImpl#getI <em>I</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Has_conditionImpl extends Delta_paramImpl implements Has_condition
{
  /**
   * The cached value of the '{@link #getF() <em>F</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected Field_decl f;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected Methodsig m;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected Interface_decl i;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Has_conditionImpl()
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
    return AbsPackage.Literals.HAS_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_decl getF()
  {
    if (f != null && f.eIsProxy())
    {
      InternalEObject oldF = (InternalEObject)f;
      f = (Field_decl)eResolveProxy(oldF);
      if (f != oldF)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.HAS_CONDITION__F, oldF, f));
      }
    }
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_decl basicGetF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(Field_decl newF)
  {
    Field_decl oldF = f;
    f = newF;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.HAS_CONDITION__F, oldF, f));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig getM()
  {
    if (m != null && m.eIsProxy())
    {
      InternalEObject oldM = (InternalEObject)m;
      m = (Methodsig)eResolveProxy(oldM);
      if (m != oldM)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.HAS_CONDITION__M, oldM, m));
      }
    }
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig basicGetM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(Methodsig newM)
  {
    Methodsig oldM = m;
    m = newM;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.HAS_CONDITION__M, oldM, m));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl getI()
  {
    if (i != null && i.eIsProxy())
    {
      InternalEObject oldI = (InternalEObject)i;
      i = (Interface_decl)eResolveProxy(oldI);
      if (i != oldI)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.HAS_CONDITION__I, oldI, i));
      }
    }
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl basicGetI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(Interface_decl newI)
  {
    Interface_decl oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.HAS_CONDITION__I, oldI, i));
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
      case AbsPackage.HAS_CONDITION__F:
        if (resolve) return getF();
        return basicGetF();
      case AbsPackage.HAS_CONDITION__M:
        if (resolve) return getM();
        return basicGetM();
      case AbsPackage.HAS_CONDITION__I:
        if (resolve) return getI();
        return basicGetI();
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
      case AbsPackage.HAS_CONDITION__F:
        setF((Field_decl)newValue);
        return;
      case AbsPackage.HAS_CONDITION__M:
        setM((Methodsig)newValue);
        return;
      case AbsPackage.HAS_CONDITION__I:
        setI((Interface_decl)newValue);
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
      case AbsPackage.HAS_CONDITION__F:
        setF((Field_decl)null);
        return;
      case AbsPackage.HAS_CONDITION__M:
        setM((Methodsig)null);
        return;
      case AbsPackage.HAS_CONDITION__I:
        setI((Interface_decl)null);
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
      case AbsPackage.HAS_CONDITION__F:
        return f != null;
      case AbsPackage.HAS_CONDITION__M:
        return m != null;
      case AbsPackage.HAS_CONDITION__I:
        return i != null;
    }
    return super.eIsSet(featureID);
  }

} //Has_conditionImpl
