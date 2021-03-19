package com.carRentalService;

import java.util.ArrayList;

public class ReturnSequence {
    static public void runReturnSequence(ArrayList<Car> carInventoryArr){
        while(true){
            ArrayList<Car> rentedCarObjs = SplitCars.giveCarsArrByAvailability(carInventoryArr, false);
            Console.readReturnCarSelection(rentedCarObjs);
//            String nameConfirmationPrompt = "Enter the name you used to rent the "+rentedCarObjs.get(Console.selectedCarByte).getMake()+".")
            Console.readRenterNameReturnConfirmation(("Enter  the name you used to rent the "+rentedCarObjs.get(Console.selectedCarByte-1).getMake()+".\nEnter Name: "),
                    Console.selectedCarByte,
                    rentedCarObjs);
            break;
        }
    }
}
