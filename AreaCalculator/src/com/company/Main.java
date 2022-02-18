package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(10));
        System.out.println(area(10, 20));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        double circleArea = radius * radius * Math.PI;

        return circleArea;
    }

    public static double area(double x, double y) {
        if ((x < 0 || y < 0) || (x < 0 && y < 0)) {
            return -1.0;
        }

        double triangleArea = x * y;

        return triangleArea;
    }
}

//public class AreaCalculator {
//    public static double area(double radius) {
//        return (radius < 0) ? -1 : radius * radius * Math.PI;
//    }
//
//    public static double area(double x, double y) {
//        return (x < 0 || y < 0) ? -1 : x * y;
//    }
//}