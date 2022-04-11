package pl.poj.lab5.zad1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    public void makeSound(){
        System.out.printf("[%s:%s]: Hau Hau\n", super.name, this.color);
    }
}
