package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int count  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClickHandler(View view){
        Log.d("Test", "Button was clicked.");
        TextView textViewCounter = (TextView) findViewById(R.id.textViewCounter);
        textViewCounter.setText("Number of clicks: " + count);
        count++;
    }
}
