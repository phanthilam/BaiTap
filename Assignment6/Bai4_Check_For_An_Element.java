package Assignment6;

import java.util.*;

public class Bai4_Check_For_An_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<>();
        System.out.print("Nhap so luong thanh pho: ");
        int number = sc.nextInt();
        sc.nextLine(); //xoa ky tu Enter
        for (int i = 0; i < number; i++) {
            System.out.print("Nhap ten thanh pho: ");
            String a = sc.nextLine();
            city.add(a);
        }
        boolean found = false;
        for (int i = 0; i < city.size(); i++) {
            if (city.get(i).equals("London")) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Co thanh pho London trong mang");
        } else {
            System.out.println("Khong co thanh pho London trong mang");
        }
    }
}
