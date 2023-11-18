package Encapsulation;
// protected: truy cập trong cùng 1 package
// defauld:  giống vơi protected nhưng không cho phần tử kế thừa sử dụng lại hàm;

import java.util.Scanner;
// private: thuộc tính nên dùng
// public: phương thức nên dùng

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//          Circle        
//        Circle c1 = new Circle();
//        System.out.println(c1.getArea());
//        Circle c2 = new Circle(2.0);
//        System.out.println(c2.getArea());

//         Rectangle
//        Rectangle r1 = new Rectangle(1.2f, 3.4f);
//        r1.toString();
//        Rectangle r2 = new Rectangle();
//        r2.toString();
//        Rectangle r3 = new Rectangle(5.6f, 7.8f);
//        r3.toString();
//        System.out.println("length is: " + r3.getLength());
//        System.out.println("Width is: " + r3.getWidth());
//
//        System.out.println("Area: " + String.format("%.2f", r3.getArea()));
//        System.out.println("Perimeter: " + String.format("%.2f", r3.getPerimeter()));


//          Employee
           Employee e1 = new Employee(8, "Peter", "Tan", 2500);
           System.out.println(e1);
           
           e1.setSalary(999);
           System.out.println(e1);
           System.out.println("id is: " + e1.getId());
           System.out.println("firsname is: "+e1.getFirstName());
           System.out.println("lastname is: "+e1.getLastName());
           System.out.println("salary is: "+e1.getSalary());
           
           System.out.println("name is: "+e1.getName());
           System.out.println("annual salary is: "+e1.getAnnualSalary());
           
           System.out.println(e1.raiseSalary(10));
           System.out.println(e1);
    }
}
