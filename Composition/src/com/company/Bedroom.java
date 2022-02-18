package com.company;

public class Bedroom {
    private String name;
    private Wall firstWall;
    private Wall secondWall;
    private Wall thirdWall;
    private Wall fourthWall;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall firstWall, Wall secondWall, Wall thirdWall, Wall fourthWall, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.firstWall = firstWall;
        this.secondWall = secondWall;
        this.thirdWall = thirdWall;
        this.fourthWall = fourthWall;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.makeBed();
    }
}