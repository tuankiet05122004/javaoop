package Employee_Management;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8*getPaymentPerHour();
    }
    
    @Override
    public void Input(Scanner sc){
        super.Input(sc);
    }
    @Override
    public void Output(){
        super.Output();
        System.out.print(" Salary: "+calculateSalary());
        System.out.println("");
    }
}
