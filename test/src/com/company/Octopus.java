package com.company;

public class Octopus extends Cephalopod implements Swimmer {
    private int tentacleCount;

    Octopus(int tentacleCount) {
        this.tentacleCount = tentacleCount;
    }

    public int getTentacleCount() {
        return tentacleCount;
    }

    public void printCharacteristics() {
        System.out.println(" I am a Octopus. We desecended from Cephalopods. ");


    }

    @Override
    public void tentacleCount() {
        System.out.println("Octopus Tentacle Count: " + tentacleCount);
    }

    @Override
    public void Swimmer() {
        System.out.println(" I am swimming using only my siphons! ");
    }


    @Override
    public String swim() {
        return null;
    }
}
