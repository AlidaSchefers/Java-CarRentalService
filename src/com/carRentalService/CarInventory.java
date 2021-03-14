package com.carRentalService;

import java.util.ArrayList;

public class CarInventory {
//    private static String[] carModelsArr = new String[]{"Honda", "Chevy", "Toyota", "Hyundai", "BMW"};

    public ArrayList<Object> giveCarInventory() {
        ArrayList<Object> carInventoryArr = new ArrayList<Object>();

        Car car001 = new Car("Honda", true);
        carInventoryArr.add(car001);

        Car car002 = new Car("Chevy", true);
        carInventoryArr.add(car002);

        Car car003 = new Car("Toyota", true);
        carInventoryArr.add(car003);

        Car car004 = new Car("Hyundai", true);
        carInventoryArr.add(car004);

        Car car005 = new Car("BMW", true);
        carInventoryArr.add(car005);

        return carInventoryArr;

    }
}
