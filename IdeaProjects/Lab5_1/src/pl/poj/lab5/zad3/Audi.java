package pl.poj.lab5.zad3;

public class Audi extends Car{

    public Audi(String color, String make) {
        super(color, make);
    }

    public void exhaustNote(){
        System.out.printf("[%s:%s] Wruuummmmm!",make, color );
    }
}
