package Lec11_Encapsulation.WithoutStaticVariable_Page19;

public class Person {

    private String name;
    private int count = 0; //phải có thêm static để chia se 1 biến cho tất cả đối tượng

    public Person(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Trang");//count = 0 suy ra count++ suy ra in 1
        Person p2 = new Person("Lam"); //count = 0 suy ra count++ suy ra in 1
        Person p3 = new Person("Bon"); //count = 0 suy ra count++ suy ra in 1

    }
}
// in ra 1 1 1 
