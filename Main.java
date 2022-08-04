import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x1,y1 and x2,y2 of line 1: ");
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        System.out.print("Enter x1,y1 and x2,y2 of line 2: ");
        
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        
        double slope1 = 0;
        double slope2 = 0;
        
        if((x2 - x1) != 0 && (a2 - a1) != 0){
            slope1 = (y2 - y1)/(x2 - x1);
            slope2 = (b2 - b1)/(a2 - a1);
        } else {
            if((x2 - x1) == 0){
                slope1 = -1;
            }
            if((a2 - a1) == 0){
                slope2 = -1;
            }
        }
        
        
        if(slope2 == slope1){
            System.out.println("Lines are Parallel");
        } else {
            System.out.println("Lines are not Parallel");
        }
        
    }
}
