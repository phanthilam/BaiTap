package Lec6_ArrayList;

import java.util.*;

public class weather2 {

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
        System.out.println("Tempuratures: " + Arrays.toString(temp));
        Arrays.sort(temp); //sắp xếp theo thứ tự
        System.out.printf("Average temp = %.1f", average);
        System.out.println();
        System.out.println(count + "days above average");
        System.out.println("Two coldest day is " + temp[0] + " & " + temp[1]);
        System.out.println("Two hottest day is " + temp[temp.length - 1] + " & " + temp[temp.length - 2]);
    }
}
