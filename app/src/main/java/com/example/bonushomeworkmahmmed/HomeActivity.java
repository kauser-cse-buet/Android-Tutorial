package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickLecture2Button(View view){
        Intent intent = new Intent(this, Lecture2Activity.class);
        startActivity(intent);
    }

    public void onClickLecture3Button(View view){
        Intent intent = new Intent(this, Lecture3Activity.class);
        startActivity(intent);
    }

    public void onClickLecture4Button(View view) {
        Intent intent = new Intent(this, Lecture4Activity.class);
        startActivity(intent);
    }
}
