package Inheritance_Polymorphism;

public class circle {
    private double radius = 1.0;
    private String color = "red";

    public circle() {
    }
    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    public double getArea(){
        double area = Math.pow(getRadius(), 2) * Math.PI;
        return area;
    }
}