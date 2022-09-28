package com.example.belajarlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button kembali;
    TextView textUser, textPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String username = getIntent().getExtras().getString("Username");
        String password = getIntent().getExtras().getString("Password");

        textUser = findViewById(R.id.hasilUser);
        textPass = findViewById(R.id.hasilPass);

        textUser.setText("User : " + username);
        textPass.setText("Pass : " + password);

        kembali = findViewById(R.id.btnKembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Login.class);
                startActivity(pindah);
            }
        });
    }
}