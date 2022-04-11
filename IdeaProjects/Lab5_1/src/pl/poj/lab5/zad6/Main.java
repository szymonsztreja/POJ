package pl.poj.lab5.zad6;

public class Main {
    public static void main(String[] args) {
        double number = 4.5;
        System.out.println(Calculator.calculate(number));
        System.out.println(Calculator.calculate(number, number));
        System.out.println(Calculator.calculate(number, number, number));
    }
}
