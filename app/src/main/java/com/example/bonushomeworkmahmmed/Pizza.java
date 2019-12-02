package com.example.bonushomeworkmahmmed;

public class Pizza {
    private String name;
    private int imageResourceId;

    public static Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi)
    };

    private Pizza(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId= imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
