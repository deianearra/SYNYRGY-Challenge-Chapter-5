package app.challenge.tugas2;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Car extends Vehicle {
        private int numberOfDoors;

        // Constructor
        public Car(int numberOfWheels, String fuelType, int numberOfDoors) {
            super(numberOfWheels, fuelType);
            this.numberOfDoors = numberOfDoors;
        }

        // Method
        public void start() {
            System.out.println("Car is starting.");
        }
    }