public class Paint {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0, 5);
        Circle c = new Circle(p1, p2);
        c.draw();
        c.draw(Color.Red);
    }
}
