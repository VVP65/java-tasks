package com.company;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;

        //this.hitPoints = hitPoints > 0 && hitPoints <= 100 ? hitPoints : 0;
        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void lostHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints < 0) {
            System.out.println("Player knocked out");
            // Reduce number of Lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}