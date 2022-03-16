import java.io.*;
import java.util.Arrays;

public class SortWord {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Natik\\IdeaProjects\\SberPracticle1\\Lessons5\\src\\CopyListNames.txt");
        f.createNewFile();
        FileWriter fileOutputStream = new FileWriter(f);
        String[] a;
        try (BufferedReader fileInputStream = new BufferedReader(new FileReader
                ("C:\\Users\\Natik\\IdeaProjects\\SberPracticle1\\Lessons5\\src\\ListNames.txt"))){
            String b = fileInputStream.readLine();
            a = b.split(", ");
            Arrays.sort(a);
            for(String c: a){
                fileOutputStream.write(c + "\n");
            }
            fileOutputStream.close();
        }
    }
}
