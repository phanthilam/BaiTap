//Rule 2 same package sub class: default, protected, public có thể truy cập
package Lec11_Encapsulation.AccessModifier.test1.Rule2;

public class AccessModifier1SamePackageSubClassPage12 {

    private int pvt = 1; //private chỉ truy cập được trong class được khai báo 

    public int getPvt() {//Tạo Getter cho phép truy cập gián tiếp private
        return pvt;
    }
    int df = 2; //được truy cập trong cùng package
    protected int pro = 3; // được truy cập trong cùng package và trong subclass
    public int pbl = 4; //mọi nơi

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
