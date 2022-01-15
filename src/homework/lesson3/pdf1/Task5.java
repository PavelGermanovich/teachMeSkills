package homework.lesson3.pdf1;

import java.util.Scanner;

public class Task5 {
    /**
     * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int countNeg = 0;
        int countPos = 0;
        if (a > 0) {
            countPos++;
        } else if (a < 0) {
            countNeg++;
        }

        if (b > 0) {
            countPos++;
        } else if (b < 0) {
            countNeg++;
        }

        if (c > 0) {
            countPos++;
        } else if (c < 0) {
            countNeg++;
        }

        System.out.println("Количество положительных числе " + countPos);
        System.out.println("Количество отрицательных чисел " + countNeg);
    }
}