package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11 , 22 , 31));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber < 10 || secondNumber > 1000)
                || (thirdNumber < 10 || thirdNumber > 1000)) {
            return false;
        } else {
            return (((firstNumber % 10 == secondNumber % 10) && (secondNumber % 10 == thirdNumber % 10))
                    || (firstNumber % 10 == secondNumber % 10) || (secondNumber % 10 == thirdNumber % 10) || (firstNumber % 10 == thirdNumber % 10));
        }
    }

    public static boolean isValid(int number){

        return number >= 10 && number <= 1000;
    }
}