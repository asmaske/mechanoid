/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Table Contraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UniqueTableContraintImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UniqueTableContraintImpl#getConflictClause <em>Conflict Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniqueTableContraintImpl extends TableConstraintImpl implements UniqueTableContraint
{
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<IndexedColumn> columns;

  /**
   * The cached value of the '{@link #getConflictClause() <em>Conflict Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflictClause()
   * @generated
   * @ordered
   */
  protected ConflictClause conflictClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UniqueTableContraintImpl()
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
    return SqliteModelPackage.Literals.UNIQUE_TABLE_CONTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IndexedColumn> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<IndexedColumn>(IndexedColumn.class, this, SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictClause getConflictClause()
  {
    return conflictClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConflictClause(ConflictClause newConflictClause, NotificationChain msgs)
  {
    ConflictClause oldConflictClause = conflictClause;
    conflictClause = newConflictClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE, oldConflictClause, newConflictClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConflictClause(ConflictClause newConflictClause)
  {
    if (newConflictClause != conflictClause)
    {
      NotificationChain msgs = null;
      if (conflictClause != null)
        msgs = ((InternalEObject)conflictClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE, null, msgs);
      if (newConflictClause != null)
        msgs = ((InternalEObject)newConflictClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE, null, msgs);
      msgs = basicSetConflictClause(newConflictClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE, newConflictClause, newConflictClause));
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
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE:
        return basicSetConflictClause(null, msgs);
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
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__COLUMNS:
        return getColumns();
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE:
        return getConflictClause();
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
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends IndexedColumn>)newValue);
        return;
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE:
        setConflictClause((ConflictClause)newValue);
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
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__COLUMNS:
        getColumns().clear();
        return;
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE:
        setConflictClause((ConflictClause)null);
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
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__COLUMNS:
        return columns != null && !columns.isEmpty();
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE:
        return conflictClause != null;
    }
    return super.eIsSet(featureID);
  }

} //UniqueTableContraintImpl
