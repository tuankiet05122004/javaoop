package abstraction.HangHoa;

import java.util.Scanner;

abstract class Commodity {

    Commodity() {
    }

    private String id;
    private String name = "xxx";
    private int quantity;
    private double price;

    public void Input(Scanner sc) {
        while (true) {
            try {
                System.out.println("Nhap ma hang: ");
                id = sc.nextLine();
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Nhap ten san pham: ");
                name = sc.nextLine();
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Nhap so luong: ");
                quantity = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Nhap don gia: ");
                price = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
    }

    public void Output() {
        System.out.println("ma: " + id + " ten hang: " + name + " so luong: " + quantity + " don gia: " + price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double VAT(double price);
    abstract int danhgia();
}
