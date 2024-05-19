package pnj.uts.ti.zakirio_hugoraazaq_wasis;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME = "UTS.db";
    private static final int DATABASE_VERSION = 1;

    private static final String ALUMNI_TABLE_NAME = "data_alumni";
    private static final String ALUMNI_NIM = "nim";
    private static final String ALUMNI_NAMA = "nama";
    private static final String ALUMNI_TMPT_LAHIR = "tempat_lahir";
    private static final String ALUMNI_TGL_LAHIR = "tgl_lahir";
    private static final String ALUMNI_ALAMAT = "alamat";
    private static final String ALUMNI_AGAMA = "agama";
    private static final String ALUMNI_TLP = "tlp";
    private static final String ALUMNI_THN_MASUK = "thn_masuk";
    private static final String ALUMNI_THN_LULUS = "thn_lulus";
    private static final String ALUMNI_PEKERJAAN = "pekerjaan";
    private static final String ALUMNI_JABATAN = "jabatan";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + ALUMNI_TABLE_NAME +
                        " (" + ALUMNI_NIM + " TEXT PRIMARY KEY, " +
                        ALUMNI_NAMA + " TEXT, " +
                        ALUMNI_TMPT_LAHIR + " TEXT, " +
                        ALUMNI_TGL_LAHIR + " TEXT, " +
                        ALUMNI_ALAMAT + " TEXT, " +
                        ALUMNI_AGAMA + " TEXT, " +
                        ALUMNI_TLP + " TEXT, " +
                        ALUMNI_THN_MASUK + " TEXT, " +
                        ALUMNI_THN_LULUS + " TEXT, " +
                        ALUMNI_PEKERJAAN + " TEXT, " +
                        ALUMNI_JABATAN + " TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ALUMNI_TABLE_NAME);
        onCreate(db);
    }

    void addBook(String nim, String nama, String tmpt_lahir, String tgl_lahir, String alamat, String agama, String tlp, String thn_masuk, String thn_lulus, String pekerjaan, String jabatan) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(ALUMNI_NIM, nim);
        cv.put(ALUMNI_NAMA, nama);
        cv.put(ALUMNI_TMPT_LAHIR, tmpt_lahir);
        cv.put(ALUMNI_TGL_LAHIR, tgl_lahir);
        cv.put(ALUMNI_ALAMAT, alamat);
        cv.put(ALUMNI_AGAMA, agama);
        cv.put(ALUMNI_TLP, tlp);
        cv.put(ALUMNI_THN_MASUK, thn_masuk);
        cv.put(ALUMNI_THN_LULUS, thn_lulus);
        cv.put(ALUMNI_PEKERJAAN, pekerjaan);
        cv.put(ALUMNI_JABATAN, jabatan);

        long result = db.insert(ALUMNI_TABLE_NAME, null, cv);
        if (result == -1) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readAllData() {
        String query = "SELECT * FROM " + ALUMNI_TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
}
