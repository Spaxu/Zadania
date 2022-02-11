package L4Z2;

public class Circle extends Shape {

    private int r;
    private final double pi = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return pi * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * r;
    }
}
