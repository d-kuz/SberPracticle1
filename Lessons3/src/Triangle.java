class Triangle extends Figure implements Drawable{
    private double a, b, c;
    Triangle (Point point, double a, double b, double c){
        super(point);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a  + b + c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public void draw() {
        draw(Color.Black);
    }

    public void draw(Color color) {
        System.out.printf("Круг с координатами %s, сторонами %s, %s, %s и цветом %s \n", point, a, b, c, color);
    }
}