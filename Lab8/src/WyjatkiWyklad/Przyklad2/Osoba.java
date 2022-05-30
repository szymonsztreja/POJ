package WyjatkiWyklad.Przyklad2;

public class Osoba {
    private final String imie;
    private final String nazwisko;
    private final int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
}
