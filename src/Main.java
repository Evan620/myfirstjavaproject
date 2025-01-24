import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSpots = 5;
        int occupiedSpots = 0;

        while (true) {
            System.out.println("\nParking Lot Management System");
            System.out.println("1. Park a Vehicle");
            System.out.println("2. Leave a Parking Spot");
            System.out.println("3. View Available Spots");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                if (occupiedSpots < totalSpots) {
                    System.out.println("Parking confirmed.");
                    occupiedSpots++;
                } else {
                    System.out.println("Parking is full.");
                }
            } else if (choice == 2) {
                if (occupiedSpots > 0) {
                    System.out.println("Leaving confirmed.");
                    occupiedSpots--;

                } else {
                    System.out.println("No vehicles parked.");
                }
            } else if (choice == 3) {
                int availableSpots = totalSpots - occupiedSpots;
                System.out.println("Available Spots: " + availableSpots);
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
