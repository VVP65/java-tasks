package com.company;

import java.util.SplittableRandom;

public class Lamp {
    private String style;
    private boolean battery;
    private int globeRating;

    public Lamp(String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public void turOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}