package Lec8_ObjectsAndClasses.ExampleOverLoadingWithTypePromotion;

public class PromotionExample { //Matching found

    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        PromotionExample obj = new PromotionExample();
        obj.display(5);//int
        obj.display(5.0);//double
        obj.display(5L);//double
    }
}
