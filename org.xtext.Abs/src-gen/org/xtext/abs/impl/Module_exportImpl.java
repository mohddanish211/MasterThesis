/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Module_export;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Module_exportImpl#getAnyPackage <em>Any Package</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Module_exportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Module_exportImpl extends Namespace_modifierImpl implements Module_export
{
  /**
   * The cached value of the '{@link #getAnyPackage() <em>Any Package</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyPackage()
   * @generated
   * @ordered
   */
  protected EList<String> anyPackage;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected EList<String> importedNamespace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Module_exportImpl()
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
    return AbsPackage.Literals.MODULE_EXPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAnyPackage()
  {
    if (anyPackage == null)
    {
      anyPackage = new EDataTypeEList<String>(String.class, this, AbsPackage.MODULE_EXPORT__ANY_PACKAGE);
    }
    return anyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getImportedNamespace()
  {
    if (importedNamespace == null)
    {
      importedNamespace = new EDataTypeEList<String>(String.class, this, AbsPackage.MODULE_EXPORT__IMPORTED_NAMESPACE);
    }
    return importedNamespace;
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
      case AbsPackage.MODULE_EXPORT__ANY_PACKAGE:
        return getAnyPackage();
      case AbsPackage.MODULE_EXPORT__IMPORTED_NAMESPACE:
        return getImportedNamespace();
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
      case AbsPackage.MODULE_EXPORT__ANY_PACKAGE:
        getAnyPackage().clear();
        getAnyPackage().addAll((Collection<? extends String>)newValue);
        return;
      case AbsPackage.MODULE_EXPORT__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
        getImportedNamespace().addAll((Collection<? extends String>)newValue);
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
      case AbsPackage.MODULE_EXPORT__ANY_PACKAGE:
        getAnyPackage().clear();
        return;
      case AbsPackage.MODULE_EXPORT__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
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
      case AbsPackage.MODULE_EXPORT__ANY_PACKAGE:
        return anyPackage != null && !anyPackage.isEmpty();
      case AbsPackage.MODULE_EXPORT__IMPORTED_NAMESPACE:
        return importedNamespace != null && !importedNamespace.isEmpty();
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
    result.append(" (anyPackage: ");
    result.append(anyPackage);
    result.append(", importedNamespace: ");
    result.append(importedNamespace);
    result.append(')');
    return result.toString();
  }

} //Module_exportImpl
