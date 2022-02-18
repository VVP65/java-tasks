package com.company;

public class HealthyBurger extends Hamburger {

    private String firstHealthyExtraName;
    private double firstHealthyExtraPrice;

    private String secondHealthyExtraName;
    private double secondHealthyExtraPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addFirstHealthyAddition(String name, double price) {
        this.firstHealthyExtraName = name;
        this.firstHealthyExtraPrice = price;
    }

    public void addSecondHealthyAddition(String name, double price) {
        this.secondHealthyExtraName = name;
        this.secondHealthyExtraPrice = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.firstHealthyExtraName != null) {
            hamburgerPrice += this.firstHealthyExtraPrice;
            System.out.println("Added " + this.firstHealthyExtraName + " for an extra " + this.firstHealthyExtraPrice);
        }

        if (this.secondHealthyExtraName != null) {
            hamburgerPrice += this.secondHealthyExtraPrice;
            System.out.println("Added " + this.secondHealthyExtraName + " for an extra " + this.secondHealthyExtraPrice);
        }

        return hamburgerPrice;
    }
}