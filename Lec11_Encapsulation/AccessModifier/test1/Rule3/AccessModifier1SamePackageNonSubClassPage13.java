//Rule 3 same package non sub class: default, protected, public truy cập được
package Lec11_Encapsulation.AccessModifier.test1.Rule3;

public class AccessModifier1SamePackageNonSubClassPage13 {

    private int pvt = 1;

    public int getPvt() {//Giữ private mà vẫn lấy dùng được
        return pvt;
    }

    int df = 2; //default không phải là từ khoá nên không ghi 
    protected int pro = 3;
    public int pbl = 4;

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
