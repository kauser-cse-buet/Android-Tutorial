package com.example.bonushomeworkmahmmed;

import androidx.annotation.NonNull;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "espresso shots with steamed milk.", R.drawable.latte),
            new Drink("Cappuccino", "espresso, hot milk, and foam.", R.drawable.cappuccino),
            new Drink("Filter", "Quality beans roasted and brewed fresh", R.drawable.filter)
    };

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}
