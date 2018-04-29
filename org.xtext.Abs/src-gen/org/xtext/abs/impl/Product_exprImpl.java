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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Product_decl;
import org.xtext.abs.Product_expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Product_exprImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_exprImpl#getProductDecl <em>Product Decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_exprImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_exprImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Product_exprImpl extends MinimalEObjectImpl.Container implements Product_expr
{
  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EList<Feature_decl> feature;

  /**
   * The cached value of the '{@link #getProductDecl() <em>Product Decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductDecl()
   * @generated
   * @ordered
   */
  protected Product_decl productDecl;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Product_expr left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Product_expr right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Product_exprImpl()
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
    return AbsPackage.Literals.PRODUCT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature_decl> getFeature()
  {
    if (feature == null)
    {
      feature = new EObjectResolvingEList<Feature_decl>(Feature_decl.class, this, AbsPackage.PRODUCT_EXPR__FEATURE);
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_decl getProductDecl()
  {
    if (productDecl != null && productDecl.eIsProxy())
    {
      InternalEObject oldProductDecl = (InternalEObject)productDecl;
      productDecl = (Product_decl)eResolveProxy(oldProductDecl);
      if (productDecl != oldProductDecl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.PRODUCT_EXPR__PRODUCT_DECL, oldProductDecl, productDecl));
      }
    }
    return productDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_decl basicGetProductDecl()
  {
    return productDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductDecl(Product_decl newProductDecl)
  {
    Product_decl oldProductDecl = productDecl;
    productDecl = newProductDecl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_EXPR__PRODUCT_DECL, oldProductDecl, productDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_expr getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Product_expr newLeft, NotificationChain msgs)
  {
    Product_expr oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_EXPR__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Product_expr newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PRODUCT_EXPR__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PRODUCT_EXPR__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_EXPR__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_expr getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Product_expr newRight, NotificationChain msgs)
  {
    Product_expr oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_EXPR__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Product_expr newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PRODUCT_EXPR__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PRODUCT_EXPR__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_EXPR__RIGHT, newRight, newRight));
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
      case AbsPackage.PRODUCT_EXPR__LEFT:
        return basicSetLeft(null, msgs);
      case AbsPackage.PRODUCT_EXPR__RIGHT:
        return basicSetRight(null, msgs);
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
      case AbsPackage.PRODUCT_EXPR__FEATURE:
        return getFeature();
      case AbsPackage.PRODUCT_EXPR__PRODUCT_DECL:
        if (resolve) return getProductDecl();
        return basicGetProductDecl();
      case AbsPackage.PRODUCT_EXPR__LEFT:
        return getLeft();
      case AbsPackage.PRODUCT_EXPR__RIGHT:
        return getRight();
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
      case AbsPackage.PRODUCT_EXPR__FEATURE:
        getFeature().clear();
        getFeature().addAll((Collection<? extends Feature_decl>)newValue);
        return;
      case AbsPackage.PRODUCT_EXPR__PRODUCT_DECL:
        setProductDecl((Product_decl)newValue);
        return;
      case AbsPackage.PRODUCT_EXPR__LEFT:
        setLeft((Product_expr)newValue);
        return;
      case AbsPackage.PRODUCT_EXPR__RIGHT:
        setRight((Product_expr)newValue);
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
      case AbsPackage.PRODUCT_EXPR__FEATURE:
        getFeature().clear();
        return;
      case AbsPackage.PRODUCT_EXPR__PRODUCT_DECL:
        setProductDecl((Product_decl)null);
        return;
      case AbsPackage.PRODUCT_EXPR__LEFT:
        setLeft((Product_expr)null);
        return;
      case AbsPackage.PRODUCT_EXPR__RIGHT:
        setRight((Product_expr)null);
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
      case AbsPackage.PRODUCT_EXPR__FEATURE:
        return feature != null && !feature.isEmpty();
      case AbsPackage.PRODUCT_EXPR__PRODUCT_DECL:
        return productDecl != null;
      case AbsPackage.PRODUCT_EXPR__LEFT:
        return left != null;
      case AbsPackage.PRODUCT_EXPR__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //Product_exprImpl
