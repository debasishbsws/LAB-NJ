package LAB_Assignment_6.Q1.geoshapes;

public class Circle {
    public static final double PI = 3.14;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

}
