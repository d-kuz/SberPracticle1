public class Point {
    public double x, y;
    public Point(double X, double Y) {
        x = X;
        y = Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
