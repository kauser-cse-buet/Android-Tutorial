package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WorkoutDetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_detail);

        WorkDetailFragment frag = (WorkDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_fragment);

        Intent intent = getIntent();
        int workoutId = (int)intent.getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkoutId(workoutId);
    }
}
