package model;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected double value;
    protected int rentalPeriod;

    public Vehicle(String brand, String model, double value, int rentalPeriod) {
        this.brand = brand;
        this.model = model;
        this.value = value;
        this.rentalPeriod = rentalPeriod;
    }

    public abstract double calculateRentalCost();
    public abstract double calculateInsuranceCost();
    public abstract void pricePerDay();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getValue() {
        return value;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }
}
