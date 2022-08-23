package LAB_Assignment_5.Q1;

//Java program to handle each exception during execution

public class Q1Exception extends Exception {

    // Interrupted Exception
    public void Interrupted() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        }
    }

    // ArrayIndexOutOfBound Exception
    public void ArrayIndexOutOfBound() {
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound Exception");
        }
    }

    // illegalArgument Exception
    public void illegalArgument() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (IllegalArgumentException e) {
            System.out.println("illegalArgument Exception");
        }
    }

    // IndexOutOfBound Exception
    public void IndexOutOfBound() {
        try {
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBound Exception");
        }
    }

    // NullPointer Exception
    public void NullPointer() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception");
        }
    }

    // NegetiveArraySize Exception
    public void NegetiveArraySize() {
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegetiveArraySize Exception");
        }
    }

    // IllegalAccess Exception
    public void IllegalAccess() {
        try {
            Class c = Class.forName("Q1Exception");
            Q1Exception obj = (Q1Exception) c.newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccess Exception");
        } catch (InstantiationException e) {
            System.out.println("IllegalAccess Exception");
        } catch (ClassNotFoundException e) {
            System.out.println("IllegalAccess Exception");
        }
    }

}
