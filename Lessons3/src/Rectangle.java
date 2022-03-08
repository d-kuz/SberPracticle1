class Rectangle extends Figure{
    private int w,h;
    public Rectangle (Point point, int w, int h){
        super(point);
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w*h;
    }

    @Override
    public double perimeter() {
        return 2*(w + h);
    }

    public void draw() {
        draw(Color.Black);
    }

    public void draw(Color color) {
        System.out.printf("Прямоугольник с координатами %s, высотой %s, шириной %s и цветом %s \n", point, h, w, color);
    }
}
