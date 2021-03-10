package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRentalService {
    public static void main(String[] args) {
        ArrayList<String> availableCars = new ArrayList<String>();
        availableCars.add("Honda");
        availableCars.add("Chevy");
        availableCars.add("Toyota");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            if(availableCars.size() == 0)
                break;
            System.out.println("Available Cars:");
            for (int i = 0; i < availableCars.size(); i++) {
                System.out.println((i+1)+") "+availableCars.get(i));
            }
            System.out.print("Selection: ");
            byte selection = scanner.nextByte();
            if(selection >= 1 && selection <= availableCars.size()) { //valid selection
                availableCars.remove(selection-1);
            }else{ //invalid byte input. if there's a non-byte input, get InputMismatchException and program ends
                System.out.println("Invalid selection. Please try again.");
            }
        }

        System.out.println("No cars are currently available.");

//        while(true) { //handling non-byte inputs
//            if(availableCars.size() == 0)
//                break;
//            System.out.println("Available Cars:");
//            for (int i = 0; i < availableCars.size(); i++) {
//                System.out.println((i+1)+") "+availableCars.get(i));
//            }
//            System.out.print("Selection: ");
//
//            try{
//                byte selection = scanner.nextByte();
//                if (selection >= 1 && selection <= availableCars.size()) { //valid selection
//                    availableCars.remove(selection - 1);
//                } else { //invalid selection
//                    System.out.println("Car selection invalid. Please try again.");
//                }
//            }catch (Exception e){ //if an invalid input is given (e.g. "w"), then there's an infinite loop that displays the available cars and "selection: invalid input"
//                System.out.println("invalid input");
//            }
//        }

    }
}
