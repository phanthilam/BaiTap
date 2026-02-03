package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Baitap1_If {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What percent did you earn? : ");
        int percent = sc.nextInt();
        if (percent >= 90) {
            System.out.println("You got an A!");
        }
        if (percent >= 80 && percent < 90) {
            System.out.println("You got a B!");
        }
        if (percent >= 70 && percent < 80) {
            System.out.println("You got a C!");
        }
        if (percent >= 60 && percent < 70) {
            System.out.println("You got a D!");
        }
        if (percent < 60) {
            System.out.println("You got an F!");
        }
    }
}
