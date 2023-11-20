package OOP.AbstractClass;

public class Triangle extends Shape{
    double vertical;
    double horizontal;

    public Triangle(double a, double b) {
        this.vertical = a;
        this.horizontal = b;
    }

    @Override
    public double calculateArea() {
        return vertical * horizontal;
    }

    @Override
    public double calculatePerimeter() {
        return vertical + vertical + horizontal;
    }
}
