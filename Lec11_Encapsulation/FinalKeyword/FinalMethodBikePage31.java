package Lec11_Encapsulation.FinalKeyword;

public class FinalMethodBikePage31 {
    
    //final void run(){ Tạo một method không thể sữa chữa được
    void run() {//xoá final
        System.out.println("running"); 
    }
}

class Honda extends FinalMethodBikePage31 {

    @Override
    void run() { // sửa lại method của final nên là không được
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
