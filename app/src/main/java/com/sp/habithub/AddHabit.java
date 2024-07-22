package com.sp.habithub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;

public class AddHabit extends AppCompatActivity implements View.OnClickListener {

    public CardView Workoutcard, Readingcard, Sleepcard, Watercard ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_habit);

        Workoutcard = (CardView) findViewById(R.id.workoutcard1);

        Readingcard = (CardView) findViewById(R.id.readingcard1);

        Sleepcard = (CardView) findViewById(R.id.sleepcard1);
        Watercard = (CardView) findViewById(R.id.watercard1);



        Workoutcard.setOnClickListener(this);
        Readingcard.setOnClickListener(this);
        Sleepcard.setOnClickListener(this);
        Watercard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(AddHabit.this, WorkoutActivity.class);
        startActivity(intent);

        /*switch (v.getId()) {
            case R.id.workoutcard1 :
                intent = new Intent(this, WorkoutActivity.class);
                startActivity(intent);
                break;

            case R.id.readingcard1 :
                intent = new Intent(this, WorkoutActivity.class);
                startActivity(intent);
                break;

            case R.id.sleepcard1 :
                intent = new Intent(this, WorkoutActivity.class);
                startActivity(intent);
                break;

            case R.id.watercard1 :
                intent = new Intent(this, WorkoutActivity.class);
                startActivity(intent);
                break;

        }*/

        //Intent intent = new Intent(AddHabit.this, WorkoutActivity.class);
        //startActivity(intent);

    }
}