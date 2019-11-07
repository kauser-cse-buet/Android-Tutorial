package com.example.bonushomeworkmahmmed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

public class HomeActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

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
        MenuItem menuItem = menu.findItem(R.id.action_share);
//        shareActionProvider = (ShareActionProvider) MenuItem
        shareActionProvider = (ShareActionProvider)MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Want to join me for a pizza?");

        return super.onCreateOptionsMenu(menu);
    }

    private void setShareActionIntent(String s) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, s);
        shareActionProvider.setShareIntent(intent);
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
