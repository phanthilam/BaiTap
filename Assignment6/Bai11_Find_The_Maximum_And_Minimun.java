package Assignment6;

import java.util.*;

public class Bai11_Find_The_Maximum_And_Minimun {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int ngaunhien = rd.nextInt(100) + 1;
            numbers.add(ngaunhien);
        }
        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int i = 0; i < 10; i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("The Largest is: " + max);
        System.out.println("The Smallest is: " + min);
    }
}
