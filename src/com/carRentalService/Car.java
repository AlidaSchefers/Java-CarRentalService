package com.carRentalService;

import java.util.MissingFormatArgumentException;

public class Car {
    private String model;
    private boolean isAvailable;
    private String renter;

    public Car(String model, boolean isAvailable) {
        this(model, isAvailable, "");
    }

    public Car(String model, boolean isAvailable, String renter) { //overloading
        setAvailability(isAvailable);
        setRenter(renter);
    }

    //setters
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void setRenter(String renter) {
//        if(renter.trim().equals("") || renter.trim().equals("return")) {
//            throw new IllegalArgumentException("Name cannot be all whitespace. Please try again.");
//        }
        this.renter = renter;
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getRenter() {
        return renter;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

}
