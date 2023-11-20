package OOP.AbstractClass;

public class Rectangle extends Shape {
    double height;
    double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double calculateArea() {
        return height*weight;
    }

    @Override
    public double calculatePerimeter() {
        return height*2+weight*2;
    }
}
