package Lec11_Encapsulation.Page567;

public class EncapsulationPage7 {

    public static void main(String[] args) {
        PersonPage7 a = new PersonPage7();
        a.name = "Trang";
        a.setWeight(-10);//gọi được setter nhưng khi truyền giá trị âm thì sẽ bị từ chối khi xét điều kiện
        a.setWeight(50);
        System.out.println("Name: " + a.name);
        System.out.println("Weight: " + a.getWeight());
    }
}
