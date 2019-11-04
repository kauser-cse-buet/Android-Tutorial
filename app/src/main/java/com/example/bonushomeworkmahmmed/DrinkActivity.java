package com.example.bonushomeworkmahmmed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkId = getIntent().getIntExtra(EXTRA_DRINKID, -1);

        Drink drink = Drink.drinks[drinkId];

        TextView textViewDrinkName = (TextView) findViewById(R.id.textViewDrinkName);
        textViewDrinkName.setText(drink.getName());

        TextView textViewDrinkDescription = (TextView) findViewById(R.id.textViewDrinkDescription);
        textViewDrinkDescription.setText(drink.getDescription());

        ImageView imageViewDrink = (ImageView) findViewById(R.id.imageViewDrink);
        imageViewDrink.setImageResource(drink.getImageResourceId());
        imageViewDrink.setContentDescription(drink.getName());
    }
}
