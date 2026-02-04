package Lec11_Encapsulation.WithStaticVariable_Page20;

public class Person {

    private String name;
    private static int count = 0;//static sẽ dùng chung cho tất cả các đối tượng

    public Person(String n) {
        name = n;
        count++;//mỗi lần tạo đối tượng mới thì count tăng
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Trang");
        Person p2 = new Person("Lam");
        Person p3 = new Person("Bon");

    }
}
//1 2 3 
