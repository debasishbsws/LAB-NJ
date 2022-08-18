import java.util.Scanner;

public class Lab2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms: ");
        int n = sc.nextInt();
        System.out.print("Enter inputs a & r: ");
        int a = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        printGeomatricProgression(n,a,r);
    }

    private static void printGeomatricProgression(int n , int a , int r){
        long m = 1;
        while(n-- >= 0){
            System.out.print(" " + a*m + ",");
            m *= r;
        }
    }
}