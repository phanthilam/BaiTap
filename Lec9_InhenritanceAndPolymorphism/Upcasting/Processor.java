package Lec9_InhenritanceAndPolymorphism.Upcasting;

import java.util.ArrayList;

public class Processor {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Cat());
        animal.add(new Dog());
        animal.add(new Cat());
        int dogCount = 0;
        int catCount = 0;
        for (Animal animals : animal) {
            if (animals instanceof Dog) {
                dogCount++;
            } else if (animals instanceof Cat) {
                catCount++;
            }
        }
        System.out.println("Cat: " + catCount + "\nDog: " + dogCount);
    }

}
