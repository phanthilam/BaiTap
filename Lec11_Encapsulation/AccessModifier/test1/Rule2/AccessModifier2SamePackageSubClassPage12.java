package Lec11_Encapsulation.AccessModifier.test1.Rule2;

public class AccessModifier2SamePackageSubClassPage12 extends AccessModifier1SamePackageSubClassPage12 {

    @Override
    public void display() {
        //System.out.println(pvt);
        System.out.println(getPvt()); //truy cập gián tiếp qua getter public
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
