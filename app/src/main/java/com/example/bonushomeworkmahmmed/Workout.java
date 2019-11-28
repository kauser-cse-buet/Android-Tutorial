package com.example.bonushomeworkmahmmed;

public class Workout {
    private String name;
    private String description;
    private long workoutId;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "Stretches and Stuff"),
            new Workout("Core Agony", "Core Stuff"),
            new Workout("Pushmi Pullyou", "Pull ups and stuff"),
            new Workout("Strength Training", "Strength Stuff")
    };

    public Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }

    public String toString(){
        return name;
    }
}
