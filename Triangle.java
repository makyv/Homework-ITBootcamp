package Domaci_sreda;

public class Triangle extends Shape {
    private double a, b, c;


    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
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

    @Override
    public double area() {
        double P = (a * b) / 2;
        return P;
    }

    @Override
    public double circumference() {
        double Ob = a + b + c;
        return Ob;
    }
    

}
