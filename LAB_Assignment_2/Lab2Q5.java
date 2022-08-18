
import java.util.HashMap;
import java.util.Scanner;

public class Lab2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        while(n-- > 0){
            int key = sc.nextInt();
            if(map.containsKey(key)){
                int e = map.get(key);
                map.replace(key, e+1);
            } else {
                map.put(key, 1);
            }
        }
        sc.close();
        for (Integer a : map.keySet()) {
            String k = a.toString();
            String v = map.get(a).toString();
            System.out.println(k +" occures " + v + " times,");
        }
    }
}