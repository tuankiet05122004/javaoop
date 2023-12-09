package Inheritance_Polymorphism.manageHotel;

public class Room {
    private String category;
    private int price;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public Room(String category, int price) {
        this.category = category;
        this.price = price;
    }
    
}
