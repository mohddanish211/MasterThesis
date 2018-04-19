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
import org.xtext.abs.Exp;
import org.xtext.abs.Object_update_assign_stmt;
import org.xtext.abs.Var_or_field_ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object update assign stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Object_update_assign_stmtImpl#getVar_or_field_ref <em>Var or field ref</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Object_update_assign_stmtImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Object_update_assign_stmtImpl extends MinimalEObjectImpl.Container implements Object_update_assign_stmt
{
  /**
   * The cached value of the '{@link #getVar_or_field_ref() <em>Var or field ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar_or_field_ref()
   * @generated
   * @ordered
   */
  protected Var_or_field_ref var_or_field_ref;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Exp exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Object_update_assign_stmtImpl()
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
    return AbsPackage.Literals.OBJECT_UPDATE_ASSIGN_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_or_field_ref getVar_or_field_ref()
  {
    if (var_or_field_ref != null && var_or_field_ref.eIsProxy())
    {
      InternalEObject oldVar_or_field_ref = (InternalEObject)var_or_field_ref;
      var_or_field_ref = (Var_or_field_ref)eResolveProxy(oldVar_or_field_ref);
      if (var_or_field_ref != oldVar_or_field_ref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF, oldVar_or_field_ref, var_or_field_ref));
      }
    }
    return var_or_field_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_or_field_ref basicGetVar_or_field_ref()
  {
    return var_or_field_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar_or_field_ref(Var_or_field_ref newVar_or_field_ref)
  {
    Var_or_field_ref oldVar_or_field_ref = var_or_field_ref;
    var_or_field_ref = newVar_or_field_ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF, oldVar_or_field_ref, var_or_field_ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Exp newExp, NotificationChain msgs)
  {
    Exp oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Exp newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP, newExp, newExp));
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
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP:
        return basicSetExp(null, msgs);
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
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF:
        if (resolve) return getVar_or_field_ref();
        return basicGetVar_or_field_ref();
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP:
        return getExp();
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
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF:
        setVar_or_field_ref((Var_or_field_ref)newValue);
        return;
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP:
        setExp((Exp)newValue);
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
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF:
        setVar_or_field_ref((Var_or_field_ref)null);
        return;
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP:
        setExp((Exp)null);
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
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF:
        return var_or_field_ref != null;
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //Object_update_assign_stmtImpl
