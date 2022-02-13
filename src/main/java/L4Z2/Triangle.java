package L4Z2;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return a * h / 2;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
