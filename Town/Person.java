package Town;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private String job;
    private String passport;
    ArrayList<String> p = new ArrayList<>();

    public void Input(Scanner sc) {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter job: ");
        job = sc.nextLine();
        System.out.println("Nhap pp");
        passport = sc.nextLine();
    }

    public boolean Check(String pp) {
        for (String string : p) {
            if (string.equals(pp)) {
                return false;
            }
        }
        return true;
    }

    public void Output() {
        System.out.print("name: " + name + " age: " + age + " passport: " + passport + " job: " + job);
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
