package Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class testThueXe {

    static Scanner sc = new Scanner(System.in);

    public static void NhapXeDap(ArrayList<thueXe> arr) {
        XeDap xe = new XeDap();
        xe.input(sc);
        arr.add(xe);
    }

    public static void NhapXeMay(ArrayList<thueXe> arr) {
        XeMay xe = new XeMay();
        xe.input(sc);
        arr.add(xe);
    }

    public static void XuatDS(ArrayList<thueXe> arr) {
        for (thueXe xe : arr) {
            System.out.println(arr.toString());
        }
    }

    public static double TongTienThue(ArrayList<thueXe> arr) {
        double sum = 0;
        for (thueXe xe : arr) {
            if (xe instanceof XeDap) {
                XeDap xeDap = (XeDap) xe;
                sum += xeDap.TienThue();
            } else {
                XeMay xeMay = (XeMay) xe;
                sum += xeMay.TienThue();
            }
        }
        return sum;
    }

    public static double Tongtien250(ArrayList<thueXe> arr) {
        int sum = 0;
        for (thueXe xe : arr) {
            if (xe instanceof XeMay) {
                if (((XeMay) xe).getLoaiXe() == 250) {
                    sum += xe.TienThue();
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<thueXe> arr = new ArrayList<thueXe>();

        int n = 0;
        while (true) {
            System.out.println("=====Menu=====");
            System.out.println("1. Nhap thong tin xe dap.");
            System.out.println("2. Nhap thong tin xe may.");
            System.out.println("3. Xuat tat ca.");
            System.out.println("4. Tong tien thue.");
            System.out.println("5. Tong xe may 250");
            System.out.println("6. Exit");
            System.out.println("Nhap lua chon: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    NhapXeDap(arr);
                    break;
                case 2:
                    NhapXeMay(arr);
                    break;
                case 3:
                    XuatDS(arr);
                    break;
                case 4:
                    System.out.println(TongTienThue(arr));
                    break;
                case 5:
                    System.out.println(Tongtien250(arr));
                    break;
                case 6:
                    System.exit(n);
                default:
                    System.err.println("error");
            }
        }
    }
}
