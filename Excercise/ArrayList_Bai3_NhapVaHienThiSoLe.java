package Excercise;

import java.util.*;

public class ArrayList_Bai3_NhapVaHienThiSoLe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        System.out.print("Nhap so luong phan tu: ");
        int soluong = sc.nextInt();

        for (int i = 0; i < soluong; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            number.add(x);
        }
        System.out.print("Cac so le trong mang la: ");
        for (int i = 0; i < soluong; i++) {
            if (number.get(i) % 2 != 0) {
                System.out.print(number.get(i) + " ");
            }
        }
    }
}
