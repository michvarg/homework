package com.company;

public class Main {

    public static void main(String[] args) {
//	Flier bird = new Flier() {
//        @Override
//        public void fly() {
//            System.out.println(" I am a Parrot, and I fly with colorful feathers on my wings! But I'm anonymous, so you probably didn't know that.... ");
//        }
//    };
        Mogwai gremlin = new Mogwai(){
            public boolean gremlin(){
                System.out.println(" I am now a Gremlin! Someone poured water on me, and fed me after midnight! Muahahahahaha!!!!! ");
                return true;
            }
        };
    }
}
