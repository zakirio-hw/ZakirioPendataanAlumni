package pnj.uts.ti.zakirio_hugoraazaq_wasis;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAlumni extends AppCompatActivity {

    RecyclerView recyclerView;

    DbHelper helper;
    ArrayList<String> nim, nama;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_data_alumni);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView.findViewById(R.id.recycler_view);

        helper = new DbHelper(DataAlumni.this);
        nim = new ArrayList<>();
        nama = new ArrayList<>();

        storeDataInArrays();

        customAdapter = new CustomAdapter(DataAlumni.this, nim, nama);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(DataAlumni.this));
    }

    void storeDataInArrays() {
        Cursor cursor = helper.readAllData();
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()) {
                nim.add(cursor.getString(0));
                nama.add(cursor.getString(1));
            }
            Toast.makeText(this, "Got " + nim.size() + " data.", Toast.LENGTH_SHORT).show();
        }
    }
}