package com.company;

public class Vampire extends Monster {

    public Vampire(String food, String habitat, String attackWeapons){
        super(food, habitat, attackWeapons);
    }

    private String weakness;

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness){
        this.weakness = weakness;
    }
}
