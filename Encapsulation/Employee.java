package Encapsulation;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getName(){
        return getFirstName()+ " " + getLastName();
    }
    public int getAnnualSalary(){
        return getSalary()*12;
    }
    public int raiseSalary(int percent){
        setSalary(getSalary() + (getSalary() * percent / 100));
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", Name=" + getName() + ", salary=" + salary + '}';
    }
    
}
