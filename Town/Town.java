package Town;

import static Town.Family.population;
import java.util.ArrayList;
import java.util.Scanner;

public class Town {

    private ArrayList<Family> families = new ArrayList<>();

    public void addFamily(Family family) {
        families.add(family);
    }

    public void showInfo() {
        for (Family family : families) {
            family.Output();
            System.out.println("");
        }
    }

    public int getPopulation() {
        return population;
    }

    public void showMenu() {
        System.out.println("1. addFamily");
        System.out.println("2. showInfo");
        System.out.println("3. Population");
        System.out.println("4. exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Town t = new Town();
        while (true) {
            t.showMenu();
            int n;
            System.out.println("Enter you select: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    Family f = new Family();
                    f.Input(sc);
                    t.addFamily(f);
                    break;
                }
                case 2:
                    t.showInfo();
                    break;
                case 3: 
                    System.out.println("population: "+t.getPopulation());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
