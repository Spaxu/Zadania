package L4Z3;

public class CalcCircle implements AreaAndPerimeter{
    private double pi = 3.14d;
    private double r;

    public CalcCircle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return pi * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * pi * r;
    }
}
