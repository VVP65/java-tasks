package com.company;

public class Main {

    public static void main(String[] args) {
        printEqual(1, 2, 1);
    }

    public static void printEqual(int myFirstInt, int mySecondInt, int myThirdInt) {
        if (myFirstInt < 0 || mySecondInt < 0 || myThirdInt < 0) {
            System.out.println("Invalid Value");
        } else if (myFirstInt == mySecondInt && myFirstInt == myThirdInt) {
            System.out.println("All numbers are equal");
        } else if (myFirstInt != mySecondInt && mySecondInt != myThirdInt && myFirstInt != myThirdInt) {
            System.out.println("All numbers are different");
        } else
            System.out.println("Neither all are equal or different");
    }
}