package Lec3_scanner;

import java.util.Scanner;

public class Thongtincanhan {

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String ten = gt.nextLine();

        System.out.print("Nhap MSSV: ");
        int MSSV = gt.nextInt();

        System.out.println("Ho va ten: " + ten);
        System.out.println("Ma so sinh vien: " + MSSV);
    }

}
