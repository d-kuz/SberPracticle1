package Lessons1.src;

public class Task2 {
    public static void main(String[] args) {
        final int nmax=10;
        int a[];
        a = new int[nmax];

        for (int k = 0; k < nmax; k++){
            a[k] = (int) (Math.random() * nmax);
            System.out.print(a[k] + " ");
        }

        QuickSort(a, 0, nmax - 1);

        System.out.println();
        for (int k = 0; k < nmax; k++){
            System.out.print(a[k] + " ");
        }
    }

    static void QuickSort(int[] a, int L, int R){
        int i = L, j = R;
        int x = a[(L + R)/2];
        do{
            while(a[i] < x)
                i++;
            while(a[j] > x)
                j--;
            if (i <= j){
                int c = a[i];
                a[i] = a[j];
                a[j] = c;
                i++;
                j--;
            }
        }while (i <= j);
        if (L < j)
            QuickSort(a, L, j);
        if (i < R)
            QuickSort(a, i, R);
    }
}
