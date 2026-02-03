package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Baitap7_Switch_Case_Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n (0 <= n <= 9): ");
        int n = sc.nextInt();
        switch (n) {
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("Day la so nguyen to!");
                break;
            default:
                System.out.println("Day khong phai la so nguyen to!");

        }
    }
}
