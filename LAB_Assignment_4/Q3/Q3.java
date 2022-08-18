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
         * Bus = {
         * regdNo = "WB74A0007",
         * model = "Tesla",
         * capacity = 55
         * },
         * owner = "Mr Musk",
         * from = "Delhi",
         * to = "London",
         * departureTime = "10:00",
         * arrivalTime = "20:00"
         * }
         */
        publicBus.showBusDetails();

        // reference of Bus class pointing to object of LuxuryPublicBus class
        Bus bus = new LuxuryPublicBus("WB74A0008", "Tesla", 55, "Mr Musk", "Delhi", "London", "10:00", "20:00", true,
                false,
                10);
        // super sonstructor will call the constructor of Bus class also
        // but as the reference is of Bus class so only the members of Bus class will be
        // accessible

        bus.showBusDetails();
    }
}
