
package Lec5_Loops;

import java.util.Scanner;

public class Baitap8_Do_While_p29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        int num = 0;
        do{
            System.out.print("Enter a number ( -1 to quit) : ");
            num = sc.nextInt();
            sum += num;
        }while (num != -1);
                System.out.println("The total is: " + sum);
    }
}
