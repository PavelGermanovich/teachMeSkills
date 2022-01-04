package homework.pdf1;

import java.util.Scanner;

public class Task4 {
    /**
     * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        System.out.println("Количество положительных числе" + count);
    }
}
