package PhanThiLam_7361;

import java.text.ParseException; // xử lý lỗi nhập ngày
import java.text.SimpleDateFormat; //chuyển String sang Date
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook { // Book là lớp cha chứa thuộc tính chung của mọi loại sách
    //phải khai báo các hàm ở IBook hoặc có thể để abstract, giao cho lớp con viết

    private String bookId; // mã sách
    private String publisher; // Nhà xuất bản
    private Date entryDate; // Ngày nhập
    private Double unitPrice; // Đơn giá
    private Double quantity; // Số lượng

    public Book() { //cóntructor mặc định
    }

    public Book(String bookId, String publisher, Date entryDate, Double unitPrice, Double quantity) {
        //cóntructor chứa tham số và gán sẵn dữ liệu ban đầu vào
        this.bookId = bookId;
        //thuộc tính    giá trị tham số
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {//vì khai báo bookId là private nên không thể truy cập trực tiếp
        return bookId; // trả về giá trị hiện tại của thuộc tính bookId
    }

    public void setBookId(String bookId) {  // gán giá trị new cho thuộc tính
        //                     giá trị new muốn gán
        this.bookId = bookId;
        //biến of object    tham số truyền vào
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double Quantity) {
        this.quantity = quantity;
    }

    public void addBook() { //cài phuong thức addBook từ interface IBook
        try { // bắt lỗi khi parse ngày 
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Book ID: ");
            setBookId(sc.nextLine()); // Gọi setter

            System.out.println("Enter Publisher: ");
            setPublisher(sc.nextLine());

            System.out.println("Enter Price: ");
            setUnitPrice(sc.nextDouble());

            System.out.println("Enter Quantity: ");
            setQuantity(sc.nextDouble());

            sc.nextLine(); //xoá dấu Enter

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // nhập định dạng thường dùng ở dạng String
            System.out.println("Enter entryDate: ");//Nhập ngày ở dạng String
            String entryDateString = sc.nextLine();
            setEntryDate(sdf.parse(entryDateString)); // chuyển String sang Date
            //                 chuyển

        } catch (ParseException e) { //bắt lỗi khi nhập sai định dạng
            System.out.println(e);
        }
    }

    public void updateBook(String id) {//Cài phương thức updateBook() từ interface IBook
        //            cập nhật sách dựa vào mã sách
        if (this.bookId.equals(id)) { // chỉ cập nhật khi mã hiện tại trùng với mã truyền vàof
            //        mã hiện tại        truyền vào
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Publisher: ");
                setPublisher(sc.nextLine());

                System.out.println("Enter Price: ");
                setUnitPrice(sc.nextDouble());

                System.out.println("Enter Quantity: ");
                setQuantity(sc.nextDouble());

                sc.nextLine();

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Enter entryDate: ");
                String entryDateString = sc.nextLine();
                setEntryDate(sdf.parse(entryDateString));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }

    public void displayBook() { //cài phương thức displayBook từ interface IBook
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // khái báo định dạng ngày
        System.out.println("ID: " + getBookId() + ", Publisher: " + getPublisher() + ", entryDate: " + sdf.format(getEntryDate()) + ", unitPrice: " + getUnitPrice() + ",quantity: " + getQuantity());
    }
}
