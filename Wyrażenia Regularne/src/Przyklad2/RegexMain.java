package Przyklad2;

public class RegexMain {
    public static void main(String[] args) {
         String tekst = "Ala ma kota. Ala ma 12 lat, a jej kot ma 3.";
        System.out.println(tekst);
        System.out.println(usunSamogloski(tekst));
        System.out.println(usunLiczbyWiekszeOd9(tekst));
        System.out.println(zamienImie(tekst, " "));
    }

    public static String usunSamogloski(String tekst){
        return tekst.replaceAll("A|E|I|O|U|Y|a|e|i|o|u|y", "");
    }

    public static String usunLiczbyWiekszeOd9(String tekst){
        return tekst.replaceAll("\\d{2,}", "");
    }

    public static String zamienImie(String tekst, String nowe){
        return tekst.replaceAll("[A-Z]\\w+", nowe);
    }
}
