package Lec9_InhenritanceAndPolymorphism.Super.MethodPage282930;

public class Husky extends Dog {

    void displayInformation() {
        super.displayPrice();
        System.out.println("Husky's price is 1500 USD");
    }
}
