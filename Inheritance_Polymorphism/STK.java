package Inheritance_Polymorphism;

import java.util.Scanner;

public class STK extends Book {

    private double thue;

    public STK() {
    }

    public STK(String maSach, int ngay, int thang, int nam, double donGia, int soLuong, String nhaXB, double thue) {
        super(maSach, ngay, thang, nam, donGia, soLuong, nhaXB);
        this.thue = thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }
    @Override
    public double ThanhTien(){
        return super.ThanhTien()+thue;
    }
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.print("Nhap thue: ");this.thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + "thue=" + thue + '}';
    }
}
