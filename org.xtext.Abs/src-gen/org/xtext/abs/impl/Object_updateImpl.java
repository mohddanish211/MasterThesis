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
import org.xtext.abs.Guard;
import org.xtext.abs.Object_update;
import org.xtext.abs.Object_update_assign_stmt;
import org.xtext.abs.Update_preamble_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Object_updateImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Object_updateImpl#getUpdate_preamble_declaration <em>Update preamble declaration</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Object_updateImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Object_updateImpl#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Object_updateImpl extends MinimalEObjectImpl.Container implements Object_update
{
  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Guard guard;

  /**
   * The cached value of the '{@link #getUpdate_preamble_declaration() <em>Update preamble declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate_preamble_declaration()
   * @generated
   * @ordered
   */
  protected EList<Update_preamble_declaration> update_preamble_declaration;

  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected EList<Object_update_assign_stmt> pre;

  /**
   * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPost()
   * @generated
   * @ordered
   */
  protected EList<Object_update_assign_stmt> post;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Object_updateImpl()
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
    return AbsPackage.Literals.OBJECT_UPDATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard getGuard()
  {
    if (guard != null && guard.eIsProxy())
    {
      InternalEObject oldGuard = (InternalEObject)guard;
      guard = (Guard)eResolveProxy(oldGuard);
      if (guard != oldGuard)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.OBJECT_UPDATE__GUARD, oldGuard, guard));
      }
    }
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard basicGetGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(Guard newGuard)
  {
    Guard oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OBJECT_UPDATE__GUARD, oldGuard, guard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Update_preamble_declaration> getUpdate_preamble_declaration()
  {
    if (update_preamble_declaration == null)
    {
      update_preamble_declaration = new EObjectContainmentEList<Update_preamble_declaration>(Update_preamble_declaration.class, this, AbsPackage.OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION);
    }
    return update_preamble_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Object_update_assign_stmt> getPre()
  {
    if (pre == null)
    {
      pre = new EObjectContainmentEList<Object_update_assign_stmt>(Object_update_assign_stmt.class, this, AbsPackage.OBJECT_UPDATE__PRE);
    }
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Object_update_assign_stmt> getPost()
  {
    if (post == null)
    {
      post = new EObjectContainmentEList<Object_update_assign_stmt>(Object_update_assign_stmt.class, this, AbsPackage.OBJECT_UPDATE__POST);
    }
    return post;
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
      case AbsPackage.OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION:
        return ((InternalEList<?>)getUpdate_preamble_declaration()).basicRemove(otherEnd, msgs);
      case AbsPackage.OBJECT_UPDATE__PRE:
        return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
      case AbsPackage.OBJECT_UPDATE__POST:
        return ((InternalEList<?>)getPost()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.OBJECT_UPDATE__GUARD:
        if (resolve) return getGuard();
        return basicGetGuard();
      case AbsPackage.OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION:
        return getUpdate_preamble_declaration();
      case AbsPackage.OBJECT_UPDATE__PRE:
        return getPre();
      case AbsPackage.OBJECT_UPDATE__POST:
        return getPost();
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
      case AbsPackage.OBJECT_UPDATE__GUARD:
        setGuard((Guard)newValue);
        return;
      case AbsPackage.OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION:
        getUpdate_preamble_declaration().clear();
        getUpdate_preamble_declaration().addAll((Collection<? extends Update_preamble_declaration>)newValue);
        return;
      case AbsPackage.OBJECT_UPDATE__PRE:
        getPre().clear();
        getPre().addAll((Collection<? extends Object_update_assign_stmt>)newValue);
        return;
      case AbsPackage.OBJECT_UPDATE__POST:
        getPost().clear();
        getPost().addAll((Collection<? extends Object_update_assign_stmt>)newValue);
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
      case AbsPackage.OBJECT_UPDATE__GUARD:
        setGuard((Guard)null);
        return;
      case AbsPackage.OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION:
        getUpdate_preamble_declaration().clear();
        return;
      case AbsPackage.OBJECT_UPDATE__PRE:
        getPre().clear();
        return;
      case AbsPackage.OBJECT_UPDATE__POST:
        getPost().clear();
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
      case AbsPackage.OBJECT_UPDATE__GUARD:
        return guard != null;
      case AbsPackage.OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION:
        return update_preamble_declaration != null && !update_preamble_declaration.isEmpty();
      case AbsPackage.OBJECT_UPDATE__PRE:
        return pre != null && !pre.isEmpty();
      case AbsPackage.OBJECT_UPDATE__POST:
        return post != null && !post.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Object_updateImpl
