package LAB_Assignment_9.Q1;

public class Ticket {
    int tickitNo;
    String trainName;
    String passengerName;
    String source;
    String destination;
    String date;

    // Constructor
    public Ticket(int tickitNo, String trainName, String passengerName, String source, String destination,
            String date) {
        this.tickitNo = tickitNo;
        this.trainName = trainName;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ticket [tickitNo=" + tickitNo + ", trainName=" + trainName + ", passengerName=" + passengerName
                + ", source=" + source + ", destination=" + destination + ", date=" + date + "]";
    }

    // Getters
    public int getTicketNumber() {
        return tickitNo;
    }
}
