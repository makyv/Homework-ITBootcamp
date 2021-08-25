package Domaci_sreda;

public class Circle extends Shape {
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double area() {
        double P = Math.PI * (Math.pow(r, 2));
        return P;
    }

    @Override
    public double circumference() {
        double O = 2 * r * Math.PI;
        return O;
    }

}
