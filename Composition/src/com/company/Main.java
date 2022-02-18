package com.company;

public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(2540, 1140);
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, resolution); // or delete line 6
        // and paste new Resolution(2540, 1140) right into class instance parameters instead of "resolution"
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        Wall firstWall = new Wall("West");
        Wall secondWall = new Wall("East");
        Wall thirdWall = new Wall("South");
        Wall fourthWall = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 2);

        Lamp lamp = new Lamp("Classic", false, 76);

        Bedroom bedRoom = new Bedroom("Vovas", firstWall, secondWall, thirdWall, fourthWall, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turOn();
    }
}