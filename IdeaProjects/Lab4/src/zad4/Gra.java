package zad4;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    private int floor;
    private int ceiling;

    public Gra(int floor, int ceiling) {
        this.floor = floor;
        this.ceiling = ceiling;
    }

    public void playGame() {
        Random rand = new Random();
        int zgadywana = rand.nextInt((ceiling) + floor);
        Scanner scan = new Scanner(System.in);
        System.out.println(zgadywana);
        int i = 1;
        while (i <= 5) {
            System.out.println("Próba: " + i + " Zgadnij! :");
            int userGuess = scan.nextInt();
            if (userGuess < zgadywana) {
                System.out.println("Za mała!\n");
            } else if (userGuess > zgadywana) {
                System.out.println("Za duża!\n");
            } else {
                System.out.println("Gratuluje udało Ci się odganąć liczbę!\n" +
                        "Wylosowana liczba: " + zgadywana + "\n" +
                        "Twoja odpowiedź: " + userGuess + "\n");
                break;
            }
            i++;
        }
    }
}
