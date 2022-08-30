package LAB_Assignment_6.geoshapes;

import java.lang.Math;

public class Triangle {

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (isValid(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Invalid triangle");
        }
    }

    // function to check if the triangle is valid or not
    public boolean isValid(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }

    public double area() {
        double s = (a + b + c) / 2;
        double area = s * (s - a) * (s - b) * (s - c);
        area = Math.abs(area);
        return Math.sqrt(area);
    }

    public double perimeter() {
        return (a + b + c);
    }

}
