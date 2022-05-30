package Lotto;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {
    zagraj();
    }

    public static void zagraj(){
        Set<Integer> liczby = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int liczba;
        while (liczby.size() < 6){
            System.out.printf("Podaj liczbe: %d\n", liczby.size()+1);
            liczba = scanner.nextInt();
            if(liczba > 0 && liczba < 50){
                liczby.add(liczba);
            }
        }
        Set<Integer> wylosowane = przeprowadzLosowanie();
        int wynik = zwrocWynik(liczby, wylosowane);
        System.out.printf("Liczby uzywtkowanika :%s\n", liczby);
        System.out.printf("Liczby wylosowane :%s\n", wylosowane);
        System.out.printf("Trafienia: %d/6\n", wynik);

    }

    private static int zwrocWynik(Set<Integer> liczbyUzywtkowanika, Set<Integer> wylosowaneLiczby){
        int trafienia = 0;
        for( Integer wylosowanaLiczba : wylosowaneLiczby){
            if( liczbyUzywtkowanika.contains( wylosowanaLiczba)){
                trafienia++;
            }
        }
        return trafienia;
    }

    private static Set<Integer> przeprowadzLosowanie(){
        Random random = new Random();
        Set<Integer> liczby = new TreeSet();
        while ( liczby.size() < 6 ){
            liczby.add(random.nextInt(48) + 1);
        }
        return liczby;
    }
}
