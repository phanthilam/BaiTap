package Assignment6;

import java.util.*;

public class Bai8_Copy_An_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ten trai thu " + (i + 1) + ": ");
            String ten = sc.nextLine();
            fruits.add(ten);
        }
        ArrayList<String> copy = new ArrayList<>(fruits);
        System.out.println("Mang dau tien: " + fruits);
        System.out.println("Mang copy: " + copy);
    }
}
