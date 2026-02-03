package Lec6_ArrayList;

import java.util.*;

public class Example2_page7 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");
        System.out.println("names[]=" + Arrays.toString(names.toArray()));
        System.out.println("names[0]" + names.get(0));
        //remove by object and return Boplean type
        System.out.println(names.remove("Huy2"));

        //remove by index
        System.out.println(names.remove(1));
        System.out.println("names[]=" + Arrays.toString(names.toArray()));
    }
}
