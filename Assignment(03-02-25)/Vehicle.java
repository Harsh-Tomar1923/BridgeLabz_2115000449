package Assignment0302;

class Vehicle {
    private static double registrationFee = 5000.0;
    private String ownerName;
    private final String registrationNumber;
    private String vehicleType;

    public Vehicle(String ownerName, String registrationNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Harsh", "ABC123", "Car");
        Vehicle vehicle2 = new Vehicle("Ayush", "XYZ789", "Bike");

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        updateRegistrationFee(6000.0);
        System.out.println("\nUpdated Registration Fee: " + registrationFee);
    }
}
