
package Lec5_Loops;

import java.util.*;

public class Excercise3_KiemTraChanLeRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(80-3+1)+3;
        if ( n % 2 != 0){
            System.out.println(n + " la so le");
        } else {
            System.out.println(n + " la so chan");
        }
    }
}
