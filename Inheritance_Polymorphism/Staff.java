package Inheritance_Polymorphism;

import java.util.Scanner;

public class Staff extends Officer{

    public Staff() {
        super();
    }
    private String task;
    
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap nhiem vu: ");
        task=sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println(", Nhiem vu: "+task);
    }
}
