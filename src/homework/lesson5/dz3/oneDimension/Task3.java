package homework.lesson5.dz3.oneDimension;

import java.util.Arrays;

public class Task3 {
    /**
     * Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
     * массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
     * это количество на экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomArray = new int[15];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
        int count = 0;
        for (int el : randomArray) {
            if (el % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Quantity of even number is " + count);
    }
}
