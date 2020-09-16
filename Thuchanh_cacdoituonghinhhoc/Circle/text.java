package Thuc_hanh_he_doituong_hinh_hoc;

public class textCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(4.0);
        System.out.println(circle1);
        Circle circle2 = new Circle("Blue",false,5.0 );
        System.out.println(circle2);
    }
}