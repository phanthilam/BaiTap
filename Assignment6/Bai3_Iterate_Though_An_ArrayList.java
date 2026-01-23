package Assignment6;

import java.util.*;

public class Bai3_Iterate_Though_An_ArrayList {

    public static void main(String[] args) {
        ArrayList<Double> price = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product: ");
        int product = sc.nextInt();
        for (int i = 0; i < product; i++) {
            System.out.print("Enter price the " + (i + 1) + ": ");
            double a = sc.nextDouble();
            price.add(a);
        }
        System.out.print("Price are: " + price + " ");
    }
}
