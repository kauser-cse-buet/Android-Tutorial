package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Lecture3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture3);
    }

    public void onClickSend(View view){
        EditText editTextSend = (EditText) findViewById(R.id.editTextSend);
        String text = editTextSend.getText().toString();
        Intent intent = new Intent(this, Lecture3RecieveActivity.class);
        intent.putExtra("text", text);
        startActivity(intent);
    }
}
