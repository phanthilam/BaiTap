package PhanThiLam_7361;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book { // lớp con sách tham khảo kế thừa lớp Book

    private double tax; // thuế

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public ReferenceBook() {
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        super.addBook();

        System.out.println("Enter Tax: ");
        setTax(sc.nextDouble());

        System.out.println("ReferenceBook added successfully!");
    }

    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner sc = new Scanner(System.in);
            super.updateBook(id);

            System.out.println("Enter new Tax: ");
            setTax(sc.nextDouble());

            System.out.println("ReferenceBook updated successfully!");
        } else {
            System.out.println("Nor found ID " + id);
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("Tax: " + getTax());
    }
}
