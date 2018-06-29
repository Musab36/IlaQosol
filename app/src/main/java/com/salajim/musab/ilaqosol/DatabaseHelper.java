package com.salajim.musab.ilaqosol;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.salajim.musab.ilaqosol.models.Categories;

import java.util.LinkedList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "jokes.db";
    public static final String TABLE_NAME = "details_data";
    public static  final String COL1 = "ID";
    public static final String COL2 = "ITEM1";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " ITEM1 TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(String item1) {
        // Inserting data into the database
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, item1);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    // Getting the inserted data from the database
    public List<Categories> jokes(String filter) {
        String query;
        if(filter.equals("")){
            //regular query
            query = "SELECT  * FROM " + TABLE_NAME;
        }else{
            //filter results by filter option provided
            query = "SELECT  * FROM " + TABLE_NAME + " ORDER BY "+ filter;
        }

        List<Categories> jokesList = new LinkedList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Categories joke;

        if (cursor.moveToFirst()) {
            do {
               joke = new Categories();

                joke.setDescription(cursor.getString(cursor.getColumnIndex(COL2)));
                jokesList.add(joke);
            } while (cursor.moveToNext());
        }


        return jokesList;
    }

    /**Query only 1 record**/
    public Categories getJokes(long id){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT  * FROM " + TABLE_NAME + " WHERE _id="+ id;
        Cursor cursor = db.rawQuery(query, null);

        Categories receivedJoke = new Categories();
        if(cursor.getCount() > 0) {
            cursor.moveToFirst();

            receivedJoke.setDescription(cursor.getString(cursor.getColumnIndex(COL2)));

        }



        return receivedJoke;


    }
}
