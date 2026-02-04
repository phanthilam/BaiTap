package Lec11_Encapsulation.AccessModifier.test1.Rule1;

//Rule 1: Same class: private, default, protected, public đều truy cập được
public class AccessModifier {

    private int pvt = 1;
    int df = 2; //default không phải là từ khoá
    protected int pro = 3;
    public int pbl = 4;

    public void display() {
        System.out.println(pvt);//có thể truy cập được
        System.out.println(df);//có thể truy cập được
        System.out.println(pro);//có thể truy cập được
        System.out.println(pbl);//có thể truy cập được
    }

    //dùng hàm main để chạy chương trình
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.display(); // gọi hàm
    }
}
