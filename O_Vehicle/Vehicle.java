package O_Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

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

    public void addVehicle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle id: ");
        setId(sc.nextLine());

        System.out.print("Enter vehicle brand: ");
        setBrand(sc.nextLine());

        System.out.print("Enter vehicle model: ");
        setModel(sc.nextLine());

        //Nhap rentalDays
        while (true) { // chay cho den khi gap break
            try {
                System.out.print("Enter vehicle rentalDays: "); //so ngay thue
                int days = Integer.parseInt(sc.nextLine()); //doc String roi chuyen String thanh Int

                if (days < 0) { // neu nhap so am thi quay lai chay lai
                    System.out.println("Rental days must be >= 0!");
                    continue;
                }

                setRentalDays(days); //neu hop le thi gan gia tri cho thuoc tinh
                break;//thoat vong lap

            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please enter number again.");
            }
        }

        //Nhap rentalPricePerDay
        while (true) {
            try {
                System.out.print("Enter vehicle rentalPricPerDay: ");
                double price = Double.parseDouble(sc.nextLine());

                if (price < 0) {
                    System.out.println("Price must be >= 0");
                    continue;
                }

                setRentalPricePerDay(price);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please enter number again.");
            }
        }
    }

    public void updateVehicle(String id) {
        if (this.id.equals(id)) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter vehicle id: ");
            setId(sc.nextLine());

            System.out.print("Enter vehicle brand: ");
            setBrand(sc.nextLine());

            System.out.print("Enter vehicle model: ");
            setModel(sc.nextLine());

            //Nhap rentalDays
            while (true) { // chay cho den khi gap break
                try {
                    System.out.print("Enter vehicle rentalDays: "); //so ngay thue
                    int days = Integer.parseInt(sc.nextLine()); //doc String roi chuyen String thanh Int

                    if (days < 0) { // neu nhap so am thi quay lai chay lai
                        System.out.println("Rental days must be >= 0!");
                        continue;
                    }

                    setRentalDays(days); //neu hop le thi gan gia tri cho thuoc tinh
                    break;//thoat vong lap

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number! Please enter number again.");
                }
            }

            //Nhap rentalPricePerDay
            while (true) {
                try {
                    System.out.print("Enter vehicle rentalPricPerDay: ");
                    double price = Double.parseDouble(sc.nextLine());

                    if (price < 0) {
                        System.out.println("Price must be >= 0");
                        continue;
                    }

                    setRentalPricePerDay(price);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number! Please enter number again.");
                }
            }
        }
    }

    public void displayVehicle() {
        System.out.println("ID: " + getId()
                + ", Brand: " + getBrand()
                + ", Model: " + getModel()
                + ", RentalDays: " + getRentalDays()
                + ", RentalPricePerDay: " + getRentalPricePerDay());
    }
}
