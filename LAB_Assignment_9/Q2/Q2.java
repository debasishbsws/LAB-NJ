package LAB_Assignment_9.Q2;

import java.util.*;

// HashMap DATABASE

// Use  HashMap to implement ligin ID ans password database.

public class Q2 {

    static Map<String, String> loginDatabase = new HashMap<String, String>();

    public static void main(String[] args) {

        int choice = 10;
        while (choice != 0) {
            System.out.println();
            System.out.println("1. Sing Up new user");
            System.out.println("2. Login Existing user");
            System.out.println("0. Exit\n");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter the user ID");
                    String loginID = System.console().readLine();
                    System.out.println("Enter the password");
                    String password = System.console().readLine();
                    if (loginDatabase.containsKey(loginID)) {
                        System.out.println("User name already exists");
                    } else {
                        loginDatabase.put(loginID, password);
                        System.out.println("User created successfully");
                    }
                    break;
                case 2:
                    System.out.println("Enter the user ID");
                    loginID = System.console().readLine();
                    System.out.println("Enter the password");
                    password = System.console().readLine();
                    Login(loginID, password);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

    public static void SingUp(String loginID, String password) {
        loginDatabase.put(loginID, password);
    }

    public static void Login(String loginID, String password) {
        if (loginDatabase.containsKey(loginID)) {
            if (loginDatabase.get(loginID).equals(password)) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("User name does not exists");
        }
    }

}
