package Lec9_InhenritanceAndPolymorphism.RuntimePolymorphism;

public class Cats extends Animal {

    @Override //ghi de 
    void makeSound() {
        System.out.println("Meows Meows");
    }
}
