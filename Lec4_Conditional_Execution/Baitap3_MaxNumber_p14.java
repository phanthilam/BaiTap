package Lec4_Conditional_Execution;

import java.util.Scanner;

public class Baitap3_MaxNumber_p14 {

    public static int findMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Pleas enter a != b");
        } else {
            System.out.println("Max number: " + findMaxNumber(a, b));
        }
    }
}
