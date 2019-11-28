package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WorkoutDetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "WORKOUT_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_detail);

        WorkDetailFragment frag = (WorkDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_fragment);

        Intent intent = getIntent();
        int workoutId = intent.getIntExtra(EXTRA_WORKOUT_ID, 0);
        frag.setWorkoutId(workoutId);
    }
}
