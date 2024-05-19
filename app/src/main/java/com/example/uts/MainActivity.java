/* package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText emailTxt;
    private EditText pwdTxt;
    private TextView failedLbl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        emailTxt = findViewById(R.id.emailText);
        pwdTxt = findViewById(R.id.passwordText);
        Button loginBtn = findViewById(R.id.loginBtn);
        failedLbl = findViewById(R.id.failedLbl);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emailTxt.getText().toString().equals("admin@pnj.ac.id") && pwdTxt.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                }
                else {
                    failedLbl.setText("Login Gagal");
                }
            }
        });
    }
} */