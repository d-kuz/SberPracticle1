public class Matrix {
    public int row = 2;
    public int columns = 2;
    public double [][] a = new double[row][columns];

    public Matrix(int c, int r){
        row = r;
        columns = c;
        a = new double[row][columns];
    }
    public void Full(int c, int r){
        row = r;
        columns = c;
        a = new double[row][columns];
        int i = 0;
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = (int) (Math.random()*10);
            }
            i = i + 1;
        }
    }
    public void Print(){
        int i = 0;
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            i = i + 1;
        }
    }
    public void MulK(double k){
        int i = 0;
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = a[i][j]*k;
            }
            i = i + 1;
        }
    }
    public void Sum(Matrix m1, Matrix m2){
        int i = 0;
        Matrix result = new Matrix(m1.columns, m1.row);
        System.out.println("Сумма матриц: ");
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                result.a[i][j] = m1.a[i][j] + m2.a[i][j];
                System.out.print(result.a[i][j] + " ");
            }
            i = i + 1;
            System.out.println();
        }
    }
    public void MulMatrix(Matrix m1, Matrix m2){
        Matrix result = new Matrix(m1.columns, m1.row);
        System.out.println("Произведение матриц: ");
        int i = 0;
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                result.a[i][j] = 0;
                int t = 0;
                while (t < row){
                    result.a[i][j] = result.a[i][j] + m1.a[i][t]*m2.a[t][j];
                    t = t + 1;
                }
                System.out.print(result.a[i][j] + " ");
            }
            i = i + 1;
            System.out.println();
        }
    }
}
