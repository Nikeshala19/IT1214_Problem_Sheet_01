class Vehicle {
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
    private Vehicle[] vehicles = new Vehicle[5];
    private int count = 0;

    public void parkVehicle(Vehicle vehicle) {
        if (count < vehicles.length) {
            vehicles[count++] = vehicle;
        } else {
            System.out.println("Parking lot is full.");
        }
    }

    public void removeVehicle(String licensePlate) {
          for (int i = 0; i < count; i++) {
            if (vehicles[i].getLicensePlate().equals(licensePlate)) {
                for (int j = i; j < count - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }
                vehicles[--count] = null;
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }


    public void displayVehicles() {
       for (int i = 0; i < count; i++) {
            System.out.println("License: " + vehicles[i].getLicensePlate() +
                               ", Owner: " + vehicles[i].getOwnerName() +
                               ", Hours: " + vehicles[i].getHoursParked());
        }
    }
}

public class Question02 {
    public static void main(String[] args) {
        parkingLot pLot = new ParkingLot();

        pLot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        pLot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        pLot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

        pLot.removeVehicle("XYZ789");

        pLot.displayVehicles();
    }
}