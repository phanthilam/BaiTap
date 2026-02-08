package PhanThiLam_7361;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList(); // kệ sách rỗng ban đầu và từ đó mình có thể thêm sửa xoá tìm thông qua bookList

        while (true) { //chương trình sẽ chạy liên tục và chỉ thoát khi chọn exit
            System.out.print("0. Exit" + "\n1. Add new book" + "\n2. Update book by ID" + "\n3. Delete book by ID" + "\n4. Find book by ID" + "\n5. Display all books" + "\nChoose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // xoá dấu enter
            switch (choice) {
                case 0:
                    System.out.println("Exit program!");
                    sc.close();
                    return;

                case 1: // thêm sách mới
                    System.out.println("Chose book type: \n1. TextBook \n2. ReferenceBook"); // hiển thị và cho người dùng chọn loại sách
                    int bookType = sc.nextInt();
                    sc.nextLine();

                    if (bookType == 1) { //nếu chọn textBook
                        TextBook tb = new TextBook();
                        bookList.addBook(tb);
                    } else if (bookType == 2) { // nếu chọn ReferenceBook
                        ReferenceBook rb = new ReferenceBook();
                        bookList.addBook(rb);
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;

                case 2: //cập nhật sách theo id
                    System.out.println("Enter book ID to update: "); //nhập id
                    String updated = sc.nextLine();
                    bookList.updateBook(updated);
                    break;

                case 3: // xoá sách theo id
                    System.out.println("Enter book ID to delete: ");
                    String deleteId = sc.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;

                case 4: // tìm sách theo id
                    System.out.println("Enter book ID to find: ");
                    String findId = sc.nextLine();
                    Book foundBook = bookList.findBookById(findId);
                    if (foundBook != null) { // nếu tìm thấy
                        foundBook.displayBook();
                    }
                    break;

                case 5: // hiển thị tất cả sách
                    bookList.displayAllBook();
                    break;

                default: // trường hợp nhập sai
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

}
