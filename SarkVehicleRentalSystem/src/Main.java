public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Add vehicles
        Vehicle car = new Car("C001", "Toyota Corolla", 50.0);
        Vehicle truck = new Truck("T001", "Freightliner", 100.0, 1200.0);
        Vehicle motorcycle = new Motorcycle("M001", "Yamaha R1", 30.0);

        agency.addVehicle(car);
        agency.addVehicle(truck);
        agency.addVehicle(motorcycle);

        // Create a customer
        Customer customer = new Customer("CUST001", "Alice");

        // Rent a vehicle
        agency.rentVehicle(customer, "T001", 5);

        // Print available vehicles
        System.out.println("Available Vehicles: " + agency.getAvailableVehicles());

        // Return the vehicle
        truck.returnVehicle();
        System.out.println("Available Vehicles After Return: " + agency.getAvailableVehicles());
    }
}
