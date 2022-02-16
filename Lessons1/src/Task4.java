package Lessons1.src;

public class Task4 {
    public static void main(String[]args){
        final int nmax=10;
        int a[];
        a = new int[nmax];

        for (int k = 0; k < nmax; k++){
            a[k] = (int) (Math.random() * nmax);
        }
        for(int i = 0; i < nmax; i++){
            for(int j = nmax - 1; j > i; j-- ){
                if (a[i] < a[j])  {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        System.out.println("Max:" + a[0]);
        System.out.println("Min:" + a[9]);
        int m=0;
        for (int k = 0; k < nmax; k++){
            m = m + a[k];
        }
        System.out.println("Average:" + m/10);
    }
}
