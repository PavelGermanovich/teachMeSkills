package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;

public class Task9 {
    /**
     * 9) Найти наименьший элемент среди элементов с четными индексами массива
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        if (array.length < 2) {
            System.out.println("Incorrect size");
            return;
        }
        System.out.println(Arrays.toString(array));
        int min = array[2];
        for (int i = 4; i < array.length; i += 2) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min with even index is " + min);
    }
}
