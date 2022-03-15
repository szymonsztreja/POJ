package com.company;

public class Punkt {
    int x,y;

    public Punkt() {
        x = 0;
        y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void distance(int x2, int y2) {
        double d = Math.sqrt(Math.pow(x-x2,2)) + Math.sqrt(Math.pow(y-y2,2));
        System.out.println(d);
    }


    public void view() {
        System.out.println(String.format("(%d,%d)", x,y));
    }
}
