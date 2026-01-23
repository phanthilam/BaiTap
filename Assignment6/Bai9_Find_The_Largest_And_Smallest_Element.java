package Assignment6;

import java.util.*;

public class Bai9_Find_The_Largest_And_Smallest_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int a = sc.nextInt();
            numbers.add(a);
        }
        int largest = numbers.get(0);
        int smallest = numbers.get(0);
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }
        System.out.println("The Largest is: " + largest);
        System.out.println("The Smallest is: " + smallest);
    }
}
