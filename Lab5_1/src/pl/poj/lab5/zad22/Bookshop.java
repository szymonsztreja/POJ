package pl.poj.lab5.zad22;

import java.util.Arrays;

public class Bookshop extends Shop {

    private String[] products = {"Harry Pothead", "Tajemnica waidrostacji"};

    public Bookshop(String adress, double size) {
        super(adress, size);
    }

    public String getInformation() {
        return "Adress: " + adress +
                "\nSize: " + size + Arrays.toString(products);
    }
}
