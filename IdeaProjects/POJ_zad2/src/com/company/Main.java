package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int celsius = scan.nextInt();
        float fahrenheit = (9 / 5) * celsius + 32;
        System.out.println(fahrenheit);
    }
}
