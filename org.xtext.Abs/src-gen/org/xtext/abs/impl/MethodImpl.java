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
import org.xtext.abs.Method;
import org.xtext.abs.Param_list;
import org.xtext.abs.Stmt;
import org.xtext.abs.Type_use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.MethodImpl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.MethodImpl#getParamlist <em>Paramlist</em>}</li>
 *   <li>{@link org.xtext.abs.impl.MethodImpl#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method
{
  /**
   * The cached value of the '{@link #getType_use() <em>Type use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_use()
   * @generated
   * @ordered
   */
  protected Type_use type_use;

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
   * The cached value of the '{@link #getParamlist() <em>Paramlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamlist()
   * @generated
   * @ordered
   */
  protected Param_list paramlist;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected EList<Stmt> stmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return AbsPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_use getType_use()
  {
    return type_use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_use(Type_use newType_use, NotificationChain msgs)
  {
    Type_use oldType_use = type_use;
    type_use = newType_use;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.METHOD__TYPE_USE, oldType_use, newType_use);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_use(Type_use newType_use)
  {
    if (newType_use != type_use)
    {
      NotificationChain msgs = null;
      if (type_use != null)
        msgs = ((InternalEObject)type_use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.METHOD__TYPE_USE, null, msgs);
      if (newType_use != null)
        msgs = ((InternalEObject)newType_use).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.METHOD__TYPE_USE, null, msgs);
      msgs = basicSetType_use(newType_use, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.METHOD__TYPE_USE, newType_use, newType_use));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param_list getParamlist()
  {
    return paramlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamlist(Param_list newParamlist, NotificationChain msgs)
  {
    Param_list oldParamlist = paramlist;
    paramlist = newParamlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.METHOD__PARAMLIST, oldParamlist, newParamlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamlist(Param_list newParamlist)
  {
    if (newParamlist != paramlist)
    {
      NotificationChain msgs = null;
      if (paramlist != null)
        msgs = ((InternalEObject)paramlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.METHOD__PARAMLIST, null, msgs);
      if (newParamlist != null)
        msgs = ((InternalEObject)newParamlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.METHOD__PARAMLIST, null, msgs);
      msgs = basicSetParamlist(newParamlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.METHOD__PARAMLIST, newParamlist, newParamlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stmt> getStmt()
  {
    if (stmt == null)
    {
      stmt = new EObjectContainmentEList<Stmt>(Stmt.class, this, AbsPackage.METHOD__STMT);
    }
    return stmt;
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
      case AbsPackage.METHOD__TYPE_USE:
        return basicSetType_use(null, msgs);
      case AbsPackage.METHOD__PARAMLIST:
        return basicSetParamlist(null, msgs);
      case AbsPackage.METHOD__STMT:
        return ((InternalEList<?>)getStmt()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.METHOD__TYPE_USE:
        return getType_use();
      case AbsPackage.METHOD__NAME:
        return getName();
      case AbsPackage.METHOD__PARAMLIST:
        return getParamlist();
      case AbsPackage.METHOD__STMT:
        return getStmt();
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
      case AbsPackage.METHOD__TYPE_USE:
        setType_use((Type_use)newValue);
        return;
      case AbsPackage.METHOD__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.METHOD__PARAMLIST:
        setParamlist((Param_list)newValue);
        return;
      case AbsPackage.METHOD__STMT:
        getStmt().clear();
        getStmt().addAll((Collection<? extends Stmt>)newValue);
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
      case AbsPackage.METHOD__TYPE_USE:
        setType_use((Type_use)null);
        return;
      case AbsPackage.METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.METHOD__PARAMLIST:
        setParamlist((Param_list)null);
        return;
      case AbsPackage.METHOD__STMT:
        getStmt().clear();
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
      case AbsPackage.METHOD__TYPE_USE:
        return type_use != null;
      case AbsPackage.METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.METHOD__PARAMLIST:
        return paramlist != null;
      case AbsPackage.METHOD__STMT:
        return stmt != null && !stmt.isEmpty();
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

} //MethodImpl
