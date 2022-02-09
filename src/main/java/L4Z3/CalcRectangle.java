package L4Z3;

public class CalcRectangle implements AreaAndPerimeter{
private double a;
private double b;

    public CalcRectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
