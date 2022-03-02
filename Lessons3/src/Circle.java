import java.awt.*;

class Circle extends Figure implements Drawable{
    Point p1, p2;
    Circle (Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double area(Figure figure) {
        return super.area(figure);
    }

    @Override
    public double perimeter(Figure figure) {
        return super.perimeter(figure);
    }

    public void draw() {

    }

    public void draw(Color color) {

    }
}