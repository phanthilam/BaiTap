package O_Person;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {
    
    private String id;
    private String name;
    private Date yearOfBirth;
    
    public Person() {
    }
    
    public Person(String id, String name, Date yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Date getYearOfBirth() {
        return yearOfBirth;
    }
    
    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Scanner getSc() {
        return sc;
    }
    
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void addPerson() {
        try {
            System.out.println("Enter ID: ");
            setId(sc.nextLine());
            
            System.out.println("Enter Name: ");
            setName(sc.nextLine());
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter YearOfBirth: ");
            String YearOfBirthString = sc.nextLine();
            setYearOfBirth(sdf.parse(YearOfBirthString));
            
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void updatePerson() {
        try {
            System.out.println("Enter update ID: ");
            setId(sc.nextLine());
            
            System.out.println("Enter update Name: ");
            setName(sc.nextLine());
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter update YearOfBirth: ");
            String YearOfBirthString = sc.nextLine();
            setYearOfBirth(sdf.parse(YearOfBirthString));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId()
                + ", Name: " + getName()
                + ", YearOfBirth: " + getYearOfBirth());
    }
    
}
