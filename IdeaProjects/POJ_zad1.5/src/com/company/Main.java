package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int tab_size = scan.nextInt();
        char[] tab = new char[tab_size];

        System.out.println("Podaj elementy tablicy");
        for( int i = 0; i < tab_size; i++ )
        {
            Scanner sc = new Scanner(System.in);
            tab[i] = sc.next().charAt(0);
        }

        for( int i = 0; i < tab_size; i++ )
        {
            System.out.print(tab[i]);
            System.out.print("\t");
        }
    }
}
