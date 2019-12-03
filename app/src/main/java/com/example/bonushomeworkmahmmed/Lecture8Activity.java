package com.example.bonushomeworkmahmmed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

public class Lecture8Activity extends AppCompatActivity implements Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture8);
    }

    @Override
    public void itemClicked(int id){

        View fragmentContainer = findViewById(R.id.fragment_container);
        if(fragmentContainer != null){
            WorkDetailFragment details = new WorkDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWorkoutId(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();


        }
        else{
            Intent intent = new Intent(this, WorkoutDetailActivity.class);
            intent.putExtra(WorkoutDetailActivity.EXTRA_WORKOUT_ID, (int)id);
            startActivity(intent);
        }

    }
}
