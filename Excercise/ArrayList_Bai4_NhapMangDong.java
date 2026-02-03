package Excercise;

import java.util.*;

public class ArrayList_Bai4_NhapMangDong {

    public static void nhapMang(ArrayList<Integer> number, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            number.add(x);
        }
    }
//A: Hien thi tat ca cac gia tri
    public static void xuatMang(ArrayList<Integer> number) {
        Scanner sc = new Scanner(System.in);
        for (int x : number) {
            System.out.println(x + " ");
        }
    }
 //B: Hien thi gia tri chan va index cua no trong mang, dem xem co bao nhieu
    public static void demSoChan(ArrayList<Integer> number) {
        int dem = 0;
        for ( int i = 0; i < number.size(); i++){
            if ( number.get(i) % 2 == 0){
                System.out.println(number.get(i) + " tai vi tri " + i);
                dem++;
            }
        }
        System.out.println("Co "+ dem + " so chan trong mang");
    }
//C: Tinh tong tat ca cac gia tri
    public static int sumValue(ArrayList<Integer> number) {
        int sum = 0;
        for ( int i = 0; i < number.size(); i++){
            sum += number.get(i);
        }
        return sum;
    }
//D: Xoa gia tri duoc nhap tu ban phim ra khoi ArrayList
    public static void removeAnElement(ArrayList<Integer> number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu can xoa: ");
        int xoa = sc.nextInt();
        for ( int i = 0; i < number.size(); i++){
            if ( number.get(i) == xoa){
                number.remove(i);
                System.out.println("Da xoa gia tri " + xoa);
            }
        }
        System.out.println("Mang sau khi xoa la: " + number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        System.out.print("Nhap so luong n: ");
        int n = sc.nextInt();
        
        nhapMang(number, n);
        xuatMang(number);
        
        demSoChan(number);
        System.out.println();
        
        System.out.println("Tong cac gia tri la: " + sumValue(number));
        System.out.println();
        
        
    }
}
