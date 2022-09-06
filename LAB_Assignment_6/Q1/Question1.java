package LAB_Assignment_6.Q1;

import LAB_Assignment_6.Q1.geoshapes.Circle;
import LAB_Assignment_6.Q1.geoshapes.Rectangle;
import LAB_Assignment_6.Q1.geoshapes.Sphere;
import LAB_Assignment_6.Q1.geoshapes.Triangle;

public class Question1 {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());

        Sphere sphere = new Sphere(10);
        System.out.println("Area of sphere: " + sphere.area());

        Triangle triangle = new Triangle(10, 20, 50);
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Perimeter fo triangle: " + triangle.perimeter());

    }

}
