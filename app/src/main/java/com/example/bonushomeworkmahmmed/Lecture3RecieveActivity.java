package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Lecture3RecieveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture3_recieve);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");

        TextView textViewRecieved = (TextView) findViewById(R.id.textViewRecieved);
        textViewRecieved.setText(text);
    }
}
