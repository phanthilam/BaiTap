package Excercise;

import java.util.Scanner;

public class Giai_Phuong_Trinh_Bac2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.println("Phuong trinh co dang: " + "(" + a + ")" + "x^2" + " + " + "(" + b + ")" + "x" + " + " + c);
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Day la phuong trinh bac 1 co nghiem x la: " + ((-c) / b));
        } else {
            if (delta > 0) {
                System.out.println("Phuong trinh co nghiem kep: ");
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / 2 * a));
                System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / 2 * a));
            } else if (delta < 0) {
                System.out.println("Phuong trinh co nghiem kep x = " + (-b) / 2 * a);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
