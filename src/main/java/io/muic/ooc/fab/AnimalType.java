package io.muic.ooc.fab;

import java.awt.*;

public enum AnimalType {
    RABBIT(0.15, Rabbit.class, Color.GREEN, 9),
    FOX(0.08, Fox.class, Color.BLUE, 18),
    TIGER(0.02, Tiger.class, Color.ORANGE, 32),
    HUNTER(0.001, Hunter.class, Color.RED, 0);

    private double breedingProbability;

    private Class animalClass;

    private Color color;

    private int foodValue;

    AnimalType(double breedingProbability, Class animalClass, Color color, int foodValue) {
        this.breedingProbability = breedingProbability;
        this.animalClass = animalClass;
        this.color = color;
        this.foodValue = foodValue;
    }

    public int getFoodValue() {
        return foodValue;
    }

    public double getBreedingProbability() {
        return breedingProbability;
    }

    public Class getAnimalClass() {
        return animalClass;
    }

    public Color getColor() {
        return color;
    }
}