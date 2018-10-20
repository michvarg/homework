package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




//static HashMap<Integer, String> evenMap = new HashMap<>();
//
//    public static void main(String[] args) {
//        evenMap.put(2, "Two");
//        evenMap.put(3, "Three");
//        evenMap.put(22, "Twenty two");
//        evenMap.put(31, "Thirty one");
//        evenMap.put(1, "One");
//        evenMap.put(15, "Fifteen");
//        evenMap.put(2000, "Two thousand");
//        evenMap.put(99, "Ninety nine");
//
//        //  printEvenValues(evenMap);
//    }
//
//    // Prompt: Given a Hashmap, if an Integer typed key is divisible by 2, print out its value
//    private static void printEvenValues(Map<Integer, String> inputMap) {
//        for (int key : inputMap.keySet()) {             // Iterate through the Set of keys
//            if (key % 2 == 0) {                         // If key is divisible by 2,
//                System.out.println(inputMap.get(key));  // Print out its value
//            }
//        }
//
//        for (String value : inputMap.values()){         // Iterate through the collection of values
//            // Do stuff
//        }
//    }


//   public class Main {
//
//   public static void main(String[] args) {
//       HashMap<String, Integer> cars = new HashMap<>();
//       cars.put("camaro", 1);
//       cars.put("charger", 2);
//       cars.put("silverado",3);
//       cars.put("range rover", 4);
//       cars.put("ferrari", 5);
//       cars.put("mercerdes", 6);
//       cars.put("bentley", 7);
//       cars.put("elantra", 8);
//       cars.put("porsche", 9);
//       cars.put("toyota", 10);
//       cars.put("hyundai", 11);
//       cars.put("honda", 12);
//       cars.put("accord", 13);
//       cars.put("bmw", 14);
//       cars.put("bumble bee", 15);
//       cars.put("hellcat", 16);
//       cars.put("audi", 17);
//       cars.put("acura", 18);
//       cars.put("lexus", 19);
//       cars.put("minivan", 20);
//
//       loopMethod(cars);
//   }
//
//   public static void loopMethod(HashMap <String, Integer> input){
//       for (String key:input.keySet()){
//           if(input.get(key)>10){
//               System.out.println(input.get(key));
//           }
//       }
//
//
//   }
//}