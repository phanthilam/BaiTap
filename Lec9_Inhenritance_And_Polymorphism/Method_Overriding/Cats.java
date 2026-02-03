package Lec9_Inhenritance_And_Polymorphism.Method_Overriding;

public class Cats extends Animal {

    @Override //ghi de 
    void makeSound() {
        System.out.println("Meows Meows");
    }
}
