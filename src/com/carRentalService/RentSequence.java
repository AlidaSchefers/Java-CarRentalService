package com.carRentalService;

import java.util.ArrayList;

public class RentSequence {
    //loop starts here. break when want to return to home screen.





    public static void runRentSequence() {
        while(true) {
            //WITH CAR STRINGS
//        AvailabilityReport.printAvailableCars(CarInventory());
//            ArrayList<String> availableCars = AvailableCars.getAvailableCars();
//            Console.readRentCarSelection(availableCars);
//            Console.readNewRentalName("What is the name you would like to use for your rental? ", availableCars);
//            break;

//            Car carNew = new Car("MyCar", true);

            //with CAR OBJECTS
            ArrayList<Car> availableCarObjs = CarInventory.getCarInventory();
//            System.out.println(availableCarObjs.get(0).getModel());
//            System.out.println(carNew.getModel());
            Console.readRentCarSelectionWCarArr(availableCarObjs);
            Console.readNewRentalName("What is the name you would like to use for your rental? ", Console.selectedCarByte, availableCarObjs);
            ////////
            System.out.println("The rented car's attributes:");
            System.out.println("Rented car's model: "+availableCarObjs.get(Console.selectedCarByte-1).getModel());
            System.out.println("Is the rented car available?: "+availableCarObjs.get(Console.selectedCarByte-1).getAvailability());
            System.out.println("Rented car's renter: "+availableCarObjs.get(Console.selectedCarByte-1).getRenter());

            break;
        }
    }
}
