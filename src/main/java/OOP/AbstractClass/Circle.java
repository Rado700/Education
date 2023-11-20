package OOP.AbstractClass;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return  radius*2*Math.PI;

    }

    @Override
    public double calculatePerimeter() {
        return radius*2;
    }


}
