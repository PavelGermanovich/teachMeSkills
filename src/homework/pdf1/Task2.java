package homework.pdf1;

import java.util.Scanner;

public class Task2 {

    /**
     * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
     * Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
     * Требуется сравнить длину каждого отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок окажется
     * больше суммы двух других, то треугольника с такими сторонами не существует.
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стороны треугольника a, b , c");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (isTriangleExist(a, b, c)) {
            System.out.println("Треугольник с такими сторонами существует");
        } else {
            System.out.println("Треугольника с такими сторонами не существует");
        }
    }

    public static boolean isTriangleExist(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) {
            return false;
        } else return a > 0 && b > 0 && c > 0;
    }
}