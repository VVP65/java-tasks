package com.company;

//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(sumFirstAndLastDigit(123654));
//    }
//
//    public static int sumFirstAndLastDigit(int number) {
//        if (number < 0) {
//            return -1;
//        }
//
//        int lastDigit = number % 10;
//        while (number > 9) {
//        number /= 10;
//        }
//        return lastDigit + number;
//    }
//}
public class Main {
    public static void main(String args[]) {
        int number = 502356999;
        int firstDigit = 0;
        int lastDigit;

        lastDigit = number % 10;
        System.out.println("Last digit: " + lastDigit);

        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        System.out.println("First digit: " + firstDigit);
    }
}