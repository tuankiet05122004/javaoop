
package Encapsulation;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        r1.toString();
        Rectangle r2 = new Rectangle();
        r2.toString();
        Rectangle r3 = new Rectangle(5.6f, 7.8f);
        r3.toString();
        System.out.println("length is: " + r3.getLength());
        System.out.println("Width is: " + r3.getWidth());
        System.out.println("Area: " + String.format("%.2f", r3.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", r3.getPerimeter()));
    }
}
