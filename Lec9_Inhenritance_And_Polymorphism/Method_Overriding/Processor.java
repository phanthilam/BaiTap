package Lec9_Inhenritance_And_Polymorphism.Method_Overriding;

public class Processor {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Cats cat = new Cats();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}
