package com.carRentalService;

public class Car {
    private String model;
    private boolean isAvailable;
    private String renter;

    public Car(String model, boolean isAvailable) {
        this(model, isAvailable, "");
    }

    public Car(String model, boolean isAvailable, String renter) {
        setModel(model);
        setAvailability(isAvailable);
        setRenter(renter);
    }
    //setters
    public void setModel(String model) {
        this.model = model;
    }
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void setRenter(String renter) {
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
