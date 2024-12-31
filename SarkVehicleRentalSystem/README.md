# Advanced Vehicle Rental Management System

## Description
This is a comprehensive Vehicle Rental Management System built in Java, demonstrating key Object-Oriented Programming (OOP) principles including Encapsulation, Inheritance, Polymorphism, Abstraction, and Composition.

## Features
- Abstract base class for vehicles with unique implementations for Car, Motorcycle, and Truck.
- Support for managing rentals, returns, and customer history.
- Polymorphic behavior using interfaces and method overriding.
- Test coverage for core components.

## Project Structure
```
src/
|-- main/
|   |-- java/
|       |-- com/vehicle/rental/
|           |-- Vehicle.java
|           |-- Rentable.java
|           |-- Car.java
|           |-- Customer.java
|           |-- RentalAgency.java
|           |-- Main.java
|-- test/
    |-- java/
        |-- com/vehicle/rental/
            |-- VehicleTest.java
            |-- CustomerTest.java
            |-- RentalAgencyTest.java
```

## Requirements
- **Java**: JDK 11+
- **Build Tool**: Maven/Gradle
- **Testing**: JUnit 5

## How to Run
1. Clone the repository.
2. Compile the code using Maven or your preferred IDE.
3. Run the `Main.java` file to start the application.
4. Execute the unit tests using `mvn test` or your IDE.

## Example Usage
- Rent a vehicle by providing its ID and customer details.
- Return the rented vehicle to make it available again.

## Testing
Unit tests are located under `src/test/java/com/vehicle/rental/` and cover:
- Vehicle rental cost calculation.
- Customer rental history.
- Agency operations (rental and return).
