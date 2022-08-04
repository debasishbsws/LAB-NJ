import java.util.Scanner;

public class Lab2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0, y0;
        System.out.print("Enter the center cordinates: ");
        x0 = sc.nextInt();
        y0 = sc.nextInt();

        System.out.print("Enter the Radius of the circle: ");
        int radius = sc.nextInt();

        System.out.print("Enter the Arbitary points cordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        double dist = Math.sqrt((x - x0) * (x - x0) + (y - y0) * (y - y0));

        if (dist <= radius) {
            System.out.println("Point is inside the circle.");
        } else {
            System.out.println("Point is outside the circle.");
        }

    }
}