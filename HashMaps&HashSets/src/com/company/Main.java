package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        private int[] numbers = new int[5]; // An array
//
//        private static Set numberSet = new hashSet<integer>();

        private static Set<Integer> numberSet = new HashSet<Integer>();
        private static Map<String, Integer> studentMap = new HashMap<String, Integer>();

        public static void main (String[]args){
            numberSet.add(Integer.valueOf(5));      // Adds an element "5" to the set
            numberSet.add(Integer.valueOf(10));     // Adds an element "10" to the set

            numberSet.add(Integer.valueOf(5));      // Won't change the size of the set because it's not a unique value
            numberSet.add(Integer.valueOf(10));     // Won't change the size of the set because it's not a unique value

            numberSet.contains(5);                  // Will only return whether this object exists in the set. Returns true/false
            numberSet.remove(5);                 // Will only return whether this object exists in the set AND was removed. Returns true/false

            studentMap.put("Rusi", 29);             // Adds a key, value pair of "Rusi" and 29
            studentMap.put("Student2", 19);         // Adds a key, value pair of "Student2" and 19
            studentMap.put("Student3", 30);         // Adds a key, value pair of "Student3" and 30

            studentMap.put("Rusi", 10);             // Will REPLACE the value of 29 that was previously associated with the key "Rusi"

            Integer value = studentMap.get("Rusi"); // Returns the value of the associated key "Rusi" (10 in this case) and saves it in the variable 'value'
        }


        // Prompt: Print out how many instances of each letter occrus in any given String.
        private static void printNumOfChars (String input){
            Map<Character, Integer> letterMap = new HashMap<>();

            for (int i = 0; i <= input.length() - 1; i++) {
                char letter = input.charAt(i);

                if (letterMap.containsKey(letter)) {
                    int value = letterMap.get(letter);
                    letterMap.put(letter, ++value);
                } else {
                    letterMap.put(input.charAt(i), 1);
                }

                letterMap.remove(' ');
            }

            System.out.println(letterMap);
        }


        // Methods for Sets:
        letterSet.add('a');         // Puts a new element 'a' into the Set
        letterSet.remove('a');   // Removes the element 'a' from the Set and returns true. If it doesn't exist, it returns false.
        letterSet.contains('a');    // Returns true/false depending on whether the value exists in the Set.

        // Methods for Maps:
        letterMap.put('a', 1);      // Puts a new Key,Value Pair in the Map. ('a', 1)
        letterMap.put('b', 1);      // Puts a new Key,Value Pair in the Map. ('b', 1)
        letterMap.get('a');         // Returns the value associated with the key 'a' (1)
        letterMap.containsKey('a'); // Returns true/false depending on whether there is a key 'a'
        letterMap.containsValue(1); // Returns true/false depending on whether there is a value 1
        letterMap.keySet();         // Returns all the Keys as a Set
        letterMap.values();         // Returns all the values as a Collection


    }

        // Prompt: Print out how many instances of each letter occrus in any given String.
        private static void printNumOfChars(String input) {
            Map<Character, Integer> letterMap = new HashMap<>(); // Creates an empty Map with a Character type key and Integer type value

            for (int i = 0; i <= input.length() - 1; i++) {      // Starts a for-loop from 0 to the last element of the input
                char letter = input.charAt(i);                   // Saves the character at the current index in a variable

                if (letterMap.containsKey(letter)) {             // Checks to see if the current letter is already a key in the Map
                    int value = letterMap.get(letter);           // If it does, get the value associated with the key
                    letterMap.put(letter, ++value);              // Put the key, value pair back in with the value increased by 1
                } else {                                         // Otherwise,
                    letterMap.put(input.charAt(i), 1);           // We know the letter doesn't exist, and so we're putting in 1 for the first time we encounter it
                }

                letterMap.remove(' ');                      // Removing the space character from the map
            }

            System.out.println(letterMap);                       // Prints out the map




//            input = input.toUpperCase().replaceAll(" ", "");     REMOVE SPACE FROM STRINGS !!




    }
