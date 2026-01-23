
package Assignment6;

import java.util.*;

public class Bai10_Remove_Duplicates_From_An_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String> names = new ArrayList<>();
        //danh sach ban dau
        names.add("Bon");
        names.add("Ngoc");
        names.add("Lam");
        names.add("Quyen");
        System.out.print("Nhap so luong ten can them: ");
        int n = sc.nextInt();
        sc.nextLine(); // xoa ky tu Enter
        for ( int i = 0; i < n; i++){
            System.out.print("Nhap ten thu " + (i + 1) + ": ");
            String ten = sc.nextLine();
            names.add(ten);
        }
        for ( int i = 0; i < names.size(); i++){
            for ( int j = names.size() - 1; j > i; j--){
                if (names.get(i).equals(names.get(j))){
                    names.remove(j);
                }
            }
        }
        System.out.println("Mang sau khi xoa phan tu trung lap la: " + names);
    }
}
