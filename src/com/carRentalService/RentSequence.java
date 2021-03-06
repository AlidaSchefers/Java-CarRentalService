package com.carRentalService;

import java.util.ArrayList;

public class RentSequence {
    //loop starts here. break when want to return to home screen.
    public static void runRentSequence(ArrayList<Car> carInventoryArr) {
        while(true) {
            ArrayList<Car> availableCarObjs = SplitCars.giveCarsArrByAvailability(carInventoryArr, true);
            Console.readRentCarSelectionWCarArr(availableCarObjs);
            Console.readNewRentalName("What is the name you would like to use for your rental? ", Console.selectedCarByte, availableCarObjs);
            break;
        }
    }
}

