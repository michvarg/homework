package com.company;

public class Car extends Vehical{
   private int wheel;
   private String model;

   public Car(int wheel, String model) {
      this.wheel = wheel;
      this.model = model;
   }

   public int getWheel() {
      return wheel;
   }

   public void setWheel(int wheel) {
      this.wheel = wheel;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }
}
