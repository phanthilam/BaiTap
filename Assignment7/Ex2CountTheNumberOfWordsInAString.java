package Assignment7;

import java.util.*;

public class Ex2CountTheNumberOfWordsInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();
        int count = 1;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("So tu trong chuoi la: " + count);
    }
}
