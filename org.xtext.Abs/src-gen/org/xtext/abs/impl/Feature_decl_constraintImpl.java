/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Feature_decl_constraint;
import org.xtext.abs.Mexp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature decl constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Feature_decl_constraintImpl#getMexp <em>Mexp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Feature_decl_constraintImpl extends MinimalEObjectImpl.Container implements Feature_decl_constraint
{
  /**
   * The cached value of the '{@link #getMexp() <em>Mexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMexp()
   * @generated
   * @ordered
   */
  protected Mexp mexp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Feature_decl_constraintImpl()
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
    return AbsPackage.Literals.FEATURE_DECL_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mexp getMexp()
  {
    return mexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMexp(Mexp newMexp, NotificationChain msgs)
  {
    Mexp oldMexp = mexp;
    mexp = newMexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP, oldMexp, newMexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMexp(Mexp newMexp)
  {
    if (newMexp != mexp)
    {
      NotificationChain msgs = null;
      if (mexp != null)
        msgs = ((InternalEObject)mexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP, null, msgs);
      if (newMexp != null)
        msgs = ((InternalEObject)newMexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP, null, msgs);
      msgs = basicSetMexp(newMexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP, newMexp, newMexp));
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
      case AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP:
        return basicSetMexp(null, msgs);
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
      case AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP:
        return getMexp();
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
      case AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP:
        setMexp((Mexp)newValue);
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
      case AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP:
        setMexp((Mexp)null);
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
      case AbsPackage.FEATURE_DECL_CONSTRAINT__MEXP:
        return mexp != null;
    }
    return super.eIsSet(featureID);
  }

} //Feature_decl_constraintImpl
