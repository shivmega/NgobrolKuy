package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText etUserLog, etPassLog;
    private CardView btnLoginLog;
    private TextView lupaPassLog, regisLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserLog = findViewById(R.id.etUserLog);
        etPassLog = findViewById(R.id.etPassLog);
        btnLoginLog = findViewById(R.id.btnLoginLog);
        lupaPassLog = findViewById(R.id.lupaPassLog);
        regisLog = findViewById(R.id.regisLog);

        lupaPassLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ForgetActivity.class));
            }
        });

        regisLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        btnLoginLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ProfilePicActivity.class));
            }
        });
    }
}