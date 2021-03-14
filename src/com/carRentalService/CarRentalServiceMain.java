package com.carRentalService;

import java.util.ArrayList;

public class CarRentalService {
    public static void main(String[] args) {
        makeACar();
        ArrayList<String> availableCars = AvailableCars.getAvailableCars();
        while(availableCars.size() != 0) {
            AvailabilityReport.printAvailableCars(availableCars);
            Console.readInput(availableCars);
        }
        System.out.print("No cars are currently available.");
    }

    public static void makeACar() {
        Car car1 = new Car(false, "Name1");
        car1.setRenter(" ");
        System.out.println(car1.getRenter());
    }
}
