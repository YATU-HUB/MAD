package com.sp.habithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.content.Intent;
import android.view.MenuItem;
import androidx.annotation.NonNull;

import android.os.Bundle;

public class homepage extends AppCompatActivity {
    private BottomNavigationView navView;

    private int bottomSelectedMenu = R.id.stats;
    private int getBottomSelectedMenu = R.id.addHabit;
    private int TheBottomSelectedMenu = R.id.home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        //navView.setOnItemSelectedListener(menuSelected);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
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
                    startActivity(new Intent(getApplicationContext(), Stats.class));
                    overridePendingTransition(0,0);
                    return true;
                }
                return false;
            }
        });


    }
        /*@Override
                protected void onStart() {
            invalidateOptionsMenu();
            super.onStart();
        } */



}