package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomeChatActivity extends AppCompatActivity {
    private ImageButton btnSetting;
    private ImageView fotoYudi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
        btnSetting = findViewById(R.id.btnSetting);
        fotoYudi = findViewById(R.id.fotoyudi);
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChatActivity.this, SettingActivity.class));
            }
        });
        fotoYudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChatActivity.this, ChatYudiActivity.class));
            }
        });
    }
}