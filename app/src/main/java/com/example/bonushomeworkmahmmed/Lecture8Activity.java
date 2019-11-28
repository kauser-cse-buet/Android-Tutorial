package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Lecture8Activity extends AppCompatActivity implements Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture8);
    }

    @Override
    public void itemClicked(int id){
        Intent intent = new Intent(this, WorkoutDetailActivity.class);
        intent.putExtra(WorkoutDetailActivity.EXTRA_WORKOUT_ID, id);
        startActivity(intent);

    }
}
