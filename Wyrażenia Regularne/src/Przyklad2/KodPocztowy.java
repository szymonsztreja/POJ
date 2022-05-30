package Przyklad2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KodPocztowy {
    public static void main(String[] args) {
        String tekst = "Adres: Jana z Kolna 11, 80-864 Gdańsk";
        String kodPocztowy = finPostalCode(tekst);
        System.out.println("Kod pocztowy: " + kodPocztowy);
    }

    private static String finPostalCode(String tekst) {
        Pattern pattern = Pattern.compile("\\s\\d{2}-\\d{3}");
        Matcher matcher = pattern.matcher(tekst);
        while( matcher.find()){
            return matcher.group();
        }
        throw new RuntimeException("W wybranym tekście nie ma kodu pocztowego");
    }
}
