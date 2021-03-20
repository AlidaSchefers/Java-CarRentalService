package com.carRentalService;

import java.util.ArrayList;

public class CarInventory {
//    private static String[] carModelsArr = new String[]{"Honda", "Chevy", "Toyota", "Hyundai", "BMW"};

    static ArrayList<Car> carInventoryArr = new ArrayList<Car>();

    static public void initializeCarInventory() {
        Car car001 = new Car("car001","Honda", true);
        carInventoryArr.add(car001);

        Car car002 = new Car("car002","Chevy", true);
        carInventoryArr.add(car002);

        Car car003 = new Car("car003", "Toyota", true);
        carInventoryArr.add(car003);

        Car car004 = new Car("car004","Hyundai", true);
        carInventoryArr.add(car004);

        Car car005 = new Car("car005","BMW", true);
        carInventoryArr.add(car005);
    }

    static ArrayList<Car> getCarInventory() {
        return carInventoryArr;
    }
}
