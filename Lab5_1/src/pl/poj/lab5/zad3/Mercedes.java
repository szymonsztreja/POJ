package pl.poj.lab5.zad3;

public class Mercedes extends Car{

    public Mercedes(String color, String make) {
        super(color, make);
    }

    public void valueOf(){
        System.out.println("Value of" + make + "is 25.84bn USD");
    }

}
