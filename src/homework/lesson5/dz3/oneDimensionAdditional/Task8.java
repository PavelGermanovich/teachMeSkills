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
        System.out.println("Number is " + array[array.length - 2]);
    }
}
