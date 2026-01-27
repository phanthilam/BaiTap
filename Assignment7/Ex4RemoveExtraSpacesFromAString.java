package Assignment7;

import java.util.*;

public class Ex4RemoveExtraSpacesFromAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String a = sc.nextLine();
        String results = "";
        boolean space = false;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c != ' ') {
                results += c;
                space = false;
            } else {
                if (!space) {
                    results += ' ';
                    space = true;
                }
            }
        }
        results = results.trim();
        System.out.println(results);
    }
}
