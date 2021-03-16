package com.carRentalService;

import java.util.ArrayList;

public class SplitCars {
    static ArrayList<Car> giveCarsArrByAvailability(ArrayList<Car> carInventoryArr, boolean isAvailable) {
        ArrayList<Car> CarsArrByAvailability = new ArrayList<Car>();
        for (Car car : carInventoryArr) {
            if (car.getAvailability() == isAvailable) {
                CarsArrByAvailability.add(car);
            }
        }
    return CarsArrByAvailability;
        //CarsArrByAvailability.get(0).setAvailability(false)
    }
}
