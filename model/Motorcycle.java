package model;

public class Motorcycle extends Vehicle{
    private int driverAge;

    public Motorcycle(String brand, String model, double value, int rentalPeriod, int driverAge) {
        super(brand, model, value, rentalPeriod);
        this.driverAge = driverAge;
    }

    @Override
    public double calculateRentalCost() {
        if (rentalPeriod <= 7) {
            return rentalPeriod * 15;
        } else {
            return rentalPeriod * 10;
        }
    }

    double insurance = value * 0.02 / 100;

    @Override
    public double calculateInsuranceCost() {
        double calcInsurance = insurance;
        if (driverAge < 25) {
            calcInsurance *= 1.2;
        }
        return calcInsurance * rentalPeriod;
    }

    @Override
    public void pricePerDay() {
        System.out.printf("Rental cost per day: $%.2f \n", calculateRentalCost() / rentalPeriod);
        if(driverAge < 25) {
            System.out.printf("Initial insurance per day: $%.2f \n", insurance);
            System.out.printf("Insurance addition per day: $%.2f \n", insurance * 0.2);

        }
        System.out.printf("Insurance per day: $%.2f \n\n", calculateInsuranceCost() / rentalPeriod);
    }
}
