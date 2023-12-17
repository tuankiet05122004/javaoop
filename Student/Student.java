package Student;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student implements IStudent {

    private String fullName;
    private int ID;
    private static int count = 0;
    private Date dateOfBirth;
    private String PhoneNo;
    private double ChemisMark;
    private double MathsMark;
    private double PhyMark;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Student() {
        count++;
        ID = count; 
    }

    public void Input(Scanner sc) {
        while (true) {
            try {
                System.out.println("Enter full name: ");
                fullName = sc.nextLine();
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Enter Date of birth: ");
                dateOfBirth = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Enter Phone: ");
                PhoneNo = sc.nextLine();

                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Enter chemis mark: ");
                ChemisMark = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Enter math mark: ");
                MathsMark = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Enter phy mark: ");
                PhyMark = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public double getChemisMark() {
        return ChemisMark;
    }

    public void setChemisMark(double ChemisMark) {
        this.ChemisMark = ChemisMark;
    }

    public double getMathsMark() {
        return MathsMark;
    }

    public void setMathsMark(double MathsMark) {
        this.MathsMark = MathsMark;
    }

    public double getPhyMark() {
        return PhyMark;
    }

    public void setPhyMark(double PhyMark) {
        this.PhyMark = PhyMark;
    }

    public int Age() {
        Date date = new Date();
        int age = date.getYear() - dateOfBirth.getYear();
        return age;
    }

    public void Output() {
        System.out.print(" ID:" + ID + " Full Name:" + fullName + " Age:" + Age() + " Phone:" + PhoneNo + " Average: " + CalculateAverage());
        System.out.println("");
    }

    @Override
    public double CalculateAverage() {
        return (ChemisMark + MathsMark + PhyMark) / 3;
    }
}
