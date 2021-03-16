package com.carRentalService;

import java.util.ArrayList;

public class RentSequence {
    //loop starts here. break when want to return to home screen.

    public static void runRentSequence() {
        ArrayList<Car> carInventoryArr = CarInventory.getCarInventory();
        ArrayList<Car> availableCarObjs = SplitCars.giveCarsArrByAvailability(CarInventory.getCarInventory(), true);
        while(true) {

            //WITH CAR STRINGS
//        AvailabilityReport.printAvailableCars(CarInventory());
//            ArrayList<String> availableCars = AvailableCars.getAvailableCars();
//            Console.readRentCarSelection(availableCars);
//            Console.readNewRentalName("What is the name you would like to use for your rental? ", availableCars);
//            break;

//            Car carNew = new Car("MyCar", true);
//            System.out.println("round: "+round);
            //with CAR OBJECTS
//            ArrayList<Car> carInventoryArr = CarInventory.getCarInventory();
//            ArrayList<Car> availableCarObjs = SplitCars.giveCarsArrByAvailability(carInventoryArr, true);
//            ArrayList<Car> carInventoryArr = CarInventory.getCarInventory();
            System.out.println("carInventory:");
            System.out.println("Is "+carInventoryArr.get(1).getModel()+" AVAILABLE? "+carInventoryArr.get(1).getAvailability());
//            round++;
//            ArrayList<Car> availableCarObjs = SplitCars.giveCarsArrByAvailability(carInventoryArr, true);
//            for (int i = 0; i < availableCarObjs.size(); i++) {
//                System.out.println("Car "+(i+1)+" "+availableCarObjs.get(i).getModel());
//            }

//            System.out.println("Available cars, 1:");
//            System.out.println(availableCarObjs.get(0).getModel());

//            System.out.println(availableCarObjs.get(0).getModel());
//            System.out.println(carNew.getModel());
            Console.readRentCarSelectionWCarArr(availableCarObjs);
            System.out.println("current state of availableCarObjs:");
            for (int i = 0; i < availableCarObjs.size(); i++) {
                System.out.println("Car "+(i+1)+" "+availableCarObjs.get(i).getModel());
                System.out.println("Car "+(i+1)+" AVAILABLE? "+availableCarObjs.get(i).getAvailability());
            }

            Console.readNewRentalName("What is the name you would like to use for your rental? ", Console.selectedCarByte, availableCarObjs);
//            for (int i = 0; i < carInventoryArr.size(); i++) {
//                System.out.println("Car "+(i+1)+" "+carInventoryArr.get(i).getModel());
//                System.out.println("Car "+(i+1)+" AVAILABLE? "+carInventoryArr.get(i).getAvailability());
//            }
            System.out.println("current state of carInventoryArr:");
            for (int i = 0; i < carInventoryArr.size(); i++) {
                System.out.println("Car "+(i+1)+" "+carInventoryArr.get(i).getModel()+" AVAILABLE? "+carInventoryArr.get(i).getAvailability());
            }
//
//
// //
//            System.out.println("The rented car's attributes:");
//            System.out.println("Model is "+availableCarObjs.get(Console.selectedCarByte-1).getModel());
//            System.out.println("Availability is "+availableCarObjs.get(Console.selectedCarByte-1).getAvailability());
//            System.out.println("Renter's name is "+availableCarObjs.get(Console.selectedCarByte-1).getRenter());

            break;
        }
    }
}

