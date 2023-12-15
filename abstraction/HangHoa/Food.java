package abstraction.HangHoa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Food extends Commodity {

    public Food() {
        super();
    }

    private String supplier;
    public static Date date = new Date();
    private Date manufactureDate = date;
    private Date expirationDate = manufactureDate;

    static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void Input(Scanner sc) {
        super.Input(sc);
        while (true) {
            try {
                System.out.println("Nhap ngay san xuat: ");
                manufactureDate = df.parse(sc.nextLine());
                if (manufactureDate.before(date)) {
                    break;
                }
            } catch (Exception e) {
                Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        while (true) {
            try {
                System.out.println("Nhap ngay het han: ");
                expirationDate = df.parse(sc.nextLine());
                if (expirationDate.after(date)) {
                    break;
                }
            } catch (Exception e) {
                Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    @Override
    public void Output(){
        super.Output();
        System.out.println("ngay san xuat: "+df.format(manufactureDate));
        System.out.println("ngay san xuat: "+df.format(expirationDate));
    }
    @Override
    public int danhgia(){
        if(this.getQuantity() > 0 && expirationDate.before(date)){
            return 1;
        }
        return -1;
    }
    @Override
    double VAT(double price) {
        return price * 5 / 100;
    }


}
