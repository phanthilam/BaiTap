package Lec9_Inhenritance_And_Polymorphism.RuntimePolymorphism;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks Barks");
    }
    String source = "Danang city";
}
