package com.company;

public class Main {

    public static void main(String[] args) {
        //calculateFeetAndInchesToCentimeters(6, 1);

        calculateFeetAndInchesToCentimeters(157);
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <= 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid parameters range");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches are equal to " + feet + " feet and " + remainingInches + " inches");
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }
}