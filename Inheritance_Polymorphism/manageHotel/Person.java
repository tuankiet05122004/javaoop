package Inheritance_Polymorphism.manageHotel;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private String passport;
    private Room room;
    private int numberRent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    
    
    public void Input(Scanner sc) {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter passport: ");
        passport = sc.nextLine();
        int a;
        System.out.println("1.Room A");
        System.out.println("2.Room B");
        System.out.println("3.Room C");
        System.out.println("Enter room: ");
        a = Integer.parseInt(sc.nextLine());
        switch (a) {
            case 1:
                room = new RoomA();
                break;
            case 2:
                room = new RoomB();
                break;
            case 3:
                room = new RoomC();
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Enter NumsberRent: ");
        numberRent = Integer.parseInt(sc.nextLine());
    }
    public void Output(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("passport: "+passport);
        System.out.println("price: "+room.getPrice());
        System.out.println("category: "+room.getCategory());
        System.out.println("numberRent: "+numberRent);
    }
}
