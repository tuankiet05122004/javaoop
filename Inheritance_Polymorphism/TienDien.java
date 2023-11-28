package Inheritance_Polymorphism;

import java.util.Scanner;

public class TienDien {
    
    private String maKH;
    private String hoTen;
    private int ngay;
    private int thang;
    private int nam;
    private double soLuong;
    private double dongia;
    
    public String getMaKH() {
        return maKH;
    }
    
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
    
    public double getSoLuong() {
        return soLuong;
    }
    
    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    
    public double getDongia() {
        return dongia;
    }
    
    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    
    public void input(Scanner sc) {
        
        System.out.println("Nhap ma khach hang: ");
        maKH = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay ra hoa don: ");
        ngay = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang ra hoa don: ");
        thang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam ra hoa don: ");
        nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so KW tieu thu: ");
        soLuong = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap don gia: ");
        dongia = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public String toString() {
        return "maKH=" + maKH + ", hoTen=" + hoTen + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + ", soLuong=" + soLuong + ", dongia=" + dongia + ", ";
    }
    
    public double thanhtien() {
        return getSoLuong() * getDongia();
    }
}
