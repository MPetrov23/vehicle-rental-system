package model;

public class Car extends Vehicle{
    private int safetyRating;

    public Car(String brand, String model, double value, int rentalPeriod, int safetyRating) {
        super(brand, model, value, rentalPeriod);
        this.safetyRating = safetyRating;
    }

    @Override
    public double calculateRentalCost() {
        if (rentalPeriod <= 7) {
            return rentalPeriod * 20;
        } else {
            return rentalPeriod * 15;
        }
    }

    double insurance = value * 0.01 / 100;

    @Override
    public double calculateInsuranceCost() {
        double calcInsurance = insurance;
        if (safetyRating >= 4) {
            calcInsurance *= 0.9;
        }
        return calcInsurance * rentalPeriod;
    }

    @Override
    public void pricePerDay() {
        System.out.printf("Rental cost per day: $%.2f \n", calculateRentalCost() / rentalPeriod);
        if(safetyRating >= 4) {
            System.out.printf("Initial insurance per day: $%.2f \n", insurance);
            System.out.printf("Insurance discount per day: $%.2f \n", insurance * 0.1);

        }
        System.out.printf("Insurance per day: $%.2f \n\n", calculateInsuranceCost() / rentalPeriod);
    }
}