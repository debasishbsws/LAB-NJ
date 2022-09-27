package LAB_Assignment_9.Q1;

public class Q1 {
    public static void main(String[] args) {
        RailwayBooking railwayBooking = new RailwayBooking();

        int choice = 10;

        while (choice != 0) {
            System.out.println();
            System.out.println();
            System.out.println("1. Book a new ticket");
            System.out.println("2. Cancel booked ticket");
            System.out.println("3. Display all tickets");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    int n = railwayBooking.bookTicket();
                    if (n != -1) {
                        System.out.println("Ticket booked successfully. Ticket number is " + n);
                    } else {
                        System.out.println("Ticket booking failed");
                    }
                    break;
                case 2:
                    System.out.println("Enter the ticket number");
                    int ticketNumber = Integer.parseInt(System.console().readLine());
                    if (railwayBooking.cancelTicket(ticketNumber)) {
                        System.out.println("Ticket cancelled successfully");
                    } else {
                        System.out.println("Never Booked / Ticket cancellation failed");
                    }
                    break;
                case 3:
                    railwayBooking.displayAllTickets();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}
