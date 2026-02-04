package Lec11_Encapsulation.Page567;

public class PersonPage7 {

    public String name;
    private double weight;

    public void setWeight(double weight) {
        if (weight < 0) {//nếu dùng this.weight có thể bị gán giá trị không hợp lệ
            System.out.println("Weight can not negative");
        } else {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }
}
