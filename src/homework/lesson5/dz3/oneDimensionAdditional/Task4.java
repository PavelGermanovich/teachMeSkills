package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;

public class Task4 {
    /**
     * 4) Найти наименьший нечетный элемент.
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        Arrays.sort(array);
        boolean isFound = false;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Min odd number is " + array[i]);
                break;
            }
        }
    }
}
