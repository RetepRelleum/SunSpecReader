/*
 * Copyright © 2017 , Peter Müller. All rights reserved.
 *
 *
 * THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT.  IN NO EVENT SHALL THE CONTRIBUTORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 */

package ch.gr.relleum.retep.sunspec.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.support.annotation.NonNull;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import ch.retep.relleum.sunspec.SunSpecAdressItem;

/**
 * Created by Peter on 17.01.2017.
 */

public class SunSpecAdress extends SunSpecAdressItem {

    private Context context;



    public SunSpecAdress(String aName, String aHostName, byte[] aIp, int aPort, int aUnitId, int aStartingAdress, Context aContext) {
        context = aContext;
        setName(aName);
        setHostName(aHostName);
        setIp("" + (aIp[0] & 0XFF) + "." + (aIp[1] & 0XFF) + "." + (aIp[2] & 0XFF) + "." + (aIp[3] & 0XFF));
        setPort(aPort);
        setUnitId(aUnitId);
        setStartingAdress(aStartingAdress);
        createDatabaseTable();
    }

    public SunSpecAdress(String aName, byte[] aIp, Context aContext) {
        context = aContext;
        setName(aName);
        setIp("" + (aIp[0] & 0XFF) + "." + (aIp[1] & 0XFF) + "." + (aIp[2] & 0XFF) + "." + (aIp[3] & 0XFF));
        createDatabaseTable();
    }

    public SunSpecAdress(String aName, String aHostName, Context aContext) {
        context = aContext;
        setName(aName);
        setHostName(aHostName);
        createDatabaseTable();
    }

    private SunSpecAdress(Context context) {
        this.context = context;

    }

    public SunSpecAdress(SunSpecAdressItem sunSpecAdressItem, Context context) {
        this.context = context;
        setName(sunSpecAdressItem.getName());
        setHostName(sunSpecAdressItem.getHostName());
        setIp(sunSpecAdressItem.getIp());
        setPort(sunSpecAdressItem.getPort());
        setUnitId(sunSpecAdressItem.getUnitId());
        setStartingAdress(sunSpecAdressItem.getStartingAdress());
        createDatabaseTable();
    }


    public static List<SunSpecAdress> getSunpecAdresses(Context context) {
        List<SunSpecAdress> itemIds = new ArrayList<>();
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String orderBy = AdressEntry._ID + " ASC";
        String[] projection = {
                AdressEntry._ID,
                AdressEntry.COLUMN_NAME_ID,
                AdressEntry.COLUMN_NAME_NAME,
                AdressEntry.COLUMN_NAME_HOST_NAME,
                AdressEntry.COLUMN_NAME_IP,
                AdressEntry.COLUMN_NAME_Port,
                AdressEntry.COLUMN_NAME_UnitId,
                AdressEntry.COLUMN_NAME_IsSelected,
                AdressEntry.COLUMN_NAME_StartAdress
        };

        if (new SunSpecAdressHelper(context).isTableExists()) {
            try (Cursor cursor = db.query(
                    AdressEntry.TABLE_NAME,                     // The table to query
                    projection,                                 // The columns to return
                    null,                                       // The columns for the WHERE clause
                    null,                                       // The values for the WHERE clause
                    null,                                       // don't group the rows
                    null,                                       // don't filter by row groups
                    orderBy                                        // The sort order
            )) {

                while (cursor.moveToNext()) {
                    SunSpecAdress sunSpecAdress = getSunSpecAdress(context, cursor);
                    itemIds.add(sunSpecAdress);
                }
            }

        }
        return itemIds;

    }

    @NonNull
    private static SunSpecAdress getSunSpecAdress(Context context, Cursor cursor) {
        SunSpecAdress sunSpecAdress = new SunSpecAdress(context);
        sunSpecAdress.setKeyi((int) cursor.getLong(cursor.getColumnIndexOrThrow(AdressEntry._ID)));
        sunSpecAdress.setIdi((int) cursor.getLong(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_ID)));
        sunSpecAdress.setNamei(cursor.getString(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_NAME)));
        sunSpecAdress.setHostNamei(cursor.getString(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_HOST_NAME)));
        sunSpecAdress.setIpi(cursor.getString(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_IP)));
        sunSpecAdress.setPorti(cursor.getInt(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_Port)));
        sunSpecAdress.setUnitIdi(cursor.getInt(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_UnitId)));
        sunSpecAdress.setSelectedi((1 == cursor.getInt(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_IsSelected))));
        sunSpecAdress.setStartingAdressi(cursor.getInt(cursor.getColumnIndexOrThrow(AdressEntry.COLUMN_NAME_StartAdress)));
        return sunSpecAdress;
    }


    public void delete() {
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String selection = AdressEntry._ID + " = ? ";
        String[] selectionArgs = {"" + getKey()};
        db.delete(AdressEntry.TABLE_NAME, selection, selectionArgs);
        //   db.delete(AdressEntry.TABLE_NAME, null, null);

        List<SunSpecAdress> sunSpecAdresses = SunSpecAdress.getSunpecAdresses(context);
        for (int i = 0; i < sunSpecAdresses.size(); i++) {
            SunSpecAdress sunSpecAdress = sunSpecAdresses.get(i);
            sunSpecAdress.setId(i);
        }

    }

    private void setId(int i) {
        setIdi(i);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_ID, i);
        updateDatabaseTable(values);
    }


    public void setName(String name) {
        setNamei(name);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_NAME, name);
        updateDatabaseTable(values);

    }


    public void setHostName(String hostName) {
        setHostNamei(hostName);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_HOST_NAME, hostName);
        updateDatabaseTable(values);
    }

    public void setIp(String ip) {
        setIpi(ip);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_IP, ip);
        updateDatabaseTable(values);
    }

    public void setPort(int port) {
        setPorti(port);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_Port, port);
        updateDatabaseTable(values);
    }

    public void setUnitId(int unitId) {
        setUnitIdi(unitId);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_UnitId, unitId);
        updateDatabaseTable(values);
    }

    public void setSelectet(Context context) {
        deSelectAll();
        setSelectedi(true);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_IsSelected, isSelected());
        updateDatabaseTable(values);
    }

    public void setStartingAdress(int startingAdress) {
        setStartingAdressi(startingAdress);
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_StartAdress, startingAdress);
        updateDatabaseTable(values);
    }

    private void createDatabaseTable() {
        setId(SunSpecAdress.getCount(context));
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        ContentValues contentValues = mDbHelper.getContentValues(this);
        db.insert(AdressEntry.TABLE_NAME, null, contentValues);

    }

    private void updateDatabaseTable(ContentValues values) {
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String selection = AdressEntry._ID + " = ?";
        String[] selectionArgs = {"" + getKey()};
        db.update(AdressEntry.TABLE_NAME, values, selection, selectionArgs);
    }

    public static int getCount(Context context) {
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        int count;
        try (Cursor mCount = db.rawQuery("select count(*) from " + AdressEntry.TABLE_NAME, null)) {
            mCount.moveToFirst();
            count = mCount.getInt(0);
        }
        return count;
    }

    public static SunSpecAdress get(int pos, Context context) {
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        SunSpecAdress sunSpecAdress = new SunSpecAdress(context);
        String[] projection = {
                AdressEntry._ID,
                AdressEntry.COLUMN_NAME_ID,
                AdressEntry.COLUMN_NAME_NAME,
                AdressEntry.COLUMN_NAME_HOST_NAME,
                AdressEntry.COLUMN_NAME_IP,
                AdressEntry.COLUMN_NAME_Port,
                AdressEntry.COLUMN_NAME_UnitId,
                AdressEntry.COLUMN_NAME_IsSelected,
                AdressEntry.COLUMN_NAME_StartAdress
        };
        String[] where = {("" + pos)};

        if (new SunSpecAdressHelper(context).isTableExists()) {
            try (Cursor cursor = db.query(
                    AdressEntry.TABLE_NAME,                     // The table to query
                    projection,                                 // The columns to return
                    AdressEntry.COLUMN_NAME_ID + " = ?",         // The columns for the WHERE clause
                    where,                                       // The values for the WHERE clause
                    null,                                       // don't group the rows
                    null,                                       // don't filter by row groups
                    null                                        // The sort order
            )) {
                while (cursor.moveToNext()) {
                    sunSpecAdress = getSunSpecAdress(context, cursor);
                }
            }
        }
        return sunSpecAdress;
    }

    public static SunSpecAdress getSelected(Context context) {
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        SunSpecAdress sunSpecAdress = new SunSpecAdress(context);
        String[] projection = {
                AdressEntry._ID,
                AdressEntry.COLUMN_NAME_ID,
                AdressEntry.COLUMN_NAME_NAME,
                AdressEntry.COLUMN_NAME_HOST_NAME,
                AdressEntry.COLUMN_NAME_IP,
                AdressEntry.COLUMN_NAME_Port,
                AdressEntry.COLUMN_NAME_UnitId,
                AdressEntry.COLUMN_NAME_IsSelected,
                AdressEntry.COLUMN_NAME_StartAdress
        };


        if (new SunSpecAdressHelper(context).isTableExists()) {

            try (Cursor cursor = db.query(
                    AdressEntry.TABLE_NAME,                     // The table to query
                    projection,                                 // The columns to return
                    AdressEntry.COLUMN_NAME_IsSelected + " = 1", // The columns for the WHERE clause
                    null,                                       // The values for the WHERE clause
                    null,                                       // don't group the rows
                    null,                                       // don't filter by row groups
                    null                                        // The sort order
            )) {
                while (cursor.moveToNext()) {
                    sunSpecAdress = getSunSpecAdress(context, cursor);
                }
            }
        }
        if (sunSpecAdress.isSelected()) {
            return sunSpecAdress;
        } else {
            return null;
        }
    }

    private void deSelectAll() {
        SunSpecAdressHelper mDbHelper = SunSpecAdressHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(AdressEntry.COLUMN_NAME_IsSelected, 0);
        String selection = AdressEntry._ID + " != ?";
        String[] selectionArgs = {"" + getKey()};
        db.update(AdressEntry.TABLE_NAME, values, selection, selectionArgs);
    }

    public InetAddress getAdress() {
        try {
            return InetAddress.getByAddress(getIpArray());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

    private byte[] getIpArray() {
        String[] sb = getIp().split("\\.");
        return new byte[]{(byte) Integer.parseInt(sb[0]), (byte) Integer.parseInt(sb[1]), (byte) Integer.parseInt(sb[2]), (byte) Integer.parseInt(sb[3])};
    }

    public static class SunSpecAdressHelper extends SQLiteOpenHelper {
        private static SunSpecAdressHelper mInstance = null;
        private static final int DATABASE_VERSION = 3;
        private static final String DATABASE_NAME = "Adress.db";
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + AdressEntry.TABLE_NAME + " (" +
                        AdressEntry._ID + " INTEGER PRIMARY KEY," +
                        AdressEntry.COLUMN_NAME_ID + " INTEGER," +
                        AdressEntry.COLUMN_NAME_NAME + " TEXT," +
                        AdressEntry.COLUMN_NAME_HOST_NAME + " TEXT," +
                        AdressEntry.COLUMN_NAME_IP + " TEXT," +
                        AdressEntry.COLUMN_NAME_Port + " INTEGER," +
                        AdressEntry.COLUMN_NAME_UnitId + " INTEGER," +
                        AdressEntry.COLUMN_NAME_IsSelected + " INTEGER," +
                        AdressEntry.COLUMN_NAME_StartAdress + " INTEGER)";

        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + AdressEntry.TABLE_NAME;

        public static SunSpecAdressHelper getInstance(Context ctx) {

            // Use the application context, which will ensure that you
            // don't accidentally leak an Activity's context.
            // See this article for more information: http://bit.ly/6LRzfx
            if (mInstance == null) {
                mInstance = new SunSpecAdressHelper(ctx.getApplicationContext());
            }
            return mInstance;
        }

        private SunSpecAdressHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQL_CREATE_ENTRIES);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(SQL_DELETE_ENTRIES);
            onCreate(db);
        }

        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db, oldVersion, newVersion);
        }

        public ContentValues getContentValues(SunSpecAdress sunSpecAdress) {
            ContentValues values = new ContentValues();
            values.put(AdressEntry.COLUMN_NAME_ID, sunSpecAdress.getId());
            values.put(AdressEntry.COLUMN_NAME_NAME, sunSpecAdress.getName());
            values.put(AdressEntry.COLUMN_NAME_HOST_NAME, sunSpecAdress.getHostName());
            values.put(AdressEntry.COLUMN_NAME_IP, sunSpecAdress.getIp());
            values.put(AdressEntry.COLUMN_NAME_Port, sunSpecAdress.getPort());
            values.put(AdressEntry.COLUMN_NAME_UnitId, sunSpecAdress.getUnitId());
            values.put(AdressEntry.COLUMN_NAME_StartAdress, sunSpecAdress.getStartingAdress());
            values.put(AdressEntry.COLUMN_NAME_IsSelected, (sunSpecAdress.isSelected() ? 1 : 0));
            return values;
        }

        public boolean isTableExists() {

            SQLiteDatabase db = getReadableDatabase();
            try (Cursor cursor = db.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = '" + AdressEntry.TABLE_NAME + "'", null)) {
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        cursor.close();
                        return true;
                    }
                    cursor.close();
                    db.close();
                }
            }
            return false;
        }
    }

    private class AdressEntry implements BaseColumns {
        private static final String TABLE_NAME = "SunSpecHost";
        private static final String COLUMN_NAME_ID = "ID";
        private static final String COLUMN_NAME_NAME = "Name";
        private static final String COLUMN_NAME_HOST_NAME = "HostName";
        private static final String COLUMN_NAME_IP = "Ip";
        private static final String COLUMN_NAME_Port = "Port";
        private static final String COLUMN_NAME_UnitId = "UnitId";
        private static final String COLUMN_NAME_StartAdress = "StartAdress";
        private static final String COLUMN_NAME_IsSelected = "IsSelected";
    }

}
