//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//}

//  package org.pursuit;
//
//import java.util.Scanner;
//
//public class PathfinderGame {
//
//    Scanner scanner = new Scanner(System.in);
//    int tile;
//
//    public void startGame() {
//        logo();
//        instructions();
//        tile = 1;
//        input();
//        System.out.println("Tile: " + tile);
//        System.out.println();
//        checkValue(roll());
//
//    }
//
//    private void logo() {
//        System.out.println("Logo");
//    }
//
//    private void instructions() {
//        System.out.println("Instructions");
//    }
//
//    private void input() {
//        scanner.nextLine();
//    }
//
//    private int roll() {
//        int random = (int) Math.ceil(Math.random() * 10);
//        return random;
//    }
//
//    private void checkValue(int roll) {
//        System.out.println("You rolled: " + roll);
//
//        if (roll == 7) {
//            tile = tile + roll + roll();
//            System.out.println("You hit 7! " + roll);
//            System.out.println("your tiles are: " + tile);
//        } else if( roll == 10) {
//                System.out.println("You hit 10!");
//                int newRandom = roll();
//            if(tile <= 10 && newRandom >= tile) {
//                System.out.println("Landed on 10, but newRandom is greater or equal to tile: " + newRandom);
//                tile = 1;
//            }else {
//                tile = tile - newRandom;
//            }
//                System.out.println("Your tiles are: " + tile);
//        } else{
//            System.out.println("Nothing special, changing tile from " + tile + "to " + (tile + roll));
//            tile = tile + roll;
//            System.out.println("New Value: " + tile);
//        }
//
//    }
//}
//  package org.pursuit;
//
//public class Main {
//
//    public static void main(String[] args) {
//	//loop, random number generator, logic(if/else), Scanner for input, print Statements, Counter variables, classes
//        // instructions,  current tile - how many tiles left, Check for number 7 bonus, check for number 10 penalty, game over statement, PATHFINDER logo, play again
//        PathfinderGame PathfinderGame = new PathfinderGame();
//        PathfinderGame.startGame();
//    }
//
//}