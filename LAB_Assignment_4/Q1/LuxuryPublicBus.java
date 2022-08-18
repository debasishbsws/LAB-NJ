package LAB_Assignment_4.Q1;

public class LuxuryPublicBus extends PublicBus {
    // members isAC, isWifi, noOfSleepersSeats
    private boolean isAC;
    private boolean isWifi;
    private int noOfSleepersSeats;

    // default constructor
    public LuxuryPublicBus() {
        isAC = false;
        isWifi = false;
        noOfSleepersSeats = 0;
    }

    // constructor
    public LuxuryPublicBus(String regdNo, String model, int capacity, String owner, String from, String to,
            String departureTime, String arrivalTime, boolean isAC, boolean isWifi, int noOfSleepersSeats) {
        super(regdNo, model, capacity, owner, from, to, departureTime, arrivalTime);
        this.isAC = isAC;
        this.isWifi = isWifi;
        this.noOfSleepersSeats = noOfSleepersSeats;
    }

    // override showBusDetails
    @Override
    public void showBusDetails() {
        super.showBusDetails();
        System.out.println("Is AC: " + isAC);
        System.out.println("Is Wifi: " + isWifi);
        System.out.println("No of Sleeper Seats: " + noOfSleepersSeats);
    }

}
