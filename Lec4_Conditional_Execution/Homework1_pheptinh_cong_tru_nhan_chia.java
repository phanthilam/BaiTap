package Lec4_Conditional_Execution;

import java.util.Scanner;

public class Homework1_pheptinh_cong_tru_nhan_chia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        char dau = sc.next().charAt(0);

        int result = 0;
        boolean valid = true;

        switch (dau) {
            case '+':
                System.out.print("a + b = ");
                result = a + b;
                break;
            case '-':
                System.out.print("a - b = ");
                result = a - b;
                break;
            case '*':
                System.out.print("a * b = ");
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    System.out.print("a / b = ");
                    result = a / b;
                } else {
                    System.out.print("Error");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error");
                valid = false;
        }
        if (valid) {
            System.out.println(result);
        }
    }
}
