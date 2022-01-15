package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;

public class Task2 {
    /**
     * 2) Найти среднее арифметическое элементов с нечетными номерами.
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        int sum = 0;
        int count = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
            count++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("среднее арифметическое элементов = " + ((double) sum / count));
    }
}
