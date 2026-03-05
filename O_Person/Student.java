package O_Person;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private double gpa;
    private double tuitionFee; //hoc phi

    public Student() {
    }

    public Student(double gpa, double tuitionFee, String id, String name, Date yearOfBirth) {
        super(id, name, yearOfBirth);
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addPerson() {
        super.addPerson();

        System.out.println("Enter GPA: ");
        setGpa(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter TuitionFee: ");
        setTuitionFee(sc.nextDouble());
        sc.nextLine();

        System.out.println("Add student successfully!");
    }

    @Override
    public void updatePerson() {
        super.updatePerson();

        System.out.println("Enter update GPA: ");
        setGpa(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter update TuitionFee: ");
        setTuitionFee(sc.nextDouble());
        sc.nextLine();

        System.out.println("Update student successfully!");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("GPA: " + getGpa()
                + ", TuitionFee: " + getTuitionFee());
    }

}
