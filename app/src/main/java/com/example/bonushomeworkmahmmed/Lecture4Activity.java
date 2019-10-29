package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class Lecture4Activity extends AppCompatActivity {
    private int totalSeconds = 0;
    private boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture4);
        if (savedInstanceState != null){
            totalSeconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
        }
        runTimer();

    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
    }

    public void onClickReset(View view) {
        totalSeconds = 0;
        running = false;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("seconds",totalSeconds);
        outState.putBoolean("running", running);
    }

    private void runTimer() {
        final TextView timeView = findViewById(R.id.textViewStopwatch);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int secondsToDisplay = totalSeconds  % 60;
                int totalMinutes = totalSeconds / 60;
                int minutesToDisplay = totalMinutes % 60;
                int totalHours = totalMinutes / 60;

                String time = String.format(Locale.getDefault(), "%d:%02d:%02d", totalHours, minutesToDisplay, secondsToDisplay);

                timeView.setText(time);
                if(running){
                    totalSeconds++;
                }
                handler.postDelayed(this, 1000);

            }
        });

//...more code to come...
    }

}
