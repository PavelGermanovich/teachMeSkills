package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    /**
     * Найти средне арифметическое элементов массива, превосходящих некоторое
     * число С.
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        System.out.println("Input c number");
        int c = new Scanner(System.in).nextInt();

        int sum = 0;
        int count = 0;
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            if (i > c) {
                count++;
                sum += i;
            }
        }
        System.out.println(String
                .format("Average of numbers that bigger than %d is %f", c, (double) sum / count));
    }
}
