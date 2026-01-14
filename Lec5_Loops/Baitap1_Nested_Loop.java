package Lec5_Loops;

public class Baitap1_Nested_Loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
