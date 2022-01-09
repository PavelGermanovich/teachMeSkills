package homework.sortingArray;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Сортировка выбором, тоже имеет сложность квадратичную O(n^2)
     * @param args
     */
    public static void main(String[] args) {
        int[] arrayToSort = {12, 1, 4, 2232, 19, 99, 6};

        //Ascending Order
        for (int left = 0; left < arrayToSort.length; left++) {
            int minId = left;
            for (int i = left; i < arrayToSort.length; i++) {
                if (arrayToSort[i] < arrayToSort[minId]) {
                    minId = i;
                }
            }
            if (minId != left) {
                swapElements(arrayToSort, minId, left);
            }
        }
        System.out.println(Arrays.toString(arrayToSort));

        //Descending order
        for (int left = 0; left < arrayToSort.length; left++) {
            int maxId = left;
            for (int i = left; i < arrayToSort.length; i++) {
                if (arrayToSort[i] > arrayToSort[maxId]) {
                    maxId = i;
                }
                if (maxId != left) {
                    swapElements(arrayToSort, maxId, left);
                }
            }
        }

        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void swapElements(int[] array, int indexOne, int indexSec) {
        int temp = array[indexOne];
        array[indexOne] = array[indexSec];
        array[indexSec] = temp;
    }
}
