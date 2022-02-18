package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(21100500);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {

            long years = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long days = remainingMinutes / 1440;

            // 15 + 16 can be merged into one like this: long days = (minutes % 526600) / 1440;


            System.out.println(minutes + " min = " + years + " years and " + days + " days");
        }
    }
}
