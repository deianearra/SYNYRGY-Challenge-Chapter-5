package app.challenge.tugas2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Tugas 2A
        BankAccount account = new BankAccount("123456789", 1000.0,
                "Deianearra", "dei@email.com", "123-456-789");

        System.out.println("Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Balance: $" + account.getBalance());

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);

        // Tugas 2B
        Vehicle genericVehicle = new Vehicle(4, "Generic Fuel");
        Car genericCar = new Car(4, "Generic Fuel", 4);
        HondaJazz hondaJazz = new HondaJazz(4, true);
        ToyotaFortuner toyotaFortuner = new ToyotaFortuner(4, true);
        SuzukiKatana suzukiKatana = new SuzukiKatana(2, true);


        Vehicle[] vehicles = {genericVehicle, genericCar, hondaJazz, toyotaFortuner, suzukiKatana};
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Details:");
            System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());
            System.out.println("Fuel Type: " + vehicle.getFuelType());
            vehicle.move();
            if (vehicle instanceof Car) {
                ((Car) vehicle).start();
            }
            System.out.println();
        }
    }
}