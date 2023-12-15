package abstraction;

import java.util.Scanner;

public class manage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();
        while (true) {
            System.out.println("1. insertPhone");
            System.out.println("2. removePhone");
            System.out.println("3. updatePhone");
            System.out.println("4. searchPhone");
            System.out.println("5. sort");
            System.out.println("6. exit");
            int n;
            while (true) {
                try {
                    System.out.println("Enter you choose");
                    n = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                }
            }
            switch (n) {
                case 1: {
                    Phone phone = new Phone();
                    System.out.println("Enter information name and number phone");
                    phone.Input(sc);
                    pb.insertIphone(phone.getName(), phone.getNumberphone());
                    pb.out();
                    break;
                }
                case 2: {
                    System.out.println("Enter name need remove: ");
                    String name;
                    name = sc.nextLine();
                    pb.removePhone(name);
                    break;
                }
                case 3: {
                    Phone phone = new Phone();
                    System.out.println("Enter information name and number phone need update");
                    phone.Input(sc);
                    pb.updatePhone(phone.getName(), phone.getNumberphone());
                    break;
                }
                case 4: {
                    System.out.println("Enter name need search: ");
                    String name;
                    name = sc.nextLine();
                    pb.searchPhone(name);
                    break;
                }
                case 5: {
                    pb.sort();
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                default:
                    throw new AssertionError();
            }
        }
    }

}
