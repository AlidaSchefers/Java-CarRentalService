package com.carRentalService;

import java.util.ArrayList;

public class AvailableCars {
    static ArrayList<String> getAvailableCars() {
        ArrayList<String> availableCars = new ArrayList<String>();
        availableCars.add("Honda");
        availableCars.add("Chevy");
        availableCars.add("Toyota");
        return availableCars;
    }
}
