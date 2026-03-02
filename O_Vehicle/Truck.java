package O_Vehicle;

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

    @Override
    public void addVehicle() {
        Scanner sc = new Scanner(System.in);
        super.addVehicle();

        while (true) {
            try {
                System.out.print("Enter vehicle Load Capacity: ");
                double capacity = Double.parseDouble(sc.nextLine());

                if (capacity < 0) {
                    System.out.println("Capacity must be >= 0");
                    continue;
                }

                setLoadCapacity(capacity);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }

        while (true) {
            try {
                System.out.print("Enter vehicle Distance: ");
                double dis = Double.parseDouble(sc.nextLine());

                if (dis < 0) {
                    System.out.println("Distance must be >= 0");
                    continue;
                }

                setDistance(dis);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }

        System.out.println("Truck added successfully!");
    }

    @Override
    public void updateVehicle(String id) {
        if (!getId().equalsIgnoreCase(id)) {
            return;
        }

        Scanner sc = new Scanner(System.in);
        super.updateVehicle(id);

        while (true) {
            try {
                System.out.print("Enter new vehicle Load Capacity: ");//kha nang chiu tai
                double capacity = Double.parseDouble(sc.nextLine());

                if (capacity < 0) {
                    System.out.println("Capacity must be >= 0");
                    continue;
                }

                setLoadCapacity(capacity);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }

        while (true) {
            try {
                System.out.print("Enter new vehicle Distance: ");
                double distance = Double.parseDouble(sc.nextLine());

                if (distance < 0) {
                    System.out.println("Distance must be >= 0");
                    continue;
                }

                setDistance(distance);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Truck updated successfully!");
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();
        System.out.println("Load Capacity: " + getLoadCapacity() + ", Distance: " + getDistance());
    }
}
