package homework.pdf1;

import java.util.Scanner;

public class Task3 {
    /**
     * Дано целое число. Если оно является положительным, то прибавить к нему 1.
     * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число.
     */
    public static void main(String[] args) {
        int var = new Scanner(System.in).nextInt();
        var = var > 0 ? var += 1
                : var == 0 ? 10
                : var - 2;
        System.out.println("Полученное число = " + var);
    }
}
