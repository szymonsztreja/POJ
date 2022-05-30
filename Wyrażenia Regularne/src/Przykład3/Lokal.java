package Przykład3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lokal {
    private final String nazwa;
    private final String miejscowosc;
    private final String kodPocztowy;
    private final String ulica;
    private final String numerDomu;
    private final String numerLokalu;

    public Lokal(String nazwa, String daneGoogleMaps) {
        this.nazwa = nazwa;
        this.miejscowosc = wyciagnijMiejscowosc(daneGoogleMaps);
        this.kodPocztowy = wyciagnijKodPocztowy(daneGoogleMaps);
        this.ulica = wyciagnijUlice(daneGoogleMaps);
        this.numerDomu = wyciagnijNumerDomu(daneGoogleMaps);
        this.numerLokalu = wyciagnijNumerLokalu(daneGoogleMaps);
    }

    private String wyciagnijNumerLokalu(String daneGoogleMaps) {
        Pattern pattern = Pattern.compile("\\/\\d+");
        Matcher matcher = pattern.matcher(daneGoogleMaps);
        try{
            while( matcher.find() ){
                return matcher.group().replaceAll("//", "");
            }
        }   catch (NumberFormatException e){
            throw new RuntimeException("Błąd  w danych, lokalu");

        }
        return null;
    }

    private String wyciagnijNumerDomu(String daneGoogleMaps) {
        Pattern pattern = Pattern.compile("(\\s\\d+,|\\d+\\/)");
        Matcher matcher = pattern.matcher(daneGoogleMaps);
        try{
            while( matcher.find() ){
                return matcher.group().replaceAll(",", "").replaceAll("\\/","").trim(); //(\/|,)
            }
        }   catch (NumberFormatException e){
            throw new RuntimeException("Błąd  w danych, ulicy");

        }
        throw new RuntimeException("Błąd w danych, ulicy");
    }

    private String wyciagnijUlice(String daneGoogleMaps) {
        Pattern pattern = Pattern.compile("[A-Z]\\w+\\s\\d");
        Matcher matcher = pattern.matcher(daneGoogleMaps);
        while( matcher.find() ){
            return matcher.group().replaceAll("\\s\\d", "");
        }
        throw new RuntimeException("Błąd danych, brak ulicy");
    }

    private String wyciagnijKodPocztowy(String daneGoogleMaps) {
        Pattern pattern = Pattern.compile("\\s\\d{2}-\\d{3}");
        Matcher matcher = pattern.matcher(daneGoogleMaps);
        while( matcher.find() ){
            return matcher.group();
        }
        throw new RuntimeException("Błąd danych, brak kod pocztowego");
    }

    private String wyciagnijMiejscowosc(String daneGoogleMaps) {
        Pattern pattern = Pattern.compile("[A-Z]\\w+$");
        Matcher matcher = pattern.matcher(daneGoogleMaps);
        while( matcher.find() ){
            return matcher.group();
        }
        throw new RuntimeException("Błąd danych, brak miejscowości");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(nazwa);
        builder.append(String.format("\nMiasto: %s\n", miejscowosc));
        builder.append(String.format("Ulica: %s\n", ulica));
        builder.append(String.format("Numer domu/lokalu: %s%s\n", numerDomu,
                numerLokalu==null?"":"/"+numerLokalu));
        builder.append(String.format("Kod pocztowy: %s\n", kodPocztowy));
        return builder.toString();
    }
}
