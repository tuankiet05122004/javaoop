
package Inheritance_Polymorphism;
import java.util.Scanner;
public class XeMay extends thueXe{
    private int loaiXe;
    private int bienSo;

    public int getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(int loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getBienSo() {
        return bienSo;
    }

    public void setBienSo(int bienSo) {
        this.bienSo = bienSo;
    }
    
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("nhap loai xe(100 phan khoi, 250 phan khoi): ");loaiXe=Integer.parseInt(sc.nextLine());
        System.out.println("nhap bien so xe: ");bienSo=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "loaiXe=" + loaiXe + ", bienSo=" + bienSo + "tienThue=" + TienThue()+ '}';
    }
    public double TienThue(){
        double tienThue=0;
        if(super.getHour()==1){
            if(getLoaiXe()==100){
                tienThue = 150000;
            }
            if(getLoaiXe()==250){
                tienThue=200000;
            }
        }else{
            if(getLoaiXe()==100){
                tienThue = 150000+(super.getHour()-1)*100000;
            }
            if(getLoaiXe()==250){
                tienThue = 200000+(super.getHour()-1)*100000;
            }
        }
        return tienThue;
    }
}
