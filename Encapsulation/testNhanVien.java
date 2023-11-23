
package Encapsulation;

import java.util.Scanner;

public class testNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSNhanVien ds1 = new DSNhanVien();
        ds1.NhapDS(sc);
        System.out.println(ds1.TongThucLinh());
        ds1.SapXep();
        ds1.HienThiDS();
    }
}
