import java.io.*;

public class SaveAndLoadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new
                FileOutputStream("C:\\Users\\Natik\\IdeaProjects\\SberPracticle1\\Lessons5\\src\\Car.txt"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new
                     FileInputStream("C:\\Users\\Natik\\IdeaProjects\\SberPracticle1\\Lessons5\\src\\Car.txt"))){
             Transport car = new Transport("Ford", 2015, new Gray());
             objectOutputStream.writeObject(car);
             System.out.println(car);
             Transport transport = (Transport) objectInputStream.readObject();
             System.out.println(transport);
        }
    }
}
