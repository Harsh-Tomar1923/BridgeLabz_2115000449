package Inheritence;

interface Refuelable {
    void refuel();
}

class Vehicle1 {
    protected String model;
    protected int maxSpeed;

    public Vehicle1(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle1 {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle. Battery capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle1 implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle. Fuel capacity: " + fuelCapacity + " liters");
    }
}

public class VehicleManagementTest {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 220, 60);

        ev.displayInfo();
        ev.charge();
        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
