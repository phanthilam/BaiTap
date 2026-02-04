package Lec11_Encapsulation.FinalKeyword;

public class FinalVariableBikePage29 {

    //final int speedlimit = 90; gán giá trị cố định và không thể sửa nữa
    int speedlimit = 90;  //bỏ final

    void run() {
        //Hoặc  System.out.println(speedlimit); chỉ in ra bình thường
        speedlimit = 400;
    }

    public static void main(String[] args) {
        FinalVariableBikePage29 obj = new FinalVariableBikePage29();
        obj.run();
        System.out.println(obj.speedlimit);
    }
}
