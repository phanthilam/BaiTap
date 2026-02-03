
package Excercise;

import java.util.*;

public class ArrayList_Bai2_NhapVaHienThiSoThuc {
    public static void main(String[] args) {
        ArrayList<Double> number = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        for ( int i = 0; i < 7; i++){
            System.out.print("Nhap so thu " + (i + 1) + ": " );
            double a = sc.nextDouble();
            number.add(a);
        }
        System.out.print(number);
    }
}
