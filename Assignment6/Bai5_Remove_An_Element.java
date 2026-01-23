
package Assignment6;

import java.util.*;

public class Bai5_Remove_An_Element {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhap so thu " + (i + 1) + " (1 - 100): ");
            int a = sc.nextInt();
            number.add(a);
        }
        number.remove(2);
        System.out.print("Mang sau khi da cap nhat la: " + number + " ");
    }
}
