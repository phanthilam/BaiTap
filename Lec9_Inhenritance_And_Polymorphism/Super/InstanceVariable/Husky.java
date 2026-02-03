package Lec9_Inhenritance_And_Polymorphism.Super.InstanceVariable;

public class Husky extends Dogs {

    int price = 1500;

    void displayPrice() {
        System.out.println("Dog's price: " + super.price);
        System.out.println("Husly's price: " + price);
    }
}
