package Inheritance_Polymorphism.Paitient;

import java.util.Scanner;

public class Inpatient extends Person{
    private String initialDiagnosis;//ten benh chuan doan
    private double drugCost;//tien thuoc
    private double accommodationCost;//tien o

    public String getInitialDiagnosis() {
        return initialDiagnosis;
    }

    public void setInitialDiagnosis(String initialDiagnosis) {
        this.initialDiagnosis = initialDiagnosis;
    }

    public double getDrugCost() {
        return drugCost;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public double getAccommodationCost() {
        return accommodationCost;
    }

    public void setAccommodationCost(double accommodationCost) {
        this.accommodationCost = accommodationCost;
    }
    
    public void Input(Scanner sc){
        super.Input(sc);
        System.out.println("Enter initialDiagnosis: ");
        initialDiagnosis=sc.nextLine();
        System.out.println("Enter drugCost: ");
        drugCost=Double.parseDouble(sc.nextLine());
        System.out.println("Enter accommodationCost: ");
        accommodationCost=Double.parseDouble(sc.nextLine());
    }
    public void Output(){
        super.Output();
        System.out.println("initialDiagnosis: "+initialDiagnosis);
        System.out.println("drugCost: "+drugCost);
        System.out.println("accommodationCost:" + accommodationCost);
    }
    
}
