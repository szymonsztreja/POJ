package pl.poj.lab5.zad1;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    public void makeSound(){
        System.out.printf("[%s:%s]: Miau\n", name, color);
    }
}
