package Lec5_Loops;

import java.util.Scanner;

public class Baitap6_Sential_p22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 1;
        while (num != 0) {
            System.out.print("Enter a number (0 to quit) : ");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("The total is " + sum);
    }
}
