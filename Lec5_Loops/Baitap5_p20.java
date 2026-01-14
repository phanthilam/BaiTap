package Lec5_Loops;

public class Baitap5_p20 {

    public static void main(String[] args) {
        int n = 91;
        int factor = 2;
        while (n % factor != 0) {
            factor++;
        }
        System.out.println("First factor is" + factor);
    }

}
