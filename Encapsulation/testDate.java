
package Encapsulation;

public class testDate {
    public static void main(String[] args) {
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);
        
        d1.setMoth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);
        System.out.println("Moth: "+d1.getMoth());
        System.out.println("Day: "+d1.getDay());
        System.out.println("Year: "+d1.getYear());
        
        d1.setDate(3, 4, 2016);
        System.out.println(d1);
    }
}
