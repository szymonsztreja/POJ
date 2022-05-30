package pl.poj.lab5.zad22;

public class Main {
    public static void main(String[] args) {

        Bookshop bookshop = new Bookshop("ODbytowo", 20);
        Bakery bakery = new Bakery("Odybtowiec", 42.3);

        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());

    }
}
