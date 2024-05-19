package pnj.uts.ti.zakirio_hugoraazaq_wasis;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class TambahData extends AppCompatActivity {

    EditText nimTxt, namaTxt, tmptLahirTxt, alamatTxt, agamaTxt, tlpTxt, thnMasukTxt, thnLulusTxt, pekerjaanTxt, jabatanTxt;
    Button btn, tglLahirTxt;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tambah_data);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nimTxt = findViewById(R.id.txtNIM);
        namaTxt = findViewById(R.id.txtNama);
        tmptLahirTxt = findViewById(R.id.txtTmptLahir);
        tglLahirTxt = findViewById(R.id.txtTglLahir);
        tglLahirTxt.setText(getTodaysDate());
        alamatTxt = findViewById(R.id.txtAlamat);
        agamaTxt = findViewById(R.id.txtAgama);
        tlpTxt = findViewById(R.id.txtTlp);
        thnMasukTxt = findViewById(R.id.txtThnMasuk);
        thnLulusTxt = findViewById(R.id.txtThnLulus);
        pekerjaanTxt = findViewById(R.id.txtPekerjaan);
        jabatanTxt = findViewById(R.id.txtJabatan);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHelper helper = new DbHelper(TambahData.this);
                helper.addAlumni(nimTxt.getText().toString().trim(), namaTxt.getText().toString().trim(), tmptLahirTxt.getText().toString().trim(),
                        tglLahirTxt.getText().toString().trim(), alamatTxt.getText().toString().trim(), agamaTxt.getText().toString().trim(),
                        tlpTxt.getText().toString().trim(), thnMasukTxt.getText().toString().trim(), thnLulusTxt.getText().toString().trim(),
                        pekerjaanTxt.getText().toString().trim(), jabatanTxt.getText().toString().trim());
            }
        });
    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String date = makeDateString(day, month, year);
                tglLahirTxt.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = 2;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);
    }

    private String makeDateString(int day, int month, int year) {
        return day + " " + getMonthFormat(month) + " " + year;
    }

    private String getMonthFormat(int month) {
        if (month == 1)
            return "Jan";
        else if (month == 2)
            return "Feb";
        else if (month == 3)
            return "Mar";
        else if (month == 4)
            return "Apr";
        else if (month == 5)
            return "May";
        else if (month == 6)
            return "Jun";
        else if (month == 7)
            return "Jul";
        else if (month == 8)
            return "Aug";
        else if (month == 9)
            return "Sep";
        else if (month == 10)
            return "Oct";
        else if (month == 11)
            return "Nov";
        else
            return "Dec";
    }

    private String getTodaysDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }

    public void openDatePicker(View view) {
        datePickerDialog.show();
    }
}