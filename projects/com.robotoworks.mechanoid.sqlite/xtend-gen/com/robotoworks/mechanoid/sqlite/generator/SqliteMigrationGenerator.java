package com.robotoworks.mechanoid.sqlite.generator;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.common.util.Strings;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Statment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.serializer.ISerializer;

@SuppressWarnings("all")
public class SqliteMigrationGenerator {
  @Inject
  private ISerializer _iSerializer;
  
  public CharSequence generate(final Model model, final MigrationBlock snapshot, final int version) {
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
    _builder.append("import android.database.sqlite.SQLiteDatabase;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.sqlite.SQLiteMigration;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Abstract");
    DatabaseBlock _database = model.getDatabase();
    String _name = _database.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("MigrationV");
    _builder.append(version, "");
    _builder.append(" extends SQLiteMigration {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void up(SQLiteDatabase db) {");
    _builder.newLine();
    {
      EList<Statment> _statements = snapshot.getStatements();
      for(final Statment stmt : _statements) {
        _builder.append("\t\t");
        _builder.append("db.execSQL(");
        _builder.newLine();
        {
          String _serialize = this._iSerializer.serialize(stmt);
          String _trim = _serialize.trim();
          String[] _split = _trim.split("\\r?\\n");
          boolean _hasElements = false;
          for(final String line : _split) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" +", "			");
            }
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("\"");
            String _trim_1 = line.trim();
            _builder.append(_trim_1, "			");
            _builder.append(" \"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append(");");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateStub(final Model model, final MigrationBlock snapshot, final int version) {
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
    _builder.append("import ");
    String _packageName_1 = model.getPackageName();
    _builder.append(_packageName_1, "");
    _builder.append(".Abstract");
    DatabaseBlock _database = model.getDatabase();
    String _name = _database.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("MigrationV");
    _builder.append(version, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    DatabaseBlock _database_1 = model.getDatabase();
    String _name_1 = _database_1.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "");
    _builder.append("MigrationV");
    _builder.append(version, "");
    _builder.append(" extends Abstract");
    DatabaseBlock _database_2 = model.getDatabase();
    String _name_2 = _database_2.getName();
    String _pascalize_2 = Strings.pascalize(_name_2);
    _builder.append(_pascalize_2, "");
    _builder.append("MigrationV");
    _builder.append(version, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
