package abstraction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class PhoneBook extends Iphone {

    Scanner sc = new Scanner(System.in);
    ArrayList<Phone> Phonelist = new ArrayList<>();

    public Phone find(String name) {
        for (Phone phone : Phonelist) {
            if (phone.getName().equalsIgnoreCase(name)) {
                return phone;
            }
        }
        return null;
    }

    @Override
    void insertIphone(String name, String numberphone) {
//        Phone p = find(name);
//        if (p != null) {
//
//            p.setNumberphone(p.getNumberphone() + ":" + numberphone);
//            System.out.println("abc");
//        } else {
//            Phone newP = new Phone(name, numberphone);
//            Phonelist.add(newP);
//            System.out.println("213");
//        }
        Phone p = new Phone(name, numberphone);
        if (Phonelist.size() <= 0) {
            Phonelist.add(p);
        } else {
            for (Phone phone : Phonelist) {
                if (phone.getName().equalsIgnoreCase(p.getName())) {
                    phone.setNumberphone(phone.getNumberphone() + ":" + numberphone);
                    break;
                } else {
                    Phonelist.add(p);
                    break;
                }
            }
        }
//        

    }

    public void out() {
        if (Phonelist.size() > 0) {
            for (Phone phone : Phonelist) {
                phone.Output();
            }
        }

    }

    @Override
    void removePhone(String name) {
        for (int i = 0; i < Phonelist.size(); i++) {
            if (Phonelist.get(i).getName().equalsIgnoreCase(name)) {
                Phonelist.remove(i);
                i--;
            }
        }
    }

    @Override
    void updatePhone(String name, String new_numberphone) {
        for (Phone phone : Phonelist) {
            if (phone.getName().equalsIgnoreCase(name)) {
                phone.setNumberphone(new_numberphone);
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (Phone phone : Phonelist) {
            if (phone.getName().equalsIgnoreCase(name)) {
                phone.Output();
            }
        }
    }

    @Override
    void sort() {
        Collections.sort(Phonelist, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }
}
