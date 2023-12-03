package Inheritance_Polymorphism;

import java.util.Scanner;

public class Document {

    private String id;
    private String title;
    private String author;
    private String publisher;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void input(Scanner sc) {
        System.out.println("Nhap id: ");
        id = sc.nextLine();
        System.out.println("Nhap title: ");
        title = sc.nextLine();
        System.out.println("Nhap author: ");
        author = sc.nextLine();
        System.out.println("Nhap publisher: ");
        publisher = sc.nextLine();
    }

    public void output() {
        System.out.print("id: " + getId() + " title: " + getTitle() + " author: " + getAuthor() + " publisher: " + getPublisher());
    }
}
