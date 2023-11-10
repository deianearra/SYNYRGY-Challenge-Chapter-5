package app.challenge.tugas2;

public class ToyotaFortuner extends Car {
        private boolean offRoadCapable;

        // Constructor
        public ToyotaFortuner(int numberOfDoors, boolean offRoadCapable) {
            super(4, "Diesel", numberOfDoors);
            this.offRoadCapable = offRoadCapable;
        }

        // Override method
        @Override
        public void start() {
            System.out.println("Toyota Fortuner is starting with a powerful engine roar.");
        }
    }
