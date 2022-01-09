package homework.sortingArray;

import java.util.Arrays;

public class BubbleSorting {

    /**
     * Bubble sorting example, complexity O(n^2);
     * @param args
     */
    public static void main(String[] args) {
        int[] arrayToSort = {12, 1, 4, 2232, 19, 99, 6};
        boolean needToIterateAgain = true;

        //Ascending order
        while (needToIterateAgain) {
            needToIterateAgain = false;
            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i] < arrayToSort[i - 1]) {
                    swapElements(arrayToSort, i, i - 1);
                    needToIterateAgain = true;
                }
            }
        }
        System.out.println(Arrays.toString(arrayToSort));

        needToIterateAgain = true;
        //Descending order
        while (needToIterateAgain) {
            needToIterateAgain = false;
            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i] > arrayToSort[i - 1]) {
                    swapElements(arrayToSort, i, i - 1);
                    needToIterateAgain = true;
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
