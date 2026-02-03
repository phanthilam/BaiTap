package Lec9_InhenritanceAndPolymorphism.RuntimePolymorphism;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Cats cat = new Cats();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}
