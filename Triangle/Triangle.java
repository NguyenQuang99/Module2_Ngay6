package Triangle;

public class Triangle extends Shape {
    private double side1 =1.0;
    private double side2 = 1.0;
    private double side3 =1.0;
    private double height = 1.0;
    public Triangle() {

    }
    public Triangle(double side1, double side2, double side3,double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }
    public Triangle(double side1, double side2, double side3, double height,String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double getArea() {
        return 1/2 * getHeight() * 0.5;
    }
    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", height=" + height +
                '}';
    }
}
