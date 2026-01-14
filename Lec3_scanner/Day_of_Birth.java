package Lec3_scanner;

import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Day_of_Birth {

    public static void main(String[] args) {
        Scanner birth = new Scanner(System.in);
        System.out.print("Enter day of Birth (dd/MM/yyyy): ");
        String birthday = birth.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateofBirth;
        try {
            dateofBirth = sdf.parse(birthday);
            System.out.println("Date of birth: " + sdf.format(dateofBirth));
        } catch (ParseException ex) {
            System.out.println("Eception: " + ex.getMessage());
        }
    }
}
