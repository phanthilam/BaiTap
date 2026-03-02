package O_Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {

    private int numberOfSeats;
    private String fuelType;

    public Car() {
    }

    public Car(int numberOfSeats, String fuelType, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void addVehicle() {
        Scanner sc = new Scanner(System.in);
        super.addVehicle();

        System.out.println("Enter vehicle numberOfSeats: ");
        setNumberOfSeats(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter vehicle fuelType: ");
        setFuelType(sc.nextLine());

        System.out.println("Car added successfully!");
    }

    @Override
    public void updateVehicle(String id) {
        if (getId().equals(id)) {
            Scanner sc = new Scanner(System.in);
            super.updateVehicle(id);

            System.out.println("Enter new vehicle numberOfSeats: ");
            setNumberOfSeats(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter new vehicle fuelType: ");
            setFuelType(sc.nextLine());

            System.out.println("Car updated successfully!");
        } else {
            System.out.println("Not found ID: " + id);
        }
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();

        System.out.println("Number Of Seats: " + getNumberOfSeats() + ", Fuel Type: " + getFuelType());
    }
}
