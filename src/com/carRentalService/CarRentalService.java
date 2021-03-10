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
            }else{ //invalid selection
                System.out.println("Invalid selection. Please try again.");
            }
        }
        System.out.println("No cars are currently available.");
    }
}
