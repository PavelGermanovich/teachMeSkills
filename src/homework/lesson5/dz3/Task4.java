package homework.lesson5.dz3;

import java.util.Arrays;

public class Task4 {
    /**
     * Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
     * массив на экран в строку. Замените каждый элемент с нечётным индексом на
     * ноль. Снова выведете массив на экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 21);
        }
        System.out.println(Arrays.toString(randomArray));

        for (int i = 1; i < randomArray.length; i += 2) {
            randomArray[i] = 0;
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
