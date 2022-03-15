package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int tab_size = scan.nextInt();
        int[] tab = new int[tab_size];

        System.out.println("Podaj  pierwszy element tablicy");
        Scanner sc = new Scanner(System.in);
        int pierwszy_el = sc.nextInt();
        tab[0] = pierwszy_el;
        for( int i = 1; i < tab_size; i++ )
        {
            if(pierwszy_el % 2 == 0)
                tab[i] = pierwszy_el+2*i;
            else
                tab[i] = pierwszy_el+2*i ;
        }

        for( int i = 0; i < tab_size; i++ )
        {
            System.out.print(tab[i]);
            System.out.print("\t");
        }
    }
}
