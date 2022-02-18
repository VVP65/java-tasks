package com.company;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void lostHealth(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            System.out.println("Player knocked out");
            // Reduce number of Lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}