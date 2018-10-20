package com.company;

public class Werewolf extends Monster {

    public Werewolf (String food, String habitat, String attackWeapons){
    super(food, habitat, attackWeapons);
    }
    private String transformationTime;

    public String getTransformationTime(){
        return transformationTime;
    }

    public void setTransformationTime(String transformationTime){
        this.transformationTime = transformationTime;
    }
}


