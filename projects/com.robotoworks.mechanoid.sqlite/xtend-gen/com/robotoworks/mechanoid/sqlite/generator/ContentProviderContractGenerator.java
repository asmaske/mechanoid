package com.robotoworks.mechanoid.sqlite.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.robotoworks.mechanoid.common.util.Strings;
import com.robotoworks.mechanoid.sqlite.generator.Extensions;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Statment;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ContentProviderContractGenerator {
  public CharSequence generate(final Model model, final MigrationBlock snapshot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated by Robotoworks Mechanoid");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.content.ContentValues;");
    _builder.newLine();
    _builder.append("import android.net.Uri;");
    _builder.newLine();
    _builder.append("import android.provider.BaseColumns;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    DatabaseBlock _database = model.getDatabase();
    String _name = _database.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("Contract  {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static final String CONTENT_AUTHORITY = \"");
    String _packageName_1 = model.getPackageName();
    _builder.append(_packageName_1, "    ");
    _builder.append(".");
    DatabaseBlock _database_1 = model.getDatabase();
    String _name_1 = _database_1.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final Uri BASE_CONTENT_URI = Uri.parse(\"content://\" + CONTENT_AUTHORITY);");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Statment> _statements = snapshot.getStatements();
      Iterable<CreateTableStatement> _filter = Iterables.<CreateTableStatement>filter(_statements, CreateTableStatement.class);
      for(final CreateTableStatement tbl : _filter) {
        _builder.append("\t");
        _builder.append("interface ");
        String _name_2 = tbl.getName();
        String _pascalize_1 = Strings.pascalize(_name_2);
        _builder.append(_pascalize_1, "	");
        _builder.append("Columns {");
        _builder.newLineIfNotEmpty();
        {
          EList<ColumnDef> _columnDefs = tbl.getColumnDefs();
          final Function1<ColumnDef,Boolean> _function = new Function1<ColumnDef,Boolean>() {
              public Boolean apply(final ColumnDef it) {
                String _name = it.getName();
                boolean _equals = _name.equals("_id");
                boolean _not = (!_equals);
                return Boolean.valueOf(_not);
              }
            };
          Iterable<ColumnDef> _filter_1 = IterableExtensions.<ColumnDef>filter(_columnDefs, _function);
          for(final ColumnDef col : _filter_1) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("String ");
            String _name_3 = col.getName();
            String _underscore = Strings.underscore(_name_3);
            String _upperCase = _underscore.toUpperCase();
            _builder.append(_upperCase, "		");
            _builder.append(" = \"");
            String _name_4 = col.getName();
            _builder.append(_name_4, "		");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<Statment> _statements_1 = snapshot.getStatements();
      Iterable<CreateViewStatement> _filter_2 = Iterables.<CreateViewStatement>filter(_statements_1, CreateViewStatement.class);
      for(final CreateViewStatement vw : _filter_2) {
        _builder.append("\t");
        _builder.append("interface ");
        String _name_5 = vw.getName();
        String _pascalize_2 = Strings.pascalize(_name_5);
        _builder.append(_pascalize_2, "	");
        _builder.append("Columns {");
        _builder.newLineIfNotEmpty();
        {
          SelectStatement _selectStatement = vw.getSelectStatement();
          SelectCore _core = _selectStatement.getCore();
          EList<ResultColumn> _resultColumns = _core.getResultColumns();
          for(final ResultColumn col_1 : _resultColumns) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _generateInterfaceMemberForResultColumn = this.generateInterfaceMemberForResultColumn(col_1);
            _builder.append(_generateInterfaceMemberForResultColumn, "		");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      EList<Statment> _statements_2 = snapshot.getStatements();
      Iterable<CreateTableStatement> _filter_3 = Iterables.<CreateTableStatement>filter(_statements_2, CreateTableStatement.class);
      for(final CreateTableStatement tbl_1 : _filter_3) {
        _builder.append("\t");
        _builder.append("public static class ");
        String _name_6 = tbl_1.getName();
        String _pascalize_3 = Strings.pascalize(_name_6);
        _builder.append(_pascalize_3, "	");
        _builder.append(" implements ");
        String _name_7 = tbl_1.getName();
        String _pascalize_4 = Strings.pascalize(_name_7);
        _builder.append(_pascalize_4, "	");
        _builder.append("Columns");
        {
          boolean _hasAndroidPrimaryKey = Extensions.hasAndroidPrimaryKey(tbl_1);
          if (_hasAndroidPrimaryKey) {
            _builder.append(", BaseColumns");
          }
        }
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("public static final Uri CONTENT_URI = ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("BASE_CONTENT_URI.buildUpon().appendPath(\"");
        String _name_8 = tbl_1.getName();
        _builder.append(_name_8, "				");
        _builder.append("\").build();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("public static final String CONTENT_TYPE =");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("            ");
        _builder.append("\"vnd.android.cursor.dir/vnd.");
        DatabaseBlock _database_2 = model.getDatabase();
        String _name_9 = _database_2.getName();
        String _lowerCase_1 = _name_9.toLowerCase();
        _builder.append(_lowerCase_1, "	            ");
        _builder.append(".");
        String _name_10 = tbl_1.getName();
        _builder.append(_name_10, "	            ");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("public static final String ITEM_CONTENT_TYPE =");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("            ");
        _builder.append("\"vnd.android.cursor.item/vnd.");
        DatabaseBlock _database_3 = model.getDatabase();
        String _name_11 = _database_3.getName();
        String _lowerCase_2 = _name_11.toLowerCase();
        _builder.append(_lowerCase_2, "	            ");
        _builder.append(".");
        String _name_12 = tbl_1.getName();
        _builder.append(_name_12, "	            ");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("public static Uri buildGetByIdUri(String id) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("        ");
        _builder.append("return CONTENT_URI.buildUpon().appendPath(id).build();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("public static ContentValues createContentValues(");
        CharSequence _createMethodArgsFromColumns = this.createMethodArgsFromColumns(tbl_1);
        _builder.append(_createMethodArgsFromColumns, "		");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("ContentValues values = new ContentValues();");
        _builder.newLine();
        {
          EList<ColumnDef> _columnDefs_1 = tbl_1.getColumnDefs();
          final Function1<ColumnDef,Boolean> _function_1 = new Function1<ColumnDef,Boolean>() {
              public Boolean apply(final ColumnDef it) {
                String _name = it.getName();
                boolean _equals = _name.equals("_id");
                boolean _not = (!_equals);
                return Boolean.valueOf(_not);
              }
            };
          Iterable<ColumnDef> _filter_4 = IterableExtensions.<ColumnDef>filter(_columnDefs_1, _function_1);
          for(final ColumnDef col_2 : _filter_4) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("values.put(");
            String _name_13 = tbl_1.getName();
            String _pascalize_5 = Strings.pascalize(_name_13);
            _builder.append(_pascalize_5, "			");
            _builder.append(".");
            String _name_14 = col_2.getName();
            String _underscore_1 = Strings.underscore(_name_14);
            String _upperCase_1 = _underscore_1.toUpperCase();
            _builder.append(_upperCase_1, "			");
            _builder.append(", ");
            String _name_15 = col_2.getName();
            String _camelize = Strings.camelize(_name_15);
            _builder.append(_camelize, "			");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return values;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<Statment> _statements_3 = snapshot.getStatements();
      Iterable<CreateViewStatement> _filter_5 = Iterables.<CreateViewStatement>filter(_statements_3, CreateViewStatement.class);
      for(final CreateViewStatement vw_1 : _filter_5) {
        _builder.append("\t");
        _builder.append("public static class ");
        String _name_16 = vw_1.getName();
        String _pascalize_6 = Strings.pascalize(_name_16);
        _builder.append(_pascalize_6, "	");
        _builder.append(" implements ");
        String _name_17 = vw_1.getName();
        String _pascalize_7 = Strings.pascalize(_name_17);
        _builder.append(_pascalize_7, "	");
        _builder.append("Columns");
        {
          boolean _hasAndroidPrimaryKey_1 = Extensions.hasAndroidPrimaryKey(vw_1);
          if (_hasAndroidPrimaryKey_1) {
            _builder.append(", BaseColumns");
          }
        }
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("public static final Uri CONTENT_URI = ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("BASE_CONTENT_URI.buildUpon().appendPath(\"");
        String _name_18 = vw_1.getName();
        _builder.append(_name_18, "				");
        _builder.append("\").build();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("public static final String CONTENT_TYPE =");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("            ");
        _builder.append("\"vnd.android.cursor.dir/vnd.");
        DatabaseBlock _database_4 = model.getDatabase();
        String _name_19 = _database_4.getName();
        String _lowerCase_3 = _name_19.toLowerCase();
        _builder.append(_lowerCase_3, "	            ");
        _builder.append(".");
        String _name_20 = vw_1.getName();
        _builder.append(_name_20, "	            ");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        {
          boolean _hasAndroidPrimaryKey_2 = Extensions.hasAndroidPrimaryKey(vw_1);
          if (_hasAndroidPrimaryKey_2) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("public static final String ITEM_CONTENT_TYPE =");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"vnd.android.cursor.item/vnd.");
            DatabaseBlock _database_5 = model.getDatabase();
            String _name_21 = _database_5.getName();
            String _lowerCase_4 = _name_21.toLowerCase();
            _builder.append(_lowerCase_4, "			");
            _builder.append(".");
            String _name_22 = vw_1.getName();
            _builder.append(_name_22, "			");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    DatabaseBlock _database_6 = model.getDatabase();
    String _name_23 = _database_6.getName();
    String _pascalize_8 = Strings.pascalize(_name_23);
    _builder.append(_pascalize_8, "	");
    _builder.append("Contract(){}");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMethodArgsFromColumns(final CreateTableStatement tbl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ColumnDef> _columnDefs = tbl.getColumnDefs();
      final Function1<ColumnDef,Boolean> _function = new Function1<ColumnDef,Boolean>() {
          public Boolean apply(final ColumnDef it) {
            String _name = it.getName();
            boolean _equals = _name.equals("_id");
            boolean _not = (!_equals);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<ColumnDef> _filter = IterableExtensions.<ColumnDef>filter(_columnDefs, _function);
      boolean _hasElements = false;
      for(final ColumnDef col : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        ColumnType _type = col.getType();
        String _javaTypeName = Extensions.toJavaTypeName(_type);
        _builder.append(_javaTypeName, "");
        _builder.append(" ");
        String _name = col.getName();
        String _camelize = Strings.camelize(_name);
        _builder.append(_camelize, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateInterfaceMemberForResultColumn(final ResultColumnAll column) {
    return null;
  }
  
  protected CharSequence _generateInterfaceMemberForResultColumn(final ResultColumnExpression column) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _name = column.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        String _name_1 = column.getName();
        boolean _equals = _name_1.equals("");
        boolean _not = (!_equals);
        _and_1 = (_notEquals && _not);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _name_2 = column.getName();
        boolean _equals_1 = _name_2.equals("_id");
        boolean _not_1 = (!_equals_1);
        _and = (_and_1 && _not_1);
      }
      if (_and) {
        _builder.append("String ");
        String _name_3 = column.getName();
        String _underscore = Strings.underscore(_name_3);
        String _upperCase = _underscore.toUpperCase();
        _builder.append(_upperCase, "");
        _builder.append(" = \"");
        String _name_4 = column.getName();
        _builder.append(_name_4, "");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateInterfaceMemberForResultColumn(final ResultColumnAllWithTableRef column) {
    return null;
  }
  
  public CharSequence generateInterfaceMemberForResultColumn(final ResultColumn column) {
    if (column instanceof ResultColumnAll) {
      return _generateInterfaceMemberForResultColumn((ResultColumnAll)column);
    } else if (column instanceof ResultColumnAllWithTableRef) {
      return _generateInterfaceMemberForResultColumn((ResultColumnAllWithTableRef)column);
    } else if (column instanceof ResultColumnExpression) {
      return _generateInterfaceMemberForResultColumn((ResultColumnExpression)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
}
