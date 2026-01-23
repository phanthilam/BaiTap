package Assignment6;

import java.util.*;

public class Bai1_Creat_And_Populate_An_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + " (1 - 10): ");
            int a = sc.nextInt();
            number.add(a);
        }
        System.out.print("Mang sau khi nhap la: " + number + " ");

    }
}
