package LiczenieSłow;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        System.out.println(zwrocWystapieniaSlow(tekst));
    }

    public static Map<String, Integer> zwrocWystapieniaSlow(String tekst){
        String[] slowa = tekst.split(" ");
        Map<String, Integer> mapaSlow = new TreeMap<>();
        int wystapienia = 0;
        for(String slowo : slowa){
            if ( mapaSlow.get(slowo) != null){
                wystapienia = mapaSlow.get(slowo);
                mapaSlow.put(slowo, ++wystapienia);
            }else {
                mapaSlow.put(slowo, 1);
            }
        }
        return mapaSlow;
    }

}
