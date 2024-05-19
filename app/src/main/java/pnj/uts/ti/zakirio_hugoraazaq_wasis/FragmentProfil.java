/* package pnj.uts.ti.zakirio_hugoraazaq_wasis;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentProfil extends AppCompatActivity {

    private TextView txtNama, txtNIM, txtEmail, txtKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profil);
        txtNama = findViewById(R.id.txtNama);
        txtNIM = findViewById(R.id.txtNIM);
        txtEmail = findViewById(R.id.txtEmail);
        txtKelas = findViewById(R.id.txtKelas);

        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref_Profile", MODE_PRIVATE);
        String nama = sharedPreferences.getString("nama", "");
        String nim = sharedPreferences.getString("nim", "");
        String email = sharedPreferences.getString("email", "");
        String kelas = sharedPreferences.getString("kelas", "");

        txtNama.setText(nama);
        txtNIM.setText(nim);
        txtEmail.setText(email);
        txtKelas.setText(kelas);
    }
}

 */
