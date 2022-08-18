
public class Lab3Q3 {
    public static void main(String[] args) {
        MyByte myByte = new MyByte();
        MyByte ans;
        // menu driven program to perform the operations on the byte
        while (true) {
            System.out.println("\n\n1. Get Byte");
            System.out.println("2. Set the Byte");
            System.out.println("3. AND Operation");
            System.out.println("4. OR Operation");
            System.out.println("5. XOR Operation");
            System.out.println("6. Mask");
            System.out.println("7. Complement");
            System.out.println("0. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println(myByte.getValue());
                    break;
                case 2:
                    System.out.println("Enter the value: ");
                    int value = Integer.parseInt(System.console().readLine());
                    myByte.setValue((byte) value);
                    break;
                case 3:
                    System.out.println("Enter the value: ");
                    byte value1 = (byte) Integer.parseInt(System.console().readLine());
                    ans = myByte.andOP(new MyByte(value1));
                    System.out.println("The result is: " + ans.getValue());
                    break;
                case 4:
                    System.out.println("Enter the value: ");
                    byte value2 = (byte) Integer.parseInt(System.console().readLine());
                    ans = myByte.orOP(new MyByte(value2));
                    System.out.println("The result is: " + ans.getValue());
                    break;
                case 5:
                    System.out.println("Enter the value: ");
                    byte value3 = (byte) Integer.parseInt(System.console().readLine());
                    ans = myByte.xorOP(new MyByte(value3));
                    System.out.println("The result is: " + ans.getValue());
                    break;
                case 6:
                    System.out.println("Enter the value: ");
                    byte value4 = (byte) Integer.parseInt(System.console().readLine());
                    ans = myByte.mask(value4);
                    System.out.println("The result is: " + ans.getValue());
                    break;
                case 7:
                    ans = myByte.complement();
                    System.out.println("The result is: " + ans.getValue());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

class MyByte {
    private byte value;

    // default constructor
    MyByte() {
        this.value = 0;
    }

    // parameterized constructor
    public MyByte(byte value) {
        this.value = value;
    }

    // getter and setter methods for the value of the byte
    public byte getValue() {
        return this.value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    // andOP() method to perform and operation on two MyByte objects
    public MyByte andOP(MyByte other) {
        return new MyByte((byte) (this.value & other.value));
    }

    // orOP() method to perform or operation on two MyByte objects
    public MyByte orOP(MyByte other) {
        return new MyByte((byte) (this.value | other.value));
    }

    // xorOP() method to perform xor operation on two MyByte objects
    public MyByte xorOP(MyByte other) {
        return new MyByte((byte) (this.value ^ other.value));
    }

    // dose not understand the question
    public MyByte mask(byte mask) {
        return new MyByte((byte) (this.value & mask));
    }

    // complement() to make a complement of a given MyByte object
    public MyByte complement() {
        return new MyByte((byte) (~this.value));
    }
}
