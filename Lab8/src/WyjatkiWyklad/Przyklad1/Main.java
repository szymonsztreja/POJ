package WyjatkiWyklad.Przyklad1;

import WyjatkiWyklad.Przyklad2.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        Osoba jan = new Osoba("Jan", "Kowalski", 1975);
        try{
            int wiek = obliczWiekOsobyWDanymRoku(jan, 1945);
            System.out.println(wiek);
        } catch (InvalidAgeException e){
            System.out.println("Błąd ! " + e.getMessage());
        }finally {
            System.out.println("Koniec programu");
        }
        System.out.println("test");
    }

     public static int obliczWiekOsobyWDanymRoku(Osoba osoba, int wybranyRok){
        int wiek = wybranyRok - osoba.getRokUrodzenia();
        if( wiek < 0 ){
            throw new InvalidAgeException();
        }else {
            return wiek;
        }
    }
}
