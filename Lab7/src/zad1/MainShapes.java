package zad1;

import zad1.Shapes.*;

public class MainShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2.5,6);
        Square square = new Square(2);
        Triangle triangle = new Triangle(2,4,5,6);
        Shape shapes[] = {circle,rectangle,square,triangle};

        for (Shape shape: shapes) {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
