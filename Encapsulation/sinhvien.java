package Encapsulation;

import java.util.Scanner;

public class sinhvien {
//    thuoc tinh
    private String name;
    private int masv;
    private int age;
//    phuong thuc

    public sinhvien() {
    }

    public sinhvien(String name, int masv, int age) {
        this.name = name;
        this.masv = masv;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void input(Scanner sc){
        while(true){
            try {
                System.out.println("nhap ten: ");
                this.name=sc.nextLine();
                System.out.println("nhap tuoi: ");
                this.age=Integer.parseInt(sc.nextLine());
                System.out.println("nhap ma so sinh vien");
                this.masv=Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhap lai!!!!");
            }
        }
        
    }

    @Override
    public String toString() {
        return "sinhvien{" + "name=" + name + ", masv=" + masv + ", age=" + age + '}';
    }
}
