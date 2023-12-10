package Town;

import java.util.ArrayList;
import java.util.Scanner;

public class Family {
    private ArrayList<Person> persons = new ArrayList<Person>();
    private String address;
    public static int population =0;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void Input(Scanner sc){
        boolean check = true;
        while (check) {
            population++;
            Person person = new Person();
            person.Input(sc);
            
            persons.add(person);
            System.out.println("Press Y to continue. Press N to break");
            String choose = sc.nextLine();
            if(choose.equalsIgnoreCase("n")){
                check = false;
            }
        }
        System.out.println("Enter address: ");
        address = sc.nextLine();
    }
    
    public void Output(){
        for (Person person : persons) {
            person.Output();
            System.out.print(" address: "+address);
            System.out.println("");
        }
    }
}
