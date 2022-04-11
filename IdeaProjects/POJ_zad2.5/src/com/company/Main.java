package com.company;

public class Main {

    public static void main(String[] args) {
    Wiatrak wiatrak = new Wiatrak();
    Wiatrak wiatr = new Wiatrak(10.23, false, 20, "blue");
        System.out.println(wiatr.printInfo());
        System.out.println(wiatrak.printInfo());

    }
}
