package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Miles   Kilometers");

        double miles = 1.609;
        for( int i = 1; i <= 10 ; i++)
        {
            System.out.print(i);
            System.out.print("\t");
            System.out.println(i*miles);
        }
    }
}
