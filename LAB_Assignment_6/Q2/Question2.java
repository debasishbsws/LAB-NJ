package LAB_Assignment_6.Q2;

import LAB_Assignment_6.Q2.coordinates.Cartesian;
import LAB_Assignment_6.Q2.coordinates.Polar;

public class Question2 {

    public static void main(String args[]) {
        Cartesian cartesian = new Cartesian(4, 7);
        Polar polar = new Polar(4, 8.9);

        cartesian.toPolar();
        polar.toCartesian();
    }
}