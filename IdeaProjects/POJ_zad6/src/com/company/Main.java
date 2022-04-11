package com.company;

public class Main {

    public static void main(String[] args) {
        MyCircle moje_kolo = new MyCircle(10);
        System.out.println(moje_kolo.radius);
        System.out.println(moje_kolo.calculateCircuit());
        System.out.println(moje_kolo.calculateSurfaceArea());
        System.out.println(moje_kolo.calculateDiameter());
    }
}
