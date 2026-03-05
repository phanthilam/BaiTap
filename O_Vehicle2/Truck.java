package O_Vehicle2;

import java.util.Scanner;

public class Truck extends Vehicle {

    private double loadCapacity;
    private double distance;

    public Truck() {
    }

    public Truck(double loadCapacity, double distance, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addVehicle() {
        super.addVehicle();

        System.out.println("Enter vehicle LoadCapacity: ");
        setLoadCapacity(sc.nextDouble());

        System.out.println("Enter vehicle Distance: ");
        setDistance(sc.nextDouble());

        System.out.println("Truck added successfully");
    }

    @Override
    public void updateVehicle() {
        super.addVehicle();

        System.out.println("Enter new vehicle LoadCapacity: ");
        setLoadCapacity(sc.nextDouble());

        System.out.println("Enter new vehicle Distance: ");
        setDistance(sc.nextDouble());

        System.out.println("Truck updated successfully");
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();

        System.out.println("LoadCapacity: " + getLoadCapacity()
                + ", Distance: " + getDistance());
    }

}
