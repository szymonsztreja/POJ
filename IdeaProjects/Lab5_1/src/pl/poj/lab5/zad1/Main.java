package pl.poj.lab5.zad1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Azor", "Czarny");
        Cat cat = new Cat("Mruczek", "Biały");

        dog.makeSound();
        cat.makeSound();
    }
}
