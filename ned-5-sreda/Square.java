package Domaci_sreda;

public class Square extends Shape {
    private double a;

    public Square(String name, double a) {
        super(name);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        double P = a * a;
        return P;
    }

    @Override
    public double circumference() {
        double O = 4 * a;
        return O;
    }

}
