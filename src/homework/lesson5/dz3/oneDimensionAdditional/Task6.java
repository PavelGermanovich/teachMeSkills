package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;

public class Task6 {
    /**
     * 6) Проверить, различны ли все элементы массива.
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        System.out.println(Arrays.toString(array));
        System.out.println("Все элементы массива различны? "
                + (Arrays.stream(array).distinct().count() == array.length));
    }
}
