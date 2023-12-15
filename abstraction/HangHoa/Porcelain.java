package abstraction.HangHoa;

import static abstraction.HangHoa.Food.df;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Porcelain extends Commodity {

    public Porcelain() {
        super();
    }

    private String producer;
    private Date day = new Date();

    @Override
    public void Input(Scanner sc) {
        super.Input(sc);
        while (true) {
            try {
                System.out.println("Nhap nha san xuat: ");
                producer = sc.nextLine();
                break;
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("Nhap ngay nhap kho: ");
                day = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

    @Override
    public void Output() {
        super.Output();
        System.out.print(" nha san xuat: " + producer);
        System.out.print(" ngay het han: " + day);
    }

    @Override
    double VAT(double price) {
        return price * 10 / 100;
    }

    public long calculateDay() {
        long millisecondsPerDay = 24 * 60 * 60 * 1000;
        Date currentDate = new Date();
        long difference = currentDate.getTime() - day.getTime();
        return difference / millisecondsPerDay;
    }

    @Override
    int danhgia() {
        if(getPrice() > 50 && calculateDay() > 10 ){
            return 1;
        }
        return -1;
    }
}
