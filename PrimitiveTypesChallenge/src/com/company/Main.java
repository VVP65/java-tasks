package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 1000;
        int intValue = 10000;
        long longValue = (50000L + 10L * (byteValue + shortValue + intValue));

        System.out.println(longValue);

        short shortTotal = (short) (1000 + 2 * (byteValue + shortValue + intValue));

        System.out.println(shortTotal);
    }
}