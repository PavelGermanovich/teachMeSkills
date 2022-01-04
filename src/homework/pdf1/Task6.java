package homework.pdf1;

import java.util.Scanner;

public class Task6 {
    /**
     * 6) Даны 2 числа. Вывести большее из них.
     */
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Большое число " + (Math.max(a, b)));
        }
    }
}
