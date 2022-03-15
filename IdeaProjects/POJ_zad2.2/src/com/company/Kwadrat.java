package com.company;

public class Kwadrat {
    int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public int pole(){
        return bok*bok;
    }

    public int obwod(){
        return 4*bok;
    }
}

