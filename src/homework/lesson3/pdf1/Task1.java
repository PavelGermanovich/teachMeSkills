package homework.lesson3.pdf1;

import java.util.Scanner;

public class Task1 {

    /**
     * 1) В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно
     * или отрицательное. Например, "это однозначное положительное число".
     * Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
     */
    public static void main(String[] args) {
        int var;
        var = new Scanner(System.in).nextInt();
        if (var == 0) {
            System.out.println("Это однозначное число 0");
        } else {
            String posOrNeg = var > 0 ? "положительное" : "отрицательное";
            System.out.println(String.format("Это %s %s число", getNumberOfDigitsString(var), posOrNeg));
        }
    }

    public static String getNumberOfDigitsString(int n) {
        int length = String.valueOf(n).length();
        switch (length) {
            case 1: return "однозначное";
            case 2: return "двухзначное";
            default: return "трехзначное";
        }
    }
}