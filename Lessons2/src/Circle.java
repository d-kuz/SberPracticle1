package Lessons2.src;

public class Circle {
    public String color;
    public double radius;
    public Circle(String c, double r) {
        color = c;
        radius = r;
    }
    public double area () {
        double r = radius;
        double S = 3.14*r*r;
        return S;
    }
    public double perimeter () {
        double r = radius;
        double P = 2*3.14*radius;
        return P;
    }
    public String toString(){
        return radius + ", " + color + ", " + area() + ", " + perimeter();
    }
}
