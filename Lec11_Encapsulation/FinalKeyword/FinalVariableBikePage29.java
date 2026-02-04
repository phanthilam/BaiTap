package Lec11_Encapsulation.FinalKeyword;

public class FinalVariableBikePage29 {

    int speedlimit = 90;  //final là giá trị được gán cố định 1 lần không thay đổi nữa vậy nên bỏ final

    void run() {
        speedlimit = 400;
    }

    public static void main(String[] args) {
        FinalVariableBikePage29 obj = new FinalVariableBikePage29();
        obj.run();
        System.out.println(obj.speedlimit);
    }
}
