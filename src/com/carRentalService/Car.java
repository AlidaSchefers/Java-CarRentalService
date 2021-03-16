package com.carRentalService;

public class Car {
    private String carID;
    private String model;
    private boolean isAvailable;
    private String renter;

    public Car(String carID, String model, boolean isAvailable) {
        this(carID, model, isAvailable, "");
    }

    public Car(String carID, String model, boolean isAvailable, String renter) {
        setModel(model);
        setAvailability(isAvailable);
        setRenter(renter);
    }

//    @Override
//    public String toString() {}

    //setters
    public void setCarID(String carID) {
        this.carID = carID;
    }
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
    public String getCarID() {
        return carID;
    }
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
