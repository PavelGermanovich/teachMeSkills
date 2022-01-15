package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Scanner;

public class Helper {
    public static int[] getArrayWithRandomNumber() {
        System.out.println("Input size array - ");
        int[] array = new int[new Scanner(System.in).nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        return array;
    }
}
