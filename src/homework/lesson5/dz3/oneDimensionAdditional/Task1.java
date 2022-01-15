package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    /**
     * 1) Найти произведение элементов, кратных 3.
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        System.out.println(Arrays.toString(array));
        long composition = 1;

        for (int i : array) {
            if (i % 3 == 0) {
                composition *= i;
            }
        }
        System.out.println("Composition is " + composition);
    }
}
