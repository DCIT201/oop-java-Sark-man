import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CustomerTest {
    @Test
    public void testAddRentalHistory() {
        Customer customer = new Customer("CUST001", "Alice");
        Vehicle car = new Car("C001", "Toyota Corolla", 50.0);
        customer.addRentalHistory(car);
        List<Vehicle> rentals = customer.getRentalHistory();
        assertEquals(1, rentals.size(), "Rental history should have one vehicle.");
        assertEquals(car, rentals.get(0), "First rental should be the added car.");
    }

    @Test
    public void testLoyaltyPoints() {
        Customer customer = new Customer("CUST001", "Alice");
        customer.addRentalHistory(new Car("C001", "Toyota Corolla", 50.0));
        assertEquals(10, customer.calculatePoints(1), "Points should be 10 for 1 rental day.");
    }
}
