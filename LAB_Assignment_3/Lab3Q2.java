import java.util.Scanner;

public class Lab3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Battery battery = new Battery();
        // menu driven program to perform the operations on the battery
        while (true) {
            System.out.println("\n\n1. Show level");
            System.out.println("2: Send Message");
            System.out.println("3: Receive Message");
            System.out.println("4: Compute");
            System.out.println("5: Recharge");
            System.out.println("0. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    battery.showLevel();
                    break;
                case 2:
                    System.out.println("Message sent.");
                    battery.sendMessage();
                    break;
                case 3:
                    System.out.println("Message received.");
                    battery.receiveMessage();
                    break;
                case 4:
                    System.out.println("Computing");
                    battery.compute();
                    break;
                case 5:
                    System.out.print("How amny Munites: ");
                    int time = sc.nextInt();
                    battery.recharge(time);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            sc.close();
        }

    }

}

class Battery {
    private float energyLevel;

    // default constructor with value 100
    Battery() {
        this.energyLevel = 100;
    }

    // showLevel method to show the energy level of the battery
    void showLevel() {
        System.out.println("Energy level: " + this.energyLevel);
    }

    // private consume method to consume the energy level of the battery
    private void consume(float energy) {
        this.energyLevel -= energy;
    }

    // basic methods to consume the battery
    void sendMessage() {
        this.consume(2);
    }

    void receiveMessage() {
        this.consume(1);
    }

    void compute() {
        this.consume(1.5f);
    }

    // recahrge(minutes) method to recharge the battery level 1 per 2 minutes
    void recharge(int minutes) {
        this.energyLevel += minutes / 2;
        if (this.energyLevel > 100) {
            this.energyLevel = 100;
        }
    }

}
