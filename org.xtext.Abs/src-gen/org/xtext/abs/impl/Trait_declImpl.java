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
import org.xtext.abs.Trait_decl;
import org.xtext.abs.Trait_expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Trait_declImpl#getTraitExpr <em>Trait Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Trait_declImpl extends DeclImpl implements Trait_decl
{
  /**
   * The cached value of the '{@link #getTraitExpr() <em>Trait Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraitExpr()
   * @generated
   * @ordered
   */
  protected Trait_expr traitExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Trait_declImpl()
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
    return AbsPackage.Literals.TRAIT_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_expr getTraitExpr()
  {
    return traitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTraitExpr(Trait_expr newTraitExpr, NotificationChain msgs)
  {
    Trait_expr oldTraitExpr = traitExpr;
    traitExpr = newTraitExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_DECL__TRAIT_EXPR, oldTraitExpr, newTraitExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraitExpr(Trait_expr newTraitExpr)
  {
    if (newTraitExpr != traitExpr)
    {
      NotificationChain msgs = null;
      if (traitExpr != null)
        msgs = ((InternalEObject)traitExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_DECL__TRAIT_EXPR, null, msgs);
      if (newTraitExpr != null)
        msgs = ((InternalEObject)newTraitExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_DECL__TRAIT_EXPR, null, msgs);
      msgs = basicSetTraitExpr(newTraitExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_DECL__TRAIT_EXPR, newTraitExpr, newTraitExpr));
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
      case AbsPackage.TRAIT_DECL__TRAIT_EXPR:
        return basicSetTraitExpr(null, msgs);
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
      case AbsPackage.TRAIT_DECL__TRAIT_EXPR:
        return getTraitExpr();
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
      case AbsPackage.TRAIT_DECL__TRAIT_EXPR:
        setTraitExpr((Trait_expr)newValue);
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
      case AbsPackage.TRAIT_DECL__TRAIT_EXPR:
        setTraitExpr((Trait_expr)null);
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
      case AbsPackage.TRAIT_DECL__TRAIT_EXPR:
        return traitExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //Trait_declImpl
