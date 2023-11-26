package Inheritance_Polymorphism;

import java.util.Scanner;

public class SGK extends Book {

    private String tinhTrang;

    public SGK() {
    }

    public SGK(String maSach, int ngay, int thang, int nam, double donGia, int soLuong, String nhaXB, String tinhTrang) {
        super(maSach, ngay, thang, nam, donGia, soLuong, nhaXB);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double ThanhTien() {
        double thanhtien = 0;
        if ("cu".equals(this.tinhTrang)) {
            thanhtien = super.ThanhTien() * 50 / 100;
        }
        else{
            thanhtien = super.ThanhTien();
        }
        return thanhtien;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhap tinh trang sach \"moi\" hoac \"cu\": ");
        this.tinhTrang = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "tinhTrang=" + tinhTrang + '}';
    }

}
