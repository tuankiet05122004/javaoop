package Inheritance_Polymorphism.manageHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Person> persons = new ArrayList<>();
    public void add(Person person){
        person.Input(sc);
        persons.add(person);
    }
    public void delete(String passport){
        for (int i = 0; i<persons.size();) {
            if(persons.get(i).getPassport().equalsIgnoreCase(passport)){
                persons.remove(persons.get(i));
            }else{
                i++;
            }
        }
    }
    public int calculator(String passport){
        int cal = 0;
        for (Person person : persons) {
            if(person.getPassport().equalsIgnoreCase(passport)){
                cal = person.getRoom().getPrice() * person.getNumberRent();
            }
        }
        return cal;
    }
    public void showInfo(){
        for (Person person : persons) {
            person.Output();
        }
    }
    public void showMenu(){
        System.out.println("1. add");
        System.out.println("2. delete");
        System.out.println("3. calculator");
        System.out.println("4. show info");
        System.out.println("5. exit");
    }
}
