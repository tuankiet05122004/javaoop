package Inheritance_Polymorphism.Paitient;

import java.util.Scanner;

public class Outpatient extends Person{
    private String disease;//ten benh
    private double preTreament;//tien dieu tri

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public double getPreTreament() {
        return preTreament;
    }

    public void setPreTreament(double preTreament) {
        this.preTreament = preTreament;
    }
    
    @Override
    public void Input(Scanner sc){
        super.Input(sc);
        System.out.println("Enter disease: ");
        disease = sc.nextLine();
        System.out.println("Enter preTreament: ");
        preTreament=Double.parseDouble(sc.nextLine());
    }
    @Override
    public void Output(){
        super.Output();
        System.out.println("Disease: "+disease);
        System.out.println("PreTreament: "+preTreament);
    }
}
