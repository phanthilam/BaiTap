package Lec10_AbstractClassAndInterface.Interface.MultiInheritance;

public class Circle implements IShape, IColor {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling the circle with green");
    }
}
