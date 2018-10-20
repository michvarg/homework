package com.company;

public class Squid extends Cephalopod implements Swimmer {
    private int tentacleCount;

    Squid( int tentacleCount) {
        this.tentacleCount = tentacleCount;
    }

    public void printCharacteristics(){
        System.out.println(" I am a Squid. We descended from Cephalopods. ");
    }




    @Override
    public void tentacleCount() {
        System.out.println(" Squid Tentacle Count: " + tentacleCount);

    }

    @Override
    public void Swimmer() {
        System.out.println(" I am swimming using my siphons and fins! ");
    }

    @Override
    public String swim() {
        return null;
    }
}

