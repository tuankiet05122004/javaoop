package Employee_Management;

import java.util.Scanner;

abstract class Employee implements IEmployee{
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public Employee() {
    }
    
    public void Input(Scanner sc){
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        while (true){
            try {
                System.out.println("Enter pyment per hour: ");
                paymentPerHour = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
            }
        }
    }
    public void Output(){
        System.out.print("Name: "+name+" payment per hour: " + paymentPerHour);
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    
    
}
