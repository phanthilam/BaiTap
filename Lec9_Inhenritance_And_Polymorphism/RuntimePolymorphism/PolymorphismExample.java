package Lec9_Inhenritance_And_Polymorphism.RuntimePolymorphism;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animals = new Dog();
        animals.makeSound();
        System.out.println("Source: " + animals.source);
    }

}
