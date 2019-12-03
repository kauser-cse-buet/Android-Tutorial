package com.example.bonushomeworkmahmmed;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkDetailFragment extends Fragment {


    private long workoutId;

    public WorkDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout-normal for this fragment
        return inflater.inflate(R.layout.fragment_work_detail, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            TextView name = (TextView) view.findViewById(R.id.textWorkoutTitle);
            TextView description = (TextView) view.findViewById(R.id.textWorkoutDescription);
            Workout workout = Workout.workouts[(int) workoutId];
            name.setText(workout.getName());
            description.setText(workout.getDescription());
        }
    }

    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("workoutId", workoutId);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null){
            workoutId = savedInstanceState.getLong("workoutId");
        }
    }
}
