import java.io.*;

public class DeleteSpace {
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\Users\\Natik\\IdeaProjects\\SberPracticle1\\Lessons5\\src\\CopyBorodino.txt");
        f.createNewFile();
        FileWriter fileOutputStream = new FileWriter(f);
        try (FileReader fileInputStream = new FileReader("C:\\Users\\Natik\\IdeaProjects\\SberPracticle1\\Lessons5\\src\\Borodino.txt")){
            int  b;
            b = fileInputStream.read();
            while (b != -1){
                if (b != ' ') {
                    fileOutputStream.write(b);
                }
                b = fileInputStream.read();
            }
            fileOutputStream.close();
        }
    }
}
