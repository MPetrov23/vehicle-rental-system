package model;

public class CargoVan extends Vehicle{
    private int driverExperience;

    public CargoVan(String brand, String model, double value, int rentalPeriod, int driverExperience) {
        super(brand, model, value, rentalPeriod);
        this.driverExperience = driverExperience;
    }

    @Override
    public double calculateRentalCost() {
        if (rentalPeriod <= 7) {
            return rentalPeriod * 50;
        } else {
            return rentalPeriod * 40;
        }
    }

    double insurance = value * 0.03 / 100;

    @Override
    public double calculateInsuranceCost() {
        double calcInsurance = insurance;
        if (driverExperience > 5) {
            calcInsurance *= 0.85;
        }
        return calcInsurance * rentalPeriod;
    }

    @Override
    public void pricePerDay() {
        System.out.printf("Rental cost per day: $%.2f \n", calculateRentalCost()/ rentalPeriod);
        if(driverExperience > 5) {
            System.out.printf("Initial insurance per day: $%.2f \n", insurance);
            System.out.printf("Insurance discount per day: $%.2f \n", insurance * 0.15);

        }
        System.out.printf("Insurance per day: $%.2f \n\n", calculateInsuranceCost() / rentalPeriod);
    }
}
