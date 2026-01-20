
package Excercise;

public class DemVaHienThiCacSoTu3Den300 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for ( int i = 3; i <= 300; i++){
            if ( i % 3 == 0 && i % 5 == 0){
                sum += i;
                count++;
            }
        }
        System.out.println("Tong cac so chia het cho 3 va 5 la: " + sum);
        System.out.println("So luong cac so chia het cho 3 va 5 la: " + count);
    }
}
