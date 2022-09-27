package LAB_Assignment_8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string : ");
        String str2 = sc.nextLine();
        System.out.println("Enter the length of substring : ");
        int k = sc.nextInt();

        isCommonSubstring(str1, str2, k);
        sc.close();
    }

    public static void isCommonSubstring(String str1, String str2, int k) {
        int flag = 0;
        for (int i = 0; i < str1.length() - k + 1; i++) {
            for (int j = 0; j < str2.length() - k + 1; j++) {
                if (str1.substring(i, i + k).equals(str2.substring(j, j + k))) {
                    System.out.println(
                            "Common substring of length " + k + " found at index " + i + " in str1 and index " + j
                                    + " in str2");
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("No common substring of length " + k + " found");
        }
    }
}
