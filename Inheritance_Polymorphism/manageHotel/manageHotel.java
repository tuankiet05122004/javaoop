package Inheritance_Polymorphism.manageHotel;

import java.util.Scanner;

public class manageHotel {

    public static void main(String[] args) {
        Hotel h = new Hotel();
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        while (check) {
            int a;
            h.showMenu();
            System.out.println("Nhap lua chon: ");
            a = Integer.parseInt(sc.nextLine());
            switch (a) {
                case 1:
                    Person person = new Person();
                    h.add(person);
                    break;

                case 2:
                    String passport;
                    System.out.println("Enter passport need delete: ");
                    passport = sc.nextLine();
                    h.delete(passport);
                    break;
                case 3:
                    String passport1;
                    System.out.println("Enter passport need delete: ");
                    passport1 = sc.nextLine();
                    System.out.println("total: "+h.calculator(passport1));
                    break;
                case 4:
                    h.showInfo();
                    break;
                case 5:
                    System.exit(a);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
