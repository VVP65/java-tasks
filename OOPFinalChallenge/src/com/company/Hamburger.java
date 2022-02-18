package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String firstAdditionalName;
    private double firstAdditionalPrice;

    private String secondAdditionalName;
    private double secondAdditionalPrice;

    private String thirdAdditionalName;
    private double thirdAdditionalPrice;

    private String fourthAdditionalName;
    private double fourthAdditionalPrice;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addFirstHamburgerAddition(String name, double price) {
        this.firstAdditionalName = name;
        this.firstAdditionalPrice = price;
    }

    public void addSecondHamburgerAddition(String name, double price) {
        this.secondAdditionalName = name;
        this.secondAdditionalPrice = price;
    }

    public void addThirdHamburgerAddition(String name, double price) {
        this.thirdAdditionalName = name;
        this.thirdAdditionalPrice = price;
    }

    public void addFourthHamburgerAddition(String name, double price) {
        this.fourthAdditionalName = name;
        this.fourthAdditionalPrice = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll " + "price is " + this.price);

        if (this.firstAdditionalName != null) {
            hamburgerPrice += this.firstAdditionalPrice;
            System.out.println("Added " + this.firstAdditionalName + " for an extra " + this.firstAdditionalPrice);
        }

        if (this.secondAdditionalName != null) {
            hamburgerPrice += this.secondAdditionalPrice;
            System.out.println("Added " + this.secondAdditionalName + " for an extra " + this.secondAdditionalPrice);
        }

        if (this.thirdAdditionalName != null) {
            hamburgerPrice += this.thirdAdditionalPrice;
            System.out.println("Added " + this.thirdAdditionalName + " for an extra " + this.thirdAdditionalPrice);
        }

        if (this.fourthAdditionalName != null) {
            hamburgerPrice += this.fourthAdditionalPrice;
            System.out.println("Added " + this.fourthAdditionalName + " for an extra " + this.fourthAdditionalPrice);
        }

        return hamburgerPrice;
    }
}