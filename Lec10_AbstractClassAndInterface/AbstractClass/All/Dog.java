package Lec10_AbstractClassAndInterface.AbstractClass.All;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Barks Barks");
    }
}
