class Rectangle extends Figure implements Drawable{
    Point p1, p2, p3,p4;
    Rectangle (Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
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
