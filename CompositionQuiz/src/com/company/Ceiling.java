package com.company;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int printedColor) {
        this.height = height;
        this.paintedColor = printedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}