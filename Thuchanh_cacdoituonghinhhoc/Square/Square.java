package Thuc_hanh_he_doituong_hinh_hoc;

public class Square extends Rectangle {
    public Square () {

    }
    public Square(double size) {
        super(size,size);
    }
    public Square(double size, String color, boolean filled) {
        super(size,size,color,filled);
    }
    public double getSize() {
        return getWidth();
    }
    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }
    public void setWidth(double width) {
        setSize(width);
    }
    public void setLength(double length) {
        setSize(length);
    }
    public String toString() {
        return "A square  with size :" + getSize() + " which a subclass of" + super.toString();
    }

}
