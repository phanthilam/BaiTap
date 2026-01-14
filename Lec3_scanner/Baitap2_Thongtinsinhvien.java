package Lec3_scanner;

import java.util.Scanner;

public class Baitap2_Thongtinsinhvien {

    public static void main(String[] args) {
        Scanner thongtin = new Scanner(System.in);

        System.out.print("Ho va ten: ");
        String ten = thongtin.nextLine();

        System.out.print("StudentID: ");
        long MSSV = thongtin.nextLong();
        thongtin.nextLine();

        System.out.print("Home town: ");
        String que = thongtin.nextLine();

        System.out.print("GPA: ");
        float diem = thongtin.nextFloat();
        thongtin.nextLine();

        System.out.print("Mayjor: ");
        String chuyennganh = thongtin.nextLine();

        System.out.print("Scholarship: ");
        boolean hocbong = thongtin.nextBoolean();

    }
}
