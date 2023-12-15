package abstraction.HangHoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class manage {

    public ArrayList<Commodity> list = new ArrayList<>();
    static private Scanner sc = new Scanner(System.in);

    public Commodity find(String id) {
        for (Commodity commodity : list) {
            if (commodity.getId().equalsIgnoreCase(id)) {
                return commodity;
            }
        }
        return null;
    }

    void add(Commodity c) {
        Commodity findC = find(c.getId());
        if (findC == null) {
            list.add(c);
        } else {
            System.out.println("id da ton tai");
            c.Input(sc);
        }
    }

    void PrintAll() {
        for (Commodity commodity : list) {
            commodity.Output();
        }
    }

    void PrintEachType() {
        System.out.println("loai hang thuc pham");
        for (Commodity commodity : list) {
            if (commodity instanceof Food) {
//                commodity = (Food) commodity;
                commodity.Output();
            }
        }
        System.out.println("loai hang dien tu");
        for (Commodity commodity : list) {
            if (commodity instanceof electric) {
//                commodity = (electric) commodity;
                commodity.Output();
            }
        }
        System.out.println("loai hang sanh su");
        for (Commodity commodity : list) {
            if (commodity instanceof Porcelain) {
//                commodity = (Porcelain) commodity;
                commodity.Output();
            }
        }
    }

    public Commodity search(String id) {
        for (Commodity commodity : list) {
            if (commodity.getId().equalsIgnoreCase(id)) {
                return commodity;
            }
        }
        return null;
    }

    void sortByName() {
        Collections.sort(list, Comparator.comparing(Commodity::getName));
    }

    void sortByQuantity() {
        Collections.sort(list, Comparator.comparingInt(Commodity::getQuantity).reversed());
    }

    void printDifficultToSellFood() {
        System.out.println("thuc pham kho ban:");
        for (Commodity commodity : list) {
            if (commodity instanceof Food) {
                Food food = (Food) commodity;
                if (food.danhgia() == 1) {
                    food.Output();
                }
            }
        }
    }

    public void menu() {
        System.out.println("1.them hang hoa");
        System.out.println("2. in toan bo danh sach");
        System.out.println("3. in tung loai");
        System.out.println("4. tim kiem");
        System.out.println("5. sap xep hang hoa theo ten");
        System.out.println("6. sap xep hang hoa theo so luong");
        System.out.println("7. in cac thuc pham kho ban");
        System.out.println("8. exit");
    }

    public static void main(String[] args) {
        manage m = new manage();
        while (true) {
            m.menu();
            int n;
            while (true) {
                try {
                    System.out.println("nhap lua chon: ");
                    n = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                }
            }
            switch (n) {
                case 1: {
                    while (true) {
                        System.out.println("1. them thuc pham");
                        System.out.println("2. them sanh su");
                        System.out.println("3. them dien may");

                        int x;
                        while (true) {
                            try {
                                System.out.println("nhap lua chon");
                                x = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (Exception e) {
                            }
                        }
                        switch (x) {
                            case 1: {
                                Food f = new Food();
                                f.Input(sc);
                                m.add(f);
                                break;
                            }
                            case 2: {
                                electric e = new electric();
                                e.Input(sc);
                                m.add(e);
                                break;
                            }
                            case 3: {
                                Porcelain p = new Porcelain();
                                p.Input(sc);
                                m.add(p);
                                break;
                            }
                            default:
                                throw new AssertionError();
                        }
                        break;
                    }
                    break;
                }
                case 2:
                    m.PrintAll();
                    break;
                case 3:
                    m.PrintEachType();
                    break;
                case 4: {
                    String i;
                    System.out.println("nhap id can tim: ");
                    i = sc.nextLine();
                    Commodity c = m.search(i);
                    if (c != null) {
                        c.Output();
                    } else {
                        System.out.println("khong tim thay san pham");
                    }
                    break;
                }
                case 5:
                    m.sortByName();
                    break;
                case 6:
                    m.sortByQuantity();
                    break;
                case 7:
                    m.printDifficultToSellFood();
                    break;
                case 8:
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }
}
