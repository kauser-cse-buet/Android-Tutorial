package com.example.bonushomeworkmahmmed;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkDetailFragment extends Fragment {


    private int workoutId;

    public WorkDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            TextView name = (TextView) view.findViewById(R.id.textWorkoutTitle);
            TextView description = (TextView) view.findViewById(R.id.textWorkoutDescription);
            Workout workout = Workout.workouts[workoutId];
            name.setText(workout.getName());
            description.setText(workout.getDescription());
        }
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }
}
