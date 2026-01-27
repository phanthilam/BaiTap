package Assignment7;

import java.util.*;

public class Ex3ReverseAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();
        char[] a = chuoi.toCharArray();
        for (int i = 0; i < chuoi.length() / 2; i++) {
            char bien = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = bien;
        }
        System.out.println("Chuoi sau khi dao nguoc la: " + new String(a));
    }

}
