import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Vehicle> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRentalHistory(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Rentals: " + rentalHistory.size();
    }
    
}

