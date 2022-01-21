package sessions.lesson7.task4;

public class Demo {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new double[][]{{2.2, 3.4}, {1.2, 3.2}});
        matrix.printMatrix();
        matrix.multiplyByNumber(10);
        matrix.printMatrix();

        Matrix matrix2 = new Matrix(new double[][]{{2.2, 3.4}, {1.2, 3.2}});

        Matrix sum = new Matrix(matrix.sumMatrix(matrix2.getMatrix()));
        sum.printMatrix();
    }
}
