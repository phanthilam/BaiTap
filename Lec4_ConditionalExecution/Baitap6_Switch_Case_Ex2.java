package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Baitap6_Switch_Case_Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (1 <= n <= 5): ");
        int n = sc.nextInt();
        switch (n) {
            case 5:
                System.out.println("Five");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Please enter 1 <= n <= 5");
        }
    }
}
