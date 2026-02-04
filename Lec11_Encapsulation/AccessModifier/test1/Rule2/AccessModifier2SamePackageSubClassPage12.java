package Lec11_Encapsulation.AccessModifier.test1.Rule2;

public class AccessModifier2SamePackageSubClassPage12 extends AccessModifier1SamePackageSubClassPage12 {

    @Override
    public void display() {
        System.out.println(getPvt()); //can not access private members
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
