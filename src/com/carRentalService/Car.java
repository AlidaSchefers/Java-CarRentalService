package com.carRentalService;

public class Car {
    private String carID;
    private String make;
    private boolean isAvailable;
    private String renter;

    public Car(String carID, String make, boolean isAvailable) {
        this(carID, make, isAvailable, "");
    }

    public Car(String carID, String make, boolean isAvailable, String renter) {
        setCarID(carID);
        setMake(make);
        setAvailability(isAvailable);
        setRenter(renter);
    }

//    @Override
//    public String toString() {}

    //setters
    public void setCarID(String carID) {
        this.carID = carID;
    }
    public void setMake(String make) {
        this.make = make;
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
    public String getMake() {
        return make;
    }
    public String getRenter() {
        return renter;
    }
    public boolean getAvailability() {
        return isAvailable;
    }
}
