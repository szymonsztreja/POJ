package pl.poj.lab5.zad22;

public class Shop {
    protected String adress;
    protected double size;

    public Shop(String adress, double size){
        this.adress = adress;
        this.size = size;
    }

    public String getInformation(){
        return "Adress: " + adress + " Size" + size + " ";
    }
}
