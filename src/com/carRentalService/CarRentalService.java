package com.carRentalService;

import java.util.Scanner;

public class CarRentalService {
    public static void main(String[] args) {
        String[] availableCars = {"Honda", "Chevy", "Toyota"};
        String[] rentedCars = {};

        Scanner scanner = new Scanner(System.in);

        while(true) {
            if(availableCars.length == 0)
                break;
            System.out.println("Available Cars:");
            for (int i = 0; i < availableCars.length; i++) {
                System.out.println((i+1)+") "+availableCars[i]);
            }
            System.out.print("Selection: ");
            byte selection = scanner.nextByte();
            if(selection >= 1 && selection <= availableCars.length) { //valid selection

            }else{ //invalid selection

            }
        }

    }
}
