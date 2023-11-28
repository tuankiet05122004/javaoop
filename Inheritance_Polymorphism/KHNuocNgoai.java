package Inheritance_Polymorphism;

import java.util.Scanner;

public class KHNuocNgoai extends TienDien {

    private String quocTich;

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Nhap quoc tich: ");
        quocTich = sc.nextLine();
    }

    @Override
    public String toString() {
        return "KHNuocNgoai{" + super.toString() + "quocTich=" + quocTich + '}';
    }
    @Override
    public double thanhtien(){
        return super.thanhtien();
    }
}
