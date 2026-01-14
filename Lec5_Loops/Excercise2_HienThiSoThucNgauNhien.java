package Lec5_Loops;

import java.util.*;

public class Excercise2_HienThiSoThucNgauNhien {

    public static void main(String[] args) {
        Random r = new Random();
        double n = r.nextDouble() * (8.0 - 1.8) + 1.8;
        System.out.println("Random number from 1 to 100 is: " + n);
    }
}
