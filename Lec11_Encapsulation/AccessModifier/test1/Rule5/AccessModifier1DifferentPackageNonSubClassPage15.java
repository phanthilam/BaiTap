//Rule 5: Different Package Non Sub Class: public được truy cập
package Lec11_Encapsulation.AccessModifier.test1.Rule5;

public class AccessModifier1DifferentPackageNonSubClassPage15 {

    private int pvt = 1;

    public int getPvt() {
        return pvt;
    }
    
    int df = 2;

    public int getDf() {
        return df;
    }
    protected int pro = 3;
    
    public int getPro(){
        return pro;
    }
    
    public int pbl = 4;

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }

}
