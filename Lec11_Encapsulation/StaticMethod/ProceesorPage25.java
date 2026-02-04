package Lec11_Encapsulation.StaticMethod;

public class ProceesorPage25 {
    // static là biến thuộc về class, dùng chung cho tất cả object
    // cần static vì biến này được dùng trong hàm main (static)

    static int number = 40; //non static will error

    public static void main(String[] args) {
        System.out.println(number);
    }
}
