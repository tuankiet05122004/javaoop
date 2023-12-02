package Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerOfficer {

    static Scanner sc = new Scanner(System.in);
    private ArrayList<Officer> list = new ArrayList<>();

    public void addOfficer(Officer officer) {
        int n;
        System.out.println("1. Nhap thong tin engineer");
        System.out.println("2. Nhap thong tin Worker");
        System.out.println("3. Nhap thong tin Staff");
        System.out.println("Nhap lua chon cua ban: ");
        n = Integer.parseInt(sc.nextLine());
        switch (n) {
            case 1: {
                engineer e = new engineer();
                e.input(sc);
                list.add(e);
                break;
            }
            case 2: {
                Worker w = new Worker();
                w.input(sc);
                list.add(w);
                break;
            }
            case 3: {
                Staff s = new Staff();
                s.input(sc);
                list.add(s);
                break;
            }
            default:
                throw new AssertionError();
        }
    }

    public ArrayList<Officer> searchOfficer(String name) {
        ArrayList<Officer> newList = new ArrayList<>();
        for (Officer officer : list) {
            if(officer.getName().equalsIgnoreCase(name)){
                newList.add(officer);
            }
           
        }
        return newList;
    }

    public void showListInforOfficer() {
        for (Officer officer : list) {
            if (officer instanceof engineer) {
                ((engineer) officer).output();
            }
            if (officer instanceof Worker) {
                ((Worker) officer).output();
            }
            if (officer instanceof Staff) {
                ((Staff) officer).output();
            }
        }
    }

    public void showMenu() {
        System.out.println("1. them nhan vien");
        System.out.println("2. tim nhan vien bang ten");
        System.out.println("3. hien thi danh sach nhan vien");
    }

    public static void main(String[] args) {
        int n;
        ManagerOfficer managerofficer = new ManagerOfficer();
        while (true) {
            managerofficer.showMenu();
            System.out.println("Nhap lua chon cau ban");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    Officer officer = new Officer();
                    managerofficer.addOfficer(officer);
                    break;
                }
                case 2: {
                    System.out.println("Nhap ten can tim: ");
                    String name;
                    name = sc.nextLine();
                    ArrayList<Officer> newL = managerofficer.searchOfficer(name);
                    if(newL.isEmpty()){
                        System.out.println("Khong tim thay ten nhan vien.");
                    }
                    for (Officer officer : newL) {
                        if (officer instanceof engineer) {
                            new engineer().output();
                        }
                        if (officer instanceof Worker) {
                            new Worker().output();
                        }
                        if (officer instanceof Staff) {
                            new Staff().output();
                        }
                    }
                    break;
                }
                case 3: {
                    managerofficer.showListInforOfficer();
                    break;
                }
                default:
                    throw new AssertionError();
            }
        }
    }
}
