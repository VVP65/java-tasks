package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println();
/////////////////////////////////////
        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();
/////////////////////////////////////
        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 20) {
                break;
            }

        } while (count != 6);

        System.out.println();
/////////////////////////////////////
        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;
        int sumOfEvenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            sumOfEvenNumbersFound += number;

            evenNumberFound++;

            if (evenNumberFound >= 6) {
                break;
            }
        }

        System.out.println("Total even numbers found " + evenNumberFound);

        System.out.println("Sum of even numbers found " + sumOfEvenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}