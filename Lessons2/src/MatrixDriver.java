public class MatrixDriver {
    public static void main(String[] args) {
        double k = -6;
        int r = 3;
        int c = 4;
        Matrix m1 = new Matrix(r, c);
        Matrix m2 = new Matrix(r, c);
        System.out.println("Первая матрица:");
        m1.Full(r, c);
        m1.Print();
        System.out.println("Вторая матрица:");
        m2.Full(r, c);
        m2.Print();

        m1.MulMatrix(m1, m2);
        m1.Sum(m1, m2);

        System.out.println("Вторая матрица, умноженная на " + k + ":");
        m2.MulK(k);
        m2.Print();
    }
}
