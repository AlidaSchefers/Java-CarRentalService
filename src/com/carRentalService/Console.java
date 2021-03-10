package com.carRentalService;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    static void readInput(ArrayList<String> availableCars) {
        Scanner scanner = new Scanner(System.in);
        try{
            byte selection = scanner.nextByte();
            if (selection >= 1 && selection <= availableCars.size()) { //valid selection
                availableCars.remove(selection - 1);
            } else { //invalid byte input (e.g. 9 when there are only 3 options)
                System.out.println("Car selection invalid. Please try again.");
            }
        }catch (Exception e){ //invalid input type (e.g. a string like "Honda")
            System.out.println("Car selection invalid, please try again.");
        }
    }
}
