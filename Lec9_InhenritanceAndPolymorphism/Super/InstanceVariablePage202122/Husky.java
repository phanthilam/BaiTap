package Lec9_InhenritanceAndPolymorphism.Super.InstanceVariablePage202122;

public class Husky extends Dogs {

    int price = 1500;

    void displayPrice() {
        System.out.println("Dog's price: " + super.price);
        System.out.println("Husly's price: " + price);
    }
}
