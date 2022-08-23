package LAB_Assignment_5.Q1;

import java.util.*;

public class Q1 {

    public static void main(String args[]) {

        // Interrupted Exception
        try {
            throw new InterruptedException("Interrupted Occured");
        } catch (InterruptedException interExp) {
            System.out.println(interExp);
        }

        Scanner sc = new Scanner(System.in);
        int size;

        // Array index out of bound exception
        int arr[] = new int[5];
        try {
            int index;

            System.out.println("Enter the index to peek");
            index = sc.nextInt();
            int a = arr[index];

            System.out.println("Value at " + index + " is = " + a);
        } catch (ArrayIndexOutOfBoundsException arrExp) {
            System.out.println(arrExp);
        }

        // Illegal ArgumentException
        try {
            throw new IllegalArgumentException(
                    "Passed Illegal Argument to the function");
        } catch (IllegalArgumentException illegalExp) {
            System.out.println(illegalExp);
        }

        // IndexOut of bound exception
        try {
            String str;
            System.out.println("Enter a string");
            str = sc.next();

            System.out.println("Enter the index you want to peek");
            int index;
            index = sc.nextInt();

            char ch = str.charAt(index);
            System.out.println("Character at index " + index + " is: " + ch);
        } catch (IndexOutOfBoundsException indexOutExp) {
            System.out.println(indexOutExp);
        }

        // negative Array size exception
        try {
            System.out.println("Enter the size of the Array");
            size = sc.nextInt();
            int arr1[] = new int[size];
            System.out.println("Array is: " + Arrays.toString(arr1));
        } catch (NegativeArraySizeException negSize) {
            System.out.println(negSize);
        }

        // Null Pointer Exception
        try {
            String str = null;
            System.out.println("Length of the String is: " + str.length());
        } catch (NullPointerException nullptrExp) {
            System.out.println(nullptrExp);
        }

        // Illegal Access Exception

        try {
            throw new IllegalAccessException("Illegal Excess Exception Occurred");
        } catch (IllegalAccessException illegalExp) {
            System.out.println(illegalExp);
        }
    }
}
