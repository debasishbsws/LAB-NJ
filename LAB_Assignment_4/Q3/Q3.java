package LAB_Assignment_4.Q3;

import LAB_Assignment_4.Q1.*;

public class Q3 {
    public static void main(String[] args) {

        // create an object of PublicBus class
        PublicBus publicBus = new PublicBus("WB74A0007", "Tesla", 55, "Mr Musk", "Delhi", "London", "10:00", "20:00");
        // super sonstructor will call the constructor of Bus class so basically two
        // object is being created here
        /*
         * publicBus = {
         * ....Bus = {
         * ....regdNo = "WB74A0007",
         * ....model = "Tesla",
         * ....capacity = 55
         * ....},
         * owner = "Mr Musk",
         * from = "Delhi",
         * to = "London",
         * departureTime = "10:00",
         * arrivalTime = "20:00"
         * }
         */

        // reference of Bus class pointing to object of LuxuryPublicBus class
        Bus bus = new LuxuryPublicBus("WB73A8080", "TATA", 60, "Mr Tata", "Kolkata", "Mumbai", "09:00", "23:00", true,
                true,
                10);
        // super sonstructor will call the constructor of Bus class also
        // As Bus type reference is pointing to object of LuxuryPublicBus class
        // method showBusDetails() of LuxuryPublicBus class will be called
        bus.showBusDetails();
        System.out.println("-------------------------------");
        bus = publicBus;
        // As Bus type reference is pointing to object of PublicBus class
        // method showBusDetails() of PublicBus class will be called now
        bus.showBusDetails();
    }
}
