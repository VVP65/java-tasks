package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(true, score, levelCompleted, bonus);
    }

    //    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver = true) { // the same is  just "gameOver" without "= true"
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score was: " + finalScore);
    //}
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) { // the same is  just "gameOver" without "= true"
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);

            return finalScore;
        } //else {
        return -1;
        //}
    }
}