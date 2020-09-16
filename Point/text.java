package Point_va_Moveable;

public class text {
    public static void main(String[] args) {
        Point point = new Point(5.2f,7.9f);
        System.out.println(point.toString());
        Movable movable = new Movable(1.1f, 2.5f,6,2);
        System.out.println(movable.toString());
        System.out.println(movable.move());
    }
}
