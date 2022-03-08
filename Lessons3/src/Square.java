class Square extends Figure{
    private int a;
    public Square(Point point, int a) {
        super(point);
        this.a = a;
    }
    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }

    public void draw() {
        draw(Color.Black);
    }

    public void draw(Color color) {
        System.out.printf("Квадрат с координатами %s, сторонами %s и цветом %s \n", point, a, color);
    }
}