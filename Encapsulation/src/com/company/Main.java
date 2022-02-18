package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 19;
//        player.lostHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 19;
//        //player.health = 2000;
//        player.lostHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
// IT IS A WRONG DESIGN!!!!!
        //Lets create an encapsulated one in Enhanced Player Class!!!

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
