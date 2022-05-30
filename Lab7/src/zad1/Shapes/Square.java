package zad1.Shapes;

public class Square extends Shape{
    private double side;

    public Square(int i) {
        side = i;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}
