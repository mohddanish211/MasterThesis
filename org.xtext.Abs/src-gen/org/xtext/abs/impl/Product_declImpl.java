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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Feature;
import org.xtext.abs.Product_decl;
import org.xtext.abs.Product_expr;
import org.xtext.abs.Product_reconfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Product_declImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_declImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_declImpl#getProduct_reconfiguration <em>Product reconfiguration</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_declImpl#getProduct_expr <em>Product expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Product_declImpl extends MinimalEObjectImpl.Container implements Product_decl
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
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EList<Feature> feature;

  /**
   * The cached value of the '{@link #getProduct_reconfiguration() <em>Product reconfiguration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct_reconfiguration()
   * @generated
   * @ordered
   */
  protected EList<Product_reconfiguration> product_reconfiguration;

  /**
   * The cached value of the '{@link #getProduct_expr() <em>Product expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct_expr()
   * @generated
   * @ordered
   */
  protected Product_expr product_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Product_declImpl()
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
    return AbsPackage.Literals.PRODUCT_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeature()
  {
    if (feature == null)
    {
      feature = new EObjectContainmentEList<Feature>(Feature.class, this, AbsPackage.PRODUCT_DECL__FEATURE);
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product_reconfiguration> getProduct_reconfiguration()
  {
    if (product_reconfiguration == null)
    {
      product_reconfiguration = new EObjectContainmentEList<Product_reconfiguration>(Product_reconfiguration.class, this, AbsPackage.PRODUCT_DECL__PRODUCT_RECONFIGURATION);
    }
    return product_reconfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_expr getProduct_expr()
  {
    return product_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProduct_expr(Product_expr newProduct_expr, NotificationChain msgs)
  {
    Product_expr oldProduct_expr = product_expr;
    product_expr = newProduct_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_DECL__PRODUCT_EXPR, oldProduct_expr, newProduct_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProduct_expr(Product_expr newProduct_expr)
  {
    if (newProduct_expr != product_expr)
    {
      NotificationChain msgs = null;
      if (product_expr != null)
        msgs = ((InternalEObject)product_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PRODUCT_DECL__PRODUCT_EXPR, null, msgs);
      if (newProduct_expr != null)
        msgs = ((InternalEObject)newProduct_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PRODUCT_DECL__PRODUCT_EXPR, null, msgs);
      msgs = basicSetProduct_expr(newProduct_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_DECL__PRODUCT_EXPR, newProduct_expr, newProduct_expr));
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
      case AbsPackage.PRODUCT_DECL__FEATURE:
        return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
      case AbsPackage.PRODUCT_DECL__PRODUCT_RECONFIGURATION:
        return ((InternalEList<?>)getProduct_reconfiguration()).basicRemove(otherEnd, msgs);
      case AbsPackage.PRODUCT_DECL__PRODUCT_EXPR:
        return basicSetProduct_expr(null, msgs);
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
      case AbsPackage.PRODUCT_DECL__NAME:
        return getName();
      case AbsPackage.PRODUCT_DECL__FEATURE:
        return getFeature();
      case AbsPackage.PRODUCT_DECL__PRODUCT_RECONFIGURATION:
        return getProduct_reconfiguration();
      case AbsPackage.PRODUCT_DECL__PRODUCT_EXPR:
        return getProduct_expr();
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
      case AbsPackage.PRODUCT_DECL__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.PRODUCT_DECL__FEATURE:
        getFeature().clear();
        getFeature().addAll((Collection<? extends Feature>)newValue);
        return;
      case AbsPackage.PRODUCT_DECL__PRODUCT_RECONFIGURATION:
        getProduct_reconfiguration().clear();
        getProduct_reconfiguration().addAll((Collection<? extends Product_reconfiguration>)newValue);
        return;
      case AbsPackage.PRODUCT_DECL__PRODUCT_EXPR:
        setProduct_expr((Product_expr)newValue);
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
      case AbsPackage.PRODUCT_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.PRODUCT_DECL__FEATURE:
        getFeature().clear();
        return;
      case AbsPackage.PRODUCT_DECL__PRODUCT_RECONFIGURATION:
        getProduct_reconfiguration().clear();
        return;
      case AbsPackage.PRODUCT_DECL__PRODUCT_EXPR:
        setProduct_expr((Product_expr)null);
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
      case AbsPackage.PRODUCT_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.PRODUCT_DECL__FEATURE:
        return feature != null && !feature.isEmpty();
      case AbsPackage.PRODUCT_DECL__PRODUCT_RECONFIGURATION:
        return product_reconfiguration != null && !product_reconfiguration.isEmpty();
      case AbsPackage.PRODUCT_DECL__PRODUCT_EXPR:
        return product_expr != null;
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
    result.append(')');
    return result.toString();
  }

} //Product_declImpl
