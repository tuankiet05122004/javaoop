package abstraction;

import java.util.Scanner;

class Phone {

    private String name;
    private String numberphone;

    public void Input(Scanner sc) {
        while (true) {
            try {
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("number phone: ");
                numberphone = sc.nextLine();
                break;
            } catch (Exception e) {
                
            }
        }
    }

    public Phone() {
    }

    public Phone(String name, String numberphone) {
        this.name = name;
        this.numberphone = numberphone;
    }

    public void Output() {
        System.out.println("Name: " + name + " number phone: " + numberphone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }
}
