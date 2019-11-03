package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Lecture5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture5);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final RadioGroup radio_group = (RadioGroup) findViewById(R.id.radio_group);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton checkedRadioButton = (RadioButton) findViewById(radio_group.getCheckedRadioButtonId());

                Toast.makeText(radioGroup.getContext(), checkedRadioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });


    }


    public void onToggleButtonClicked(View view) {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        boolean on = toggleButton.isChecked();
        if (on){
            Toast.makeText(this, "Beast", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Human", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickSwitch(View view) {
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        boolean on = switch1.isChecked();
        if (on){
            Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
        }
    }

    public void onCheckBoxClick(View view) {
        CheckBox checkbox = (CheckBox)findViewById(R.id.checkBox);

        boolean checked = checkbox.isChecked();

        if (checked){
            Toast.makeText(this, "Accepted", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Not accepted", Toast.LENGTH_SHORT).show();
        }
    }
}
