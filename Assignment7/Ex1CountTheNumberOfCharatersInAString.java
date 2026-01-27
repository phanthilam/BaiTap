package Assignment7;

import java.util.*;

public class Ex1CountTheNumberOfCharatersInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            count++;
        }
        System.out.println("So luong ky tu trong chuoi la: " + count);
    }
}
