package homework.lesson3.pdf2;

public class Task7 {
    /**
     * Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
     */
    public static void main(String[] args) {
        int sumOfOdd = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                sumOfOdd += i;
            }
        }
        System.out.println("Сумма нечетных " + sumOfOdd);
    }
}
