package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    static private Scanner scanner = new Scanner(System.in);

    static void readInput(ArrayList<String> availableCars) {
        byte selection = scanner.nextByte();
//            try{
//                byte selection = scanner.nextByte();
//                if (selection >= 1 && selection <= availableCars.size()) { //valid selection
//                    availableCars.remove(selection - 1);
//                } else { //invalid selection
//                    System.out.println("Car selection invalid. Please try again.");
//                }
//            }catch (Exception e){
//                System.out.println("invalid input");
//            }
        if (selection >= 1 && selection <= availableCars.size()) { //valid selection
            availableCars.remove(selection - 1);
        } else { //invalid selection
            System.out.println("Car selection invalid, please try again.");
        }
    }
}
