package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 126));
    }

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || secondNumber < 10) {
            return -1;
        }

        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber)
                firstNumber = firstNumber - secondNumber;
            else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return secondNumber;
    }
}