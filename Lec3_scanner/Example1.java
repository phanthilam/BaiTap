
package Lec3_scanner;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter an interger number: ");
        int n = keyboard.nextInt();
        System.out.println("Interger number: " + n);
    }
}
