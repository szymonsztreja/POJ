package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    int dzien_tygodnia = scan.nextInt();
    switch (dzien_tygodnia)
    {
        case 1:
            System.out.println("Poniedziałek");
            break;
        case 2:
            System.out.println("Wtorek");
            break;
        case 3:
            System.out.println("środa");
            break;
        case 4:
            System.out.println("Czwartek");
            break;
        case 5:
            System.out.println("Piątek");
            break;
        case 6:
            System.out.println("Sobota");
            break;
        case 7:
            System.out.println("Niedziela");
            break;
    }
    }
}
