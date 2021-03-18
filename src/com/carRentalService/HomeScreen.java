package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeScreen {
    static public void printPathOptions(ArrayList<Car> carInventoryArr){
        System.out.println("We have "+carInventoryArr.size()+" cars in our lineup. \n"+ "Would you like to...");
        if(SplitCars.giveCarsArrByAvailability(carInventoryArr, true).size() > 0)
            System.out.println("1) Rent ("+SplitCars.giveCarsArrByAvailability(carInventoryArr, true).size()+" Car(s) Available)");
        if(SplitCars.giveCarsArrByAvailability(carInventoryArr, false).size() > 0)
            System.out.println("2) Return ("+SplitCars.giveCarsArrByAvailability(carInventoryArr, false).size()+" Car(s) Available)");
        System.out.println("Select an option...");
    }
    static public String readPathSelection() {
        while (true) {
            System.out.print("Selection: ");
            Scanner scanner = new Scanner(System.in);
            String pathSelection = scanner.nextLine();
            if (pathSelection.toLowerCase().matches("rent") || pathSelection == "1") { //1 doesn't work...
                return "rent";
            } else if (pathSelection.toLowerCase().matches("return") || pathSelection == "2") { //2 doesn't work...
                return "return";
            } else {
                System.out.println("Invalid input. Please try again.");
                //bug comes during this scenerio: first, invalid (e.g. 'm') then 'return'. but dont get correct print. instead asks for selection without the 'invalid input warning.' do return again and it's fine.
            }
        }
    }
}
