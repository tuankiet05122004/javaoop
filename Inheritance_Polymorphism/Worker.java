
package Inheritance_Polymorphism;

import java.util.Scanner;

public class Worker extends Officer{

    public Worker() {
        super();
    }
   private int level;
   @Override
   public void input(Scanner sc){
       super.input(sc);
       System.out.println("Nhap level: ");
       level=Integer.parseInt(sc.nextLine());
   }
   @Override
   public void output(){
       super.output();
       System.out.println(", level: "+level);
   }
}
