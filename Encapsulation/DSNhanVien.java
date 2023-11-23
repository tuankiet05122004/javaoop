
package Encapsulation;

import java.util.Scanner;

public class DSNhanVien {
    private int n;
    private Nhanvien[] nv;
    
    public void NhapDS(Scanner sc){
        System.out.println("nhap so luong nhan vien: ");
        this.n = Integer.parseInt(sc.nextLine());
        nv = new Nhanvien[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap thong tin nhan vien thu " + (i+1)+": ");
            nv[i] = new Nhanvien();
            nv[i].Nhap(sc);
        }
    }
    public double TongThucLinh(){
        double tongthuclinh=0;
        for(int i =0;i<n;i++){
            tongthuclinh = nv[i].TinhThucLinh();
        }
        return tongthuclinh;
    }
    public void SapXep(){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nv[i].TinhThucLinh() < nv[j].TinhThucLinh()){
                    Nhanvien temp = nv[i];
                    nv[i] = nv[j];
                    nv[j] = temp;
                }
            }
        }
    }
    public void HienThiDS(){
        for(int i=0;i<n;i++){
            nv[i].HienThi();
        }
    }
}
