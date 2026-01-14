
package Lec5_Loops;

import java.util.*;

public class Execrcise1_hienThiSoNguyenNgauNhienTu1Den100RaManHinh {
    public static void main(String[] args) {
        Random r = new Random ();
        int n = r.nextInt(100) + 1;
        System.out.println("Random number from 1 to 100 is: " + n);
    }
}
