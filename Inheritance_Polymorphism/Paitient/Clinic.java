package Inheritance_Polymorphism.Paitient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Clinic {

    static ArrayList<Person> patientList = new ArrayList<>();

    public void addPatient(Person person) {
        patientList.add(person);
    }

    public void printPatientList() {
        for (Person person : patientList) {
            person.Output();
        }
    }

    public double calculateTotalPayment() {
        double total = 0;
        for (Person person : patientList) {
            if (person instanceof Inpatient) {
                if (person.getYearOfBirth() < 1960) {
                    total += ((Inpatient) person).getDrugCost() * 10 / 100;
                    total += ((Inpatient) person).getAccommodationCost() * 12 / 100;
                } else {
                    total += ((Inpatient) person).getDrugCost();
                    total += ((Inpatient) person).getAccommodationCost();
                }
            }
            if (person instanceof Outpatient) {
                if (person.getYearOfBirth() < 1960) {
                    total += ((Outpatient) person).getPreTreament() * 8 / 100;
                } else {
                    total += ((Outpatient) person).getPreTreament();
                }
            }
        }
        return total;
    }

    public void sortByName() {
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getFullName().compareTo(p2.getFullName());
            }
        };
        Collections.sort(patientList, nameComparator);
    }

    public void showMenu() {
        System.out.println("1. add Patient.");
        System.out.println("2. print Patient List.");
        System.out.println("3. calculate Total payment.");
        System.out.println("4. exit");
    }

    public static void main(String[] args) {
        Clinic c = new Clinic();
        c.sortByName();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x;
            c.showMenu();
            System.out.println("Enter selection: ");
            x = Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1: {
                    int n;
                    System.out.println("1. add inpatient.");
                    System.out.println("2. add outpatient.");
                    System.out.println("Enter selection: ");
                    n = Integer.parseInt(sc.nextLine());
                    if (n == 1) {
                        Inpatient i = new Inpatient();
                        i.Input(sc);
                        c.addPatient(i);
                    } else {
                        Outpatient o = new Outpatient();
                        o.Input(sc);
                        c.addPatient(o);
                    }
                    break;
                }
                case 2:
                    c.printPatientList();
                    break;
                case 3:
                        System.out.println("total: "+c.calculateTotalPayment());
                    break;
                case 4:
                    System.exit(x);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
