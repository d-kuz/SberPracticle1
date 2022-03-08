public class FigureUtil{
    private FigureUtil(Figure figure){}
    public static double area(Figure figure){
        return figure.area();
    }
    public static double perimetr(Figure figure){
        return figure.perimeter();
    }
    public static void draw(Drawable figure){
        figure.draw();
    }
    public static void draw(Drawable figure, Color color){
        figure.draw(color);
    }
}