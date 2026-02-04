package Lec11_Encapsulation.Page567;

public class EncapsulationExitsPage5 {

    public static void main(String[] args) {
        PersonPage5 a = new PersonPage5();
        a.name = "Trang";
        a.weight = -10;
        //Có thể gán vì weight là public
        //Sai nguyên tắc Encapsulation (không kiểm soát dữ liệu)
    }
}
