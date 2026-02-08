package PhanThiLam_7361;

import java.util.ArrayList;

public class BookList {//quản lý danh sách các sách

    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) { //Nhận vào 1 đối tượng sách
        book.addBook(); // gọi hàm addBook đúng theo loại sách
        bookList.add(book); // sau khi nhập xong thông tin thì thêm vào danh sách
        System.out.println("Added");
    }

    public void updateBook(String id) {
        for (Book book : bookList) {//duyệt từng sách trong danh sách
            if (book.getBookId().equals(id)) { // so sánh id nếu trùng thì cập nhật
                book.updateBook(id);
                return; // khi tìm thấy thì update xong thoát luôn hàm
            }
        }
        System.out.println("Not found ID: " + id);//trường hợp không trùng
    }

    public void deleteBookById(String id) {
        // boolean removed = bookList.removeIf(book -> book.getBookId().equals(id));
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                bookList.remove(book);
                System.out.println("Delete ID: " + id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public Book findBookById(String id) { // tìm sách theo id và trả về đối tượng
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;//trả về book nếu tìm thấy
            }
        }
        System.out.println("Not found ID: " + id);
        return null; // null nếu không tìm thấy
    }

    public void displayAllBook() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Book book : bookList) {
                book.displayBook();
            }
        }
    }
}
