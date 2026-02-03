
package Lec7_Strings;

import java.util.*;

public class Example_Of_Equals_Method_Page20 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String ("Hello World");
        String s4 = "Hello World";
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
