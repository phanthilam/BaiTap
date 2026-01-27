package Assignment7;

import java.util.*;

public class Ex6ReplaceAWordInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();

        System.out.print("Nhap tu can thay the: ");
        String word = sc.nextLine();

        System.out.print("Nhap tu thay the: ");
        String replace = sc.nextLine();

        chuoi = chuoi.replace(word, replace);
        System.out.println("Sau khi thay the la: " + chuoi);
    }

}
