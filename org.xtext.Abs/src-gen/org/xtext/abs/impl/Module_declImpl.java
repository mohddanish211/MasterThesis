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
import org.xtext.abs.Decl;
import org.xtext.abs.Main_block;
import org.xtext.abs.Module_decl;
import org.xtext.abs.Module_export;
import org.xtext.abs.Module_import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Module_declImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Module_declImpl#getModule_export <em>Module export</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Module_declImpl#getModule_import <em>Module import</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Module_declImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Module_declImpl#getMain_block <em>Main block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Module_declImpl extends MinimalEObjectImpl.Container implements Module_decl
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
   * The cached value of the '{@link #getModule_export() <em>Module export</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule_export()
   * @generated
   * @ordered
   */
  protected EList<Module_export> module_export;

  /**
   * The cached value of the '{@link #getModule_import() <em>Module import</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule_import()
   * @generated
   * @ordered
   */
  protected EList<Module_import> module_import;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected EList<Decl> decl;

  /**
   * The cached value of the '{@link #getMain_block() <em>Main block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain_block()
   * @generated
   * @ordered
   */
  protected EList<Main_block> main_block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Module_declImpl()
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
    return AbsPackage.Literals.MODULE_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.MODULE_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module_export> getModule_export()
  {
    if (module_export == null)
    {
      module_export = new EObjectContainmentEList<Module_export>(Module_export.class, this, AbsPackage.MODULE_DECL__MODULE_EXPORT);
    }
    return module_export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module_import> getModule_import()
  {
    if (module_import == null)
    {
      module_import = new EObjectContainmentEList<Module_import>(Module_import.class, this, AbsPackage.MODULE_DECL__MODULE_IMPORT);
    }
    return module_import;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decl> getDecl()
  {
    if (decl == null)
    {
      decl = new EObjectContainmentEList<Decl>(Decl.class, this, AbsPackage.MODULE_DECL__DECL);
    }
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Main_block> getMain_block()
  {
    if (main_block == null)
    {
      main_block = new EObjectContainmentEList<Main_block>(Main_block.class, this, AbsPackage.MODULE_DECL__MAIN_BLOCK);
    }
    return main_block;
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
      case AbsPackage.MODULE_DECL__MODULE_EXPORT:
        return ((InternalEList<?>)getModule_export()).basicRemove(otherEnd, msgs);
      case AbsPackage.MODULE_DECL__MODULE_IMPORT:
        return ((InternalEList<?>)getModule_import()).basicRemove(otherEnd, msgs);
      case AbsPackage.MODULE_DECL__DECL:
        return ((InternalEList<?>)getDecl()).basicRemove(otherEnd, msgs);
      case AbsPackage.MODULE_DECL__MAIN_BLOCK:
        return ((InternalEList<?>)getMain_block()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.MODULE_DECL__NAME:
        return getName();
      case AbsPackage.MODULE_DECL__MODULE_EXPORT:
        return getModule_export();
      case AbsPackage.MODULE_DECL__MODULE_IMPORT:
        return getModule_import();
      case AbsPackage.MODULE_DECL__DECL:
        return getDecl();
      case AbsPackage.MODULE_DECL__MAIN_BLOCK:
        return getMain_block();
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
      case AbsPackage.MODULE_DECL__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.MODULE_DECL__MODULE_EXPORT:
        getModule_export().clear();
        getModule_export().addAll((Collection<? extends Module_export>)newValue);
        return;
      case AbsPackage.MODULE_DECL__MODULE_IMPORT:
        getModule_import().clear();
        getModule_import().addAll((Collection<? extends Module_import>)newValue);
        return;
      case AbsPackage.MODULE_DECL__DECL:
        getDecl().clear();
        getDecl().addAll((Collection<? extends Decl>)newValue);
        return;
      case AbsPackage.MODULE_DECL__MAIN_BLOCK:
        getMain_block().clear();
        getMain_block().addAll((Collection<? extends Main_block>)newValue);
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
      case AbsPackage.MODULE_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.MODULE_DECL__MODULE_EXPORT:
        getModule_export().clear();
        return;
      case AbsPackage.MODULE_DECL__MODULE_IMPORT:
        getModule_import().clear();
        return;
      case AbsPackage.MODULE_DECL__DECL:
        getDecl().clear();
        return;
      case AbsPackage.MODULE_DECL__MAIN_BLOCK:
        getMain_block().clear();
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
      case AbsPackage.MODULE_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.MODULE_DECL__MODULE_EXPORT:
        return module_export != null && !module_export.isEmpty();
      case AbsPackage.MODULE_DECL__MODULE_IMPORT:
        return module_import != null && !module_import.isEmpty();
      case AbsPackage.MODULE_DECL__DECL:
        return decl != null && !decl.isEmpty();
      case AbsPackage.MODULE_DECL__MAIN_BLOCK:
        return main_block != null && !main_block.isEmpty();
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

} //Module_declImpl
