package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
//        if (this.width < 0) {
//            this.width = 0;
//        } else {
//            this.width = width;
//        }
//        if (this.height < 0) {
//            this.height = 0;
//        } else {
//            this.height = height;
//        }
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    //  }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
//        if (this.width < 0) {
//            this.width = 0;
//        } else {
//            this.width = width;
//        }
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
//        if (this.height < 0) {
//            this.height = 0;
//        } else {
//            this.height = height;
//        }
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return this.width * this.height;
    }
}