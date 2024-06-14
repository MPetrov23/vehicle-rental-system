# vehicle-rental-system

Java program for renting vehicles via a command-line interface. It handles different vehicle types like cars, motorcycles and cargo vans. They all have specific details like brand, model, and rental period.

The core of the program is the Invoice class, which generates invoices automatically when a vehicle is returned. It calculates rental costs based on daily rates, adjusting for longer rentals with reduced daily costs. Insurance costs are computed as a percentage of the vehicle's value, modified by factors like safety rating, driver age, or experience.

Early return handling by applying discounts on rental and insurance costs for the unused days. Outputs are displayed directly in the console, showing rental details, costs per day, and final invoice totals.

