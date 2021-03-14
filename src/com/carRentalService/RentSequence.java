package com.carRentalService;

import java.util.ArrayList;

public class RentSequence {
    //loop starts here. break when want to return to home screen.





    public static void runRentSequence() {
        while(true) {
//        AvailabilityReport.printAvailableCars(CarInventory());
            ArrayList<String> availableCars = AvailableCars.getAvailableCars();
            Console.readRentCarSelection(availableCars);
            Console.readNewRentalName("What is the name you would like to use for your rental? ", availableCars);
            break;
//        System.out.println("The selection:");
//        System.out.println(Console.selectedCarByte);
//        System.out.println(availableCars.get(Console.selectedCarByte-1));
//        if(!Console.readConfirmation(Console.selectedCarByte, availableCars)){ //user says "no" to confirmation of car rental
//            break;
//        }
        }
    }
}
