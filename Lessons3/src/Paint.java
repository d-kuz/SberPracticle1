public class Paint {
    public static void main(String[] args) {
        Figure c = new Circle(new Point(0,0), 5);
        FigureUtil.draw(c);
        FigureUtil.draw(c, Color.Red);
        System.out.println("P: " + FigureUtil.perimetr(c));
        System.out.println("S: " + FigureUtil.area(c));

        Figure r = new Rectangle(new Point(3,2), 5, 3);
        FigureUtil.draw(r);
        FigureUtil.draw(r, Color.Blue);
        System.out.println("P: "+ FigureUtil.perimetr(r));
        System.out.println("S: " + FigureUtil.area(r));

        Figure t = new Triangle(new Point(0,0), 5, 2, 6);
        FigureUtil.draw(t);
        FigureUtil.draw(t, Color.White);
        System.out.println("P: " + FigureUtil.perimetr(t));
        System.out.println("S: " + FigureUtil.area(t));

        Figure s = new Square(new Point(0,0), 5);
        FigureUtil.draw(s);
        FigureUtil.draw(s, Color.Yellow);
        System.out.println("P: " + FigureUtil.perimetr(s));
        System.out.println("S: " + FigureUtil.area(s));

    }
}
