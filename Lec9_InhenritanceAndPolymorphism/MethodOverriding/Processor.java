package Lec9_InhenritanceAndPolymorphism.MethodOverriding;

public class Processor {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        System.out.println("Source: " + animal.source);
    }
}
