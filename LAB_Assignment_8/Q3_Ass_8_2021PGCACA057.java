package LAB_Assignment_8;

import java.util.Scanner;

public class Q3_Ass_8_2021PGCACA057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Enter the number of times to be shifted : ");
        int n = sc.nextInt();
        System.out.println("The string after left shift is : " + leftShift(str, n));
        System.out.println("The string after right shift is : " + rightShift(str, n));
        sc.close();

    }

    public static String leftShift(String str, int n) {
        String str1 = str.substring(n);
        String str2 = str.substring(0, n);
        return str1 + str2;
    }

    public static String rightShift(String str, int n) {
        String str1 = str.substring(str.length() - n);
        String str2 = str.substring(0, str.length() - n);
        return str1 + str2;
    }
}
