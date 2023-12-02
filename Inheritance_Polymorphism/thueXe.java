package Inheritance_Polymorphism;

import java.util.Scanner;

public class thueXe {
    private String name;
    private int hour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public void input(Scanner sc){
        System.out.println("Nhap ho ten: ");name=sc.nextLine();
        System.out.println("Nhap so h thue: ");hour=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "thueXe{" + "name=" + name + ", hour=" + hour;
    }
    
    public double TienThue(){
        return 0;
    }
}
