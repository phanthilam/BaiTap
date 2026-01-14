package Lec5_Loops;

import java.util.*;
import java.util.Scanner;

public class Excercise5_Nhap_So_Nguyen_Khi_Nao_Dung_Thi_Dung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(10) + 1;
        int dem = 0;
        int n;
        do {
            System.out.print("Enter a number from 1 to 10: ");
            n = sc.nextInt();
            dem++;
        } while (a != n);
        System.out.println("You won after " + dem + " tries!");
        System.out.println("Random number is " + a);
    }
}
