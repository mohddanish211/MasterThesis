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
 *   <li>{@link org.xtext.abs.impl.Has_conditionImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Has_conditionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Has_conditionImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Has_conditionImpl extends Delta_paramImpl implements Has_condition
{
  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected Field_decl field;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Methodsig method;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected Interface_decl interface_;

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
  public Field_decl getField()
  {
    if (field != null && field.eIsProxy())
    {
      InternalEObject oldField = (InternalEObject)field;
      field = (Field_decl)eResolveProxy(oldField);
      if (field != oldField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.HAS_CONDITION__FIELD, oldField, field));
      }
    }
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_decl basicGetField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(Field_decl newField)
  {
    Field_decl oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.HAS_CONDITION__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig getMethod()
  {
    if (method != null && method.eIsProxy())
    {
      InternalEObject oldMethod = (InternalEObject)method;
      method = (Methodsig)eResolveProxy(oldMethod);
      if (method != oldMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.HAS_CONDITION__METHOD, oldMethod, method));
      }
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig basicGetMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Methodsig newMethod)
  {
    Methodsig oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.HAS_CONDITION__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl getInterface()
  {
    if (interface_ != null && interface_.eIsProxy())
    {
      InternalEObject oldInterface = (InternalEObject)interface_;
      interface_ = (Interface_decl)eResolveProxy(oldInterface);
      if (interface_ != oldInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.HAS_CONDITION__INTERFACE, oldInterface, interface_));
      }
    }
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl basicGetInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(Interface_decl newInterface)
  {
    Interface_decl oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.HAS_CONDITION__INTERFACE, oldInterface, interface_));
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
      case AbsPackage.HAS_CONDITION__FIELD:
        if (resolve) return getField();
        return basicGetField();
      case AbsPackage.HAS_CONDITION__METHOD:
        if (resolve) return getMethod();
        return basicGetMethod();
      case AbsPackage.HAS_CONDITION__INTERFACE:
        if (resolve) return getInterface();
        return basicGetInterface();
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
      case AbsPackage.HAS_CONDITION__FIELD:
        setField((Field_decl)newValue);
        return;
      case AbsPackage.HAS_CONDITION__METHOD:
        setMethod((Methodsig)newValue);
        return;
      case AbsPackage.HAS_CONDITION__INTERFACE:
        setInterface((Interface_decl)newValue);
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
      case AbsPackage.HAS_CONDITION__FIELD:
        setField((Field_decl)null);
        return;
      case AbsPackage.HAS_CONDITION__METHOD:
        setMethod((Methodsig)null);
        return;
      case AbsPackage.HAS_CONDITION__INTERFACE:
        setInterface((Interface_decl)null);
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
      case AbsPackage.HAS_CONDITION__FIELD:
        return field != null;
      case AbsPackage.HAS_CONDITION__METHOD:
        return method != null;
      case AbsPackage.HAS_CONDITION__INTERFACE:
        return interface_ != null;
    }
    return super.eIsSet(featureID);
  }

} //Has_conditionImpl
