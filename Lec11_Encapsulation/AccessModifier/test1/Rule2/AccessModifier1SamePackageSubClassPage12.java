//Rule 2 same package sub class: default, protected, public có thể truy cập
package Lec11_Encapsulation.AccessModifier.test1.Rule2;

public class AccessModifier1SamePackageSubClassPage12 {

    private int pvt = 1; //chỉ dùng private trong class được khai báo

    public int getPvt() {//Cho phép lấy 
        return pvt;
    }
    int df = 2; //được trong cùng package
    protected int pro = 3; // được trong cùng package (cả subclass)
    public int pbl = 4; //mọi nơi

    public void display() {
        System.out.println(pvt);//không được
        System.out.println(df);//được
        System.out.println(pro);//được
        System.out.println(pbl);//được
    }
}
