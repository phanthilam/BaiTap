package Assignment6;

import java.util.*;

public class Bai12_SUm_Of_Random_Numbers {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int ngaunhien = rd.nextInt(100) + 1;
            numbers.add(ngaunhien);
            sum += numbers.get(i);
        }
        System.out.println("Sum of value is: " + sum);
    }
}
