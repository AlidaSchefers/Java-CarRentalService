package com.carRentalService;

import java.util.ArrayList;

public class CarRentalService {
    public static void main(String[] args) {
        ArrayList<String> availableCars = AvailableCars.getAvailableCars();
        while(availableCars.size() != 0) {
            AvailabilityReport.printAvailableCars(availableCars);
            Console.readInput(availableCars);
        }
        System.out.printf("All cars are currently being rented.");
    }

}
