package homework.lesson5.dz3.oneDimensionAdditional;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    /**
     * 7) Подсчитать, сколько раз встречается элемент с заданным значением.
     */
    public static void main(String[] args) {
        int[] array = Helper.getArrayWithRandomNumber();
        System.out.println(Arrays.toString(array));
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i: array) {
            if (i == n) {
                count++;
            }
        }
        System.out.println("Number of matches is " + count);
    }
}