package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigits(10, 10));
    }

    private static boolean hasSharedDigits(int firstNumber, int secondNumber) {

        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        } else {
            return ((firstNumber / 10 == secondNumber / 10) || (firstNumber / 10 == secondNumber % 10)
                    || (secondNumber / 10 == firstNumber % 10) || (firstNumber % 10 == secondNumber % 10));
        }
    }
}