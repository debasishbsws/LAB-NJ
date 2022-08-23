package LAB_Assignment_5.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();

        try {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    throw new UserNumericString();
                }
            }

            System.out.println("String : " + s);
            System.out.println("Has no Numbers in the String");

        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }
    }
}

class UserNumericString extends Exception {
    public UserNumericString() {
        super();
    }

    // toString()
    @Override
    public String toString() {
        return "UserNumericString: String contains number valus as subtring";
    }
}
