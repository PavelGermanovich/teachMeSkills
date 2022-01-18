package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;

public class Task8 {
    /**
     * Найти второй по величине (т.е. следующий по величине за максимальным)
     * элемент в массиве.
     * @param args
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int max = array[array.length - 1];
        int last = array[array.length - 1];

        for (int i = array.length - 2; i >= 0; i--) {
            if (max > array[i]) {
                last = array[i];
                break;
            }
        }
        System.out.println("ЧИсло перед максимальным = " + last);
    }
}
