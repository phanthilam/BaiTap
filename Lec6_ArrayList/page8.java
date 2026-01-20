package Lec6_ArrayList;

import java.util.Scanner;

public class page8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ");
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Nhap so nguyen: ");
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
