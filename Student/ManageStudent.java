package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {

    static Scanner sc = new Scanner(System.in);
    ArrayList<Student> StudentList = new ArrayList<>();

    public void Insert(Student s) {
        StudentList.add(s);
    }

    public void ShowAllList() {
        for (Student student : StudentList) {
            student.Output();
        }
    }

    public Student SearchByID(int ID) {
        for (Student student : StudentList) {
            if (student.getID() == ID) {
                return student;
            }
        }
        return null;
    }

    public void UpdateByID(int ID) {
        for (Student student : StudentList) {
            if (student.getID() == ID) {
                student.Input(sc);
            }
        }
    }

    public void ShowMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Show All List Student");
        System.out.println("3. Search student by id");
        System.out.println("4. Update student by id");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        int n;
        ManageStudent manage = new ManageStudent();
        while (true) {
            manage.ShowMenu();

            while (true) {
                try {
                    System.out.println("Enter your choose: ");
                    n = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                }
            }

            switch (n) {
                case 1: {
                    Student s = new Student();
                    s.Input(sc);
                    manage.Insert(s);
                    break;
                }
                case 2:
                    manage.ShowAllList();
                    break;
                case 3: {
                    int id;
                    while (true) {
                        try {
                            System.out.println("Enter id need search: ");
                            id = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (Exception e) {
                        }
                    }
                    manage.SearchByID(id).Output();
                    break;
                }
                case 4: {
                    int id;
                    while (true) {
                        try {
                            System.out.println("Enter id need update: ");
                            id = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (Exception e) {
                        }
                    }
                    manage.UpdateByID(id);
                    break;
                }
                case 5:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
