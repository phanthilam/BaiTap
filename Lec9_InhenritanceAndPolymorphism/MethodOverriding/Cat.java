package Lec9_InhenritanceAndPolymorphism.MethodOverriding;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows Meows");
    }
    String source = "DaNag city";
}
