package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 33));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (!summer && (temperature >= 25 && temperature <= 35))
                || (summer && (temperature >= 25 && temperature <= 45));
    }
//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        int upperLimit = summer ? 45 : 35;
//        return temperature >= 25 && temperature <= upperLimit;
//    }
}