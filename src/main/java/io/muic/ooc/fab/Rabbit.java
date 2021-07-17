package io.muic.ooc.fab;

import java.util.List;
import java.util.Random;

public class Rabbit extends Animal {
    // Characteristics shared by all rabbits (class variables).

    // The age at which a rabbit can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a rabbit can live.
    private static final int MAX_AGE = 40;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;

    @Override
    public Location moveToNewLocation() {
        return field.freeAdjacentLocation(getLocation());
    }

    @Override
    protected double getBreedingProbability() {
        return AnimalType.RABBIT.getBreedingProbability();
    }

    @Override
    protected int getMaxLitterSize() {
        return MAX_LITTER_SIZE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected int getBreedingAge() {
        return BREEDING_AGE;
    }
}