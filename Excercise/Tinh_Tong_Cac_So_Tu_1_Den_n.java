
package Excercise;

import java.util.Scanner;

public class Tinh_Tong_Cac_So_Tu_1_Den_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int tong = 0;
        for ( int i = 1; i <= n; i++ ){
            tong += i;
        }
        System.out.println("Tong tu 1 den " + n + " la: " + tong);
    }
}
