package com.company;

public class Main {

    public static void main(String[] args) {

        Ulamek jeden = new Ulamek(3,4);
        Ulamek dwa = new Ulamek(3, 5);
        Ulamek add = Ulamek.dodaj(jeden,dwa);
        Ulamek sub = Ulamek.odejmij(jeden,dwa);
        Ulamek mul = Ulamek.mnoz(jeden,dwa);
        Ulamek div = Ulamek.dziel(jeden,dwa);
        add.viewUlamek();
        sub.viewUlamek();
        mul.viewUlamek();
        div.viewUlamek();

    }
}
