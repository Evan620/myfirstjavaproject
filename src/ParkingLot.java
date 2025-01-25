public class ParkingLot{
    private int totalSpots;
    private int occupiedSpots;

    public ParkingLot(int totalSpots){
        this.totalSpots=totalSpots;
        this.occupiedSpots=0;
    }

    public void parkVehicle(){
        if (occupiedSpots<totalSpots){
            occupiedSpots++;
            System.out.println("Vehicle parked");
        }else {
            System.out.println("Parking is full");
        }
    }

    public void leaveParkingSpot(){
        if (occupiedSpots>0){
            occupiedSpots--;
            System.out.println("vehicle leaving the parkingspot");
        }else {
            System.out.println("No vehicle parked");
        }
    }
    public void viewAvailableSpots(){
        System.out.println("Availbale spots = " + (totalSpots-occupiedSpots));
    }
}
