package Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerDocument {

    ArrayList<Document> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void addDocument(Document document) {
        list.add(document);
    }

    public void deleteDocuemtn(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().endsWith(id)) {
                list.remove(list.get(i));
                System.out.println("Xoa thanh cong");
                break;
            } else {
                System.out.println("khong tim thay id");
            }
        }
    }

    public void showInfor() {
        for (Document document : list) {
            document.output();
        }
    }

    public ArrayList<Document> searchByBook() {
        ArrayList<Document> newList = new ArrayList<>();
        for (Document document : list) {
            if (document instanceof Book) {
                newList.add(document);
            }
        }
        return newList;
    }

    public ArrayList<Document> searchByNewspaper() {
        ArrayList<Document> newList = new ArrayList<>();
        for (Document document : list) {
            if (document instanceof Newspaper) {
                newList.add(document);
            }
        }
        return newList;
    }

    public ArrayList<Document> searchByJournal() {
        ArrayList<Document> newList = new ArrayList<>();
        for (Document document : list) {
            if (document instanceof Journal) {
                newList.add(document);
            }
        }
        return newList;
    }

    public void showMenu() {
        System.out.println("1. Them tai lieu");
        System.out.println("2. Hien thi danh sach");
        System.out.println("3. Xoa tai lieu");
        System.out.println("4. Tim kiem sach");
        System.out.println("5. Tim kiem bao");
        System.out.println("6. Tim kiem tap chi");
        System.out.println("7. Thoat chuong trinh");
    }

    public static void main(String[] args) {
        int n;
        ManagerDocument manager = new ManagerDocument();
        while (true) {
            manager.showMenu();
            System.out.println("Nhap lua chon cua ban: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1 -> {
                    int x;
                    System.out.println("Them Sach");
                    System.out.println("them book");
                    System.out.println("Them Bao");
                    System.out.println("Them Tap chi");
                    System.out.println("Nhap lua chon cua ban: ");
                    x = Integer.parseInt(sc.nextLine());
                    switch (x) {
                        case 1 -> {
                            Book book = new Book();
                            book.input(sc);
                            manager.addDocument(book);
                        }
                        case 2 -> {
                            Newspaper newspaper = new Newspaper();
                            newspaper.input(sc);
                            manager.addDocument(newspaper);
                        }
                        case 3 -> {
                            Journal journal = new Journal();
                            journal.input(sc);
                            manager.addDocument(journal);
                        }
                        default ->
                            throw new AssertionError();
                    }
                }
                case 2 -> {

                    manager.showInfor();
                    break;
                }
                case 3 -> {
                    String x;
                    System.out.println("Nhap id can xoa: ");
                    x = sc.nextLine();
                    manager.deleteDocuemtn(x);
                    break;
                }
                case 4 -> {
                    ArrayList<Document> newList = manager.searchByBook();
                    if (newList.isEmpty()) {
                        System.out.println("khong tim thay");
                    } else {
                        for (Document document : newList) {
                            document.output();
                        }
                    }
                }
                case 5 -> {
                    ArrayList<Document> newList = manager.searchByNewspaper();
                    if (newList.isEmpty()) {
                        System.out.println("khong tim thay");
                    } else {
                        for (Document document : newList) {
                            document.output();
                        }
                    }
                }
                case 6 -> {
                    ArrayList<Document> newList = manager.searchByJournal();
                    if (newList.isEmpty()) {
                        System.out.println("khong tim thay");
                    } else {
                        for (Document document : newList) {
                            document.output();
                        }
                    }
                }
                default ->
                    throw new AssertionError();
            }
        }
    }
}
