package com.carRentalService;

import java.util.ArrayList;

public class CarRentalServiceMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Car Rentals!");
        //start the loop! while(true).
        //then can enter one of two loops: rent or return. when want to return to main stage, use break to leave the loop!

        ArrayList<String> availableCars = AvailableCars.getAvailableCars();
        while(availableCars.size() != 0) {
            AvailabilityReport.printAvailableCars(availableCars);
            Console.readCarSelection(availableCars);
        }
        System.out.print("No cars are currently available.");
    }

}
