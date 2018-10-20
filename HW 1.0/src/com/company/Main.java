//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//} HOMEWORK ANSWERS

//1. public static int add(int param1, int param2){
//        return param1 + param2;
//        }
//
//2. public static void calculateAge(int birthYear, int currentYear){
//    int age=currentYear-birthYear;
//    int age2=age-1;
//    System.out.println("You are either "+age2+" or "+age);
//}
//3. public static boolean xo(String param1){
//    int countX=0;
//    int countO=0;
//    for(int i=0;i< param1.length();i++){
//        if (param1.charAt(i)=='X' || param1.charAt(i)=='x'){
//            countX++;
//        }
//        if (param1.charAt(i)=='o' || param1.charAt(i)=='O'){
//            countO++;
//        }
//    }
//    if(countO==countX){
//        return true;
//    }
//    else{
//        return false;
//    }

//4. public static boolean endsly(String param1){
//
//    boolean found=false;
//    String myString = param1.charAt(param1.length()-2)+""+param1.charAt(param1.length()-1);
//    System.out.println(myString);
//    if(myString.equals("ly")|| myString.equals("LY")) {
//        found = true;
//    }
//    return  found;
//
//}

//5.public static void main(String[] args) {
//
//    Scanner myScanner = new Scanner(System.in);
//    System.out.println("Enter a food: ");
//    String HipposFood;
//
//    while(true){
//        HipposFood = myScanner.nextLine();
//
//        if(HipposFood.charAt(0) == 'h' || HipposFood.charAt(0) == 'H'){
//            System.out.println("Yum!");
//            break;
//        }else {
//            System.out.println("Yuck!");
//            System.out.println("Enter a food:");
//        }
//    }
//}

//6. public static String elide(String param1){
//    String newString;
//    if(param1.length()>6){
//        newString=param1.substring(0,3)+"...";
//    }
//    else{
//        newString=param1;
//    }
//    return newString;
//}
