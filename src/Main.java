import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ParkingLot park = new ParkingLot(20);

        while (true){
            System.out.println("\nParking Lot Management System");
            System.out.println("1. Park a Vehicle");
            System.out.println("2. Leave a Parking Spot");
            System.out.println("3. View Available Spots");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int input = reader.nextInt();
            if (input==1){
                park.parkVehicle();
            } else if (input == 2) {
                park.leaveParkingSpot();
            } else if (input == 3) {
                park.viewAvailableSpots();
            } else if (input==4) {
                System.out.println("Thanks for visiting our page. GOODBYE!!");
                break;
            }else {
                System.out.println("Invalid choice");
            }

        }
    }
}