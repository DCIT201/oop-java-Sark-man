import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public void rentVehicle(Customer customer, String vehicleId, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.rent(customer, days);
                customer.addRentalHistory(vehicle);
                return;
            }
        }
        System.out.println("Vehicle not available.");
    }
}
