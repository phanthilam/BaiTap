package Lec9_InhenritanceAndPolymorphism.RuntimePolymorphism;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks Barks");
    }
}
