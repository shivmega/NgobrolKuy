package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class CheckActivity extends AppCompatActivity {

    private ImageButton btnCheckForget;
    private CardView btnCheckLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        btnCheckForget = findViewById(R.id.btnCheckForget);
        btnCheckLog = findViewById(R.id.btnCheckLog);

        btnCheckLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckActivity.this, LoginActivity.class));

            }
        });
        btnCheckForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckActivity.this, ForgetActivity.class));
            }
        });
    }
}