package Inheritance_Polymorphism;

import java.util.Scanner;

public class Newspaper extends Document {
    private String publicationDate;

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap publicationDate: ");
        publicationDate = sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println(" publicationDate: "+getPublicationDate());
    }
}
