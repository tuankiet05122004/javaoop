package Inheritance_Polymorphism;

import java.util.Scanner;

public class Officer {

    public Officer() {
    }

    private String name;
    private int age;
    private String gender;
    private String address;
    private String type;
    public String getName(){
        return name;
    }
    public void input(Scanner sc) {
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap loai nhan vien: ");
        type = sc.nextLine();
    }

    public void output() {
        System.out.print("ten: " + name + ", tuoi: " + age + ", gioi tinh: " + gender + ", dia chi: " + address + ", loai nhan vien: " + type);
    }
}
