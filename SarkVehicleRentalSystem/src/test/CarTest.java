import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testCarRentalCost() {
        Car car = new Car("C001", "Toyota Corolla", 50.0);
        double cost = car.calculateRentalCost(5);
        assertEquals(250.0, cost, "Rental cost should be 250.0 for 5 days.");
    }

    @Test
    public void testCarAvailability() {
        Car car = new Car("C001", "Toyota Corolla", 50.0);
        assertTrue(car.isAvailableForRental(), "Car should be available for rental initially.");
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental(), "Car should not be available after setting availability to false.");
    }
}
