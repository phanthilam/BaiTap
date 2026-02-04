//Rule 4: Different Package Sub Class: protected, public có thể truy cập
//Một file ở trong package test2
package Lec11_Encapsulation.AccessModifier.test1.Rule4;

public class AccessModifier1DifferentPackageSubClassPage14 {

    private int pvt = 1;

    //Thêm Getter để có thể truy cập được
    public int getPvt() {
        return pvt;
    }

    int df = 2;
    
    //thêm Getter để truy cập được
    public int getDf() {
        return df;
    }

    protected int pro = 3;
    public int pbl = 4;

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
