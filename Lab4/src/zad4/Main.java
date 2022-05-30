package zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dolny zakres:");
        int f = scan.nextInt();
        System.out.println("Podaj górny zakres:");
        int c = scan.nextInt();
        System.out.println("floor: " + f +"\nceiling: " + c);
        Gra gra = new Gra(f, c);
        gra.playGame();
    }
}
