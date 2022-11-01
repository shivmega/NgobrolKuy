package com.responsi.ngobrolkuy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class ProfilePicActivity extends AppCompatActivity {

    private ImageButton btnEditPic;
    private ImageView profilePic;
    private CardView btnPicChat;
    private static final String TAG = ProfilePicActivity.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        btnEditPic = findViewById(R.id.btnEditPic);
        profilePic = findViewById(R.id.profilePic);
        btnPicChat = findViewById(R.id.btnPicChat);
        btnPicChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilePicActivity.this, HomeChatActivity.class));
            }
        });
        btnEditPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI), GALLERY_REQUEST_CODE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_CANCELED){
            Toast.makeText(this, "Cancel Input image", Toast.LENGTH_SHORT).show();
            return;
        }else if (requestCode == GALLERY_REQUEST_CODE){
            if(data != null){
                try {
                    Uri imageuri = data.getData();
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageuri);
                    profilePic.setImageBitmap(bitmap);
                }catch (IOException e){
                    Toast.makeText(this, "can't Load Images", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, e.getMessage());
                }

            }
        }

    }

}