
package Inheritance_Polymorphism;

public class XeDap extends thueXe {
    @Override
    public double TienThue(){
        double tienThue = 0;
        if(super.getHour()==1){
            tienThue=10000;
        }else{
            tienThue=10000+(super.getHour()-1)*8000;
        }
        return tienThue;
    }

    @Override
    public String toString() {
        return super.toString() + "tienThue=" + TienThue()  + '}';
    }
    
}
