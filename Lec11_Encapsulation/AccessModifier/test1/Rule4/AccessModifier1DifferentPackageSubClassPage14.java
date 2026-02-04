//Rule 4: Different Package Sub Class: protected, public có thể truy cập
package Lec11_Encapsulation.AccessModifier.test1.Rule4;

public class AccessModifier1DifferentPackageSubClassPage14 {

    private int pvt = 1;

    public int getPvt() {
        return pvt;
    }

    int df = 2;
    
    
    //thêm Getter
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
