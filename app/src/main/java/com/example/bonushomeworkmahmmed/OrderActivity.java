package com.example.bonushomeworkmahmmed;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class OrderActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }

    public void onClickDone(View view) {
        String text = "Hello I am a snackbar";
        int duration = Snackbar.LENGTH_SHORT;
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinator), text, duration);
        Log.d("Tag", "FAB clicked!!!");
        snackbar.setAction("Undo", new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(OrderActivity.this, "Undone!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        snackbar.show();
    }
}
