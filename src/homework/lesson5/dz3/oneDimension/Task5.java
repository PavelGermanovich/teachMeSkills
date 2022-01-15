package homework.lesson5.dz3.oneDimension;

import java.util.Arrays;

public class Task5 {
    /**
     * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
     * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
     * арифметическое элементов каждого массива и сообщите, для какого из
     * массивов это значение оказалось больше (либо сообщите, что их средние
     * арифметические равны).
     */
    public static void main(String[] args) {
        int[] arrayFirst = new int[5];
        int[] arraySec = new int[5];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = (int) (Math.random() * 16);
            arraySec[i] = (int) (Math.random() * 16);
        }

        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySec));

        int sum = 0;
        for (int i : arrayFirst) {
            sum += i;
        }
        double averageFirst = (double) sum / arrayFirst.length;

        int sum2 = 0;
        for (int i2 : arraySec) {
            sum2 += i2;
        }
        double averageSecond = (double) sum2 / arraySec.length;

        if (averageFirst > averageSecond) {
            System.out.println("Для первого массива среднее больше " + averageFirst);
        } else if (averageFirst == averageSecond) {
            System.out.println("Среднее равно");
        } else {
            System.out.println("Для второго массива среднее больше " + averageSecond);
        }
    }
}
