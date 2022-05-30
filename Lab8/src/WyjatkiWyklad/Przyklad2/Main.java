package WyjatkiWyklad.Przyklad2;

public class Main {
    public static void main(String[] args) {
        Osoba jan = new Osoba("Jan", "Kowalski", 1975);
        try {
//            int wiek = obliczWiekOsobyWDanymRoku(jan, 1945);
            int wiek = test(jan, 1945);
            System.out.printf("Wiek danej osoby wynosi: %d", wiek);
        } catch (InstantiationException e) {
            System.out.println("Błąd ! " + e.getMessage());
        } finally {
            System.out.println("Koniec programu!");
        }
    }

    public static int test(Osoba osoba, int wybranyRok) throws InstantiationException{
        return obliczWiekOsobyWDanymRoku(osoba,wybranyRok);
    }

    public static int obliczWiekOsobyWDanymRoku(Osoba osoba, int wybranyRok) throws InstantiationException{
        int wiek = wybranyRok - osoba.getRokUrodzenia();
        if( wiek < 0 ){
            throw new InstantiationException("Rok urodzenia jest po wybranym roku");
        }else {
            return wiek;
        }
    }
}
