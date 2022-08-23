package LAB_Assignment_5.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.print("Enter nunbers: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        sc.close();
        try {
            if ((double) a / b < 0.00001) {
                throw new UserVerySmallNumException();
            }
        } catch (UserVerySmallNumException e) {
            System.out.println(e);
        }
    }

}

// user define exception is thrown before perorming a/b, on finding a/b <
// 0.00001
class UserVerySmallNumException extends Exception {
    public UserVerySmallNumException() {
        super();
    }

    // override toString()
    @Override
    public String toString() {
        return "UserVerySmallNumException: a/b < 0.00001";
    }
}
