package Lec11_Encapsulation.FinalKeyword;

class FinalClassBikePage33 { //đóng không cho tạo thêm class con nếu dùng final

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
