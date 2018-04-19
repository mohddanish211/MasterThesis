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
import org.xtext.abs.Compilation_Unit;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Fextension;
import org.xtext.abs.Module_decl;
import org.xtext.abs.Product_decl;
import org.xtext.abs.Productline_decl;
import org.xtext.abs.Update_decl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Compilation_UnitImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Compilation_UnitImpl#getDeltaDecl <em>Delta Decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Compilation_UnitImpl#getUpdate_decl <em>Update decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Compilation_UnitImpl#getProductline_decl <em>Productline decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Compilation_UnitImpl#getProduct_decl <em>Product decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Compilation_UnitImpl#getFeature_decl <em>Feature decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Compilation_UnitImpl#getFextension <em>Fextension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Compilation_UnitImpl extends DomainModelImpl implements Compilation_Unit
{
  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected EList<Module_decl> module;

  /**
   * The cached value of the '{@link #getDeltaDecl() <em>Delta Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaDecl()
   * @generated
   * @ordered
   */
  protected EList<Delta_decl> deltaDecl;

  /**
   * The cached value of the '{@link #getUpdate_decl() <em>Update decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate_decl()
   * @generated
   * @ordered
   */
  protected EList<Update_decl> update_decl;

  /**
   * The cached value of the '{@link #getProductline_decl() <em>Productline decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductline_decl()
   * @generated
   * @ordered
   */
  protected Productline_decl productline_decl;

  /**
   * The cached value of the '{@link #getProduct_decl() <em>Product decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct_decl()
   * @generated
   * @ordered
   */
  protected EList<Product_decl> product_decl;

  /**
   * The cached value of the '{@link #getFeature_decl() <em>Feature decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature_decl()
   * @generated
   * @ordered
   */
  protected EList<Feature_decl> feature_decl;

  /**
   * The cached value of the '{@link #getFextension() <em>Fextension</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFextension()
   * @generated
   * @ordered
   */
  protected EList<Fextension> fextension;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Compilation_UnitImpl()
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
    return AbsPackage.Literals.COMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module_decl> getModule()
  {
    if (module == null)
    {
      module = new EObjectContainmentEList<Module_decl>(Module_decl.class, this, AbsPackage.COMPILATION_UNIT__MODULE);
    }
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Delta_decl> getDeltaDecl()
  {
    if (deltaDecl == null)
    {
      deltaDecl = new EObjectContainmentEList<Delta_decl>(Delta_decl.class, this, AbsPackage.COMPILATION_UNIT__DELTA_DECL);
    }
    return deltaDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Update_decl> getUpdate_decl()
  {
    if (update_decl == null)
    {
      update_decl = new EObjectContainmentEList<Update_decl>(Update_decl.class, this, AbsPackage.COMPILATION_UNIT__UPDATE_DECL);
    }
    return update_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Productline_decl getProductline_decl()
  {
    return productline_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProductline_decl(Productline_decl newProductline_decl, NotificationChain msgs)
  {
    Productline_decl oldProductline_decl = productline_decl;
    productline_decl = newProductline_decl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL, oldProductline_decl, newProductline_decl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductline_decl(Productline_decl newProductline_decl)
  {
    if (newProductline_decl != productline_decl)
    {
      NotificationChain msgs = null;
      if (productline_decl != null)
        msgs = ((InternalEObject)productline_decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL, null, msgs);
      if (newProductline_decl != null)
        msgs = ((InternalEObject)newProductline_decl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL, null, msgs);
      msgs = basicSetProductline_decl(newProductline_decl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL, newProductline_decl, newProductline_decl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product_decl> getProduct_decl()
  {
    if (product_decl == null)
    {
      product_decl = new EObjectContainmentEList<Product_decl>(Product_decl.class, this, AbsPackage.COMPILATION_UNIT__PRODUCT_DECL);
    }
    return product_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature_decl> getFeature_decl()
  {
    if (feature_decl == null)
    {
      feature_decl = new EObjectContainmentEList<Feature_decl>(Feature_decl.class, this, AbsPackage.COMPILATION_UNIT__FEATURE_DECL);
    }
    return feature_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fextension> getFextension()
  {
    if (fextension == null)
    {
      fextension = new EObjectContainmentEList<Fextension>(Fextension.class, this, AbsPackage.COMPILATION_UNIT__FEXTENSION);
    }
    return fextension;
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
      case AbsPackage.COMPILATION_UNIT__MODULE:
        return ((InternalEList<?>)getModule()).basicRemove(otherEnd, msgs);
      case AbsPackage.COMPILATION_UNIT__DELTA_DECL:
        return ((InternalEList<?>)getDeltaDecl()).basicRemove(otherEnd, msgs);
      case AbsPackage.COMPILATION_UNIT__UPDATE_DECL:
        return ((InternalEList<?>)getUpdate_decl()).basicRemove(otherEnd, msgs);
      case AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL:
        return basicSetProductline_decl(null, msgs);
      case AbsPackage.COMPILATION_UNIT__PRODUCT_DECL:
        return ((InternalEList<?>)getProduct_decl()).basicRemove(otherEnd, msgs);
      case AbsPackage.COMPILATION_UNIT__FEATURE_DECL:
        return ((InternalEList<?>)getFeature_decl()).basicRemove(otherEnd, msgs);
      case AbsPackage.COMPILATION_UNIT__FEXTENSION:
        return ((InternalEList<?>)getFextension()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.COMPILATION_UNIT__MODULE:
        return getModule();
      case AbsPackage.COMPILATION_UNIT__DELTA_DECL:
        return getDeltaDecl();
      case AbsPackage.COMPILATION_UNIT__UPDATE_DECL:
        return getUpdate_decl();
      case AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL:
        return getProductline_decl();
      case AbsPackage.COMPILATION_UNIT__PRODUCT_DECL:
        return getProduct_decl();
      case AbsPackage.COMPILATION_UNIT__FEATURE_DECL:
        return getFeature_decl();
      case AbsPackage.COMPILATION_UNIT__FEXTENSION:
        return getFextension();
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
      case AbsPackage.COMPILATION_UNIT__MODULE:
        getModule().clear();
        getModule().addAll((Collection<? extends Module_decl>)newValue);
        return;
      case AbsPackage.COMPILATION_UNIT__DELTA_DECL:
        getDeltaDecl().clear();
        getDeltaDecl().addAll((Collection<? extends Delta_decl>)newValue);
        return;
      case AbsPackage.COMPILATION_UNIT__UPDATE_DECL:
        getUpdate_decl().clear();
        getUpdate_decl().addAll((Collection<? extends Update_decl>)newValue);
        return;
      case AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL:
        setProductline_decl((Productline_decl)newValue);
        return;
      case AbsPackage.COMPILATION_UNIT__PRODUCT_DECL:
        getProduct_decl().clear();
        getProduct_decl().addAll((Collection<? extends Product_decl>)newValue);
        return;
      case AbsPackage.COMPILATION_UNIT__FEATURE_DECL:
        getFeature_decl().clear();
        getFeature_decl().addAll((Collection<? extends Feature_decl>)newValue);
        return;
      case AbsPackage.COMPILATION_UNIT__FEXTENSION:
        getFextension().clear();
        getFextension().addAll((Collection<? extends Fextension>)newValue);
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
      case AbsPackage.COMPILATION_UNIT__MODULE:
        getModule().clear();
        return;
      case AbsPackage.COMPILATION_UNIT__DELTA_DECL:
        getDeltaDecl().clear();
        return;
      case AbsPackage.COMPILATION_UNIT__UPDATE_DECL:
        getUpdate_decl().clear();
        return;
      case AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL:
        setProductline_decl((Productline_decl)null);
        return;
      case AbsPackage.COMPILATION_UNIT__PRODUCT_DECL:
        getProduct_decl().clear();
        return;
      case AbsPackage.COMPILATION_UNIT__FEATURE_DECL:
        getFeature_decl().clear();
        return;
      case AbsPackage.COMPILATION_UNIT__FEXTENSION:
        getFextension().clear();
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
      case AbsPackage.COMPILATION_UNIT__MODULE:
        return module != null && !module.isEmpty();
      case AbsPackage.COMPILATION_UNIT__DELTA_DECL:
        return deltaDecl != null && !deltaDecl.isEmpty();
      case AbsPackage.COMPILATION_UNIT__UPDATE_DECL:
        return update_decl != null && !update_decl.isEmpty();
      case AbsPackage.COMPILATION_UNIT__PRODUCTLINE_DECL:
        return productline_decl != null;
      case AbsPackage.COMPILATION_UNIT__PRODUCT_DECL:
        return product_decl != null && !product_decl.isEmpty();
      case AbsPackage.COMPILATION_UNIT__FEATURE_DECL:
        return feature_decl != null && !feature_decl.isEmpty();
      case AbsPackage.COMPILATION_UNIT__FEXTENSION:
        return fextension != null && !fextension.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Compilation_UnitImpl
