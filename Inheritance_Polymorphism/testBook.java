package Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class testBook {

    static Scanner sc = new Scanner(System.in);

    public static void inputSGK(ArrayList<Book> listbook) {
        SGK b1 = new SGK();
        b1.input(sc);
        listbook.add(b1);
    }

    public static void inputSTK(ArrayList<Book> listbook) {
        STK b1 = new STK();
        b1.input(sc);
        listbook.add(b1);
    }

    public static void output(ArrayList<Book> listbook) {
        for (Book book : listbook) {
            System.out.println(book.toString());
        }
    }

    public static void outputSGK(ArrayList<Book> listbook) {
        for (Book book : listbook) {
            if (book instanceof SGK) {
                System.out.println(book.toString());
            }
        }
    }

    public static void tinhtong(ArrayList<Book> listbook) {
        double sum = 0;
        for (Book book : listbook) {
            if(book instanceof SGK){
                SGK SGKbook = (SGK) book;
                sum+=SGKbook.ThanhTien();
            }
            else if(book instanceof STK){
                STK STKbook = (STK) book;
                sum+=STKbook.ThanhTien();
            }
        }
        System.out.println("tong cua cac loai sach: " + sum);
    }

    public static void trungbinhcong(ArrayList<Book> listbook) {
        double trungbinhcong = 0, sum = 0, dem = 0;
        for (Book book : listbook) {
            if (book instanceof STK) {
                sum += book.getDonGia();
                dem++;
            }
        }
        trungbinhcong = sum / dem;
        System.out.println("trung binh cng don gia cua sach kham khao: " + trungbinhcong);
    }

    public static void main(String[] args) {
        ArrayList<Book> listbook = new ArrayList<Book>();
        SGK s1 = new SGK();
        int n;
        while (true) {
            System.out.println("1. Nhap thong tin sach giao khoa");
            System.out.println("2. Nhap thong tin sach tham giao");
            System.out.println("3. Hien thi thong tin sach");
            System.out.println("4. tinh tong thanh tien cac loai");
            System.out.println("5. trung binh cong cho cac sach tham khao");
            System.out.println("6. xuat sach giao khoa");
            System.out.println("7. exit");
            System.out.print("nhap lua chon: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    inputSGK(listbook);
                    break;
                case 2:
                    inputSTK(listbook);
                    break;
                case 3:
                    output(listbook);
                    break;
                case 4:
                    tinhtong(listbook);
                    break;
                case 5:
                    trungbinhcong(listbook);
                    break;
                case 6:
                    outputSGK(listbook);
                    break;
                case 7:
                    System.exit(n);
            }
        }

    }
}
