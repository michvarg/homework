package com.company;

public class Monster {
    private String food;
    private String habitat;
    private String attackWeapons;

    public Monster(String food, String habitat, String attackWeapons){}

    public void setFood(String food){
        this.food = food;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public void setAttackWeapons(String attackWeapons){
        this.attackWeapons = attackWeapons;
    }

    public String getAttackWeapons() {
        return attackWeapons;
    }

    public String getFood() {
        return food;
    }

    public String getHabitat() {
        return habitat;
    }

    public void whoAmI(){
        System.out.println(" I am a " + Monster.class.getSimpleName() + " I live " +
                getHabitat() + " and I attack with" + getAttackWeapons());
    }

}
