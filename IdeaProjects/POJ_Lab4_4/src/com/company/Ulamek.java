package com.company;

public class Ulamek {
    public int licznik;
    public int mianownik;

    public Ulamek(int licznik, int mianownik) {
        if (mianownik == 0) {
            throw new IllegalArgumentException("Mianownik nie może być: 0");
        }
        if (licznik == 0) {
            this.licznik = 0;
            this.mianownik = 1;
        } else {
            this.licznik = licznik;
            this.mianownik = mianownik;
        }
    }

    public void viewUlamek() {
        if (mianownik == 1) {
            System.out.println(mianownik);
        } else {
            System.out.println(licznik + "/" + mianownik);
        }
    }

    public static Ulamek dodaj(Ulamek pierwszy, Ulamek drugi) {
        return new Ulamek(pierwszy.licznik * drugi.mianownik + drugi.licznik * pierwszy.mianownik,
                pierwszy.mianownik * drugi.mianownik);
    }

    public static Ulamek odejmij(Ulamek pierwszy, Ulamek drugi) {
        return new Ulamek(pierwszy.licznik * drugi.mianownik - drugi.licznik * pierwszy.mianownik,
                pierwszy.mianownik * drugi.mianownik);
    }

    public static Ulamek mnoz(Ulamek pierwszy, Ulamek drugi) {
        return new Ulamek(pierwszy.licznik * drugi.licznik,
                pierwszy.mianownik * drugi.mianownik);
    }

    public static Ulamek dziel(Ulamek pierwszy, Ulamek drugi) {
        return new Ulamek(pierwszy.licznik * drugi.mianownik,
                pierwszy.mianownik * drugi.licznik);
    }
}
