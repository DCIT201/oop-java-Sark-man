import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class RentalAgencyTest {
    @Test
    public void testRentVehicleSuccess() throws Exception {
        List<Vehicle> fleet = new ArrayList<>();
        Vehicle car = new Car("C001", "Toyota Corolla", 50.0);
        fleet.add(car);
        RentalAgency agency = new RentalAgency(fleet);

        Customer customer = new Customer("CUST001", "Alice");
        agency.rentVehicle(customer, "C001", 3);
        assertFalse(car.isAvailableForRental(), "Vehicle should not be available after rental.");
    }

    @Test
    public void testRentVehicleFailure() {
        List<Vehicle> fleet = new ArrayList<>();
        Vehicle car = new Car("C001", "Toyota Corolla", 50.0);
        fleet.add(car);
        RentalAgency agency = new RentalAgency(fleet);

        Customer customer = new Customer("CUST001", "Alice");
        Exception exception = assertThrows(VehicleNotAvailableException.class, () -> {
            car.setAvailable(false);
            agency.rentVehicle(customer, "C001", 3);
        });

        String expectedMessage = "Vehicle C001 is not available.";
        assertEquals(expectedMessage, exception.getMessage());
    }
}

