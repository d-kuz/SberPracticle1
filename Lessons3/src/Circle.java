class Circle extends Figure{
    private int radius;
    Circle (Point point, int radius){
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return 2*radius*Math.PI;
    }

    public void draw() {
        draw(Color.Black);
    }

    public void draw(Color color) {
        System.out.printf("Круг с координатами %s, радиусом %s и цветом %s \n", point, radius, color);
    }
}