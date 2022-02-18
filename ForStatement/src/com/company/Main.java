package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
//        System.out.println("10,000 at 6% interest = " + calculateInterest(10000.0, 6.0));
//        System.out.println("10,000 at 7% interest = " + calculateInterest(10000.0, 7.0));
//        System.out.println("10,000 at 8% interest = " + calculateInterest(10000.0, 8.0));
//        System.out.println();

//        for (int i = 2; i < 9; i++) {
//
//            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
//            System.out.println();
//            System.out.println("10,000 at " + i + "% interest = "
//                    + String.format("%.2f", calculateInterest(10000.0, i))); // to define exact amount of decimal points
//            System.out.println();
//
//        }
//
//        for (int i = 8; i >= 2; i--) {
//
//            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
//            System.out.println();
//            System.out.println("10,000 at " + i + "% interest = "
//                    + String.format("%.2f", calculateInterest(10000.0, i))); // to define exact amount of decimal points
//
//        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        //for (int i = 2; i <= n / 2; i++) {
             for (int i = 2; i <= (long) Math.sqrt(n); i++) {
                 System.out.println("Looping " +i);
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}