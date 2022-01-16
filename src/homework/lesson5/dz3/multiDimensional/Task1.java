package homework.lesson5.dz3.multiDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    /**
     * Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
     * случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
     * матрицы).
     */
    public static void main(String[] args) {
        System.out.println("Input size of 2 dimensional array");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] array = new int[a][a];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51);
            }
        }

        for (int[] arr1 : array) {
            for (int i : arr1) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }

        //1) Почитать сумму четных элементов стоящих на главной диагонали.
        System.out.println("\n1) Почитать сумму четных элементов стоящих на главной диагонали.");
        int dia = 0;
        int sum = 0;
        while (dia != array.length) {
            if (array[dia][dia] % 2 == 0) {
                sum += array[dia][dia];
            }
            dia++;
        }
        System.out.println("Sum of all odds in the main diag = " + sum);


        //2) Вывести нечетные элементы находящиеся под главной диагональю(включительно).
        System.out.println("\n2) Вывести нечетные элементы находящиеся под главной диагональю(включительно)");
        dia = 0;
        System.out.println("нечетные элементы находящиеся под главной диагональю(включительно) :");
        for (int i = 0; i < array.length; i++, dia++) {
            for (int j = 0; j < array.length && j <= dia; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.printf(array[i][j] + " ");
                }
            }
        }

        //3)Проверить произведение элементов какой диагонали больше.
        System.out.println("\n\n3)Проверить произведение элементов какой диагонали больше.");
        int mainDiagComp = 1;
        dia = 0;
        while (dia != array.length) {
            mainDiagComp *= array[dia][dia];
            dia++;
        }
        System.out.println("Произведение главной диагонали матрицы = " + mainDiagComp);

        int rightDiaComp = 1;
        dia = array.length - 1;
        int subIndex = 0;
        while (dia >= 0) {
            rightDiaComp *= array[dia][subIndex];
            dia--;
            subIndex++;
        }
        System.out.println("Произведение правой диагонали матрицы = " + rightDiaComp);

        if (mainDiagComp == rightDiaComp) {
            System.out.println("Произведение обеих диагоналей равны");
        } else {
            System.out.println(String.format("Произведение %s диагонали больше", mainDiagComp > rightDiaComp ? "главной" : "правой"));
        }

        //4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
        System.out.println("\n4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)");
        dia = 0;
        int sumOfEven = 0;
        for (int i = 0; i < array.length; i++, dia++) {
            for (int j = array.length - 1; j > dia; j--) {
                if (array[i][j] % 2 == 0) {
                    System.out.printf(array[i][j] + " ");
                    sumOfEven += array[i][j];
                }
            }
        }
        System.out.println("сумма четных элементов стоящих над побочной диагональю (не включительно) = " + sumOfEven);

        //5) Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
        System.out.println("\n5) Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)");
        int[][] newMatrix = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                newMatrix[i][j] = array[j][i];
                newMatrix[j][i] = array[i][j];
            }
        }

        for (int[] arr1 : newMatrix) {
            for (int i : arr1) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }
    }
}
