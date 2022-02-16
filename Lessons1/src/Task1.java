package Lessons1.src;

public class Task1 {
    public static void main(String[]args){
        final int nmax=10;
        int[] a;
        a = new int[nmax];

        for (int k = 0; k < nmax; k++){
            a[k] = (int) (Math.random() * nmax);
            System.out.print(a[k] + " ");
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
        System.out.println();
        for (int k = 0; k < nmax; k++){
            System.out.print(a[k] + " ");
        }
    }
}
