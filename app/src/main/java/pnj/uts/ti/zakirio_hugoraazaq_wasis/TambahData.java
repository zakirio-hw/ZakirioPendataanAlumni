package pnj.uts.ti.zakirio_hugoraazaq_wasis;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TambahData extends AppCompatActivity {

    EditText nimTxt, namaTxt, tmptLahirTxt, tglLahirTxt, alamatTxt, agamaTxt, tlpTxt, thnMasukTxt, thnLulusTxt, pekerjaanTxt, jabatanTxt;
    Button btn;

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
                helper.addBook(nimTxt.getText().toString().trim(), namaTxt.getText().toString().trim(), tmptLahirTxt.getText().toString().trim(),
                        tglLahirTxt.getText().toString().trim(), alamatTxt.getText().toString().trim(), agamaTxt.getText().toString().trim(),
                        tlpTxt.getText().toString().trim(), thnMasukTxt.getText().toString().trim(), thnLulusTxt.getText().toString().trim(),
                        pekerjaanTxt.getText().toString().trim(), jabatanTxt.getText().toString().trim());
            }
        });
    }
}