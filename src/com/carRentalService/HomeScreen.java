package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

//public class HomeScreen {
//    static public String readPathSelection() {
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.print("Selection: ");
//            String pathSelection = scanner.nextLine();
//            if (pathSelection.toLowerCase().matches("rent")) {
//                return "rent";
//            }else if (pathSelection.toLowerCase().matches("return")) {
//                return "return";
//            } else {
//                System.out.println("Invalid input. Please try again.");
//            }
//        }
////       String pathSelection;
////        do {
////            System.out.print("Selection: ");
////            pathSelection = scanner.nextLine();
////            if (pathSelection.toLowerCase().matches("rent")) {
//////                return "rent";
////            }else if (pathSelection.toLowerCase().matches("return")) {
//////                return "return";
////            } else {
////                System.out.println("Invalid input. Please try again.");
////            }
////        }while (pathSelection != "rent" || pathSelection != "return");
////       return null;
//    }
//}


public class HomeScreen {
    static public void printPathOptions(ArrayList<Car> carInventoryArr){
        System.out.println("We have "+carInventoryArr.size()+" cars in our lineup. \n"+ "Would you like to...");
        if(SplitCars.giveCarsArrByAvailability(carInventoryArr, true).size() > 0)
            System.out.println("\tRent ("+SplitCars.giveCarsArrByAvailability(carInventoryArr, true).size()+" Car(s) Available)");
        if(SplitCars.giveCarsArrByAvailability(carInventoryArr, false).size() > 0)
            System.out.println("\tReturn ("+SplitCars.giveCarsArrByAvailability(carInventoryArr, false).size()+" Car(s) Available)");
        System.out.println("Select an option...");
    }
    static public String readPathSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Selection: ");
            String pathSelection = scanner.nextLine();
            if (pathSelection.toLowerCase().matches("rent")) {
                return "rent";
            }else if (pathSelection.toLowerCase().matches("return")) {
                return "return";
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
