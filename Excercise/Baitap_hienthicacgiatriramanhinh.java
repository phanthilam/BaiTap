package Excercise;

import java.util.*;

public class Baitap_hienthicacgiatriramanhinh {

    public static void nhapmang(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen: ");
            a[i] = sc.nextInt();
        }
    }

    //câu a: hiển thị tất cả các giá trị ra màn hình
    public static void xuatmang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //câu b: đảo ngược mảng
    public static void daonguoc(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }
      
    //cau c: hiển thị ra các số chẵn
    public static void hienthisochan(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
    //cau d  

    public static int tongchiahet(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    //cau e
    public static void sapxeptangdan(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
    }

    //cau f
    public static void sapxepgiamdan(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong n: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        nhapmang(a, n);
        System.out.print("Mang da nhap la: ");
        xuatmang(a, n);
        System.out.println();

        System.out.print("Mang sau khi dao nguoc la: ");
        daonguoc(a, n);
        xuatmang(a, n);
        System.out.println();

        System.out.print("Cac so chan trong mang la: ");
        hienthisochan(a, n);
        System.out.println();

        System.out.println("Tong cac so chia het cho 3 va 5 la: " + tongchiahet(a, n));

        System.out.print("Mang sau khi da sap xep tang dan: ");
        sapxeptangdan(a, n);
        xuatmang(a, n);
        System.out.println();

        System.out.print("Mang sau khi da sap xep giam dan: ");
        sapxepgiamdan(a, n);
        xuatmang(a, n);
        System.out.println();

    }
}
