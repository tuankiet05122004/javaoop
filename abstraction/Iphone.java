package abstraction;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Iphone{
    abstract void insertIphone(String name, String numberphone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String new_numberphone);
    abstract void searchPhone(String name);
    abstract void sort();
}



