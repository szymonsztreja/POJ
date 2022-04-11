package pl.poj.lab5.zad3;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi("Dark grey", "Audi");
        Bmw bmw = new Bmw("Galaxy blue", "BMW");
        Mercedes merc = new Mercedes("Magenta", "Mercedes");

        Car[] cars = {audi, bmw, merc};

        for (Car x: cars) {
            System.out.println(x.make);
            System.out.println(x.color);
//            x.info();
        }
    }
}
