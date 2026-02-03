package Lec8_Objects_And_Classes.Example1;

public class Car {

    private String model;
    private int year;

    //Constructor: ham khoi tao
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}
