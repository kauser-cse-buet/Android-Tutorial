package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Lecture6Activity extends AppCompatActivity {

    private AdapterView.OnItemClickListener myListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0){
                Intent intent = new Intent(parent.getContext(), DrinkCategoryActivity.class);
                startActivity(intent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture6);

        ListView listView = (ListView) findViewById(R.id.lecture6_listview);
        listView.setOnItemClickListener(myListener);
    }
}
