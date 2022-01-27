package sessions.lesson9.task1;

public class Validator {
    public void validateNotNegative(int number) throws Exception {
        if (number < 0) {
            System.out.println("Введено отрицательное число! Повторите попытку");
            throw new Exception();
        }
    }

    public void validateBiggerThanLimit(int a) throws Exception {
        if (a > 10 || a == 0) {
            System.out.println("Введено число равное 0 или больше 10! Повторите попытку");
            throw new Exception();
        }
    }
}