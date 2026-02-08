package PhanThiLam_7361;

public interface IBook { // đảm bảo mọi loại sách đều có những thông tin chung bên dưới

    void addBook(); // nhập thông tin sách

    void updateBook(String id); // sửa thông tin sách theo mã

    void displayBook(); // hiển thị thông tin sách
}
