package com.company;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int playerScore = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int highScoreTablePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScoreTablePosition);

        highScoreTablePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScoreTablePosition);

        highScoreTablePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Pet", highScoreTablePosition);

        highScoreTablePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tom", highScoreTablePosition);


//        int highScore = calculateScore(true, playerScore, levelCompleted, bonus);
//        System.out.println("Your final playerScore was: " + highScore);
//
//        playerScore = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(true, playerScore, levelCompleted, bonus);
//        System.out.println("Your final playerScore was: " + highScore);
    }

//    public static int calculateScore(boolean gameOver, int playerScore, int levelCompleted, int bonus) {
//
//        if (gameOver) { // the same is  just "gameOver" without "= true"
//            int finalScore = playerScore + (levelCompleted * bonus);
//            finalScore += 2000;
//
//            return finalScore;
//        }
//        return -1;
//    }

    public static void displayHighScorePosition(String playerName, int highScoreTablePosition) {
        System.out.println(playerName + " managed to get into position " + highScoreTablePosition + " on the high playerScore table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000)
//            return 1;
//        else if (playerScore >= 500)
//            return 2;
//        else if (playerScore >= 100)
//            return 3;
//        else
//            return 4;
        int position = 4; // assuming position 4 will ve returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}