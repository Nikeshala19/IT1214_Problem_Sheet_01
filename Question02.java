public class Vehicle {
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    public Vehicle(String licensePlate, String ownerName, int hoursParked) {
        
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }

}

class ParkingLot {
    private Vehicle[] vehicles = new Vehical[5];
    private int count = 0;

    
    }

    public void parkVehicle(Vehicle vehicle) {
        
    }

    public void removeVehicle(String licensePlate) {
        
        }


    public void displayVehicles() {
      
}

public class Question02 {
    public static void main(String[] args) {
        ParkingLot pLot = new ParkingLot(5);

        pLot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        pLot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        pLot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

        pLot.removeVehicle("XYZ789");

        pLot.displayVehicles();
    }
}