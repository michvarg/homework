package com.company;

public class Parrot extends Bird implements Flier {
private String food;//Fields
private int lifespan;
private String biome;

Parrot(){}//Default Constructor

Parrot(String food, int lifespan, String biome){//Custom Constructor
    this.food = food; //Fields = Parameters
    this.lifespan = lifespan;
    this.biome = biome;
}
public String getFood(){
    return food;
}
public int getLifespan(){
    return lifespan;
}
public String getBiome(){
    return biome;
}
public void printCharacteristics(){
    System.out.println(" I am a Parrot. I like to eat " + food + " I live in a " + biome + "I can live to be about " + lifespan + " years.");
}

    @Override
    public void fly() {
        System.out.println(" I am flying using colorful feathers! ");
    }
}
