package Inheritance_Polymorphism;

import java.util.Scanner;

public class Book extends Document{
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap genre: ");
        genre = sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println(" genre: "+getGenre());
    }
}
