package com.carRentalService;

import java.util.ArrayList;

public class AvailabilityReport {

    static void printAvailableCars(ArrayList<String> availableCars) {
        System.out.println("Available Cars:");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i+1)+") "+ availableCars.get(i));
        }
        System.out.print("Selection: ");
    }
}
