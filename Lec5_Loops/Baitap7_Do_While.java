package Lec5_Loops;

import java.util.Scanner;

public class Baitap7_Do_While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hi;
        do {
            System.out.print("Type your password: ");
            hi = sc.next();
        } while (!hi.equals("duytan"));
    }
}
