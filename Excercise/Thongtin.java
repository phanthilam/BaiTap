
package Excercise;

import java.util.Scanner;

public class Thongtin {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.print("Student ID: ");
        String mssv = sc.next();
        sc.nextLine();
        
        System.out.print("Fullname: ");
        String name = sc.nextLine();
        
        System.out.print("GPA: ");
        float gpa = sc.nextFloat();
        
        System.out.println("Your information: ");
        System.out.println("Studen ID: " + mssv + "\nFullname: " + name + "\nGPA: " + gpa);
    }
}
