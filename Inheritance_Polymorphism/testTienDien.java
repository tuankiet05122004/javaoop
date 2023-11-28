package Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class testTienDien {

    static Scanner sc = new Scanner(System.in);
    public static void nhapKHVN(ArrayList <TienDien> tiendien){
       KHVietNam t1 = new KHVietNam();
       t1.input(sc);
       tiendien.add(t1);
    }
    public static void nhapKHNN(ArrayList <TienDien> tiendien){
       KHNuocNgoai t1 = new KHNuocNgoai();
       t1.input(sc);
       tiendien.add(t1);
    }
    public static void xuat(ArrayList <TienDien> tiendien){
        for (TienDien tienDien : tiendien) {
            System.out.println(tienDien.toString());
        }
    }
    public static void tongSoLuong(ArrayList <TienDien> tiendien){
        double tongVN = 0;
        double tongNN = 0;
        for (TienDien tienDien : tiendien) {
            if(tienDien instanceof KHVietNam){
                tongVN += tienDien.getSoLuong();
            }else if(tienDien instanceof KHNuocNgoai){
                tongNN += tienDien.getSoLuong();
            }
        }
        System.out.println("tong so luong cua khach viet nam: "+tongVN);
        System.out.println("tong so luong cua khach nuoc ngoai: "+tongNN);
    }
    public static void TbthanhtienNN(ArrayList <TienDien> tiendien){
        double trungbinhcong=0;
        double sum=0;
        double dem=0;
        for (TienDien tienDien : tiendien) {
            if(tienDien instanceof KHNuocNgoai){
                dem++;
                sum+=tienDien.thanhtien();
            }
        }
        trungbinhcong = sum/dem;
        System.out.println("trung binh thanh tien cua khac hang nuoc ngoai: " + trungbinhcong);
    }
    public static void xuatThang9(ArrayList <TienDien> tiendien){
        System.out.println("hoa don thang 9 nam 2013 cua khach hang viet nam: ");
        for (TienDien tienDien : tiendien) {
            if(tienDien instanceof KHVietNam){
                if(tienDien.getThang() == 9 && tienDien.getNam()==2013){
                    System.out.println(tienDien.toString());
                }
            }
        }
        System.out.println("hoa don thang 9 nam 2013 cua khach hang nuoc ngoai: ");
        for (TienDien tienDien : tiendien) {
            if(tienDien instanceof KHNuocNgoai){
                if(tienDien.getThang() == 9 && tienDien.getNam()==2013){
                    System.out.println(tienDien.toString());
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<TienDien> tiendien = new ArrayList<TienDien>();
        int n;
        while (true) {
            System.out.println("1. Nhap tong tin khach hang viet nam.");
            System.out.println("2. Nhap tong tin khach hang nuoc ngoai.");
            System.out.println("3. Xuat danh sach thong tin khach hang.");
            System.out.println("4. Tinh tong so luong cho tung loai khach hang.");
            System.out.println("5. Tinh trung binh thanh tien cua khach hang nguoi nuoc ngoai.");
            System.out.println("6. Xuat ra cac hoa don trong thang 9 nam 2013 cua ca 2 loai khach hang.");
            System.out.println("7. Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    nhapKHVN(tiendien);
                    break;
                case 2:
                    nhapKHNN(tiendien);
                    break;
                case 3:
                    xuat(tiendien);
                    break;
                case 4:
                    tongSoLuong(tiendien);
                    break;
                case 5:
                    TbthanhtienNN(tiendien);
                    break;
                case 6:
                    xuatThang9(tiendien);
                    break;
                case 7:
                    System.exit(n);
            }
        }
    }
}
