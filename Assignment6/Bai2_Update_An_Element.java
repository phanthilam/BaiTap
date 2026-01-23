package Assignment6;

import java.util.*;

public class Bai2_Update_An_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Brown");
        colors.add("Pink");
        colors.set(1, "Yellow");
        System.out.println("Mang sau khi da nhap la: " + colors + " ");
    }
}
