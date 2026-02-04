package Lec11_Encapsulation.Page567;
//không thể có nhiều hơn 1 public class trong 1 file Java vậy nên phải tách ra

public class PersonPage5 {

    public String name;
    public double weight;
    // weight để public nên có thể bị gán giá trị không hợp lệ ví dụ như -10
    // sai nguyên tắc Encapsulation
}
//Code cũ
/* public class EncapsulationExits{
    public static void main(String[] args){
       Person a = new Person();
       a.name = "Trang";
       a.weight = -10;
    }
}
 */
