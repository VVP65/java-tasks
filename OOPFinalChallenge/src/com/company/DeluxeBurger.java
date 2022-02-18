package com.company;

public class DeluxeBurger extends Hamburger{


    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 15.00, "Brown");
        super.addFirstHamburgerAddition("Chips", 2.75);
        super.addSecondHamburgerAddition("Drink", 1.85);
    }

    @Override
    public void addFirstHamburgerAddition(String name, double price) {
        System.out.println("Can not add additional item to a deluxe burger");
    }

    @Override
    public void addSecondHamburgerAddition(String name, double price) {
        System.out.println("Can not add additional item to a deluxe burger");
    }

    @Override
    public void addThirdHamburgerAddition(String name, double price) {
        System.out.println("Can not add additional item to a deluxe burger");
    }

    @Override
    public void addFourthHamburgerAddition(String name, double price) {
        System.out.println("Can not add additional item to a deluxe burger");
    }
}
