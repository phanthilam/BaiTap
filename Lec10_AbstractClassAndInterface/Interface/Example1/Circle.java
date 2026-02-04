package Lec10_AbstractClassAndInterface.Interface.Example1;

public class Circle implements IShape {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }
}
