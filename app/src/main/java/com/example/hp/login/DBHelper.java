package com.example.hp.login;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hp on 5/5/2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "login.db";
    public static final int VERSION = 1;
    public static final String TABLE = "users";
    public static final String ID = "id";
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    public static final String CREATETABLE = " CREATE TABLE " + TABLE + " ( " + ID  + " INTEGER PRIMARY KEY AUTOINCREMENT , " + EMAIL + " TEXT , " + PASSWORD + " TEXT ) ; " ;



    public DBHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATETABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    void adduser(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value = new ContentValues();
        value.put(EMAIL, "samia");
        value.put(PASSWORD, "12345");
        long id = db.insert(TABLE, null, value);
        db.close();

    }

    void check(String mail , String pass )
    {
        SQLiteDatabase db = this.getReadableDatabase();

    }
}
