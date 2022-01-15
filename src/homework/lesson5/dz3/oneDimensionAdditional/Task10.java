package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;

public class Task10 {
    /**
     * Найти максимальный элемент в массиве и поменять его местами с нулевым
     * элементом
     * @param args
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        int max = array[0];
        int index = 1;
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                index = i;
                max = array[i];
            }
        }
        int temp = array[0];
        array[0] = max;
        array[index] = temp;
        System.out.println(Arrays.toString(array));
    }
}
