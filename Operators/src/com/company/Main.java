package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 3; // 1+ 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println(("2 * 10 = " + result));

        result = result % 3; // the remainder of (20 % 3) = 1
        System.out.println("20 % 3 = " + result);

        // result = result + 1;
        result++; // 2 + 1 = 3
        System.out.println("2 + 1 = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
