package homework.sortingArray;

import java.util.Arrays;

public class InsertionSorting {

    /**
     * Сортировка вставками тоже имеет квадратичную сложность O(n^2), так как у нас
     * цикл в цикле по всему массиву
     * @param args
     */
    public static void main(String[] args) {
        //Sort ascending order
        int[] arrayToSort = {1, 4, 3, 11, 6, 19, 0, 66};
        for (int i = 1; i < arrayToSort.length; i++) {
            int current = arrayToSort[i];

            int j = i - 1;
            while (j >= 0 && current < arrayToSort[j]) {
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j+1] = current;
        }

        System.out.println(Arrays.toString(arrayToSort));


        //Sort descending order

        for (int i = 1; i < arrayToSort.length; i++) {
            int current = arrayToSort[i];

            int j = i - 1;
            while (j >= 0 && current > arrayToSort[j]) {
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j + 1] = current;
        }
        System.out.println(Arrays.toString(arrayToSort));
    }
}
