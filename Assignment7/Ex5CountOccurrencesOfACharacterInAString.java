package Assignment7;

import java.util.*;

public class Ex5CountOccurrencesOfACharacterInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = sc.nextLine();

        System.out.print("Nhap ky tu: ");
        char b = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == (b)) {
                count++;
            }
        }
        System.out.println("So lan xuat hien chu " + b + " la: " + count);
    }

}
