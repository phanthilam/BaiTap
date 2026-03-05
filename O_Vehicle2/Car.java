package O_Vehicle2;

import java.util.Scanner;

public class Car extends Vehicle {

    private int numbeOfSeats;
    private String fuelType;

    public Car() {
    }

    public Car(int numbeOfSeats, String fuelType, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.numbeOfSeats = numbeOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumbeOfSeats() {
        return numbeOfSeats;
    }

    public void setNumbeOfSeats(int numbeOfSeats) {
        this.numbeOfSeats = numbeOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addVehicle() {
        super.addVehicle();

        System.out.print("Enter vehicle NumberOfSeats: ");
        setNumbeOfSeats(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter vehicle FuelType: ");
        setFuelType(sc.nextLine());

        System.out.println("Car added successfully");
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();

        System.out.print("Enter update vehicle NumberOfSeats: ");
        setNumbeOfSeats(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter update vehicle FuelType: ");
        setFuelType(sc.nextLine());

        System.out.println("Car added successfully");
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();
        System.out.println("NumberOfSeats: " + getNumbeOfSeats()
                + ", FuelType: " + getFuelType());
    }
}
