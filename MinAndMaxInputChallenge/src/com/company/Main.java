package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0; // or set max int to 2_147_483_647 (or Integer.MAX_VALUE) and comment 13th + 22 to 26
        int max = 0; // or set min int to -2_147_483_648 (Integer.MIN_VALUE) and comment 13th + 22 to 26
        boolean first = true;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); //handle input (enter key)
        }

        System.out.println("min=" + min + ". max=" + max);
        scanner.close();
    }
}