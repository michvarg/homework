package com.company;

public class FruitBat implements Flier {

    private String food;
    private String sleepStyle;
    private String home;

    FruitBat() {
    }

    FruitBat(String food, String sleepStyle, String home) {
        this.food = food;
        this.sleepStyle = sleepStyle;
        this.home = home;
    }

    public String getFood(){
    return food;
    }
    public String getSleepStyle(){
        return sleepStyle;
    }
    public String getHome(){
        return home;
    }
    public void printCharacteristics(){
        System.out.println(" I am a " + getClass().getSimpleName() + ". I like to eat " + food + " I am " + sleepStyle + " I live in a " + home + ".");
    }

    @Override
    public void fly() {
        System.out.println(" I am flying using leathery wings! ");
    }
}