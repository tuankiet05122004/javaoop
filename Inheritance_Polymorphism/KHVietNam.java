package Inheritance_Polymorphism;

import java.util.Scanner;

public class KHVietNam extends TienDien {

    private String doiTuong;
    private double dinhMuc;

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Nhap doi tuong: ");
        doiTuong = sc.nextLine();
        System.out.println("Nhap dinh muc: ");
        dinhMuc = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "KHVietNam{" + super.toString() + "doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + '}';
    }
    
    @Override
    public double thanhtien() {
        if (super.getSoLuong() <= getDinhMuc()) {
            return super.thanhtien();
        } else {
            double soKWVuot = super.getSoLuong() - getDinhMuc();
            double thanhtien = super.getSoLuong() * super.getDongia() * getDinhMuc() + soKWVuot * super.getDongia() * 2.5;
            return thanhtien;
        }
    }
}
