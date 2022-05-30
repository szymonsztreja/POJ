package zad1.Shapes;

public class Triangle extends Shape{
    private double h;
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, double h){
        if( checkValidity(a, b, c) ){
            this.a = a;
            this.b = b;
            this.c = c;
            this.h = h;
        }
        else {
            System.out.println("Unable to make a triangles\n");
        }
    }

    @Override
    public double getArea(){
        return (1/2 * a * h);
    }

    @Override
    public double getPerimeter(){
        return a+b+c;
    }

    boolean checkValidity(double A, double B, double C)
    {
        // check condition
        if (A + B <= C || A + C <= B || B + C <= A)
            return false;
        else
            return true;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
