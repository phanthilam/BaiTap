package Lec11_Encapsulation.FinalKeyword;

public class FinalMethodBikePage31 {

    void run() {
        System.out.println("running"); //khai báo file không thể sửa nữa nên xoá final
    }
}

class Honda extends FinalMethodBikePage31 {

    @Override
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
