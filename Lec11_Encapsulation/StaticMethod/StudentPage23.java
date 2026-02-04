package Lec11_Encapsulation.StaticMethod;

public class StudentPage23 {

    int rollno;
    String name;
    static String college = "DTU";

    static void change() {
        college = "BBDIT";
    }

    StudentPage23(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StudentPage23.change(); //gọi hàm change

        StudentPage23 s1 = new StudentPage23(111, "Trang");
        StudentPage23 s2 = new StudentPage23(222, "Duong");

        s1.display();
        s2.display();
    }
}
