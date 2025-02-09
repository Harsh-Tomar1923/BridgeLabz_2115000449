package oops;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle1 {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle1(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car1 extends Vehicle1 implements GPS {
    private String currentLocation;

    public Car1(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class Bike1 extends Vehicle1 implements GPS {
    private String currentLocation;

    public Bike1(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class Auto extends Vehicle1 implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle1> rides = new ArrayList<>();

        Car1 car = new Car1("C101", "Harsh", 12, "Downtown");
        Bike1 bike1 = new Bike1("B202", "Ayush", 5, "Airport");
        Auto auto = new Auto("A303", "Shivam", 8, "City Center");

        rides.add(car);
        rides.add(bike1);
        rides.add(auto);

        double rideDistance = 10;

        for (Vehicle1 ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for " + rideDistance + " km: " + ride.calculateFare(rideDistance));

            if (ride instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) ride).getCurrentLocation());
                ((GPS) ride).updateLocation("New Destination");
                System.out.println("Updated Location: " + ((GPS) ride).getCurrentLocation());
            }
            System.out.println();
        }
    }
}
