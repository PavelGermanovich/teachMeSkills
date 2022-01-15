package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;

public class Task5 {
    /**
     * «Сожмите» массив, выбросив из него каждый второй элемент.
     * «Освободившиеся» места массива заполните нулями.
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
