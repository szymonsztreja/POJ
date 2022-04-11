package com.company;

public class MyCircle {

    double radius;

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double calculateCircuit() {
        return 3.14*2*radius;
    }

    public double calculateSurfaceArea() {
        return Math.pow(radius,2)*3.14;
    }

    public double calculateDiameter() {
        return 2*radius;
    }
}
