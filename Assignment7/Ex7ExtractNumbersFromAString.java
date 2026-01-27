package Assignment7;

import java.util.*;

public class Ex7ExtractNumbersFromAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();

        char[] array = chuoi.toCharArray();
        for (int i = 0; i < chuoi.length(); i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                System.out.print(array[i]);
            }
        }
    }
}
