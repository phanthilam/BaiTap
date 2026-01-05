
package Lec3_scanner;

import java.util.Scanner;

public class Example6_p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a multi-word sentence: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
        
        System.out.println("Enter a one word string: ");
        String chuoi = sc.next();
        System.out.println(chuoi);
    }
}
