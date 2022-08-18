package LAB_Assignment_4.Q1;

public class PublicBus extends Bus {
    // members owner, from, to, departureTime, arrivalTime
    private String owner;
    private String from;
    private String to;
    private String departureTime;
    private String arrivalTime;

    // default constructor
    public PublicBus() {
        owner = "NA";
        from = "NA";
        to = "NA";
        departureTime = "NA";
        arrivalTime = "NA";
    }

    // constructor
    public PublicBus(String regdNo, String model, int capacity, String owner, String from, String to,
            String departureTime, String arrivalTime) {
        super(regdNo, model, capacity);
        this.owner = owner;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // override showBusDetails
    @Override
    public void showBusDetails() {
        super.showBusDetails();
        System.out.println("Owner: " + owner);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
    }
}
