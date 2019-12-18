package chile.maps.biblioteca;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;


public class SQLite_act {

    public SQLite_act(@Nullable Context context,
                      @Nullable String name,
                      @Nullable SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public onCreate(SQLiteDatabase BaseDeDatos) {

        BaseDeDatos.execSQL("CREATE TABLE Libros (codigo int primary key, nombre text, precio float)");
    }

    @Override
    public onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)

    public SQLiteDatabase getWritableDatabase() {
    }
}

}

