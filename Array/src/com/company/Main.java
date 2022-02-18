package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}

//        int[] myIntArray = new int[25];//Third method to initialize array wit FOR LOOP
//        for (int i = 0; i < myIntArray.length; i++) { // or for(int i = 0; i <10; i++)
//            myIntArray[i] = i * 10;
//        }
//        for (int i = 0; i < myIntArray.length; i++) {// or for(int i = 0; i <10; i++)
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }

//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};// Second method to initialize array

//        int[] myIntArray = new int[7];// First method to initialize array
//        myIntArray[0] = 50;// First method to initialize array
//        myIntArray[1] = 50;// First method to initialize array
//        myIntArray[2] = 50;// First method to initialize array
//        myIntArray[3] = 50;// First method to initialize array
//        myIntArray[4] = 50;// First method to initialize array
//        myIntArray[5] = 50;// First method to initialize array
//        myIntArray[6] = 50;// First method to initialize array
//        double[] myDoubleVariable = new double[6];
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[8]);
//        System.out.println(myIntArray[9]);

//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {// or for(int i = 0; i <10; i++)
//            System.out.println("Element " + i + ", value is " + array[i]);
//
//        }