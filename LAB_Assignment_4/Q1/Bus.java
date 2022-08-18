package LAB_Assignment_4.Q1;

public class Bus {
    // merbers regdNo, model, capacity
    private String regdNo;
    private String model;
    private int capacity;

    // default constructor
    public Bus() {
        regdNo = "NA";
        model = "NA";
        capacity = 0;
    }

    // constructor
    public Bus(String regdNo, String model, int capacity) {
        this.regdNo = regdNo;
        this.model = model;
        this.capacity = capacity;
    }

    // methods showBusDetails
    public void showBusDetails() {
        System.out.println("Bus Details");
        System.out.println("Registration No: " + regdNo);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);
    }
}