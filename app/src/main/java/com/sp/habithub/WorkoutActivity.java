package com.sp.habithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class WorkoutActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView workoutcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        workoutcard = (CardView) findViewById(R.id.workoutcard1);

        workoutcard.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

    }


}