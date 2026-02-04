package Lec11_Encapsulation.FinalKeyword;

//final class FinalClassBikePage33 //nếu dùng final thì không thể tạo thêm class con
class FinalClassBikePage33 { //xoá final

    void run() {
        System.out.println("running");
    }
}

class Honda extends FinalClassBikePage33 {

    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
