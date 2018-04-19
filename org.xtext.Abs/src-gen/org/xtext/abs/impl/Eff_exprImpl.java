/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Delta_id;
import org.xtext.abs.Eff_expr;
import org.xtext.abs.Pure_exp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eff expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getO <em>O</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getM <em>M</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Eff_exprImpl#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Eff_exprImpl extends ExpImpl implements Eff_expr
{
  /**
   * The default value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected static final String L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected String l = L_EDEFAULT;

  /**
   * The default value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected static final String C_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected String c = C_EDEFAULT;

  /**
   * The default value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected static final String A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected String a = A_EDEFAULT;

  /**
   * The cached value of the '{@link #getO() <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected Pure_exp o;

  /**
   * The default value of the '{@link #getM() <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected static final String M_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected String m = M_EDEFAULT;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected Delta_id d;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Eff_exprImpl()
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
    return AbsPackage.Literals.EFF_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(String newL)
  {
    String oldL = l;
    l = newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(String newC)
  {
    String oldC = c;
    c = newC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__C, oldC, c));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(String newA)
  {
    String oldA = a;
    a = newA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__A, oldA, a));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getO()
  {
    return o;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetO(Pure_exp newO, NotificationChain msgs)
  {
    Pure_exp oldO = o;
    o = newO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__O, oldO, newO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO(Pure_exp newO)
  {
    if (newO != o)
    {
      NotificationChain msgs = null;
      if (o != null)
        msgs = ((InternalEObject)o).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EFF_EXPR__O, null, msgs);
      if (newO != null)
        msgs = ((InternalEObject)newO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EFF_EXPR__O, null, msgs);
      msgs = basicSetO(newO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__O, newO, newO));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(String newM)
  {
    String oldM = m;
    m = newM;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__M, oldM, m));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_id getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(Delta_id newD, NotificationChain msgs)
  {
    Delta_id oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(Delta_id newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EFF_EXPR__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EFF_EXPR__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EFF_EXPR__D, newD, newD));
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
      case AbsPackage.EFF_EXPR__O:
        return basicSetO(null, msgs);
      case AbsPackage.EFF_EXPR__D:
        return basicSetD(null, msgs);
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
      case AbsPackage.EFF_EXPR__L:
        return getL();
      case AbsPackage.EFF_EXPR__C:
        return getC();
      case AbsPackage.EFF_EXPR__A:
        return getA();
      case AbsPackage.EFF_EXPR__O:
        return getO();
      case AbsPackage.EFF_EXPR__M:
        return getM();
      case AbsPackage.EFF_EXPR__D:
        return getD();
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
      case AbsPackage.EFF_EXPR__L:
        setL((String)newValue);
        return;
      case AbsPackage.EFF_EXPR__C:
        setC((String)newValue);
        return;
      case AbsPackage.EFF_EXPR__A:
        setA((String)newValue);
        return;
      case AbsPackage.EFF_EXPR__O:
        setO((Pure_exp)newValue);
        return;
      case AbsPackage.EFF_EXPR__M:
        setM((String)newValue);
        return;
      case AbsPackage.EFF_EXPR__D:
        setD((Delta_id)newValue);
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
      case AbsPackage.EFF_EXPR__L:
        setL(L_EDEFAULT);
        return;
      case AbsPackage.EFF_EXPR__C:
        setC(C_EDEFAULT);
        return;
      case AbsPackage.EFF_EXPR__A:
        setA(A_EDEFAULT);
        return;
      case AbsPackage.EFF_EXPR__O:
        setO((Pure_exp)null);
        return;
      case AbsPackage.EFF_EXPR__M:
        setM(M_EDEFAULT);
        return;
      case AbsPackage.EFF_EXPR__D:
        setD((Delta_id)null);
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
      case AbsPackage.EFF_EXPR__L:
        return L_EDEFAULT == null ? l != null : !L_EDEFAULT.equals(l);
      case AbsPackage.EFF_EXPR__C:
        return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
      case AbsPackage.EFF_EXPR__A:
        return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
      case AbsPackage.EFF_EXPR__O:
        return o != null;
      case AbsPackage.EFF_EXPR__M:
        return M_EDEFAULT == null ? m != null : !M_EDEFAULT.equals(m);
      case AbsPackage.EFF_EXPR__D:
        return d != null;
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
    result.append(" (l: ");
    result.append(l);
    result.append(", c: ");
    result.append(c);
    result.append(", a: ");
    result.append(a);
    result.append(", m: ");
    result.append(m);
    result.append(')');
    return result.toString();
  }

} //Eff_exprImpl
