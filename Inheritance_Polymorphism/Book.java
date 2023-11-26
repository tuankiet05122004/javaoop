package Inheritance_Polymorphism;

import java.util.Scanner;

public class Book {

    private String maSach;
    private int ngay, thang, nam;
    private double donGia;
    private int soLuong;
    private String nhaXB;

    public double ThanhTien() {
        double thanhtien = (soLuong * donGia);
        return thanhtien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public Book() {
    }

    public Book(String maSach, int ngay, int thang, int nam, double donGia, int soLuong, String nhaXB) {
        this.maSach = maSach;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXB = nhaXB;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ma sach: ");this.maSach = sc.nextLine();
        System.out.print("Nhap ngay thang nam: ");this.ngay = Integer.parseInt(sc.nextLine());this.thang = Integer.parseInt(sc.nextLine());this.nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia: ");this.donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so luong: ");this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nha xuat ban: ");this.nhaXB = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" + "maSach=" + maSach + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + ", donGia=" + donGia + ", soLuong=" + soLuong + ", nhaXB=" + nhaXB;
    }
    
}
