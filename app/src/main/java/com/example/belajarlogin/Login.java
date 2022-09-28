package com.example.belajarlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private Button BtnLogin;
    private TextView User, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        BtnLogin = findViewById(R.id.ButtonLogin);
        User = findViewById(R.id.Username);
        Pass = findViewById(R.id.Password);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this, MainActivity.class);
                pindah.putExtra("Username", User.getText().toString());
                pindah.putExtra("Password", Pass.getText().toString());
                startActivity(pindah);
            }
        });
    }
}