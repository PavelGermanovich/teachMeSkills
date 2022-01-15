package homework.lesson3.pdf2;

import java.util.Scanner;

public class Task4 {
    /**
     * Составьте программу, вычисляющую A*B, не пользуясь операцией
     */

    public static void main(String[] args) {
        int a, b;
        System.out.println("Input a and b");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Multiply results " + Math.multiplyExact(a, b));
        System.out.println("Multiply other approach " + otherApproach(a, b));
    }

    public static int otherApproach(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}
