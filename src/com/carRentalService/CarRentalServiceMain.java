package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

//public class CarRentalServiceMain {
//    public static void main(String[] args) {
//        System.out.println("Welcome to Java Car Rentals!");
//        while(true) {
//            System.out.println();
//            String pathSelection = HomeScreen.readPathSelection();
//            if(pathSelection.equals("rent")){
//                System.out.println("You want to rent a car.");
//            }else if(pathSelection == "return"){
//                System.out.println("You want to return a car."); //bug: need to input "return" twice before this is printed.
//            }
//        }
//    }
//}



public class CarRentalServiceMain {
    public static void main(String[] args) {
        CarInventory.initializeCarInventory();
        ArrayList<Car> carInventoryArr = CarInventory.getCarInventory();
        System.out.println("Welcome to Java Car Rentals!");
        while(true) {
            System.out.println();
            HomeScreen.printPathOptions(carInventoryArr);
            String pathSelection = HomeScreen.readPathSelection();
            if (pathSelection.equals("rent") && SplitCars.giveCarsArrByAvailability(carInventoryArr, true).size() > 0) {
                System.out.println("Rent time!");
                RentSequence.runRentSequence(carInventoryArr); //the RENT loop
            }else if (pathSelection.equals("return") && SplitCars.giveCarsArrByAvailability(carInventoryArr, false).size() > 0) {
                System.out.println("Return time!");
                ReturnSequence.runReturnSequence(carInventoryArr);
                //if "go back", do break
                //if try again, go to method!
            }else{
                System.out.println("Invalid Input. Try Again.");
            }
        }
        //        while(true) {
//            RentSequence.runRentSequence(); //the RENT loop
//            ReturnSequence.r
//        }
        //start the loop! while(true).
        //then can enter one of two loops: rent or return. when want to return to main stage, use break to leave the loop!

//        ArrayList<String> availableCars = AvailableCars.getAvailableCars();
//        while(availableCars.size() != 0) {
//            AvailabilityReport.printAvailableCarsStr(availableCars);
//            Console.readCarSelection(availableCars);
//        }
//        System.out.print("No cars are currently available.");
    }

}
