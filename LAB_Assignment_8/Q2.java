package LAB_Assignment_8;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial string : ");
        String str = sc.nextLine();
        intsertingString(str);
        replacingString(str);
        deletingString(str);

    }

    public static void intsertingString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be inserted : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the index at which the string is to be inserted : ");
        int index = sc.nextInt();
        System.out.println("The string after inserting is : " + str.substring(0, index) + str1 + str.substring(index));
    }

    public static void replacingString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be replaced : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the index at which the string is to be replaced : ");
        int index = sc.nextInt();
        System.out.println("The string after replacing is : " + str.substring(0, index) + str1
                + str.substring(index + str1.length()));
    }

    public static void deletingString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index at which the string is to be deleted : ");
        int index = sc.nextInt();
        System.out.println("Enter the length of the string to be deleted : ");
        int len = sc.nextInt();
        System.out.println("The string after deleting is : " + str.substring(0, index) + str.substring(index + len));
    }
}
