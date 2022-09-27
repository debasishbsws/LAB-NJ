package LAB_Assignment_9.Q1;

import java.util.ArrayList;

public class RailwayBooking {
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    int ticketCount = 0;

    // 1. Add a new ticket with unique ticket number
    public int bookTicket() {
        System.out.println("Enter the train name");
        String trainName = System.console().readLine();
        System.out.println("Enter the passenger name");
        String passengerName = System.console().readLine();
        System.out.println("Enter the source");
        String source = System.console().readLine();
        System.out.println("Enter the destination");
        String destination = System.console().readLine();
        System.out.println("Enter the date");
        String date = System.console().readLine();
        System.out.println("Enter the time");
        String time = System.console().readLine();

        Ticket ticket = new Ticket(ticketCount++, trainName, passengerName, source, destination, date + ", " + time);
        if (isTrainFull()) {
            System.out.println("Train is full");
            return -1;
        }
        tickets.add(ticket);
        return ticket.getTicketNumber();
    }

    private boolean isTrainFull() {
        // Infinitly large train never going to full; we need to create a train (new
        // Train class)
        return false;
    }

    // 2. Cancel a ticket
    public boolean cancelTicket(int ticketNumber) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getTicketNumber() == ticketNumber) {
                tickets.remove(i);
                return true;
            }
        }
        return false;
    }

    // 3. Display all tickets
    public void displayAllTickets() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}
