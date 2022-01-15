package homework.lesson5.dz3;

public class Task2 {
    /**
     * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
     * строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
     * порядке (99 97 95 93 … 7 5 3 1).
     */
    public static void main(String[] args) {
        int[] oddArray = new int[50];
        for (int i = 0, j = 1; i < oddArray.length; i++, j += 2) {
            oddArray[i] = j;
        }

        for (int s = 0; s < oddArray.length; s++) {
            System.out.printf(oddArray[s] + " ");
        }

        System.out.println();
        for (int s2 = oddArray.length - 1; s2 > -1; s2--) {
            System.out.printf(oddArray[s2] + " ");
        }
    }
}
