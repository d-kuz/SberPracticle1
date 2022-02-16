package Lessons1.src;

import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        int n = 0;
        do {
            Scanner s = new Scanner(System.in);
            String a = s.nextLine();
            switch (a){
                case "Троллейбус":
                    System.out.println("Правильно!");
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: троллейбус.");
                    break;
                default:
                    System.out.println("Подумай ещё.");
                    n++;
            }

        }while (n < 3);
    }
}
