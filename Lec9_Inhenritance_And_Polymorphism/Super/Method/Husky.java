package Lec9_Inhenritance_And_Polymorphism.Super.Method;

public class Husky extends Dog {

    void displayInformation() {
        super.displayPrice();
        System.out.println("Husky's price is 1500 USD");
    }
}
