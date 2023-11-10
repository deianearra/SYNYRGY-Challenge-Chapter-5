package app.challenge.tugas2;

public class HondaJazz extends Car {
        private boolean hybrid;

        // Constructor
        public HondaJazz(int numberOfDoors, boolean hybrid) {
            super(4, "Petrol", numberOfDoors);
            this.hybrid = hybrid;
        }

        // Override method
        @Override
        public void start() {
            System.out.println("Honda Jazz is starting quietly.");
        }
    }
