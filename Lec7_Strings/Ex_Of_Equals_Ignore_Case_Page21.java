package Lec7_Strings;

import java.util.*;

public class Ex_Of_Equals_Ignore_Case_Page21 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HELLO";
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//bo qua viet hoa va viet thuong
    }
}
