package Assignment6;

import java.util.*;

public class Bai7_Reverse_An_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int a = sc.nextInt();
            numbers.add(a);
        }
        int n = 5;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i - 1));
            numbers.set(n - i - 1, temp);
        }
        System.out.print("Mang sau khi dao nguoc la: " + numbers);
    }
}
