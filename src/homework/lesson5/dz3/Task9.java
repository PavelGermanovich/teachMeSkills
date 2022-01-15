package homework.lesson5.dz3;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    /**
     * Пользователь должен указать с клавиатуры положительное число, а
     * программа должна создать массив указанного размера из случайных целых
     * чисел из [0;15] и вывести его на экран в строку. После этого программа должна
     * определить и сообщить пользователю о том, сумма какой половины массива
     * больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
     * пользователь введёт неподходящее число, то выдать соответствующее
     * сообщение
     */
    public static void main(String[] args) {
        System.out.println("Input size of the array");
        int size = new Scanner(System.in).nextInt();
        if (size < 0) {
            System.out.println("Введено не корректный размер массива");
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 16);
        }
        System.out.println(Arrays.toString(array));

        int middle = array.length / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < middle) {
                sumFirstHalf += array[i];
            } else {
                sumSecondHalf += array[i];
            }

            if (array.length % 2 != 0) {
                sumSecondHalf -= array[middle];
            }

        }

        if (sumFirstHalf > sumSecondHalf) {
            System.out.println("Sum of the first half is bigger " + sumFirstHalf);
        } else if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Sum of both half are equals");
        } else {
            System.out.printf("Sum of the second half is bigger " + sumSecondHalf);
        }
    }
}