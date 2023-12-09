package Inheritance_Polymorphism.Paitient;

import java.util.Scanner;

public class Person {
    private String fullName;
    private int yearOfBirth;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public void Input(Scanner sc){
        System.out.println("Enter Full Name: ");
        fullName = sc.nextLine();
        System.out.println("Enter Year Of Birth: ");
        yearOfBirth=Integer.parseInt(sc.nextLine());
    }
    public void Output(){
        System.out.println("Full name: "+fullName);
        System.out.println("Year of birth: "+yearOfBirth);
    }
}
