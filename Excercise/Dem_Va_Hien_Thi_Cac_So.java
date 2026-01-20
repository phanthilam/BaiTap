//Dem va hien thi cac so chia het cho 3 va 5 trong doan tu 1 den n
package Excercise;

import java.util.Scanner;

public class Dem_Va_Hien_Thi_Cac_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int dem = 0;
        System.out.print("Cac so chia het cho ca 3 va 5 la: ");
        for ( int i = 1; i <= n; i++){
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
                dem++;
            }
        }
        if (dem == 0){
            System.out.println("Khong co so nao!");
        }
    }
}
