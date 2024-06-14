import model.Vehicle;
import java.time.LocalDate;

public class Invoice {

    public static void createInvoice(String customerName,
                              Vehicle vehicle,
                              int actualRentalDays){
        double rentalCost = vehicle.calculateRentalCost();
        double insuranceCost = vehicle.calculateInsuranceCost();
        int rentalPeriod = vehicle.getRentalPeriod();
        double adjustedRentalCost = rentalCost;
        double adjustedInsuranceCost = insuranceCost;
        LocalDate date = LocalDate.now();

        if (actualRentalDays < rentalPeriod) {
            adjustedRentalCost = actualRentalDays * (rentalCost / rentalPeriod) +
                    (rentalPeriod - actualRentalDays) * (rentalCost / rentalPeriod) / 2;

            adjustedInsuranceCost = actualRentalDays * (insuranceCost / rentalPeriod);
        }

        System.out.println("Date: " + date);
        System.out.println("Customer Name: " + customerName);
        System.out.printf("Rented Vehicle: %s %s\n\n", vehicle.getBrand(), vehicle.getModel());

        System.out.println("Reservation start date: " + date.minusDays(actualRentalDays));
        System.out.println("Reservation end date: " + date.plusDays(Math.abs(rentalPeriod - actualRentalDays)));
        System.out.printf("Reserved rental days: %d days\n\n", rentalPeriod);

        System.out.println("Actual Return Date: " + date);
        System.out.printf("Actual rental days: %d days\n\n", actualRentalDays);

        vehicle.pricePerDay();

        if (actualRentalDays < rentalPeriod) {
            System.out.printf("Early return discount for rent: $%.2f \n", rentalCost-adjustedRentalCost);
            System.out.printf("Early return discount for insurance: $%.2f \n\n", insuranceCost-adjustedInsuranceCost);
        }

        System.out.printf("Total rent: $%.2f%n", adjustedRentalCost);
        System.out.printf("Total insurance: $%.2f%n", adjustedInsuranceCost);
        System.out.printf("Total: $%.2f%n", adjustedRentalCost + adjustedInsuranceCost);
    }
}
