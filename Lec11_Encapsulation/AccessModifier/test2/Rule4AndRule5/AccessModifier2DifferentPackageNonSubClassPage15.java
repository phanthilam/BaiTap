package Lec11_Encapsulation.AccessModifier.test2.Rule4AndRule5;

import Lec11_Encapsulation.AccessModifier.test1.Rule5.AccessModifier1DifferentPackageNonSubClassPage15;

public class AccessModifier2DifferentPackageNonSubClassPage15 {

    public static void main(String[] args) {
        AccessModifier1DifferentPackageNonSubClassPage15 obj = new AccessModifier1DifferentPackageNonSubClassPage15();
        System.out.println(obj.getPvt());
        System.out.println(obj.getDf());
        System.out.println(obj.getPro());
        System.out.println(obj.pbl);
    }
}
