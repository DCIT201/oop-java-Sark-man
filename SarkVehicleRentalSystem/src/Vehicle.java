public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true; // Default: available
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailableForRental() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model + ", Rate: $" + baseRentalRate + "/day";
    }
}
