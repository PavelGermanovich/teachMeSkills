package sessions.lesson7.task4;

public class Matrix {
    private double[][] array;
    private int numberOfLines;
    private int columns;

    public double[][] sumTwoArrays() {
        return new double[][]{};
    }

    public Matrix(double[][] array) {
        this.array = array;
    }

    public void multiplyByNumber(int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= number;
            }
        }
    }

    public double[][] getMatrix() {
        return array;
    }

    public void printMatrix() {
        for (int i = 0; i < array.length; i++) {
            for (double number : array[i]) {
                System.out.printf(number + " ");
            }
            System.out.println();
        }
    }

    public double[][] sumMatrix(double[][] array) {
        double[][] result = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = this.array[i][j] + array[i][j];
            }
        }
        return result;
    }
}
