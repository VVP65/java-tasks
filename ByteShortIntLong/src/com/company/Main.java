package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value: " + myMinIntValue);
        System.out.println("Integer Max Value: " + myMaxIntValue);
        System.out.println("Busted Integer Max Value: " + (myMaxIntValue + 1));
        System.out.println("Busted Integer Min Value: " + (myMinIntValue - 1));

        int myMaxItnValue = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min Byte Value: " + myMinByteValue);
        System.out.println("Max Byte Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);

        long myShortValue = 100;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Min Value: " + myMinLongValue);
        System.out.println("Long Max Value: " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_123L;

        System.out.println(bigLongLiteralValue);

        short bigSgortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}