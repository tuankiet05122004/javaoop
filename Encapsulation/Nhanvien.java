
package Encapsulation;

import java.util.Scanner;

public class Nhanvien {
    private String MaNV;
    private String HoTen;
    private String DiaChi;
    private double LuongCB;
    private int NamCT;
    private double TamUng;
    
    public void Nhap(Scanner sc){
        System.out.println("nhap ma nhan vien: ");
        this.MaNV =  sc.nextLine();
//        System.out.println("nhap ho va ten: ");
//        this.HoTen =  sc.nextLine();
//        System.out.println("nhap dia chi: ");
//        this.DiaChi =  sc.nextLine();
        System.out.println("nhap luong co ban: ");
        this.LuongCB = Double.parseDouble(sc.nextLine());
        System.out.println("nhap nam cong tac: ");
        this.NamCT = Integer.parseInt(sc.nextLine());
        System.out.println("nhap tien tam ung: ");
        this.TamUng = Double.parseDouble(sc.nextLine());
    }
    public double TienThuong(){
        double tienthuong = 0;
        if(NamCT >= 3 && NamCT <= 5){
            tienthuong = LuongCB*20/100;
        }else if(NamCT > 5){
           tienthuong = LuongCB*50/100;
        }
        return tienthuong;
    }
    public double TinhThucLinh(){
        double thuclinh = LuongCB + TienThuong() - TamUng;
        return thuclinh;
    }
    public void HienThi() {
        System.out.println("Nhanvien{" + "MaNV=" + MaNV + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", LuongCB=" + LuongCB + ", NamCT=" + NamCT + ", TamUng=" + TamUng  + ", TienThuong= "+ TienThuong()+", Tinhthuclinh= "+TinhThucLinh()+ '}');
    }
}
