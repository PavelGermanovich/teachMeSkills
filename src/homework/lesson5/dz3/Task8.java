package homework.lesson5.dz3;

import java.util.Arrays;

public class Task8 {
    /**
     * Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
     * массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
     * массива должен равняться отношению элемента из первого массива с i-ым
     * индексом к элементу из второго массива с i-ым индексом. Вывести все три
     * массива на экран (каждый на отдельной строке), затем вывести количество
     * целых элементов в третьем массиве.
     */
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] arrayOne = new int[arrayLength];
        int[] arrayTwo = new int[arrayLength];
        double[] arrayThree = new double[arrayLength];

        int countOfWhole = 0;
        for (int i = 0; i < arrayLength; i++) {
            arrayOne[i] = (int) (Math.random() * 10);
            arrayTwo[i] = (int) (Math.random() * 10);
            arrayThree[i] = (double) arrayOne[i] / arrayTwo[i];
            if (arrayThree[i] == (int) arrayThree[i]) {
                countOfWhole++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));
        System.out.println("Quantity of integers are " + countOfWhole);
    }
}
