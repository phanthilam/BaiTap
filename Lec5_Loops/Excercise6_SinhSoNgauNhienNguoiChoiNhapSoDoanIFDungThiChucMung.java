package Lec5_Loops;

import java.util.Scanner;
import java.util.*;

public class Excercise6_SinhSoNgauNhienNguoiChoiNhapSoDoanIFDungThiChucMung {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int b;
        do {
            System.out.print("Entern a number from 1 to 100: ");
            b = sc.nextInt();
            if (a > b) {
                System.out.println("Lon hon!");
            } else if (a < b) {
                System.out.println("Nho hon!");
            } else {
                System.out.println("Chuc mung!");
            }
        } while (a != b);
        sc.close();
    }
}
