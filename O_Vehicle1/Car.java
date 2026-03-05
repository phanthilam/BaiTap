package O_Vehicle1;

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

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addVehicle() {
        super.addVehicle();

        System.out.println("Enter vehicle NumberOfSeats: ");
        setNumberOfSeats(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter vehicle FuelType: ");
        setFuelType(sc.nextLine());

        System.out.println("Car added successfully!");
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();

        System.out.println("Update vehicle NumberOfSeats: ");
        setNumberOfSeats(sc.nextInt());
        sc.nextLine();

        System.out.println("Update vehicle FuelType: ");
        setFuelType(sc.nextLine());

        System.out.println("Car updated successfully!");
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();

        System.out.println("NumberOfSeats: " + getNumberOfSeats()
                + ", FuelType: " + getFuelType());
    }

}
