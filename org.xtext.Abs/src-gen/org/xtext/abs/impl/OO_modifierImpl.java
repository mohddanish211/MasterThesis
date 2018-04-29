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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Class_decl;
import org.xtext.abs.Class_modifier_fragment;
import org.xtext.abs.Interface_decl;
import org.xtext.abs.Interface_modifier_fragment;
import org.xtext.abs.OO_modifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getClass_decl <em>Class decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getInterface_decl <em>Interface decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getInteface <em>Inteface</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getRemovedInterface <em>Removed Interface</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getClass_modifier_fragment <em>Class modifier fragment</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.xtext.abs.impl.OO_modifierImpl#getInterface_modifier_fragment <em>Interface modifier fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OO_modifierImpl extends Module_modifierImpl implements OO_modifier
{
  /**
   * The cached value of the '{@link #getClass_decl() <em>Class decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_decl()
   * @generated
   * @ordered
   */
  protected Class_decl class_decl;

  /**
   * The cached value of the '{@link #getInterface_decl() <em>Interface decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface_decl()
   * @generated
   * @ordered
   */
  protected Interface_decl interface_decl;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected Class_decl class_;

  /**
   * The cached value of the '{@link #getInteface() <em>Inteface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteface()
   * @generated
   * @ordered
   */
  protected Interface_decl inteface;

  /**
   * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
  protected EList<Interface_decl> interfaceName;

  /**
   * The cached value of the '{@link #getRemovedInterface() <em>Removed Interface</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemovedInterface()
   * @generated
   * @ordered
   */
  protected EList<Interface_decl> removedInterface;

  /**
   * The cached value of the '{@link #getClass_modifier_fragment() <em>Class modifier fragment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_modifier_fragment()
   * @generated
   * @ordered
   */
  protected EList<Class_modifier_fragment> class_modifier_fragment;

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
   * The cached value of the '{@link #getInterface_modifier_fragment() <em>Interface modifier fragment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface_modifier_fragment()
   * @generated
   * @ordered
   */
  protected EList<Interface_modifier_fragment> interface_modifier_fragment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OO_modifierImpl()
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
    return AbsPackage.Literals.OO_MODIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_decl getClass_decl()
  {
    return class_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass_decl(Class_decl newClass_decl, NotificationChain msgs)
  {
    Class_decl oldClass_decl = class_decl;
    class_decl = newClass_decl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.OO_MODIFIER__CLASS_DECL, oldClass_decl, newClass_decl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass_decl(Class_decl newClass_decl)
  {
    if (newClass_decl != class_decl)
    {
      NotificationChain msgs = null;
      if (class_decl != null)
        msgs = ((InternalEObject)class_decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.OO_MODIFIER__CLASS_DECL, null, msgs);
      if (newClass_decl != null)
        msgs = ((InternalEObject)newClass_decl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.OO_MODIFIER__CLASS_DECL, null, msgs);
      msgs = basicSetClass_decl(newClass_decl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OO_MODIFIER__CLASS_DECL, newClass_decl, newClass_decl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl getInterface_decl()
  {
    return interface_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterface_decl(Interface_decl newInterface_decl, NotificationChain msgs)
  {
    Interface_decl oldInterface_decl = interface_decl;
    interface_decl = newInterface_decl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.OO_MODIFIER__INTERFACE_DECL, oldInterface_decl, newInterface_decl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface_decl(Interface_decl newInterface_decl)
  {
    if (newInterface_decl != interface_decl)
    {
      NotificationChain msgs = null;
      if (interface_decl != null)
        msgs = ((InternalEObject)interface_decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.OO_MODIFIER__INTERFACE_DECL, null, msgs);
      if (newInterface_decl != null)
        msgs = ((InternalEObject)newInterface_decl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.OO_MODIFIER__INTERFACE_DECL, null, msgs);
      msgs = basicSetInterface_decl(newInterface_decl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OO_MODIFIER__INTERFACE_DECL, newInterface_decl, newInterface_decl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_decl getClass_()
  {
    if (class_ != null && class_.eIsProxy())
    {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (Class_decl)eResolveProxy(oldClass);
      if (class_ != oldClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.OO_MODIFIER__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_decl basicGetClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(Class_decl newClass)
  {
    Class_decl oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OO_MODIFIER__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl getInteface()
  {
    if (inteface != null && inteface.eIsProxy())
    {
      InternalEObject oldInteface = (InternalEObject)inteface;
      inteface = (Interface_decl)eResolveProxy(oldInteface);
      if (inteface != oldInteface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.OO_MODIFIER__INTEFACE, oldInteface, inteface));
      }
    }
    return inteface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl basicGetInteface()
  {
    return inteface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteface(Interface_decl newInteface)
  {
    Interface_decl oldInteface = inteface;
    inteface = newInteface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OO_MODIFIER__INTEFACE, oldInteface, inteface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface_decl> getInterfaceName()
  {
    if (interfaceName == null)
    {
      interfaceName = new EObjectContainmentEList<Interface_decl>(Interface_decl.class, this, AbsPackage.OO_MODIFIER__INTERFACE_NAME);
    }
    return interfaceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface_decl> getRemovedInterface()
  {
    if (removedInterface == null)
    {
      removedInterface = new EObjectResolvingEList<Interface_decl>(Interface_decl.class, this, AbsPackage.OO_MODIFIER__REMOVED_INTERFACE);
    }
    return removedInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Class_modifier_fragment> getClass_modifier_fragment()
  {
    if (class_modifier_fragment == null)
    {
      class_modifier_fragment = new EObjectContainmentEList<Class_modifier_fragment>(Class_modifier_fragment.class, this, AbsPackage.OO_MODIFIER__CLASS_MODIFIER_FRAGMENT);
    }
    return class_modifier_fragment;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.OO_MODIFIER__INTERFACE, oldInterface, interface_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.OO_MODIFIER__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface_modifier_fragment> getInterface_modifier_fragment()
  {
    if (interface_modifier_fragment == null)
    {
      interface_modifier_fragment = new EObjectContainmentEList<Interface_modifier_fragment>(Interface_modifier_fragment.class, this, AbsPackage.OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT);
    }
    return interface_modifier_fragment;
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
      case AbsPackage.OO_MODIFIER__CLASS_DECL:
        return basicSetClass_decl(null, msgs);
      case AbsPackage.OO_MODIFIER__INTERFACE_DECL:
        return basicSetInterface_decl(null, msgs);
      case AbsPackage.OO_MODIFIER__INTERFACE_NAME:
        return ((InternalEList<?>)getInterfaceName()).basicRemove(otherEnd, msgs);
      case AbsPackage.OO_MODIFIER__CLASS_MODIFIER_FRAGMENT:
        return ((InternalEList<?>)getClass_modifier_fragment()).basicRemove(otherEnd, msgs);
      case AbsPackage.OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT:
        return ((InternalEList<?>)getInterface_modifier_fragment()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.OO_MODIFIER__CLASS_DECL:
        return getClass_decl();
      case AbsPackage.OO_MODIFIER__INTERFACE_DECL:
        return getInterface_decl();
      case AbsPackage.OO_MODIFIER__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case AbsPackage.OO_MODIFIER__INTEFACE:
        if (resolve) return getInteface();
        return basicGetInteface();
      case AbsPackage.OO_MODIFIER__INTERFACE_NAME:
        return getInterfaceName();
      case AbsPackage.OO_MODIFIER__REMOVED_INTERFACE:
        return getRemovedInterface();
      case AbsPackage.OO_MODIFIER__CLASS_MODIFIER_FRAGMENT:
        return getClass_modifier_fragment();
      case AbsPackage.OO_MODIFIER__INTERFACE:
        if (resolve) return getInterface();
        return basicGetInterface();
      case AbsPackage.OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT:
        return getInterface_modifier_fragment();
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
      case AbsPackage.OO_MODIFIER__CLASS_DECL:
        setClass_decl((Class_decl)newValue);
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE_DECL:
        setInterface_decl((Interface_decl)newValue);
        return;
      case AbsPackage.OO_MODIFIER__CLASS:
        setClass((Class_decl)newValue);
        return;
      case AbsPackage.OO_MODIFIER__INTEFACE:
        setInteface((Interface_decl)newValue);
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE_NAME:
        getInterfaceName().clear();
        getInterfaceName().addAll((Collection<? extends Interface_decl>)newValue);
        return;
      case AbsPackage.OO_MODIFIER__REMOVED_INTERFACE:
        getRemovedInterface().clear();
        getRemovedInterface().addAll((Collection<? extends Interface_decl>)newValue);
        return;
      case AbsPackage.OO_MODIFIER__CLASS_MODIFIER_FRAGMENT:
        getClass_modifier_fragment().clear();
        getClass_modifier_fragment().addAll((Collection<? extends Class_modifier_fragment>)newValue);
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE:
        setInterface((Interface_decl)newValue);
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT:
        getInterface_modifier_fragment().clear();
        getInterface_modifier_fragment().addAll((Collection<? extends Interface_modifier_fragment>)newValue);
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
      case AbsPackage.OO_MODIFIER__CLASS_DECL:
        setClass_decl((Class_decl)null);
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE_DECL:
        setInterface_decl((Interface_decl)null);
        return;
      case AbsPackage.OO_MODIFIER__CLASS:
        setClass((Class_decl)null);
        return;
      case AbsPackage.OO_MODIFIER__INTEFACE:
        setInteface((Interface_decl)null);
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE_NAME:
        getInterfaceName().clear();
        return;
      case AbsPackage.OO_MODIFIER__REMOVED_INTERFACE:
        getRemovedInterface().clear();
        return;
      case AbsPackage.OO_MODIFIER__CLASS_MODIFIER_FRAGMENT:
        getClass_modifier_fragment().clear();
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE:
        setInterface((Interface_decl)null);
        return;
      case AbsPackage.OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT:
        getInterface_modifier_fragment().clear();
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
      case AbsPackage.OO_MODIFIER__CLASS_DECL:
        return class_decl != null;
      case AbsPackage.OO_MODIFIER__INTERFACE_DECL:
        return interface_decl != null;
      case AbsPackage.OO_MODIFIER__CLASS:
        return class_ != null;
      case AbsPackage.OO_MODIFIER__INTEFACE:
        return inteface != null;
      case AbsPackage.OO_MODIFIER__INTERFACE_NAME:
        return interfaceName != null && !interfaceName.isEmpty();
      case AbsPackage.OO_MODIFIER__REMOVED_INTERFACE:
        return removedInterface != null && !removedInterface.isEmpty();
      case AbsPackage.OO_MODIFIER__CLASS_MODIFIER_FRAGMENT:
        return class_modifier_fragment != null && !class_modifier_fragment.isEmpty();
      case AbsPackage.OO_MODIFIER__INTERFACE:
        return interface_ != null;
      case AbsPackage.OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT:
        return interface_modifier_fragment != null && !interface_modifier_fragment.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OO_modifierImpl
