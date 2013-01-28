/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Source Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceTableImpl#getTableReference <em>Table Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleSourceTableImpl extends SelectSourceImpl implements SingleSourceTable
{
  /**
   * The cached value of the '{@link #getTableReference() <em>Table Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableReference()
   * @generated
   * @ordered
   */
  protected CreateTableStatement tableReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleSourceTableImpl()
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
    return SqliteModelPackage.Literals.SINGLE_SOURCE_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTableStatement getTableReference()
  {
    if (tableReference != null && tableReference.eIsProxy())
    {
      InternalEObject oldTableReference = (InternalEObject)tableReference;
      tableReference = (CreateTableStatement)eResolveProxy(oldTableReference);
      if (tableReference != oldTableReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE, oldTableReference, tableReference));
      }
    }
    return tableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTableStatement basicGetTableReference()
  {
    return tableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableReference(CreateTableStatement newTableReference)
  {
    CreateTableStatement oldTableReference = tableReference;
    tableReference = newTableReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE, oldTableReference, tableReference));
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
      case SqliteModelPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        if (resolve) return getTableReference();
        return basicGetTableReference();
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
      case SqliteModelPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        setTableReference((CreateTableStatement)newValue);
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
      case SqliteModelPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        setTableReference((CreateTableStatement)null);
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
      case SqliteModelPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        return tableReference != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleSourceTableImpl
