package Lec5_Loops;

import java.util.*;
import java.util.Scanner;

public class Excercise4_Nhap_So_Thuc_Va_Kiem_Tra_Xem_Lon_Be_Bang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so thuc tu 1 den 100: ");
        double st = sc.nextDouble();
        Random r = new Random();
        double kt = r.nextDouble() * (100.0 - 1.0) + 1.0;
        if (st == kt) {
            System.out.println(st + " = " + kt);
        } else if (st < kt) {
            System.out.println(st + " < " + kt);
        } else {
            System.out.println(st + " > " + kt);
        }
    }
}
