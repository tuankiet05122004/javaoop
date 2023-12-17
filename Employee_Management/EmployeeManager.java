package Employee_Management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManager {

    static Scanner sc = new Scanner(System.in);
    ArrayList<Employee> eList = new ArrayList<>();

    public void addEmploy(Employee e) {
        eList.add(e);
    }

    public void showAllEmloyee() {
        for (Employee employee : eList) {
            employee.Output();
        }
    }

    public void showTotalSalaryFullTime() {
        for (Employee employee : eList) {
            if (employee instanceof FullTimeEmployee) {
                employee.Output();
            }
        }
    }

    public void SortEmployeeByName() {
        Collections.sort(eList, Comparator.comparing(Employee::getName));
    }

    public void showMenu() {
        System.out.println("1. add employ");
        System.out.println("2. show all employee");
        System.out.println("3. show total salary of full time employee");
        System.out.println("4. sort employ by name");
        System.out.println("5. exit");
    }

    public static void main(String[] args) {
        EmployeeManager manage = new EmployeeManager();
        while (true) {
            manage.showMenu();
            int x;
            try {

                System.out.println("Enter your choose: ");
                x = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
            }
            switch (x) {
                case 1: {
                    while (true) {
                        System.out.println("1. full time");
                        System.out.println("2. part time");
                        int n;
                        try {
                            System.out.println("enter your choose: ");
                            n = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (Exception e) {
                        }
                        switch (n) {
                            case 1: {
                                FullTimeEmployee e = new FullTimeEmployee();
                                e.Input(sc);
                                manage.addEmploy(e);
                                break;
                            }
                            case 2: {
                                PartTimeEmployee e = new PartTimeEmployee();
                                e.Input(sc);
                                manage.addEmploy(e);
                                break;
                            }
                            default:
                                throw new AssertionError();
                        }

                    }
                    break;
                }
                case 2: {
                    manage.showAllEmloyee();
                    break;
                }
                case 3: {
                    manage.showTotalSalaryFullTime();
                    break;
                }
                case 4: {
                    manage.SortEmployeeByName();
                    break;
                }
                case 5:{
                    System.exit(0);
                    break;
                }
                default:
                    throw new AssertionError();
            }
        }

    }
}
