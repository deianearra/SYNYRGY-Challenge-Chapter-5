package app.challenge.tugas1;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah jam parkir: ");
        int hours = scanner.nextInt();

        double parkingCost = calculateParkingCost(hours);

        System.out.println("Biaya parkir yang harus dibayar: $" + parkingCost);
    }

    public static double calculateParkingCost(int hours) {
        final double initialCost = 1.0;
        final double hourlyRate = 0.5;
        final double maxCost = 15.0;

        if (hours <= 5) {
            return initialCost;
        } else if (hours <= 24) {
            return initialCost + (hours - 5) * hourlyRate;
        } else {
            return maxCost;
        }
    }
}
