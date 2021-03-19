package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    public static byte selectedCarByte;
    public static ArrayList<Car> carInventory = CarInventory.getCarInventory();

    //specifically RETURN methods
    static void readReturnCarSelection(ArrayList<Car> rentedCarsObjsArr){
        while(true) {
            InventoryReport.printRentedCarsCar(rentedCarsObjsArr);
            System.out.println("Select the car you rented.");
            System.out.print("Selection: ");
            Scanner scanner = new Scanner(System.in);
            try {
                byte selection = scanner.nextByte();
                if (selection >= 1 && selection <= rentedCarsObjsArr.size()) { //valid selection
                    selectedCarByte = selection;
                    break;
                } else { //invalid byte input (e.g. 9 when there are only 3 options)
                    System.out.println("Car selection invalid. Please try again.");
                }
            } catch (Exception e) { //invalid input type (e.g. a string like "Honda")
                System.out.println("Car selection invalid. Please try again.");
            }
        }
    }

    static void readRenterNameReturnConfirmation(String prompt, byte selectedCarByte, ArrayList<Car> rentedCarsObjsArr) {
        while (true) {
            System.out.print(prompt);
            Scanner scanner = new Scanner(System.in);
//            try{
            String rentersName = scanner.nextLine();
            //with the index get the carID from the rentedArray to find the corresponding CarInventoryArr index for the car. THEN see if the renters name matches.
            String selectedCarsID = rentedCarsObjsArr.get(selectedCarByte - 1).getCarID();
            byte indexOfCarInCarInventory = findIndexOfCarInCarInventory(selectedCarsID);
            String renterNameOfCarInCarInventory = CarInventory.getCarInventory().get(indexOfCarInCarInventory).getRenter();
            if(rentersName.toLowerCase().matches("go back")){
                break;
            }else if (rentersName.equals(renterNameOfCarInCarInventory)) {
                System.out.println("That is the correct name!");
                CarInventory.getCarInventory().get(indexOfCarInCarInventory).setAvailability(true);
                CarInventory.getCarInventory().get(indexOfCarInCarInventory).setRenter("");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
//            System.out.println("car in objsarr: " + selectedCarsID);
//            System.out.println("car in inventory: " + CarInventory.getCarInventory().get(indexOfCarInCarInventory).getCarID());
        }
    }

    //specifically RENT methods
    static void readRentCarSelectionWCarArr(ArrayList<Car> availableCarsObjsArr) {
        while(true) {
            InventoryReport.printAvailableCarsCar(availableCarsObjsArr);
            System.out.print("Selection: ");
            Scanner scanner = new Scanner(System.in);
            try{
                byte selection = scanner.nextByte();
                if (selection >= 1 && selection <= availableCarsObjsArr.size()) { //valid selection
                    selectedCarByte = selection;
                    if(readConfirmation("Are you sure you would like to rent the "+availableCarsObjsArr.get(selectedCarByte-1).getMake()+"? ")){ //true: user is sure. false: user is not sure
                        break;
                    }
                } else { //invalid byte input (e.g. 9 when there are only 3 options)
                    System.out.println("Car selection invalid. Please try again.");
                }
            }catch (Exception e){ //invalid input type (e.g. a string like "Honda")
                System.out.println("Car selection invalid. Please try again.");
            }
        }
    }

    static void readNewRentalName(String prompt, byte selectedCarByte, ArrayList<Car> availableCarsArr) {
        while(true) {
            System.out.print(prompt); //e.g. What is the name you would like to use for your rental?\nEnter Name:
            Scanner scanner = new Scanner(System.in);
//            try{
            String rentersName = scanner.nextLine();
            if(!rentersName.trim().equals("") && !rentersName.trim().equals("return")){
                findCarInCarInventoryAndSetAvailability(availableCarsArr.get(selectedCarByte-1).getCarID(), false); //changes property isAvailable to false
                findCarInCarInventoryAndSetRenter(availableCarsArr.get(selectedCarByte-1).getCarID(), rentersName); //changes rentersName property to user's input
                System.out.println("Successful reservation! \n-----------------------");
                break;
            }else{
                System.out.println("Invalid input. Please try again.");
            }
//            }catch (Exception e){ //invalid input type (e.g. a string like 3)... unless it implicetly casts??
//                System.out.println("Wrong form. Invalid input. Please try again.");
//            }
        }
    }

    //other methods
    static boolean readConfirmation(String prompt) {
        while(true) {
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
//                System.out.println("New isAvailable boolean value: "+ car.getAvailability());
            }
        }
    }

    public static byte findIndexOfCarInCarInventory(String selectedCarsID) {
        for (byte i = 0; i < CarInventory.getCarInventory().size(); i++) {
            if (CarInventory.getCarInventory().get(i).getCarID().equals(selectedCarsID)) {
                return i;
            }
        }
        return -1;
    }

    public static void findCarInCarInventoryAndSetRenter(String carID, String rentersName){
        for (Car car : CarInventory.getCarInventory()) {
            if(car.getCarID().equals(carID)) {
                car.setRenter(rentersName);
//                System.out.println("New Current Renter: "+car.getRenter().toString());
            }
        }
    }
}
