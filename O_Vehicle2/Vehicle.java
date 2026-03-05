package O_Vehicle2;

import java.util.Scanner;

public abstract class Vehicle implements IVehicle {

    private String id;
    private String brand;
    private String model;
    private int rentalDays;
    private double rentalPricePerDay;

    public Vehicle() {
    }

    public Vehicle(String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalDays = rentalDays;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addVehicle() {
        System.out.print("Enter vehicle id: ");
        setId(sc.nextLine());

        System.out.print("Enter vehicle brand: ");
        setBrand(sc.nextLine());

        System.out.print("Enter vehicle model: ");
        setModel(sc.nextLine());

        System.out.print("Enter vehicle irentalDays: ");
        setRentalDays(sc.nextInt());

        System.out.print("Enter vehicle rentalPricePerDay: ");
        setRentalPricePerDay(sc.nextDouble());
    }

    @Override
    public void updateVehicle() {

        System.out.print("Update vehicle brand: ");
        setBrand(sc.nextLine());

        System.out.print("Update vehicle model: ");
        setModel(sc.nextLine());

        System.out.print("Update vehicle irentalDays: ");
        setRentalDays(sc.nextInt());

        System.out.print("Update vehicle rentalPricePerDay: ");
        setRentalPricePerDay(sc.nextDouble());
    }

    @Override
    public void displayVehicle() {
        System.out.println("ID: " + getId()
                + ", Brand: " + getBrand()
                + ", Model: " + getModel()
                + ", RentalDays: " + getRentalDays()
                + ", RentalPricePerDay: " + getRentalPricePerDay());
    }
}
