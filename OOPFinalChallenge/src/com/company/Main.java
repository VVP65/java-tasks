package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.65, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addFirstHamburgerAddition("Tomato", 0.27);
        hamburger.addSecondHamburgerAddition("Cheese", 0.65);
        hamburger.addThirdHamburgerAddition("Onion", 0.85);
        hamburger.addFourthHamburgerAddition("Meat", 0.25);
        System.out.println();
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addFirstHamburgerAddition("Egg", 0.56);
        healthyBurger.addFirstHealthyAddition("Onion", 0.23);
        System.out.println("Total healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
