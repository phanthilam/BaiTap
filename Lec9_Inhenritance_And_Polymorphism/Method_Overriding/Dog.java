package Lec9_Inhenritance_And_Polymorphism.Method_Overriding;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks Barks");
    }
}
