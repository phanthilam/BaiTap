
package Lec8_Objects_And_Classes.Example4;

public class OverloadingExample3 {
    public static void printlnInfor(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age );
    }
    public static void printlnInfor(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
