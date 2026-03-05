package O_Person;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private int numberOfClasses;
    private double baseSalary;

    public Teacher() {
    }

    public Teacher(int numberOfClasses, double baseSalary, String id, String name, Date yearOfBirth) {
        super(id, name, yearOfBirth);
        this.numberOfClasses = numberOfClasses;
        this.baseSalary = baseSalary;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addPerson() {
        super.addPerson();

        System.out.println("Enter numberOfClasses: ");
        setNumberOfClasses(sc.nextInt());

        System.out.println("Enter BaseSalary: ");
        setBaseSalary(sc.nextDouble());

        System.out.println("Add teacher successfully!");
    }

    @Override
    public void updatePerson() {
        super.updatePerson();

        System.out.println("Enter update numberOfClasses: ");
        setNumberOfClasses(sc.nextInt());

        System.out.println("Enterupdate BaseSalary: ");
        setBaseSalary(sc.nextDouble());

        System.out.println("Update teacher successfully!");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("NumberOfClasses: " + getNumberOfClasses()
                + ", BaseSalary: " + getBaseSalary());
    }

}
