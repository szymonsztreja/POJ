package zad1.Shapes;

import zad1.Shapes.Shape;

public class Circle extends Shape {
    private double R;

    public Circle(double r) {
        R = r;
    }


    @Override
    public double getArea() {
        return Math.PI*Math.pow(R,2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*R;
    }
}
