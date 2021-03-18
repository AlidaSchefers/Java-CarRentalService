package com.carRentalService;

import java.util.ArrayList;

public class InventoryReport {

    static void printAvailableCarsStr(ArrayList<String> availableCars) { //overloading results in an error "both methods have same erasure"
        System.out.println("Available Cars:");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i+1)+") "+ availableCars.get(i));
        }
    }

    static void printAvailableCarsCar(ArrayList<Car> availableCarsObjsArr) {
        System.out.println("Available Cars:");
        for (int i = 0; i < availableCarsObjsArr.size(); i++) {
            System.out.println((i+1)+") "+ availableCarsObjsArr.get(i).getMake());
        }
    }

    static void printRentedCarsCar(ArrayList<Car> rentedCarsObjsArr) {
        System.out.println("Currently Rented Cars:");
        for (int i = 0; i < rentedCarsObjsArr.size(); i++) {
            System.out.println((i+1)+") "+ rentedCarsObjsArr.get(i).getMake());
        }
    }

}
