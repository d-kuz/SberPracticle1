import java.io.Serializable;

public class Transport implements Serializable {
    String brand;
    int year;
    Color color;
    public Transport(String brand, int year, Color color){
        this.brand = brand;
        this.year = year;
        this.color = color;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }
}
