package O_Vehicle1;

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
        System.out.print("Enter vehicle ID: ");
        setId(sc.nextLine());

        System.out.print("Enter vehicle Brand: ");
        setBrand(sc.nextLine());

        System.out.print("Enter vehicle Model: ");
        setModel(sc.nextLine());

        System.out.print("Enter vehicle RentalDays: ");
        setRentalDays(sc.nextInt());

        System.out.print("Enter vehicle RentalPricePerDay: ");
        setRentalPricePerDay(sc.nextDouble());
    }

    @Override
    public void updateVehicle() {
        sc.nextLine();

        System.out.println("Update vehicle Brand: ");
        setBrand(sc.nextLine());

        System.out.println("Update vehicle Model: ");
        setModel(sc.nextLine());

        System.out.println("Update vehicle RentalDays: ");
        setRentalDays(sc.nextInt());

        System.out.println("Update vehicle RentalPricePerDay: ");
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
