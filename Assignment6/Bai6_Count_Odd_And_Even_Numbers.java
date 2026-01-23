package Assignment6;

import java.util.*;

public class Bai6_Count_Odd_And_Even_Numbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 15; i++) {
            int ngaunhien = rd.nextInt(50) + 1;
            numbers.add(ngaunhien);
        }
        int demle = 0;
        int demchan = 0;
        for (int i = 0; i < 15; i++) {
            if (numbers.get(i) % 2 == 0) {
                demchan++;
            } else {
                demle++;
            }
        }
        System.out.print("So luong so le la: " + demle + "\nSo luong so chan la: " + demchan);
        System.out.println();
    }
}
