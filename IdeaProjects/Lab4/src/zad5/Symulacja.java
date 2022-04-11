package zad5;

import java.util.Random;
import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        Moneta moneta = new Moneta();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość prób: ");
        moneta.setThrowsNumber(scan.nextInt());
        System.out.println(moneta.getThrowsNumber());
        int headsCounter = 0;
        int tailsCounter = 0;
        Random rand = new Random();

        for (int i = 0; i < moneta.getThrowsNumber(); i++) {
            int headsOrTails = rand.nextInt(2);
            if (headsOrTails == moneta.getOrzel()) {
                headsCounter++;
            }else
                tailsCounter++;
        }
        System.out.println(headsCounter + " " + tailsCounter);
        double headsChance = ((double)headsCounter/moneta.getThrowsNumber())*100;
        double tailsChance = ((double)tailsCounter/moneta.getThrowsNumber())*100;

        System.out.println(headsChance + "% orzeł / " + tailsChance + "% reszka");
    }
}
