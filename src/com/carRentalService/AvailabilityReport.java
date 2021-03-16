package com.carRentalService;

import java.util.ArrayList;

public class AvailabilityReport {

    static void printAvailableCarsStr(ArrayList<String> availableCars) { //overloading results in an error "both methods have same erasure"
        System.out.println("Available Cars:");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i+1)+") "+ availableCars.get(i));
        }
    }

    static void printAvailableCarsCar(ArrayList<Car> availableCarsObjsArr) {
        System.out.println("Available Cars:");
        for (int i = 0; i < availableCarsObjsArr.size(); i++) {
            System.out.println((i+1)+") "+ availableCarsObjsArr.get(i).getModel()); //must change to fit with object elements in the array
        }
    }
}
