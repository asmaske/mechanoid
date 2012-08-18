/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AndExpr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Expression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Literal;
import com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.OrExpr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryComparisonExpr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SecondaryComparisonExpr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Statment;
import com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.TableDecl;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqliteModelPackageImpl extends EPackageImpl implements SqliteModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migrationBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueTableContraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexedColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectCoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conflictClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryComparisonExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secondaryComparisonExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createTableStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createViewStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableRenameClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableAddColumnClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryKeyColumnConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notNullConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalDefaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionDefaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceSelectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultColumnAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultColumnAllWithTableRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultColumnExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentTimeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentDateLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentTimeStampLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum columnTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum conflictResolutionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SqliteModelPackageImpl()
  {
    super(eNS_URI, SqliteModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SqliteModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SqliteModelPackage init()
  {
    if (isInited) return (SqliteModelPackage)EPackage.Registry.INSTANCE.getEPackage(SqliteModelPackage.eNS_URI);

    // Obtain or create and register package
    SqliteModelPackageImpl theSqliteModelPackage = (SqliteModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SqliteModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SqliteModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSqliteModelPackage.createPackageContents();

    // Initialize created meta-data
    theSqliteModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSqliteModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SqliteModelPackage.eNS_URI, theSqliteModelPackage);
    return theSqliteModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_PackageName()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Database()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseBlock()
  {
    return databaseBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseBlock_Name()
  {
    return (EAttribute)databaseBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseBlock_Migrations()
  {
    return (EReference)databaseBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigrationBlock()
  {
    return migrationBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationBlock_Statements()
  {
    return (EReference)migrationBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatment()
  {
    return statmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatment_Name()
  {
    return (EAttribute)statmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableDecl()
  {
    return tableDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableDecl_Name()
  {
    return (EAttribute)tableDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableClause()
  {
    return alterTableClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnDef()
  {
    return columnDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnDef_Name()
  {
    return (EAttribute)columnDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnDef_Type()
  {
    return (EAttribute)columnDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnDef_Constraints()
  {
    return (EReference)columnDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnConstraint()
  {
    return columnConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultValue()
  {
    return defaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableConstraint()
  {
    return tableConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueTableContraint()
  {
    return uniqueTableContraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueTableContraint_Columns()
  {
    return (EReference)uniqueTableContraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueTableContraint_ConflictClause()
  {
    return (EReference)uniqueTableContraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexedColumn()
  {
    return indexedColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexedColumn_Name()
  {
    return (EReference)indexedColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedColumn_Asc()
  {
    return (EAttribute)indexedColumnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedColumn_Desc()
  {
    return (EAttribute)indexedColumnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectStatement()
  {
    return selectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_Core()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectCore()
  {
    return selectCoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectCore_Distinct()
  {
    return (EAttribute)selectCoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectCore_All()
  {
    return (EAttribute)selectCoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_ResultColumns()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_Source()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinSource()
  {
    return joinSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinSource_Source()
  {
    return (EReference)joinSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinSource_JoinStatements()
  {
    return (EReference)joinSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSource()
  {
    return singleSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinStatement()
  {
    return joinStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Natural()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Left()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Outer()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Inner()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Cross()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinStatement_SingleSource()
  {
    return (EReference)joinStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinStatement_Expression()
  {
    return (EReference)joinStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultColumn()
  {
    return resultColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConflictClause()
  {
    return conflictClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConflictClause_Resolution()
  {
    return (EAttribute)conflictClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralValue()
  {
    return literalValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpr()
  {
    return orExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpr_Left()
  {
    return (EReference)orExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpr_Right()
  {
    return (EReference)orExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpr()
  {
    return andExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpr_Left()
  {
    return (EReference)andExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpr_Right()
  {
    return (EReference)andExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryComparisonExpr()
  {
    return primaryComparisonExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryComparisonExpr_Left()
  {
    return (EReference)primaryComparisonExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryComparisonExpr_Op()
  {
    return (EAttribute)primaryComparisonExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryComparisonExpr_Right()
  {
    return (EReference)primaryComparisonExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecondaryComparisonExpr()
  {
    return secondaryComparisonExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecondaryComparisonExpr_Left()
  {
    return (EReference)secondaryComparisonExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryComparisonExpr_Op()
  {
    return (EAttribute)secondaryComparisonExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecondaryComparisonExpr_Right()
  {
    return (EReference)secondaryComparisonExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnLiteral()
  {
    return columnLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnLiteral_Name()
  {
    return (EAttribute)columnLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_LiteralValue()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateTableStatement()
  {
    return createTableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTableStatement_ColumnDefs()
  {
    return (EReference)createTableStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTableStatement_Constraints()
  {
    return (EReference)createTableStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableStatement()
  {
    return alterTableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterTableStatement_Clause()
  {
    return (EReference)alterTableStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateViewStatement()
  {
    return createViewStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateViewStatement_SelectStatement()
  {
    return (EReference)createViewStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableRenameClause()
  {
    return alterTableRenameClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterTableRenameClause_Name()
  {
    return (EAttribute)alterTableRenameClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableAddColumnClause()
  {
    return alterTableAddColumnClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterTableAddColumnClause_ColumnDef()
  {
    return (EReference)alterTableAddColumnClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryKeyColumnConstraint()
  {
    return primaryKeyColumnConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryKeyColumnConstraint_Asc()
  {
    return (EAttribute)primaryKeyColumnConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryKeyColumnConstraint_Desc()
  {
    return (EAttribute)primaryKeyColumnConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryKeyColumnConstraint_Autoincrement()
  {
    return (EAttribute)primaryKeyColumnConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotNullConstraint()
  {
    return notNullConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotNullConstraint_ConflictClause()
  {
    return (EReference)notNullConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultConstraint()
  {
    return defaultConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultConstraint_DefaultValue()
  {
    return (EReference)defaultConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralDefaultValue()
  {
    return literalDefaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralDefaultValue_Literal()
  {
    return (EReference)literalDefaultValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionDefaultValue()
  {
    return expressionDefaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionDefaultValue_Expression()
  {
    return (EReference)expressionDefaultValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSourceTable()
  {
    return singleSourceTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleSourceTable_TableName()
  {
    return (EAttribute)singleSourceTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleSourceTable_Name()
  {
    return (EAttribute)singleSourceTableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSourceSelectStatement()
  {
    return singleSourceSelectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleSourceSelectStatement_SelectStatement()
  {
    return (EReference)singleSourceSelectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSourceJoin()
  {
    return singleSourceJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleSourceJoin_JoinSource()
  {
    return (EReference)singleSourceJoinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultColumnAll()
  {
    return resultColumnAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultColumnAllWithTableRef()
  {
    return resultColumnAllWithTableRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultColumnAllWithTableRef_TableRef()
  {
    return (EAttribute)resultColumnAllWithTableRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultColumnExpression()
  {
    return resultColumnExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResultColumnExpression_Expression()
  {
    return (EReference)resultColumnExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultColumnExpression_Name()
  {
    return (EAttribute)resultColumnExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericLiteral()
  {
    return numericLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericLiteral_Number()
  {
    return (EAttribute)numericLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Literal()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteral()
  {
    return nullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullLiteral_Literal()
  {
    return (EAttribute)nullLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentTimeLiteral()
  {
    return currentTimeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentTimeLiteral_Literal()
  {
    return (EAttribute)currentTimeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentDateLiteral()
  {
    return currentDateLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentDateLiteral_Literal()
  {
    return (EAttribute)currentDateLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentTimeStampLiteral()
  {
    return currentTimeStampLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentTimeStampLiteral_Literal()
  {
    return (EAttribute)currentTimeStampLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColumnType()
  {
    return columnTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConflictResolution()
  {
    return conflictResolutionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelFactory getSqliteModelFactory()
  {
    return (SqliteModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__PACKAGE_NAME);
    createEReference(modelEClass, MODEL__DATABASE);

    databaseBlockEClass = createEClass(DATABASE_BLOCK);
    createEAttribute(databaseBlockEClass, DATABASE_BLOCK__NAME);
    createEReference(databaseBlockEClass, DATABASE_BLOCK__MIGRATIONS);

    migrationBlockEClass = createEClass(MIGRATION_BLOCK);
    createEReference(migrationBlockEClass, MIGRATION_BLOCK__STATEMENTS);

    expressionEClass = createEClass(EXPRESSION);

    statmentEClass = createEClass(STATMENT);
    createEAttribute(statmentEClass, STATMENT__NAME);

    tableDeclEClass = createEClass(TABLE_DECL);
    createEAttribute(tableDeclEClass, TABLE_DECL__NAME);

    alterTableClauseEClass = createEClass(ALTER_TABLE_CLAUSE);

    columnDefEClass = createEClass(COLUMN_DEF);
    createEAttribute(columnDefEClass, COLUMN_DEF__NAME);
    createEAttribute(columnDefEClass, COLUMN_DEF__TYPE);
    createEReference(columnDefEClass, COLUMN_DEF__CONSTRAINTS);

    columnConstraintEClass = createEClass(COLUMN_CONSTRAINT);

    defaultValueEClass = createEClass(DEFAULT_VALUE);

    tableConstraintEClass = createEClass(TABLE_CONSTRAINT);

    uniqueTableContraintEClass = createEClass(UNIQUE_TABLE_CONTRAINT);
    createEReference(uniqueTableContraintEClass, UNIQUE_TABLE_CONTRAINT__COLUMNS);
    createEReference(uniqueTableContraintEClass, UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE);

    indexedColumnEClass = createEClass(INDEXED_COLUMN);
    createEReference(indexedColumnEClass, INDEXED_COLUMN__NAME);
    createEAttribute(indexedColumnEClass, INDEXED_COLUMN__ASC);
    createEAttribute(indexedColumnEClass, INDEXED_COLUMN__DESC);

    selectStatementEClass = createEClass(SELECT_STATEMENT);
    createEReference(selectStatementEClass, SELECT_STATEMENT__CORE);

    selectCoreEClass = createEClass(SELECT_CORE);
    createEAttribute(selectCoreEClass, SELECT_CORE__DISTINCT);
    createEAttribute(selectCoreEClass, SELECT_CORE__ALL);
    createEReference(selectCoreEClass, SELECT_CORE__RESULT_COLUMNS);
    createEReference(selectCoreEClass, SELECT_CORE__SOURCE);

    joinSourceEClass = createEClass(JOIN_SOURCE);
    createEReference(joinSourceEClass, JOIN_SOURCE__SOURCE);
    createEReference(joinSourceEClass, JOIN_SOURCE__JOIN_STATEMENTS);

    singleSourceEClass = createEClass(SINGLE_SOURCE);

    joinStatementEClass = createEClass(JOIN_STATEMENT);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__NATURAL);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__LEFT);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__OUTER);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__INNER);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__CROSS);
    createEReference(joinStatementEClass, JOIN_STATEMENT__SINGLE_SOURCE);
    createEReference(joinStatementEClass, JOIN_STATEMENT__EXPRESSION);

    resultColumnEClass = createEClass(RESULT_COLUMN);

    conflictClauseEClass = createEClass(CONFLICT_CLAUSE);
    createEAttribute(conflictClauseEClass, CONFLICT_CLAUSE__RESOLUTION);

    literalValueEClass = createEClass(LITERAL_VALUE);

    orExprEClass = createEClass(OR_EXPR);
    createEReference(orExprEClass, OR_EXPR__LEFT);
    createEReference(orExprEClass, OR_EXPR__RIGHT);

    andExprEClass = createEClass(AND_EXPR);
    createEReference(andExprEClass, AND_EXPR__LEFT);
    createEReference(andExprEClass, AND_EXPR__RIGHT);

    primaryComparisonExprEClass = createEClass(PRIMARY_COMPARISON_EXPR);
    createEReference(primaryComparisonExprEClass, PRIMARY_COMPARISON_EXPR__LEFT);
    createEAttribute(primaryComparisonExprEClass, PRIMARY_COMPARISON_EXPR__OP);
    createEReference(primaryComparisonExprEClass, PRIMARY_COMPARISON_EXPR__RIGHT);

    secondaryComparisonExprEClass = createEClass(SECONDARY_COMPARISON_EXPR);
    createEReference(secondaryComparisonExprEClass, SECONDARY_COMPARISON_EXPR__LEFT);
    createEAttribute(secondaryComparisonExprEClass, SECONDARY_COMPARISON_EXPR__OP);
    createEReference(secondaryComparisonExprEClass, SECONDARY_COMPARISON_EXPR__RIGHT);

    columnLiteralEClass = createEClass(COLUMN_LITERAL);
    createEAttribute(columnLiteralEClass, COLUMN_LITERAL__NAME);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__LITERAL_VALUE);

    createTableStatementEClass = createEClass(CREATE_TABLE_STATEMENT);
    createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__COLUMN_DEFS);
    createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__CONSTRAINTS);

    alterTableStatementEClass = createEClass(ALTER_TABLE_STATEMENT);
    createEReference(alterTableStatementEClass, ALTER_TABLE_STATEMENT__CLAUSE);

    createViewStatementEClass = createEClass(CREATE_VIEW_STATEMENT);
    createEReference(createViewStatementEClass, CREATE_VIEW_STATEMENT__SELECT_STATEMENT);

    alterTableRenameClauseEClass = createEClass(ALTER_TABLE_RENAME_CLAUSE);
    createEAttribute(alterTableRenameClauseEClass, ALTER_TABLE_RENAME_CLAUSE__NAME);

    alterTableAddColumnClauseEClass = createEClass(ALTER_TABLE_ADD_COLUMN_CLAUSE);
    createEReference(alterTableAddColumnClauseEClass, ALTER_TABLE_ADD_COLUMN_CLAUSE__COLUMN_DEF);

    primaryKeyColumnConstraintEClass = createEClass(PRIMARY_KEY_COLUMN_CONSTRAINT);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__ASC);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__DESC);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT);

    notNullConstraintEClass = createEClass(NOT_NULL_CONSTRAINT);
    createEReference(notNullConstraintEClass, NOT_NULL_CONSTRAINT__CONFLICT_CLAUSE);

    defaultConstraintEClass = createEClass(DEFAULT_CONSTRAINT);
    createEReference(defaultConstraintEClass, DEFAULT_CONSTRAINT__DEFAULT_VALUE);

    literalDefaultValueEClass = createEClass(LITERAL_DEFAULT_VALUE);
    createEReference(literalDefaultValueEClass, LITERAL_DEFAULT_VALUE__LITERAL);

    expressionDefaultValueEClass = createEClass(EXPRESSION_DEFAULT_VALUE);
    createEReference(expressionDefaultValueEClass, EXPRESSION_DEFAULT_VALUE__EXPRESSION);

    singleSourceTableEClass = createEClass(SINGLE_SOURCE_TABLE);
    createEAttribute(singleSourceTableEClass, SINGLE_SOURCE_TABLE__TABLE_NAME);
    createEAttribute(singleSourceTableEClass, SINGLE_SOURCE_TABLE__NAME);

    singleSourceSelectStatementEClass = createEClass(SINGLE_SOURCE_SELECT_STATEMENT);
    createEReference(singleSourceSelectStatementEClass, SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT);

    singleSourceJoinEClass = createEClass(SINGLE_SOURCE_JOIN);
    createEReference(singleSourceJoinEClass, SINGLE_SOURCE_JOIN__JOIN_SOURCE);

    resultColumnAllEClass = createEClass(RESULT_COLUMN_ALL);

    resultColumnAllWithTableRefEClass = createEClass(RESULT_COLUMN_ALL_WITH_TABLE_REF);
    createEAttribute(resultColumnAllWithTableRefEClass, RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF);

    resultColumnExpressionEClass = createEClass(RESULT_COLUMN_EXPRESSION);
    createEReference(resultColumnExpressionEClass, RESULT_COLUMN_EXPRESSION__EXPRESSION);
    createEAttribute(resultColumnExpressionEClass, RESULT_COLUMN_EXPRESSION__NAME);

    numericLiteralEClass = createEClass(NUMERIC_LITERAL);
    createEAttribute(numericLiteralEClass, NUMERIC_LITERAL__NUMBER);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__LITERAL);

    nullLiteralEClass = createEClass(NULL_LITERAL);
    createEAttribute(nullLiteralEClass, NULL_LITERAL__LITERAL);

    currentTimeLiteralEClass = createEClass(CURRENT_TIME_LITERAL);
    createEAttribute(currentTimeLiteralEClass, CURRENT_TIME_LITERAL__LITERAL);

    currentDateLiteralEClass = createEClass(CURRENT_DATE_LITERAL);
    createEAttribute(currentDateLiteralEClass, CURRENT_DATE_LITERAL__LITERAL);

    currentTimeStampLiteralEClass = createEClass(CURRENT_TIME_STAMP_LITERAL);
    createEAttribute(currentTimeStampLiteralEClass, CURRENT_TIME_STAMP_LITERAL__LITERAL);

    // Create enums
    columnTypeEEnum = createEEnum(COLUMN_TYPE);
    conflictResolutionEEnum = createEEnum(CONFLICT_RESOLUTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    uniqueTableContraintEClass.getESuperTypes().add(this.getTableConstraint());
    orExprEClass.getESuperTypes().add(this.getExpression());
    andExprEClass.getESuperTypes().add(this.getExpression());
    primaryComparisonExprEClass.getESuperTypes().add(this.getExpression());
    secondaryComparisonExprEClass.getESuperTypes().add(this.getExpression());
    columnLiteralEClass.getESuperTypes().add(this.getExpression());
    literalEClass.getESuperTypes().add(this.getExpression());
    createTableStatementEClass.getESuperTypes().add(this.getStatment());
    alterTableStatementEClass.getESuperTypes().add(this.getStatment());
    createViewStatementEClass.getESuperTypes().add(this.getStatment());
    alterTableRenameClauseEClass.getESuperTypes().add(this.getAlterTableClause());
    alterTableAddColumnClauseEClass.getESuperTypes().add(this.getAlterTableClause());
    primaryKeyColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    notNullConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    defaultConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    literalDefaultValueEClass.getESuperTypes().add(this.getDefaultValue());
    expressionDefaultValueEClass.getESuperTypes().add(this.getDefaultValue());
    singleSourceTableEClass.getESuperTypes().add(this.getSingleSource());
    singleSourceSelectStatementEClass.getESuperTypes().add(this.getSingleSource());
    singleSourceJoinEClass.getESuperTypes().add(this.getSingleSource());
    resultColumnAllEClass.getESuperTypes().add(this.getResultColumn());
    resultColumnAllWithTableRefEClass.getESuperTypes().add(this.getResultColumn());
    resultColumnExpressionEClass.getESuperTypes().add(this.getResultColumn());
    numericLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    stringLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    nullLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentTimeLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentDateLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentTimeStampLiteralEClass.getESuperTypes().add(this.getLiteralValue());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Database(), this.getDatabaseBlock(), null, "database", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseBlockEClass, DatabaseBlock.class, "DatabaseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseBlock_Migrations(), this.getMigrationBlock(), null, "migrations", null, 0, -1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migrationBlockEClass, MigrationBlock.class, "MigrationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigrationBlock_Statements(), this.getStatment(), null, "statements", null, 0, -1, MigrationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statmentEClass, Statment.class, "Statment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableDeclEClass, TableDecl.class, "TableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableClauseEClass, AlterTableClause.class, "AlterTableClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(columnDefEClass, ColumnDef.class, "ColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnDef_Type(), this.getColumnType(), "type", null, 0, 1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnDef_Constraints(), this.getColumnConstraint(), null, "constraints", null, 0, -1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnConstraintEClass, ColumnConstraint.class, "ColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defaultValueEClass, DefaultValue.class, "DefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uniqueTableContraintEClass, UniqueTableContraint.class, "UniqueTableContraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniqueTableContraint_Columns(), this.getIndexedColumn(), null, "columns", null, 0, -1, UniqueTableContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUniqueTableContraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, UniqueTableContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexedColumnEClass, IndexedColumn.class, "IndexedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexedColumn_Name(), this.getColumnDef(), null, "name", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedColumn_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedColumn_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectStatementEClass, SelectStatement.class, "SelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectStatement_Core(), this.getSelectCore(), null, "core", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectCoreEClass, SelectCore.class, "SelectCore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectCore_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectCore_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_ResultColumns(), this.getResultColumn(), null, "resultColumns", null, 0, -1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_Source(), this.getJoinSource(), null, "source", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinSourceEClass, JoinSource.class, "JoinSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoinSource_Source(), this.getSingleSource(), null, "source", null, 0, 1, JoinSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinSource_JoinStatements(), this.getJoinStatement(), null, "joinStatements", null, 0, -1, JoinSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceEClass, SingleSource.class, "SingleSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(joinStatementEClass, JoinStatement.class, "JoinStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinStatement_Natural(), ecorePackage.getEBoolean(), "natural", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Left(), ecorePackage.getEBoolean(), "left", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Outer(), ecorePackage.getEBoolean(), "outer", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Inner(), ecorePackage.getEBoolean(), "inner", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Cross(), ecorePackage.getEBoolean(), "cross", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinStatement_SingleSource(), this.getSingleSource(), null, "singleSource", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultColumnEClass, ResultColumn.class, "ResultColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conflictClauseEClass, ConflictClause.class, "ConflictClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConflictClause_Resolution(), this.getConflictResolution(), "resolution", null, 0, 1, ConflictClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orExprEClass, OrExpr.class, "OrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpr_Left(), this.getExpression(), null, "left", null, 0, 1, OrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrExpr_Right(), this.getExpression(), null, "right", null, 0, 1, OrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExprEClass, AndExpr.class, "AndExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpr_Left(), this.getExpression(), null, "left", null, 0, 1, AndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExpr_Right(), this.getExpression(), null, "right", null, 0, 1, AndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryComparisonExprEClass, PrimaryComparisonExpr.class, "PrimaryComparisonExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryComparisonExpr_Left(), this.getExpression(), null, "left", null, 0, 1, PrimaryComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryComparisonExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, PrimaryComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryComparisonExpr_Right(), this.getExpression(), null, "right", null, 0, 1, PrimaryComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(secondaryComparisonExprEClass, SecondaryComparisonExpr.class, "SecondaryComparisonExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSecondaryComparisonExpr_Left(), this.getExpression(), null, "left", null, 0, 1, SecondaryComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryComparisonExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, SecondaryComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecondaryComparisonExpr_Right(), this.getExpression(), null, "right", null, 0, 1, SecondaryComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnLiteralEClass, ColumnLiteral.class, "ColumnLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_LiteralValue(), this.getLiteralValue(), null, "literalValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createTableStatementEClass, CreateTableStatement.class, "CreateTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateTableStatement_ColumnDefs(), this.getColumnDef(), null, "columnDefs", null, 0, -1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTableStatement_Constraints(), this.getTableConstraint(), null, "constraints", null, 0, -1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableStatementEClass, AlterTableStatement.class, "AlterTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlterTableStatement_Clause(), this.getAlterTableClause(), null, "clause", null, 0, 1, AlterTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createViewStatementEClass, CreateViewStatement.class, "CreateViewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateViewStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, CreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableRenameClauseEClass, AlterTableRenameClause.class, "AlterTableRenameClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlterTableRenameClause_Name(), ecorePackage.getEString(), "name", null, 0, 1, AlterTableRenameClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableAddColumnClauseEClass, AlterTableAddColumnClause.class, "AlterTableAddColumnClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlterTableAddColumnClause_ColumnDef(), this.getColumnDef(), null, "columnDef", null, 0, 1, AlterTableAddColumnClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryKeyColumnConstraintEClass, PrimaryKeyColumnConstraint.class, "PrimaryKeyColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimaryKeyColumnConstraint_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryKeyColumnConstraint_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryKeyColumnConstraint_Autoincrement(), ecorePackage.getEBoolean(), "autoincrement", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notNullConstraintEClass, NotNullConstraint.class, "NotNullConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNotNullConstraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, NotNullConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultConstraintEClass, DefaultConstraint.class, "DefaultConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultConstraint_DefaultValue(), this.getDefaultValue(), null, "defaultValue", null, 0, 1, DefaultConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalDefaultValueEClass, LiteralDefaultValue.class, "LiteralDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralDefaultValue_Literal(), this.getLiteralValue(), null, "literal", null, 0, 1, LiteralDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionDefaultValueEClass, ExpressionDefaultValue.class, "ExpressionDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionDefaultValue_Expression(), this.getExpression(), null, "expression", null, 0, 1, ExpressionDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceTableEClass, SingleSourceTable.class, "SingleSourceTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSingleSourceTable_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, SingleSourceTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleSourceTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, SingleSourceTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceSelectStatementEClass, SingleSourceSelectStatement.class, "SingleSourceSelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleSourceSelectStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, SingleSourceSelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceJoinEClass, SingleSourceJoin.class, "SingleSourceJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleSourceJoin_JoinSource(), this.getJoinSource(), null, "joinSource", null, 0, 1, SingleSourceJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultColumnAllEClass, ResultColumnAll.class, "ResultColumnAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resultColumnAllWithTableRefEClass, ResultColumnAllWithTableRef.class, "ResultColumnAllWithTableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResultColumnAllWithTableRef_TableRef(), ecorePackage.getEString(), "tableRef", null, 0, 1, ResultColumnAllWithTableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultColumnExpressionEClass, ResultColumnExpression.class, "ResultColumnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResultColumnExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, ResultColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResultColumnExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResultColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericLiteral_Number(), ecorePackage.getEBigDecimal(), "number", null, 0, 1, NumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNullLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, NullLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentTimeLiteralEClass, CurrentTimeLiteral.class, "CurrentTimeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCurrentTimeLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, CurrentTimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentDateLiteralEClass, CurrentDateLiteral.class, "CurrentDateLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCurrentDateLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, CurrentDateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentTimeStampLiteralEClass, CurrentTimeStampLiteral.class, "CurrentTimeStampLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCurrentTimeStampLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, CurrentTimeStampLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(columnTypeEEnum, ColumnType.class, "ColumnType");
    addEEnumLiteral(columnTypeEEnum, ColumnType.TEXT);
    addEEnumLiteral(columnTypeEEnum, ColumnType.INTEGER);
    addEEnumLiteral(columnTypeEEnum, ColumnType.REAL);
    addEEnumLiteral(columnTypeEEnum, ColumnType.BLOB);

    initEEnum(conflictResolutionEEnum, ConflictResolution.class, "ConflictResolution");
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.ROLLBACK);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.ABORT);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.FAIL);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.IGNORE);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.REPLACE);

    // Create resource
    createResource(eNS_URI);
  }

} //SqliteModelPackageImpl
