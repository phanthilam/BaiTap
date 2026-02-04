package Lec11_Encapsulation.AccessModifier.test2.Rule4AndRule5;

import Lec11_Encapsulation.AccessModifier.test1.Rule4.AccessModifier1DifferentPackageSubClassPage14;

public class AccessModifier2DifferentPackageSubClassPage14 extends AccessModifier1DifferentPackageSubClassPage14 {

    @Override
    public void display() {
        System.out.println(getPvt());
        System.out.println(getDf());
        System.out.println(pro);
        System.out.println(pbl);
    }

    public static void main(String[] args) {
        AccessModifier1DifferentPackageSubClassPage14 obj = new AccessModifier1DifferentPackageSubClassPage14();
        obj.display();
    }
}
