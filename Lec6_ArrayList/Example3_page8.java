package Lec6_ArrayList;

import java.util.*;

public class Example3_page8 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
