import model.Car;
import model.CargoVan;
import model.Motorcycle;
import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        String customer = "Mario Petrov";

        Vehicle safeCar = new Car("Audi", "A8", 40000, 10, 5);
        Vehicle unsafeCar = new Car("Audi", "A3", 15000, 10, 3);

        Vehicle youngDriverMotorcycle = new Motorcycle("Yamaha", "XSR900 GP", 10000, 10, 20);
        Vehicle oldDriverMotorcycle = new Motorcycle("Yamaha", "MT-10 SP", 15000, 10, 28);

        Vehicle experiencedDriverVan = new CargoVan("Ford", "Transit", 20000, 15, 8);
        Vehicle inexperiencedDriverVan = new CargoVan("Mercedes", "Metris", 20000, 10, 1);

        Invoice.createInvoice(customer,
                safeCar,
                10);
    }
}
