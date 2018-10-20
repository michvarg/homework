//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//}

//  NOTES ON SCANNER

//  /** Scanner is a class in java that has to be imported into your current class in order to be used**/
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        /** While loop counts down from 10 to 1. The if statement ends the loop prematurely when count hits 5 **/
//        int count = 10;
//        while (count > 0) {
//            System.out.println("This works: " + count);
//            count--;
//            if (count == 5) {
//                System.out.println("Weve reached: " + count);
//                break;
//            }
//        }
//
//        int otherCount = 10;
//        /**Does the same thing as the first loop. **/
//        do {
//            System.out.println("This Works: " + otherCount);
//            otherCount--;
//        } while (otherCount > 0);
//
//        /**The difference between a do - while loop and a while loop is that the
//         * code that is within the do code block is guaranteed to execute at least once even if the loop conditional is false if the conditional of a
//         * simple while loop is false it would not run **/
//        boolean truthy = true;
//        do {
//            System.out.println("This will print just once, and the while loop will not run, because its condition evaluates to false.");
//        } while (truthy == false);
//
//        while (truthy == false) {
//            System.out.println("This will print just once, and the while loop will not run, because its condition evaluates to false.");
//        }
//
//        /**To us a Scanner it has to be initialized give the variable a name and set it equal to new Scanner(System.in) System.in stands for system input**/
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//
//        /**Saves input into a variable nextInt() saves the first integer found by the scanner**/
//        /**Scanner has a variety of ways to process user input .nextLine() captures the entire line of input .next() captures up till a space is found etc etc*/
//        int number = keyboard.nextInt();
//        System.out.println(number);
//        System.out.println(number + 2);
//    }
//}