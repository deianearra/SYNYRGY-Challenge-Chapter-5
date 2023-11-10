package app.challenge.tugas2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    private int numberOfWheels;
    private String fuelType;

    // Constructor
    public Vehicle(int numberOfWheels, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
    }

    // Method
    public void move() {
        System.out.println("Vehicle is moving forward.");
    }
}
