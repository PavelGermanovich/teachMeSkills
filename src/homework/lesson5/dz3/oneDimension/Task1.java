package homework.lesson5.dz3.oneDimension;

import java.util.Arrays;

public class Task1 {
    /**
     * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
     * массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
     * затем в столбик (отделяя один элемент от другого началом новой строки). Перед
     * созданием массива подумайте, какого он будет размера.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] evenNumberArray = new int[10];

        for (int i = 0, j = 2; i < 10; i++, j += 2) {
            evenNumberArray[i] = j;
        }
        System.out.println(String.join(" ",
                Arrays.stream(evenNumberArray).mapToObj(String::valueOf).toArray(String[]::new)));
        System.out.println(String.join("\n",
                Arrays.stream(evenNumberArray).mapToObj(String::valueOf).toArray(String[]::new)));
    }
}