package Lec4_Conditional_Execution;

import java.util.Scanner;

public class Baitap2_Else_If {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int percent = sc.nextInt();
        if (percent >= 90) {
            System.out.println("You got an A!");
        } else if (percent >= 80) {
            System.out.println("You got a B!");
        } else if (percent >= 70) {
            System.out.println("You got a C!");
        } else if (percent >= 60) {
            System.out.println("You got a D!");
        } else {
            System.out.println("You got an F!");
        }
    }
}
