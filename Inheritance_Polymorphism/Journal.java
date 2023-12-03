package Inheritance_Polymorphism;

import java.util.Scanner;

public class Journal extends Document {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap volume: ");
        volume = Integer.parseInt(sc.nextLine());
    }
    @Override
    public void output(){
        super.output();
        System.out.println(" volume: "+getVolume());
    }
}
