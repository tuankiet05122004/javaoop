package Employee_Management;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    private int wokingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int wokingHours) {
        super(name, paymentPerHour);
        this.wokingHours = wokingHours;
    }

    public PartTimeEmployee() {
    }
    
    
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * wokingHours;
    }
    @Override
    public void Input(Scanner sc){
        super.Input(sc);
        while(true){
            try {
                System.out.println("Working Hours: ");
                wokingHours = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
            }
        }
    }
    @Override
    public void Output(){
        super.Output();
        System.out.print(" woking hour: "+wokingHours+" Salary: "+calculateSalary());
        System.out.println("");
    }
}
