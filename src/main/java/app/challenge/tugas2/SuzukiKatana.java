package app.challenge.tugas2;

public class SuzukiKatana extends Car {
    private boolean sportBike;

    // Constructor
    public SuzukiKatana(int numberOfDoors, boolean sportBike) {
        super(2, "Petrol", numberOfDoors);
        this.sportBike = sportBike;
    }

    // Override method
    @Override
    public void start() {
        System.out.println("Suzuki Katana is starting with a burst of speed.");
    }
}
