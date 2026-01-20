package Lec6_ArrayList;

import java.util.Scanner;

public class weather1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's tempuratures? ");
        int days = sc.nextInt();
        int[] temp = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp is ");
            temp[i] = sc.nextInt();
            sum += temp[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temp[i] < average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", average);
        System.out.println();
        System.out.println(count + "days above average");
    }
}
