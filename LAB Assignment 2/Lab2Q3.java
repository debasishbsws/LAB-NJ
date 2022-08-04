import java.util.Scanner;

public class Lab2Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Integer: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("GCD using Recursive method: " + GCDrecursive(a, b));
        System.out.println();
        System.out.println("GCD using non Recursive method: " + GCD(a, b));
    }

    public static int GCDrecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCDrecursive(b, a % b);
        }
    }

    public static int GCD(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
}
