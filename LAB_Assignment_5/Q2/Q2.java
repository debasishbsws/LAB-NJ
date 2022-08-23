package LAB_Assignment_5.Q2;

import java.util.Scanner;

public class Q2 {
    Scanner sc = new Scanner(System.in);
    float a, b;

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
