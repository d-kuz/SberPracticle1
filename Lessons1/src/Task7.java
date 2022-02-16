package Lessons1.src;

public class Task7 {
    public static void main(String[]args){
        int a0 = 0, a1=1;
        System.out.println(a0);
        System.out.println(a1);
        for (int i = 2; i < 11; i++){
            int c = a1 + a0;
            a0 = a1;
            a1 = c;
            System.out.println(c);
        }
    }
}
