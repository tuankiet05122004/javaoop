package abstraction.HangHoa;

import java.util.Scanner;

public class electric extends Commodity{

    public electric() {
        super();
    }
    private int Guarantee;
    private int KW;
    @Override
    public void Input(Scanner sc){
        super.Input(sc);
        while(true){
            try {
                System.out.println("Nhap thoi gian bao hanh: ");
                Guarantee = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        while(true){
            try {
                System.out.println("Nhap cong xuat: ");
                KW = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
            }
        }
    }
    @Override
    public void Output(){
        super.Output();
        System.out.print(" thoi gian bao hanh: "+Guarantee);
        System.out.print(" cong xuat: "+KW);
    }
    @Override
    int danhgia(){
        if(getQuantity()<3){
            return 1;
        }
        return -1;
    }
    @Override
    double VAT(double price) {
        return price * 10/100;
    }
    
}
