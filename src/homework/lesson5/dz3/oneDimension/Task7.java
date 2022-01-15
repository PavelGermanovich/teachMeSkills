package homework.lesson5.dz3.oneDimension;

import java.util.Arrays;

public class Task7 {
    /**
     * Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
     * какой элемент является в этом массиве максимальным и сообщите индекс его
     * последнего вхождения в массив.
     */
    public static void main(String[] args) {
        int[] random = new int[12];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 16);
        }
        System.out.println(Arrays.toString(random));

        int index = 0;
        int max = random[0];
        for (int i = 1; i < random.length; i++) {
            if (max < random[i]) {
                max = random[i];
                index = i;
            }
        }
        System.out.println("Max is " + max + " and his index is " + index);
    }
}
