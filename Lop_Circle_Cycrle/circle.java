package Lop_Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "green";
    public Circle () {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;

    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return  radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2* radius * Math.PI;
    }
    public String toString() {
        return "Circle have radius =" + getRadius() ;
    }
}
