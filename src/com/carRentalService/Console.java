package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    public static byte selectedCarByte;
    public static ArrayList<Car> carInventory = CarInventory.getCarInventory();

//    static void readRentCarSelectionWStrArr(ArrayList<String> availableCarsArr) {
//        while(true) {
//            AvailabilityReport.printAvailableCarsStr(availableCarsArr);
//            System.out.print("Selection: ");
//            Scanner scanner = new Scanner(System.in);
//            try{
//                byte selection = scanner.nextByte();
//                if (selection >= 1 && selection <= availableCarsArr.size()) { //valid selection
//                    System.out.println("ACTION: this car's availability should change to false!");//change isAvailable to false
//                    selectedCarByte = selection;
//                    if(Console.readConfirmation(Console.selectedCarByte, availableCarsArr)){ //true: user is sure. false: user is not sure
//                        break;
//                    }
//                } else { //invalid byte input (e.g. 9 when there are only 3 options)
//                    System.out.println("Car selection invalid. Please try again.");
//                }
//            }catch (Exception e){ //invalid input type (e.g. a string like "Honda")
//                System.out.println("Car selection invalid, please try again.");
//            }
////            System.out.println(Console.readConfirmation(Console.selectedCarByte, availableCarsArr)); //true: user is sure. false: user is not sure
//        }
//    }

    static void readRentCarSelectionWCarArr(ArrayList<Car> availableCarsObjsArr) {
        while(true) {
            AvailabilityReport.printAvailableCarsCar(availableCarsObjsArr);
            System.out.print("Selection: ");
            Scanner scanner = new Scanner(System.in);
            try{
                byte selection = scanner.nextByte();
                if (selection >= 1 && selection <= availableCarsObjsArr.size()) { //valid selection
//                    System.out.println("ACTION: this car's availability should change to false!");//change isAvailable to false
                    selectedCarByte = selection;
//                    availableCarsObjsArr.get(selection-1).setAvailability(false);
                    if(readConfirmation("Are you sure you would like to rent the "+availableCarsObjsArr.get(selectedCarByte-1).getModel()+"? ")){ //true: user is sure. false: user is not sure
//                            System.out.println("ACTION: this car's availability should change to false!");//change isAvailable to false
//                            findCarInCarInventoryAndSetAvailability(availableCarsObjsArr.get(selection-1).getCarID(), false);
//                        ^^^these lines should not happen here. when you make it false, it removes it from the availableCars array and we cannot
                        break;
                    }
                } else { //invalid byte input (e.g. 9 when there are only 3 options)
                    System.out.println("Car selection invalid. Please try again.");
                }
            }catch (Exception e){ //invalid input type (e.g. a string like "Honda")
                System.out.println("Car selection invalid. Please try again.");
            }
//            System.out.println(Console.readConfirmation(Console.selectedCarByte, availableCarsObjsArr)); //true: user is sure. false: user is not sure
        }
    }

    static boolean readConfirmation(String prompt) {
        while(true) {
//            System.out.print("Are you sure you would like to rent the "+availableCarsArr.get(selectedCarByte-1).getModel()+"? ");
            System.out.print(prompt);
            Scanner scanner = new Scanner(System.in);
            try{
                String confirmation = scanner.nextLine();
                if(confirmation.toLowerCase().matches("yes") || confirmation.toLowerCase().matches("y")){ // YES/Yes/yes or Y/y
                    return true;
                }
                else if(confirmation.toLowerCase().matches("no") || confirmation.toLowerCase().matches("n")){ // NO/No/no or N/n
                    return false;
                }else{
                    System.out.println("Invalid input. Please try again.");
                }
            }catch (Exception e){
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public static void findCarInCarInventoryAndSetAvailability(String carID, boolean newAvailability){
        for (Car car : CarInventory.getCarInventory()) {
            if(car.getCarID() == carID) { //if the car in carInventory has carID that same as the carID of the car selected in the program...
                car.setAvailability(newAvailability); //update the availability of the car inside the carInventory array.
            }
        }
    }

    public static void findCarInCarInventoryAndSetRenter(String carID, String rentersName){
        for (Car car : CarInventory.getCarInventory()) {
            if(car.getCarID().equals(carID)) {
                car.setRenter(rentersName);
            }
        }
    }

    static void readNewRentalName(String prompt, byte selectedCarByte, ArrayList<Car> availableCarsArr) {
        while(true) {
            System.out.print(prompt); //e.g. What is the name you would like to use for your rental? \n Enter Name:
            Scanner scanner = new Scanner(System.in);
//            try{
                String rentersName = scanner.nextLine();
                if(!rentersName.trim().equals("") && !rentersName.trim().equals("return")){
                    System.out.println(carInventory.get(0));
                    System.out.println("ACTION: this car's availability should change to false!");//change isAvailable to false
                    findCarInCarInventoryAndSetAvailability(availableCarsArr.get(selectedCarByte-1).getCarID(), false);
//                    System.out.println();
//                    CarInventory.getCarInventory().get(0).getCarID()
//                    for (Car car : carInventory) {
//                        System.out.println("each car's ID:");
//                        System.out.printf(car.getCarID());
//
////                        if(car.getCarID().equals(availableCarsArr.get(selectedCarByte-1).getCarID())) { //if the car in carInventory has carID that same as the carID of the car selected in the program...
////                            car.setAvailability(false); //update the availability of the car inside the carInventory array.
////                        }
//                    }

                    System.out.println("ACTION: This will be the line where renter's name will be updated!");
//                    findCarInCarInventoryAndSetRenter(availableCarsArr.get(selectedCarByte-1).getCarID(), rentersName);

                    System.out.println("Successful reservation!");
                    break;
                }else{
                    System.out.println("Invalid input. Please try again.");
                }
//            }catch (Exception e){ //invalid input type (e.g. a string like 3)... unless it implicetly casts??
//                System.out.println("Wrong form. Invalid input. Please try again.");
//            }
        }
    }

//    static void readNewRentalName(String prompt, ArrayList<String> availableCarsArr) {
//        while(true) {
//            System.out.print(prompt); //e.g. What is the name you would like to use for your rental? \n Enter Name:
//            Scanner scanner = new Scanner(System.in);
//            try{
//                String rentersName = scanner.nextLine();
//                if(!rentersName.trim().equals("") && !rentersName.trim().equals("return")){
//                    System.out.println("This will be the line where renter's name will be updated!");
//                }else if (rentersName.trim().equals("return")){
//                    break; //break out of this loop, i.e. go back to rent or return page
//                }else{
//                    System.out.println("Invalid input. Please try again, or type \"return\" to be brought back to the main screen.");
//                }
//            }catch (Exception e){ //invalid input type (e.g. a string like 3)... unless it implicetly casts??
//                System.out.println("Invalid input. Please try again, or type \"return\" to be brought back to the main screen.");
//            }
//        }
//    }
}
