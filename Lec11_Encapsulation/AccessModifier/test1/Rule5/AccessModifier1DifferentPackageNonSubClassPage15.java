//Rule 5: Different Package Non Sub Class: public được truy cập
//Một file ở trong package test 2
package Lec11_Encapsulation.AccessModifier.test1.Rule5;

public class AccessModifier1DifferentPackageNonSubClassPage15 {

    private int pvt = 1;

    //Thêm Getter
    public int getPvt() {
        return pvt;
    }
    
    int df = 2;

    //Thêm Getter để có thể truy cập gián tiếp
    public int getDf() {
        return df;
    }
    protected int pro = 3;
    
    //Thêm Getter để có thể truy cập gián tiếp
    public int getPro(){
        return pro;
    }
    
    public int pbl = 4; // có thể truy cập bất cứ đâu

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
