package PhanThiLam_7361;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TextBook extends Book { //lớp con TextBook (sách giáo khoa) kế thừa từ lớp Book

    private String status; // trạng thái

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity); //gọi cónatructor của lớp cha (Book) để khởi tạo
        this.status = status; // gán trạng thái
    }

    public TextBook() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        super.addBook(); //gọi hàm addBook của Book

        System.out.println("Enter Status: ");
        setStatus(sc.nextLine());

        System.out.println("TextBook added successfully!");
    }

    public void updateBook(String id) { // cập nhật thông tin sách giáo khoa có mã là id
        if (getBookId().equals(id)) { //chỉ cập nhật khi id đối tượng hiện tại trùng với id đối tượng truyền vào 
            Scanner sc = new Scanner(System.in);
            super.updateBook(id); // gọi hàm ở lớp cha

            System.out.println("Enter new Status: ");
            setStatus(sc.nextLine());

            System.out.println("TextBook updated successfully!");
        } else { // trường hợp không tìm thầy id
            System.out.println("TextBook with ID " + id + " not found!");
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("Status: " + getStatus());
    }
}
