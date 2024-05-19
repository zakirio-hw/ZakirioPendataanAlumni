/* package com.example.uts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private Context context;
    public static final String DATABASE_NAME = "UTS.db";
    public static final int DATABASE_VERSION = 1;

    public static final String ALUMNI_TABLE_NAME = "data_alumni";
    public static final String ALUMNI_NIM = "nim";
    public static final String ALUMNI_NAMA = "nama";
    public static final String ALUMNI_TMPT_LAHIR = "tempat_lahir";
    public static final String ALUMNI_TGL_LAHIR = "tgl_lahir";
    public static final String ALUMNI_ALAMAT = "alamat";
    public static final String ALUMNI_AGAMA = "agama";
    public static final String ALUMNI_TLP = "tlp";
    public static final String ALUMNI_THN_MASUK = "thn_masuk";
    public static final String ALUMNI_THN_LULUS = "thn_lulus";
    public static final String ALUMNI_PEKERJAAN = "pekerjaan";
    public static final String ALUMNI_JABATAN = "jabatan";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} */