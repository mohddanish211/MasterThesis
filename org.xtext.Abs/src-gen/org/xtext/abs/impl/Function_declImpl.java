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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Function_decl;
import org.xtext.abs.Param_list;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Type_use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Function_declImpl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Function_declImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Function_declImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Function_declImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Function_declImpl#getParamlist <em>Paramlist</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Function_declImpl#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Function_declImpl extends DeclImpl implements Function_decl
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
   * The default value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected static final String LT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected String lt = LT_EDEFAULT;

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
   * The default value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected static final String GT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected String gt = GT_EDEFAULT;

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
   * The cached value of the '{@link #getPure_exp() <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp()
   * @generated
   * @ordered
   */
  protected Pure_exp pure_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Function_declImpl()
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
    return AbsPackage.Literals.FUNCTION_DECL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__TYPE_USE, oldType_use, newType_use);
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
        msgs = ((InternalEObject)type_use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FUNCTION_DECL__TYPE_USE, null, msgs);
      if (newType_use != null)
        msgs = ((InternalEObject)newType_use).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FUNCTION_DECL__TYPE_USE, null, msgs);
      msgs = basicSetType_use(newType_use, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__TYPE_USE, newType_use, newType_use));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLt()
  {
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLt(String newLt)
  {
    String oldLt = lt;
    lt = newLt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__LT, oldLt, lt));
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
      importedNamespace = new EDataTypeEList<String>(String.class, this, AbsPackage.FUNCTION_DECL__IMPORTED_NAMESPACE);
    }
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGt()
  {
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGt(String newGt)
  {
    String oldGt = gt;
    gt = newGt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__GT, oldGt, gt));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__PARAMLIST, oldParamlist, newParamlist);
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
        msgs = ((InternalEObject)paramlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FUNCTION_DECL__PARAMLIST, null, msgs);
      if (newParamlist != null)
        msgs = ((InternalEObject)newParamlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FUNCTION_DECL__PARAMLIST, null, msgs);
      msgs = basicSetParamlist(newParamlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__PARAMLIST, newParamlist, newParamlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getPure_exp()
  {
    return pure_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPure_exp(Pure_exp newPure_exp, NotificationChain msgs)
  {
    Pure_exp oldPure_exp = pure_exp;
    pure_exp = newPure_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__PURE_EXP, oldPure_exp, newPure_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPure_exp(Pure_exp newPure_exp)
  {
    if (newPure_exp != pure_exp)
    {
      NotificationChain msgs = null;
      if (pure_exp != null)
        msgs = ((InternalEObject)pure_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FUNCTION_DECL__PURE_EXP, null, msgs);
      if (newPure_exp != null)
        msgs = ((InternalEObject)newPure_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FUNCTION_DECL__PURE_EXP, null, msgs);
      msgs = basicSetPure_exp(newPure_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FUNCTION_DECL__PURE_EXP, newPure_exp, newPure_exp));
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
      case AbsPackage.FUNCTION_DECL__TYPE_USE:
        return basicSetType_use(null, msgs);
      case AbsPackage.FUNCTION_DECL__PARAMLIST:
        return basicSetParamlist(null, msgs);
      case AbsPackage.FUNCTION_DECL__PURE_EXP:
        return basicSetPure_exp(null, msgs);
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
      case AbsPackage.FUNCTION_DECL__TYPE_USE:
        return getType_use();
      case AbsPackage.FUNCTION_DECL__LT:
        return getLt();
      case AbsPackage.FUNCTION_DECL__IMPORTED_NAMESPACE:
        return getImportedNamespace();
      case AbsPackage.FUNCTION_DECL__GT:
        return getGt();
      case AbsPackage.FUNCTION_DECL__PARAMLIST:
        return getParamlist();
      case AbsPackage.FUNCTION_DECL__PURE_EXP:
        return getPure_exp();
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
      case AbsPackage.FUNCTION_DECL__TYPE_USE:
        setType_use((Type_use)newValue);
        return;
      case AbsPackage.FUNCTION_DECL__LT:
        setLt((String)newValue);
        return;
      case AbsPackage.FUNCTION_DECL__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
        getImportedNamespace().addAll((Collection<? extends String>)newValue);
        return;
      case AbsPackage.FUNCTION_DECL__GT:
        setGt((String)newValue);
        return;
      case AbsPackage.FUNCTION_DECL__PARAMLIST:
        setParamlist((Param_list)newValue);
        return;
      case AbsPackage.FUNCTION_DECL__PURE_EXP:
        setPure_exp((Pure_exp)newValue);
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
      case AbsPackage.FUNCTION_DECL__TYPE_USE:
        setType_use((Type_use)null);
        return;
      case AbsPackage.FUNCTION_DECL__LT:
        setLt(LT_EDEFAULT);
        return;
      case AbsPackage.FUNCTION_DECL__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
        return;
      case AbsPackage.FUNCTION_DECL__GT:
        setGt(GT_EDEFAULT);
        return;
      case AbsPackage.FUNCTION_DECL__PARAMLIST:
        setParamlist((Param_list)null);
        return;
      case AbsPackage.FUNCTION_DECL__PURE_EXP:
        setPure_exp((Pure_exp)null);
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
      case AbsPackage.FUNCTION_DECL__TYPE_USE:
        return type_use != null;
      case AbsPackage.FUNCTION_DECL__LT:
        return LT_EDEFAULT == null ? lt != null : !LT_EDEFAULT.equals(lt);
      case AbsPackage.FUNCTION_DECL__IMPORTED_NAMESPACE:
        return importedNamespace != null && !importedNamespace.isEmpty();
      case AbsPackage.FUNCTION_DECL__GT:
        return GT_EDEFAULT == null ? gt != null : !GT_EDEFAULT.equals(gt);
      case AbsPackage.FUNCTION_DECL__PARAMLIST:
        return paramlist != null;
      case AbsPackage.FUNCTION_DECL__PURE_EXP:
        return pure_exp != null;
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
    result.append(" (lt: ");
    result.append(lt);
    result.append(", importedNamespace: ");
    result.append(importedNamespace);
    result.append(", gt: ");
    result.append(gt);
    result.append(')');
    return result.toString();
  }

} //Function_declImpl
