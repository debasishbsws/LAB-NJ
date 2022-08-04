import java.util.Scanner;

public class Lab2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Dimensions number: ");
        int d = sc.nextInt();
        int[] vec1 = new int[d];
        System.out.println("Enter cordinates of 1st Vector: ");
        for (int i = 0; i < vec1.length; i++) {
            vec1[i] = sc.nextInt();
        }
        int[] vec2 = new int[d];
        System.out.println("Enter cordinates of 2nd Vector: ");
        for (int i = 0; i < vec2.length; i++) {
            vec2[i] = sc.nextInt();
        }
        sc.close();
        double dotProduct = dotProduct(vec1,vec2);

        System.out.println("Coresponding Dot Product of Vect1 & Vect2 is: " + dotProduct);
    }

    private static double dotProduct(int[] vec1, int[] vec2){
        double ans = 0;
        for (int i = 0; i < vec2.length; i++) {
            ans += vec1[i] * vec2[i];
        }
        // for (int a : vec2) {
            
        // }
        return ans;
    }
}
