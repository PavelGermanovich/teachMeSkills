package sessions.lesson9.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public int getInputNumber() {
        System.out.println("Введите число");
        try {
            int result = new Scanner(System.in).nextInt();
            return result;
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат! Введите целое число");
        }
        return getInputNumber();
    }

    public int validateUntilInputNumberCorrect() {
        Validator validator = new Validator();
        int number = getInputNumber();
        try {
            validator.validateNotNegative(number);
            validator.validateBiggerThanLimit(number);
            return number;
        } catch (Exception e) {
            number = validateUntilInputNumberCorrect();
        }
        return number;
    }
}