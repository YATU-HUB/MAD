package com.sp.habithub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.graphics.Bitmap;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class Stats extends AppCompatActivity {

    private static final int REQUEST_CODE = 22;

    private static final int REQUEST_IMAGE_CAPTURE = 123;

    private Button btnpicture;
    private ImageView profilepic;

    public void captureImage(View view) {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.CAMERA},REQUEST_CODE );
            return;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        //navView.setOnItemSelectedListener(menuSelected);
        bottomNavigationView.setSelectedItemId(R.id.stats);

        btnpicture = findViewById(R.id.btncamera_id);
        profilepic = findViewById(R.id.mypic);

        btnpicture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE);

            }

        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    startActivity(new Intent(getApplicationContext(), homepage.class));
                    overridePendingTransition(0,0);
                    return true;
                    //Intent intent = new Intent(homepage.this, homepage.class);
                    //startActivity(intent);
                } else if (id == R.id.addHabit) {
                    startActivity(new Intent(getApplicationContext(), AddHabit.class));
                    overridePendingTransition(0,0);
                    //Intent intent = new Intent(homepage.this, AddHabit.class);
                    //startActivity(intent);
                    return true;
                } else if (id == R.id.stats) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap photo = (Bitmap)data.getExtras().get("data");
        profilepic.setImageBitmap(photo);

    }
}