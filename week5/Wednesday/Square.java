package Domaci_sreda;

public class Square extends Rectangle {


    public Square(String name, double a, double b) {
        super(name, a, b);
    }

    @Override
    public double area() {
        double P = getA() * getB();
        return P;
    }

    @Override
    public double circumference() {
        double O = 4 * getA();
        return O;
    }

}
