package Lessons1.src;

public class Task5 {
    public static void main(String[]args){
        int n=2;
        System.out.println(2);
        while (n < 100){
            int dmax =(int) Math.sqrt(n);
            if (n%2 != 0){
                int d = 3;

                while ((d <= dmax) && (n%d != 0)){
                    d = d + 2;
                }
                if (d > dmax) {
                    System.out.println(n);
                }
            }
            n++;
        }
        System.out.println();

    }
}
