package com.company;

public class Wiatrak {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private double speed;
    private boolean on;
    private int radius;
    private String color;

    public Wiatrak(double speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = false;
        this.radius = radius;
        this.color = color;
    }

    public Wiatrak() {
        speed = 1;
        on = false;
        radius = 10;
        color = "white";
    }

    public double getSpeed(){
        return speed;
    }

    public boolean getOn(){
        return on;
    }
    public int getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public String printInfo(){
        return
                "Wiatrak: \n" + "Speed: " + speed + "\n"
                              + "Status: " + on + "\n"
                        + "Radius: " + radius + "\n"
                        + "Color: " + color + "\n";
    }


}
