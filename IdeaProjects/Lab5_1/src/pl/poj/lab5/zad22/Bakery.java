package pl.poj.lab5.zad22;

import java.util.Arrays;

public class Bakery extends Shop{

    private String[] products = {"bulka", "Drożdżówka z jabłkiem rigcz"};

    public Bakery(String adress, double size){
        super(adress,size);
    }

    public String getInformation() {
        return adress + size + Arrays.toString(products);
    }
}
