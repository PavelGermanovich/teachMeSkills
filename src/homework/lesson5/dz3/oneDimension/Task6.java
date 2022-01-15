package homework.lesson5.dz3.oneDimension;

import java.util.Arrays;

public class Task6 {
    /**
     * Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
     * на экран в строку. Определить и вывести на экран сообщение о том, является ли
     * массив строго возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] random = new int[4];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(random));
        int[] ascending = Arrays.copyOf(random, random.length);
        Arrays.sort(random);

        System.out.println("Массив строго возрастающей последовательности? - " + Arrays.equals(ascending, random));
    }
}