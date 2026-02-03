
package Excercise;

import java.util.*;

public class ArrayList_Bai1_NhapVaHienThiTenSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        ArrayList <String> name = new ArrayList<>();
        String sv1 = sc.nextLine();
        String sv2 = sc.nextLine();
        String sv3 = sc.nextLine();
        String sv4 = sc.nextLine();
        String sv5 = sc.nextLine();
        name.add(sv1);
        name.add(sv2);
        name.add(sv3);
        name.add(sv4);
        name.add(sv5);
        for ( String names : name){
            System.out.println(names);
        }
    }
}
