
package Inheritance_Polymorphism;

import java.util.Scanner;

public class engineer extends Officer {

    public engineer() {
        super();
    }
    private String branch;
    
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap chi nhanh: ");
        branch=sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println(", chi nhanh: " + branch);
    }
}
