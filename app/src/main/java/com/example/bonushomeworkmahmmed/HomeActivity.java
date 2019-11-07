package com.example.bonushomeworkmahmmed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    public void onClickLecture5Button(View view) {
        Intent intent = new Intent(this, Lecture5Activity.class);
        startActivity(intent);
    }

    public void onClickLecture6Button(View view) {
        Intent intent = new Intent(this, Lecture6Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
